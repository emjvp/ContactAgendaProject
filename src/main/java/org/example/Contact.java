package org.example;

public class Contact {
    // TODO: usar toString
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

    public boolean isFavorite() {
        return favorite;
    }

}
