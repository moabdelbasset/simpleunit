package com.simple.junit;

import junit.framework.*;
public class TestExample extends TestCase {
    public void testOne()
    {
        assertTrue( "TestExample", true );
    }
    public void testTwo()
    {
        assertFalse( "TestExample22", false );
    }
    public void testThree()
    {
        assertFalse( "TestCase 3",  false);
    }
}

