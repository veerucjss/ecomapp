
package com.cjss.ecomapp.controller;

import javax.persistence.*;

@Entity

public class Customer {

    private @Id @GeneratedValue Long id;

    @Column
    private String FirstName;
    @Column
    private String LastName;
    @Column
    private String Email;
    @Column
    private String Mobileno;
    @Column
    private String Password;

    public Customer(){}

    public Customer(String firstname, String lastName, String email, String mobileno, String password) {

        FirstName = firstname;
        LastName = lastName;
        Email = email;
        Mobileno = mobileno;
        Password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return FirstName;
    }

    public void setFirstname(String firstname) {
        FirstName= firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile() {
        return Mobileno;
    }

    public void setMobile(String mobile) {
        Mobileno= mobile;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Firstname='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Mobile='" + Mobileno + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
