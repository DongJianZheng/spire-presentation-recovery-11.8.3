/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprubs;
import com.spire.presentation.packages.spruzo;

@sprtea
public final class sprcqo {
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 3;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return "Top";
            }
            case 1: {
                return spruzo.cfr_renamed_9("qp\\aWg");
            }
            case 2: {
                return "Bottom";
            }
        }
        return sprubs.cfr_renamed_9("'B\u0019B\u001d[\u001c\f&I\nX3B\u0011D\u001d^\u001bB\u0015x\u000b\\\u0017\f\u0004M\u001eY\u0017\u0002");
    }

    public static int cfr_renamed_5644(String arg0) {
        if ("Top".equals(arg0)) {
            return 0;
        }
        if (spruzo.cfr_renamed_9("qp\\aWg").equals(arg0)) {
            return 1;
        }
        if ("Bottom".equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprubs.cfr_renamed_9("y\u001cG\u001cC\u0005BRx\u0017T\u0006m\u001cO\u001aC\u0000E\u001cK&U\u0002IRB\u0013A\u0017\u0002"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return "Top";
            }
            case 1: {
                return spruzo.cfr_renamed_9("qp\\aWg");
            }
            case 2: {
                return "Bottom";
            }
        }
        return sprubs.cfr_renamed_9("'B\u0019B\u001d[\u001c\f&I\nX3B\u0011D\u001d^\u001bB\u0015x\u000b\\\u0017\f\u0004M\u001eY\u0017\u0002");
    }

    private /* synthetic */ sprcqo() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }
}

