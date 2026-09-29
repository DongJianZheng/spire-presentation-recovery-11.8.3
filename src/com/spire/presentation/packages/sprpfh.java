/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

public class sprpfh {
    public byte[] cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    public int cfr_renamed_4;

    public void cfr_renamed_1235() {
        this.cfr_renamed_4 += this.cfr_renamed_4 % 8;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_8125(OutputStream outputStream) throws IOException {
        void arg0;
        sprpfh sprpfh2 = this;
        int n = (this.cfr_renamed_4 + sprpfh2.cfr_renamed_4 % 8) / 8;
        arg0.write(this.cfr_renamed_2, 0, n);
        outputStream.flush();
        sprpfh2.cfr_renamed_8486();
        return n;
    }

    public void cfr_renamed_8486() {
        sproze.cfr_renamed_3408(this.cfr_renamed_2);
        this.cfr_renamed_4 = 0;
    }

    public void cfr_renamed_8124(int arg0) {
        int n;
        boolean bl = false;
        int n2 = n = 4;
        while (n2 >= 0) {
            if (!bl && (arg0 & 0xFE000000) != 0) {
                bl = true;
            }
            if (bl) {
                this.cfr_renamed_8121(n).cfr_renamed_8487(arg0, 32, 7);
            }
            arg0 <<= 7;
            n2 = --n;
        }
    }

    public sprpfh cfr_renamed_8123(long arg0, int arg1) {
        int n;
        int n2 = n = arg1 - 1;
        while (n2 >= 0) {
            int n3 = (arg0 & 1L << n) > 0L ? 1 : 0;
            this.cfr_renamed_8121(n3);
            n2 = --n;
        }
        return this;
    }

    public sprpfh cfr_renamed_8121(int arg0) {
        sprpfh sprpfh2;
        if (this.cfr_renamed_4 / 8 >= this.cfr_renamed_2.length) {
            byte[] byArray = new byte[this.cfr_renamed_2.length + 4];
            sprpfh sprpfh3 = this;
            System.arraycopy(sprpfh3.cfr_renamed_2, 0, byArray, 0, this.cfr_renamed_4 / 8);
            sproze.cfr_renamed_3408(sprpfh3.cfr_renamed_2);
            sprpfh3.cfr_renamed_2 = byArray;
        }
        if (arg0 == 0) {
            sprpfh sprpfh4 = this;
            byte[] byArray = this.cfr_renamed_2;
            sprpfh2 = sprpfh4;
            int n = sprpfh4.cfr_renamed_4 / 8;
            byArray[n] = (byte)(byArray[n] & ~cfr_renamed_3[this.cfr_renamed_4 % 8]);
        } else {
            sprpfh sprpfh5 = this;
            sprpfh2 = sprpfh5;
            byte[] byArray = sprpfh5.cfr_renamed_2;
            int n = sprpfh5.cfr_renamed_4 / 8;
            byArray[n] = (byte)(byArray[n] | cfr_renamed_3[this.cfr_renamed_4 % 8]);
        }
        ++sprpfh2.cfr_renamed_4;
        return this;
    }

    public sprpfh() {
        sprpfh sprpfh2 = this;
        sprpfh2.cfr_renamed_2 = new byte[1];
        sprpfh2.cfr_renamed_4 = 0;
    }

    public sprpfh cfr_renamed_8487(long arg0, int arg1, int arg2) {
        int n;
        int n2 = n = arg1 - 1;
        while (n2 >= arg1 - arg2) {
            int n3 = (arg0 & 1L << n) != 0L ? 1 : 0;
            this.cfr_renamed_8121(n3);
            n2 = --n;
        }
        return this;
    }

    static {
        byte[] byArray = new byte[8];
        byArray[0] = -128;
        byArray[1] = 64;
        byArray[2] = 32;
        byArray[3] = 16;
        byArray[4] = 8;
        byArray[5] = 4;
        byArray[6] = 2;
        byArray[7] = 1;
        cfr_renamed_3 = byArray;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_624(OutputStream outputStream) throws IOException {
        void arg0;
        sprpfh sprpfh2 = this;
        int n = (sprpfh2.cfr_renamed_4 + sprpfh2.cfr_renamed_4 % 8) / 8;
        arg0.write(this.cfr_renamed_2, 0, n);
        outputStream.flush();
        return n;
    }

    public void cfr_renamed_8488(BigInteger arg0) {
        int n;
        int n2 = (arg0.bitLength() + arg0.bitLength() % 8) / 8;
        BigInteger bigInteger = BigInteger.valueOf(254L).shiftLeft(n2 * 8);
        boolean bl = false;
        int n3 = n = n2;
        while (n3 >= 0) {
            if (!bl && arg0.and(bigInteger).compareTo(BigInteger.ZERO) != 0) {
                bl = true;
            }
            if (bl) {
                BigInteger bigInteger2 = arg0.and(bigInteger).shiftRight(8 * n2 - 8);
                this.cfr_renamed_8121(n).cfr_renamed_8487(bigInteger2.intValue(), 8, 7);
            }
            arg0 = arg0.shiftLeft(7);
            n3 = --n;
        }
    }
}

