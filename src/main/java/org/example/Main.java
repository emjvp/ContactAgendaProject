package org.example;

import java.util.Scanner;

import static org.example.OptAgendaUtils.printDependingOnCondition;
import static org.example.OptAgendaUtils.wattingPrint;

public class Main {
    final static Scanner INPUT = new Scanner(System.in);
    static void main() throws InterruptedException {

        // TODO: usar pruebas unitarias, este es el ultimo paso
        Agenda mainAgenda = new Agenda(100);

        System.out.println("Bienvenido");
        System.out.println("===============TU AGENDA DE CONTACTOS===============");
        int choice;

           do {
               System.out.println("--------------------");
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
               INPUT.nextLine();

               switch (choice) {
                   case 1:
                       if (!mainAgenda.isFull())
                       {
                           System.out.println("Ingresa el nombre del contacto");
                           String name = INPUT.nextLine();
                           System.out.println("Ingresa el email del contacto");
                           String email = INPUT.nextLine();
                           System.out.println("Es un contacto favorito? \n");
                           System.out.println("1. Para Si");
                           boolean isFavorite = INPUT.nextInt() == 1;
                           boolean result = mainAgenda.add(new Contact(name, email, isFavorite));

                           if (result) {
                               System.out.println("Contacto agregado exitosamente");
                           } else {
                               System.out.println("Contacto no agregado por email invalido");
                           }

                       } else {
                           System.out.println("La agenda está llena, no se pueden agregar más contactos");
                       }

                       System.out.println();

                       break;
                   case 2:
                       if (!mainAgenda.isEmpty()) {
                           System.out.println("---Contactos---");
                           mainAgenda.list();
                       } else {
                           System.out.println("La agenda está vacía, aún no tiene contactos");
                       }

                       break;
                   case 3:
                       if (!mainAgenda.isEmpty()) {
                           System.out.println("Ingresa el nombre del contacto a buscar");
                           Contact foundedContact = mainAgenda.search(INPUT.nextLine());
                           if (foundedContact != null) {
                               System.out.println("Nombre del contacto: "+ foundedContact.getName()+"\n Correo del contacto: "+foundedContact.getEmail());
                           } else {
                               System.out.println("Contacto no encontrado");
                           }
                       } else {
                           System.out.println("La lista está vacía, por eso no es posible buscar");
                       }

                       System.out.println();
                       break;
                   case 4:

                       if (!mainAgenda.isEmpty()) {
                           System.out.println("Ingresa el nombre del contacto a eliminar");
                           String name = INPUT.nextLine();
                           if(mainAgenda.remove(name)){
                               System.out.println("Contacto eliminado exitosamente");
                           } else {
                               System.out.println("Contacto no eliminado");
                           }

                       } else {
                           System.out.println("La agenda está vacía, no hay nada que eliminar");
                       }
                        break;
                    case 5:
                        if (!mainAgenda.isEmpty()) {

                            if (mainAgenda.countFavorites() > 0)
                            {
                                System.out.println("---Contactos favoritos---");
                                mainAgenda.listFavorites();
                            } else {
                                System.out.println("No hay contactos marcados como favoritos");
                            }

                        } else {
                            System.out.println("Agenda vacía, no hay favoritos");
                        }

                       break;
                   case 6:

                       int favorites = mainAgenda.countFavorites();
                       wattingPrint("Contando");

                       printDependingOnCondition(
                               favorites > 0,
                               "Hay "+favorites+" contactos favoritos en la agenda",
                               "No hay contactos favoritos"
                       );

                       break;
                   case 7:

                       boolean isFull = mainAgenda.isFull();

                       if (isFull) {
                           wattingPrint("Validando");
                       }

                       printDependingOnCondition(
                               mainAgenda.isFull(),
                               "Agenda llena",
                               "La agenda aún no está llena"
                       );

                       break;
                   case 8:

                       boolean isEmpty = mainAgenda.isEmpty();

                       if (!isEmpty) {
                           wattingPrint("Validando");
                       }

                       printDependingOnCondition(
                               isEmpty,
                               "Agenda vacía",
                               "La agenda tiene contactos presentes"
                       );

                       break;
                   case 0:
                       System.out.println("Saliendo del programa ...");
                       break;

                   default:
                       System.out.println("Opcion invalida");
                       break;

               }

           } while (choice != 0);


    }
}
