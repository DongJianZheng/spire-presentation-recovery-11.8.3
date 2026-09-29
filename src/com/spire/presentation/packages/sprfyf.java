/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprscg;
import com.spire.presentation.packages.sprxzf;
import com.spire.presentation.packages.spryag;
import com.spire.presentation.packages.sprzbg;
import java.security.SecureRandom;

public class sprfyf {
    private final spryag cfr_renamed_953;
    private static final int cfr_renamed_133 = 32;
    private final int cfr_renamed_185;
    private final int spr\ufe34;
    public final sprxzf cfr_renamed_82;
    private static final int cfr_renamed_126 = 32;
    private final int cfr_renamed_88;
    public static final int cfr_renamed_31 = 10;
    private final int cfr_renamed_272;
    private final int cfr_renamed_145;
    private final int cfr_renamed_114;
    public final boolean cfr_renamed_96;
    private final int cfr_renamed_105;
    private final int cfr_renamed_137;
    private final int cfr_renamed_79;
    private final int cfr_renamed_107;
    private final sprzbg cfr_renamed_132;
    private final int cfr_renamed_102;
    private final int cfr_renamed_93;
    public static final int cfr_renamed_86 = 256;
    private static final int cfr_renamed_152 = 32;
    private final boolean cfr_renamed_112;
    private final int cfr_renamed_119;
    private final int cfr_renamed_91;
    private static final int cfr_renamed_0 = 32;
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6095(byte[] byArray, byte[] byArray2, SecureRandom secureRandom) {
        int n;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_6100((byte[])arg0, (byte[])arg1, (SecureRandom)arg2);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_105) {
            int n3 = n + this.cfr_renamed_114;
            void v2 = arg0[n];
            arg1[n3] = v2;
            n2 = ++n;
        }
        this.cfr_renamed_82.cfr_renamed_6090((byte[])arg1, (byte[])arg0, this.cfr_renamed_2 - 64);
        byte[] byArray3 = new byte[32];
        arg2.nextBytes(byArray3);
        System.arraycopy(byArray3, 0, arg1, this.cfr_renamed_2 - 32, byArray3.length);
        return 0;
    }

    private /* synthetic */ void cfr_renamed_6101(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        short[][] sArray = new short[this.cfr_renamed_119][256];
        short[][] sArray2 = new short[this.cfr_renamed_119][256];
        short[] sArray3 = new short[256];
        short[] sArray4 = new short[256];
        sprfyf sprfyf2 = this;
        sprfyf2.cfr_renamed_953.cfr_renamed_6084(arg0, 0, sArray);
        sprfyf2.cfr_renamed_953.cfr_renamed_6085(arg1, sArray2);
        sprfyf2.cfr_renamed_132.cfr_renamed_6102(sArray2, sArray, sArray3);
        sprfyf2.cfr_renamed_953.cfr_renamed_6086(arg1, this.cfr_renamed_93, sArray4);
        int n2 = n = 0;
        while (n2 < 256) {
            sArray3[++n] = (short)((sArray3[n] + this.cfr_renamed_272 - (sArray4[n] << 10 - this.cfr_renamed_79) & 0xFFFF) >> 9);
            n2 = n;
        }
        this.cfr_renamed_953.cfr_renamed_6074(arg2, sArray3);
    }

    private /* synthetic */ void cfr_renamed_6103(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        int n;
        int n2;
        sprfyf sprfyf2 = this;
        short[][][] sArray = new short[sprfyf2.cfr_renamed_119][sprfyf2.cfr_renamed_119][256];
        short[][] sArray2 = new short[this.cfr_renamed_119][256];
        short[][] sArray3 = new short[this.cfr_renamed_119][256];
        short[][] sArray4 = new short[this.cfr_renamed_119][256];
        short[] sArray5 = new short[256];
        short[] sArray6 = new short[256];
        byte[] byArray = sproze.cfr_renamed_533(arg2, this.cfr_renamed_93, arg2.length);
        sprfyf sprfyf3 = this;
        sprfyf3.cfr_renamed_132.cfr_renamed_6104(sArray, byArray);
        sprfyf3.cfr_renamed_132.cfr_renamed_6105(sArray2, arg1);
        sprfyf3.cfr_renamed_132.cfr_renamed_6106(sArray, sArray2, sArray3, 0);
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_119) {
            int n4 = n = 0;
            while (n4 < 256) {
                int n5 = n++;
                sArray3[n2][n5] = (short)((sArray3[n2][n5] + this.cfr_renamed_88 & 0xFFFF) >>> this.cfr_renamed_102 - 10);
                n4 = n;
            }
            n3 = ++n2;
        }
        sprfyf sprfyf4 = this;
        sprfyf4.cfr_renamed_953.cfr_renamed_6071(arg3, sArray3);
        sprfyf4.cfr_renamed_953.cfr_renamed_6085(arg2, sArray4);
        sprfyf4.cfr_renamed_132.cfr_renamed_6102(sArray4, sArray2, sArray6);
        sprfyf4.cfr_renamed_953.cfr_renamed_6083(arg0, sArray5);
        int n6 = n = 0;
        while (n6 < 256) {
            sArray6[++n] = (short)((sArray6[n] - (sArray5[n] << 9) + this.cfr_renamed_88 & 0xFFFF) >>> 10 - this.cfr_renamed_79);
            n6 = n;
        }
        this.cfr_renamed_953.cfr_renamed_6073(arg3, this.cfr_renamed_93, sArray6);
    }

    public static void cfr_renamed_6107(byte[] arg0, byte[] arg1, int arg2, int arg3, byte arg4) {
        int n;
        arg4 = -arg4;
        int n2 = n = 0;
        while (n2 < arg3) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg4 & (arg1[n + arg2] ^ arg0[n]));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public int cfr_renamed_6080() {
        return 10;
    }

    public int cfr_renamed_6108() {
        return 32;
    }

    public int cfr_renamed_6076() {
        return 256;
    }

    public int cfr_renamed_6081() {
        return 32;
    }

    private /* synthetic */ void cfr_renamed_6100(byte[] arg0, byte[] arg1, SecureRandom arg2) {
        int n;
        sprfyf sprfyf2 = this;
        short[][][] sArray = new short[sprfyf2.cfr_renamed_119][sprfyf2.cfr_renamed_119][256];
        short[][] sArray2 = new short[this.cfr_renamed_119][256];
        short[][] sArray3 = new short[this.cfr_renamed_119][256];
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[32];
        sprfyf sprfyf3 = this;
        SecureRandom secureRandom = arg2;
        secureRandom.nextBytes(byArray);
        sprfyf3.cfr_renamed_82.cfr_renamed_6091(byArray, byArray, 32, 32);
        secureRandom.nextBytes(byArray2);
        sprfyf sprfyf4 = this;
        sprfyf4.cfr_renamed_132.cfr_renamed_6104(sArray, byArray);
        sprfyf3.cfr_renamed_132.cfr_renamed_6105(sArray2, byArray2);
        sprfyf4.cfr_renamed_132.cfr_renamed_6106(sArray, sArray2, sArray3, 1);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 256) {
                int n5 = n3++;
                sArray3[n][n5] = (short)((sArray3[n][n5] + this.cfr_renamed_88 & 0xFFFF) >>> this.cfr_renamed_102 - 10);
                n4 = n3;
            }
            n2 = ++n;
        }
        sprfyf sprfyf5 = this;
        sprfyf5.cfr_renamed_953.cfr_renamed_6088(arg1, sArray2);
        sprfyf5.cfr_renamed_953.cfr_renamed_6071(arg0, sArray3);
        System.arraycopy(byArray, 0, arg0, this.cfr_renamed_93, byArray.length);
    }

    public int cfr_renamed_6109() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_6078() {
        return this.cfr_renamed_79;
    }

    public spryag cfr_renamed_6110() {
        return this.cfr_renamed_953;
    }

    public int cfr_renamed_6111() {
        return 32;
    }

    public int cfr_renamed_6092() {
        return this.cfr_renamed_3 / 8;
    }

    public int cfr_renamed_6093() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_6112() {
        return this.cfr_renamed_137;
    }

    public int cfr_renamed_6096() {
        return this.cfr_renamed_185;
    }

    public int cfr_renamed_6079() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_6077() {
        return this.cfr_renamed_119;
    }

    public static int cfr_renamed_6113(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg0[n] ^ arg1[n];
            l |= (long)n3;
            n2 = ++n;
        }
        l = -l >>> 63;
        return (int)l;
    }

    public int cfr_renamed_6099(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_185];
        byte[] byArray2 = new byte[64];
        byte[] byArray3 = new byte[64];
        byte[] byArray4 = sproze.cfr_renamed_533(arg2, this.cfr_renamed_114, arg2.length);
        this.cfr_renamed_6101(arg2, arg1, byArray2);
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = 32 + n;
            byte by = arg2[this.cfr_renamed_2 - 64 + n];
            byArray2[n3] = by;
            n2 = ++n;
        }
        this.cfr_renamed_82.cfr_renamed_6089(byArray3, byArray2);
        this.cfr_renamed_6103(byArray2, sproze.cfr_renamed_533(byArray3, 32, byArray3.length), byArray4, byArray);
        sprfyf sprfyf2 = this;
        int n4 = sprfyf.cfr_renamed_6113(arg1, byArray, sprfyf2.cfr_renamed_185);
        this.cfr_renamed_82.cfr_renamed_6090(byArray3, arg1, 32);
        sprfyf.cfr_renamed_6107(byArray3, arg2, this.cfr_renamed_2 - 32, 32, (byte)n4);
        byte[] byArray5 = new byte[32];
        sprfyf2.cfr_renamed_82.cfr_renamed_6090(byArray5, byArray3, 0);
        System.arraycopy(byArray5, 0, arg0, 0, this.cfr_renamed_3 / 8);
        return 0;
    }

    public int cfr_renamed_6097(byte[] arg0, byte[] arg1, byte[] arg2, SecureRandom arg3) {
        byte[] byArray = new byte[64];
        byte[] byArray2 = new byte[64];
        byte[] byArray3 = new byte[32];
        arg3.nextBytes(byArray3);
        sprfyf sprfyf2 = this;
        sprfyf sprfyf3 = this;
        sprfyf3.cfr_renamed_82.cfr_renamed_6090(byArray3, byArray3, 0);
        System.arraycopy(byArray3, 0, byArray2, 0, 32);
        sprfyf3.cfr_renamed_82.cfr_renamed_6090(byArray2, arg2, 32);
        sprfyf2.cfr_renamed_82.cfr_renamed_6089(byArray, byArray2);
        sprfyf2.cfr_renamed_6103(byArray2, sproze.cfr_renamed_533(byArray, 32, byArray.length), arg2, arg0);
        sprfyf sprfyf4 = this;
        sprfyf4.cfr_renamed_82.cfr_renamed_6090(byArray, arg0, 32);
        byte[] byArray4 = new byte[32];
        sprfyf4.cfr_renamed_82.cfr_renamed_6090(byArray4, byArray, 0);
        System.arraycopy(byArray4, 0, arg1, 0, this.cfr_renamed_3 / 8);
        return 0;
    }

    public sprfyf(int arg0, int arg1, boolean arg2, boolean arg3) {
        sprfyf sprfyf2;
        boolean bl;
        boolean bl2;
        sprfyf sprfyf3 = this;
        this.cfr_renamed_3 = arg1;
        sprfyf3.cfr_renamed_112 = arg2;
        sprfyf3.cfr_renamed_96 = arg3;
        this.cfr_renamed_119 = arg0;
        if (this.cfr_renamed_119 == 2) {
            bl2 = arg2;
            sprfyf sprfyf4 = this;
            sprfyf4.cfr_renamed_137 = 10;
            sprfyf4.cfr_renamed_79 = 3;
        } else if (arg0 == 3) {
            bl2 = arg2;
            sprfyf sprfyf5 = this;
            sprfyf5.cfr_renamed_137 = 8;
            sprfyf5.cfr_renamed_79 = 4;
        } else {
            this.cfr_renamed_137 = 6;
            this.cfr_renamed_79 = 6;
            bl2 = arg2;
        }
        if (bl2) {
            bl = arg3;
            sprfyf sprfyf6 = this;
            sprfyf6.cfr_renamed_82 = new sprbvf();
        } else {
            this.cfr_renamed_82 = new sprscg();
            bl = arg3;
        }
        if (bl) {
            sprfyf2 = this;
            this.cfr_renamed_102 = 12;
            this.cfr_renamed_1 = 64;
        } else {
            sprfyf sprfyf7 = this;
            sprfyf2 = sprfyf7;
            sprfyf7.cfr_renamed_102 = 13;
            sprfyf7.cfr_renamed_1 = sprfyf7.cfr_renamed_137 * 256 / 8;
        }
        sprfyf2.cfr_renamed_4 = this.cfr_renamed_102 * 256 / 8;
        sprfyf sprfyf8 = this;
        this.cfr_renamed_107 = this.cfr_renamed_119 * this.cfr_renamed_4;
        this.spr\ufe34 = 320;
        this.cfr_renamed_93 = sprfyf8.cfr_renamed_119 * this.spr\ufe34;
        sprfyf8.cfr_renamed_145 = sprfyf8.cfr_renamed_79 * 256 / 8;
        sprfyf8.cfr_renamed_105 = sprfyf8.cfr_renamed_93 + 32;
        sprfyf8.cfr_renamed_114 = sprfyf8.cfr_renamed_107;
        sprfyf8.cfr_renamed_91 = sprfyf8.cfr_renamed_105;
        sprfyf8.cfr_renamed_2 = sprfyf8.cfr_renamed_114 + this.cfr_renamed_105 + 32 + 32;
        this.cfr_renamed_185 = this.cfr_renamed_93 + this.cfr_renamed_145;
        this.cfr_renamed_88 = 1 << this.cfr_renamed_102 - 10 - 1;
        this.cfr_renamed_272 = 256 - (1 << 10 - this.cfr_renamed_79 - 1) + (1 << this.cfr_renamed_102 - 10 - 1);
        this.cfr_renamed_953 = new spryag(this);
        this.cfr_renamed_132 = new sprzbg(this);
    }

    public int cfr_renamed_6094() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_6114() {
        return this.cfr_renamed_107;
    }
}

