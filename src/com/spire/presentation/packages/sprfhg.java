/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblg;
import com.spire.presentation.packages.sprcqg;
import com.spire.presentation.packages.sprdgg;
import com.spire.presentation.packages.sproze;

public class sprfhg
extends sprdgg {
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_5948() {
        return sproze.cfr_renamed_533(this.cfr_renamed_4, 0, 32);
    }

    public byte[] cfr_renamed_1369() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprfhg(sprcqg sprcqg2, byte[] byArray) {
        super(true, (sprcqg)arg0);
        void arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    public byte[] cfr_renamed_3369() {
        return sproze.cfr_renamed_533(this.cfr_renamed_4, 32, 40);
    }

    public byte[] cfr_renamed_5947() {
        sprblg sprblg2 = this.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprblg2.cfr_renamed_6094()];
        sprblg2.cfr_renamed_7150(this.cfr_renamed_4);
        return byArray;
    }

    public byte[] cfr_renamed_5950() {
        sprfhg sprfhg2 = this;
        return sproze.cfr_renamed_533(sprfhg2.cfr_renamed_4, sprfhg2.cfr_renamed_4.length - 32, this.cfr_renamed_4.length);
    }

    public byte[] cfr_renamed_5949() {
        return sproze.cfr_renamed_533(this.cfr_renamed_4, 40 + this.cfr_renamed_284().cfr_renamed_1144() * 2, this.cfr_renamed_4.length - 32);
    }

    /*
     * WARNING - void declaration
     */
    public sprfhg(sprcqg sprcqg2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        super(true, (sprcqg)arg0);
        void arg1;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg0;
        int n = byArray.length + ((void)arg2).length + ((void)arg3).length + ((void)arg4).length + ((void)arg5).length;
        this.cfr_renamed_4 = new byte[n];
        int n2 = 0;
        System.arraycopy(arg1, 0, this.cfr_renamed_4, n2, ((void)arg1).length);
        System.arraycopy(arg2, 0, this.cfr_renamed_4, n2 += ((void)arg1).length, ((void)arg2).length);
        System.arraycopy(arg3, 0, this.cfr_renamed_4, n2 += ((void)arg2).length, ((void)arg3).length);
        System.arraycopy(arg4, 0, this.cfr_renamed_4, n2 += ((void)arg3).length, ((void)arg4).length);
        System.arraycopy(arg5, 0, this.cfr_renamed_4, n2 += ((void)arg4).length, ((void)arg5).length);
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_1145() {
        return sproze.cfr_renamed_533(this.cfr_renamed_4, 40, 40 + this.cfr_renamed_284().cfr_renamed_1144() * 2);
    }
}

