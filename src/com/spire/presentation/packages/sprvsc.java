/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprekd;
import com.spire.presentation.packages.sprfuc;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;

public class sprvsc {
    public byte[] cfr_renamed_91;
    public spruc cfr_renamed_0;
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public sprsc cfr_renamed_3;
    public int cfr_renamed_4;

    public int cfr_renamed_2952(int arg0) {
        return (arg0 + this.cfr_renamed_1) / this.cfr_renamed_2;
    }

    public int cfr_renamed_2773() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprvsc(sprsc sprsc2, sprlc sprlc2, byte[] byArray, int n, int n2) {
        sprvsc sprvsc2;
        void arg0;
        sprnld sprnld2;
        block5: {
            block4: {
                void arg1;
                block3: {
                    void v0;
                    void arg4;
                    void arg3;
                    void arg2;
                    this.cfr_renamed_3 = sprsc2;
                    sprnld2 = new sprnld((byte[])arg2, (int)arg3, (int)arg4);
                    this.cfr_renamed_91 = sprzra.cfr_renamed_158(sprnld2.cfr_renamed_1521());
                    if (arg1 instanceof sprekd) {
                        v0 = arg0;
                        sprvsc sprvsc3 = this;
                        sprvsc3.cfr_renamed_2 = 128;
                        sprvsc3.cfr_renamed_1 = 16;
                    } else {
                        this.cfr_renamed_2 = 64;
                        this.cfr_renamed_1 = 8;
                        v0 = arg0;
                    }
                    if (!sprzsc.cfr_renamed_2665((sprsc)v0)) break block3;
                    sprvsc sprvsc4 = this;
                    sprvsc4.cfr_renamed_0 = new sprfuc((sprlc)arg1);
                    if (arg1.cfr_renamed_1218() != 20) break block4;
                    sprvsc2 = this;
                    this.cfr_renamed_1 = 4;
                    break block5;
                }
                this.cfr_renamed_0 = new sprced((sprlc)arg1);
            }
            sprvsc2 = this;
        }
        sprvsc2.cfr_renamed_0.cfr_renamed_1524(sprnld2);
        this.cfr_renamed_4 = this.cfr_renamed_0.cfr_renamed_2404();
        if (arg0.cfr_renamed_2666().cfr_renamed_0) {
            this.cfr_renamed_4 = Math.min(this.cfr_renamed_4, 10);
        }
    }

    public byte[] cfr_renamed_2953(byte[] arg0) {
        if (arg0.length <= this.cfr_renamed_4) {
            return arg0;
        }
        return sprzra.cfr_renamed_523(arg0, this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_2954() {
        return this.cfr_renamed_91;
    }

    public byte[] cfr_renamed_2774(long arg0, short arg1, byte[] arg2, int arg3, int arg4) {
        sprpxc sprpxc2 = this.cfr_renamed_3.cfr_renamed_2683();
        boolean bl = sprpxc2.cfr_renamed_2684();
        int n = bl ? 11 : 13;
        byte[] byArray = new byte[n];
        sprzsc.cfr_renamed_2708(arg0, byArray, 0);
        sprzsc.cfr_renamed_2693(arg1, byArray, 8);
        if (!bl) {
            sprzsc.cfr_renamed_2702(sprpxc2, byArray, 9);
        }
        sprzsc.cfr_renamed_2679(arg4, byArray, byArray.length - 2);
        this.cfr_renamed_0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprvsc sprvsc2 = this;
        sprvsc2.cfr_renamed_0.cfr_renamed_1197(arg2, arg3, arg4);
        byte[] byArray2 = new byte[sprvsc2.cfr_renamed_0.cfr_renamed_2404()];
        sprvsc2.cfr_renamed_0.cfr_renamed_1219(byArray2, 0);
        return sprvsc2.cfr_renamed_2953(byArray2);
    }

    public byte[] cfr_renamed_2955(long arg0, short arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        sprvsc sprvsc2 = this;
        byte[] byArray = sprvsc2.cfr_renamed_2774(arg0, arg1, arg2, arg3, arg4);
        int n = sprzsc.cfr_renamed_2665(sprvsc2.cfr_renamed_3) ? 11 : 13;
        int n2 = this.cfr_renamed_2952(n + arg5) - this.cfr_renamed_2952(n + arg4);
        while (--n2 >= 0) {
            this.cfr_renamed_0.cfr_renamed_1197(arg6, 0, this.cfr_renamed_2);
        }
        sprvsc sprvsc3 = this;
        sprvsc3.cfr_renamed_0.cfr_renamed_1221(arg6[0]);
        sprvsc3.cfr_renamed_0.cfr_renamed_41();
        return byArray;
    }
}

