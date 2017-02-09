package com.pavetok.testng_group_setup;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    @Test(groups = {"group1"})
    public void firstTest() throws Exception {
        // empty
    }
}
