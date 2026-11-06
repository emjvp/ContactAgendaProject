package org.example;

import java.util.Scanner;

public class Main {
    final static Scanner INPUT = new Scanner(System.in);
    static void main() throws InterruptedException {

        // TODO: usar pruebas unitarias, este es el ultimo paso
        Agenda mainAgenda = new Agenda(100);

        System.out.println("Bienvenido");
        System.out.println("===============TU AGENDA DE CONTACTOS===============");
        int choice;

           do {

               System.out.println("1. Agregar contacto");
               System.out.println("2. Listar contactos");
               System.out.println("3. Buscar contacto");
               System.out.println("4. Eliminar contacto");
               System.out.println("5. Listar contactos favoritos");
               System.out.println("6. Contar contactos favoritos");
               System.out.println("7. Valida si la lista esta llena");
               System.out.println("8. Valida si la lista esta vacía");
               System.out.println("0. Salir del programa");

               choice = INPUT.nextInt();

               switch (choice) {
                   case 1:
                       break;
                   case 2:
                       break;
                   case 8:
                       boolean isAgendaEmpty = mainAgenda.isEmpty();
                       System.out.println("================================");
                       for (int i = 0; i < 5; i++) {

                           System.out.print("\rValidando" + ".".repeat(i % 4));

                           Thread.sleep(500);
                       }
                       System.out.println("\n================================");

                       if (isAgendaEmpty){
                           System.out.println("Agenda vacía");
                           System.out.println("================================");
                       } else {
                           System.out.println("La agenda tiene contactos presentes");
                           System.out.println("================================");
                       }
                       break;
                   case 0:
                       System.out.println("Saliendo del programa ...");
                       break;

                   default:
                       System.out.println("Opcion invalida");

               }

           } while (choice != 0);


    }
}
