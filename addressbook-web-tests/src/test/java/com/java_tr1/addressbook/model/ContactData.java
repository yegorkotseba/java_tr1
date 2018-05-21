package com.java_tr1.addressbook.model;

import java.io.File;

public class ContactData {

    private String firstname;
    private String secondname;
    private String group;
    private File photo;

    public ContactData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public ContactData withFirstName(String firstName) {
        this.firstname = firstname;
        return this;
    }

    public ContactData withSecondName(String secondName) {
        this.secondname = secondName;
        return this;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }


    /*public ContactData(String firstname, String secondname, String group){
        this.firstname = firstname;
        this.secondname = secondname;
        this.group = group;
    }*/

    public String getFirstname(){return firstname;}

    public String getSecondname() { return secondname; }

    public String getGroup() { return group; }

    public File getPhoto() { return photo;}
}
