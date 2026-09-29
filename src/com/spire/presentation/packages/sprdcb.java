/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartTextArea;
import com.spire.presentation.packages.sprchk;
import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.sprt;

public class sprdcb
implements sprt {
    private int cfr_renamed_91;
    public static final int cfr_renamed_0 = 50;
    public static final int cfr_renamed_1 = 11;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public sprdcb(int arg0, int arg1, int arg2) throws IllegalArgumentException {
        this.cfr_renamed_4 = arg0;
        if (this.cfr_renamed_4 < 1) {
            throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("o[o\u000eq\u000f\"\u0019g[r\u0014q\u0012v\u0012t\u001e"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("<\u000b<\u000foFh\tsFp\u0007n\u0001y"));
        }
        this.cfr_renamed_2 = 1 << arg0;
        this.cfr_renamed_3 = arg1;
        if (arg1 < 0) {
            throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("v[o\u000eq\u000f\"\u0019g[r\u0014q\u0012v\u0012t\u001e"));
        }
        if (arg1 > this.cfr_renamed_2) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("hFq\u0013o\u0012<\u0004yFp\u0003o\u0015<\u0012t\u0007rFrF!F.8q"));
        }
        if (sprhna.cfr_renamed_824(arg2) == arg0 && sprhna.cfr_renamed_827(arg2)) {
            this.cfr_renamed_91 = arg2;
            return;
        }
        throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("r\u0014n\u0002l\u0014o\u0012c\u0017\"\u0012q[l\u0014v[c[d\u0012g\u0017f[r\u0014n\u0002l\u0014o\u0012c\u0017\"\u001dm\t\"<DS0%oR"));
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprdcb(int n) throws IllegalArgumentException {
        void arg0;
        if (n < 1) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("w\u0003eFo\u000ff\u0003<\u000bi\u0015hF~\u0003<\u0016s\u0015u\u0012u\u0010y"));
        }
        sprdcb sprdcb2 = this;
        sprdcb sprdcb3 = this;
        sprdcb3.cfr_renamed_4 = 0;
        sprdcb3.cfr_renamed_2 = 1;
        while (sprdcb2.cfr_renamed_2 < arg0) {
            sprdcb sprdcb4 = this;
            sprdcb2 = sprdcb4;
            sprdcb4.cfr_renamed_2 <<= 1;
            ++sprdcb4.cfr_renamed_4;
        }
        sprdcb sprdcb5 = this;
        sprdcb5.cfr_renamed_3 = sprdcb5.cfr_renamed_2 >>> 1;
        sprdcb5.cfr_renamed_3 /= this.cfr_renamed_4;
        sprdcb5.cfr_renamed_91 = sprhna.cfr_renamed_826(sprdcb5.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprdcb(int n, int n2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        if (n < 1) {
            throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("o[o\u000eq\u000f\"\u0019g[r\u0014q\u0012v\u0012t\u001e"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("\u000b<\u000foFh\tsFp\u0007n\u0001y"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = 1 << arg0;
        if (arg1 < 0) {
            throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("v[o\u000eq\u000f\"\u0019g[r\u0014q\u0012v\u0012t\u001e"));
        }
        if (arg1 > this.cfr_renamed_2) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("hFq\u0013o\u0012<\u0004yFp\u0003o\u0015<\u0012t\u0007rFrF!F.8q"));
        }
        this.cfr_renamed_3 = arg1;
        this.cfr_renamed_91 = sprhna.cfr_renamed_826((int)arg0);
    }

    public sprdcb() {
        this(11, 50);
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_1185() {
        return this.cfr_renamed_91;
    }
}

