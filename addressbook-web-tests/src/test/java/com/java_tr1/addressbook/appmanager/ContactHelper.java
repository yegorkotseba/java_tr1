package com.java_tr1.addressbook.appmanager;

import com.java_tr1.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper (WebDriver driver){ super(driver);}

    public void initContactCreation() { click(By.linkText("add new"));}

    public void fillContactForm (ContactData contactData){
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getSecondname());
    }

    public void submitContactCreation() { click(By.name("submit"));}

    public void returnToHomePage() { click(By.linkText("home page"));}

    public void initContactModification() { click(By.cssSelector("img[alt='Edit']"));}

    public void submitContactModification() { click(By.name("update"));}
}
