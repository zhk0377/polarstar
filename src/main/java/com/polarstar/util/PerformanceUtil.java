package com.polarstar.util;

import java.util.HashMap;

/**
 * Refrence follow
 * <a href = "https://github.com/Top-Q/jsystem/blob/master/jsystem-core-projects/jsystemCore/src/main/java/jsystem/utils/PerformanceUtil.java" />
 * @com.googlecode.test.toolkit.util.PerformanceUtil
 * Utility for performance measuring and reporting.<br>
 * Usage:<br>
 *
 * call to the <I>startMeasure()</I> method returns an Index.<br>
 * call to the <I>endMeasure(index, toPrint)</I> method will locate the index and printout the
 * given message with the time measured.<br>
 *
 * <br>
 * currently, only print to logger using info level.<br>
 * in the future, we can use this for different statistics
 * @author zhangxuegang
 */
public class PerformanceUtil {
    private static int counter = 0;

    private static HashMap<Integer, Long> times;

    static {
        times = new HashMap<Integer, Long>();
    }

    /**
     * Start a new time measure
     *
     * @return the index for the measure (needed for <I>endMeasure</I> method)
     */
    public synchronized static int startMeasure() {
        long time = System.currentTimeMillis();
        counter++;
        times.put(counter, time);
        return counter;
    }

    /**
     * Printout the given message with time, by the given index<br>
     * <B>Note: the index is removed after this call so several calls are not supported!</B>
     *
     * @param index   the index given by <I>startMeasure</I>
     * @param toPrint The message to print with the time
     */
    public synchronized static void endMeasure(Integer index, String toPrint) {
        long now = System.currentTimeMillis();
        Long time = times.get(index);
        if (time == null) {
            return;
        }
        double diff = now - time;
        System.out.println(toPrint + " Took " + (double) diff / 1000 + " seconds.");
        times.remove(index);
    }

}
