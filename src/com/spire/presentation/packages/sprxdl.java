/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraada;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprlgl;
import com.spire.presentation.packages.sprnas;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprybl;

public class sprxdl
extends sprlgl {
    private final spriil cfr_renamed_2;
    private int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public sprxdl(spriil arg0) {
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_4 = new byte[32];
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(this, this.cfr_renamed_1218() * 4, arg0));
    }

    private /* synthetic */ int cfr_renamed_10520(byte[] arg0, byte[] arg1, int arg2) {
        byte[][] byArray = new byte[2][16];
        byte[][] byArray2 = new byte[2][16];
        System.arraycopy(arg0, 0, byArray[0], 0, 16);
        System.arraycopy(arg0, 16, byArray[1], 0, 16);
        byte[][] byArray3 = byArray;
        byte[][] byArray4 = byArray;
        byte[][] byArray5 = byArray;
        byte[][] byArray6 = byArray;
        byArray[0] = sprxdl.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[0]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[1]);
        byArray6[0] = sprxdl.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[2]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[3]);
        this.cfr_renamed_10521(byArray6, byArray2);
        byArray[0] = sprxdl.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[4]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[5]);
        byArray5[0] = sprxdl.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[6]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[7]);
        this.cfr_renamed_10521(byArray5, byArray2);
        byArray[0] = sprxdl.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[8]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[9]);
        byArray4[0] = sprxdl.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[10]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[11]);
        this.cfr_renamed_10521(byArray4, byArray2);
        byArray[0] = sprxdl.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[12]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[13]);
        byArray3[0] = sprxdl.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[14]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[15]);
        this.cfr_renamed_10521(byArray3, byArray2);
        byArray[0] = sprxdl.cfr_renamed_10512(byArray2[0], (byte[])cfr_renamed_3[16]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray2[1], (byte[])cfr_renamed_3[17]);
        byArray[0] = sprxdl.cfr_renamed_10512(byArray[0], (byte[])cfr_renamed_3[18]);
        byArray[1] = sprxdl.cfr_renamed_10512(byArray[1], (byte[])cfr_renamed_3[19]);
        this.cfr_renamed_10521(byArray, byArray2);
        byArray[0] = sprxdl.cfr_renamed_10062(byArray2[0], arg0, 0);
        byArray[1] = sprxdl.cfr_renamed_10062(byArray2[1], arg0, 16);
        System.arraycopy(byArray[0], 0, arg1, arg2, 16);
        System.arraycopy(byArray[1], 0, arg1, arg2 + 16, 16);
        return 32;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3 = 0;
        sproze.cfr_renamed_3408(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_1315() {
        return sprnas.cfr_renamed_9("mRWRNR\b\u0001\u0010\u0005");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10521(byte[][] byArray, byte[][] byArray2) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        System.arraycopy(v3[0], 0, arg1[0], 0, 4);
        System.arraycopy(v3[1], 0, arg1[0], 4, 4);
        System.arraycopy(v2[0], 4, arg1[0], 8, 4);
        System.arraycopy(v2[1], 4, arg1[0], 12, 4);
        System.arraycopy(v1[0], 8, arg1[1], 0, 4);
        System.arraycopy(v1[1], 8, arg1[1], 4, 4);
        System.arraycopy(v0[0], 12, arg1[1], 8, 4);
        System.arraycopy(v0[1], 12, arg1[1], 12, 4);
    }

    public sprxdl(sprxdl sprxdl2) {
        sprxdl sprxdl3 = sprxdl2;
        this.cfr_renamed_2 = sprxdl3.cfr_renamed_2;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sprxdl3.cfr_renamed_4);
        this.cfr_renamed_3 = sprxdl2.cfr_renamed_3;
        sprxdl sprxdl4 = this;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprxdl4, this.cfr_renamed_1218() * 4, sprxdl4.cfr_renamed_2));
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_3 > 31) {
            throw new IllegalArgumentException(spraada.cfr_renamed_9("7R7\\/\u001d*S3H7\u001d \\-S,Ic_&\u001d.R1XcI+\\-\u001dp\u000fc_:I&N"));
        }
        this.cfr_renamed_4[this.cfr_renamed_3++] = arg0;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_3 > 32 - arg2) {
            throw new IllegalArgumentException(sprnas.cfr_renamed_9("Q\\QRI\u0013L]UFQ\u0013FRK]JG\u0005Q@\u0013H\\WV\u0005GMRK\u0013\u0016\u0001\u0005Q\\G@@"));
        }
        sprxdl sprxdl2 = this;
        System.arraycopy(arg0, arg1, sprxdl2.cfr_renamed_4, sprxdl2.cfr_renamed_3, arg2);
        this.cfr_renamed_3 += arg2;
    }

    public sprxdl() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        if (this.cfr_renamed_3 != 32) {
            throw new IllegalStateException(spraada.cfr_renamed_9("*S3H7\u001d.H0Ic_&\u001d&E\"^7Q:\u001dp\u000fc_:I&N"));
        }
        if (arg0.length - arg1 < 32) {
            throw new IllegalArgumentException(sprnas.cfr_renamed_9("JFQCPG\u0005GJ\\\u0005@M\\WG\u0005GJ\u0013WVFVLE@\u0013AZBVVG"));
        }
        sprxdl sprxdl2 = this;
        int n = sprxdl2.cfr_renamed_10520(sprxdl2.cfr_renamed_4, arg0, arg1);
        sprxdl2.cfr_renamed_41();
        return n;
    }
}

