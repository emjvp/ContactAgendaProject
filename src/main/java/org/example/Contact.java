package org.example;

public class Contact {
    // TODO: usar toString en la versión 2 del programa
    private String name;
    private String email;
    private String phone;
    private boolean isFavorite;

    Contact(String name, String email, String phone, boolean isFavorite) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.isFavorite = isFavorite;
    }

    @Override
    public String toString() {
        return "Nombre del contacto: "+this.name + " \n Correo del usuario: \n" + this.email + " \n Es favorito: " + this.isFavorite;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public String getPhone() {
        return phone;
    }
}
