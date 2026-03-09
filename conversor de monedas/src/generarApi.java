import java.net.URI;

public class GenerarApi {

    private static final String clave = "d030e95bce5be9116f691140";

    public static URI crearURL(String monedaBase, String monedaDestino){
        return URI.create("https://v6.exchangerate-api.com/v6/"
                + clave
                + "/pair/"
                + monedaBase
                + "/"
                + monedaDestino);
    }

}