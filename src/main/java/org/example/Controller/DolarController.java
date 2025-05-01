package org.example.Controller;

import org.example.aditionalMethod.Menu;
import org.example.monedaService.DolarService;
import org.example.record.ChangeResult;

import java.util.Locale;
import java.util.Scanner;

import static org.example.aditionalMethod.Menu.ANSI_CYAN;
import static org.example.aditionalMethod.Menu.ANSI_RESET;

public class DolarController {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final DolarService dolarService = new DolarService();


    public void mostrarMenu() {

        int opcionCambio;
        String opcionMenu = "";
        do {

            Menu.menuCambioDolar();
            System.out.println();
            opcionCambio = leer.nextInt();
            leer.nextLine();

            if (opcionCambio == 6) {
                break;
            }

            System.out.print(ANSI_CYAN + "\n👉 Porfavor , Ingrese el Monto a Convertir: " + ANSI_RESET + "\n");
            double montoAConvertir = leer.nextDouble();
            leer.nextLine();

            ChangeResult changeResult = null;


            switch (opcionCambio) {
                case 1:
                    changeResult = dolarService.dolarToEuro(montoAConvertir);
                    break;
                case 2:
                    changeResult = dolarService.usdToPesosArg(montoAConvertir);
                    break;
                case 3:
                    changeResult = dolarService.dolarToPesoChileno(montoAConvertir);
                    break;
                case 4:
                    changeResult = dolarService.dolarToPesoColombiano(montoAConvertir);
                    break;
                case 5:
                    changeResult = dolarService.dolarToRealBrasilero(montoAConvertir);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
            ;

            if (changeResult != null) {
                Menu.resultadoCambio(montoAConvertir,changeResult.conversion_result(),changeResult.target_code());
                System.out.println();
            }
            System.out.println("Deseas realizar otra Accion: Si/No");
            opcionMenu=leer.nextLine().trim().toLowerCase();

        } while (!opcionMenu.equals("no"));
    }

}
