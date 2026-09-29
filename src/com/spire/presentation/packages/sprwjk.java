/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdv;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtig;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwj;
import com.spire.presentation.packages.sprxpe;
import com.spire.presentation.packages.sprymk;

public class sprwjk
implements sprdv {
    private sprmr cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private sprwj cfr_renamed_102;
    private boolean cfr_renamed_93;
    private static final byte[] cfr_renamed_86 = sprfqe.cfr_renamed_5217(sprxpe.cfr_renamed_9(".;.:.9.8.?.>.=.<.3.2.J.I.H.O.N.M/;/:/9/8/?/>/=/</3/2/J/I/H/O/N/M"));
    private static final int cfr_renamed_152 = 4096;
    private static final long cfr_renamed_112 = 0x800000000000L;
    private byte[] cfr_renamed_119;
    private static final long cfr_renamed_91 = 0x80000000L;
    private long cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private static final int cfr_renamed_4 = 262144;

    private /* synthetic */ boolean cfr_renamed_9966(sprmr arg0) {
        return arg0.cfr_renamed_1315().equals(sprxpe.cfr_renamed_9("ZNMnzn")) || arg0.cfr_renamed_1315().equals(sprtig.cfr_renamed_9("\u0017A\u0006D"));
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        int n;
        sprwjk sprwjk2;
        if (this.cfr_renamed_93) {
            if (this.cfr_renamed_0 > 0x80000000L) {
                return -1;
            }
            if (sprymk.cfr_renamed_3306(arg0, 512)) {
                throw new IllegalArgumentException(sprxpe.cfr_renamed_9("P~si{y>dx+|bjx>{{y>y{zknm\u007f>gwfw\u007f{o>\u007fq+*;'="));
            }
        } else {
            if (this.cfr_renamed_0 > 0x800000000000L) {
                return -1;
            }
            if (sprymk.cfr_renamed_3306(arg0, 32768)) {
                throw new IllegalArgumentException(sprtig.cfr_renamed_9("\rp.g&wcj%%!l7vcu&wcw&t6`0qci*h*q&acq,%q3q4w1"));
            }
        }
        if (arg2) {
            this.cfr_renamed_9967(arg1);
            arg1 = null;
        }
        sprwjk sprwjk3 = this;
        if (arg1 != null) {
            arg1 = sprwjk3.cfr_renamed_3325(arg1, this.cfr_renamed_3);
            sprwjk sprwjk4 = this;
            sprwjk2 = sprwjk4;
            sprwjk4.cfr_renamed_3327(arg1, sprwjk4.cfr_renamed_132, this.cfr_renamed_119);
        } else {
            arg1 = new byte[sprwjk3.cfr_renamed_3 / 8];
            sprwjk2 = this;
        }
        byte[] byArray = new byte[sprwjk2.cfr_renamed_119.length];
        sprwjk sprwjk5 = this;
        this.cfr_renamed_107.cfr_renamed_5535(true, new sprtpk(sprwjk5.cfr_renamed_3323(sprwjk5.cfr_renamed_132)));
        int n2 = n = 0;
        while (n2 <= arg0.length / byArray.length) {
            int n3;
            int n4 = n3 = arg0.length - n * byArray.length > byArray.length ? byArray.length : arg0.length - n * this.cfr_renamed_119.length;
            if (n3 != 0) {
                sprwjk sprwjk6 = this;
                sprwjk6.cfr_renamed_3330(sprwjk6.cfr_renamed_119);
                sprwjk6.cfr_renamed_107.cfr_renamed_3064(this.cfr_renamed_119, 0, byArray, 0);
                System.arraycopy(byArray, 0, arg0, n * byArray.length, n3);
            }
            n2 = ++n;
        }
        sprwjk sprwjk7 = this;
        sprwjk7.cfr_renamed_3327(arg1, this.cfr_renamed_132, sprwjk7.cfr_renamed_119);
        ++this.cfr_renamed_0;
        return arg0.length * 8;
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

    private /* synthetic */ void cfr_renamed_9967(byte[] arg0) {
        sprwjk sprwjk2 = this;
        byte[] byArray = sproze.cfr_renamed_543(sprwjk2.cfr_renamed_3300(), arg0);
        sprwjk sprwjk3 = this;
        byArray = sprwjk2.cfr_renamed_3325(byArray, sprwjk3.cfr_renamed_3);
        sprwjk sprwjk4 = this;
        sprwjk3.cfr_renamed_3327(byArray, sprwjk4.cfr_renamed_132, sprwjk4.cfr_renamed_119);
        sprwjk2.cfr_renamed_0 = 1L;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_119.length * 8;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_3325(byte[] byArray, int n) {
        void arg0;
        void arg1;
        int n2 = this.cfr_renamed_107.cfr_renamed_1195();
        int n3 = byArray.length;
        void var5_5 = arg1 / 8;
        byte[] byArray2 = new byte[(8 + n3 + 1 + n2 - 1) / n2 * n2];
        sprwjk sprwjk2 = this;
        sprwjk sprwjk3 = this;
        sprwjk3.cfr_renamed_3320(byArray2, n3, 0);
        sprwjk3.cfr_renamed_3320(byArray2, (int)var5_5, 4);
        System.arraycopy(arg0, 0, byArray2, 8, n3);
        byArray2[8 + n3] = -128;
        byte[] byArray3 = new byte[sprwjk2.cfr_renamed_2 / 8 + n2];
        byte[] byArray4 = new byte[n2];
        byte[] byArray5 = new byte[n2];
        int n4 = 0;
        byte[] byArray6 = new byte[sprwjk2.cfr_renamed_2 / 8];
        System.arraycopy(cfr_renamed_86, 0, byArray6, 0, byArray6.length);
        int n5 = n4;
        while (n5 * n2 * 8 < this.cfr_renamed_2 + n2 * 8) {
            sprwjk sprwjk4 = this;
            sprwjk4.cfr_renamed_3320(byArray5, n4, 0);
            sprwjk4.cfr_renamed_3322(byArray4, byArray6, byArray5, byArray2);
            int n6 = byArray3.length - n4 * n2 > n2 ? n2 : byArray3.length - n4 * n2;
            System.arraycopy(byArray4, 0, byArray3, n4++ * n2, n6);
            n5 = n4;
        }
        byte[] byArray7 = new byte[n2];
        System.arraycopy(byArray3, 0, byArray6, 0, byArray6.length);
        System.arraycopy(byArray3, byArray6.length, byArray7, 0, byArray7.length);
        byArray3 = new byte[arg1 / 8];
        int n7 = n4 = 0;
        this.cfr_renamed_107.cfr_renamed_5535(true, new sprtpk(this.cfr_renamed_3323(byArray6)));
        while (n7 * n2 < byArray3.length) {
            this.cfr_renamed_107.cfr_renamed_3064(byArray7, 0, byArray7, 0);
            int n8 = byArray3.length - n4 * n2 > n2 ? n2 : byArray3.length - n4 * n2;
            System.arraycopy(byArray7, 0, byArray3, n4++ * n2, n8);
            n7 = n4;
        }
        return byArray3;
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

    private /* synthetic */ void cfr_renamed_3322(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        int n = this.cfr_renamed_107.cfr_renamed_1195();
        byte[] byArray = new byte[n];
        int n2 = arg3.length / n;
        byte[] byArray2 = new byte[n];
        sprwjk sprwjk2 = this;
        sprwjk2.cfr_renamed_107.cfr_renamed_5535(true, new sprtpk(this.cfr_renamed_3323(arg1)));
        sprwjk2.cfr_renamed_107.cfr_renamed_3064(arg2, 0, byArray, 0);
        int n3 = 0;
        int n4 = n3;
        while (n4 < n2) {
            sprwjk sprwjk3 = this;
            sprwjk3.cfr_renamed_3324(byArray2, byArray, arg3, n3 * n);
            sprwjk3.cfr_renamed_107.cfr_renamed_3064(byArray2, 0, byArray, 0);
            n4 = ++n3;
        }
        System.arraycopy(byArray, 0, arg0, 0, arg0.length);
    }

    private /* synthetic */ int cfr_renamed_9968(sprmr arg0, int arg1) {
        if (this.cfr_renamed_9966(arg0) && arg1 == 168) {
            return 112;
        }
        if (arg0.cfr_renamed_1315().equals(sprtig.cfr_renamed_9("D\u0006V"))) {
            return arg1;
        }
        return -1;
    }

    public byte[] cfr_renamed_3323(byte[] arg0) {
        if (this.cfr_renamed_93) {
            byte[] byArray = new byte[24];
            sprwjk sprwjk2 = this;
            this.cfr_renamed_3319(arg0, 0, byArray, 0);
            sprwjk2.cfr_renamed_3319(arg0, 7, byArray, 8);
            sprwjk2.cfr_renamed_3319(arg0, 14, byArray, 16);
            return byArray;
        }
        return arg0;
    }

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        this.cfr_renamed_9967(arg0);
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

    private /* synthetic */ byte[] cfr_renamed_3300() {
        byte[] byArray = this.cfr_renamed_102.cfr_renamed_3300();
        if (byArray.length < (this.cfr_renamed_1 + 7) / 8) {
            throw new IllegalStateException(sprxpe.cfr_renamed_9("Bpxkmxb}b{ej+{ejyq{g+nyq}wo{o>ig+{ejyq{g+mdky}n"));
        }
        return byArray;
    }

    private /* synthetic */ void cfr_renamed_3327(byte[] arg0, byte[] arg1, byte[] arg2) {
        byte[] byArray = new byte[arg0.length];
        sprwjk sprwjk2 = this;
        byte[] byArray2 = new byte[sprwjk2.cfr_renamed_107.cfr_renamed_1195()];
        int n = 0;
        int n2 = sprwjk2.cfr_renamed_107.cfr_renamed_1195();
        sprwjk2.cfr_renamed_107.cfr_renamed_5535(true, new sprtpk(this.cfr_renamed_3323(arg1)));
        int n3 = n;
        while (n3 * n2 < arg0.length) {
            sprwjk sprwjk3 = this;
            sprwjk3.cfr_renamed_3330(arg2);
            sprwjk3.cfr_renamed_107.cfr_renamed_3064(arg2, 0, byArray2, 0);
            int n4 = byArray.length - n * n2 > n2 ? n2 : byArray.length - n * n2;
            System.arraycopy(byArray2, 0, byArray, n++ * n2, n4);
            n3 = n;
        }
        this.cfr_renamed_3324(byArray, arg0, byArray, 0);
        System.arraycopy(byArray, 0, arg1, 0, arg1.length);
        System.arraycopy(byArray, arg1.length, arg2, 0, arg2.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprwjk(sprmr sprmr2, int n, int n2, sprwj sprwj2, byte[] byArray, byte[] byArray2) {
        void arg4;
        void arg5;
        void arg2;
        void arg1;
        void arg0;
        void arg3;
        sprwjk sprwjk2 = this;
        sprwjk sprwjk3 = this;
        sprwjk sprwjk4 = this;
        sprwjk4.cfr_renamed_0 = 0L;
        sprwjk4.cfr_renamed_93 = false;
        sprwjk3.cfr_renamed_102 = arg3;
        sprwjk3.cfr_renamed_107 = arg0;
        sprwjk2.cfr_renamed_2 = arg1;
        sprwjk2.cfr_renamed_1 = arg2;
        this.cfr_renamed_3 = arg1 + arg0.cfr_renamed_1195() * 8;
        this.cfr_renamed_93 = this.cfr_renamed_9966((sprmr)arg0);
        if (n2 > 256) {
            throw new IllegalArgumentException(sprtig.cfr_renamed_9("W&t6`0q&acv&f6w*q:%0q1`-b7mcl0%-j7%0p3u,w7`'%!|cq+`ca&w*s\"q*j-%%p-f7l,k"));
        }
        if (this.cfr_renamed_9968((sprmr)arg0, (int)arg1) < arg2) {
            throw new IllegalArgumentException(sprxpe.cfr_renamed_9("Y{zknm\u007f{o>x{hkyw\u007fg+m\u007flnpljc>bm+pdj+m~n{qyjnz+|r>ird}`>hw{vnl+\u007fez+ung+mbdn"));
        }
        if (arg3.cfr_renamed_3225() < arg2) {
            throw new IllegalArgumentException(sprtig.cfr_renamed_9("K,qc`-j6b+%&k7w,u:%%j1%0` p1l7|cv7w&k$q+%1`2p*w&a"));
        }
        sprwjk sprwjk5 = this;
        sprwjk5.cfr_renamed_3326(sprwjk5.cfr_renamed_3300(), (byte[])arg5, (byte[])arg4);
    }

    private /* synthetic */ void cfr_renamed_3326(byte[] arg0, byte[] arg1, byte[] arg2) {
        byte[] byArray = sproze.cfr_renamed_527(arg0, arg1, arg2);
        sprwjk sprwjk2 = this;
        sprwjk sprwjk3 = this;
        byte[] byArray2 = sprwjk2.cfr_renamed_3325(byArray, sprwjk3.cfr_renamed_3);
        int n = sprwjk3.cfr_renamed_107.cfr_renamed_1195();
        sprwjk2.cfr_renamed_132 = new byte[(sprwjk2.cfr_renamed_2 + 7) / 8];
        sprwjk2.cfr_renamed_119 = new byte[n];
        sprwjk sprwjk4 = this;
        sprwjk2.cfr_renamed_3327(byArray2, sprwjk4.cfr_renamed_132, sprwjk4.cfr_renamed_119);
        sprwjk2.cfr_renamed_0 = 1L;
    }
}

