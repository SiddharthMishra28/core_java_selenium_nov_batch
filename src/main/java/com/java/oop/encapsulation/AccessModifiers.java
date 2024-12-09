package com.java.oop.encapsulation;

import com.java.oop.polymorphism.AreaUtils;

public class AccessModifiers {
    // 4 Types of access modifiers
    // default, public, protected, private
    public static void main(String[] args) {
        RegistrationWizard wizard = new RegistrationWizard();
        RegistrationForm form = new RegistrationForm();
//        wizard.password = "Dsadda"; // NOT ALLOWED PRIVATE MEMBER MODIFICATION

        Banking hdfc = new Banking();
        hdfc.setAccountNumber(3213820313L);
//        hdfc. DEFAULT MEMBERS ARE ACCESSIBLE INSIDE SAME PACKAGE
    }
}
