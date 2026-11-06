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
                if (contact.getEmail().contains("@")){ // TODO: validar que la ultima cadena sea .com;
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

    public void listContactsOpt(){
        // TODO: implementar
    }

    public void listFavoriteContactsOpt(){
        // TODO: implementar
    }


    public boolean isFullOpt() {
        // TODO: implementar
        return false;
    }

    public int countFavorite(){
        // TODO: implementar
        return 0;
    }

}
