/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbe;
import com.spire.presentation.packages.spref;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpsh;
import com.spire.presentation.packages.spryxaa;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzrc;

public class sprswc
implements spref {
    private static final int cfr_renamed_132 = 262144;
    private sprbe cfr_renamed_102;
    private int cfr_renamed_93;
    private boolean cfr_renamed_86;
    private static final byte[] cfr_renamed_152 = sprmma.cfr_renamed_488(sprpsh.cfr_renamed_9(";F;G;D;E;B;C;@;A;N;O;7;4;5;2;3;0:F:G:D:E:B:C:@:A:N:O:7:4:5:2:3:0"));
    private sprff cfr_renamed_112;
    private long cfr_renamed_119;
    private static final long cfr_renamed_91 = 0x80000000L;
    private static final long cfr_renamed_0 = 0x800000000000L;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private static final int cfr_renamed_4 = 4096;

    private /* synthetic */ void cfr_renamed_3319(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = arg3;
        int n3 = arg3;
        int n4 = arg3;
        arg2[arg3 + 0] = (byte)(arg0[arg1 + 0] & 0xFE);
        arg2[n4 + 1] = (byte)(arg0[arg1 + 0] << 7 | (arg0[arg1 + 1] & 0xFC) >>> 1);
        arg2[n4 + 2] = (byte)(arg0[arg1 + 1] << 6 | (arg0[arg1 + 2] & 0xF8) >>> 2);
        arg2[arg3 + 3] = (byte)(arg0[arg1 + 2] << 5 | (arg0[arg1 + 3] & 0xF0) >>> 3);
        arg2[n3 + 4] = (byte)(arg0[arg1 + 3] << 4 | (arg0[arg1 + 4] & 0xE0) >>> 4);
        arg2[n3 + 5] = (byte)(arg0[arg1 + 4] << 3 | (arg0[arg1 + 5] & 0xC0) >>> 5);
        arg2[arg3 + 6] = (byte)(arg0[arg1 + 5] << 2 | (arg0[arg1 + 6] & 0x80) >>> 6);
        arg2[n2 + 7] = (byte)(arg0[arg1 + 6] << 1);
        int n5 = n = n2;
        while (n5 <= arg3 + 7) {
            byte by = arg2[n];
            arg2[n++] = (byte)(by & 0xFE | (by >> 1 ^ by >> 2 ^ by >> 3 ^ by >> 4 ^ by >> 5 ^ by >> 6 ^ by >> 7 ^ 1) & 1);
            n5 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3320(byte[] byArray, int n, int n2) {
        void arg1;
        void arg2;
        void arg0;
        void v0 = arg0;
        void v1 = arg2;
        arg0[arg2 + false] = (byte)(arg1 >> 24);
        arg0[v1 + true] = (byte)(arg1 >> 16);
        v0[v1 + 2] = (byte)(arg1 >> 8);
        v0[n2 + 3] = (byte)arg1;
    }

    private /* synthetic */ boolean cfr_renamed_3321(sprff arg0) {
        return arg0.cfr_renamed_1315().equals(sprpsh.cfr_renamed_9("O3X\u0013o\u0013")) || arg0.cfr_renamed_1315().equals(spryxaa.cfr_renamed_9("\u0011y\u0000|"));
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_1.length * 8;
    }

    private /* synthetic */ void cfr_renamed_3322(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        int n = this.cfr_renamed_112.cfr_renamed_1195();
        byte[] byArray = new byte[n];
        int n2 = arg3.length / n;
        byte[] byArray2 = new byte[n];
        sprswc sprswc2 = this;
        sprswc2.cfr_renamed_112.cfr_renamed_1217(true, new sprnld(this.cfr_renamed_3323(arg1)));
        sprswc2.cfr_renamed_112.cfr_renamed_3064(arg2, 0, byArray, 0);
        int n3 = 0;
        int n4 = n3;
        while (n4 < n2) {
            sprswc sprswc3 = this;
            sprswc3.cfr_renamed_3324(byArray2, byArray, arg3, n3 * n);
            sprswc3.cfr_renamed_112.cfr_renamed_3064(byArray2, 0, byArray, 0);
            n4 = ++n3;
        }
        System.arraycopy(byArray, 0, arg0, 0, arg0.length);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_3325(byte[] byArray, int n) {
        void arg0;
        void arg1;
        int n2 = this.cfr_renamed_112.cfr_renamed_1195();
        int n3 = byArray.length;
        void var5_5 = arg1 / 8;
        byte[] byArray2 = new byte[(8 + n3 + 1 + n2 - 1) / n2 * n2];
        sprswc sprswc2 = this;
        sprswc sprswc3 = this;
        sprswc3.cfr_renamed_3320(byArray2, n3, 0);
        sprswc3.cfr_renamed_3320(byArray2, (int)var5_5, 4);
        System.arraycopy(arg0, 0, byArray2, 8, n3);
        byArray2[8 + n3] = -128;
        byte[] byArray3 = new byte[sprswc2.cfr_renamed_93 / 8 + n2];
        byte[] byArray4 = new byte[n2];
        byte[] byArray5 = new byte[n2];
        int n4 = 0;
        byte[] byArray6 = new byte[sprswc2.cfr_renamed_93 / 8];
        System.arraycopy(cfr_renamed_152, 0, byArray6, 0, byArray6.length);
        int n5 = n4;
        while (n5 * n2 * 8 < this.cfr_renamed_93 + n2 * 8) {
            sprswc sprswc4 = this;
            sprswc4.cfr_renamed_3320(byArray5, n4, 0);
            sprswc4.cfr_renamed_3322(byArray4, byArray6, byArray5, byArray2);
            int n6 = byArray3.length - n4 * n2 > n2 ? n2 : byArray3.length - n4 * n2;
            System.arraycopy(byArray4, 0, byArray3, n4++ * n2, n6);
            n5 = n4;
        }
        byte[] byArray7 = new byte[n2];
        System.arraycopy(byArray3, 0, byArray6, 0, byArray6.length);
        System.arraycopy(byArray3, byArray6.length, byArray7, 0, byArray7.length);
        byArray3 = new byte[arg1 / 2];
        int n7 = n4 = 0;
        this.cfr_renamed_112.cfr_renamed_1217(true, new sprnld(this.cfr_renamed_3323(byArray6)));
        while (n7 * n2 < byArray3.length) {
            this.cfr_renamed_112.cfr_renamed_3064(byArray7, 0, byArray7, 0);
            int n8 = byArray3.length - n4 * n2 > n2 ? n2 : byArray3.length - n4 * n2;
            System.arraycopy(byArray7, 0, byArray3, n4++ * n2, n8);
            n7 = n4;
        }
        return byArray3;
    }

    private /* synthetic */ void cfr_renamed_3326(byte[] arg0, byte[] arg1, byte[] arg2) {
        byte[] byArray = sprzra.cfr_renamed_527(arg0, arg1, arg2);
        sprswc sprswc2 = this;
        sprswc sprswc3 = this;
        byte[] byArray2 = sprswc2.cfr_renamed_3325(byArray, sprswc3.cfr_renamed_3);
        int n = sprswc3.cfr_renamed_112.cfr_renamed_1195();
        sprswc2.cfr_renamed_2 = new byte[(sprswc2.cfr_renamed_93 + 7) / 8];
        sprswc2.cfr_renamed_1 = new byte[n];
        sprswc sprswc4 = this;
        sprswc2.cfr_renamed_3327(byArray2, sprswc4.cfr_renamed_2, sprswc4.cfr_renamed_1);
        sprswc2.cfr_renamed_119 = 1L;
    }

    /*
     * WARNING - void declaration
     */
    public sprswc(sprff sprff2, int n, int n2, sprbe sprbe2, byte[] byArray, byte[] byArray2) {
        void arg4;
        void arg5;
        void arg2;
        void arg1;
        void arg0;
        void arg3;
        sprswc sprswc2 = this;
        sprswc sprswc3 = this;
        sprswc3.cfr_renamed_119 = 0L;
        sprswc3.cfr_renamed_86 = false;
        sprswc2.cfr_renamed_102 = arg3;
        sprswc2.cfr_renamed_112 = arg0;
        this.cfr_renamed_93 = arg1;
        this.cfr_renamed_3 = this.cfr_renamed_93 + arg0.cfr_renamed_1195() * 8;
        this.cfr_renamed_86 = this.cfr_renamed_3321((sprff)arg0);
        if (n2 > 256) {
            throw new IllegalArgumentException(spryxaa.cfr_renamed_9("o L0X6I YeN ^0O,I<\u001d6I7X+Z1UeT6\u001d+R1\u001d6H5M*O1X!\u001d'DeI-XeY O,K$I,R+\u001d#H+^1T*S"));
        }
        if (this.cfr_renamed_3328((sprff)arg0, (int)arg1) < arg2) {
            throw new IllegalArgumentException(sprpsh.cfr_renamed_9("$n\u0007~\u0013x\u0002n\u0012+\u0005n\u0015~\u0004b\u0002rVx\u0002y\u0013e\u0011\u007f\u001e+\u001fxVe\u0019\u007fVx\u0003{\u0006d\u0004\u007f\u0013oVi\u000f+\u0014g\u0019h\u001d+\u0015b\u0006c\u0013yVj\u0018oV`\u0013rVx\u001fq\u0013"));
        }
        if (arg3.cfr_renamed_3225() < arg2) {
            throw new IllegalArgumentException(spryxaa.cfr_renamed_9("s*IeX+R0Z-\u001d S1O*M<\u001d#R7\u001d6X&H7T1DeN1O S\"I-\u001d7X4H,O Y"));
        }
        byte[] byArray3 = arg3.cfr_renamed_3300();
        this.cfr_renamed_3326(byArray3, (byte[])arg5, (byte[])arg4);
    }

    private /* synthetic */ void cfr_renamed_3329(sprbe arg0, byte[] arg1) {
        byte[] byArray = sprzra.cfr_renamed_543(arg0.cfr_renamed_3300(), arg1);
        sprswc sprswc2 = this;
        byArray = sprswc2.cfr_renamed_3325(byArray, sprswc2.cfr_renamed_3);
        sprswc2.cfr_renamed_3327(byArray, this.cfr_renamed_2, this.cfr_renamed_1);
        this.cfr_renamed_119 = 1L;
    }

    private /* synthetic */ void cfr_renamed_3330(byte[] arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 1;
        while (n3 <= arg0.length) {
            int n4 = (arg0[arg0.length - n] & 0xFF) + n2;
            n2 = n4 > 255 ? 1 : 0;
            int n5 = arg0.length - n;
            arg0[n5] = (byte)n4;
            n3 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3327(byte[] arg0, byte[] arg1, byte[] arg2) {
        byte[] byArray = new byte[arg0.length];
        sprswc sprswc2 = this;
        byte[] byArray2 = new byte[sprswc2.cfr_renamed_112.cfr_renamed_1195()];
        int n = 0;
        int n2 = sprswc2.cfr_renamed_112.cfr_renamed_1195();
        sprswc2.cfr_renamed_112.cfr_renamed_1217(true, new sprnld(this.cfr_renamed_3323(arg1)));
        int n3 = n;
        while (n3 * n2 < arg0.length) {
            sprswc sprswc3 = this;
            sprswc3.cfr_renamed_3330(arg2);
            sprswc3.cfr_renamed_112.cfr_renamed_3064(arg2, 0, byArray2, 0);
            int n4 = byArray.length - n * n2 > n2 ? n2 : byArray.length - n * n2;
            System.arraycopy(byArray2, 0, byArray, n++ * n2, n4);
            n3 = n;
        }
        this.cfr_renamed_3324(byArray, arg0, byArray, 0);
        System.arraycopy(byArray, 0, arg1, 0, arg1.length);
        System.arraycopy(byArray, arg1.length, arg2, 0, arg2.length);
    }

    private /* synthetic */ int cfr_renamed_3328(sprff arg0, int arg1) {
        if (this.cfr_renamed_3321(arg0) && arg1 == 168) {
            return 112;
        }
        if (arg0.cfr_renamed_1315().equals(sprpsh.cfr_renamed_9("7N%"))) {
            return arg1;
        }
        return -1;
    }

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        sprswc sprswc2 = this;
        sprswc2.cfr_renamed_3329(sprswc2.cfr_renamed_102, arg0);
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        int n;
        sprswc sprswc2;
        if (this.cfr_renamed_86) {
            if (this.cfr_renamed_119 > 0x80000000L) {
                return -1;
            }
            if (sprzrc.cfr_renamed_3306(arg0, 512)) {
                throw new IllegalArgumentException(spryxaa.cfr_renamed_9("\u000bH(_ OeR#\u001d'T1NeM OeO L0X6IeQ,P,I YeI*\u001dq\r|\u000b"));
            }
        } else {
            if (this.cfr_renamed_119 > 0x800000000000L) {
                return -1;
            }
            if (sprzrc.cfr_renamed_3306(arg0, 32768)) {
                throw new IllegalArgumentException(sprpsh.cfr_renamed_9("E\u0003f\u0014n\u0004+\u0019mVi\u001f\u007f\u0005+\u0006n\u0004+\u0004n\u0007~\u0013x\u0002+\u001ab\u001bb\u0002n\u0012+\u0002dV9@9G?B"));
            }
        }
        if (arg2) {
            sprswc sprswc3 = this;
            sprswc3.cfr_renamed_3329(sprswc3.cfr_renamed_102, arg1);
            arg1 = null;
        }
        sprswc sprswc4 = this;
        if (arg1 != null) {
            arg1 = sprswc4.cfr_renamed_3325(arg1, this.cfr_renamed_3);
            sprswc sprswc5 = this;
            sprswc2 = sprswc5;
            sprswc5.cfr_renamed_3327(arg1, sprswc5.cfr_renamed_2, this.cfr_renamed_1);
        } else {
            arg1 = new byte[sprswc4.cfr_renamed_3];
            sprswc2 = this;
        }
        byte[] byArray = new byte[sprswc2.cfr_renamed_1.length];
        sprswc sprswc6 = this;
        this.cfr_renamed_112.cfr_renamed_1217(true, new sprnld(sprswc6.cfr_renamed_3323(sprswc6.cfr_renamed_2)));
        int n2 = n = 0;
        while (n2 < arg0.length / byArray.length) {
            sprswc sprswc7 = this;
            sprswc7.cfr_renamed_3330(sprswc7.cfr_renamed_1);
            sprswc7.cfr_renamed_112.cfr_renamed_3064(this.cfr_renamed_1, 0, byArray, 0);
            int n3 = arg0.length - n * byArray.length > byArray.length ? byArray.length : arg0.length - n * this.cfr_renamed_1.length;
            System.arraycopy(byArray, 0, arg0, n++ * byArray.length, n3);
            n2 = n;
        }
        sprswc sprswc8 = this;
        sprswc8.cfr_renamed_3327(arg1, this.cfr_renamed_2, sprswc8.cfr_renamed_1);
        ++this.cfr_renamed_119;
        return arg0.length * 8;
    }

    public byte[] cfr_renamed_3323(byte[] arg0) {
        if (this.cfr_renamed_86) {
            byte[] byArray = new byte[24];
            sprswc sprswc2 = this;
            this.cfr_renamed_3319(arg0, 0, byArray, 0);
            sprswc2.cfr_renamed_3319(arg0, 7, byArray, 8);
            sprswc2.cfr_renamed_3319(arg0, 14, byArray, 16);
            return byArray;
        }
        return arg0;
    }

    private /* synthetic */ void cfr_renamed_3324(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg1[n] ^ arg2[n3 + arg3]);
            arg0[n3] = by;
            n2 = ++n;
        }
    }
}

