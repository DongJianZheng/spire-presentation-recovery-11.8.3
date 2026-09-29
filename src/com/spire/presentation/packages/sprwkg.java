/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraog;
import com.spire.presentation.packages.sprcjg;
import com.spire.presentation.packages.sprfpg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvpg;

public class sprwkg {
    public static byte[] cfr_renamed_7112(spraog arg0, sprvpg arg1) {
        int n;
        byte[] byArray = new byte[arg1.cfr_renamed_7040() - 32];
        int n2 = n = 0;
        while (n2 < arg1.cfr_renamed_7055()) {
            System.arraycopy(arg0.cfr_renamed_6975(n).cfr_renamed_7109(), 0, byArray, n++ * 320, 320);
            n2 = n;
        }
        return byArray;
    }

    public static byte[] cfr_renamed_7113(byte[] arg0, sprfpg arg1, spraog arg2, sprvpg arg3) {
        int n;
        int n2 = 0;
        byte[] byArray = new byte[arg3.cfr_renamed_7035()];
        n2 += 32;
        System.arraycopy(arg0, 0, byArray, 0, 32);
        int n3 = n = 0;
        while (n3 < arg3.cfr_renamed_7056()) {
            byte[] byArray2 = arg1.cfr_renamed_6975(n).cfr_renamed_7107();
            int n4 = n2 + n * arg3.cfr_renamed_7108();
            System.arraycopy(byArray2, 0, byArray, n4, arg3.cfr_renamed_7108());
            n3 = ++n;
        }
        n2 += arg3.cfr_renamed_7056() * arg3.cfr_renamed_7108();
        int n5 = n = 0;
        while (n5 < arg3.cfr_renamed_7114() + arg3.cfr_renamed_7055()) {
            int n6 = n2 + n;
            byArray[n6] = 0;
            n5 = ++n;
        }
        int n7 = 0;
        int n8 = n = 0;
        while (n8 < arg3.cfr_renamed_7055()) {
            int n9;
            int n10 = n9 = 0;
            while (n10 < 256) {
                if (arg2.cfr_renamed_6975(n).cfr_renamed_6983(n9) != 0) {
                    int n11 = n2 + n7;
                    ++n7;
                    byArray[n11] = (byte)n9;
                }
                n10 = ++n9;
            }
            int n12 = n2 + arg3.cfr_renamed_7114() + n;
            byArray[n12] = (byte)n7;
            n8 = ++n;
        }
        return byArray;
    }

    public static byte[][] cfr_renamed_7115(byte[] arg0, byte[] arg1, byte[] arg2, spraog arg3, sprfpg arg4, spraog arg5, sprvpg arg6) {
        int n;
        byte[][] byArrayArray = new byte[6][];
        byArrayArray[0] = arg0;
        byArrayArray[1] = arg2;
        byArrayArray[2] = arg1;
        byArrayArray[3] = new byte[arg6.cfr_renamed_7056() * arg6.cfr_renamed_7116()];
        int n2 = n = 0;
        while (n2 < arg6.cfr_renamed_7056()) {
            arg4.cfr_renamed_6975(n).cfr_renamed_7102(byArrayArray[3], n++ * arg6.cfr_renamed_7116());
            n2 = n;
        }
        byArrayArray[4] = new byte[arg6.cfr_renamed_7055() * arg6.cfr_renamed_7116()];
        int n3 = n = 0;
        while (n3 < arg6.cfr_renamed_7055()) {
            arg5.cfr_renamed_6975(n).cfr_renamed_7102(byArrayArray[4], n++ * arg6.cfr_renamed_7116());
            n3 = n;
        }
        byArrayArray[5] = new byte[arg6.cfr_renamed_7055() * 416];
        int n4 = n = 0;
        while (n4 < arg6.cfr_renamed_7055()) {
            arg3.cfr_renamed_6975(n).cfr_renamed_7100(byArrayArray[5], n++ * 416);
            n4 = n;
        }
        return byArrayArray;
    }

    public static spraog cfr_renamed_7117(spraog arg0, byte[] arg1, sprvpg arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.cfr_renamed_7055()) {
            sprcjg sprcjg2 = arg0.cfr_renamed_6975(n);
            int n3 = n * 320;
            int n4 = (n + 1) * 320;
            sprcjg2.cfr_renamed_7111(sproze.cfr_renamed_533(arg1, n3, 32 + n4));
            n2 = ++n;
        }
        return arg0;
    }

    public static void cfr_renamed_7118(spraog arg0, sprfpg arg1, spraog arg2, byte[] arg3, byte[] arg4, byte[] arg5, sprvpg arg6) {
        int n;
        int n2 = n = 0;
        while (n2 < arg6.cfr_renamed_7056()) {
            arg1.cfr_renamed_6975(n).cfr_renamed_7110(arg4, n++ * arg6.cfr_renamed_7116());
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < arg6.cfr_renamed_7055()) {
            arg2.cfr_renamed_6975(n).cfr_renamed_7110(arg5, n++ * arg6.cfr_renamed_7116());
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < arg6.cfr_renamed_7055()) {
            arg0.cfr_renamed_6975(n).cfr_renamed_7099(arg3, n++ * 416);
            n4 = n;
        }
    }

    public static boolean cfr_renamed_7119(sprfpg arg0, spraog arg1, byte[] arg2, sprvpg arg3) {
        int n;
        int n2;
        int n3 = 32;
        int n4 = n2 = 0;
        while (n4 < arg3.cfr_renamed_7056()) {
            sprcjg sprcjg2 = arg0.cfr_renamed_6975(n2);
            int n5 = n3 + n2 * arg3.cfr_renamed_7108();
            int n6 = (n2 + 1) * arg3.cfr_renamed_7108();
            sprcjg2.cfr_renamed_7093(sproze.cfr_renamed_533(arg2, n5, n3 + n6));
            n4 = ++n2;
        }
        n3 += arg3.cfr_renamed_7056() * arg3.cfr_renamed_7108();
        int n7 = 0;
        int n8 = n2 = 0;
        while (n8 < arg3.cfr_renamed_7055()) {
            int n9 = n = 0;
            while (n9 < 256) {
                arg1.cfr_renamed_6975(n2).cfr_renamed_7069(n++, 0);
                n9 = n;
            }
            if ((arg2[n3 + arg3.cfr_renamed_7114() + n2] & 0xFF) < n7 || (arg2[n3 + arg3.cfr_renamed_7114() + n2] & 0xFF) > arg3.cfr_renamed_7114()) {
                return false;
            }
            int n10 = n = n7;
            while (n10 < (arg2[n3 + arg3.cfr_renamed_7114() + n2] & 0xFF)) {
                if (n > n7 && (arg2[n3 + n] & 0xFF) <= (arg2[n3 + n - 1] & 0xFF)) {
                    return false;
                }
                byte by = arg2[n3 + n];
                arg1.cfr_renamed_6975(n2).cfr_renamed_7069(by & 0xFF, 1);
                n10 = ++n;
            }
            int n11 = n3 + arg3.cfr_renamed_7114() + n2;
            n7 = arg2[n11];
            n8 = ++n2;
        }
        int n12 = n = n7;
        while (n12 < arg3.cfr_renamed_7114()) {
            if ((arg2[n3 + n] & 0xFF) != 0) {
                return false;
            }
            n12 = ++n;
        }
        return true;
    }
}

