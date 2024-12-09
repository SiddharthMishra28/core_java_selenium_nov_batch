package com.java.oop.encapsulation;

public class RegistrationForm {
    public String name;
    protected String email;
    protected String phone;
    private String password;

    public static void main(String[] args) {
        RegistrationForm form = new RegistrationForm();
        // MODIFIED PRIVATE MEMBER INSIDE HOME CLASS BOUNDARY
        form.password = "sadsadda";
    }

}
