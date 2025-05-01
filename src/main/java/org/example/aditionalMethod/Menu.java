package org.example.aditionalMethod;

import java.util.List;

public class Menu {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    //metodo General para crear la parte visual de los menu
    public static void mostrarMenu(String titulo, List<String> opciones,String opcionAdicional) {
        System.out.println("\n" + ANSI_BLUE +
                "╔═════════════════════════════════════════════════════════════════════════════╗" +
                "\n" + ANSI_RESET +
                ANSI_CYAN + "                      " + titulo + "                      " + ANSI_RESET + "\n" +
                ANSI_BLUE + "╚═════════════════════════════════════════════════════════════════════════════╝" + ANSI_RESET);

        for (String opcion : opciones) {
            System.out.println(ANSI_GREEN + opcion + ANSI_RESET);
        }

        System.out.println(ANSI_YELLOW +
                "\n   " + (opciones.size() + 1) + ". 🔙 "+opcionAdicional +
                ANSI_RESET);

        System.out.println("\n" + ANSI_BLUE +
                "═══════════════════════════════════════════════════════════════════════════════" +
                ANSI_RESET);

        System.out.print(ANSI_CYAN + "\n👉 Por favor, seleccione una opción: " + ANSI_RESET);
    }

    public static void menuPrincipal() {
        List<String> opciones = List.of(
                "1. 💵 Dólar estadounidense (USD)",
                "2. 💶 Euro (EUR)",
                "3. 🇦🇷 Peso argentino (ARS)",
                "4. 🇨🇱 Peso chileno (CLP)",
                "5. 🇨🇴 Peso colombiano (COP)",
                "6. 🇧🇷 Real brasileño (BRL)"
        );
        mostrarMenu("💱 CONVERSOR DE MONEDAS 💱", opciones,"Salir");
    }

    public static void menuCambioDolar() {
        List<String> opciones = List.of(
                "1. 💵 Dólar >>> 💶 Euro",
                "2. 💵 Dólar >>> 🇦🇷 Peso argentino",
                "3. 💵 Dólar >>> 🇨🇱 Peso chileno",
                "4. 💵 Dólar >>> 🇨🇴 Peso colombiano",
                "5. 💵 Dólar >>> 🇧🇷 Real brasileño"
        );
        mostrarMenu("💱 OPCIONES DE CAMBIO DISPONIBLES 💱", opciones,"Volver Al Menu Principal");
    }

    public static void menuCambioEuro() {
        List<String> opciones = List.of(
                "1. 💶 Euro >>> 💵 Dólar estadounidense",
                "2. 💶 Euro >>> 🇦🇷 Peso argentino",
                "3. 💶 Euro >>> 🇨🇱 Peso chileno",
                "4. 💶 Euro >>> 🇨🇴 Peso colombiano",
                "5. 💶 Euro >>> 🇧🇷 Real brasileño"
        );
        mostrarMenu("💱 OPCIONES DE CAMBIO DISPONIBLES 💱", opciones,"Volver al Menu Principal");
    }

    public static void menuCambioPesoArgentino() {
        List<String> opciones = List.of(
                "1. Peso Argentino >>> 💵 Dólar estadounidense",
                "2. Peso Argentino >>> 💶 Euro",
                "3. Peso Argentino >>> 🇨🇱 Peso chileno",
                "4. Peso Argentino >>> 🇨🇴 Peso colombiano",
                "5. Peso Argentino >>> 🇧🇷 Real brasileño"
        );
        mostrarMenu("💱 OPCIONES DE CAMBIO DISPONIBLES 💱", opciones,"Volver al Menu Principal");
    }

    public static void menuCambioPesoChileno() {
        List<String> opciones = List.of(
                "1. Peso Chileno >>> 💵 Dólar estadounidense",
                "2. Peso Chileno >>> 💶 Euro",
                "3. Peso Chileno >>> 🇦🇷 Peso Argentino",
                "4. Peso Chileno >>> 🇨🇴 Peso colombiano",
                "5. Peso Chileno >>> 🇧🇷 Real brasileño"
        );
        mostrarMenu("💱 OPCIONES DE CAMBIO DISPONIBLES 💱", opciones,"Volver al Menu Principal");
    }

    public static void menuCambioPesoColombiano() {
        List<String> opciones = List.of(
                "1. Peso Colombiano >>> 💵 Dólar estadounidense",
                "2. Peso Colombiano >>> 💶 Euro",
                "3. Peso Colombiano >>> 🇦🇷 Peso Argentino",
                "4. Peso Colombiano >>> 🇨🇱 Peso chileno",
                "5. Peso Colombiano >>> 🇧🇷 Real brasileño"
        );
        mostrarMenu("💱 OPCIONES DE CAMBIO DISPONIBLES 💱", opciones,"Volver al Menu Principal");
    }

    public static void menuCambioRealBrasilero() {
        List<String> opciones = List.of(
                "1. Real Brasilero >>> 💵 Dólar estadounidense",
                "2. Real Brasilero >>> 💶 Euro",
                "3. Real Brasilero >>> 🇦🇷 Peso Argentino",
                "4. Real Brasilero >>> 🇨🇱 Peso chileno",
                "5. Real Brasilero >>> 🇨🇴 Peso colombiano"
        );
        mostrarMenu("💱 OPCIONES DE CAMBIO DISPONIBLES 💱", opciones,"Volver al Menu Principal");
    }

    public static void resultadoCambio(double monto, double resultado, String monedaDestino) {
        System.out.println("\n" + ANSI_BLUE +
                "╔═════════════════════════════════════════════════════════════════════════════╗" +
                "\n" + ANSI_RESET +
                ANSI_CYAN + "                      RESULTADO DEL CAMBIO                      " + ANSI_RESET + "\n" +
                ANSI_BLUE + "╚═════════════════════════════════════════════════════════════════════════════╝" + ANSI_RESET);

        System.out.printf(
                ANSI_GREEN + "\n   💵 %.2f [USD] = %.2f %s\n" + ANSI_RESET,
                monto,
                resultado,
                monedaDestino
        );

        System.out.println(ANSI_BLUE +
                "\n═══════════════════════════════════════════════════════════════════════════════" +
                ANSI_RESET);
    }



}
