/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehaa;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjlk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrze;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruml;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprcil
implements sprpl,
sprhx {
    public byte[] cfr_renamed_272;
    private static final int cfr_renamed_145 = 32;
    private static final byte[] cfr_renamed_114;
    private long cfr_renamed_96;
    public byte[] cfr_renamed_105;
    private final spriil cfr_renamed_137;
    public byte[] cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private int cfr_renamed_102;
    private byte[] cfr_renamed_93;
    public short[] cfr_renamed_86;
    public byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private sprmr cfr_renamed_119;
    private byte[][] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    public short[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    public byte[] cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return sprrze.cfr_renamed_9("q`e{\u0005\u001b\u0007\u001e");
    }

    private /* synthetic */ void cfr_renamed_3876(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_3.length) {
            sprcil sprcil2 = this;
            int n4 = (sprcil2.cfr_renamed_3[n] & 0xFF) + (arg0[n] & 0xFF) + n2;
            sprcil2.cfr_renamed_3[n] = (byte)n4;
            n2 = n4 >>> 8;
            n3 = ++n;
        }
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprcil(this);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprcil sprcil2 = (sprcil)arg0;
        sprcil sprcil3 = this;
        sprcil3.cfr_renamed_107 = sprcil2.cfr_renamed_107;
        sprcil3.cfr_renamed_119.cfr_renamed_5535(true, new sprjlk(null, this.cfr_renamed_107));
        sprcil3.cfr_renamed_41();
        System.arraycopy(sprcil2.cfr_renamed_112, 0, this.cfr_renamed_112, 0, sprcil2.cfr_renamed_112.length);
        System.arraycopy(sprcil2.cfr_renamed_93, 0, this.cfr_renamed_93, 0, sprcil2.cfr_renamed_93.length);
        System.arraycopy(sprcil2.cfr_renamed_0, 0, this.cfr_renamed_0, 0, sprcil2.cfr_renamed_0.length);
        System.arraycopy(sprcil2.cfr_renamed_3, 0, this.cfr_renamed_3, 0, sprcil2.cfr_renamed_3.length);
        System.arraycopy(sprcil2.cfr_renamed_91[1], 0, this.cfr_renamed_91[1], 0, sprcil2.cfr_renamed_91[1].length);
        System.arraycopy(sprcil2.cfr_renamed_91[2], 0, this.cfr_renamed_91[2], 0, sprcil2.cfr_renamed_91[2].length);
        System.arraycopy(sprcil2.cfr_renamed_91[3], 0, this.cfr_renamed_91[3], 0, sprcil2.cfr_renamed_91[3].length);
        System.arraycopy(sprcil2.cfr_renamed_2, 0, this.cfr_renamed_2, 0, sprcil2.cfr_renamed_2.length);
        sprcil sprcil4 = this;
        sprcil4.cfr_renamed_102 = sprcil2.cfr_renamed_102;
        sprcil4.cfr_renamed_96 = sprcil2.cfr_renamed_96;
    }

    public sprxq cfr_renamed_10476() {
        sprcil sprcil2 = this;
        return sprhel.cfr_renamed_10472(sprcil2, 256, sprcil2.cfr_renamed_137);
    }

    /*
     * WARNING - void declaration
     */
    public sprcil(byte[] byArray, spriil spriil2) {
        void arg0;
        void arg1;
        sprcil sprcil2 = this;
        sprcil sprcil3 = this;
        this.cfr_renamed_112 = new byte[32];
        sprcil3.cfr_renamed_93 = new byte[32];
        sprcil3.cfr_renamed_0 = new byte[32];
        sprcil2.cfr_renamed_3 = new byte[32];
        sprcil2.cfr_renamed_91 = new byte[4][32];
        sprcil sprcil4 = this;
        sprcil sprcil5 = this;
        sprcil sprcil6 = this;
        sprcil sprcil7 = this;
        sprcil sprcil8 = this;
        sprcil sprcil9 = this;
        sprcil9.cfr_renamed_2 = new byte[32];
        sprcil sprcil10 = this;
        sprcil9.cfr_renamed_119 = new spruml();
        sprcil9.cfr_renamed_132 = new byte[32];
        sprcil8.cfr_renamed_105 = new byte[8];
        sprcil8.cfr_renamed_1 = new short[16];
        sprcil7.cfr_renamed_86 = new short[16];
        sprcil7.cfr_renamed_79 = new byte[32];
        sprcil6.cfr_renamed_272 = new byte[32];
        sprcil6.cfr_renamed_4 = new byte[32];
        sprcil5.cfr_renamed_152 = new byte[32];
        sprcil5.cfr_renamed_137 = arg1;
        sprybl.cfr_renamed_9170(sprcil4.cfr_renamed_10476());
        this.cfr_renamed_107 = sproze.cfr_renamed_158((byte[])arg0);
        sprcil4.cfr_renamed_119.cfr_renamed_5535(true, new sprjlk(null, this.cfr_renamed_107));
        this.cfr_renamed_41();
    }

    private /* synthetic */ void cfr_renamed_3875(short[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length / 2) {
            arg1[n * 2 + 1] = (byte)(arg0[n] >> 8);
            int n3 = n * 2;
            byte by = (byte)arg0[n];
            arg1[n3] = by;
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprcil sprcil2 = this;
        sprcil2.cfr_renamed_96 = 0L;
        sprcil2.cfr_renamed_102 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_93.length) {
            this.cfr_renamed_93[n++] = 0;
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_0.length) {
            this.cfr_renamed_0[n++] = 0;
            n4 = n;
        }
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_91[1].length) {
            this.cfr_renamed_91[1][n++] = 0;
            n5 = n;
        }
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_91[3].length) {
            this.cfr_renamed_91[3][n++] = 0;
            n6 = n;
        }
        int n7 = n = 0;
        while (n7 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0;
            n7 = n;
        }
        int n8 = n = 0;
        while (n8 < this.cfr_renamed_2.length) {
            this.cfr_renamed_2[n++] = 0;
            n8 = n;
        }
        System.arraycopy(cfr_renamed_114, 0, this.cfr_renamed_91[2], 0, cfr_renamed_114.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprcil(spriil spriil2) {
        void arg0;
        sprcil sprcil2 = this;
        sprcil sprcil3 = this;
        this.cfr_renamed_112 = new byte[32];
        sprcil3.cfr_renamed_93 = new byte[32];
        sprcil3.cfr_renamed_0 = new byte[32];
        sprcil2.cfr_renamed_3 = new byte[32];
        sprcil2.cfr_renamed_91 = new byte[4][32];
        sprcil sprcil4 = this;
        sprcil sprcil5 = this;
        sprcil sprcil6 = this;
        sprcil sprcil7 = this;
        sprcil sprcil8 = this;
        sprcil sprcil9 = this;
        sprcil9.cfr_renamed_2 = new byte[32];
        sprcil sprcil10 = this;
        sprcil9.cfr_renamed_119 = new spruml();
        sprcil9.cfr_renamed_132 = new byte[32];
        sprcil8.cfr_renamed_105 = new byte[8];
        sprcil8.cfr_renamed_1 = new short[16];
        sprcil7.cfr_renamed_86 = new short[16];
        sprcil7.cfr_renamed_79 = new byte[32];
        sprcil6.cfr_renamed_272 = new byte[32];
        sprcil6.cfr_renamed_4 = new byte[32];
        sprcil5.cfr_renamed_152 = new byte[32];
        sprcil5.cfr_renamed_137 = arg0;
        sprybl.cfr_renamed_9170(sprcil4.cfr_renamed_10476());
        this.cfr_renamed_107 = spruml.cfr_renamed_2388(sprehaa.cfr_renamed_9("byg"));
        sprcil4.cfr_renamed_119.cfr_renamed_5535(true, new sprjlk(null, this.cfr_renamed_107));
        this.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprcil sprcil2 = this;
        sprcil2.cfr_renamed_3120();
        System.arraycopy(sprcil2.cfr_renamed_112, 0, arg0, arg1, this.cfr_renamed_112.length);
        this.cfr_renamed_41();
        return 32;
    }

    private /* synthetic */ void cfr_renamed_3120() {
        sprcil sprcil2 = this;
        sprcil sprcil3 = sprcil2;
        sprpxe.cfr_renamed_444(this.cfr_renamed_96 * 8L, sprcil2.cfr_renamed_93, 0);
        while (sprcil3.cfr_renamed_102 != 0) {
            sprcil sprcil4 = this;
            sprcil3 = sprcil4;
            sprcil4.cfr_renamed_1221((byte)0);
        }
        sprcil sprcil5 = this;
        sprcil5.cfr_renamed_3872(sprcil5.cfr_renamed_93, 0);
        sprcil5.cfr_renamed_3872(sprcil5.cfr_renamed_3, 0);
    }

    private /* synthetic */ byte[] cfr_renamed_3873(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3 = n;
            byte by = (byte)(arg0[n] ^ arg0[n3 + 8]);
            this.cfr_renamed_105[n3] = by;
            n2 = ++n;
        }
        System.arraycopy(arg0, 8, arg0, 0, 24);
        System.arraycopy(this.cfr_renamed_105, 0, arg0, 24, 8);
        return arg0;
    }

    private /* synthetic */ void cfr_renamed_3870(byte[] arg0, short[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length / 2) {
            int n3 = n;
            short s = (short)(arg0[n * 2 + 1] << 8 & 0xFF00 | arg0[n3 * 2] & 0xFF);
            arg1[n3] = s;
            n2 = ++n;
        }
    }

    public sprcil(byte[] arg0) {
        this(arg0, spriil.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3872(byte[] byArray, int n) {
        int n2;
        void arg1;
        void arg0;
        sprcil sprcil2 = this;
        System.arraycopy(arg0, (int)arg1, sprcil2.cfr_renamed_0, 0, 32);
        sprcil sprcil3 = this;
        System.arraycopy(sprcil2.cfr_renamed_112, 0, sprcil3.cfr_renamed_272, 0, 32);
        System.arraycopy(sprcil3.cfr_renamed_0, 0, this.cfr_renamed_4, 0, 32);
        int n3 = n2 = 0;
        while (n3 < 32) {
            sprcil sprcil4 = this;
            int n4 = n2;
            byte by = (byte)(sprcil4.cfr_renamed_272[n2] ^ this.cfr_renamed_4[n4]);
            sprcil4.cfr_renamed_152[n4] = by;
            n3 = ++n2;
        }
        sprcil sprcil5 = this;
        sprcil5.cfr_renamed_3871(sprcil5.cfr_renamed_3869(sprcil5.cfr_renamed_152), this.cfr_renamed_79, 0, this.cfr_renamed_112, 0);
        int n5 = n2 = 1;
        while (n5 < 4) {
            int n6;
            sprcil sprcil6 = this;
            byte[] byArray2 = sprcil6.cfr_renamed_3873(sprcil6.cfr_renamed_272);
            int n7 = n6 = 0;
            while (n7 < 32) {
                int n8 = n6;
                byte by = (byte)(byArray2[n6] ^ this.cfr_renamed_91[n2][n8]);
                this.cfr_renamed_272[n8] = by;
                n7 = ++n6;
            }
            sprcil sprcil7 = this;
            sprcil7.cfr_renamed_4 = sprcil7.cfr_renamed_3873(sprcil7.cfr_renamed_3873(sprcil7.cfr_renamed_4));
            int n9 = n6 = 0;
            while (n9 < 32) {
                sprcil sprcil8 = this;
                int n10 = n6;
                byte by = (byte)(sprcil8.cfr_renamed_272[n6] ^ this.cfr_renamed_4[n10]);
                sprcil8.cfr_renamed_152[n10] = by;
                n9 = ++n6;
            }
            sprcil sprcil9 = this;
            sprcil9.cfr_renamed_3871(sprcil9.cfr_renamed_3869(sprcil9.cfr_renamed_152), this.cfr_renamed_79, n2 * 8, this.cfr_renamed_112, n2++ * 8);
            n5 = n2;
        }
        int n11 = n2 = 0;
        while (n11 < 12) {
            sprcil sprcil10 = this;
            sprcil10.cfr_renamed_3874(sprcil10.cfr_renamed_79);
            n11 = ++n2;
        }
        int n12 = n2 = 0;
        while (n12 < 32) {
            sprcil sprcil11 = this;
            int n13 = n2;
            byte by = (byte)(sprcil11.cfr_renamed_79[n2] ^ this.cfr_renamed_0[n13]);
            sprcil11.cfr_renamed_79[n13] = by;
            n12 = ++n2;
        }
        sprcil sprcil12 = this;
        sprcil12.cfr_renamed_3874(sprcil12.cfr_renamed_79);
        int n14 = n2 = 0;
        while (n14 < 32) {
            sprcil sprcil13 = this;
            int n15 = n2;
            byte by = (byte)(sprcil13.cfr_renamed_112[n2] ^ this.cfr_renamed_79[n15]);
            sprcil13.cfr_renamed_79[n15] = by;
            n14 = ++n2;
        }
        int n16 = n2 = 0;
        while (n16 < 61) {
            sprcil sprcil14 = this;
            sprcil14.cfr_renamed_3874(sprcil14.cfr_renamed_79);
            n16 = ++n2;
        }
        System.arraycopy(this.cfr_renamed_79, 0, this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
    }

    static {
        byte[] byArray = new byte[32];
        byArray[0] = 0;
        byArray[1] = -1;
        byArray[2] = 0;
        byArray[3] = -1;
        byArray[4] = 0;
        byArray[5] = -1;
        byArray[6] = 0;
        byArray[7] = -1;
        byArray[8] = -1;
        byArray[9] = 0;
        byArray[10] = -1;
        byArray[11] = 0;
        byArray[12] = -1;
        byArray[13] = 0;
        byArray[14] = -1;
        byArray[15] = 0;
        byArray[16] = 0;
        byArray[17] = -1;
        byArray[18] = -1;
        byArray[19] = 0;
        byArray[20] = -1;
        byArray[21] = 0;
        byArray[22] = 0;
        byArray[23] = -1;
        byArray[24] = -1;
        byArray[25] = 0;
        byArray[26] = 0;
        byArray[27] = 0;
        byArray[28] = -1;
        byArray[29] = -1;
        byArray[30] = 0;
        byArray[31] = -1;
        cfr_renamed_114 = byArray;
    }

    @Override
    public int cfr_renamed_3248() {
        return 32;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprcil sprcil2 = this;
        while (sprcil2.cfr_renamed_102 != 0 && arg2 > 0) {
            sprcil sprcil3 = this;
            sprcil2 = sprcil3;
            sprcil3.cfr_renamed_1221(arg0[arg1++]);
            --arg2;
        }
        int n = arg2;
        while (n >= this.cfr_renamed_2.length) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            sprcil sprcil4 = this;
            sprcil4.cfr_renamed_3876(sprcil4.cfr_renamed_2);
            sprcil4.cfr_renamed_3872(sprcil4.cfr_renamed_2, 0);
            arg1 += this.cfr_renamed_2.length;
            this.cfr_renamed_96 += (long)this.cfr_renamed_2.length;
            n = arg2 -= this.cfr_renamed_2.length;
        }
        int n2 = arg2;
        while (n2 > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n2 = --arg2;
        }
    }

    private /* synthetic */ void cfr_renamed_3874(byte[] arg0) {
        sprcil sprcil2 = this;
        sprcil sprcil3 = this;
        sprcil3.cfr_renamed_3870(arg0, sprcil3.cfr_renamed_1);
        sprcil sprcil4 = this;
        sprcil2.cfr_renamed_86[15] = (short)(sprcil4.cfr_renamed_1[0] ^ this.cfr_renamed_1[1] ^ this.cfr_renamed_1[2] ^ this.cfr_renamed_1[3] ^ this.cfr_renamed_1[12] ^ this.cfr_renamed_1[15]);
        System.arraycopy(sprcil4.cfr_renamed_1, 1, this.cfr_renamed_86, 0, 15);
        sprcil2.cfr_renamed_3875(sprcil2.cfr_renamed_86, arg0);
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    private /* synthetic */ void cfr_renamed_3871(byte[] arg0, byte[] arg1, int arg2, byte[] arg3, int arg4) {
        sprcil sprcil2 = this;
        sprcil2.cfr_renamed_119.cfr_renamed_5535(true, new sprtpk(arg0));
        sprcil2.cfr_renamed_119.cfr_renamed_3064(arg3, arg4, arg1, arg2);
    }

    private /* synthetic */ byte[] cfr_renamed_3869(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            sprcil sprcil2 = this;
            sprcil2.cfr_renamed_132[4 * n] = arg0[n];
            sprcil2.cfr_renamed_132[1 + 4 * n] = arg0[8 + n];
            sprcil2.cfr_renamed_132[2 + 4 * n] = arg0[16 + n];
            int n3 = 3 + 4 * n;
            byte by = arg0[24 + n];
            sprcil2.cfr_renamed_132[n3] = by;
            n2 = ++n;
        }
        return this.cfr_renamed_132;
    }

    /*
     * WARNING - void declaration
     */
    public sprcil(sprcil sprcil2) {
        void arg0;
        sprcil sprcil3 = this;
        sprcil sprcil4 = this;
        this.cfr_renamed_112 = new byte[32];
        sprcil4.cfr_renamed_93 = new byte[32];
        sprcil4.cfr_renamed_0 = new byte[32];
        sprcil3.cfr_renamed_3 = new byte[32];
        sprcil3.cfr_renamed_91 = new byte[4][32];
        sprcil sprcil5 = this;
        sprcil sprcil6 = this;
        sprcil sprcil7 = this;
        sprcil sprcil8 = this;
        sprcil sprcil9 = this;
        this.cfr_renamed_2 = new byte[32];
        sprcil sprcil10 = this;
        sprcil10.cfr_renamed_119 = new spruml();
        sprcil9.cfr_renamed_132 = new byte[32];
        sprcil9.cfr_renamed_105 = new byte[8];
        sprcil8.cfr_renamed_1 = new short[16];
        sprcil8.cfr_renamed_86 = new short[16];
        sprcil7.cfr_renamed_79 = new byte[32];
        sprcil7.cfr_renamed_272 = new byte[32];
        sprcil6.cfr_renamed_4 = new byte[32];
        sprcil6.cfr_renamed_152 = new byte[32];
        sprcil5.cfr_renamed_137 = arg0.cfr_renamed_137;
        sprybl.cfr_renamed_9170(sprcil5.cfr_renamed_10476());
        sprcil5.cfr_renamed_5183((sprhx)arg0);
    }

    public sprcil() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2[this.cfr_renamed_102++] = arg0;
        sprcil sprcil2 = this;
        if (sprcil2.cfr_renamed_102 == sprcil2.cfr_renamed_2.length) {
            sprcil sprcil3 = this;
            sprcil sprcil4 = this;
            sprcil4.cfr_renamed_3876(sprcil4.cfr_renamed_2);
            sprcil3.cfr_renamed_3872(sprcil3.cfr_renamed_2, 0);
            sprcil3.cfr_renamed_102 = 0;
        }
        ++this.cfr_renamed_96;
    }
}

