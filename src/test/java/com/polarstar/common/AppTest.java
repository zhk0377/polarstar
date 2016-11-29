package com.polarstar.common;

import com.polarstar.enums.BusinessTypeEnum;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    @Deprecated
    public void testThreadDump() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList.get(2));
    }

    public void testMain() {
        if (BusinessTypeEnum.AUCTION.toString().equals("AUCTION")) {
            return;
        }
    }

    public void testAraysAsList() {

    }





}
