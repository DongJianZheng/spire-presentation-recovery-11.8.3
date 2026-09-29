/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvsc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;

public class sprbvc
implements sprmc {
    public sprqk cfr_renamed_91;
    public sprvsc cfr_renamed_0;
    public boolean cfr_renamed_1;
    public sprsc cfr_renamed_2;
    public sprvsc cfr_renamed_3;
    public sprqk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbvc(sprsc sprsc2, sprqk sprqk2, sprqk sprqk3, sprlc sprlc2, sprlc sprlc3, int n, boolean bl) throws IOException {
        void v6;
        sprt sprt2;
        sprt sprt3;
        void arg4;
        void arg3;
        void arg5;
        void arg2;
        void arg1;
        void arg6;
        void arg0;
        sprbvc sprbvc2 = this;
        void v1 = arg0;
        boolean bl2 = v1.cfr_renamed_2770();
        this.cfr_renamed_2 = v1;
        this.cfr_renamed_1 = arg6;
        sprbvc2.cfr_renamed_4 = arg1;
        sprbvc2.cfr_renamed_91 = arg2;
        int n2 = 2 * arg5 + arg3.cfr_renamed_1218() + arg4.cfr_renamed_1218();
        byte[] byArray = sprzsc.cfr_renamed_2753(sprsc2, n2);
        int n3 = 0;
        void v2 = arg3;
        sprvsc sprvsc2 = new sprvsc((sprsc)arg0, (sprlc)v2, byArray, n3, v2.cfr_renamed_1218());
        void v3 = arg4;
        sprvsc sprvsc3 = new sprvsc((sprsc)arg0, (sprlc)v3, byArray, n3 += arg3.cfr_renamed_1218(), v3.cfr_renamed_1218());
        sprnld sprnld2 = new sprnld(byArray, n3 += arg4.cfr_renamed_1218(), (int)arg5);
        sprnld sprnld3 = new sprnld(byArray, n3 += arg5, (int)arg5);
        if ((n3 += arg5) != n2) {
            throw new spryad(80);
        }
        if (bl2) {
            sprbvc sprbvc3 = this;
            sprbvc sprbvc4 = this;
            sprbvc4.cfr_renamed_0 = sprvsc3;
            sprbvc4.cfr_renamed_3 = sprvsc2;
            sprbvc3.cfr_renamed_4 = arg2;
            sprbvc3.cfr_renamed_91 = arg1;
            sprt3 = sprnld3;
            sprt2 = sprnld2;
            v6 = arg6;
        } else {
            sprbvc sprbvc5 = this;
            this.cfr_renamed_0 = sprvsc2;
            sprbvc5.cfr_renamed_3 = sprvsc3;
            sprbvc5.cfr_renamed_4 = arg1;
            this.cfr_renamed_91 = arg2;
            sprt3 = sprnld2;
            sprt2 = sprnld3;
            v6 = arg6;
        }
        if (v6 != false) {
            byte[] byArray2 = new byte[8];
            sprt3 = new sprnjd(sprt3, byArray2);
            sprt2 = new sprnjd(sprt2, byArray2);
        }
        sprbvc sprbvc6 = this;
        sprbvc6.cfr_renamed_4.cfr_renamed_1217(true, sprt3);
        sprbvc6.cfr_renamed_91.cfr_renamed_1217(false, sprt2);
    }

    @Override
    public byte[] cfr_renamed_2771(long arg0, short arg1, byte[] arg2, int arg3, int arg4) {
        if (this.cfr_renamed_1) {
            sprbvc sprbvc2 = this;
            sprbvc2.cfr_renamed_2772(sprbvc2.cfr_renamed_4, true, arg0);
        }
        byte[] byArray = new byte[arg4 + this.cfr_renamed_0.cfr_renamed_2773()];
        sprbvc sprbvc3 = this;
        this.cfr_renamed_4.cfr_renamed_505(arg2, arg3, arg4, byArray, 0);
        byte[] byArray2 = sprbvc3.cfr_renamed_0.cfr_renamed_2774(arg0, arg1, arg2, arg3, arg4);
        sprbvc3.cfr_renamed_4.cfr_renamed_505(byArray2, 0, byArray2.length, byArray, arg4);
        return byArray;
    }

    @Override
    public int cfr_renamed_2775(int arg0) {
        return arg0 - this.cfr_renamed_0.cfr_renamed_2773();
    }

    private /* synthetic */ void cfr_renamed_2772(sprqk arg0, boolean arg1, long arg2) {
        byte[] byArray = new byte[8];
        sprzsc.cfr_renamed_2708(arg2, byArray, 0);
        arg0.cfr_renamed_1217(arg1, new sprnjd(null, byArray));
    }

    @Override
    public byte[] cfr_renamed_2776(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        int n;
        if (this.cfr_renamed_1) {
            sprbvc sprbvc2 = this;
            sprbvc2.cfr_renamed_2772(sprbvc2.cfr_renamed_91, false, arg0);
        }
        if (arg4 < (n = this.cfr_renamed_3.cfr_renamed_2773())) {
            throw new spryad(50);
        }
        int n2 = arg4 - n;
        byte[] byArray = new byte[arg4];
        this.cfr_renamed_91.cfr_renamed_505(arg2, arg3, arg4, byArray, 0);
        this.cfr_renamed_2777(arg0, arg1, byArray, n2, arg4, byArray, 0, n2);
        return sprzra.cfr_renamed_533(byArray, 0, n2);
    }

    private /* synthetic */ void cfr_renamed_2777(long arg0, short arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) throws IOException {
        byte[] byArray;
        byte[] byArray2 = sprzra.cfr_renamed_533(arg2, arg3, arg4);
        if (!sprzra.cfr_renamed_559(byArray2, byArray = this.cfr_renamed_3.cfr_renamed_2774(arg0, arg1, arg5, arg6, arg7))) {
            throw new spryad(20);
        }
    }

    public sprbvc(sprsc arg0, sprqk arg1, sprqk arg2, sprlc arg3, sprlc arg4, int arg5) throws IOException {
        this(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }
}

