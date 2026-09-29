/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprvsc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;

public class sprexc
implements sprmc {
    public sprvsc cfr_renamed_2;
    public sprsc cfr_renamed_3;
    public sprvsc cfr_renamed_4;

    @Override
    public int cfr_renamed_2775(int arg0) {
        int n = arg0;
        if (this.cfr_renamed_2 != null) {
            n -= this.cfr_renamed_2.cfr_renamed_2773();
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprexc(sprsc sprsc2) {
        void arg0;
        sprexc sprexc2 = this;
        this.cfr_renamed_3 = arg0;
        sprexc2.cfr_renamed_2 = null;
        sprexc2.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprexc(sprsc sprsc2, sprlc sprlc2, sprlc sprlc3) throws IOException {
        void arg1;
        void arg0;
        void v1;
        void arg2;
        boolean bl;
        if (sprlc2 == null) {
            bl = true;
            v1 = arg2;
        } else {
            bl = false;
            v1 = arg2;
        }
        if (bl != (v1 == null)) {
            throw new spryad(80);
        }
        this.cfr_renamed_3 = arg0;
        sprvsc sprvsc2 = null;
        sprvsc sprvsc3 = null;
        if (arg1 != null) {
            int n = arg1.cfr_renamed_1218() + arg2.cfr_renamed_1218();
            byte[] byArray = sprzsc.cfr_renamed_2753((sprsc)arg0, n);
            int n2 = 0;
            void v2 = arg1;
            sprvsc2 = new sprvsc((sprsc)arg0, (sprlc)v2, byArray, n2, v2.cfr_renamed_1218());
            void v3 = arg2;
            sprvsc3 = new sprvsc((sprsc)arg0, (sprlc)v3, byArray, n2 += arg1.cfr_renamed_1218(), v3.cfr_renamed_1218());
            if ((n2 += arg2.cfr_renamed_1218()) != n) {
                throw new spryad(80);
            }
        }
        sprexc sprexc2 = this;
        if (arg0.cfr_renamed_2770()) {
            sprexc2.cfr_renamed_2 = sprvsc3;
            this.cfr_renamed_4 = sprvsc2;
            return;
        }
        sprexc2.cfr_renamed_2 = sprvsc2;
        this.cfr_renamed_4 = sprvsc3;
    }

    @Override
    public byte[] cfr_renamed_2776(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        byte[] byArray;
        if (this.cfr_renamed_4 == null) {
            int n = arg3;
            return sprzra.cfr_renamed_533(arg2, n, n + arg4);
        }
        int n = this.cfr_renamed_4.cfr_renamed_2773();
        if (arg4 < n) {
            throw new spryad(50);
        }
        int n2 = arg4 - n;
        byte[] byArray2 = sprzra.cfr_renamed_533(arg2, arg3 + n2, arg3 + arg4);
        if (!sprzra.cfr_renamed_559(byArray2, byArray = this.cfr_renamed_4.cfr_renamed_2774(arg0, arg1, arg2, arg3, n2))) {
            throw new spryad(20);
        }
        int n3 = arg3;
        return sprzra.cfr_renamed_533(arg2, n3, n3 + n2);
    }

    @Override
    public byte[] cfr_renamed_2771(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        if (this.cfr_renamed_2 == null) {
            int n = arg3;
            return sprzra.cfr_renamed_533(arg2, n, n + arg4);
        }
        byte[] byArray = this.cfr_renamed_2.cfr_renamed_2774(arg0, arg1, arg2, arg3, arg4);
        byte[] byArray2 = new byte[arg4 + byArray.length];
        System.arraycopy(arg2, arg3, byArray2, 0, arg4);
        System.arraycopy(byArray, 0, byArray2, arg4, byArray.length);
        return byArray2;
    }
}

