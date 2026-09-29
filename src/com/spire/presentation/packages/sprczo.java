/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkq;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprczo
implements sprkq,
Cloneable {
    private double cfr_renamed_119;
    private boolean cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private double cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_17999() {
        return sprnmp.cfr_renamed_17960(this.cfr_renamed_13343());
    }

    public double cfr_renamed_13344() {
        return sprnmp.cfr_renamed_16525(this.cfr_renamed_4, this.cfr_renamed_119);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public static sprczo cfr_renamed_17961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int n = arg2 - arg0;
        int n2 = arg3 - arg1;
        double d = arg4 != 0 ? (double)n / sprnmp.cfr_renamed_18000(arg4) : 0.0;
        double d2 = arg5 != 0 ? (double)n2 / sprnmp.cfr_renamed_18000(arg5) : 0.0;
        return new sprczo(arg0, arg1, n, n2, d, d2);
    }

    public int cfr_renamed_13341() {
        return this.cfr_renamed_13430() + this.cfr_renamed_1942();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprczo(int n, int n2, int n3, int n4, double d, double d2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprczo sprczo2 = this;
        sprczo sprczo3 = this;
        sprczo sprczo4 = this;
        sprczo4.cfr_renamed_0 = arg0;
        sprczo4.cfr_renamed_3 = arg1;
        sprczo3.cfr_renamed_1 = arg2;
        sprczo3.cfr_renamed_4 = arg3;
        sprczo2.cfr_renamed_2 = arg4;
        sprczo2.cfr_renamed_119 = arg5;
        if (d == 0.0 || arg5 == 0.0) {
            sprczo sprczo5 = this;
            sprczo5.cfr_renamed_91 = true;
            sprczo5.cfr_renamed_2 = 96.0;
            this.cfr_renamed_119 = 96.0;
        }
    }

    public int cfr_renamed_13342() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_13430() {
        return this.cfr_renamed_0;
    }

    public double cfr_renamed_14217() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_13429() {
        return this.cfr_renamed_13342() + this.cfr_renamed_1452();
    }

    public int cfr_renamed_1942() {
        return this.cfr_renamed_1;
    }

    @Override
    public Object cfr_renamed_12099() {
        return (sprczo)this.cfr_renamed_12100();
    }

    public int cfr_renamed_18001() {
        return sprnmp.cfr_renamed_18002(this.cfr_renamed_1942(), this.cfr_renamed_14217());
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_4;
    }

    public double cfr_renamed_14218() {
        return this.cfr_renamed_119;
    }

    public double cfr_renamed_13343() {
        return sprnmp.cfr_renamed_16525(this.cfr_renamed_1, this.cfr_renamed_2);
    }

    public boolean cfr_renamed_17701() {
        return this.cfr_renamed_91;
    }

    public static sprczo cfr_renamed_17993() {
        return new sprczo(0, 0, 0, 0, 0.0, 0.0);
    }

    public static sprczo cfr_renamed_17940(int arg0, int arg1, int arg2, int arg3, double arg4, double arg5) {
        int n = arg2 - arg0;
        int n2 = arg3 - arg1;
        return new sprczo(arg0, arg1, n, n2, arg4, arg5);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_18003(double d, double d2) {
        void arg1;
        void arg0;
        sprczo sprczo2 = this;
        sprczo2.cfr_renamed_2 = arg0;
        sprczo2.cfr_renamed_119 = arg1;
        if (d == 0.0 || arg1 == 0.0) {
            sprczo sprczo3 = this;
            sprczo3.cfr_renamed_91 = true;
            sprczo3.cfr_renamed_2 = 96.0;
            this.cfr_renamed_119 = 96.0;
        }
    }

    public sprlfja cfr_renamed_2773() {
        sprczo sprczo2 = this;
        return new sprlfja(sprczo2.cfr_renamed_1, sprczo2.cfr_renamed_4);
    }

    public int cfr_renamed_18004() {
        return sprnmp.cfr_renamed_18002(this.cfr_renamed_1452(), this.cfr_renamed_14218());
    }

    public int cfr_renamed_18005() {
        return sprnmp.cfr_renamed_17960(this.cfr_renamed_13344());
    }

    public static sprczo cfr_renamed_14228(int arg0, int arg1, double arg2, double arg3) {
        return new sprczo(0, 0, arg0, arg1, arg2, arg3);
    }
}

