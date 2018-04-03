package com.java_tr1.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {

        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test5", "test5", "test5"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
