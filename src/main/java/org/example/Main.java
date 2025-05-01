package org.example;

import org.example.Controller.*;
import org.example.aditionalMethod.Menu;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int monedaBase;
        do {

            Menu.menuPrincipal();
            System.out.println();
            monedaBase = leer.nextInt();

            switch (monedaBase) {
                case 1:
                    new DolarController().mostrarMenu();
                    break;
                case 2:
                    new EuroController().mostrarMenu();
                    break;
                case 3:
                    new PesoArgController().mostrarMenu();
                    break;
                case 4:
                    new PesoChileController().mostrarMenu();
                    break;
                case 5:
                    new PesoColombiaController().mostrarMenu();
                case 6:
                    new RealBrasilController().mostrarMenu();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion Invalida , ingrese nuevamente porfavor");
            }
            if (monedaBase==7){
                System.out.println("Gracias por usar nuestra Aplicacion , vuelva pronto !!!");
            }

        } while (monedaBase != 7);


    }


}
