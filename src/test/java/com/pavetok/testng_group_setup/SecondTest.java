package com.pavetok.testng_group_setup;

import org.testng.annotations.Test;

public class SecondTest extends BaseTest {
    @Test(groups = {"group2"})
    public void secondTest() throws Exception {
        // empty
    }
}
