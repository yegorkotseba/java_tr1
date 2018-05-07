package com.java_tr1.addressbook.tests;

import com.java_tr1.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        GroupData group = new GroupData("test5", null, null);
        app.getGroupHelper().createGroup(group);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() +1);

        group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
