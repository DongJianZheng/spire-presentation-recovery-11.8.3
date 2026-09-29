/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdkea;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhfl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprudl;
import com.spire.presentation.packages.sprwil;

public class sprorh
extends sprkuh {
    private sprgf cfr_renamed_119;
    private int cfr_renamed_91;
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 3;
    private int cfr_renamed_2;
    public static final int cfr_renamed_3 = 2;

    @Override
    public sprbj cfr_renamed_1523(int arg0) {
        byte[] byArray = this.cfr_renamed_2280(3, arg0 /= 8);
        return new sprtpk(byArray, 0, arg0);
    }

    @Override
    public sprbj cfr_renamed_1518(int arg0, int arg1) {
        sprorh sprorh2 = this;
        byte[] byArray = sprorh2.cfr_renamed_2280(1, arg0 /= 8);
        byte[] byArray2 = sprorh2.cfr_renamed_2280(2, arg1 /= 8);
        return new sprkpk(new sprtpk(byArray, 0, arg0), byArray2, 0, arg1);
    }

    public sprorh(sprgf arg0) {
        this.cfr_renamed_119 = arg0;
        if (this.cfr_renamed_119 instanceof sprudl) {
            sprorh sprorh2 = this;
            sprorh2.cfr_renamed_91 = 16;
            sprorh2.cfr_renamed_2 = 64;
            return;
        }
        if (arg0 instanceof sprwil) {
            sprorh sprorh3 = this;
            sprorh3.cfr_renamed_91 = 20;
            sprorh3.cfr_renamed_2 = 64;
            return;
        }
        if (arg0 instanceof sprhfl) {
            sprorh sprorh4 = this;
            sprorh4.cfr_renamed_91 = 20;
            sprorh4.cfr_renamed_2 = 64;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdkea.cfr_renamed_9("Lxot{e(")).append(arg0.cfr_renamed_1315()).append(sprogb.cfr_renamed_9("q`?f$e!z#a4q")).toString());
    }

    private /* synthetic */ void cfr_renamed_2281(byte[] arg0, int arg1, byte[] arg2) {
        int n;
        int n2 = (arg2[arg2.length - 1] & 0xFF) + (arg0[arg1 + arg2.length - 1] & 0xFF) + 1;
        arg0[arg1 + arg2.length - 1] = (byte)n2;
        n2 >>>= 8;
        int n3 = n = arg2.length - 2;
        while (n3 >= 0) {
            int n4 = n2 += (arg2[n] & 0xFF) + (arg0[arg1 + n] & 0xFF);
            arg0[arg1 + n] = (byte)n4;
            n2 = n4 >>> 8;
            n3 = --n;
        }
    }

    @Override
    public sprbj cfr_renamed_249(int arg0) {
        byte[] byArray = this.cfr_renamed_2280(1, arg0 /= 8);
        return new sprtpk(byArray, 0, arg0);
    }

    private /* synthetic */ byte[] cfr_renamed_2280(int arg0, int arg1) {
        int n;
        byte[] byArray;
        byte[] byArray2;
        int n2;
        byte[] byArray3 = new byte[this.cfr_renamed_2];
        byte[] byArray4 = new byte[arg1];
        int n3 = n2 = 0;
        while (n3 != byArray3.length) {
            byArray3[n2++] = (byte)arg0;
            n3 = n2;
        }
        if (this.cfr_renamed_2 != null && ((int)this.cfr_renamed_2).length != 0) {
            int n4;
            sprorh sprorh2 = this;
            byArray2 = new byte[sprorh2.cfr_renamed_2 * ((((int)sprorh2.cfr_renamed_2).length + this.cfr_renamed_2 - 1) / this.cfr_renamed_2)];
            int n5 = n4 = 0;
            while (n5 != byArray2.length) {
                int n6 = n4++;
                byArray2[n6] = this.cfr_renamed_2[n6 % ((int)this.cfr_renamed_2).length];
                n5 = n4;
            }
        } else {
            byArray2 = new byte[]{};
        }
        if (this.cfr_renamed_3 != null && ((int)this.cfr_renamed_3).length != 0) {
            int n7;
            sprorh sprorh3 = this;
            byArray = new byte[sprorh3.cfr_renamed_2 * ((((int)sprorh3.cfr_renamed_3).length + this.cfr_renamed_2 - 1) / this.cfr_renamed_2)];
            int n8 = n7 = 0;
            while (n8 != byArray.length) {
                int n9 = n7++;
                byArray[n9] = this.cfr_renamed_3[n9 % ((int)this.cfr_renamed_3).length];
                n8 = n7;
            }
        } else {
            byArray = new byte[]{};
        }
        byte[] byArray5 = new byte[byArray2.length + byArray.length];
        System.arraycopy(byArray2, 0, byArray5, 0, byArray2.length);
        System.arraycopy(byArray, 0, byArray5, byArray2.length, byArray.length);
        byte[] byArray6 = new byte[this.cfr_renamed_2];
        int n10 = (arg1 + this.cfr_renamed_91 - 1) / this.cfr_renamed_91;
        int n11 = n = 1;
        while (n11 <= n10) {
            sprorh sprorh4 = this;
            byte[] byArray7 = new byte[sprorh4.cfr_renamed_91];
            sprorh4.cfr_renamed_119.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_119.cfr_renamed_1197(byArray5, 0, byArray5.length);
            this.cfr_renamed_119.cfr_renamed_1219(byArray7, 0);
            int n12 = 1;
            int n13 = n12;
            while (n13 != this.cfr_renamed_4) {
                this.cfr_renamed_119.cfr_renamed_1197(byArray7, 0, byArray7.length);
                this.cfr_renamed_119.cfr_renamed_1219(byArray7, 0);
                n13 = ++n12;
            }
            int n14 = n12 = 0;
            while (n14 != byArray6.length) {
                byte by = byArray7[n12 % byArray7.length];
                byArray6[n] = by;
                n14 = ++n12;
            }
            int n15 = n12 = 0;
            while (n15 != byArray5.length / this.cfr_renamed_2) {
                sprorh sprorh5 = this;
                sprorh5.cfr_renamed_2281(byArray5, ++n12 * sprorh5.cfr_renamed_2, byArray6);
                n15 = n12;
            }
            if (n == n10) {
                System.arraycopy(byArray7, 0, byArray4, (n - 1) * this.cfr_renamed_91, byArray4.length - (n - 1) * this.cfr_renamed_91);
            } else {
                System.arraycopy(byArray7, 0, byArray4, (n - 1) * this.cfr_renamed_91, byArray7.length);
            }
            n11 = ++n;
        }
        return byArray4;
    }
}

