package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Agenda {

    public static int lastTakenPosition = 0;
    private int initialCapacity;
    private int capacity;
    private Contact[] contacts;

    public Agenda(int initialCapacity) {

        this.capacity = 1;

        if (initialCapacity > 0){
            this.initialCapacity = initialCapacity;
        }  else {
            this.initialCapacity = 1;
        }

        this.contacts = new Contact[this.initialCapacity];
    }

    public boolean add(Contact contact) {

        if (Objects.isNull(contact)) {
            return false;
        }

        if (this.isFull()) {
            this.contacts = Arrays.copyOf(this.contacts, this.initialCapacity * 2);
        }

        String newContactEmail = contact.getEmail();

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                if (!Objects.equals(contact.getEmail(), newContactEmail)) {
                    contacts[i] = contact;
                    return true;
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

    public boolean remove(String email) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getEmail().equalsIgnoreCase(email)) {
                for (int j = i; j < contacts.length - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                return true;
            }
        }

        return false;
    }


    public void list() {
        Contact[] contactsList = this.contacts.clone();
        for(Contact contact : contactsList) {
            if (contact != null) {
                System.out.println("---------------------");
                System.out.println(contact.getName());
                System.out.println(contact.getEmail());
                System.out.println(contact.getPhone());
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

        return contactsWithInfo == initialCapacity;
    }

    public boolean isEmpty() {
        return contacts[0] == null && contacts[contacts.length - 1] == null;
    }
}
