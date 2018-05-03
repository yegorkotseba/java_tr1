package com.java_tr1.addressbook.tests;

import com.java_tr1.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {

        app.goTo().GroupPage();
        List<GroupData> before = app.group().list();
        GroupData group = new GroupData("test5", null, null);
        app.group().create(group);
        List<GroupData> after = app.group().list();
        Assert.assertEquals(after.size(), before.size() +1);

        int max = 0;

        for(GroupData g : before){
            if (g.getId() > max){
                max = g.getId();
            }
        }

        group.setId(max);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
