/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprquy;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtza;
import com.spire.presentation.packages.sprwjl;

public class sprwxk
implements spraq {
    private int cfr_renamed_88;
    private int cfr_renamed_31;
    private int cfr_renamed_272;
    private int cfr_renamed_145;
    private int cfr_renamed_114;
    private int cfr_renamed_96;
    private int cfr_renamed_105;
    private int cfr_renamed_137;
    private int cfr_renamed_79;
    private static final int cfr_renamed_107 = 16;
    private int cfr_renamed_132;
    private final byte[] cfr_renamed_102;
    private int cfr_renamed_93;
    private final sprmr cfr_renamed_86;
    private int cfr_renamed_152;
    private final byte[] cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3473() {
        if (this.cfr_renamed_0 < 16) {
            int n;
            sprwxk sprwxk2 = this;
            this.cfr_renamed_102[sprwxk2.cfr_renamed_0] = 1;
            int n2 = n = sprwxk2.cfr_renamed_0 + 1;
            while (n2 < 16) {
                this.cfr_renamed_102[n++] = 0;
                n2 = n;
            }
        }
        long l = 0xFFFFFFFFL & (long)sprpxe.cfr_renamed_439(this.cfr_renamed_102, 0);
        long l2 = 0xFFFFFFFFL & (long)sprpxe.cfr_renamed_439(this.cfr_renamed_102, 4);
        long l3 = 0xFFFFFFFFL & (long)sprpxe.cfr_renamed_439(this.cfr_renamed_102, 8);
        long l4 = 0xFFFFFFFFL & (long)sprpxe.cfr_renamed_439(this.cfr_renamed_102, 12);
        sprwxk sprwxk3 = this;
        sprwxk3.cfr_renamed_272 = (int)((long)sprwxk3.cfr_renamed_272 + (l & 0x3FFFFFFL));
        sprwxk3.cfr_renamed_137 = (int)((long)sprwxk3.cfr_renamed_137 + ((l2 << 32 | l) >>> 26 & 0x3FFFFFFL));
        sprwxk3.cfr_renamed_3 = (int)((long)sprwxk3.cfr_renamed_3 + ((l3 << 32 | l2) >>> 20 & 0x3FFFFFFL));
        sprwxk3.cfr_renamed_105 = (int)((long)sprwxk3.cfr_renamed_105 + ((l4 << 32 | l3) >>> 14 & 0x3FFFFFFL));
        sprwxk3.cfr_renamed_152 = (int)((long)sprwxk3.cfr_renamed_152 + (l4 >>> 8));
        if (sprwxk3.cfr_renamed_0 == 16) {
            this.cfr_renamed_152 += 0x1000000;
        }
        sprwxk sprwxk4 = this;
        sprwxk sprwxk5 = this;
        sprwxk sprwxk6 = this;
        sprwxk sprwxk7 = this;
        sprwxk sprwxk8 = this;
        sprwxk sprwxk9 = this;
        long l5 = sprwxk.cfr_renamed_3470(sprwxk4.cfr_renamed_272, sprwxk5.cfr_renamed_96) + sprwxk.cfr_renamed_3470(sprwxk6.cfr_renamed_137, sprwxk6.cfr_renamed_91) + sprwxk.cfr_renamed_3470(sprwxk7.cfr_renamed_3, sprwxk7.cfr_renamed_2) + sprwxk.cfr_renamed_3470(sprwxk8.cfr_renamed_105, sprwxk8.cfr_renamed_119) + sprwxk.cfr_renamed_3470(sprwxk9.cfr_renamed_152, sprwxk9.cfr_renamed_93);
        sprwxk sprwxk10 = this;
        sprwxk sprwxk11 = this;
        sprwxk sprwxk12 = this;
        sprwxk sprwxk13 = this;
        long l6 = sprwxk.cfr_renamed_3470(sprwxk4.cfr_renamed_272, this.cfr_renamed_88) + sprwxk.cfr_renamed_3470(sprwxk10.cfr_renamed_137, sprwxk10.cfr_renamed_96) + sprwxk.cfr_renamed_3470(sprwxk11.cfr_renamed_3, sprwxk11.cfr_renamed_91) + sprwxk.cfr_renamed_3470(sprwxk12.cfr_renamed_105, sprwxk12.cfr_renamed_2) + sprwxk.cfr_renamed_3470(sprwxk13.cfr_renamed_152, sprwxk13.cfr_renamed_119);
        sprwxk sprwxk14 = this;
        sprwxk sprwxk15 = this;
        sprwxk sprwxk16 = this;
        sprwxk sprwxk17 = this;
        long l7 = sprwxk.cfr_renamed_3470(sprwxk5.cfr_renamed_272, this.cfr_renamed_1) + sprwxk.cfr_renamed_3470(sprwxk14.cfr_renamed_137, sprwxk14.cfr_renamed_88) + sprwxk.cfr_renamed_3470(sprwxk15.cfr_renamed_3, sprwxk15.cfr_renamed_96) + sprwxk.cfr_renamed_3470(sprwxk16.cfr_renamed_105, sprwxk16.cfr_renamed_91) + sprwxk.cfr_renamed_3470(sprwxk17.cfr_renamed_152, sprwxk17.cfr_renamed_2);
        sprwxk sprwxk18 = this;
        sprwxk sprwxk19 = this;
        sprwxk sprwxk20 = this;
        sprwxk sprwxk21 = this;
        long l8 = sprwxk.cfr_renamed_3470(sprwxk4.cfr_renamed_272, this.cfr_renamed_31) + sprwxk.cfr_renamed_3470(sprwxk18.cfr_renamed_137, sprwxk18.cfr_renamed_1) + sprwxk.cfr_renamed_3470(sprwxk19.cfr_renamed_3, sprwxk19.cfr_renamed_88) + sprwxk.cfr_renamed_3470(sprwxk20.cfr_renamed_105, sprwxk20.cfr_renamed_96) + sprwxk.cfr_renamed_3470(sprwxk21.cfr_renamed_152, sprwxk21.cfr_renamed_91);
        sprwxk sprwxk22 = this;
        sprwxk sprwxk23 = this;
        sprwxk sprwxk24 = this;
        sprwxk sprwxk25 = this;
        long l9 = sprwxk.cfr_renamed_3470(sprwxk4.cfr_renamed_272, this.cfr_renamed_114) + sprwxk.cfr_renamed_3470(sprwxk22.cfr_renamed_137, sprwxk22.cfr_renamed_31) + sprwxk.cfr_renamed_3470(sprwxk23.cfr_renamed_3, sprwxk23.cfr_renamed_1) + sprwxk.cfr_renamed_3470(sprwxk24.cfr_renamed_105, sprwxk24.cfr_renamed_88) + sprwxk.cfr_renamed_3470(sprwxk25.cfr_renamed_152, sprwxk25.cfr_renamed_96);
        sprwxk4.cfr_renamed_272 = (int)l5 & 0x3FFFFFF;
        sprwxk4.cfr_renamed_137 = (int)(l6 += l5 >>> 26) & 0x3FFFFFF;
        sprwxk4.cfr_renamed_3 = (int)(l7 += l6 >>> 26) & 0x3FFFFFF;
        sprwxk4.cfr_renamed_105 = (int)(l8 += l7 >>> 26) & 0x3FFFFFF;
        sprwxk4.cfr_renamed_152 = (int)(l9 += l8 >>> 26) & 0x3FFFFFF;
        sprwxk4.cfr_renamed_272 += (int)(l9 >>> 26) * 5;
        sprwxk4.cfr_renamed_137 += this.cfr_renamed_272 >>> 26;
        sprwxk4.cfr_renamed_272 &= 0x3FFFFFF;
    }

    @Override
    public String cfr_renamed_1315() {
        if (this.cfr_renamed_86 == null) {
            return sprquy.cfr_renamed_9("h\u001aT\f\tF\b@");
        }
        return new StringBuilder().insert(0, sprtza.cfr_renamed_9("\u0006\u007f:ig#f%{")).append(this.cfr_renamed_86.cfr_renamed_1315()).toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        if (arg1 + 16 > arg0.length) {
            throw new sprwjl(sprquy.cfr_renamed_9(":M\u0001H\u0000LUZ\u0000^\u0013]\u0007\u0018\u001cKUL\u001aWUK\u001dW\u0007L["));
        }
        if (this.cfr_renamed_0 > 0) {
            this.cfr_renamed_3473();
        }
        sprwxk sprwxk2 = this;
        sprwxk sprwxk3 = this;
        sprwxk2.cfr_renamed_137 += sprwxk3.cfr_renamed_272 >>> 26;
        sprwxk3.cfr_renamed_272 &= 0x3FFFFFF;
        sprwxk2.cfr_renamed_3 += this.cfr_renamed_137 >>> 26;
        sprwxk2.cfr_renamed_137 &= 0x3FFFFFF;
        sprwxk2.cfr_renamed_105 += this.cfr_renamed_3 >>> 26;
        sprwxk2.cfr_renamed_3 &= 0x3FFFFFF;
        sprwxk2.cfr_renamed_152 += this.cfr_renamed_105 >>> 26;
        sprwxk2.cfr_renamed_105 &= 0x3FFFFFF;
        sprwxk2.cfr_renamed_272 += (this.cfr_renamed_152 >>> 26) * 5;
        sprwxk2.cfr_renamed_152 &= 0x3FFFFFF;
        sprwxk2.cfr_renamed_137 += this.cfr_renamed_272 >>> 26;
        sprwxk2.cfr_renamed_272 &= 0x3FFFFFF;
        int n = sprwxk2.cfr_renamed_272 + 5;
        int n2 = n >>> 26;
        n &= 0x3FFFFFF;
        int n3 = sprwxk2.cfr_renamed_137 + n2;
        n2 = n3 >>> 26;
        n3 &= 0x3FFFFFF;
        int n4 = sprwxk2.cfr_renamed_3 + n2;
        n2 = n4 >>> 26;
        n4 &= 0x3FFFFFF;
        int n5 = sprwxk2.cfr_renamed_105 + n2;
        n2 = n5 >>> 26;
        n5 &= 0x3FFFFFF;
        int n6 = sprwxk2.cfr_renamed_152 + n2 - 0x4000000;
        n2 = (n6 >>> 31) - 1;
        int n7 = ~n2;
        sprwxk2.cfr_renamed_272 = sprwxk2.cfr_renamed_272 & n7 | n & n2;
        sprwxk2.cfr_renamed_137 = sprwxk2.cfr_renamed_137 & n7 | n3 & n2;
        sprwxk2.cfr_renamed_3 = sprwxk2.cfr_renamed_3 & n7 | n4 & n2;
        sprwxk2.cfr_renamed_105 = sprwxk2.cfr_renamed_105 & n7 | n5 & n2;
        sprwxk2.cfr_renamed_152 = sprwxk2.cfr_renamed_152 & n7 | n6 & n2;
        long l = ((long)(sprwxk2.cfr_renamed_272 | this.cfr_renamed_137 << 26) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_132);
        long l2 = ((long)(sprwxk2.cfr_renamed_137 >>> 6 | this.cfr_renamed_3 << 20) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_4);
        long l3 = ((long)(sprwxk2.cfr_renamed_3 >>> 12 | this.cfr_renamed_105 << 14) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_145);
        long l4 = ((long)(sprwxk2.cfr_renamed_105 >>> 18 | this.cfr_renamed_152 << 8) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long)this.cfr_renamed_79);
        sprpxe.cfr_renamed_437((int)l, arg0, arg1);
        sprpxe.cfr_renamed_437((int)(l2 += l >>> 32), arg0, arg1 + 4);
        sprpxe.cfr_renamed_437((int)(l3 += l2 >>> 32), arg0, arg1 + 8);
        sprpxe.cfr_renamed_437((int)(l4 += l3 >>> 32), arg0, arg1 + 12);
        sprwxk2.cfr_renamed_41();
        return 16;
    }

    @Override
    public int cfr_renamed_2404() {
        return 16;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        sprwxk sprwxk2 = this;
        sprwxk2.cfr_renamed_112[0] = arg0;
        sprwxk2.cfr_renamed_1197(sprwxk2.cfr_renamed_112, 0, 1);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        int n2 = arg2;
        while (n2 > n) {
            if (this.cfr_renamed_0 == 16) {
                this.cfr_renamed_3473();
                this.cfr_renamed_0 = 0;
            }
            int n3 = Math.min(arg2 - n, 16 - this.cfr_renamed_0);
            int n4 = n;
            sprwxk sprwxk2 = this;
            System.arraycopy(arg0, n4 + arg1, sprwxk2.cfr_renamed_102, sprwxk2.cfr_renamed_0, n3);
            n = n4 + n3;
            this.cfr_renamed_0 += n3;
            n2 = arg2;
        }
    }

    private static final /* synthetic */ long cfr_renamed_3470(int arg0, int arg1) {
        return ((long)arg0 & 0xFFFFFFFFL) * (long)arg1;
    }

    private /* synthetic */ void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        sprwxk sprwxk2;
        int n;
        byte[] byArray;
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprtza.cfr_renamed_9("@9|/!e c0=u/0;e%dvr30d%`04y\"cx"));
        }
        if (this.cfr_renamed_86 != null && (arg1 == null || arg1.length != 16)) {
            throw new IllegalArgumentException(sprquy.cfr_renamed_9("%W\u0019AD\u000bE\rUJ\u0010I\u0000Q\u0007]\u0006\u0018\u0014\u0018D\nM\u0018\u0017Q\u0001\u0018<n["));
        }
        int n2 = sprpxe.cfr_renamed_439(arg0, 0);
        int n3 = sprpxe.cfr_renamed_439(arg0, 4);
        int n4 = sprpxe.cfr_renamed_439(arg0, 8);
        int n5 = sprpxe.cfr_renamed_439(arg0, 12);
        sprwxk sprwxk3 = this;
        sprwxk sprwxk4 = this;
        int n6 = n2;
        sprwxk4.cfr_renamed_96 = n6 & 0x3FFFFFF;
        int n7 = n3;
        sprwxk4.cfr_renamed_88 = (n6 >>> 26 | n7 << 6) & 0x3FFFF03;
        int n8 = n4;
        sprwxk4.cfr_renamed_1 = (n7 >>> 20 | n8 << 12) & 0x3FFC0FF;
        this.cfr_renamed_31 = (n8 >>> 14 | n5 << 18) & 0x3F03FFF;
        sprwxk3.cfr_renamed_114 = n5 >>> 8 & 0xFFFFF;
        sprwxk3.cfr_renamed_93 = this.cfr_renamed_88 * 5;
        sprwxk3.cfr_renamed_119 = sprwxk3.cfr_renamed_1 * 5;
        sprwxk3.cfr_renamed_2 = sprwxk3.cfr_renamed_31 * 5;
        sprwxk3.cfr_renamed_91 = sprwxk3.cfr_renamed_114 * 5;
        if (sprwxk3.cfr_renamed_86 == null) {
            byArray = arg0;
            n = 16;
            sprwxk2 = this;
        } else {
            byArray = new byte[16];
            n = 0;
            sprwxk sprwxk5 = this;
            sprwxk2 = sprwxk5;
            sprwxk5.cfr_renamed_86.cfr_renamed_5535(true, new sprtpk(arg0, 16, 16));
            sprwxk5.cfr_renamed_86.cfr_renamed_3064(arg1, 0, byArray, 0);
        }
        sprwxk2.cfr_renamed_132 = sprpxe.cfr_renamed_439(byArray, n + 0);
        sprwxk sprwxk6 = this;
        this.cfr_renamed_4 = sprpxe.cfr_renamed_439(byArray, n + 4);
        sprwxk6.cfr_renamed_145 = sprpxe.cfr_renamed_439(byArray, n + 8);
        sprwxk6.cfr_renamed_79 = sprpxe.cfr_renamed_439(byArray, n + 12);
    }

    /*
     * WARNING - void declaration
     */
    public sprwxk(sprmr sprmr2) {
        void arg0;
        sprwxk sprwxk2 = this;
        this.cfr_renamed_112 = new byte[1];
        sprwxk2.cfr_renamed_102 = new byte[16];
        sprwxk2.cfr_renamed_0 = 0;
        if (sprmr2.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprtza.cfr_renamed_9("\u0006\u007f:ig#f%vb3a#y$u%070g\"n04y\"04|9s=05y&x3bx"));
        }
        this.cfr_renamed_86 = arg0;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        sprbj sprbj2;
        byte[] byArray = null;
        if (this.cfr_renamed_86 != null) {
            if (!(arg0 instanceof sprkpk)) {
                throw new IllegalArgumentException(sprquy.cfr_renamed_9("h\u001aT\f\tF\b@\u0018\u0007]\u0004M\u001cJ\u0010KUY\u001b\u0018<nUO\u001d]\u001b\u0018\u0000K\u0010\\UO\u001cL\u001d\u0018\u0014\u0018\u0017T\u001a[\u001e\u0018\u0016Q\u0005P\u0010J["));
            }
            sprbj2 = (sprkpk)arg0;
            byArray = ((sprkpk)sprbj2).cfr_renamed_1205();
            arg0 = ((sprkpk)sprbj2).cfr_renamed_284();
        }
        if (!(arg0 instanceof sprtpk)) {
            throw new IllegalArgumentException(sprtza.cfr_renamed_9("@9|/!e c0$u'e?b3cvqv{3ix"));
        }
        sprbj2 = (sprtpk)arg0;
        sprwxk sprwxk2 = this;
        sprwxk2.cfr_renamed_3471(((sprtpk)sprbj2).cfr_renamed_1521(), byArray);
        sprwxk2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_41() {
        sprwxk sprwxk2 = this;
        sprwxk sprwxk3 = this;
        sprwxk3.cfr_renamed_0 = 0;
        sprwxk2.cfr_renamed_152 = 0;
        sprwxk3.cfr_renamed_105 = 0;
        sprwxk2.cfr_renamed_3 = 0;
        sprwxk2.cfr_renamed_137 = 0;
        sprwxk2.cfr_renamed_272 = 0;
    }

    public sprwxk() {
        sprwxk sprwxk2 = this;
        sprwxk sprwxk3 = this;
        sprwxk3.cfr_renamed_112 = new byte[1];
        sprwxk3.cfr_renamed_102 = new byte[16];
        sprwxk2.cfr_renamed_0 = 0;
        sprwxk2.cfr_renamed_86 = null;
    }
}

