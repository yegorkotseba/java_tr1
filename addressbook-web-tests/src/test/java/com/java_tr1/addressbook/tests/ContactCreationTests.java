package com.java_tr1.addressbook.tests;

import com.java_tr1.addressbook.model.ContactData;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        app.goTo().goToHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData().
                withFirstName("test_name").withSecondName("test_surname").withGroup("test1").withPhoto(new File("src/resources/officerImage.jpg")), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
