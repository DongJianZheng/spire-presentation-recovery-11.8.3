/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprckz;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprlto {
    private static char[] cfr_renamed_3;
    private static char[] cfr_renamed_4;

    static {
        char[] cArray = new char[10];
        cArray[0] = 30002;
        cArray[1] = 20057;
        cArray[2] = 19993;
        cArray[3] = 19969;
        cArray[4] = 25098;
        cArray[5] = 24049;
        cArray[6] = 24218;
        cArray[7] = 36763;
        cArray[8] = 22764;
        cArray[9] = 30328;
        cfr_renamed_4 = cArray;
        char[] cArray2 = new char[12];
        cArray2[0] = 23376;
        cArray2[1] = 19985;
        cArray2[2] = 23493;
        cArray2[3] = 21359;
        cArray2[4] = 36784;
        cArray2[5] = 24051;
        cArray2[6] = 21320;
        cArray2[7] = 26410;
        cArray2[8] = 30003;
        cArray2[9] = 37193;
        cArray2[10] = 25101;
        cArray2[11] = 20133;
        cfr_renamed_3 = cArray2;
    }

    @sprtea
    public static String cfr_renamed_17174(int arg0) {
        if (arg0 > 0 && arg0 < 11) {
            return Character.toString(cfr_renamed_4[arg0 - 1]);
        }
        return sprebp.cfr_renamed_14063(arg0);
    }

    private /* synthetic */ sprlto() {
    }

    @sprtea
    public static String cfr_renamed_17175(int arg0) {
        int n;
        int n2;
        if (arg0 < 1) {
            return sprebp.cfr_renamed_14063(arg0);
        }
        int n3 = arg0 % 60;
        if (n3 == 0) {
            n3 = 60;
        }
        if ((n2 = n3 % 10) == 0) {
            n2 = 10;
        }
        if ((n = n3 % 12) == 0) {
            n = 12;
        }
        Object[] objectArray = new Object[2];
        objectArray[0] = Character.valueOf(cfr_renamed_4[n2 - 1]);
        objectArray[1] = Character.valueOf(cfr_renamed_3[n - 1]);
        return sprraia.cfr_renamed_11562(sprckz.cfr_renamed_9("G\\A\u0017\r\u0011"), objectArray);
    }

    @sprtea
    public static String cfr_renamed_17176(int arg0) {
        if (arg0 > 0 && arg0 < 13) {
            return Character.toString(cfr_renamed_3[arg0 - 1]);
        }
        return sprebp.cfr_renamed_14063(arg0);
    }
}

