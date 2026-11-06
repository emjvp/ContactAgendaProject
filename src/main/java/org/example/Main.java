package org.example;

public class Main {
    static void main() {
        Agenda mainAgenda = new Agenda(-1);

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

        mainAgenda.add(
                new Contact(
                        "Test contact 5 Fav",
                        "test5fav@example.com",
                        true
                )
        );

        mainAgenda.add(
                new Contact(
                        "Test contact 6 Fav",
                        "test6fav@example.com",
                        true
                )
        );

        // mainAgenda.list();
        // mainAgenda.listFavorites();
        System.out.println(mainAgenda.isEmpty());

    }
}
