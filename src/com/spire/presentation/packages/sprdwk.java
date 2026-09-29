/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import java.io.IOException;
import java.io.OutputStream;

public class sprdwk
extends OutputStream {
    public spraq cfr_renamed_4;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1221((byte)arg0);
    }

    public byte[] cfr_renamed_1472() {
        sprdwk sprdwk2 = this;
        byte[] byArray = new byte[sprdwk2.cfr_renamed_4.cfr_renamed_2404()];
        sprdwk2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public sprdwk(spraq spraq2) {
        this.cfr_renamed_4 = spraq2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = 5 << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 3 ^ (2 ^ 5);
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

