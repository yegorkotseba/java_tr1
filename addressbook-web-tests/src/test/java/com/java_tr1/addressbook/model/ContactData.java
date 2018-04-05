package com.java_tr1.addressbook.model;

public class ContactData {

    private final String firstname;
    private final String secondname;
    private String group;

    public ContactData(String firstname, String secondname, String group){
        this.firstname = firstname;
        this.secondname = secondname;
        this.group = group;
    }

    public String getFirstname(){return firstname;}

    public String getSecondname() { return secondname; }


    public String getGroup() {
        return group;
    }
}
