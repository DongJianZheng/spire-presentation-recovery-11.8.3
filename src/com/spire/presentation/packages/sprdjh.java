/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcep;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprdjh
extends InputStream {
    public int[] cfr_renamed_1;
    public InputStream cfr_renamed_2;
    public int cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    @Override
    public void close() throws IOException {
        this.cfr_renamed_2.close();
    }

    static {
        int n;
        cfr_renamed_4 = new byte[128];
        int n2 = n = 65;
        while (n2 <= 90) {
            int n3 = n++;
            sprdjh.cfr_renamed_4[n3] = (byte)(n3 - 65);
            n2 = n;
        }
        int n4 = n = 97;
        while (n4 <= 122) {
            int n5 = n++;
            sprdjh.cfr_renamed_4[n5] = (byte)(n5 - 97 + 26);
            n4 = n;
        }
        int n6 = n = 48;
        while (n6 <= 57) {
            int n7 = n++;
            sprdjh.cfr_renamed_4[n7] = (byte)(n7 - 48 + 52);
            n6 = n;
        }
        sprdjh.cfr_renamed_4[43] = 62;
        sprdjh.cfr_renamed_4[47] = 63;
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_3 > 2) {
            int n = this.cfr_renamed_8529();
            if (n < 0) {
                return -1;
            }
            sprdjh sprdjh2 = this;
            int n2 = sprdjh2.cfr_renamed_8530();
            int n3 = sprdjh2.cfr_renamed_8530();
            int n4 = sprdjh2.cfr_renamed_8530();
            sprdjh2.cfr_renamed_3 = sprdjh2.cfr_renamed_8531(n, n2, n3, n4, this.cfr_renamed_1);
        }
        return this.cfr_renamed_1[this.cfr_renamed_3++];
    }

    @Override
    public int available() throws IOException {
        return 0;
    }

    private /* synthetic */ int cfr_renamed_8530() throws IOException {
        int n;
        block3: while (true) {
            n = this.cfr_renamed_2.read();
            switch (n) {
                case 9: 
                case 32: {
                    continue block3;
                }
            }
            break;
        }
        return n;
    }

    private /* synthetic */ int cfr_renamed_8529() throws IOException {
        int n;
        block3: while (true) {
            n = this.cfr_renamed_2.read();
            switch (n) {
                case 9: 
                case 10: 
                case 13: 
                case 32: {
                    continue block3;
                }
            }
            break;
        }
        return n;
    }

    public sprdjh(InputStream inputStream) {
        sprdjh sprdjh2 = this;
        this.cfr_renamed_1 = new int[3];
        sprdjh2.cfr_renamed_3 = 3;
        sprdjh2.cfr_renamed_2 = inputStream;
    }

    private /* synthetic */ int cfr_renamed_8531(int arg0, int arg1, int arg2, int arg3, int[] arg4) throws EOFException {
        if (arg3 < 0) {
            throw new EOFException(sprcep.cfr_renamed_9("aaqwdjw{qk4jzk4`r/rfxj4fz/u}y`fjp/g{fjub:"));
        }
        if (arg2 == 61) {
            int n = cfr_renamed_4[arg0] & 0xFF;
            int n2 = cfr_renamed_4[arg1] & 0xFF;
            arg4[2] = (n << 2 | n2 >> 4) & 0xFF;
            return 2;
        }
        if (arg3 == 61) {
            byte by = cfr_renamed_4[arg0];
            byte by2 = cfr_renamed_4[arg1];
            byte by3 = cfr_renamed_4[arg2];
            arg4[1] = (by << 2 | by2 >> 4) & 0xFF;
            arg4[2] = (by2 << 4 | by3 >> 2) & 0xFF;
            return 1;
        }
        byte by = cfr_renamed_4[arg0];
        byte by4 = cfr_renamed_4[arg1];
        byte by5 = cfr_renamed_4[arg2];
        byte by6 = cfr_renamed_4[arg3];
        arg4[0] = (by << 2 | by4 >> 4) & 0xFF;
        arg4[1] = (by4 << 4 | by5 >> 2) & 0xFF;
        arg4[2] = (by5 << 6 | by6) & 0xFF;
        return 0;
    }
}

