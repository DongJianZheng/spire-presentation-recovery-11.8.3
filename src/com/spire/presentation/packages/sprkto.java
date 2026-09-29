/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprkto {
    public String cfr_renamed_0;
    public static final int cfr_renamed_1 = 16;
    public long cfr_renamed_2;
    public long cfr_renamed_3;
    public int cfr_renamed_4;

    public static int cfr_renamed_18081(byte[] byArray) {
        byte[] arg0;
        return sprkto.cfr_renamed_18655(arg0, 0, arg0.length);
    }

    public static int cfr_renamed_18655(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = 0;
        int n9 = arg1;
        int n10 = arg2 / 4;
        int n11 = n7 = 0;
        while (n11 < n10) {
            int n12 = arg0[n9] & 0xFF;
            n6 = n12;
            int n13 = arg0[++n9] & 0xFF;
            n5 = n13;
            int n14 = arg0[++n9] & 0xFF;
            n4 = n14;
            int n15 = arg0[++n9] & 0xFF;
            ++n9;
            n3 = n15;
            int n16 = n15 | n4 << 8 | n5 << 16 | n6 << 24;
            n8 += n16;
            n11 = ++n7;
        }
        if (n9 < arg2) {
            n2 = arg0[n9] & 0xFF;
            ++n9;
        } else {
            n2 = n6 = 0;
        }
        if (n9 < arg2) {
            n = arg0[n9] & 0xFF;
            ++n9;
        } else {
            n = 0;
        }
        n5 = n;
        n4 = n9 < arg2 ? arg0[n9] & 0xFF : 0;
        n3 = 0;
        n7 = 0 | n4 << 8 | n5 << 16 | n6 << 24;
        return n8 += n7;
    }

    public void cfr_renamed_18252(sprruo arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0.length()) {
            arg0.cfr_renamed_11594((byte)this.cfr_renamed_0.charAt(n++));
            n2 = n;
        }
        sprruo sprruo2 = arg0;
        sprkto sprkto2 = this;
        arg0.cfr_renamed_12761(this.cfr_renamed_4);
        sprruo2.cfr_renamed_15097(sprkto2.cfr_renamed_3);
        sprruo2.cfr_renamed_15097(sprkto2.cfr_renamed_2);
    }

    public static sprkto cfr_renamed_15088(sprmzo arg0) {
        sprkto sprkto2 = new sprkto();
        sprmzo sprmzo2 = arg0;
        sprkto sprkto3 = sprkto2;
        sprkto3.cfr_renamed_0 = new String(arg0.cfr_renamed_13221(4));
        sprkto2.cfr_renamed_4 = sprmzo2.cfr_renamed_12261();
        sprkto2.cfr_renamed_3 = sprmzo2.cfr_renamed_13220();
        sprkto2.cfr_renamed_2 = arg0.cfr_renamed_13220();
        return sprkto2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 5;
        int cfr_ignored_0 = 1 << 3 ^ (3 ^ 5);
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
}

