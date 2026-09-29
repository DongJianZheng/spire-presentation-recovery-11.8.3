/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzlp;

@sprtea
public class sprotn {
    private static byte cfr_renamed_86;
    private static byte cfr_renamed_152;
    private static byte cfr_renamed_112;
    private static byte cfr_renamed_119;
    private static byte cfr_renamed_91;
    private static byte cfr_renamed_0;
    private static byte cfr_renamed_1;
    private static byte cfr_renamed_2;
    private static sprlfja[] cfr_renamed_3;
    private static int cfr_renamed_4;

    @sprtea
    public static byte cfr_renamed_14954(sprtbp arg0) {
        switch (arg0.cfr_renamed_12576()) {
            case 1: {
                byte by = cfr_renamed_86;
                return by;
            }
            case 0: 
            case 3: {
                while (false) {
                }
                byte by = cfr_renamed_2;
                return by;
            }
            case 2: {
                byte by = cfr_renamed_152;
                return by;
            }
        }
        byte by = cfr_renamed_91;
        return by;
    }

    @sprtea
    public static int cfr_renamed_14955(int arg0, int arg1, boolean arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < cfr_renamed_3.length) {
            sprlfja sprlfja2;
            if (n != 19 && sprzlp.cfr_renamed_13140(new sprphja((sprlfja2 = cfr_renamed_3[n]).cfr_renamed_1942(), sprlfja2.cfr_renamed_1452()), new sprphja(arg0, arg1), arg2, cfr_renamed_4)) {
                return n;
            }
            n2 = ++n;
        }
        return 19;
    }

    @sprtea
    public static int[] cfr_renamed_14956(sprtbp arg0) {
        int n;
        int n2 = arg0.cfr_renamed_13157().length;
        int n3 = n2 % 2 == 1 ? n2 + 1 : n2;
        int[] nArray = new int[n3];
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n++;
            nArray[n5] = sprotn.cfr_renamed_14957(arg0.cfr_renamed_13157()[n5]);
            n4 = n;
        }
        if (n2 != n3) {
            nArray[n2] = 0;
        }
        return nArray;
    }

    @sprtea
    public static int cfr_renamed_14957(float arg0) {
        if (arg0 > 65535.0f) {
            return 65535;
        }
        if (arg0 < 0.0f || Float.isNaN(arg0)) {
            return 0;
        }
        return sprpkja.cfr_renamed_14958(Float.valueOf(arg0));
    }

    @sprtea
    public static short cfr_renamed_14959(float arg0) {
        if (arg0 > 32767.0f) {
            return Short.MAX_VALUE;
        }
        if (arg0 < -32768.0f || Float.isNaN(arg0)) {
            return Short.MIN_VALUE;
        }
        return sprpkja.cfr_renamed_14960(Float.valueOf(arg0));
    }

    static {
        cfr_renamed_4 = sprnmp.cfr_renamed_14961(2.0);
        cfr_renamed_119 = 0;
        cfr_renamed_1 = 1;
        cfr_renamed_112 = (byte)2;
        cfr_renamed_0 = (byte)3;
        cfr_renamed_2 = 0;
        cfr_renamed_152 = 1;
        cfr_renamed_86 = (byte)2;
        cfr_renamed_91 = (byte)3;
        cfr_renamed_3 = new sprlfja[20];
        sprotn.cfr_renamed_3[0] = sprnmp.cfr_renamed_14962(8.5, 11.0);
        sprotn.cfr_renamed_3[1] = sprnmp.cfr_renamed_14962(8.5, 14.0);
        sprotn.cfr_renamed_3[2] = sprnmp.cfr_renamed_14963(210.0, 297.0);
        sprotn.cfr_renamed_3[3] = sprnmp.cfr_renamed_14962(7.25, 10.5);
        sprotn.cfr_renamed_3[4] = sprnmp.cfr_renamed_14962(17.0, 11.0);
        sprotn.cfr_renamed_3[5] = sprnmp.cfr_renamed_14963(297.0, 420.0);
        sprotn.cfr_renamed_3[6] = sprnmp.cfr_renamed_14962(4.1, 9.5);
        sprotn.cfr_renamed_3[7] = sprnmp.cfr_renamed_14962(3.875, 7.5);
        sprotn.cfr_renamed_3[8] = sprnmp.cfr_renamed_14963(162.0, 229.0);
        sprotn.cfr_renamed_3[9] = sprnmp.cfr_renamed_14963(110.0, 220.0);
        sprotn.cfr_renamed_3[10] = sprnmp.cfr_renamed_14963(257.0, 364.0);
        sprotn.cfr_renamed_3[11] = sprnmp.cfr_renamed_14963(182.0, 257.0);
        sprotn.cfr_renamed_3[12] = sprnmp.cfr_renamed_14963(176.0, 250.0);
        sprotn.cfr_renamed_3[13] = sprlfja.cfr_renamed_13377();
        sprotn.cfr_renamed_3[14] = sprnmp.cfr_renamed_14963(100.0, 148.0);
        sprotn.cfr_renamed_3[15] = sprnmp.cfr_renamed_14963(200.0, 148.0);
        sprotn.cfr_renamed_3[16] = sprnmp.cfr_renamed_14963(148.0, 210.0);
        sprotn.cfr_renamed_3[17] = sprnmp.cfr_renamed_14963(105.0, 148.0);
        sprotn.cfr_renamed_3[18] = sprnmp.cfr_renamed_14963(128.0, 182.0);
        sprotn.cfr_renamed_3[19] = sprlfja.cfr_renamed_13377();
    }

    @sprtea
    public static byte cfr_renamed_14964(sprtbp arg0) {
        switch (arg0.cfr_renamed_13152()) {
            case 0: 
            case 16: 
            case 19: 
            case 20: 
            case 240: 
            case 255: {
                while (false) {
                }
                byte by = cfr_renamed_119;
                return by;
            }
            case 2: 
            case 18: {
                byte by = cfr_renamed_1;
                return by;
            }
            case 1: 
            case 17: {
                byte by = cfr_renamed_112;
                return by;
            }
            case 3: {
                byte by = cfr_renamed_0;
                return by;
            }
        }
        byte by = cfr_renamed_112;
        return by;
    }

    @sprtea
    public static short[] cfr_renamed_14965(sprsuja arg0) {
        short[] sArray = new short[2];
        sArray[0] = sprotn.cfr_renamed_14959(arg0.cfr_renamed_1980());
        sArray[1] = sprotn.cfr_renamed_14959(arg0.spr\u3181());
        return sArray;
    }
}

