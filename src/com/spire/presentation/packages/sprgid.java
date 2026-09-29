/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprnhl;
import com.spire.presentation.packages.sprrj;

public class sprgid
extends sprehd {
    private static final int cfr_renamed_114 = 7;
    private static final int cfr_renamed_96 = 19;
    private static final int cfr_renamed_105 = 3;
    private static final int cfr_renamed_137 = 3;
    private static final int cfr_renamed_79 = 11;
    private static final int cfr_renamed_107 = 5;
    private static final int cfr_renamed_132 = 13;
    private static final int cfr_renamed_102 = 3;
    private static final int cfr_renamed_93 = 9;
    private int cfr_renamed_86;
    private static final int cfr_renamed_152 = 11;
    private int[] cfr_renamed_112;
    private int cfr_renamed_119;
    private static final int cfr_renamed_91 = 15;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = 9;
    private static final int cfr_renamed_4 = 16;

    private /* synthetic */ int cfr_renamed_3854(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprgid(this);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprgid sprgid2 = this;
        sprgid sprgid3 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_119 = 1732584193;
        sprgid3.cfr_renamed_86 = -271733879;
        sprgid3.cfr_renamed_1 = -1732584194;
        sprgid2.cfr_renamed_0 = 271733878;
        sprgid2.cfr_renamed_2 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return 16;
    }

    /*
     * WARNING - void declaration
     */
    public sprgid(sprgid sprgid2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_112 = new int[16];
        this.cfr_renamed_3857(sprgid2);
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_2 > 14) {
            this.cfr_renamed_3473();
        }
        sprgid sprgid2 = this;
        sprgid2.cfr_renamed_112[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprgid2.cfr_renamed_112[15] = (int)(arg0 >>> 32);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3835(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)arg0;
        arg1[v1 + true] = (byte)(arg0 >>> 8);
        v0[v1 + 2] = (byte)(arg0 >>> 16);
        v0[n2 + 3] = (byte)(arg0 >>> 24);
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprgid sprgid2 = (sprgid)arg0;
        this.cfr_renamed_3857(sprgid2);
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_112[this.cfr_renamed_2++] = arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
        if (this.cfr_renamed_2 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ void cfr_renamed_3857(sprgid arg0) {
        sprgid sprgid2 = arg0;
        sprgid sprgid3 = this;
        sprgid sprgid4 = arg0;
        super.cfr_renamed_3767(arg0);
        this.cfr_renamed_119 = sprgid4.cfr_renamed_119;
        sprgid3.cfr_renamed_86 = sprgid4.cfr_renamed_86;
        sprgid3.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_0 = sprgid2.cfr_renamed_0;
        System.arraycopy(sprgid2.cfr_renamed_112, 0, this.cfr_renamed_112, 0, arg0.cfr_renamed_112.length);
        this.cfr_renamed_2 = arg0.cfr_renamed_2;
    }

    private /* synthetic */ int cfr_renamed_3855(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg0 & arg2 | arg1 & arg2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprgid sprgid2 = this;
        sprgid2.cfr_renamed_3120();
        sprgid2.cfr_renamed_3835(sprgid2.cfr_renamed_119, (byte[])arg0, (int)arg1);
        sprgid2.cfr_renamed_3835(sprgid2.cfr_renamed_86, (byte[])arg0, (int)(arg1 + 4));
        sprgid2.cfr_renamed_3835(sprgid2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 8));
        sprgid2.cfr_renamed_3835(sprgid2.cfr_renamed_0, (byte[])arg0, (int)(arg1 + 12));
        sprgid2.cfr_renamed_41();
        return 16;
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    public sprgid() {
        sprgid sprgid2 = this;
        sprgid2.cfr_renamed_112 = new int[16];
        sprgid2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        sprgid sprgid2 = this;
        int n2 = sprgid2.cfr_renamed_119;
        int n3 = sprgid2.cfr_renamed_86;
        int n4 = sprgid2.cfr_renamed_1;
        int n5 = sprgid2.cfr_renamed_0;
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_112[0], 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_112[1], 7);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_112[2], 11);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_112[3], 19);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_112[4], 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_112[5], 7);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_112[6], 11);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_112[7], 19);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_112[8], 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_112[9], 7);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_112[10], 11);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_112[11], 19);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3854(n3, n4, n5) + this.cfr_renamed_112[12], 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3854(n2, n3, n4) + this.cfr_renamed_112[13], 7);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3854(n5, n2, n3) + this.cfr_renamed_112[14], 11);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3854(n4, n5, n2) + this.cfr_renamed_112[15], 19);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_112[0] + 1518500249, 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_112[4] + 1518500249, 5);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_112[8] + 1518500249, 9);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_112[12] + 1518500249, 13);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_112[1] + 1518500249, 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_112[5] + 1518500249, 5);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_112[9] + 1518500249, 9);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_112[13] + 1518500249, 13);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_112[2] + 1518500249, 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_112[6] + 1518500249, 5);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_112[10] + 1518500249, 9);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_112[14] + 1518500249, 13);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3855(n3, n4, n5) + this.cfr_renamed_112[3] + 1518500249, 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3855(n2, n3, n4) + this.cfr_renamed_112[7] + 1518500249, 5);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3855(n5, n2, n3) + this.cfr_renamed_112[11] + 1518500249, 9);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3855(n4, n5, n2) + this.cfr_renamed_112[15] + 1518500249, 13);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_112[0] + 1859775393, 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_112[8] + 1859775393, 9);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_112[4] + 1859775393, 11);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_112[12] + 1859775393, 15);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_112[2] + 1859775393, 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_112[10] + 1859775393, 9);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_112[6] + 1859775393, 11);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_112[14] + 1859775393, 15);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_112[1] + 1859775393, 3);
        n5 = sprgid2.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + this.cfr_renamed_112[9] + 1859775393, 9);
        n4 = sprgid2.cfr_renamed_494(n4 + this.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_112[5] + 1859775393, 11);
        n3 = sprgid2.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_112[13] + 1859775393, 15);
        n2 = sprgid2.cfr_renamed_494(n2 + this.cfr_renamed_3852(n3, n4, n5) + this.cfr_renamed_112[3] + 1859775393, 3);
        sprgid sprgid3 = this;
        sprgid sprgid4 = this;
        n5 = sprgid4.cfr_renamed_494(n5 + this.cfr_renamed_3852(n2, n3, n4) + sprgid4.cfr_renamed_112[11] + 1859775393, 9);
        sprgid sprgid5 = this;
        n4 = sprgid3.cfr_renamed_494(n4 + sprgid5.cfr_renamed_3852(n5, n2, n3) + this.cfr_renamed_112[7] + 1859775393, 11);
        n3 = sprgid5.cfr_renamed_494(n3 + this.cfr_renamed_3852(n4, n5, n2) + this.cfr_renamed_112[15] + 1859775393, 15);
        sprgid3.cfr_renamed_119 += n2;
        sprgid3.cfr_renamed_86 += n3;
        sprgid3.cfr_renamed_1 += n4;
        sprgid3.cfr_renamed_0 += n5;
        sprgid3.cfr_renamed_2 = 0;
        int n6 = n = 0;
        while (n6 != this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n6 = n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprnhl.cfr_renamed_9("U\u001d,");
    }

    private /* synthetic */ int cfr_renamed_3852(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }
}

