/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprikl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqsia;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprmll
extends sprikl {
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int[] cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = 32;
    private int cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3839(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3848(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3833((int)arg1, (int)arg2, (int)arg3) + arg4 + 1836072691, (int)arg5);
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprmll sprmll2 = this;
        return sprhel.cfr_renamed_10474(sprmll2, (spriil)sprmll2.cfr_renamed_0);
    }

    private /* synthetic */ void cfr_renamed_10495(sprmll arg0) {
        sprmll sprmll2 = arg0;
        sprmll sprmll3 = this;
        sprmll sprmll4 = arg0;
        sprmll sprmll5 = this;
        sprmll sprmll6 = arg0;
        super.cfr_renamed_10478(arg0);
        this.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_119 = sprmll6.cfr_renamed_119;
        sprmll5.cfr_renamed_2 = sprmll6.cfr_renamed_2;
        sprmll5.cfr_renamed_152 = arg0.cfr_renamed_152;
        this.cfr_renamed_93 = sprmll4.cfr_renamed_93;
        sprmll3.cfr_renamed_91 = sprmll4.cfr_renamed_91;
        sprmll3.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_86 = sprmll2.cfr_renamed_86;
        System.arraycopy(sprmll2.cfr_renamed_112, 0, this.cfr_renamed_112, 0, arg0.cfr_renamed_112.length);
        this.cfr_renamed_4 = arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3849(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3839((int)arg1, (int)arg2, (int)arg3) + arg4 + -1894007588, (int)arg5);
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprmll(this);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3843(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3838((int)arg1, (int)arg2, (int)arg3) + arg4, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    public sprmll(spriil spriil2) {
        void arg0;
        sprmll sprmll2 = this;
        super((spriil)arg0);
        sprmll2.cfr_renamed_112 = new int[16];
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprmll2, 128, (spriil)arg0));
        sprmll2.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3844(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3833((int)arg1, (int)arg2, (int)arg3) + arg4 + 1518500249, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3846(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3840((int)arg1, (int)arg2, (int)arg3) + arg4 + 1548603684, (int)arg5);
    }

    private /* synthetic */ int cfr_renamed_3837(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    public sprmll() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_4 > 14) {
            this.cfr_renamed_3473();
        }
        sprmll sprmll2 = this;
        sprmll2.cfr_renamed_112[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprmll2.cfr_renamed_112[15] = (int)(arg0 >>> 32);
    }

    private /* synthetic */ int cfr_renamed_3838(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprmll sprmll2 = (sprmll)arg0;
        this.cfr_renamed_10495(sprmll2);
    }

    private /* synthetic */ int cfr_renamed_3833(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmll(sprmll sprmll2) {
        void arg0;
        sprmll sprmll3 = this;
        super((spriil)arg0.cfr_renamed_0);
        this.cfr_renamed_112 = new int[16];
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprmll3, 128, (spriil)this.cfr_renamed_0));
        sprmll3.cfr_renamed_10495(sprmll2);
    }

    @Override
    public String cfr_renamed_1315() {
        return sprqsia.cfr_renamed_9("m\u001co\u0010r\u0011\r`\t");
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprmll sprmll2 = this;
        sprmll sprmll3 = this;
        sprmll sprmll4 = this;
        sprmll sprmll5 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_0 = 1732584193;
        sprmll5.cfr_renamed_119 = -271733879;
        sprmll5.cfr_renamed_2 = -1732584194;
        sprmll4.cfr_renamed_152 = 271733878;
        sprmll4.cfr_renamed_93 = 1985229328;
        sprmll3.cfr_renamed_91 = -19088744;
        sprmll3.cfr_renamed_1 = -1985229329;
        sprmll2.cfr_renamed_86 = 19088743;
        sprmll2.cfr_renamed_4 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        sprmll sprmll2 = this;
        int n2 = sprmll2.cfr_renamed_0;
        int n3 = sprmll2.cfr_renamed_119;
        int n4 = sprmll2.cfr_renamed_2;
        int n5 = sprmll2.cfr_renamed_152;
        int n6 = sprmll2.cfr_renamed_93;
        int n7 = sprmll2.cfr_renamed_91;
        int n8 = sprmll2.cfr_renamed_1;
        int n9 = sprmll2.cfr_renamed_86;
        n2 = sprmll2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_112[0], 11);
        n5 = sprmll2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_112[1], 14);
        n4 = sprmll2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_112[2], 15);
        n3 = sprmll2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_112[3], 12);
        n2 = sprmll2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_112[4], 5);
        n5 = sprmll2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_112[5], 8);
        n4 = sprmll2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_112[6], 7);
        n3 = sprmll2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_112[7], 9);
        n2 = sprmll2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_112[8], 11);
        n5 = sprmll2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_112[9], 13);
        n4 = sprmll2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_112[10], 14);
        n3 = sprmll2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_112[11], 15);
        n2 = sprmll2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_112[12], 6);
        n5 = sprmll2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_112[13], 7);
        n4 = sprmll2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_112[14], 9);
        n3 = sprmll2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_112[15], 8);
        n6 = sprmll2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_112[5], 8);
        n9 = sprmll2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_112[14], 9);
        n8 = sprmll2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_112[7], 9);
        n7 = sprmll2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_112[0], 11);
        n6 = sprmll2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_112[9], 13);
        n9 = sprmll2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_112[2], 15);
        n8 = sprmll2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_112[11], 15);
        n7 = sprmll2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_112[4], 5);
        n6 = sprmll2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_112[13], 7);
        n9 = sprmll2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_112[6], 7);
        n8 = sprmll2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_112[15], 8);
        n7 = sprmll2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_112[8], 11);
        n6 = sprmll2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_112[1], 14);
        n9 = sprmll2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_112[10], 14);
        n8 = sprmll2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_112[3], 12);
        n7 = sprmll2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_112[12], 6);
        int n10 = n2;
        n2 = n6;
        n6 = n10;
        n2 = sprmll2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_112[7], 7);
        n5 = sprmll2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_112[4], 6);
        n4 = sprmll2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_112[13], 8);
        n3 = sprmll2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_112[1], 13);
        n2 = sprmll2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_112[10], 11);
        n5 = sprmll2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_112[6], 9);
        n4 = sprmll2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_112[15], 7);
        n3 = sprmll2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_112[3], 15);
        n2 = sprmll2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_112[12], 7);
        n5 = sprmll2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_112[0], 12);
        n4 = sprmll2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_112[9], 15);
        n3 = sprmll2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_112[5], 9);
        n2 = sprmll2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_112[2], 11);
        n5 = sprmll2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_112[14], 7);
        n4 = sprmll2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_112[11], 13);
        n3 = sprmll2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_112[8], 12);
        n6 = sprmll2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_112[6], 9);
        n9 = sprmll2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_112[11], 13);
        n8 = sprmll2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_112[3], 15);
        n7 = sprmll2.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_112[7], 7);
        n6 = sprmll2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_112[0], 12);
        n9 = sprmll2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_112[13], 8);
        n8 = sprmll2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_112[5], 9);
        n7 = sprmll2.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_112[10], 11);
        n6 = sprmll2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_112[14], 7);
        n9 = sprmll2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_112[15], 7);
        n8 = sprmll2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_112[8], 12);
        n7 = sprmll2.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_112[12], 7);
        n6 = sprmll2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_112[4], 6);
        n9 = sprmll2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_112[9], 15);
        n8 = sprmll2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_112[1], 13);
        sprmll sprmll3 = this;
        n7 = sprmll3.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_112[2], 11);
        int n11 = n3;
        n3 = n7;
        n7 = n11;
        n2 = sprmll3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_112[3], 11);
        n5 = sprmll3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_112[10], 13);
        n4 = sprmll3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_112[14], 6);
        n3 = sprmll3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_112[4], 7);
        n2 = sprmll3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_112[9], 14);
        n5 = sprmll3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_112[15], 9);
        n4 = sprmll3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_112[8], 13);
        n3 = sprmll3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_112[1], 15);
        n2 = sprmll3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_112[2], 14);
        n5 = sprmll3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_112[7], 8);
        n4 = sprmll3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_112[0], 13);
        n3 = sprmll3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_112[6], 6);
        n2 = sprmll3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_112[13], 5);
        n5 = sprmll3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_112[11], 12);
        n4 = sprmll3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_112[5], 7);
        n3 = sprmll3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_112[12], 5);
        n6 = sprmll3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_112[15], 9);
        n9 = sprmll3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_112[5], 7);
        n8 = sprmll3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_112[1], 15);
        n7 = sprmll3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_112[3], 11);
        n6 = sprmll3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_112[7], 8);
        n9 = sprmll3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_112[14], 6);
        n8 = sprmll3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_112[6], 6);
        n7 = sprmll3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_112[9], 14);
        n6 = sprmll3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_112[11], 12);
        n9 = sprmll3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_112[8], 13);
        n8 = sprmll3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_112[12], 5);
        n7 = sprmll3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_112[2], 14);
        n6 = sprmll3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_112[10], 13);
        n9 = sprmll3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_112[0], 13);
        n8 = sprmll3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_112[4], 7);
        n7 = sprmll3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_112[13], 5);
        int n12 = n4;
        n4 = n8;
        n8 = n12;
        n2 = sprmll3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_112[1], 11);
        n5 = sprmll3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_112[9], 12);
        n4 = sprmll3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_112[11], 14);
        n3 = sprmll3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_112[10], 15);
        n2 = sprmll3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_112[0], 14);
        n5 = sprmll3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_112[8], 15);
        n4 = sprmll3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_112[12], 9);
        n3 = sprmll3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_112[4], 8);
        n2 = sprmll3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_112[13], 9);
        n5 = sprmll3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_112[3], 14);
        n4 = sprmll3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_112[7], 5);
        n3 = sprmll3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_112[15], 6);
        n2 = sprmll3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_112[14], 8);
        n5 = sprmll3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_112[5], 6);
        n4 = sprmll3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_112[6], 5);
        n3 = sprmll3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_112[2], 12);
        n6 = sprmll3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_112[8], 15);
        n9 = sprmll3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_112[6], 5);
        n8 = sprmll3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_112[4], 8);
        n7 = sprmll3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_112[1], 11);
        n6 = sprmll3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_112[3], 14);
        n9 = sprmll3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_112[11], 14);
        n8 = sprmll3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_112[15], 6);
        n7 = sprmll3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_112[0], 14);
        n6 = sprmll3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_112[5], 6);
        n9 = sprmll3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_112[12], 9);
        n8 = sprmll3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_112[2], 12);
        n7 = sprmll3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_112[13], 9);
        n6 = sprmll3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_112[9], 12);
        n9 = sprmll3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_112[7], 5);
        n8 = sprmll3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_112[10], 15);
        n7 = sprmll3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_112[14], 8);
        int n13 = n5;
        n5 = n9;
        n9 = n13;
        sprmll sprmll4 = this;
        sprmll sprmll5 = this;
        sprmll5.cfr_renamed_0 += n2;
        sprmll5.cfr_renamed_119 += n3;
        sprmll5.cfr_renamed_2 += n4;
        sprmll5.cfr_renamed_152 += n5;
        sprmll5.cfr_renamed_93 += n6;
        sprmll5.cfr_renamed_91 += n7;
        sprmll4.cfr_renamed_1 += n8;
        sprmll4.cfr_renamed_86 += n9;
        sprmll4.cfr_renamed_4 = 0;
        int n14 = n = 0;
        while (n14 != this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n14 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3845(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3839((int)arg1, (int)arg2, (int)arg3) + arg4 + 1352829926, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3842(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3838((int)arg1, (int)arg2, (int)arg3) + arg4, (int)arg5);
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_112[this.cfr_renamed_4++] = sprpxe.cfr_renamed_439(arg0, arg1);
        if (this.cfr_renamed_4 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ int cfr_renamed_3840(int arg0, int arg1, int arg2) {
        return (arg0 | ~arg1) ^ arg2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3847(int n, int n2, int n3, int n4, int n5, int n6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprmll sprmll2 = this;
        return sprmll2.cfr_renamed_3837(n + sprmll2.cfr_renamed_3840((int)arg1, (int)arg2, (int)arg3) + arg4 + 1859775393, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprmll sprmll2 = this;
        sprmll2.cfr_renamed_3120();
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_0, (byte[])arg0, (int)arg1);
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 4));
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 8));
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 12));
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_93, (byte[])arg0, (int)(arg1 + 16));
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_91, (byte[])arg0, (int)(arg1 + 20));
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 24));
        sprpxe.cfr_renamed_437(sprmll2.cfr_renamed_86, (byte[])arg0, (int)(arg1 + 28));
        sprmll2.cfr_renamed_41();
        return 32;
    }
}

