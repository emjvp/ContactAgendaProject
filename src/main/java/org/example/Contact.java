package org.example;


public class Contact {
    private String name;
    private String email;
    private String phone;
    private int age;
    private boolean isFavorite;

    Contact(String name, String email, String phone, int age, boolean isFavorite) {
        setName(name);
        setEmail(email);
        setPhone(phone);
        setAge(age);
        this.isFavorite = isFavorite;
    }

    @Override
    public String toString() {
        return "Nombre del contacto: " + this.name + " \n Correo del usuario: \n" + this.email + " \n Es favorito: " + this.isFavorite;
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

    public int getAge() {
        return age;
    }

    public boolean setName(String name) {

        if (name == null || name.length() < 2) {
            return false;
        }

        this.name = name;

        return true;
    }

    public boolean setEmail(String email) {

        if (invalidEmailFormat(email)) {
            this.email = email;
            return true;
        }

        return false;
    }

    public boolean setPhone(String phone) {
        try {
            if (validPhoneFormat(phone)) {
                this.phone = phone;
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    public boolean setAge(int age) {

        if (age >= 0 && age <= 120) {
            this.age = age;
            return true;
        }

        return false;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    private boolean invalidEmailFormat(String email) {
        return email.contains("@") && email.contains(".");
    }

    private boolean validPhoneFormat(String phone) {
        try {

            Integer.parseInt(phone);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

}
