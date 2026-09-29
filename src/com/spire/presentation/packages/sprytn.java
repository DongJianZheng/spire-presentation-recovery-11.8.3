/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprugb;

@sprtea
public final class sprytn {
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 3;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return "MD5";
            }
            case 1: {
                return "SHA1";
            }
            case 2: {
                return "SHA256";
            }
            case 3: {
                return sprugb.cfr_renamed_9("]\u001d=");
            }
        }
        return sprtma.cfr_renamed_9("X4f4b-czN2h9f\u0017h.e5iz{;a/ht");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        return nArray;
    }

    private /* synthetic */ sprytn() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return "MD5";
            }
            case 1: {
                return "SHA1";
            }
            case 2: {
                return "SHA256";
            }
            case 3: {
                return sprugb.cfr_renamed_9("]\u001d=");
            }
        }
        return sprtma.cfr_renamed_9("X4f4b-czN2h9f\u0017h.e5iz{;a/ht");
    }

    public static int cfr_renamed_5644(String arg0) {
        if ("MD5".equals(arg0)) {
            return 0;
        }
        if ("SHA1".equals(arg0)) {
            return 1;
        }
        if ("SHA256".equals(arg0)) {
            return 2;
        }
        if (sprugb.cfr_renamed_9("]\u001d=").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(sprtma.cfr_renamed_9("\u000fc1c5z4-\u0019e?n1@?y2b>-4l7ht"));
    }
}

