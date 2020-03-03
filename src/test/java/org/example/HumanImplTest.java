package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanImplTest {
    Human genderType = new HumanImpl();

    @Before
    public void setUp() throws Exception {
        Human genderType = new HumanImpl();
    }

    @Test
    public void gender() {
        String gender = "male";
        Assert.assertSame(genderType,gender);
    }

    @Test
    public void living() {
        boolean alive = true;
        Assert.assertTrue(alive);
    }
}