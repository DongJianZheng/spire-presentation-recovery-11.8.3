/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprncg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprydg;

public class sprvyf {
    private final int cfr_renamed_3;
    private final sprncg cfr_renamed_4;

    public void cfr_renamed_5984(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        int n;
        byte by = 0;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg5) {
            if (n2 == 0) {
                by = arg0[arg1];
                n2 += 8;
                ++arg1;
            }
            arg3[arg4++] = by >>> (n2 -= this.cfr_renamed_4.cfr_renamed_3) & arg2 - 1;
            n3 = ++n;
        }
    }

    public sprvyf(sprncg arg0) {
        sprvyf sprvyf2 = this;
        sprvyf sprvyf3 = this;
        sprvyf2.cfr_renamed_4 = arg0;
        sprvyf2.cfr_renamed_3 = sprvyf3.cfr_renamed_4.cfr_renamed_119;
    }

    public byte[] cfr_renamed_5985(byte[] arg0, byte[] arg1, byte[] arg2, sprydg arg3) {
        int n;
        int n2;
        sprydg sprydg2 = new sprydg(arg3);
        int[] nArray = new int[this.cfr_renamed_4.cfr_renamed_2];
        sprvyf sprvyf2 = this;
        sprvyf2.cfr_renamed_5984(arg0, 0, sprvyf2.cfr_renamed_3, nArray, 0, this.cfr_renamed_4.cfr_renamed_4);
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_4.cfr_renamed_4) {
            int n5 = nArray[n2];
            n3 += this.cfr_renamed_3 - 1 - n5;
            n4 = ++n2;
        }
        if (this.cfr_renamed_4.cfr_renamed_3 % 8 != 0) {
            n3 <<= 8 - this.cfr_renamed_4.cfr_renamed_132 * this.cfr_renamed_4.cfr_renamed_3 % 8;
        }
        sprvyf sprvyf3 = this;
        n2 = (sprvyf3.cfr_renamed_4.cfr_renamed_132 * this.cfr_renamed_4.cfr_renamed_3 + 7) / 8;
        sprvyf sprvyf4 = this;
        sprvyf4.cfr_renamed_5984(sprpxe.cfr_renamed_453(n3), 4 - n2, sprvyf4.cfr_renamed_3, nArray, this.cfr_renamed_4.cfr_renamed_4, this.cfr_renamed_4.cfr_renamed_132);
        byte[][] byArrayArray = new byte[sprvyf3.cfr_renamed_4.cfr_renamed_2][];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_4.cfr_renamed_2) {
            sprydg sprydg3 = sprydg2;
            sprydg sprydg4 = sprydg2;
            sprydg sprydg5 = sprydg2;
            sprydg2.cfr_renamed_5986(5);
            sprydg5.cfr_renamed_5987(arg3.cfr_renamed_5988());
            sprydg5.cfr_renamed_5989(n);
            sprydg4.cfr_renamed_5990(0);
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_5991(arg2, arg1, sprydg2);
            sprydg3.cfr_renamed_5986(0);
            sprydg4.cfr_renamed_5987(arg3.cfr_renamed_5988());
            sprydg3.cfr_renamed_5989(n);
            sprydg3.cfr_renamed_5990(0);
            int n7 = n;
            byte[] byArray2 = this.cfr_renamed_5964(byArray, 0, nArray[n], arg2, sprydg2);
            byArrayArray[n7] = byArray2;
            n6 = ++n;
        }
        return sproze.cfr_renamed_1120(byArrayArray);
    }

    public byte[] cfr_renamed_5992(byte[] arg0, byte[] arg1, sprydg arg2) {
        int n;
        sprydg sprydg2 = new sprydg(arg2);
        byte[][] byArrayArray = new byte[this.cfr_renamed_4.cfr_renamed_2][];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_2) {
            sprydg sprydg3;
            sprydg sprydg4 = sprydg3 = new sprydg(arg2);
            sprydg sprydg5 = sprydg3;
            sprydg3.cfr_renamed_5986(5);
            sprydg5.cfr_renamed_5987(arg2.cfr_renamed_5988());
            sprydg5.cfr_renamed_5989(n);
            sprydg4.cfr_renamed_5990(0);
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_5991(arg1, arg0, sprydg3);
            sprydg3.cfr_renamed_5986(0);
            sprydg4.cfr_renamed_5987(arg2.cfr_renamed_5988());
            sprydg3.cfr_renamed_5989(n);
            sprydg3.cfr_renamed_5990(0);
            sprvyf sprvyf2 = this;
            byArrayArray[n++] = sprvyf2.cfr_renamed_5964(byArray, 0, sprvyf2.cfr_renamed_3 - 1, arg1, sprydg3);
            n2 = n;
        }
        sprydg2.cfr_renamed_5986(1);
        sprydg2.cfr_renamed_5987(arg2.cfr_renamed_5988());
        return this.cfr_renamed_4.cfr_renamed_5993(arg1, sprydg2, sproze.cfr_renamed_1120(byArrayArray));
    }

    public byte[] cfr_renamed_5964(byte[] arg0, int arg1, int arg2, byte[] arg3, sprydg arg4) {
        int n;
        if (arg2 == 0) {
            return sproze.cfr_renamed_158(arg0);
        }
        if (arg1 + arg2 > this.cfr_renamed_3 - 1) {
            return null;
        }
        byte[] byArray = arg0;
        int n2 = n = 0;
        while (n2 < arg2) {
            arg4.cfr_renamed_5990(arg1 + n);
            byArray = this.cfr_renamed_4.cfr_renamed_5994(arg3, arg4, byArray);
            n2 = ++n;
        }
        return byArray;
    }

    public byte[] cfr_renamed_5995(byte[] arg0, byte[] arg1, byte[] arg2, sprydg arg3) {
        int n;
        int n2;
        sprydg sprydg2 = new sprydg(arg3);
        int[] nArray = new int[this.cfr_renamed_4.cfr_renamed_2];
        sprvyf sprvyf2 = this;
        sprvyf2.cfr_renamed_5984(arg1, 0, sprvyf2.cfr_renamed_3, nArray, 0, this.cfr_renamed_4.cfr_renamed_4);
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_4.cfr_renamed_4) {
            int n5 = nArray[n2];
            n3 += this.cfr_renamed_3 - 1 - n5;
            n4 = ++n2;
        }
        sprvyf sprvyf3 = this;
        sprvyf sprvyf4 = this;
        n2 = (sprvyf3.cfr_renamed_4.cfr_renamed_132 * sprvyf4.cfr_renamed_4.cfr_renamed_3 + 7) / 8;
        sprvyf3.cfr_renamed_5984(sprpxe.cfr_renamed_453(n3 <<= 8 - this.cfr_renamed_4.cfr_renamed_132 * this.cfr_renamed_4.cfr_renamed_3 % 8), 4 - n2, this.cfr_renamed_3, nArray, this.cfr_renamed_4.cfr_renamed_4, this.cfr_renamed_4.cfr_renamed_132);
        byte[] byArray = new byte[sprvyf4.cfr_renamed_4.cfr_renamed_112];
        byte[][] byArrayArray = new byte[sprvyf3.cfr_renamed_4.cfr_renamed_2][];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_4.cfr_renamed_2) {
            int n7 = n;
            arg3.cfr_renamed_5989(n);
            System.arraycopy(arg0, n7 * this.cfr_renamed_4.cfr_renamed_112, byArray, 0, this.cfr_renamed_4.cfr_renamed_112);
            sprvyf sprvyf5 = this;
            byte[] byArray2 = sprvyf5.cfr_renamed_5964(byArray, nArray[n], sprvyf5.cfr_renamed_3 - 1 - nArray[n], arg2, arg3);
            byArrayArray[n7] = byArray2;
            n6 = ++n;
        }
        sprydg2.cfr_renamed_5986(1);
        sprydg2.cfr_renamed_5987(arg3.cfr_renamed_5988());
        return this.cfr_renamed_4.cfr_renamed_5993(arg2, sprydg2, sproze.cfr_renamed_1120(byArrayArray));
    }
}

