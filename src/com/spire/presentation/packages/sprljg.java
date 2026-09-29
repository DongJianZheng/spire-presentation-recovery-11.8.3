/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprvm;
import java.io.IOException;
import java.io.OutputStream;

public class sprljg
extends OutputStream {
    private sprvm cfr_renamed_4;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public sprljg(sprvm sprvm2) {
        this.cfr_renamed_4 = sprvm2;
    }

    public byte[] cfr_renamed_79() throws sprmml {
        return this.cfr_renamed_4.cfr_renamed_1329();
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1221((byte)arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = 5 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 3 << 3;
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
    public void write(byte[] arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    public boolean cfr_renamed_1435(byte[] arg0) {
        return this.cfr_renamed_4.cfr_renamed_1328(arg0);
    }
}

