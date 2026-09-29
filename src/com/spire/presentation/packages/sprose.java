/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.OutputStream;

public abstract class sprose
extends OutputStream {
    @Override
    public void write(int arg0) throws IOException {
        byte[] byArray = new byte[1];
        byArray[0] = (byte)arg0;
        byte[] byArray2 = byArray;
        this.write(byArray2, 0, 1);
    }

    @Override
    public void close() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 1;
        int cfr_ignored_0 = 5 << 4 ^ 3;
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 << 2 ^ 1);
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

    @Override
    public void flush() {
    }
}

