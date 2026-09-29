/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjd;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqcd;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprvld;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;

public class sprwxc
implements sprmc {
    public sprqcd cfr_renamed_2;
    public sprsc cfr_renamed_3;
    public sprqcd cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_2776(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        byte[] byArray;
        if (this.cfr_renamed_2775(arg4) < 0) {
            throw new spryad(50);
        }
        int n = arg4 - 16;
        byte[] byArray2 = sprzra.cfr_renamed_533(arg2, arg3 + n, arg3 + arg4);
        sprwxc sprwxc2 = this;
        sprnld sprnld2 = sprwxc2.cfr_renamed_3252(sprwxc2.cfr_renamed_4, false, arg0);
        if (!sprzra.cfr_renamed_559(sprwxc2.cfr_renamed_3253(sprnld2, byArray = sprwxc2.cfr_renamed_3067(arg0, arg1, n), arg2, arg3, n), byArray2)) {
            throw new spryad(20);
        }
        byte[] byArray3 = new byte[n];
        this.cfr_renamed_4.cfr_renamed_505(arg2, arg3, n, byArray3, 0);
        return byArray3;
    }

    /*
     * WARNING - void declaration
     */
    public sprwxc(sprsc sprsc2) throws IOException {
        sprnld sprnld2;
        sprnld sprnld3;
        void arg0;
        if (!sprzsc.cfr_renamed_2631(sprsc2)) {
            throw new spryad(80);
        }
        sprwxc sprwxc2 = this;
        sprwxc2.cfr_renamed_3 = arg0;
        byte[] byArray = sprzsc.cfr_renamed_2753((sprsc)arg0, 64);
        sprnld sprnld4 = new sprnld(byArray, 0, 32);
        sprnld sprnld5 = new sprnld(byArray, 32, 32);
        sprwxc sprwxc3 = this;
        sprwxc2.cfr_renamed_2 = new sprqcd(20);
        this.cfr_renamed_4 = new sprqcd(20);
        if (arg0.cfr_renamed_2770()) {
            sprnld3 = sprnld5;
            sprnld2 = sprnld4;
        } else {
            sprnld3 = sprnld4;
            sprnld2 = sprnld5;
        }
        byte[] byArray2 = new byte[8];
        sprwxc sprwxc4 = this;
        sprwxc4.cfr_renamed_2.cfr_renamed_1217(true, new sprnjd(sprnld3, byArray2));
        sprwxc4.cfr_renamed_4.cfr_renamed_1217(false, new sprnjd(sprnld2, byArray2));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3254(spruc spruc2, byte[] byArray, int n, int n2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_1197((byte[])arg1, (int)arg2, (int)arg3);
        byte[] byArray2 = sprtsa.cfr_renamed_452((long)n2 & 0xFFFFFFFFL);
        v0.cfr_renamed_1197(byArray2, 0, byArray2.length);
    }

    @Override
    public int cfr_renamed_2775(int arg0) {
        return arg0 - 16;
    }

    public byte[] cfr_renamed_3253(sprnld arg0, byte[] arg1, byte[] arg2, int arg3, int arg4) {
        sprbjd sprbjd2;
        sprbjd sprbjd3 = sprbjd2 = new sprbjd();
        sprbjd3.cfr_renamed_1524(arg0);
        this.cfr_renamed_3254(sprbjd3, arg1, 0, arg1.length);
        sprbjd sprbjd4 = sprbjd2;
        this.cfr_renamed_3254(sprbjd4, arg2, arg3, arg4);
        byte[] byArray = new byte[sprbjd4.cfr_renamed_2404()];
        sprbjd4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public byte[] cfr_renamed_3067(long arg0, short arg1, int arg2) throws IOException {
        byte[] byArray = new byte[13];
        sprzsc.cfr_renamed_2708(arg0, byArray, 0);
        sprzsc.cfr_renamed_2693(arg1, byArray, 8);
        sprzsc.cfr_renamed_2702(this.cfr_renamed_3.cfr_renamed_2683(), byArray, 9);
        sprzsc.cfr_renamed_2679(arg2, byArray, 11);
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_2771(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        int n = arg4 + 16;
        sprwxc sprwxc2 = this;
        sprnld sprnld2 = sprwxc2.cfr_renamed_3252(sprwxc2.cfr_renamed_2, true, arg0);
        byte[] byArray = new byte[n];
        sprwxc2.cfr_renamed_2.cfr_renamed_505(arg2, arg3, arg4, byArray, 0);
        sprwxc sprwxc3 = this;
        byte[] byArray2 = sprwxc3.cfr_renamed_3067(arg0, arg1, arg4);
        byte[] byArray3 = sprwxc3.cfr_renamed_3253(sprnld2, byArray2, byArray, 0, arg4);
        System.arraycopy(byArray3, 0, byArray, arg4, byArray3.length);
        return byArray;
    }

    public sprnld cfr_renamed_3252(sprqcd arg0, boolean arg1, long arg2) {
        byte[] byArray = new byte[8];
        sprzsc.cfr_renamed_2708(arg2, byArray, 0);
        sprqcd sprqcd2 = arg0;
        sprqcd2.cfr_renamed_1217(arg1, new sprnjd(null, byArray));
        byte[] byArray2 = new byte[64];
        sprqcd2.cfr_renamed_505(byArray2, 0, byArray2.length, byArray2, 0);
        System.arraycopy(byArray2, 0, byArray2, 32, 16);
        sprnld sprnld2 = new sprnld(byArray2, 16, 32);
        sprvld.cfr_renamed_3255(sprnld2.cfr_renamed_1521());
        return sprnld2;
    }
}

