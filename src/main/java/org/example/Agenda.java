package org.example;

public class Agenda {

    public static int lastTakenPosition = 0;
    private int capacity;
    private Contact[] contacts;

    public Agenda(int capacity) {

        if (capacity > 0){
            this.capacity = capacity;
        } else {
            this.capacity = 1;
        }

        this.contacts = new Contact[this.capacity];
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

    public Contact[] getContacts() {
        return contacts;
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
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < contacts.length - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                return true;
            }
        }

        return false;
    }


    public void list() {
        for(Contact contact : contacts) {
            if (contact != null) {
                System.out.println("---------------------");
                System.out.println(contact.getName());
                System.out.println(contact.getEmail());
                System.out.println("---------------------");
            }
        }
        System.out.println("---Fin de la lista---");
    }

    public void listFavorites() {
        for (Contact contact : contacts) {
            if (contact != null && contact.isFavorite()) {
                System.out.println("---------------------");
                System.out.println(contact.getName());
                System.out.println(contact.getEmail());
                System.out.println("---------------------");
            }
        }
        System.out.println("---Fin de la lista---");
    }

    public int count() {
        int counter = 0;

        while (contacts[counter] != null) {
            counter++;
        }

        return counter;
    }

    public int countFavorites() {

        int favoriteCount = 0;
        for (Contact contact : contacts) {
            if (contact != null && contact.isFavorite()) {
                favoriteCount++;
            }
        }

        return favoriteCount;
    }

    public boolean isFull() {

        int contactsWithInfo = 0;
        for (Contact contact : contacts) {
            if (contact != null) {
                contactsWithInfo++;
            }
        }

        return contactsWithInfo == capacity;
    }

    public boolean isEmpty() {
        return contacts[0] == null && contacts[contacts.length - 1] == null;
    }
}
