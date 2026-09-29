/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawha;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfjs;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprwjl;

public class spryal
extends sprirk {
    private static final long cfr_renamed_152 = 293L;
    private final long[] cfr_renamed_112;
    private static final long cfr_renamed_119 = 135L;
    private final int cfr_renamed_91;
    private final long cfr_renamed_1;
    private final long[] cfr_renamed_2;
    private int cfr_renamed_3;
    private static final long cfr_renamed_4 = 1061L;

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static long cfr_renamed_10011(int arg0) {
        switch (arg0) {
            case 16: {
                return 135L;
            }
            case 32: {
                return 1061L;
            }
            case 64: {
                return 293L;
            }
        }
        throw new IllegalArgumentException(sprfjs.cfr_renamed_9("I2j%&m4d*|4i0p&=h8&i7n&qd5r|d0i?m|u5|9u|u)v,i.r9b"));
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprawha.cfr_renamed_9("{mDb^jV#Bb@b_fFf@p\u0012sSpAfV"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        arg1 = sprkpk2.cfr_renamed_284();
        byte[] byArray = sprkpk2.cfr_renamed_1205();
        if (byArray.length != this.cfr_renamed_91) {
            throw new IllegalArgumentException(sprfjs.cfr_renamed_9("E)t.c2r0\u007f|i2j%&/s,v3t(&\u0015P/&3`|c$g?r0\u007f|i2c|d0i?m"));
        }
        spryal spryal2 = this;
        byte[] byArray2 = new byte[spryal2.cfr_renamed_91];
        System.arraycopy(byArray, 0, byArray2, 0, this.cfr_renamed_91);
        spryal2.cfr_renamed_2.cfr_renamed_5535(true, arg1);
        spryal2.cfr_renamed_2.cfr_renamed_3064(byArray2, 0, byArray2, 0);
        this.cfr_renamed_2.cfr_renamed_5535(arg0, arg1);
        sprpxe.cfr_renamed_447(byArray2, 0, this.cfr_renamed_2);
        System.arraycopy(spryal2.cfr_renamed_2, 0, this.cfr_renamed_112, 0, this.cfr_renamed_2.length);
        this.cfr_renamed_3 = 0;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return arg0;
    }

    @Override
    public void cfr_renamed_41() {
        spryal spryal2 = this;
        spryal2.cfr_renamed_2.cfr_renamed_41();
        System.arraycopy(spryal2.cfr_renamed_2, 0, this.cfr_renamed_112, 0, this.cfr_renamed_2.length);
        this.cfr_renamed_3 = 0;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) {
        throw new IllegalStateException(sprawha.cfr_renamed_9("GmAvBs]qFfV#]sWqSw[l\\"));
    }

    /*
     * WARNING - void declaration
     */
    public spryal(sprmr sprmr2) {
        void arg0;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_91 = arg0.cfr_renamed_1195();
        this.cfr_renamed_1 = spryal.cfr_renamed_10011(this.cfr_renamed_91);
        this.cfr_renamed_2 = new long[this.cfr_renamed_91 >>> 3];
        this.cfr_renamed_112 = new long[this.cfr_renamed_91 >>> 3];
        this.cfr_renamed_3 = -1;
    }

    private /* synthetic */ void cfr_renamed_10012(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        if (this.cfr_renamed_3 == -1) {
            throw new IllegalStateException(sprfjs.cfr_renamed_9("\u001dr(c1v(&(i|v.i?c/u|r3i|k=h%&>j3e7u"));
        }
        spryal spryal2 = this;
        ++spryal2.cfr_renamed_3;
        spryal spryal3 = this;
        spryal.cfr_renamed_10013(spryal2.cfr_renamed_1, spryal3.cfr_renamed_112);
        byte[] byArray = new byte[spryal3.cfr_renamed_91];
        sprpxe.cfr_renamed_459(spryal2.cfr_renamed_112, byArray, 0);
        byte[] byArray2 = new byte[spryal2.cfr_renamed_91];
        System.arraycopy(byArray, 0, byArray2, 0, this.cfr_renamed_91);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            int n3 = n;
            byte by = (byte)(byArray2[n3] ^ arg0[arg1 + n]);
            byArray2[n3] = by;
            n2 = ++n;
        }
        this.cfr_renamed_2.cfr_renamed_3064(byArray2, 0, byArray2, 0);
        n = 0;
        int n4 = n;
        while (n4 < this.cfr_renamed_91) {
            int n5 = arg3 + n;
            byte by = (byte)(byArray2[n] ^ byArray[n]);
            arg2[n5] = by;
            n4 = ++n;
        }
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (arg0.length - arg1 < arg2) {
            throw new sprddl(sprawha.cfr_renamed_9("J\\sGw\u0012aGeTf@#Fl]#Ak]qF"));
        }
        if (arg3.length - arg1 < arg2) {
            throw new sprwjl(sprfjs.cfr_renamed_9("I)r,s(&>s:`9t|r3i|u4i.r"));
        }
        if (arg2 % this.cfr_renamed_91 != 0) {
            throw new IllegalArgumentException(sprawha.cfr_renamed_9("SSqFjSo\u0012a^lQhA#\\lF#AvBs]qFfV"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            this.cfr_renamed_10012(arg0, arg1 + n, arg3, arg4 + n);
            n2 = n + this.cfr_renamed_91;
        }
        return arg2;
    }

    private static /* synthetic */ void cfr_renamed_10013(long arg0, long[] arg1) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            long l2 = arg1[n];
            long l3 = l2 >>> 63;
            arg1[n++] = l2 << 1 ^ l;
            l = l3;
            n2 = n;
        }
        arg1[0] = arg1[0] ^ arg0 & -l;
    }

    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        this.cfr_renamed_41();
        return 0;
    }
}

