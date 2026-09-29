/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprdei;
import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;

public class spradi {
    private static /* synthetic */ byte[] cfr_renamed_9256(sprdei arg0) {
        int n;
        sprfwk sprfwk2 = new sprfwk(sprkkk.cfr_renamed_9216());
        sprfwk sprfwk3 = new sprfwk(sprkkk.cfr_renamed_5701());
        sprdei sprdei2 = arg0;
        byte[] byArray = sproze.cfr_renamed_543(sprkoe.cfr_renamed_433(arg0.cfr_renamed_8132()), sprdei2.cfr_renamed_2113());
        byte[] byArray2 = sprdei2.cfr_renamed_3880();
        int n2 = (byArray2.length + 1) / 2;
        byte[] byArray3 = new byte[n2];
        byte[] byArray4 = new byte[n2];
        byte[] byArray5 = byArray2;
        System.arraycopy(byArray5, 0, byArray3, 0, n2);
        System.arraycopy(byArray5, byArray2.length - n2, byArray4, 0, n2);
        int n3 = arg0.cfr_renamed_806();
        byte[] byArray6 = new byte[n3];
        byte[] byArray7 = new byte[n3];
        spradi.cfr_renamed_9257(sprfwk2, byArray3, byArray, byArray6);
        spradi.cfr_renamed_9257(sprfwk3, byArray4, byArray, byArray7);
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n;
            byte by = (byte)(byArray6[n5] ^ byArray7[n]);
            byArray6[n5] = by;
            n4 = ++n;
        }
        return byArray6;
    }

    public static /* synthetic */ byte[] cfr_renamed_9258(sprdei arg0) {
        return spradi.cfr_renamed_9256(arg0);
    }

    public static /* synthetic */ void cfr_renamed_9259(spraq arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        spradi.cfr_renamed_9257(arg0, arg1, arg2, arg3);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
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
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_9257(spraq spraq2, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        int n;
        void arg3;
        void arg1;
        spraq arg0;
        spraq spraq3 = arg0;
        spraq spraq4 = arg0;
        spraq3.cfr_renamed_5692(new sprtpk((byte[])arg1));
        byte[] byArray4 = byArray2;
        int n2 = spraq3.cfr_renamed_2404();
        int n3 = (((void)arg3).length + n2 - 1) / n2;
        spraq spraq5 = arg0;
        byte[] byArray5 = new byte[spraq5.cfr_renamed_2404()];
        byte[] byArray6 = new byte[spraq5.cfr_renamed_2404()];
        int n4 = n = 0;
        while (n4 < n3) {
            void arg2;
            arg0.cfr_renamed_1197(byArray4, 0, byArray4.length);
            spraq spraq6 = arg0;
            spraq6.cfr_renamed_1219(byArray5, 0);
            byArray4 = byArray5;
            spraq6.cfr_renamed_1197(byArray4, 0, byArray4.length);
            void v5 = arg2;
            arg0.cfr_renamed_1197((byte[])v5, 0, ((void)v5).length);
            arg0.cfr_renamed_1219(byArray6, 0);
            void v6 = arg3;
            System.arraycopy(byArray6, 0, v6, n2 * ++n, Math.min(n2, ((void)v6).length - n2 * n));
            n4 = n;
        }
    }
}

