package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Array [][] = new int[2][7];
        //Rellenando los dias de la semana 1-7
            Array[0][0] = 1;
            Array[0][1] = 2;
            Array[0][2] = 3;
            Array[0][3] = 4;
            Array[0][4] = 5;
            Array[0][5] = 6;
            Array[0][6] = 7;
        //-------------------------------------

        //for (int x = 0; x < Array.length(); x++) {
        //  for (int y = 0; y <= Array[x].lenght; y++) {

    while (true) {
        System.out.println("            Elije una de las opciones en el menú: ");
        System.out.println("1-Proposito Ejercicio                     2-Proposito Alimentacón");
        System.out.println("3-Proposito Tiempo/Trabajo                4-Valorar Ejercicio");
        System.out.println("5-Valorar Alimentaçao                     6-Valorar productividad");
        System.out.println("---------------------x Pulsa 0 para salir x------------------------");

        int opc = scanner.nextInt();

        if(opc == 0){
            System.out.println("......................PROGRAMA CERRADO............................");
            break;
        }

        switch (opc) {

            case 1:


                //System.out.println("introduce los minutos de ejercicio");
                //System.out.println("para el dia [" + x + "," + y + "]");
                //Array[x][y] = scanner.nextInt();
                // escribir horas en las posiciones x/y

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

                System.out.println("introduce las horas productivas transcurridas en:  ");
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

            case 4:


                break;
            case 5:


                break;
            case 6:
                break;
            case 0:

                break;

        }
    }

        System.out.println("kekekk");
    }
}
