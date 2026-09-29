/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprikl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtco;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprmil
extends sprikl {
    private static final int cfr_renamed_114 = 16;
    private static final int cfr_renamed_96 = 19;
    private int cfr_renamed_105;
    private static final int cfr_renamed_137 = 3;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private static final int cfr_renamed_132 = 9;
    private int[] cfr_renamed_102;
    private static final int cfr_renamed_93 = 11;
    private static final int cfr_renamed_86 = 5;
    private int cfr_renamed_152;
    private static final int cfr_renamed_112 = 3;
    private static final int cfr_renamed_119 = 9;
    private static final int cfr_renamed_91 = 15;
    private static final int cfr_renamed_0 = 11;
    private static final int cfr_renamed_1 = 7;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = 13;
    private static final int cfr_renamed_4 = 3;

    @Override
    public void cfr_renamed_41() {
        int n;
        sprmil sprmil2 = this;
        sprmil sprmil3 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_2 = 1732584193;
        sprmil3.cfr_renamed_105 = -271733879;
        sprmil3.cfr_renamed_152 = -1732584194;
        sprmil2.cfr_renamed_107 = 271733878;
        sprmil2.cfr_renamed_79 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_102.length) {
            this.cfr_renamed_102[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprtco.cfr_renamed_9("6KO");
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprmil(this);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprmil sprmil2 = this;
        sprmil2.cfr_renamed_3120();
        sprpxe.cfr_renamed_437(sprmil2.cfr_renamed_2, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_437(sprmil2.cfr_renamed_105, (byte[])arg0, (int)(arg1 + 4));
        sprpxe.cfr_renamed_437(sprmil2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_437(sprmil2.cfr_renamed_107, (byte[])arg0, (int)(arg1 + 12));
        sprmil2.cfr_renamed_41();
        return 16;
    }

    private /* synthetic */ int cfr_renamed_3855(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg0 & arg2 | arg1 & arg2;
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_102[this.cfr_renamed_79++] = sprpxe.cfr_renamed_439(arg0, arg1);
        if (this.cfr_renamed_79 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ void cfr_renamed_10502(sprmil arg0) {
        sprmil sprmil2 = arg0;
        sprmil sprmil3 = this;
        sprmil sprmil4 = arg0;
        super.cfr_renamed_10478(arg0);
        this.cfr_renamed_2 = sprmil4.cfr_renamed_2;
        sprmil3.cfr_renamed_105 = sprmil4.cfr_renamed_105;
        sprmil3.cfr_renamed_152 = arg0.cfr_renamed_152;
        this.cfr_renamed_107 = sprmil2.cfr_renamed_107;
        System.arraycopy(sprmil2.cfr_renamed_102, 0, this.cfr_renamed_102, 0, arg0.cfr_renamed_102.length);
        this.cfr_renamed_79 = arg0.cfr_renamed_79;
    }

    private /* synthetic */ int cfr_renamed_3852(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        sprmil sprmil2 = this;
        int n2 = sprmil2.cfr_renamed_2;
        int n3 = sprmil2.cfr_renamed_105;
        int n4 = sprmil2.cfr_renamed_152;
        int n5 = sprmil2.cfr_renamed_107;
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_102[0], 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_102[1], 7);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_102[2], 11);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_102[3], 19);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_102[4], 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_102[5], 7);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_102[6], 11);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_102[7], 19);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_102[8], 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_102[9], 7);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_102[10], 11);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_102[11], 19);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_102[12], 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_102[13], 7);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_102[14], 11);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_102[15], 19);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_102[0] + 1518500249, 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_102[4] + 1518500249, 5);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_102[8] + 1518500249, 9);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_102[12] + 1518500249, 13);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_102[1] + 1518500249, 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_102[5] + 1518500249, 5);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_102[9] + 1518500249, 9);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_102[13] + 1518500249, 13);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_102[2] + 1518500249, 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_102[6] + 1518500249, 5);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_102[10] + 1518500249, 9);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_102[14] + 1518500249, 13);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_102[3] + 1518500249, 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_102[7] + 1518500249, 5);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_102[11] + 1518500249, 9);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_102[15] + 1518500249, 13);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_102[0] + 1859775393, 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_102[8] + 1859775393, 9);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_102[4] + 1859775393, 11);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_102[12] + 1859775393, 15);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_102[2] + 1859775393, 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_102[10] + 1859775393, 9);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_102[6] + 1859775393, 11);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_102[14] + 1859775393, 15);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_102[1] + 1859775393, 3);
        n5 = sprmil2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_102[9] + 1859775393, 9);
        n4 = sprmil2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_102[5] + 1859775393, 11);
        n3 = sprmil2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_102[13] + 1859775393, 15);
        n2 = sprmil2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_102[3] + 1859775393, 3);
        sprmil sprmil3 = this;
        sprmil sprmil4 = this;
        n5 = sprmil4.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + sprmil4.cfr_renamed_102[11] + 1859775393, 9);
        sprmil sprmil5 = this;
        n4 = sprmil3.cfr_renamed_494(n4 + sprmil5.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_102[7] + 1859775393, 11);
        n3 = sprmil5.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_102[15] + 1859775393, 15);
        sprmil3.cfr_renamed_2 += n2;
        sprmil3.cfr_renamed_105 += n3;
        sprmil3.cfr_renamed_152 += n4;
        sprmil3.cfr_renamed_107 += n5;
        sprmil3.cfr_renamed_79 = 0;
        int n6 = n = 0;
        while (n6 != this.cfr_renamed_102.length) {
            this.cfr_renamed_102[n++] = 0;
            n6 = n;
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return 16;
    }

    private /* synthetic */ int cfr_renamed_3854(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprmil sprmil2 = (sprmil)arg0;
        this.cfr_renamed_10502(sprmil2);
    }

    public sprmil() {
        this(spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmil(sprmil sprmil2) {
        void arg0;
        sprmil sprmil3 = this;
        super((spriil)arg0.cfr_renamed_0);
        this.cfr_renamed_102 = new int[16];
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprmil3, 64, (spriil)this.cfr_renamed_0));
        sprmil3.cfr_renamed_10502(sprmil2);
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprmil sprmil2 = this;
        return sprhel.cfr_renamed_10474(sprmil2, (spriil)sprmil2.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmil(spriil spriil2) {
        void arg0;
        sprmil sprmil2 = this;
        super((spriil)arg0);
        sprmil2.cfr_renamed_102 = new int[16];
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprmil2, 64, (spriil)arg0));
        sprmil2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_79 > 14) {
            this.cfr_renamed_3473();
        }
        sprmil sprmil2 = this;
        sprmil2.cfr_renamed_102[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprmil2.cfr_renamed_102[15] = (int)(arg0 >>> 32);
    }
}

