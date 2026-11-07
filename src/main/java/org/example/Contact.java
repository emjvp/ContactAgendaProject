package org.example;

public class Contact {
    // TODO: usar toString en la versión 2 del programa
    private String name;
    private String email;
    private boolean favorite;

    Contact(String name, String email, boolean favorite) {
        this.name = name;
        this.email = email;
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Nombre del contacto: "+this.name + " \n Correo del usuario: \n" + this.email + " \n Es favorito: " + this.favorite;
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
