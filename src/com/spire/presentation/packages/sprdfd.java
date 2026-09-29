/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwiea;

public class sprdfd
implements sprff {
    private boolean cfr_renamed_112;
    private int[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 32;
    private boolean cfr_renamed_0;
    private int[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 8;
    private static final int cfr_renamed_4 = -1640531527;

    private /* synthetic */ int cfr_renamed_3538(byte[] arg0, int arg1) {
        return arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
    }

    public sprdfd() {
        sprdfd sprdfd2 = this;
        sprdfd sprdfd3 = this;
        sprdfd3.cfr_renamed_2 = new int[4];
        sprdfd3.cfr_renamed_119 = new int[32];
        sprdfd2.cfr_renamed_1 = new int[32];
        sprdfd2.cfr_renamed_112 = false;
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (!this.cfr_renamed_112) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprwiea.cfr_renamed_9("n\u0015!\u000fn\u0012 \u0012:\u0012/\u0017'\b+\u001f")).toString());
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprjkd(sprgpa.cfr_renamed_9("J1S*W\u007fA*E9F-\u0003+L0\u0003,K0Q+"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new spreid(sprwiea.cfr_renamed_9("\u0014;\u000f>\u000e:[,\u000e(\u001d+\tn\u000f!\u0014n\b&\u0014<\u000f"));
        }
        if (this.cfr_renamed_0) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3396(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprdfd sprdfd2 = this;
        int n4 = sprdfd2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = sprdfd2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = n3 = 31;
        while (n6 >= 0) {
            int n7 = this.cfr_renamed_119[n3];
            n4 -= ((n5 -= (n4 << 4 ^ n4 >>> 5) + n4 ^ this.cfr_renamed_1[n3]) << 4 ^ n5 >>> 5) + n5 ^ n7;
            n6 = --n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprdfd sprdfd2 = this;
        int n4 = sprdfd2.cfr_renamed_3538((byte[])arg0, (int)arg1);
        int n5 = sprdfd2.cfr_renamed_3538(byArray, (int)(arg1 + 4));
        int n6 = n3 = 0;
        while (n6 < 32) {
            int n7 = this.cfr_renamed_1[n3];
            n5 += ((n4 += (n5 << 4 ^ n5 >>> 5) + n5 ^ this.cfr_renamed_119[n3]) << 4 ^ n4 >>> 5) + n4 ^ n7;
            n6 = ++n3;
        }
        this.cfr_renamed_3539(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3539(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    private /* synthetic */ void cfr_renamed_3539(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)(arg0 >>> 24);
        byArray2[arg2++] = (byte)(arg0 >>> 16);
        byArray[arg2++] = (byte)(arg0 >>> 8);
        byArray2[arg2] = (byte)arg0;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (!(arg1 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprgpa.cfr_renamed_9("6M)B3J;\u0003/B-B2F+F-\u0003/B,P:G\u007fW0\u0003\u000bf\u001e\u00036M6W\u007f\u000e\u007f")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_112 = true;
        sprnld sprnld2 = (sprnld)arg1;
        this.cfr_renamed_2402(sprnld2.cfr_renamed_1521());
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprwiea.cfr_renamed_9("\u0016/\u000b:");
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        if (arg0.length != 16) {
            throw new IllegalArgumentException(sprgpa.cfr_renamed_9("h:Z\u007fP6Y:\u00032V,W\u007fA:\u0003n\u0011g\u0003=J+Pq"));
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 4) {
            this.cfr_renamed_2[n++] = this.cfr_renamed_3538(arg0, n2);
            n2 += 4;
            n3 = n;
        }
        n2 = 0;
        int n4 = n = 0;
        while (n4 < 32) {
            sprdfd sprdfd2 = this;
            int n5 = n2;
            sprdfd2.cfr_renamed_119[n] = n5 + this.cfr_renamed_2[n5 & 3];
            int n6 = n2 -= 1640531527;
            sprdfd2.cfr_renamed_1[n++] = n6 + this.cfr_renamed_2[n6 >>> 11 & 3];
            n4 = n;
        }
    }
}

