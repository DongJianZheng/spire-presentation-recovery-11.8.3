/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprzil;

public class sprobl
implements sprpl {
    private long cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private int cfr_renamed_137;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private final int cfr_renamed_102 = 64;
    private final int cfr_renamed_93 = 64;
    private final int cfr_renamed_86 = 128;
    private int cfr_renamed_152;
    private final int cfr_renamed_112 = 4;
    private sprzil[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprzil cfr_renamed_0;
    private final byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        this.cfr_renamed_107 = 0;
        this.cfr_renamed_137 = 64;
        this.cfr_renamed_0.cfr_renamed_41();
        int n2 = n = 0;
        while (n2 < 4) {
            this.cfr_renamed_119[n++].cfr_renamed_41();
            n2 = n;
        }
        sprobl sprobl2 = this;
        sprobl2.cfr_renamed_0.cfr_renamed_10556();
        sprobl2.cfr_renamed_119[3].cfr_renamed_10556();
        if (sprobl2.cfr_renamed_132 != null) {
            int n3;
            byte[] byArray = new byte[128];
            System.arraycopy(this.cfr_renamed_132, 0, byArray, 0, this.cfr_renamed_152);
            int n4 = n3 = 0;
            while (n4 < 4) {
                sprzil sprzil2 = this.cfr_renamed_119[n3];
                sprzil2.cfr_renamed_1197(byArray, 0, 128);
                n4 = ++n3;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprobl(byte[] byArray) {
        void arg0;
        sprobl sprobl2 = this;
        sprobl sprobl3 = this;
        sprobl3.cfr_renamed_107 = 0;
        sprobl3.cfr_renamed_152 = 0;
        sprobl2.cfr_renamed_2 = 0;
        sprobl2.cfr_renamed_119 = new sprzil[4];
        sprobl sprobl4 = this;
        sprobl sprobl5 = this;
        sprobl sprobl6 = this;
        sprobl sprobl7 = this;
        sprobl sprobl8 = this;
        sprobl8.cfr_renamed_3 = null;
        sprobl8.cfr_renamed_105 = null;
        sprobl7.cfr_renamed_91 = null;
        sprobl7.cfr_renamed_132 = null;
        sprobl6.cfr_renamed_86 = 128;
        sprobl6.cfr_renamed_93 = 64;
        sprobl5.cfr_renamed_102 = 64;
        sprobl5.cfr_renamed_112 = 4;
        sprobl4.cfr_renamed_1 = new byte[1];
        sprobl4.cfr_renamed_91 = new byte[64];
        this.cfr_renamed_3 = new byte[512];
        this.cfr_renamed_148((byte[])arg0);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_137;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        int n;
        byte[][] byArray = new byte[4][64];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 4) {
            if (this.cfr_renamed_107 > n * 128) {
                n2 = this.cfr_renamed_107 - n * 128;
                if (n2 > 128) {
                    n2 = 128;
                }
                this.cfr_renamed_119[n].cfr_renamed_1197(this.cfr_renamed_3, n * 128, n2);
            }
            this.cfr_renamed_119[n].cfr_renamed_1219(byArray[n++], 0);
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < 4) {
            byte[] byArray2 = byArray[n];
            this.cfr_renamed_0.cfr_renamed_1197(byArray2, 0, 64);
            n4 = ++n;
        }
        sprobl sprobl2 = this;
        n = sprobl2.cfr_renamed_0.cfr_renamed_1219(arg0, arg1);
        sprobl2.cfr_renamed_41();
        return n;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprqry.cfr_renamed_9("g^dY` Gb");
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = this.cfr_renamed_107;
        int n3 = 1024 - n2;
        if (n2 != 0 && arg2 >= n3) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_3, n2, n3);
            int n4 = n = 0;
            while (n4 < 4) {
                this.cfr_renamed_119[n].cfr_renamed_1197(this.cfr_renamed_3, n++ * 128, 128);
                n4 = n;
            }
            arg1 += n3;
            arg2 -= n3;
            n2 = 0;
        }
        int n5 = n = 0;
        while (n5 < 4) {
            int n6 = arg2;
            int n7 = arg1;
            n7 += n * 128;
            int n8 = n6;
            while (n8 >= 512) {
                int n9 = n7;
                n7 += 512;
                this.cfr_renamed_119[n].cfr_renamed_1197(arg0, n9, 128);
                n8 = n6 -= 512;
            }
            n5 = ++n;
        }
        int n10 = arg2;
        arg1 += n10 - n10 % 512;
        if ((arg2 %= 512) > 0) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_3, n2, arg2);
        }
        this.cfr_renamed_107 = n2 + arg2;
    }

    @Override
    public int cfr_renamed_3248() {
        return 0;
    }

    private /* synthetic */ void cfr_renamed_148(byte[] arg0) {
        int n;
        if (arg0 != null && arg0.length > 0) {
            this.cfr_renamed_152 = arg0.length;
            if (this.cfr_renamed_152 > 64) {
                throw new IllegalArgumentException(sprvof.cfr_renamed_9("M\u0014\u007f\u0002&O&G2Qd\br\u0014uQg\u0003cQh\u001erQu\u0004v\u0001i\u0003r\u0014b"));
            }
            this.cfr_renamed_132 = sproze.cfr_renamed_158(arg0);
        }
        sprobl sprobl2 = this;
        sprobl sprobl3 = this;
        sprobl sprobl4 = this;
        this.cfr_renamed_107 = 0;
        sprobl4.cfr_renamed_137 = 64;
        sprobl4.cfr_renamed_4 = 4;
        sprobl3.cfr_renamed_79 = 2;
        sprobl3.cfr_renamed_96 = 64L;
        sprobl sprobl5 = this;
        sprobl2.cfr_renamed_91[0] = (byte)sprobl5.cfr_renamed_137;
        sprobl5.cfr_renamed_91[1] = (byte)this.cfr_renamed_152;
        sprobl2.cfr_renamed_91[2] = (byte)this.cfr_renamed_4;
        sprobl2.cfr_renamed_91[3] = (byte)this.cfr_renamed_79;
        sprobl2.cfr_renamed_91[16] = 1;
        sprobl2.cfr_renamed_91[17] = (byte)this.cfr_renamed_96;
        sprobl sprobl6 = this;
        sprobl2.cfr_renamed_0 = new sprzil(null, this.cfr_renamed_91);
        sprpxe.cfr_renamed_437(sprobl2.cfr_renamed_2, this.cfr_renamed_91, 8);
        sprobl2.cfr_renamed_91[16] = 0;
        int n2 = n = 0;
        while (n2 < 4) {
            sprpxe.cfr_renamed_437(n, this.cfr_renamed_91, 8);
            this.cfr_renamed_119[n++] = new sprzil(null, this.cfr_renamed_91);
            n2 = n;
        }
        sprobl sprobl7 = this;
        sprobl7.cfr_renamed_0.cfr_renamed_10556();
        sprobl7.cfr_renamed_119[3].cfr_renamed_10556();
        if (arg0 != null && this.cfr_renamed_152 > 0) {
            int n3;
            byte[] byArray = new byte[128];
            System.arraycopy(arg0, 0, byArray, 0, this.cfr_renamed_152);
            int n4 = n3 = 0;
            while (n4 < 4) {
                sprzil sprzil2 = this.cfr_renamed_119[n3];
                sprzil2.cfr_renamed_1197(byArray, 0, 128);
                n4 = ++n3;
            }
        }
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprobl sprobl2 = this;
        sprobl2.cfr_renamed_1[0] = arg0;
        sprobl2.cfr_renamed_1197(sprobl2.cfr_renamed_1, 0, 1);
    }
}

