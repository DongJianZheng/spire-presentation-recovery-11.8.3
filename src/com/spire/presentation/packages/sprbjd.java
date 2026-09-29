/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazo;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprvld;
import com.spire.presentation.packages.sprzkaa;

public class sprbjd
implements spruc {
    private int cfr_renamed_88;
    private int cfr_renamed_31;
    private int cfr_renamed_272;
    private int cfr_renamed_145;
    private int cfr_renamed_114;
    private int cfr_renamed_96;
    private int cfr_renamed_105;
    private int cfr_renamed_137;
    private static final int cfr_renamed_79 = 16;
    private int cfr_renamed_107;
    private final sprff cfr_renamed_132;
    private int cfr_renamed_102;
    private final byte[] cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        if (this.cfr_renamed_132 == null) {
            return sprazo.cfr_renamed_9("DOxY%\u0013$\u0015");
        }
        return new StringBuilder().insert(0, sprzkaa.cfr_renamed_9("\u0010g,qq;p=m")).append(this.cfr_renamed_132.cfr_renamed_1315()).toString();
    }

    @Override
    public int cfr_renamed_2404() {
        return 16;
    }

    @Override
    public void cfr_renamed_41() {
        sprbjd sprbjd2 = this;
        sprbjd sprbjd3 = this;
        sprbjd3.cfr_renamed_107 = 0;
        sprbjd2.cfr_renamed_88 = 0;
        sprbjd3.cfr_renamed_86 = 0;
        sprbjd2.cfr_renamed_145 = 0;
        sprbjd2.cfr_renamed_102 = 0;
        sprbjd2.cfr_renamed_105 = 0;
    }

    private static final /* synthetic */ long cfr_renamed_3470(int arg0, int arg1) {
        return (long)arg0 * (long)arg1;
    }

    private /* synthetic */ void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        sprbjd sprbjd2;
        byte[] byArray;
        if (this.cfr_renamed_132 != null && (arg1 == null || arg1.length != 16)) {
            throw new IllegalArgumentException(sprazo.cfr_renamed_9("p{Lm\u0011'\u0010!\u0000fEeU}RqS4A4\u0011&\u00184B}T4iB\u000e"));
        }
        sprvld.cfr_renamed_3472(arg0);
        int n = sprtsa.cfr_renamed_439(arg0, 16);
        int n2 = sprtsa.cfr_renamed_439(arg0, 20);
        int n3 = sprtsa.cfr_renamed_439(arg0, 24);
        int n4 = sprtsa.cfr_renamed_439(arg0, 28);
        sprbjd sprbjd3 = this;
        sprbjd sprbjd4 = this;
        sprbjd4.cfr_renamed_152 = n & 0x3FFFFFF;
        n >>>= 26;
        sprbjd3.cfr_renamed_2 = (n |= n2 << 6) & 0x3FFFF03;
        n2 >>>= 20;
        sprbjd4.cfr_renamed_112 = (n2 |= n3 << 12) & 0x3FFC0FF;
        n3 >>>= 14;
        sprbjd3.cfr_renamed_1 = (n3 |= n4 << 18) & 0x3F03FFF;
        sprbjd3.cfr_renamed_96 = (n4 >>>= 8) & 0xFFFFF;
        sprbjd3.cfr_renamed_4 = sprbjd3.cfr_renamed_2 * 5;
        sprbjd3.cfr_renamed_137 = sprbjd3.cfr_renamed_112 * 5;
        sprbjd3.cfr_renamed_3 = sprbjd3.cfr_renamed_1 * 5;
        sprbjd3.cfr_renamed_272 = sprbjd3.cfr_renamed_96 * 5;
        if (sprbjd3.cfr_renamed_132 == null) {
            byArray = arg0;
            sprbjd2 = this;
        } else {
            byArray = new byte[16];
            sprbjd sprbjd5 = this;
            sprbjd2 = sprbjd5;
            sprbjd5.cfr_renamed_132.cfr_renamed_1217(true, new sprnld(arg0, 0, 16));
            sprbjd5.cfr_renamed_132.cfr_renamed_3064(arg1, 0, byArray, 0);
        }
        sprbjd2.cfr_renamed_114 = sprtsa.cfr_renamed_439(byArray, 0);
        sprbjd sprbjd6 = this;
        this.cfr_renamed_31 = sprtsa.cfr_renamed_439(byArray, 4);
        sprbjd6.cfr_renamed_119 = sprtsa.cfr_renamed_439(byArray, 8);
        sprbjd6.cfr_renamed_91 = sprtsa.cfr_renamed_439(byArray, 12);
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        sprt sprt2;
        byte[] byArray = null;
        if (this.cfr_renamed_132 != null) {
            if (!(arg0 instanceof sprnjd)) {
                throw new IllegalArgumentException(sprzkaa.cfr_renamed_9("X/d99s8u(2m1})z%{`i.(\t^`\u007f(m.(5{%l`\u007f)|((!(\"d/k+(#a0`%zn"));
            }
            sprt2 = (sprnjd)arg0;
            byArray = ((sprnjd)sprt2).cfr_renamed_1205();
            arg0 = ((sprnjd)sprt2).cfr_renamed_284();
        }
        if (!(arg0 instanceof sprnld)) {
            throw new IllegalArgumentException(sprazo.cfr_renamed_9("DOxY%\u0013$\u00154RqQaIfEg\u0000u\u0000\u007fEm\u000e"));
        }
        sprt2 = (sprnld)arg0;
        sprbjd sprbjd2 = this;
        sprbjd2.cfr_renamed_3471(((sprnld)sprt2).cfr_renamed_1521(), byArray);
        sprbjd2.cfr_renamed_41();
    }

    public sprbjd() {
        sprbjd sprbjd2 = this;
        sprbjd sprbjd3 = this;
        sprbjd3.cfr_renamed_93 = new byte[1];
        sprbjd3.cfr_renamed_0 = new byte[16];
        sprbjd2.cfr_renamed_107 = 0;
        sprbjd2.cfr_renamed_132 = null;
    }

    private /* synthetic */ void cfr_renamed_3473() {
        if (this.cfr_renamed_107 < 16) {
            int n;
            sprbjd sprbjd2 = this;
            this.cfr_renamed_0[sprbjd2.cfr_renamed_107] = 1;
            int n2 = n = sprbjd2.cfr_renamed_107 + 1;
            while (n2 < 16) {
                this.cfr_renamed_0[n++] = 0;
                n2 = n;
            }
        }
        long l = 0xFFFFFFFFL & (long)sprtsa.cfr_renamed_439(this.cfr_renamed_0, 0);
        long l2 = 0xFFFFFFFFL & (long)sprtsa.cfr_renamed_439(this.cfr_renamed_0, 4);
        long l3 = 0xFFFFFFFFL & (long)sprtsa.cfr_renamed_439(this.cfr_renamed_0, 8);
        long l4 = 0xFFFFFFFFL & (long)sprtsa.cfr_renamed_439(this.cfr_renamed_0, 12);
        sprbjd sprbjd3 = this;
        sprbjd3.cfr_renamed_105 = (int)((long)sprbjd3.cfr_renamed_105 + (l & 0x3FFFFFFL));
        sprbjd3.cfr_renamed_102 = (int)((long)sprbjd3.cfr_renamed_102 + ((l2 << 32 | l) >>> 26 & 0x3FFFFFFL));
        sprbjd3.cfr_renamed_145 = (int)((long)sprbjd3.cfr_renamed_145 + ((l3 << 32 | l2) >>> 20 & 0x3FFFFFFL));
        sprbjd3.cfr_renamed_86 = (int)((long)sprbjd3.cfr_renamed_86 + ((l4 << 32 | l3) >>> 14 & 0x3FFFFFFL));
        sprbjd3.cfr_renamed_88 = (int)((long)sprbjd3.cfr_renamed_88 + (l4 >>> 8));
        if (sprbjd3.cfr_renamed_107 == 16) {
            this.cfr_renamed_88 += 0x1000000;
        }
        sprbjd sprbjd4 = this;
        sprbjd sprbjd5 = this;
        sprbjd sprbjd6 = this;
        sprbjd sprbjd7 = this;
        sprbjd sprbjd8 = this;
        sprbjd sprbjd9 = this;
        long l5 = sprbjd.cfr_renamed_3470(sprbjd4.cfr_renamed_105, sprbjd5.cfr_renamed_152) + sprbjd.cfr_renamed_3470(sprbjd6.cfr_renamed_102, sprbjd6.cfr_renamed_272) + sprbjd.cfr_renamed_3470(sprbjd7.cfr_renamed_145, sprbjd7.cfr_renamed_3) + sprbjd.cfr_renamed_3470(sprbjd8.cfr_renamed_86, sprbjd8.cfr_renamed_137) + sprbjd.cfr_renamed_3470(sprbjd9.cfr_renamed_88, sprbjd9.cfr_renamed_4);
        sprbjd sprbjd10 = this;
        sprbjd sprbjd11 = this;
        sprbjd sprbjd12 = this;
        sprbjd sprbjd13 = this;
        long l6 = sprbjd.cfr_renamed_3470(sprbjd4.cfr_renamed_105, this.cfr_renamed_2) + sprbjd.cfr_renamed_3470(sprbjd10.cfr_renamed_102, sprbjd10.cfr_renamed_152) + sprbjd.cfr_renamed_3470(sprbjd11.cfr_renamed_145, sprbjd11.cfr_renamed_272) + sprbjd.cfr_renamed_3470(sprbjd12.cfr_renamed_86, sprbjd12.cfr_renamed_3) + sprbjd.cfr_renamed_3470(sprbjd13.cfr_renamed_88, sprbjd13.cfr_renamed_137);
        sprbjd sprbjd14 = this;
        sprbjd sprbjd15 = this;
        sprbjd sprbjd16 = this;
        sprbjd sprbjd17 = this;
        long l7 = sprbjd.cfr_renamed_3470(sprbjd5.cfr_renamed_105, this.cfr_renamed_112) + sprbjd.cfr_renamed_3470(sprbjd14.cfr_renamed_102, sprbjd14.cfr_renamed_2) + sprbjd.cfr_renamed_3470(sprbjd15.cfr_renamed_145, sprbjd15.cfr_renamed_152) + sprbjd.cfr_renamed_3470(sprbjd16.cfr_renamed_86, sprbjd16.cfr_renamed_272) + sprbjd.cfr_renamed_3470(sprbjd17.cfr_renamed_88, sprbjd17.cfr_renamed_3);
        sprbjd sprbjd18 = this;
        sprbjd sprbjd19 = this;
        sprbjd sprbjd20 = this;
        sprbjd sprbjd21 = this;
        long l8 = sprbjd.cfr_renamed_3470(sprbjd4.cfr_renamed_105, this.cfr_renamed_1) + sprbjd.cfr_renamed_3470(sprbjd18.cfr_renamed_102, sprbjd18.cfr_renamed_112) + sprbjd.cfr_renamed_3470(sprbjd19.cfr_renamed_145, sprbjd19.cfr_renamed_2) + sprbjd.cfr_renamed_3470(sprbjd20.cfr_renamed_86, sprbjd20.cfr_renamed_152) + sprbjd.cfr_renamed_3470(sprbjd21.cfr_renamed_88, sprbjd21.cfr_renamed_272);
        sprbjd sprbjd22 = this;
        sprbjd sprbjd23 = this;
        sprbjd sprbjd24 = this;
        sprbjd sprbjd25 = this;
        long l9 = sprbjd.cfr_renamed_3470(sprbjd4.cfr_renamed_105, this.cfr_renamed_96) + sprbjd.cfr_renamed_3470(sprbjd22.cfr_renamed_102, sprbjd22.cfr_renamed_1) + sprbjd.cfr_renamed_3470(sprbjd23.cfr_renamed_145, sprbjd23.cfr_renamed_112) + sprbjd.cfr_renamed_3470(sprbjd24.cfr_renamed_86, sprbjd24.cfr_renamed_2) + sprbjd.cfr_renamed_3470(sprbjd25.cfr_renamed_88, sprbjd25.cfr_renamed_152);
        sprbjd4.cfr_renamed_105 = (int)l5 & 0x3FFFFFF;
        long l10 = l5 >>> 26;
        sprbjd4.cfr_renamed_102 = (int)(l6 += l10) & 0x3FFFFFF;
        l10 = l6 >>> 26 & 0xFFFFFFFFFFFFFFFFL;
        sprbjd4.cfr_renamed_145 = (int)(l7 += l10) & 0x3FFFFFF;
        l10 = l7 >>> 26 & 0xFFFFFFFFFFFFFFFFL;
        sprbjd4.cfr_renamed_86 = (int)(l8 += l10) & 0x3FFFFFF;
        l10 = l8 >>> 26;
        sprbjd4.cfr_renamed_88 = (int)(l9 += l10) & 0x3FFFFFF;
        l10 = l9 >>> 26;
        sprbjd4.cfr_renamed_105 = (int)((long)sprbjd4.cfr_renamed_105 + l10 * 5L);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException {
        if (arg1 + 16 > arg0.length) {
            throw new sprjkd(sprzkaa.cfr_renamed_9("\u000f}4x5|`j5n&m2(){`|/g`{(g2|n"));
        }
        if (this.cfr_renamed_107 > 0) {
            this.cfr_renamed_3473();
        }
        sprbjd sprbjd2 = this;
        int n = sprbjd2.cfr_renamed_105 >>> 26;
        sprbjd2.cfr_renamed_105 &= 0x3FFFFFF;
        sprbjd2.cfr_renamed_102 += n;
        n = sprbjd2.cfr_renamed_102 >>> 26;
        sprbjd2.cfr_renamed_102 &= 0x3FFFFFF;
        sprbjd2.cfr_renamed_145 += n;
        n = sprbjd2.cfr_renamed_145 >>> 26;
        sprbjd2.cfr_renamed_145 &= 0x3FFFFFF;
        sprbjd2.cfr_renamed_86 += n;
        n = sprbjd2.cfr_renamed_86 >>> 26;
        sprbjd2.cfr_renamed_86 &= 0x3FFFFFF;
        sprbjd2.cfr_renamed_88 += n;
        n = sprbjd2.cfr_renamed_88 >>> 26;
        sprbjd2.cfr_renamed_88 &= 0x3FFFFFF;
        sprbjd2.cfr_renamed_105 += n * 5;
        int n2 = sprbjd2.cfr_renamed_105 + 5;
        n = n2 >>> 26;
        n2 &= 0x3FFFFFF;
        int n3 = sprbjd2.cfr_renamed_102 + n;
        n = n3 >>> 26;
        n3 &= 0x3FFFFFF;
        int n4 = sprbjd2.cfr_renamed_145 + n;
        n = n4 >>> 26;
        n4 &= 0x3FFFFFF;
        int n5 = sprbjd2.cfr_renamed_86 + n;
        n = n5 >>> 26;
        n5 &= 0x3FFFFFF;
        int n6 = sprbjd2.cfr_renamed_88 + n - 0x4000000;
        n = (n6 >>> 31) - 1;
        int n7 = ~n;
        sprbjd2.cfr_renamed_105 = sprbjd2.cfr_renamed_105 & n7 | n2 & n;
        sprbjd2.cfr_renamed_102 = sprbjd2.cfr_renamed_102 & n7 | n3 & n;
        sprbjd2.cfr_renamed_145 = sprbjd2.cfr_renamed_145 & n7 | n4 & n;
        sprbjd2.cfr_renamed_86 = sprbjd2.cfr_renamed_86 & n7 | n5 & n;
        sprbjd2.cfr_renamed_88 = sprbjd2.cfr_renamed_88 & n7 | n6 & n;
        long l = ((long)(sprbjd2.cfr_renamed_105 | this.cfr_renamed_102 << 26) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_114);
        long l2 = ((long)(sprbjd2.cfr_renamed_102 >>> 6 | this.cfr_renamed_145 << 20) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_31);
        long l3 = ((long)(sprbjd2.cfr_renamed_145 >>> 12 | this.cfr_renamed_86 << 14) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_119);
        long l4 = ((long)(sprbjd2.cfr_renamed_86 >>> 18 | this.cfr_renamed_88 << 8) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_91);
        sprtsa.cfr_renamed_437((int)l, arg0, arg1);
        sprtsa.cfr_renamed_437((int)(l2 += l >>> 32), arg0, arg1 + 4);
        sprtsa.cfr_renamed_437((int)(l3 += l2 >>> 32), arg0, arg1 + 8);
        sprtsa.cfr_renamed_437((int)(l4 += l3 >>> 32), arg0, arg1 + 12);
        sprbjd2.cfr_renamed_41();
        return 16;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalStateException {
        int n = 0;
        int n2 = arg2;
        while (n2 > n) {
            if (this.cfr_renamed_107 == 16) {
                this.cfr_renamed_3473();
                this.cfr_renamed_107 = 0;
            }
            int n3 = Math.min(arg2 - n, 16 - this.cfr_renamed_107);
            int n4 = n;
            sprbjd sprbjd2 = this;
            System.arraycopy(arg0, n4 + arg1, sprbjd2.cfr_renamed_0, sprbjd2.cfr_renamed_107, n3);
            n = n4 + n3;
            this.cfr_renamed_107 += n3;
            n2 = arg2;
        }
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        sprbjd sprbjd2 = this;
        sprbjd2.cfr_renamed_93[0] = arg0;
        sprbjd2.cfr_renamed_1197(sprbjd2.cfr_renamed_93, 0, 1);
    }

    /*
     * WARNING - void declaration
     */
    public sprbjd(sprff sprff2) {
        void arg0;
        sprbjd sprbjd2 = this;
        this.cfr_renamed_93 = new byte[1];
        sprbjd2.cfr_renamed_0 = new byte[16];
        sprbjd2.cfr_renamed_107 = 0;
        if (sprff2.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprazo.cfr_renamed_9("p{Lm\u0011'\u0010!\u0000fEeU}RqS4A4\u0011&\u00184B}T4BxOwK4C}P|Ef\u000e"));
        }
        this.cfr_renamed_132 = arg0;
    }
}

