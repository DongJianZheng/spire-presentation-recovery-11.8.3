/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdtd;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprreha;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprhyk
implements sprvv {
    public byte cfr_renamed_0;
    public byte cfr_renamed_1;
    public byte[] cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3464(byte[] byArray, byte[] byArray2) {
        byte by;
        int n;
        sprhyk sprhyk2 = this;
        sprhyk2.cfr_renamed_1 = 0;
        sprhyk2.cfr_renamed_3 = new byte[256];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = (byte)n3;
            n2 = n;
        }
        int n4 = n = 0;
        while (n4 < 768) {
            void arg0;
            sprhyk sprhyk3 = this;
            void v5 = arg0;
            this.cfr_renamed_1 = sprhyk3.cfr_renamed_3[sprhyk3.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v5[n % ((void)v5).length] & 0xFF];
            sprhyk sprhyk4 = this;
            by = sprhyk4.cfr_renamed_3[n & 0xFF];
            sprhyk sprhyk5 = this;
            sprhyk4.cfr_renamed_3[n & 0xFF] = sprhyk5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprhyk5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 768) {
            void arg1;
            sprhyk sprhyk6 = this;
            void v10 = arg1;
            this.cfr_renamed_1 = sprhyk6.cfr_renamed_3[sprhyk6.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v10[n % ((void)v10).length] & 0xFF];
            sprhyk sprhyk7 = this;
            by = sprhyk7.cfr_renamed_3[n & 0xFF];
            sprhyk sprhyk8 = this;
            sprhyk7.cfr_renamed_3[n & 0xFF] = sprhyk8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprhyk8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n5 = ++n;
        }
        this.cfr_renamed_0 = 0;
    }

    @Override
    public void cfr_renamed_41() {
        sprhyk sprhyk2 = this;
        sprhyk2.cfr_renamed_3464(this.cfr_renamed_4, sprhyk2.cfr_renamed_2);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprbj sprbj2;
        int n;
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprdtd.cfr_renamed_9("}E{K\u000baEa_([iYiFm_mY{\u000be^{_(BfHd^lN(Jf\u000bA}"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(sprreha.cfr_renamed_9("\u000f!\t/y\u00057\u0005-L)\r+\r4\t-\t+\u001fy\u0001,\u001f-L0\u0002:\u0000,\b<L8L2\t "));
        }
        sprtpk sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
        this.cfr_renamed_2 = sprkpk2.cfr_renamed_1205();
        if (this.cfr_renamed_2 == null || this.cfr_renamed_2.length < 1 || this.cfr_renamed_2.length > 768) {
            throw new IllegalArgumentException(sprdtd.cfr_renamed_9("^fXh(YmZ}BzN{\u000b9\u000b|D(\u001c>\u0013(Iq_mX(Dn\u000bA}"));
        }
        sprhyk sprhyk2 = this;
        sprhyk2.cfr_renamed_4 = sprtpk2.cfr_renamed_1521();
        sprhyk2.cfr_renamed_3464(sprhyk2.cfr_renamed_4, this.cfr_renamed_2);
        String string = this.cfr_renamed_1315();
        if (this.cfr_renamed_4.length >= 32) {
            n = 256;
            sprbj2 = arg1;
        } else {
            n = this.cfr_renamed_4.length * 8;
            sprbj2 = arg1;
        }
        sprybl.cfr_renamed_9170(new sprfdl(string, n, sprbj2, sprlrk.cfr_renamed_9915(arg0)));
    }

    public sprhyk() {
        sprhyk sprhyk2 = this;
        this.cfr_renamed_0 = 0;
        sprhyk2.cfr_renamed_3 = null;
        sprhyk2.cfr_renamed_1 = 0;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprreha.cfr_renamed_9(":\u0014<\u001a");
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        sprhyk sprhyk2 = this;
        sprhyk sprhyk3 = this;
        sprhyk sprhyk4 = this;
        sprhyk2.cfr_renamed_1 = sprhyk2.cfr_renamed_3[sprhyk3.cfr_renamed_1 + sprhyk4.cfr_renamed_3[sprhyk4.cfr_renamed_0 & 0xFF] & 0xFF];
        sprhyk sprhyk5 = this;
        byte by = sprhyk3.cfr_renamed_3[sprhyk5.cfr_renamed_3[sprhyk5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] & 0xFF] + 1 & 0xFF];
        byte by2 = sprhyk2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF];
        sprhyk sprhyk6 = this;
        sprhyk2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF] = sprhyk6.cfr_renamed_3[sprhyk6.cfr_renamed_1 & 0xFF];
        sprhyk2.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by2;
        sprhyk2.cfr_renamed_0 = (byte)(sprhyk2.cfr_renamed_0 + 1 & 0xFF);
        return (byte)(arg0 ^ by);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprdtd.cfr_renamed_9("aEx^|\u000bj^nMmY(_gD(X`Dz_"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprreha.cfr_renamed_9("6\u0019-\u001c,\u0018y\u000e,\n?\t+L-\u00036L*\u00046\u001e-"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            sprhyk sprhyk2 = this;
            sprhyk sprhyk3 = this;
            sprhyk sprhyk4 = this;
            sprhyk2.cfr_renamed_1 = sprhyk2.cfr_renamed_3[sprhyk3.cfr_renamed_1 + sprhyk4.cfr_renamed_3[sprhyk4.cfr_renamed_0 & 0xFF] & 0xFF];
            sprhyk sprhyk5 = this;
            byte by = sprhyk3.cfr_renamed_3[sprhyk5.cfr_renamed_3[sprhyk5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] & 0xFF] + 1 & 0xFF];
            byte by2 = sprhyk2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF];
            sprhyk sprhyk6 = this;
            sprhyk2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF] = sprhyk6.cfr_renamed_3[sprhyk6.cfr_renamed_1 & 0xFF];
            sprhyk2.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by2;
            sprhyk2.cfr_renamed_0 = (byte)(sprhyk2.cfr_renamed_0 + 1 & 0xFF);
            int n3 = n + arg4;
            byte by3 = (byte)(arg0[n + arg1] ^ by);
            arg3[n3] = by3;
            n2 = ++n;
        }
        return arg2;
    }
}

