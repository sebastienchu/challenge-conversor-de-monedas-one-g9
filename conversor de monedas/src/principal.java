public class principal {
}
import java.net.URI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("*********************************************");
        System.out.println("Bienvenid@ al conversor de monedas");
        System.out.println("*********************************************");
        System.out.println();

        String menu = """
                Escribe el número de la opción deseada:
                1 - Dólar a Peso mexicano
                2 - Peso mexicano a Dólar
                3 - Dólar a Real brasileño
                4 - Real brasileño a Dólar
                5 - Dólar a Libra esterlina
                6 - Libra esterlina a Dólar
                7 - Dólar a Won surcoreano
                8 - Won surcoreano a Dólar
                9 - Dólar a Peso chileno
                10 - Peso chileno a Dólar
                11 - Salir
                """;


        ConsultaMoneda consulta = new ConsultaMoneda();
        ConversorMoneda conversor = new ConversorMoneda();

        while (opcion != 11) {

            System.out.println(menu);
            opcion = teclado.nextInt();

            String base = "";
            String destino = "";

            switch (opcion) {
                case 1 -> { base = "USD"; destino = "MXN"; }
                case 2 -> { base = "MXN"; destino = "USD"; }
                case 3 -> { base = "USD"; destino = "BRL"; }
                case 4 -> { base = "BRL"; destino = "USD"; }
                case 5 -> { base = "USD"; destino = "GBP"; }
                case 6 -> { base = "GBP"; destino = "USD"; }
                case 7 -> { base = "USD"; destino = "KRW"; }
                case 8 -> { base = "KRW"; destino = "USD"; }
                case 9 -> { base = "USD"; destino = "CLP"; }
                case 10 -> { base = "CLP"; destino = "USD"; }
                case 11 -> {
                    System.out.println("¡Gracias por usar el conversor!");
                    continue;
                }
                default -> {
                    System.out.println("Opción no válida.");
                    continue;
                }
            }

            System.out.println("Ingresa el monto a convertir:");
            double monto = teclado.nextDouble();

            Moneda moneda = consulta.consultaTasaDeCambio(base, destino);

            double resultado = conversor.convertir(monto, moneda.conversion_rate());

            System.out.println("Resultado: " + resultado + " " + destino);
            System.out.println();
        }

        teclado.close();
    }
}