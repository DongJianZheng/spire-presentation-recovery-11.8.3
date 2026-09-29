/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprrgf;
import com.spire.presentation.packages.sprrj;

public class sprkmd
extends sprehd {
    private int cfr_renamed_93;
    private int[] cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private static final int cfr_renamed_91 = 32;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3833(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_86[this.cfr_renamed_112++] = arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
        if (this.cfr_renamed_112 == 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ void cfr_renamed_3841(sprkmd arg0) {
        sprkmd sprkmd2 = arg0;
        sprkmd sprkmd3 = this;
        sprkmd sprkmd4 = arg0;
        sprkmd sprkmd5 = this;
        sprkmd sprkmd6 = arg0;
        super.cfr_renamed_3767(arg0);
        this.cfr_renamed_152 = arg0.cfr_renamed_152;
        this.cfr_renamed_0 = sprkmd6.cfr_renamed_0;
        sprkmd5.cfr_renamed_2 = sprkmd6.cfr_renamed_2;
        sprkmd5.cfr_renamed_93 = arg0.cfr_renamed_93;
        this.cfr_renamed_1 = sprkmd4.cfr_renamed_1;
        sprkmd3.cfr_renamed_4 = sprkmd4.cfr_renamed_4;
        sprkmd3.cfr_renamed_3 = arg0.cfr_renamed_3;
        this.cfr_renamed_119 = sprkmd2.cfr_renamed_119;
        System.arraycopy(sprkmd2.cfr_renamed_86, 0, this.cfr_renamed_86, 0, arg0.cfr_renamed_86.length);
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3838((int)arg1, (int)arg2, (int)arg3) + arg4, (int)arg5);
    }

    private /* synthetic */ int cfr_renamed_3837(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_112 > 14) {
            this.cfr_renamed_3473();
        }
        sprkmd sprkmd2 = this;
        sprkmd2.cfr_renamed_86[14] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
        sprkmd2.cfr_renamed_86[15] = (int)(arg0 >>> 32);
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3838((int)arg1, (int)arg2, (int)arg3) + arg4, (int)arg5);
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprkmd sprkmd2 = (sprkmd)arg0;
        this.cfr_renamed_3841(sprkmd2);
    }

    private /* synthetic */ int cfr_renamed_3840(int arg0, int arg1, int arg2) {
        return (arg0 | ~arg1) ^ arg2;
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3833((int)arg1, (int)arg2, (int)arg3) + arg4 + 1518500249, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprkmd sprkmd2 = this;
        sprkmd2.cfr_renamed_3120();
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_152, (byte[])arg0, (int)arg1);
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_0, (byte[])arg0, (int)(arg1 + 4));
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_2, (byte[])arg0, (int)(arg1 + 8));
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_93, (byte[])arg0, (int)(arg1 + 12));
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_1, (byte[])arg0, (int)(arg1 + 16));
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_4, (byte[])arg0, (int)(arg1 + 20));
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_3, (byte[])arg0, (int)(arg1 + 24));
        sprkmd2.cfr_renamed_3835(sprkmd2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 28));
        sprkmd2.cfr_renamed_41();
        return 32;
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        sprkmd sprkmd2 = this;
        int n2 = sprkmd2.cfr_renamed_152;
        int n3 = sprkmd2.cfr_renamed_0;
        int n4 = sprkmd2.cfr_renamed_2;
        int n5 = sprkmd2.cfr_renamed_93;
        int n6 = sprkmd2.cfr_renamed_1;
        int n7 = sprkmd2.cfr_renamed_4;
        int n8 = sprkmd2.cfr_renamed_3;
        int n9 = sprkmd2.cfr_renamed_119;
        n2 = sprkmd2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_86[0], 11);
        n5 = sprkmd2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_86[1], 14);
        n4 = sprkmd2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_86[2], 15);
        n3 = sprkmd2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_86[3], 12);
        n2 = sprkmd2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_86[4], 5);
        n5 = sprkmd2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_86[5], 8);
        n4 = sprkmd2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_86[6], 7);
        n3 = sprkmd2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_86[7], 9);
        n2 = sprkmd2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_86[8], 11);
        n5 = sprkmd2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_86[9], 13);
        n4 = sprkmd2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_86[10], 14);
        n3 = sprkmd2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_86[11], 15);
        n2 = sprkmd2.cfr_renamed_3843(n2, n3, n4, n5, this.cfr_renamed_86[12], 6);
        n5 = sprkmd2.cfr_renamed_3843(n5, n2, n3, n4, this.cfr_renamed_86[13], 7);
        n4 = sprkmd2.cfr_renamed_3843(n4, n5, n2, n3, this.cfr_renamed_86[14], 9);
        n3 = sprkmd2.cfr_renamed_3843(n3, n4, n5, n2, this.cfr_renamed_86[15], 8);
        n6 = sprkmd2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_86[5], 8);
        n9 = sprkmd2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_86[14], 9);
        n8 = sprkmd2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_86[7], 9);
        n7 = sprkmd2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_86[0], 11);
        n6 = sprkmd2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_86[9], 13);
        n9 = sprkmd2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_86[2], 15);
        n8 = sprkmd2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_86[11], 15);
        n7 = sprkmd2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_86[4], 5);
        n6 = sprkmd2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_86[13], 7);
        n9 = sprkmd2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_86[6], 7);
        n8 = sprkmd2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_86[15], 8);
        n7 = sprkmd2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_86[8], 11);
        n6 = sprkmd2.cfr_renamed_3845(n6, n7, n8, n9, this.cfr_renamed_86[1], 14);
        n9 = sprkmd2.cfr_renamed_3845(n9, n6, n7, n8, this.cfr_renamed_86[10], 14);
        n8 = sprkmd2.cfr_renamed_3845(n8, n9, n6, n7, this.cfr_renamed_86[3], 12);
        n7 = sprkmd2.cfr_renamed_3845(n7, n8, n9, n6, this.cfr_renamed_86[12], 6);
        int n10 = n2;
        n2 = n6;
        n6 = n10;
        n2 = sprkmd2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_86[7], 7);
        n5 = sprkmd2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_86[4], 6);
        n4 = sprkmd2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_86[13], 8);
        n3 = sprkmd2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_86[1], 13);
        n2 = sprkmd2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_86[10], 11);
        n5 = sprkmd2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_86[6], 9);
        n4 = sprkmd2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_86[15], 7);
        n3 = sprkmd2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_86[3], 15);
        n2 = sprkmd2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_86[12], 7);
        n5 = sprkmd2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_86[0], 12);
        n4 = sprkmd2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_86[9], 15);
        n3 = sprkmd2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_86[5], 9);
        n2 = sprkmd2.cfr_renamed_3844(n2, n3, n4, n5, this.cfr_renamed_86[2], 11);
        n5 = sprkmd2.cfr_renamed_3844(n5, n2, n3, n4, this.cfr_renamed_86[14], 7);
        n4 = sprkmd2.cfr_renamed_3844(n4, n5, n2, n3, this.cfr_renamed_86[11], 13);
        n3 = sprkmd2.cfr_renamed_3844(n3, n4, n5, n2, this.cfr_renamed_86[8], 12);
        n6 = sprkmd2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_86[6], 9);
        n9 = sprkmd2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_86[11], 13);
        n8 = sprkmd2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_86[3], 15);
        n7 = sprkmd2.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_86[7], 7);
        n6 = sprkmd2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_86[0], 12);
        n9 = sprkmd2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_86[13], 8);
        n8 = sprkmd2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_86[5], 9);
        n7 = sprkmd2.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_86[10], 11);
        n6 = sprkmd2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_86[14], 7);
        n9 = sprkmd2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_86[15], 7);
        n8 = sprkmd2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_86[8], 12);
        n7 = sprkmd2.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_86[12], 7);
        n6 = sprkmd2.cfr_renamed_3846(n6, n7, n8, n9, this.cfr_renamed_86[4], 6);
        n9 = sprkmd2.cfr_renamed_3846(n9, n6, n7, n8, this.cfr_renamed_86[9], 15);
        n8 = sprkmd2.cfr_renamed_3846(n8, n9, n6, n7, this.cfr_renamed_86[1], 13);
        sprkmd sprkmd3 = this;
        n7 = sprkmd3.cfr_renamed_3846(n7, n8, n9, n6, this.cfr_renamed_86[2], 11);
        int n11 = n3;
        n3 = n7;
        n7 = n11;
        n2 = sprkmd3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_86[3], 11);
        n5 = sprkmd3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_86[10], 13);
        n4 = sprkmd3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_86[14], 6);
        n3 = sprkmd3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_86[4], 7);
        n2 = sprkmd3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_86[9], 14);
        n5 = sprkmd3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_86[15], 9);
        n4 = sprkmd3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_86[8], 13);
        n3 = sprkmd3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_86[1], 15);
        n2 = sprkmd3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_86[2], 14);
        n5 = sprkmd3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_86[7], 8);
        n4 = sprkmd3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_86[0], 13);
        n3 = sprkmd3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_86[6], 6);
        n2 = sprkmd3.cfr_renamed_3847(n2, n3, n4, n5, this.cfr_renamed_86[13], 5);
        n5 = sprkmd3.cfr_renamed_3847(n5, n2, n3, n4, this.cfr_renamed_86[11], 12);
        n4 = sprkmd3.cfr_renamed_3847(n4, n5, n2, n3, this.cfr_renamed_86[5], 7);
        n3 = sprkmd3.cfr_renamed_3847(n3, n4, n5, n2, this.cfr_renamed_86[12], 5);
        n6 = sprkmd3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_86[15], 9);
        n9 = sprkmd3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_86[5], 7);
        n8 = sprkmd3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_86[1], 15);
        n7 = sprkmd3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_86[3], 11);
        n6 = sprkmd3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_86[7], 8);
        n9 = sprkmd3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_86[14], 6);
        n8 = sprkmd3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_86[6], 6);
        n7 = sprkmd3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_86[9], 14);
        n6 = sprkmd3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_86[11], 12);
        n9 = sprkmd3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_86[8], 13);
        n8 = sprkmd3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_86[12], 5);
        n7 = sprkmd3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_86[2], 14);
        n6 = sprkmd3.cfr_renamed_3848(n6, n7, n8, n9, this.cfr_renamed_86[10], 13);
        n9 = sprkmd3.cfr_renamed_3848(n9, n6, n7, n8, this.cfr_renamed_86[0], 13);
        n8 = sprkmd3.cfr_renamed_3848(n8, n9, n6, n7, this.cfr_renamed_86[4], 7);
        n7 = sprkmd3.cfr_renamed_3848(n7, n8, n9, n6, this.cfr_renamed_86[13], 5);
        int n12 = n4;
        n4 = n8;
        n8 = n12;
        n2 = sprkmd3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_86[1], 11);
        n5 = sprkmd3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_86[9], 12);
        n4 = sprkmd3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_86[11], 14);
        n3 = sprkmd3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_86[10], 15);
        n2 = sprkmd3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_86[0], 14);
        n5 = sprkmd3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_86[8], 15);
        n4 = sprkmd3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_86[12], 9);
        n3 = sprkmd3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_86[4], 8);
        n2 = sprkmd3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_86[13], 9);
        n5 = sprkmd3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_86[3], 14);
        n4 = sprkmd3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_86[7], 5);
        n3 = sprkmd3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_86[15], 6);
        n2 = sprkmd3.cfr_renamed_3849(n2, n3, n4, n5, this.cfr_renamed_86[14], 8);
        n5 = sprkmd3.cfr_renamed_3849(n5, n2, n3, n4, this.cfr_renamed_86[5], 6);
        n4 = sprkmd3.cfr_renamed_3849(n4, n5, n2, n3, this.cfr_renamed_86[6], 5);
        n3 = sprkmd3.cfr_renamed_3849(n3, n4, n5, n2, this.cfr_renamed_86[2], 12);
        n6 = sprkmd3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_86[8], 15);
        n9 = sprkmd3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_86[6], 5);
        n8 = sprkmd3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_86[4], 8);
        n7 = sprkmd3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_86[1], 11);
        n6 = sprkmd3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_86[3], 14);
        n9 = sprkmd3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_86[11], 14);
        n8 = sprkmd3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_86[15], 6);
        n7 = sprkmd3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_86[0], 14);
        n6 = sprkmd3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_86[5], 6);
        n9 = sprkmd3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_86[12], 9);
        n8 = sprkmd3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_86[2], 12);
        n7 = sprkmd3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_86[13], 9);
        n6 = sprkmd3.cfr_renamed_3842(n6, n7, n8, n9, this.cfr_renamed_86[9], 12);
        n9 = sprkmd3.cfr_renamed_3842(n9, n6, n7, n8, this.cfr_renamed_86[7], 5);
        n8 = sprkmd3.cfr_renamed_3842(n8, n9, n6, n7, this.cfr_renamed_86[10], 15);
        n7 = sprkmd3.cfr_renamed_3842(n7, n8, n9, n6, this.cfr_renamed_86[14], 8);
        int n13 = n5;
        n5 = n9;
        n9 = n13;
        sprkmd sprkmd4 = this;
        sprkmd sprkmd5 = this;
        sprkmd5.cfr_renamed_152 += n2;
        sprkmd5.cfr_renamed_0 += n3;
        sprkmd5.cfr_renamed_2 += n4;
        sprkmd5.cfr_renamed_93 += n5;
        sprkmd5.cfr_renamed_1 += n6;
        sprkmd5.cfr_renamed_4 += n7;
        sprkmd4.cfr_renamed_3 += n8;
        sprkmd4.cfr_renamed_119 += n9;
        sprkmd4.cfr_renamed_112 = 0;
        int n14 = n = 0;
        while (n14 != this.cfr_renamed_86.length) {
            this.cfr_renamed_86[n++] = 0;
            n14 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_3839(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    private /* synthetic */ int cfr_renamed_3838(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3833((int)arg1, (int)arg2, (int)arg3) + arg4 + 1836072691, (int)arg5);
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3840((int)arg1, (int)arg2, (int)arg3) + arg4 + 1548603684, (int)arg5);
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprrgf.cfr_renamed_9("S\u001aQ\u0016L\u00173f7");
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3839((int)arg1, (int)arg2, (int)arg3) + arg4 + 1352829926, (int)arg5);
    }

    /*
     * WARNING - void declaration
     */
    public sprkmd(sprkmd sprkmd2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_86 = new int[16];
        this.cfr_renamed_3841(sprkmd2);
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3839((int)arg1, (int)arg2, (int)arg3) + arg4 + -1894007588, (int)arg5);
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

    public sprkmd() {
        sprkmd sprkmd2 = this;
        sprkmd2.cfr_renamed_86 = new int[16];
        sprkmd2.cfr_renamed_41();
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprkmd(this);
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprkmd sprkmd2 = this;
        sprkmd sprkmd3 = this;
        sprkmd sprkmd4 = this;
        sprkmd sprkmd5 = this;
        super.cfr_renamed_41();
        this.cfr_renamed_152 = 1732584193;
        sprkmd5.cfr_renamed_0 = -271733879;
        sprkmd5.cfr_renamed_2 = -1732584194;
        sprkmd4.cfr_renamed_93 = 271733878;
        sprkmd4.cfr_renamed_1 = 1985229328;
        sprkmd3.cfr_renamed_4 = -19088744;
        sprkmd3.cfr_renamed_3 = -1985229329;
        sprkmd2.cfr_renamed_119 = 19088743;
        sprkmd2.cfr_renamed_112 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_86.length) {
            this.cfr_renamed_86[n++] = 0;
            n2 = n;
        }
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
        sprkmd sprkmd2 = this;
        return sprkmd2.cfr_renamed_3837(n + sprkmd2.cfr_renamed_3840((int)arg1, (int)arg2, (int)arg3) + arg4 + 1859775393, (int)arg5);
    }
}

