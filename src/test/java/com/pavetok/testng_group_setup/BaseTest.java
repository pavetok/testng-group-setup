package com.pavetok.testng_group_setup;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class BaseTest {
    private String someObject = null;

    @BeforeClass(alwaysRun = true)
    public void classSetUp() throws Exception {
        someObject = "some value";
    }

    @BeforeGroups(groups = {"group1"}, alwaysRun = true)
    public void groupSetUp() {
        System.out.println(someObject.length());
    }
}
