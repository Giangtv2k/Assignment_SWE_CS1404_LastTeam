/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;

/**
 *
 * @author Jacky
 */
public class User {
    
    private String account, pass, name, address;
    private boolean gender;
    private Date dateOfBirth;

    public User() {
    }

    public User(String account, String pass, String name, String address, boolean gender, Date dateOfBirth) {
        this.account = account;
        this.pass = pass;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
