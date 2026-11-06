package org.example;

public class Contact {
    private String name;
    private String email;
    private boolean favorite;

    Contact(String name, String email, boolean favorite) {
        this.name = name;
        this.email = email;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
