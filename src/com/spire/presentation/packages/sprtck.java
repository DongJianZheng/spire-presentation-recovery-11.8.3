/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Mac;

public final class sprtck
extends OutputStream {
    private Mac cfr_renamed_4;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.update(arg0, arg1, arg2);
    }

    public byte[] cfr_renamed_1472() {
        return this.cfr_renamed_4.doFinal();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ 4;
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

    public sprtck(Mac mac) {
        this.cfr_renamed_4 = mac;
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.update((byte)arg0);
    }
}

