/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmvz;
import com.spire.presentation.packages.sprtiz;

public final class sprvfo {
    public static final int cfr_renamed_91 = 0;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 2;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 4;
    public static final int cfr_renamed_4 = 5;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprmvz.cfr_renamed_9("f3Q2L\u0015]1A\u0012K-M%g.H.V");
            }
            case 1: {
                return sprtiz.cfr_renamed_9("1\u0005\u0006\u0004\u001b#\n\u0007\u0016?\u0012\u0003\u0010\u001f5\u001e\u001f\u001b");
            }
            case 2: {
                return sprmvz.cfr_renamed_9("\u0003V4W)p8T$p$\\5Q3A\u0007M-H");
            }
            case 3: {
                return sprtiz.cfr_renamed_9("5\u0001\u0002\u0000\u001f'\u000e\u0003\u0012#\u0016\u0007\u001f4\u0005\u0012\u0013\u001a\u0012\u001d\u0003");
            }
            case 4: {
                return sprmvz.cfr_renamed_9("f3Q2L\u0015]1A\rM/A V\u0006V @(A/P");
            }
        }
        return sprtiz.cfr_renamed_9("\"\u001d\u001c\u001d\u0018\u0004\u0019S2\u001e\u0011#\u001b\u0006\u00041\u0005\u0006\u0004\u001b#\n\u0007\u0016W\u0005\u0016\u001f\u0002\u0016Y");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprmvz.cfr_renamed_9("f3Q2L\u0015]1A\u0012K-M%g.H.V").equals(arg0)) {
            return 0;
        }
        if (sprtiz.cfr_renamed_9("1\u0005\u0006\u0004\u001b#\n\u0007\u0016?\u0012\u0003\u0010\u001f5\u001e\u001f\u001b").equals(arg0)) {
            return 1;
        }
        if (sprmvz.cfr_renamed_9("\u0003V4W)p8T$p$\\5Q3A\u0007M-H").equals(arg0)) {
            return 2;
        }
        if (sprtiz.cfr_renamed_9("5\u0001\u0002\u0000\u001f'\u000e\u0003\u0012#\u0016\u0007\u001f4\u0005\u0012\u0013\u001a\u0012\u001d\u0003").equals(arg0)) {
            return 3;
        }
        if (sprmvz.cfr_renamed_9("f3Q2L\u0015]1A\rM/A V\u0006V @(A/P").equals(arg0)) {
            return 4;
        }
        throw new IllegalArgumentException(sprtiz.cfr_renamed_9("&\u0019\u0018\u0019\u001c\u0000\u001dW6\u001a\u0015'\u001f\u0002\u00005\u0001\u0002\u0000\u001f'\u000e\u0003\u0012S\u0019\u0012\u001a\u0016Y"));
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 2;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprmvz.cfr_renamed_9("f3Q2L\u0015]1A\u0012K-M%g.H.V");
            }
            case 1: {
                return sprtiz.cfr_renamed_9("1\u0005\u0006\u0004\u001b#\n\u0007\u0016?\u0012\u0003\u0010\u001f5\u001e\u001f\u001b");
            }
            case 2: {
                return sprmvz.cfr_renamed_9("\u0003V4W)p8T$p$\\5Q3A\u0007M-H");
            }
            case 3: {
                return sprtiz.cfr_renamed_9("5\u0001\u0002\u0000\u001f'\u000e\u0003\u0012#\u0016\u0007\u001f4\u0005\u0012\u0013\u001a\u0012\u001d\u0003");
            }
            case 4: {
                return sprmvz.cfr_renamed_9("f3Q2L\u0015]1A\rM/A V\u0006V @(A/P");
            }
        }
        return sprtiz.cfr_renamed_9("\"\u001d\u001c\u001d\u0018\u0004\u0019S2\u001e\u0011#\u001b\u0006\u00041\u0005\u0006\u0004\u001b#\n\u0007\u0016W\u0005\u0016\u001f\u0002\u0016Y");
    }

    private /* synthetic */ sprvfo() {
    }
}

