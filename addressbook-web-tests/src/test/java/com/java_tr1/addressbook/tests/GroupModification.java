package com.java_tr1.addressbook.tests;

import com.java_tr1.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModification extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
