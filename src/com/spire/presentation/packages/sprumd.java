/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdua;
import com.spire.presentation.packages.sprekd;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprywc;

public class sprumd
extends sprekd {
    private long cfr_renamed_105;
    private long cfr_renamed_102;
    private long cfr_renamed_86;
    private long cfr_renamed_152;
    private long cfr_renamed_91;
    private int cfr_renamed_0;
    private long cfr_renamed_1;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        sprumd sprumd2 = this;
        super.cfr_renamed_41();
        sprumd2.cfr_renamed_107 = sprumd2.cfr_renamed_105;
        sprumd2.cfr_renamed_93 = sprumd2.cfr_renamed_1;
        sprumd2.cfr_renamed_2 = sprumd2.cfr_renamed_91;
        sprumd2.cfr_renamed_132 = sprumd2.cfr_renamed_86;
        sprumd2.cfr_renamed_112 = sprumd2.cfr_renamed_4;
        sprumd2.cfr_renamed_119 = sprumd2.cfr_renamed_102;
        sprumd2.cfr_renamed_137 = sprumd2.cfr_renamed_3;
        sprumd2.cfr_renamed_79 = sprumd2.cfr_renamed_152;
    }

    private static /* synthetic */ void cfr_renamed_3790(int arg0, byte[] arg1, int arg2, int arg3) {
        int n = Math.min(4, arg3);
        while (--n >= 0) {
            int n2 = 8 * (3 - n);
            arg1[arg2 + n] = (byte)(arg0 >>> n2);
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprumd sprumd2 = this;
        sprumd2.cfr_renamed_3120();
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_107, arg0, arg1, this.cfr_renamed_0);
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_93, arg0, arg1 + 8, this.cfr_renamed_0 - 8);
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_2, arg0, arg1 + 16, this.cfr_renamed_0 - 16);
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_132, arg0, arg1 + 24, this.cfr_renamed_0 - 24);
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_112, arg0, arg1 + 32, this.cfr_renamed_0 - 32);
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_119, arg0, arg1 + 40, this.cfr_renamed_0 - 40);
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_137, arg0, arg1 + 48, this.cfr_renamed_0 - 48);
        sprumd.cfr_renamed_3791(sprumd2.cfr_renamed_79, arg0, arg1 + 56, this.cfr_renamed_0 - 56);
        sprumd2.cfr_renamed_41();
        return sprumd2.cfr_renamed_0;
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprumd(this);
    }

    @Override
    public byte[] cfr_renamed_2426() {
        sprumd sprumd2 = this;
        int n = sprumd2.cfr_renamed_3792();
        byte[] byArray = new byte[n + 4];
        sprumd2.cfr_renamed_3793(byArray);
        sprtsa.cfr_renamed_442(sprumd2.cfr_renamed_0 * 8, byArray, n);
        return byArray;
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprumd(int n) {
        void arg0;
        if (n >= 512) {
            throw new IllegalArgumentException(sprywc.cfr_renamed_9("v\u001f`:q\u0018s\u0002|Vw\u0017z\u0018{\u00024\u0014qV*K4C%D"));
        }
        if (arg0 % 8 != false) {
            throw new IllegalArgumentException(sprjgba.cfr_renamed_9("qtgQvsti{=}xvy`=gr3\u007fv=r=~h\u007fizm\u007fx3ru=+"));
        }
        if (arg0 == 384) {
            throw new IllegalArgumentException(sprywc.cfr_renamed_9("v\u001f`:q\u0018s\u0002|Vw\u0017z\u0018{\u00024\u0014qV'N Va\u0005qVG>UE,B4\u001fz\u0005`\u0013u\u0012"));
        }
        sprumd sprumd2 = this;
        sprumd2.cfr_renamed_0 = arg0 / 8;
        sprumd2.cfr_renamed_3794(sprumd2.cfr_renamed_0 * 8);
        sprumd2.cfr_renamed_41();
    }

    private static /* synthetic */ int cfr_renamed_3795(byte[] arg0) {
        return sprtsa.cfr_renamed_446(arg0, arg0.length - 4);
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprumd sprumd2 = (sprumd)arg0;
        if (this.cfr_renamed_0 != sprumd2.cfr_renamed_0) {
            throw new sprdua(sprjgba.cfr_renamed_9("wttx`i_x}zgu3t}|cmarcoz|gx3t}=|i{xa"));
        }
        sprumd sprumd3 = this;
        sprumd sprumd4 = sprumd2;
        sprumd sprumd5 = this;
        sprumd sprumd6 = sprumd2;
        sprumd sprumd7 = this;
        sprumd sprumd8 = sprumd2;
        super.cfr_renamed_3796(sprumd2);
        this.cfr_renamed_105 = sprumd8.cfr_renamed_105;
        sprumd7.cfr_renamed_1 = sprumd8.cfr_renamed_1;
        sprumd7.cfr_renamed_91 = sprumd2.cfr_renamed_91;
        this.cfr_renamed_86 = sprumd6.cfr_renamed_86;
        sprumd5.cfr_renamed_4 = sprumd6.cfr_renamed_4;
        sprumd5.cfr_renamed_102 = sprumd2.cfr_renamed_102;
        sprumd3.cfr_renamed_3 = sprumd4.cfr_renamed_3;
        sprumd3.cfr_renamed_152 = sprumd4.cfr_renamed_152;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprywc.cfr_renamed_9("G>U[!G&Y")).append(Integer.toString(this.cfr_renamed_0 * 8)).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprumd(sprumd sprumd2) {
        void arg0;
        void v0 = arg0;
        super((sprekd)v0);
        this.cfr_renamed_0 = v0.cfr_renamed_0;
        this.cfr_renamed_462(sprumd2);
    }

    private static /* synthetic */ void cfr_renamed_3791(long arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 > 0) {
            sprumd.cfr_renamed_3790((int)(arg0 >>> 32), arg1, arg2, arg3);
            if (arg3 > 4) {
                sprumd.cfr_renamed_3790((int)(arg0 & 0xFFFFFFFFL), arg1, arg2 + 4, arg3 - 4);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3794(int n) {
        void arg0;
        sprumd sprumd2;
        sprumd sprumd3 = this;
        sprumd sprumd4 = this;
        sprumd sprumd5 = this;
        sprumd sprumd6 = this;
        sprumd sprumd7 = this;
        sprumd sprumd8 = this;
        sprumd sprumd9 = this;
        sprumd sprumd10 = this;
        sprumd10.cfr_renamed_107 = -3482333909917012819L;
        sprumd10.cfr_renamed_93 = 2216346199247487646L;
        sprumd9.cfr_renamed_2 = -7364697282686394994L;
        sprumd9.cfr_renamed_132 = 65953792586715988L;
        sprumd8.cfr_renamed_112 = -816286391624063116L;
        sprumd8.cfr_renamed_119 = 4512832404995164602L;
        sprumd7.cfr_renamed_137 = -5033199132376557362L;
        sprumd7.cfr_renamed_79 = -124578254951840548L;
        sprumd6.cfr_renamed_1221((byte)83);
        sprumd6.cfr_renamed_1221((byte)72);
        sprumd5.cfr_renamed_1221((byte)65);
        sprumd5.cfr_renamed_1221((byte)45);
        sprumd4.cfr_renamed_1221((byte)53);
        sprumd4.cfr_renamed_1221((byte)49);
        sprumd3.cfr_renamed_1221((byte)50);
        sprumd3.cfr_renamed_1221((byte)47);
        if (n > 100) {
            sprumd sprumd11 = this;
            sprumd2 = sprumd11;
            sprumd sprumd12 = this;
            sprumd12.cfr_renamed_1221((byte)(arg0 / 100 + 48));
            sprumd11.cfr_renamed_1221((byte)((arg0 %= 100) / 10 + 48));
            sprumd12.cfr_renamed_1221((byte)((arg0 %= 10) + 48));
        } else if (arg0 > 10) {
            sprumd sprumd13 = this;
            sprumd2 = sprumd13;
            sprumd13.cfr_renamed_1221((byte)(arg0 / 10 + 48));
            sprumd13.cfr_renamed_1221((byte)((arg0 %= 10) + 48));
        } else {
            sprumd sprumd14 = this;
            sprumd2 = sprumd14;
            sprumd14.cfr_renamed_1221((byte)(arg0 + 48));
        }
        sprumd2.cfr_renamed_3120();
        sprumd sprumd15 = this;
        sprumd15.cfr_renamed_105 = sprumd15.cfr_renamed_107;
        sprumd15.cfr_renamed_1 = sprumd15.cfr_renamed_93;
        sprumd15.cfr_renamed_91 = sprumd15.cfr_renamed_2;
        sprumd15.cfr_renamed_86 = sprumd15.cfr_renamed_132;
        sprumd15.cfr_renamed_4 = sprumd15.cfr_renamed_112;
        sprumd15.cfr_renamed_102 = sprumd15.cfr_renamed_119;
        sprumd15.cfr_renamed_3 = sprumd15.cfr_renamed_137;
        sprumd15.cfr_renamed_152 = sprumd15.cfr_renamed_79;
    }

    /*
     * WARNING - void declaration
     */
    public sprumd(byte[] byArray) {
        void arg0;
        sprumd sprumd2 = this;
        sprumd2(sprumd.cfr_renamed_3795((byte[])arg0));
        sprumd2.cfr_renamed_3797(byArray);
    }
}

