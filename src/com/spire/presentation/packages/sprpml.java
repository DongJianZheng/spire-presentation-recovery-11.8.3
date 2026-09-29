/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprlgl;
import com.spire.presentation.packages.sprlyja;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqzz;

public class sprpml
extends sprlgl {
    private final byte[] cfr_renamed_2;
    private final spriil cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpml(sprpml sprpml2) {
        void arg0;
        sprpml sprpml3 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        sprpml3.cfr_renamed_2 = sproze.cfr_renamed_158(v1.cfr_renamed_2);
        sprpml3.cfr_renamed_4 = sprpml2.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4 > 64 - arg2) {
            throw new IllegalArgumentException(sprlyja.cfr_renamed_9("Z,Z\"BcG-^6ZcM\"@-A7\u000e!KcC,\\&\u000e7F\"@c\u0018w\u000e!W7K0"));
        }
        sprpml sprpml2 = this;
        System.arraycopy(arg0, arg1, sprpml2.cfr_renamed_2, sprpml2.cfr_renamed_4, arg2);
        this.cfr_renamed_4 += arg2;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4 = 0;
        sproze.cfr_renamed_3408(this.cfr_renamed_2);
    }

    @Override
    public String cfr_renamed_1315() {
        return sprqzz.cfr_renamed_9("\u0011\u000e+\u000e2\u000etZh]");
    }

    public sprpml() {
        this(spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprpml(spriil spriil2) {
        void arg0;
        sprpml sprpml2 = this;
        sprpml2.cfr_renamed_3 = arg0;
        sprpml2.cfr_renamed_2 = new byte[64];
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        if (this.cfr_renamed_4 != 64) {
            throw new IllegalStateException(sprlyja.cfr_renamed_9("G-^6ZcC6]7\u000e!KcK;O Z/Wc\u0018w\u000e!W7K0"));
        }
        if (arg0.length - arg1 < 32) {
            throw new IllegalArgumentException(sprqzz.cfr_renamed_9("6\u001a-\u001f,\u001by\u001b6\u0000y\u001c1\u0000+\u001by\u001b6O+\n:\n0\u0019<O=\u0006>\n*\u001b"));
        }
        sprpml sprpml2 = this;
        int n = sprpml2.cfr_renamed_10518(sprpml2.cfr_renamed_2, arg0, arg1);
        sprpml2.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_4 > 63) {
            throw new IllegalArgumentException(sprlyja.cfr_renamed_9("Z,Z\"BcG-^6ZcM\"@-A7\u000e!KcC,\\&\u000e7F\"@c\u0018w\u000e!W7K0"));
        }
        this.cfr_renamed_2[this.cfr_renamed_4++] = arg0;
    }

    private /* synthetic */ int cfr_renamed_10518(byte[] arg0, byte[] arg1, int arg2) {
        byte[][] byArray = new byte[4][16];
        byte[][] byArray2 = new byte[4][16];
        System.arraycopy(arg0, 0, byArray[0], 0, 16);
        System.arraycopy(arg0, 16, byArray[1], 0, 16);
        System.arraycopy(arg0, 32, byArray[2], 0, 16);
        System.arraycopy(arg0, 48, byArray[3], 0, 16);
        byte[][] byArray3 = byArray;
        byte[][] byArray4 = byArray;
        byte[][] byArray5 = byArray;
        byte[][] byArray6 = byArray;
        byArray[0] = sprpml.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[0]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[1]);
        byArray[2] = sprpml.cfr_renamed_10512(byArray[2], (byte[])cfr_renamed_3[2]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray[3], (byte[])cfr_renamed_3[3]);
        byArray[0] = sprpml.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[4]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[5]);
        byArray6[2] = sprpml.cfr_renamed_10512(byArray[2], (byte[])cfr_renamed_3[6]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray[3], (byte[])cfr_renamed_3[7]);
        this.cfr_renamed_10519(byArray6, byArray2);
        byArray[0] = sprpml.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[8]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[9]);
        byArray[2] = sprpml.cfr_renamed_10512(byArray2[2], (byte[])cfr_renamed_3[10]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray2[3], (byte[])cfr_renamed_3[11]);
        byArray[0] = sprpml.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[12]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[13]);
        byArray5[2] = sprpml.cfr_renamed_10512(byArray[2], (byte[])cfr_renamed_3[14]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray[3], (byte[])cfr_renamed_3[15]);
        this.cfr_renamed_10519(byArray5, byArray2);
        byArray[0] = sprpml.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[16]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[17]);
        byArray[2] = sprpml.cfr_renamed_10512(byArray2[2], (byte[])cfr_renamed_3[18]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray2[3], (byte[])cfr_renamed_3[19]);
        byArray[0] = sprpml.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[20]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[21]);
        byArray4[2] = sprpml.cfr_renamed_10512(byArray[2], (byte[])cfr_renamed_3[22]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray[3], (byte[])cfr_renamed_3[23]);
        this.cfr_renamed_10519(byArray4, byArray2);
        byArray[0] = sprpml.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[24]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[25]);
        byArray[2] = sprpml.cfr_renamed_10512(byArray2[2], (byte[])cfr_renamed_3[26]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray2[3], (byte[])cfr_renamed_3[27]);
        byArray[0] = sprpml.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[28]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[29]);
        byArray3[2] = sprpml.cfr_renamed_10512(byArray[2], (byte[])cfr_renamed_3[30]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray[3], (byte[])cfr_renamed_3[31]);
        this.cfr_renamed_10519(byArray3, byArray2);
        byArray[0] = sprpml.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[32]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[33]);
        byArray[2] = sprpml.cfr_renamed_10512(byArray2[2], (byte[])cfr_renamed_3[34]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray2[3], (byte[])cfr_renamed_3[35]);
        byArray[0] = sprpml.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[36]);
        byArray[1] = sprpml.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[37]);
        byArray[2] = sprpml.cfr_renamed_10512(byArray[2], (byte[])cfr_renamed_3[38]);
        byArray[3] = sprpml.cfr_renamed_10512(byArray[3], (byte[])cfr_renamed_3[39]);
        this.cfr_renamed_10519(byArray, byArray2);
        byArray[0] = sprpml.cfr_renamed_10062(byArray2[0], arg0, 0);
        byArray[1] = sprpml.cfr_renamed_10062(byArray2[1], arg0, 16);
        byArray[2] = sprpml.cfr_renamed_10062(byArray2[2], arg0, 32);
        byArray[3] = sprpml.cfr_renamed_10062(byArray2[3], arg0, 48);
        System.arraycopy(byArray[0], 8, arg1, arg2, 8);
        System.arraycopy(byArray[1], 8, arg1, arg2 + 8, 8);
        System.arraycopy(byArray[2], 0, arg1, arg2 + 16, 8);
        System.arraycopy(byArray[3], 0, arg1, arg2 + 24, 8);
        return 32;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10519(byte[][] byArray, byte[][] byArray2) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        void v4 = arg0;
        void v5 = arg0;
        void v6 = arg0;
        void v7 = arg0;
        System.arraycopy(v7[0], 12, arg1[0], 0, 4);
        System.arraycopy(v7[2], 12, arg1[0], 4, 4);
        System.arraycopy(v6[1], 12, arg1[0], 8, 4);
        System.arraycopy(v6[3], 12, arg1[0], 12, 4);
        System.arraycopy(v5[2], 0, arg1[1], 0, 4);
        System.arraycopy(v5[0], 0, arg1[1], 4, 4);
        System.arraycopy(v4[3], 0, arg1[1], 8, 4);
        System.arraycopy(v4[1], 0, arg1[1], 12, 4);
        System.arraycopy(v3[2], 4, arg1[2], 0, 4);
        System.arraycopy(v3[0], 4, arg1[2], 4, 4);
        System.arraycopy(v2[3], 4, arg1[2], 8, 4);
        System.arraycopy(v2[1], 4, arg1[2], 12, 4);
        System.arraycopy(v1[0], 8, arg1[3], 0, 4);
        System.arraycopy(v1[2], 8, arg1[3], 4, 4);
        System.arraycopy(v0[1], 8, arg1[3], 8, 4);
        System.arraycopy(v0[3], 8, arg1[3], 12, 4);
    }
}

