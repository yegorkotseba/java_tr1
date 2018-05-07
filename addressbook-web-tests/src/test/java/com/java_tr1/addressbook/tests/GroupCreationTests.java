package com.java_tr1.addressbook.tests;

import com.java_tr1.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {

        app.goTo().groupPage();
        List<GroupData> before = app.group().list();
        GroupData group = new GroupData("test5", null, null);
        app.group().create(group);
        List<GroupData> after = app.group().list();
        Assert.assertEquals(after.size(), before.size() +1);

        before.add(group);
        Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }

}
