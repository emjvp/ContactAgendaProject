package org.example;

import java.util.Scanner;

public class Main {
    final static Scanner INPUT = new Scanner(System.in);
    static void main() {

        // TODO: usar pruebas unitarias, este es el ultimo paso
        Agenda mainAgenda = new Agenda(100);

        System.out.println("Bienvenido");
        System.out.println("===============TU AGENDA DE CONTACTOS===============");
        System.out.println("Este programa tiene 2 versiones, deseas ejecutar la # 1 que tiene las funciones basicas o la #2 que tiene más funcionaldiades? \n");
        int choice;
        outer:
           do {

               System.out.println("1. Basico");
               System.out.println("2. Agenda con mas funcionalidades");
               System.out.println("0. Salir del programa");

               choice = INPUT.nextInt();

               switch (choice) {
                   case 0:
                       System.out.println("Opcion 0 seleccionada | Saliendo del programa");
                       break;
                   case 1:
                       break outer;
                   case 2:
                       break outer;

                   default:
                       System.out.println("Opcion no valida");

               }

           } while (choice != 0);

           if (choice == 1) {
               System.out.println("Entrado a la opción 1");
           } else if (choice == 2) {
               // TODO: implementar opción 2
               System.out.println("Aún no implementado");
           }
    }
}
