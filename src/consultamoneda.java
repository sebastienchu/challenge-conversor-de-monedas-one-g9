import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda consultaTasaDeCambio(String monedaBase, String monedaDestino){

        System.out.println("Generando URL para: " + monedaBase + " -> " + monedaDestino);

        //Construir URL dinámica
        URI direccion = GenerarApi.crearURL(monedaBase, monedaDestino);

        //Comprobar que si esta usando la api
        System.out.println("URL generada: " + direccion);

        //Construir cliente Http para solicitudes
        HttpClient client = HttpClient.newHttpClient();
        //Construir request-solicitud con URL dinámica
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        //Comprobar que la api respondió
        System.out.println("Enviando solicitud HTTP...");

        try {
            //Construyendo la Respuesta (Enviar la petición)
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //Comprobar la respuesta de la api
            System.out.println("Respuesta recibida de la API:");
            System.out.println(response.body());

            //Convertir Json
            return new Gson().fromJson(response.body(), Moneda.class);


        } catch (Exception e) {
            System.out.println("Error durante la conexión con la API:");
            e.printStackTrace();   // imprime el error real
            throw new RuntimeException("Error al consultar la API", e);
        }

    }
}