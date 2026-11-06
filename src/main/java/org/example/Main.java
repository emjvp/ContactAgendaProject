package org.example;

public class Main {
    static void main() {
        Agenda mainAgenda = new Agenda(4);

        mainAgenda.add(
                new Contact(
                        "Test contact 1",
                        "test@example.com",
                        false
                )
        );

        mainAgenda.add(
                new Contact(
                        "Test contact 2",
                        "test2@example.com",
                        false
                )
        );

        mainAgenda.add(
                new Contact(
                        "Test contact 3",
                        "test3@example.com",
                        false
                )
        );

        mainAgenda.add(
                new Contact(
                        "Test contact 4",
                        "test4@example.com",
                        false
                )
        );

        System.out.println("Contacto para eliminar encontrado: "+mainAgenda.remove(""));

        mainAgenda.list();

    }
}
