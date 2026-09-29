/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spruc;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprbdd
extends FilterInputStream {
    public spruc cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 2 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 2 << 1;
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
    public int read() throws IOException {
        int n = this.in.read();
        if (n >= 0) {
            this.cfr_renamed_4.cfr_renamed_1221((byte)n);
        }
        return n;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n = this.in.read(arg0, arg1, arg2);
        if (n >= 0) {
            this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, n);
        }
        return n;
    }

    public spruc cfr_renamed_1472() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprbdd(InputStream inputStream, spruc spruc2) {
        super((InputStream)arg0);
        void arg0;
        this.cfr_renamed_4 = spruc2;
    }
}

