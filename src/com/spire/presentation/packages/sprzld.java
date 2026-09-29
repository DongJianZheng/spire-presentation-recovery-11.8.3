/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjz;
import com.spire.presentation.packages.sprrfd;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprugd;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.sprzra;

public class sprzld
implements sprko,
sprrj {
    private long cfr_renamed_145;
    private byte[] cfr_renamed_114;
    private byte[] cfr_renamed_96;
    private byte[][] cfr_renamed_105;
    private sprff cfr_renamed_137;
    public short[] cfr_renamed_79;
    public byte[] cfr_renamed_107;
    private byte[] cfr_renamed_132;
    public byte[] cfr_renamed_102;
    private byte[] cfr_renamed_93;
    private byte[] cfr_renamed_86;
    public byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private static final int cfr_renamed_119 = 32;
    public byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    public byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    public short[] cfr_renamed_4;

    @Override
    public int cfr_renamed_3248() {
        return 32;
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    private /* synthetic */ byte[] cfr_renamed_3869(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            sprzld sprzld2 = this;
            sprzld2.cfr_renamed_132[4 * n] = arg0[n];
            sprzld2.cfr_renamed_132[1 + 4 * n] = arg0[8 + n];
            sprzld2.cfr_renamed_132[2 + 4 * n] = arg0[16 + n];
            int n3 = 3 + 4 * n;
            byte by = arg0[24 + n];
            sprzld2.cfr_renamed_132[n3] = by;
            n2 = ++n;
        }
        return this.cfr_renamed_132;
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

    private /* synthetic */ void cfr_renamed_3871(byte[] arg0, byte[] arg1, int arg2, byte[] arg3, int arg4) {
        sprzld sprzld2 = this;
        sprzld2.cfr_renamed_137.cfr_renamed_1217(true, new sprnld(arg0));
        sprzld2.cfr_renamed_137.cfr_renamed_3064(arg3, arg4, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3872(byte[] byArray, int n) {
        int n2;
        void arg1;
        void arg0;
        sprzld sprzld2 = this;
        System.arraycopy(arg0, (int)arg1, sprzld2.cfr_renamed_96, 0, 32);
        sprzld sprzld3 = this;
        System.arraycopy(sprzld2.cfr_renamed_114, 0, sprzld3.cfr_renamed_107, 0, 32);
        System.arraycopy(sprzld3.cfr_renamed_96, 0, this.cfr_renamed_152, 0, 32);
        int n3 = n2 = 0;
        while (n3 < 32) {
            sprzld sprzld4 = this;
            int n4 = n2;
            byte by = (byte)(sprzld4.cfr_renamed_107[n2] ^ this.cfr_renamed_152[n4]);
            sprzld4.cfr_renamed_91[n4] = by;
            n3 = ++n2;
        }
        sprzld sprzld5 = this;
        sprzld5.cfr_renamed_3871(sprzld5.cfr_renamed_3869(sprzld5.cfr_renamed_91), this.cfr_renamed_1, 0, this.cfr_renamed_114, 0);
        int n5 = n2 = 1;
        while (n5 < 4) {
            int n6;
            sprzld sprzld6 = this;
            byte[] byArray2 = sprzld6.cfr_renamed_3873(sprzld6.cfr_renamed_107);
            int n7 = n6 = 0;
            while (n7 < 32) {
                int n8 = n6;
                byte by = (byte)(byArray2[n6] ^ this.cfr_renamed_105[n2][n8]);
                this.cfr_renamed_107[n8] = by;
                n7 = ++n6;
            }
            sprzld sprzld7 = this;
            sprzld7.cfr_renamed_152 = sprzld7.cfr_renamed_3873(sprzld7.cfr_renamed_3873(sprzld7.cfr_renamed_152));
            int n9 = n6 = 0;
            while (n9 < 32) {
                sprzld sprzld8 = this;
                int n10 = n6;
                byte by = (byte)(sprzld8.cfr_renamed_107[n6] ^ this.cfr_renamed_152[n10]);
                sprzld8.cfr_renamed_91[n10] = by;
                n9 = ++n6;
            }
            sprzld sprzld9 = this;
            sprzld9.cfr_renamed_3871(sprzld9.cfr_renamed_3869(sprzld9.cfr_renamed_91), this.cfr_renamed_1, n2 * 8, this.cfr_renamed_114, n2++ * 8);
            n5 = n2;
        }
        int n11 = n2 = 0;
        while (n11 < 12) {
            sprzld sprzld10 = this;
            sprzld10.cfr_renamed_3874(sprzld10.cfr_renamed_1);
            n11 = ++n2;
        }
        int n12 = n2 = 0;
        while (n12 < 32) {
            sprzld sprzld11 = this;
            int n13 = n2;
            byte by = (byte)(sprzld11.cfr_renamed_1[n2] ^ this.cfr_renamed_96[n13]);
            sprzld11.cfr_renamed_1[n13] = by;
            n12 = ++n2;
        }
        sprzld sprzld12 = this;
        sprzld12.cfr_renamed_3874(sprzld12.cfr_renamed_1);
        int n14 = n2 = 0;
        while (n14 < 32) {
            sprzld sprzld13 = this;
            int n15 = n2;
            byte by = (byte)(sprzld13.cfr_renamed_114[n2] ^ this.cfr_renamed_1[n15]);
            sprzld13.cfr_renamed_1[n15] = by;
            n14 = ++n2;
        }
        int n16 = n2 = 0;
        while (n16 < 61) {
            sprzld sprzld14 = this;
            sprzld14.cfr_renamed_3874(sprzld14.cfr_renamed_1);
            n16 = ++n2;
        }
        System.arraycopy(this.cfr_renamed_1, 0, this.cfr_renamed_114, 0, this.cfr_renamed_114.length);
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

    private /* synthetic */ void cfr_renamed_3874(byte[] arg0) {
        sprzld sprzld2 = this;
        sprzld sprzld3 = this;
        sprzld3.cfr_renamed_3870(arg0, sprzld3.cfr_renamed_4);
        sprzld sprzld4 = this;
        sprzld2.cfr_renamed_79[15] = (short)(sprzld4.cfr_renamed_4[0] ^ this.cfr_renamed_4[1] ^ this.cfr_renamed_4[2] ^ this.cfr_renamed_4[3] ^ this.cfr_renamed_4[12] ^ this.cfr_renamed_4[15]);
        System.arraycopy(sprzld4.cfr_renamed_4, 1, this.cfr_renamed_79, 0, 15);
        sprzld2.cfr_renamed_3875(sprzld2.cfr_renamed_79, arg0);
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprzld(this);
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
        cfr_renamed_3 = byArray;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprpjz.cfr_renamed_9("?y+bK\u0002I\u0007");
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprzld sprzld2 = this;
        sprzld2.cfr_renamed_3120();
        System.arraycopy(sprzld2.cfr_renamed_114, 0, arg0, arg1, this.cfr_renamed_114.length);
        this.cfr_renamed_41();
        return 32;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprzld sprzld2 = (sprzld)arg0;
        sprzld sprzld3 = this;
        sprzld3.cfr_renamed_0 = sprzld2.cfr_renamed_0;
        sprzld3.cfr_renamed_137.cfr_renamed_1217(true, new sprrfd(null, this.cfr_renamed_0));
        sprzld3.cfr_renamed_41();
        System.arraycopy(sprzld2.cfr_renamed_114, 0, this.cfr_renamed_114, 0, sprzld2.cfr_renamed_114.length);
        System.arraycopy(sprzld2.cfr_renamed_93, 0, this.cfr_renamed_93, 0, sprzld2.cfr_renamed_93.length);
        System.arraycopy(sprzld2.cfr_renamed_96, 0, this.cfr_renamed_96, 0, sprzld2.cfr_renamed_96.length);
        System.arraycopy(sprzld2.cfr_renamed_86, 0, this.cfr_renamed_86, 0, sprzld2.cfr_renamed_86.length);
        System.arraycopy(sprzld2.cfr_renamed_105[1], 0, this.cfr_renamed_105[1], 0, sprzld2.cfr_renamed_105[1].length);
        System.arraycopy(sprzld2.cfr_renamed_105[2], 0, this.cfr_renamed_105[2], 0, sprzld2.cfr_renamed_105[2].length);
        System.arraycopy(sprzld2.cfr_renamed_105[3], 0, this.cfr_renamed_105[3], 0, sprzld2.cfr_renamed_105[3].length);
        System.arraycopy(sprzld2.cfr_renamed_112, 0, this.cfr_renamed_112, 0, sprzld2.cfr_renamed_112.length);
        sprzld sprzld4 = this;
        sprzld4.cfr_renamed_2 = sprzld2.cfr_renamed_2;
        sprzld4.cfr_renamed_145 = sprzld2.cfr_renamed_145;
    }

    public sprzld() {
        sprzld sprzld2 = this;
        sprzld sprzld3 = this;
        this.cfr_renamed_114 = new byte[32];
        sprzld3.cfr_renamed_93 = new byte[32];
        sprzld3.cfr_renamed_96 = new byte[32];
        sprzld2.cfr_renamed_86 = new byte[32];
        sprzld2.cfr_renamed_105 = new byte[4][32];
        sprzld sprzld4 = this;
        sprzld sprzld5 = this;
        sprzld sprzld6 = this;
        sprzld sprzld7 = this;
        sprzld7.cfr_renamed_112 = new byte[32];
        sprzld sprzld8 = this;
        sprzld7.cfr_renamed_137 = new sprugd();
        sprzld7.cfr_renamed_132 = new byte[32];
        sprzld6.cfr_renamed_102 = new byte[8];
        sprzld6.cfr_renamed_4 = new short[16];
        sprzld5.cfr_renamed_79 = new short[16];
        sprzld5.cfr_renamed_1 = new byte[32];
        sprzld4.cfr_renamed_107 = new byte[32];
        sprzld4.cfr_renamed_152 = new byte[32];
        this.cfr_renamed_91 = new byte[32];
        this.cfr_renamed_0 = sprugd.cfr_renamed_2388(sprvnd.cfr_renamed_9("yG|"));
        this.cfr_renamed_137.cfr_renamed_1217(true, new sprrfd(null, this.cfr_renamed_0));
        this.cfr_renamed_41();
    }

    private /* synthetic */ void cfr_renamed_3120() {
        sprzld sprzld2 = this;
        sprzld sprzld3 = sprzld2;
        sprtsa.cfr_renamed_444(this.cfr_renamed_145 * 8L, sprzld2.cfr_renamed_93, 0);
        while (sprzld3.cfr_renamed_2 != 0) {
            sprzld sprzld4 = this;
            sprzld3 = sprzld4;
            sprzld4.cfr_renamed_1221((byte)0);
        }
        sprzld sprzld5 = this;
        sprzld5.cfr_renamed_3872(sprzld5.cfr_renamed_93, 0);
        sprzld5.cfr_renamed_3872(sprzld5.cfr_renamed_86, 0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprzld sprzld2 = this;
        while (sprzld2.cfr_renamed_2 != 0 && arg2 > 0) {
            sprzld sprzld3 = this;
            sprzld2 = sprzld3;
            sprzld3.cfr_renamed_1221(arg0[arg1++]);
            --arg2;
        }
        int n = arg2;
        while (n > this.cfr_renamed_112.length) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
            sprzld sprzld4 = this;
            sprzld4.cfr_renamed_3876(sprzld4.cfr_renamed_112);
            sprzld4.cfr_renamed_3872(sprzld4.cfr_renamed_112, 0);
            arg1 += this.cfr_renamed_112.length;
            this.cfr_renamed_145 += (long)this.cfr_renamed_112.length;
            n = arg2 -= this.cfr_renamed_112.length;
        }
        int n2 = arg2;
        while (n2 > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n2 = --arg2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzld(byte[] byArray) {
        void arg0;
        sprzld sprzld2 = this;
        sprzld sprzld3 = this;
        this.cfr_renamed_114 = new byte[32];
        sprzld3.cfr_renamed_93 = new byte[32];
        sprzld3.cfr_renamed_96 = new byte[32];
        sprzld2.cfr_renamed_86 = new byte[32];
        sprzld2.cfr_renamed_105 = new byte[4][32];
        sprzld sprzld4 = this;
        sprzld sprzld5 = this;
        sprzld sprzld6 = this;
        sprzld sprzld7 = this;
        sprzld7.cfr_renamed_112 = new byte[32];
        sprzld sprzld8 = this;
        sprzld7.cfr_renamed_137 = new sprugd();
        sprzld7.cfr_renamed_132 = new byte[32];
        sprzld6.cfr_renamed_102 = new byte[8];
        sprzld6.cfr_renamed_4 = new short[16];
        sprzld5.cfr_renamed_79 = new short[16];
        sprzld5.cfr_renamed_1 = new byte[32];
        sprzld4.cfr_renamed_107 = new byte[32];
        sprzld4.cfr_renamed_152 = new byte[32];
        this.cfr_renamed_91 = new byte[32];
        this.cfr_renamed_0 = sprzra.cfr_renamed_158((byte[])arg0);
        this.cfr_renamed_137.cfr_renamed_1217(true, new sprrfd(null, this.cfr_renamed_0));
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprzld sprzld2 = this;
        sprzld2.cfr_renamed_145 = 0L;
        sprzld2.cfr_renamed_2 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_114.length) {
            this.cfr_renamed_114[n++] = 0;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_93.length) {
            this.cfr_renamed_93[n++] = 0;
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_96.length) {
            this.cfr_renamed_96[n++] = 0;
            n4 = n;
        }
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_105[1].length) {
            this.cfr_renamed_105[1][n++] = 0;
            n5 = n;
        }
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_105[3].length) {
            this.cfr_renamed_105[3][n++] = 0;
            n6 = n;
        }
        int n7 = n = 0;
        while (n7 < this.cfr_renamed_86.length) {
            this.cfr_renamed_86[n++] = 0;
            n7 = n;
        }
        int n8 = n = 0;
        while (n8 < this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n8 = n;
        }
        System.arraycopy(cfr_renamed_3, 0, this.cfr_renamed_105[2], 0, cfr_renamed_3.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprzld(sprzld sprzld2) {
        void arg0;
        sprzld sprzld3 = this;
        sprzld sprzld4 = this;
        this.cfr_renamed_114 = new byte[32];
        sprzld4.cfr_renamed_93 = new byte[32];
        sprzld4.cfr_renamed_96 = new byte[32];
        sprzld3.cfr_renamed_86 = new byte[32];
        sprzld3.cfr_renamed_105 = new byte[4][32];
        sprzld sprzld5 = this;
        sprzld sprzld6 = this;
        sprzld sprzld7 = this;
        sprzld sprzld8 = this;
        sprzld8.cfr_renamed_112 = new byte[32];
        sprzld sprzld9 = this;
        sprzld8.cfr_renamed_137 = new sprugd();
        sprzld8.cfr_renamed_132 = new byte[32];
        sprzld7.cfr_renamed_102 = new byte[8];
        sprzld7.cfr_renamed_4 = new short[16];
        sprzld6.cfr_renamed_79 = new short[16];
        sprzld6.cfr_renamed_1 = new byte[32];
        sprzld5.cfr_renamed_107 = new byte[32];
        sprzld5.cfr_renamed_152 = new byte[32];
        this.cfr_renamed_91 = new byte[32];
        this.cfr_renamed_462((sprrj)arg0);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_112[this.cfr_renamed_2++] = arg0;
        sprzld sprzld2 = this;
        if (sprzld2.cfr_renamed_2 == sprzld2.cfr_renamed_112.length) {
            sprzld sprzld3 = this;
            sprzld sprzld4 = this;
            sprzld4.cfr_renamed_3876(sprzld4.cfr_renamed_112);
            sprzld3.cfr_renamed_3872(sprzld3.cfr_renamed_112, 0);
            sprzld3.cfr_renamed_2 = 0;
        }
        ++this.cfr_renamed_145;
    }

    private /* synthetic */ void cfr_renamed_3876(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_86.length) {
            sprzld sprzld2 = this;
            int n4 = (sprzld2.cfr_renamed_86[n] & 0xFF) + (arg0[n] & 0xFF) + n2;
            sprzld2.cfr_renamed_86[n] = (byte)n4;
            n2 = n4 >>> 8;
            n3 = ++n;
        }
    }

    private /* synthetic */ byte[] cfr_renamed_3873(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3 = n;
            byte by = (byte)(arg0[n] ^ arg0[n3 + 8]);
            this.cfr_renamed_102[n3] = by;
            n2 = ++n;
        }
        System.arraycopy(arg0, 8, arg0, 0, 24);
        System.arraycopy(this.cfr_renamed_102, 0, arg0, 24, 8);
        return arg0;
    }
}

