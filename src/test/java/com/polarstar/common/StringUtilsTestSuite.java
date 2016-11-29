package com.polarstar.common;

import junit.framework.TestCase;
import org.springframework.util.StringUtils;

/**
 * Created by zhangxuegang on 2016/6/18.
 */
public class StringUtilsTestSuite extends TestCase {
    /**
     * Constructs a test case with the given name.
     *
     * @param name
     */
    public StringUtilsTestSuite(String name) {
        super(name);
    }

    public void testCommaDelimitedListToStringArrayNullProducesEmptyArray() {
        String[] sa = StringUtils.commaDelimitedListToStringArray(null);
        assertTrue("String array isn't null with null input", sa != null);
        assertTrue("String array length == 0 with null input", sa.length == 0);
    }

    public void testSizeOf() {
        byte[] a = new byte[2000000000];
    }
}
