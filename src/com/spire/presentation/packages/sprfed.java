/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraada;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwmr;

public class sprfed
implements sprqk {
    private static final int cfr_renamed_152 = 4;
    private int[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private boolean cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return spraada.cfr_renamed_9("z1\\*Sn\fq\u0005");
    }

    private /* synthetic */ int cfr_renamed_3676() {
        sprfed sprfed2 = this;
        int n = sprfed2.cfr_renamed_112[0];
        sprfed sprfed3 = this;
        int n2 = sprfed2.cfr_renamed_112[0] >>> 7 | sprfed3.cfr_renamed_112[1] << 25;
        int n3 = sprfed3.cfr_renamed_112[1] >>> 6 | this.cfr_renamed_112[2] << 26;
        int n4 = sprfed2.cfr_renamed_112[2] >>> 6 | this.cfr_renamed_112[3] << 26;
        int n5 = sprfed2.cfr_renamed_112[2] >>> 17 | this.cfr_renamed_112[3] << 15;
        int n6 = sprfed2.cfr_renamed_112[3];
        return n ^ n2 ^ n3 ^ n4 ^ n5 ^ n6;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3471(byte[] byArray, byte[] byArray2) {
        int n;
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[12] = -1;
        v1[13] = -1;
        v0[14] = -1;
        v0[15] = -1;
        sprfed sprfed2 = this;
        sprfed2.cfr_renamed_119 = arg0;
        sprfed2.cfr_renamed_0 = v0;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_1.length) {
            sprfed sprfed3 = this;
            this.cfr_renamed_1[n] = sprfed3.cfr_renamed_119[n2 + 3] << 24 | this.cfr_renamed_119[n2 + 2] << 16 & 0xFF0000 | this.cfr_renamed_119[n2 + 1] << 8 & 0xFF00 | this.cfr_renamed_119[n2] & 0xFF;
            int n4 = this.cfr_renamed_0[n2 + 3] << 24 | this.cfr_renamed_0[n2 + 2] << 16 & 0xFF0000 | this.cfr_renamed_0[n2 + 1] << 8 & 0xFF00 | this.cfr_renamed_0[n2] & 0xFF;
            n2 += 4;
            sprfed3.cfr_renamed_112[n] = n4;
            n3 = ++n;
        }
    }

    private /* synthetic */ byte cfr_renamed_3677() {
        if (this.cfr_renamed_4 > 3) {
            this.cfr_renamed_3672();
            this.cfr_renamed_4 = 0;
        }
        return this.cfr_renamed_2[this.cfr_renamed_4++];
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd {
        int n;
        if (!this.cfr_renamed_91) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprwmr.cfr_renamed_9("Fi\tsFn\bn\u0012n\u0007k\u000ft\u0003c")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(spraada.cfr_renamed_9("*S3H7\u001d!H%[&OcI,RcN+R1I"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(sprwmr.cfr_renamed_9("h\u0013s\u0016r\u0012'\u0004r\u0000a\u0003uFs\thFt\u000eh\u0014s"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg4 + n;
            byte by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_3677());
            arg3[n3] = by;
            n2 = ++n;
        }
        return arg2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[] cfr_renamed_3674(int[] nArray, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1[0] = v1[1];
        void v2 = arg0;
        v2[1] = v2[2];
        v0[2] = arg0[3];
        v0[3] = arg1;
        return v0;
    }

    private /* synthetic */ void cfr_renamed_3678() {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            sprfed sprfed2 = this;
            sprfed2.cfr_renamed_3 = sprfed2.cfr_renamed_3673();
            sprfed2.cfr_renamed_1 = sprfed2.cfr_renamed_3674(sprfed2.cfr_renamed_1, this.cfr_renamed_3675() ^ this.cfr_renamed_112[0] ^ this.cfr_renamed_3);
            sprfed2.cfr_renamed_112 = sprfed2.cfr_renamed_3674(sprfed2.cfr_renamed_112, this.cfr_renamed_3676() ^ this.cfr_renamed_3);
            n2 = ++n;
        }
        this.cfr_renamed_91 = true;
    }

    private /* synthetic */ int cfr_renamed_3675() {
        sprfed sprfed2 = this;
        int n = sprfed2.cfr_renamed_1[0];
        sprfed sprfed3 = this;
        int n2 = sprfed2.cfr_renamed_1[0] >>> 3 | sprfed3.cfr_renamed_1[1] << 29;
        int n3 = sprfed3.cfr_renamed_1[0] >>> 11 | this.cfr_renamed_1[1] << 21;
        int n4 = sprfed2.cfr_renamed_1[0] >>> 13 | this.cfr_renamed_1[1] << 19;
        int n5 = sprfed2.cfr_renamed_1[0] >>> 17 | this.cfr_renamed_1[1] << 15;
        int n6 = sprfed2.cfr_renamed_1[0] >>> 18 | this.cfr_renamed_1[1] << 14;
        int n7 = sprfed2.cfr_renamed_1[0] >>> 26 | this.cfr_renamed_1[1] << 6;
        int n8 = sprfed2.cfr_renamed_1[0] >>> 27 | this.cfr_renamed_1[1] << 5;
        int n9 = sprfed2.cfr_renamed_1[1] >>> 8 | this.cfr_renamed_1[2] << 24;
        int n10 = sprfed2.cfr_renamed_1[1] >>> 16 | this.cfr_renamed_1[2] << 16;
        int n11 = sprfed2.cfr_renamed_1[1] >>> 24 | this.cfr_renamed_1[2] << 8;
        int n12 = sprfed2.cfr_renamed_1[1] >>> 27 | this.cfr_renamed_1[2] << 5;
        int n13 = sprfed2.cfr_renamed_1[1] >>> 29 | this.cfr_renamed_1[2] << 3;
        int n14 = sprfed2.cfr_renamed_1[2] >>> 1 | this.cfr_renamed_1[3] << 31;
        int n15 = sprfed2.cfr_renamed_1[2] >>> 3 | this.cfr_renamed_1[3] << 29;
        int n16 = sprfed2.cfr_renamed_1[2] >>> 4 | this.cfr_renamed_1[3] << 28;
        int n17 = sprfed2.cfr_renamed_1[2] >>> 20 | this.cfr_renamed_1[3] << 12;
        int n18 = sprfed2.cfr_renamed_1[2] >>> 27 | this.cfr_renamed_1[3] << 5;
        int n19 = sprfed2.cfr_renamed_1[3];
        return n ^ n7 ^ n11 ^ n18 ^ n19 ^ n2 & n15 ^ n3 & n4 ^ n5 & n6 ^ n8 & n12 ^ n9 & n10 ^ n13 & n14 ^ n16 & n17;
    }

    private /* synthetic */ void cfr_renamed_3672() {
        sprfed sprfed2 = this;
        sprfed2.cfr_renamed_3 = sprfed2.cfr_renamed_3673();
        sprfed2.cfr_renamed_2[0] = (byte)this.cfr_renamed_3;
        sprfed2.cfr_renamed_2[1] = (byte)(this.cfr_renamed_3 >> 8);
        sprfed2.cfr_renamed_2[2] = (byte)(this.cfr_renamed_3 >> 16);
        sprfed2.cfr_renamed_2[3] = (byte)(this.cfr_renamed_3 >> 24);
        sprfed2.cfr_renamed_1 = sprfed2.cfr_renamed_3674(sprfed2.cfr_renamed_1, this.cfr_renamed_3675() ^ this.cfr_renamed_112[0]);
        sprfed2.cfr_renamed_112 = sprfed2.cfr_renamed_3674(sprfed2.cfr_renamed_112, this.cfr_renamed_3676());
    }

    @Override
    public void cfr_renamed_41() {
        sprfed sprfed2 = this;
        sprfed2.cfr_renamed_4 = 4;
        sprfed sprfed3 = this;
        sprfed3.cfr_renamed_3471(sprfed2.cfr_renamed_119, sprfed3.cfr_renamed_0);
        sprfed2.cfr_renamed_3678();
    }

    public sprfed() {
        sprfed sprfed2 = this;
        sprfed2.cfr_renamed_4 = 4;
        sprfed2.cfr_renamed_91 = false;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        if (!(arg1 instanceof sprnjd)) {
            throw new IllegalArgumentException(spraada.cfr_renamed_9("\u0004O\"T-\u0010r\u000f{\u001d\nS*IcM\"O\"P&I&O0\u001d.H0IcT-^/H'Xc\\-\u001d\nk"));
        }
        sprnjd sprnjd2 = (sprnjd)arg1;
        byte[] byArray = sprnjd2.cfr_renamed_1205();
        if (byArray == null || byArray.length != 12) {
            throw new IllegalArgumentException(sprwmr.cfr_renamed_9("!u\u0007n\b*W5^'Fu\u0003v\u0013n\u0014b\u0015'\u0003\u007f\u0007d\u0012k\u001f'W5Fe\u001fs\u0003tFh\u0000'/Q"));
        }
        if (!(sprnjd2.cfr_renamed_284() instanceof sprnld)) {
            throw new IllegalArgumentException(spraada.cfr_renamed_9("\u0004O\"T-\u0010r\u000f{\u001d\nS*IcM\"O\"P&I&O0\u001d.H0IcT-^/H'Xc\\cV&D"));
        }
        sprnld sprnld2 = (sprnld)sprnjd2.cfr_renamed_284();
        this.cfr_renamed_0 = new byte[sprnld2.cfr_renamed_1521().length];
        this.cfr_renamed_119 = new byte[sprnld2.cfr_renamed_1521().length];
        sprfed sprfed2 = this;
        this.cfr_renamed_112 = new int[4];
        sprfed2.cfr_renamed_1 = new int[4];
        sprfed2.cfr_renamed_2 = new byte[4];
        System.arraycopy(byArray, 0, this.cfr_renamed_0, 0, byArray.length);
        System.arraycopy(sprnld2.cfr_renamed_1521(), 0, this.cfr_renamed_119, 0, sprnld2.cfr_renamed_1521().length);
        this.cfr_renamed_41();
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (!this.cfr_renamed_91) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprwmr.cfr_renamed_9("Fi\tsFn\bn\u0012n\u0007k\u000ft\u0003c")).toString());
        }
        return (byte)(arg0 ^ this.cfr_renamed_3677());
    }

    private /* synthetic */ int cfr_renamed_3673() {
        sprfed sprfed2 = this;
        sprfed sprfed3 = this;
        int n = sprfed2.cfr_renamed_1[0] >>> 2 | sprfed3.cfr_renamed_1[1] << 30;
        int n2 = sprfed2.cfr_renamed_1[0] >>> 12 | this.cfr_renamed_1[1] << 20;
        int n3 = sprfed3.cfr_renamed_1[0] >>> 15 | this.cfr_renamed_1[1] << 17;
        int n4 = sprfed2.cfr_renamed_1[1] >>> 4 | this.cfr_renamed_1[2] << 28;
        int n5 = sprfed2.cfr_renamed_1[1] >>> 13 | this.cfr_renamed_1[2] << 19;
        int n6 = sprfed2.cfr_renamed_1[2];
        int n7 = sprfed2.cfr_renamed_1[2] >>> 9 | this.cfr_renamed_1[3] << 23;
        int n8 = sprfed2.cfr_renamed_1[2] >>> 25 | this.cfr_renamed_1[3] << 7;
        int n9 = sprfed2.cfr_renamed_1[2] >>> 31 | this.cfr_renamed_1[3] << 1;
        int n10 = sprfed2.cfr_renamed_112[0] >>> 8 | this.cfr_renamed_112[1] << 24;
        int n11 = sprfed2.cfr_renamed_112[0] >>> 13 | this.cfr_renamed_112[1] << 19;
        int n12 = sprfed2.cfr_renamed_112[0] >>> 20 | this.cfr_renamed_112[1] << 12;
        int n13 = sprfed2.cfr_renamed_112[1] >>> 10 | this.cfr_renamed_112[2] << 22;
        int n14 = sprfed2.cfr_renamed_112[1] >>> 28 | this.cfr_renamed_112[2] << 4;
        int n15 = sprfed2.cfr_renamed_112[2] >>> 15 | this.cfr_renamed_112[3] << 17;
        int n16 = sprfed2.cfr_renamed_112[2] >>> 29 | this.cfr_renamed_112[3] << 3;
        int n17 = sprfed2.cfr_renamed_112[2] >>> 31 | this.cfr_renamed_112[3] << 1;
        return n2 & n10 ^ n11 & n12 ^ n9 & n13 ^ n14 & n15 ^ n2 & n9 & n17 ^ n16 ^ n ^ n3 ^ n4 ^ n5 ^ n6 ^ n7 ^ n8;
    }
}

