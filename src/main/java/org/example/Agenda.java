package org.example;

public class Agenda {

    static int lastTakenPosition = 0;
    private int capacity;
    private Contact[] contacts;

    public Agenda(int capacity) {
        this.capacity = capacity;
        this.contacts = new Contact[capacity];
    }

    public boolean add(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                if (contact.getEmail().contains("@")){ // TODO: validar que la ultima cadena sea .com;
                    contacts[i] = contact;
                    return true;
                } else {
                    return false;
                }

            }
        }

        return false;
    }

    public boolean addContact(Contact contact) {

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

    public Contact search(String name) {

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }

        return null;
    }

    public boolean remove(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                int j;
                for (j = i; j < contacts.length - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                return true;
            }
        }

        return false;
    }

    public boolean removeByContactName(String name) {

        for (int i = 0; i <= lastTakenPosition; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < lastTakenPosition; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[lastTakenPosition] = null;
                return true;
            }
        }

        return false;
    }

    public void list() {
        for(Contact contact : contacts) {
            if (contact != null) {
                System.out.println(contact.getName());
                System.out.println(contact.getEmail());
                System.out.println("---------------------");
            }
        }
    }

    public Contact[] getContacts() {
        return contacts;
    }
}
