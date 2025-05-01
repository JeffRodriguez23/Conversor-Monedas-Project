package org.example.Controller;

import org.example.aditionalMethod.Menu;
import org.example.monedaService.PesoArgentinoService;
import org.example.record.ChangeResult;

import java.util.Scanner;

import static org.example.aditionalMethod.Menu.ANSI_CYAN;
import static org.example.aditionalMethod.Menu.ANSI_RESET;

public class PesoArgController {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PesoArgentinoService pesoArgentinoService = new PesoArgentinoService();

    public void mostrarMenu() {

        int opcionCambio;
        String opcionMenu = "";
        do {
            Menu.menuCambioPesoArgentino();
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
                    changeResult = pesoArgentinoService.pesosArgToUsd(montoAConvertir);
                    break;
                case 2:
                    changeResult = pesoArgentinoService.pesosArgToEuro(montoAConvertir);
                    break;
                case 3:
                    changeResult = pesoArgentinoService.pesosArgToPesoChileno(montoAConvertir);
                    break;
                case 4:
                    changeResult = pesoArgentinoService.pesosArgToPesoColombiano(montoAConvertir);
                    break;
                case 5:
                    changeResult = pesoArgentinoService.pesosArgToPesoColombiano(montoAConvertir);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    changeResult = null;
            }
            ;

            if (changeResult != null) {
                System.out.printf("Resultado Del Cambio: %.2f [USD] = %.2f %s\n",
                        montoAConvertir, changeResult.conversion_result(), changeResult.target_code());
            }
            System.out.println("Deseas realizar otra Accion: Si/No");
            opcionMenu = leer.nextLine().trim().toLowerCase();
        } while (!opcionMenu.equals("no"));
    }
}
