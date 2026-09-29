/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjpfa;
import com.spire.presentation.packages.sprpzy;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprrbn {
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return "Default";
            }
            case 1: {
                return sprpzy.cfr_renamed_9("\u0019^3C:E:S");
            }
            case 2: {
                return sprjpfa.cfr_renamed_9("1\t\u001f\u001a\u0014\u001d\u00173\u0017\u0010\u0000");
            }
        }
        return sprpzy.cfr_renamed_9("\nY4Y0@1\u0017\u001cX2G-R,D6X1d+E>C:P&\u0017)V3B:\u0019");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return "Default";
            }
            case 1: {
                return sprjpfa.cfr_renamed_9(":\u0010\u0010\r\u0019\u000b\u0019\u001d");
            }
            case 2: {
                return sprpzy.cfr_renamed_9("\u007f*Q9Z>Y\u0010Y3N");
            }
        }
        return sprjpfa.cfr_renamed_9(")\u0017\u0017\u0017\u0013\u000e\u0012Y?\u0016\u0011\t\u000e\u001c\u000f\n\u0015\u0016\u0012*\b\u000b\u001d\r\u0019\u001e\u0005Y\n\u0018\u0010\f\u0019W");
    }

    private /* synthetic */ sprrbn() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if ("Default".equals(arg0)) {
            return 0;
        }
        if (sprpzy.cfr_renamed_9("\u0019^3C:E:S").equals(arg0)) {
            return 1;
        }
        if (sprjpfa.cfr_renamed_9("1\t\u001f\u001a\u0014\u001d\u00173\u0017\u0010\u0000").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprpzy.cfr_renamed_9("b1\\1X(Y\u007ft0Z/E:D,^0Y\fC-V+R8N\u007fY>Z:\u0019"));
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }
}

