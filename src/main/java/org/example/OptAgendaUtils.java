package org.example;

import static org.example.Agenda.lastTakenPosition;

public final class OptAgendaUtils {

    private final Contact[] contacts;

    private OptAgendaUtils(Agenda agenda) {
        contacts = agenda.getContacts();
    }

    public boolean addContactOpt(Contact contact, Agenda agenda) {

        for (int i = lastTakenPosition; i < contacts.length; i++) {
            if (contacts[i] == null) {
                if (contact.getEmail().contains("@")){
                    contacts[i] = contact;
                    lastTakenPosition = i;
                    return true;
                } else {
                    return false;
                }

            }
        }

        return false;
    }

    public boolean removeByContactNameOpt(String name) {

        for (int i = 0; i <= lastTakenPosition; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < lastTakenPosition; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[lastTakenPosition] = null;
                return true;
            }
        }

        return false;
    }

    public static void wattingPrint(String message) throws InterruptedException {
        System.out.println("================================");
        for (int i = 0; i < 10; i++) {

            System.out.print("\r"+message + ".".repeat(i % 4));

            Thread.sleep(550);
        }
    }

    public static void printDependingOnCondition(
            boolean contidion,
            String messgIfMeetCondition,
            String messgIfNotMeetCondition
    ) {
        if (contidion){
            System.out.println("\n================================");
            System.out.println(messgIfMeetCondition);
            System.out.println("================================");
        } else {
            System.out.println("\n================================");
            System.out.println(messgIfNotMeetCondition);
            System.out.println("================================");
        }

    }

}
