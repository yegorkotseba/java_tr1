package com.java_tr1.addressbook.tests;

import com.java_tr1.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test5", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
