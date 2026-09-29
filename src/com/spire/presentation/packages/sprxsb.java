/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprywa;

public abstract class sprxsb {
    public byte[] cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public int cfr_renamed_4;

    public static byte[] cfr_renamed_1606(char[] arg0) {
        if (arg0 != null) {
            int n;
            byte[] byArray = new byte[arg0.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n++;
                byArray[n3] = (byte)arg0[n3];
                n2 = n;
            }
            return byArray;
        }
        return new byte[0];
    }

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_1601() {
        return this.cfr_renamed_2;
    }

    public abstract sprt cfr_renamed_1518(int var1, int var2);

    public int cfr_renamed_1478() {
        return this.cfr_renamed_4;
    }

    public static byte[] cfr_renamed_1516(char[] arg0) {
        if (arg0 != null && arg0.length > 0) {
            int n;
            byte[] byArray = new byte[(arg0.length + 1) * 2];
            int n2 = n = 0;
            while (n2 != arg0.length) {
                byArray[n * 2] = (byte)(arg0[n] >>> 8);
                int n3 = n * 2 + 1;
                byte by = (byte)arg0[n];
                byArray[n3] = by;
                n2 = ++n;
            }
            return byArray;
        }
        return new byte[0];
    }

    public static byte[] cfr_renamed_2400(char[] arg0) {
        if (arg0 != null) {
            return sprywa.cfr_renamed_432(arg0);
        }
        return new byte[0];
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1515(byte[] byArray, byte[] byArray2, int n) {
        void arg1;
        void arg0;
        sprxsb sprxsb2 = this;
        this.cfr_renamed_2 = arg0;
        sprxsb2.cfr_renamed_3 = arg1;
        sprxsb2.cfr_renamed_4 = n;
    }

    public abstract sprt cfr_renamed_1523(int var1);

    public abstract sprt cfr_renamed_249(int var1);
}

