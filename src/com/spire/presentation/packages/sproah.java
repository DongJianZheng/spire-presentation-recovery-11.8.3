/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralo;
import com.spire.presentation.packages.sprtqg;

public class sproah {
    public static byte[] cfr_renamed_7901(byte[] arg0) {
        return sproah.cfr_renamed_7902(arg0, true);
    }

    private /* synthetic */ sproah() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
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

    public static byte[] cfr_renamed_7902(byte[] arg0, boolean arg1) {
        int n;
        int n2 = arg0.length;
        int n3 = (n2 >>> 3) + 1 << 3;
        if (arg1) {
            n3 = Math.max(40, n3);
        }
        byte by = (byte)(n3 - n2);
        byte[] byArray = new byte[n3];
        System.arraycopy(arg0, 0, byArray, 0, n2);
        int n4 = n = n2;
        while (n4 < n3) {
            byArray[n++] = by;
            n4 = n;
        }
        return byArray;
    }

    public static byte[] cfr_renamed_7903(byte[] arg0) throws sprtqg {
        int n;
        int n2 = arg0.length;
        byte by = arg0[n2 - 1];
        int n3 = by & 0xFF;
        int n4 = n2 - n3;
        int n5 = n4 - 1;
        int n6 = 0;
        int n7 = n = 0;
        while (n7 < n2) {
            int n8 = n5 - n >> 31;
            int n9 = by ^ arg0[n];
            n6 |= n9 & n8;
            n7 = ++n;
        }
        n6 |= n2 & 7;
        if ((n6 |= 40 - n2 >> 31) != 0) {
            throw new sprtqg(spralo.cfr_renamed_9("\u000bR\r\u0013\u0019R\rW\u0000]\u000e\u0013\u000f\\\u001c]\r\u0013\u0000]I@\f@\u001aZ\u0006]IW\bG\b"));
        }
        byte[] byArray = new byte[n4];
        System.arraycopy(arg0, 0, byArray, 0, n4);
        return byArray;
    }
}

