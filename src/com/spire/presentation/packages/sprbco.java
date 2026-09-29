/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgaa;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprbco {
    public static final int cfr_renamed_152 = 12;
    public static final int cfr_renamed_112 = 10;
    public static final int cfr_renamed_119 = 11;
    public static final int cfr_renamed_91 = 13;
    public static final int cfr_renamed_0 = 8;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 14;
    public static final int cfr_renamed_4 = 15;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sprhgaa.cfr_renamed_9(">r o\u0015y\u0019~\u0004t\u001fs");
            }
            case 2: {
                return sprsvh.cfr_renamed_9("!\u000f\u0013\u0000%\u0014\u0010\u0002\u001c\u0005\u0001\t\u0007T");
            }
            case 10: {
                return sprhgaa.cfr_renamed_9("M\u001ez>r\u001ex");
            }
            case 11: {
                return sprsvh.cfr_renamed_9("%\b\u00125\u0000\u0004");
            }
            case 12: {
                return sprhgaa.cfr_renamed_9("M\u001ez%m");
            }
            case 13: {
                return sprsvh.cfr_renamed_9("%\b\u0012'\u0003\u0003\u0007\u0007\u0012\u0003");
            }
            case 14: {
                return sprhgaa.cfr_renamed_9(" s\u0017M\u0011x\u0004u");
            }
            case 15: {
                return sprsvh.cfr_renamed_9("%\b\u0012)\u0005\u0012\u001c\u000b\u0000\u000b");
            }
        }
        return sprhgaa.cfr_renamed_9("H\u001ev\u001er\u0007sPM\u0014{ o\u0015y\u0019~\u0004r\u0002I\tm\u0015=\u0006|\u001ch\u00153");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[8];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 10;
        nArray[3] = 11;
        nArray[4] = 12;
        nArray[5] = 13;
        nArray[6] = 14;
        nArray[7] = 15;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
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
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sprsvh.cfr_renamed_9(";\t%\u0014\u0010\u0002\u001c\u0005\u0001\u000f\u001a\b");
            }
            case 2: {
                return sprhgaa.cfr_renamed_9("$t\u0016{ o\u0015y\u0019~\u0004r\u0002/");
            }
            case 10: {
                return sprsvh.cfr_renamed_9("6\u001b\u0001;\t\u001b\u0003");
            }
            case 11: {
                return sprhgaa.cfr_renamed_9(" s\u0017N\u0005\u007f");
            }
            case 12: {
                return sprsvh.cfr_renamed_9("6\u001b\u0001 \u0016");
            }
            case 13: {
                return sprhgaa.cfr_renamed_9(" s\u0017\\\u0006x\u0002|\u0017x");
            }
            case 14: {
                return sprsvh.cfr_renamed_9("%\b\u00126\u0014\u0003\u0001\u000e");
            }
            case 15: {
                return sprhgaa.cfr_renamed_9(" s\u0017R\u0000i\u0019p\u0005p");
            }
        }
        return sprsvh.cfr_renamed_9("3\u001b\r\u001b\t\u0002\bU6\u0011\u0000%\u0014\u0010\u0002\u001c\u0005\u0001\t\u00072\f\u0016\u0010F\u0003\u0007\u0019\u0013\u0010H");
    }

    private /* synthetic */ sprbco() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprhgaa.cfr_renamed_9(">r o\u0015y\u0019~\u0004t\u001fs").equals(arg0)) {
            return 1;
        }
        if (sprsvh.cfr_renamed_9("!\u000f\u0013\u0000%\u0014\u0010\u0002\u001c\u0005\u0001\t\u0007T").equals(arg0)) {
            return 2;
        }
        if (sprhgaa.cfr_renamed_9("M\u001ez>r\u001ex").equals(arg0)) {
            return 10;
        }
        if (sprsvh.cfr_renamed_9("%\b\u00125\u0000\u0004").equals(arg0)) {
            return 11;
        }
        if (sprhgaa.cfr_renamed_9("M\u001ez%m").equals(arg0)) {
            return 12;
        }
        if (sprsvh.cfr_renamed_9("%\b\u0012'\u0003\u0003\u0007\u0007\u0012\u0003").equals(arg0)) {
            return 13;
        }
        if (sprhgaa.cfr_renamed_9(" s\u0017M\u0011x\u0004u").equals(arg0)) {
            return 14;
        }
        if (sprsvh.cfr_renamed_9("%\b\u0012)\u0005\u0012\u001c\u000b\u0000\u000b").equals(arg0)) {
            return 15;
        }
        throw new IllegalArgumentException(sprhgaa.cfr_renamed_9("%s\u001bs\u001fj\u001e= y\u0016M\u0002x\u0014t\u0013i\u001fo$d\u0000xPs\u0011p\u00153"));
    }
}

