/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprwtb;
import java.math.BigInteger;

public class sprizd {
    public byte[] cfr_renamed_2500(BigInteger arg0, int arg1) {
        byte[] byArray = arg0.toByteArray();
        if (arg1 < byArray.length) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, byArray.length - byArray2.length, byArray2, 0, byArray2.length);
            return byArray2;
        }
        if (arg1 > byArray.length) {
            byte[] byArray3 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray3, byArray3.length - byArray.length, byArray.length);
            return byArray3;
        }
        return byArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5);
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

    public int cfr_renamed_2321(sprpib arg0) {
        return (arg0.cfr_renamed_1938() + 7) / 8;
    }

    public int cfr_renamed_4435(sprwtb arg0) {
        return (arg0.cfr_renamed_1938() + 7) / 8;
    }
}

