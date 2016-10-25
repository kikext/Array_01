package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //for (int i = 0; i < numero.length(); i++) {
          //  for (int x = 0; x <= i; x++) {

        System.out.println("            Elije una de las opciones en el menú: ");
        System.out.println("1-Proposito Ejercicio                     2-Proposito Alimentacón");
        System.out.println("3-Proposito Tiempo/Trabajo                4-Valorar Ejercicio");
        System.out.println("5-Valorar Alimentaçao                     6-Valorar productividad");
        System.out.println("---------------------x Pulsa 0 para salir x------------------------");

        int opc = scanner.nextInt();
        switch(opc){
            case 1:


                System.out.println("introduce los minutos de ejercicio");
                    System.out.print("Lunes: ");
                        int HLunes = scanner.nextInt();
                    System.out.print("\nMartes: ");
                        int HMartes = scanner.nextInt();
                    System.out.print("\nMiercoles: ");
                        int HMiercoles = scanner.nextInt();
                    System.out.print("\nJueves: ");
                        int HJueves = scanner.nextInt();
                    System.out.print("\nViernes: ");
                        int HViernes = scanner.nextInt();
                    System.out.print("\nSabado: ");
                        int HSabado = scanner.nextInt();
                    System.out.print("\nDomingo: ");
                        int HDomingo = scanner.nextInt();


                break;
            case 2:

                System.out.println("introduce el numero de piezas de frutas consumidas: ");
                    System.out.print("Lunes: ");
                        int FLunes = scanner.nextInt();
                    System.out.print("\nMartes: ");
                        int FMartes = scanner.nextInt();
                    System.out.print("\nMiercoles: ");
                        int FMiercoles = scanner.nextInt();
                    System.out.print("\nJueves: ");
                        int FJueves = scanner.nextInt();
                    System.out.print("\nViernes: ");
                        int FViernes = scanner.nextInt();
                    System.out.print("\nSabado: ");
                        int FSabado = scanner.nextInt();
                    System.out.print("\nDomingo: ");
                        int FDomingo = scanner.nextInt();

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 0:
                System.out.println("......................PROGRAMA CERRADO............................");
                break;

        }
        System.out.println("kekekk");
    }
}
