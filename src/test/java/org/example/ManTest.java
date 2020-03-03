package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManTest {
    Human man = new HumanImpl();

    @Before
    public void setUp() throws Exception {
        Human man = new HumanImpl();
    }

    @Test
    public void setGender() {
        String type = "male";
        Assert.assertSame(type, man);
    }
}