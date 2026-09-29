/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprxfd;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;

public class sprfsc
implements sprmc {
    public byte[] cfr_renamed_119;
    public sprpj cfr_renamed_91;
    public int cfr_renamed_0;
    public byte[] cfr_renamed_1;
    public sprsc cfr_renamed_2;
    public sprpj cfr_renamed_3;
    public int cfr_renamed_4;

    @Override
    public int cfr_renamed_2775(int arg0) {
        return arg0 - this.cfr_renamed_0 - this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_3067(long arg0, short arg1, int arg2) throws IOException {
        byte[] byArray = new byte[13];
        sprzsc.cfr_renamed_2708(arg0, byArray, 0);
        sprzsc.cfr_renamed_2693(arg1, byArray, 8);
        sprzsc.cfr_renamed_2702(this.cfr_renamed_2.cfr_renamed_2683(), byArray, 9);
        sprzsc.cfr_renamed_2679(arg2, byArray, 11);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_2771(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        byte[] byArray = new byte[this.cfr_renamed_1.length + this.cfr_renamed_4];
        System.arraycopy(this.cfr_renamed_1, 0, byArray, 0, this.cfr_renamed_1.length);
        sprzsc.cfr_renamed_2708(arg0, byArray, this.cfr_renamed_1.length);
        int n = arg3;
        int n2 = arg4;
        sprfsc sprfsc2 = this;
        int n3 = sprfsc2.cfr_renamed_3.cfr_renamed_1202(n2);
        byte[] byArray2 = new byte[sprfsc2.cfr_renamed_4 + n3];
        System.arraycopy(byArray, this.cfr_renamed_1.length, byArray2, 0, this.cfr_renamed_4);
        sprfsc sprfsc3 = this;
        int n4 = sprfsc3.cfr_renamed_4;
        byte[] byArray3 = sprfsc3.cfr_renamed_3067(arg0, arg1, n2);
        sprxfd sprxfd2 = new sprxfd(null, 8 * this.cfr_renamed_0, byArray, byArray3);
        try {
            this.cfr_renamed_3.cfr_renamed_1217(true, sprxfd2);
            n4 += this.cfr_renamed_3.cfr_renamed_505(arg2, n, n2, byArray2, n4);
            int n5 = n4;
            n4 = n5 + this.cfr_renamed_3.cfr_renamed_1219(byArray2, n5);
        }
        catch (Exception exception) {
            throw new spryad(80);
        }
        if (n4 != byArray2.length) {
            throw new spryad(80);
        }
        return byArray2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_2776(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        if (this.cfr_renamed_2775(arg4) < 0) {
            throw new spryad(50);
        }
        byte[] byArray = new byte[this.cfr_renamed_119.length + this.cfr_renamed_4];
        System.arraycopy(this.cfr_renamed_119, 0, byArray, 0, this.cfr_renamed_119.length);
        System.arraycopy(arg2, arg3, byArray, this.cfr_renamed_119.length, this.cfr_renamed_4);
        int n = arg3 + this.cfr_renamed_4;
        int n2 = arg4 - this.cfr_renamed_4;
        sprfsc sprfsc2 = this;
        int n3 = sprfsc2.cfr_renamed_91.cfr_renamed_1202(n2);
        byte[] byArray2 = new byte[n3];
        int n4 = 0;
        byte[] byArray3 = sprfsc2.cfr_renamed_3067(arg0, arg1, n3);
        sprxfd sprxfd2 = new sprxfd(null, 8 * this.cfr_renamed_0, byArray, byArray3);
        try {
            this.cfr_renamed_91.cfr_renamed_1217(false, sprxfd2);
            n4 += this.cfr_renamed_91.cfr_renamed_505(arg2, n, n2, byArray2, n4);
            int n5 = n4;
            n4 = n5 + this.cfr_renamed_91.cfr_renamed_1219(byArray2, n5);
        }
        catch (Exception exception) {
            throw new spryad(20);
        }
        if (n4 != byArray2.length) {
            throw new spryad(80);
        }
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public sprfsc(sprsc sprsc2, sprpj sprpj2, sprpj sprpj3, int n, int n2) throws IOException {
        int n3;
        sprnld sprnld2;
        sprnld sprnld3;
        void arg1;
        void arg2;
        void arg3;
        void arg4;
        void arg0;
        if (!sprzsc.cfr_renamed_2631(sprsc2)) {
            throw new spryad(80);
        }
        sprfsc sprfsc2 = this;
        sprfsc2.cfr_renamed_2 = arg0;
        sprfsc2.cfr_renamed_0 = arg4;
        this.cfr_renamed_4 = 8;
        int n4 = 4;
        int n5 = 2 * arg3 + 2 * n4;
        byte[] byArray = sprzsc.cfr_renamed_2753((sprsc)arg0, n5);
        int n6 = 0;
        sprnld sprnld4 = new sprnld(byArray, n6, (int)arg3);
        sprnld sprnld5 = new sprnld(byArray, n6 += arg3, (int)arg3);
        int n7 = n6 += arg3;
        byte[] byArray2 = sprzra.cfr_renamed_533(byArray, n7, n7 + n4);
        byte[] byArray3 = sprzra.cfr_renamed_533(byArray, n6 += n4, n6 + n4);
        if ((n6 += n4) != n5) {
            throw new spryad(80);
        }
        if (arg0.cfr_renamed_2770()) {
            sprfsc sprfsc3 = this;
            sprfsc sprfsc4 = this;
            sprfsc4.cfr_renamed_3 = arg2;
            sprfsc4.cfr_renamed_91 = arg1;
            sprfsc3.cfr_renamed_1 = byArray3;
            sprfsc3.cfr_renamed_119 = byArray2;
            sprnld3 = sprnld5;
            sprnld2 = sprnld4;
            n3 = n4;
        } else {
            sprfsc sprfsc5 = this;
            this.cfr_renamed_3 = arg1;
            sprfsc5.cfr_renamed_91 = arg2;
            sprfsc5.cfr_renamed_1 = byArray2;
            this.cfr_renamed_119 = byArray3;
            sprnld3 = sprnld4;
            sprnld2 = sprnld5;
            n3 = n4;
        }
        byte[] byArray4 = new byte[n3 + this.cfr_renamed_4];
        sprfsc sprfsc6 = this;
        sprfsc6.cfr_renamed_3.cfr_renamed_1217(true, new sprxfd(sprnld3, 8 * arg4, byArray4));
        sprfsc6.cfr_renamed_91.cfr_renamed_1217(false, new sprxfd(sprnld2, 8 * arg4, byArray4));
    }
}

