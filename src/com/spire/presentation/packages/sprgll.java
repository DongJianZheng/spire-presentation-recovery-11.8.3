/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhlaa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtil;
import com.spire.presentation.packages.sprvnj;

public class sprgll
implements sprpl {
    private final byte[] cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private sprtil cfr_renamed_137;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private final int cfr_renamed_132 = 8;
    private int cfr_renamed_102;
    private long cfr_renamed_93;
    private int cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private final int cfr_renamed_119 = 64;
    private byte[] cfr_renamed_91;
    private final int cfr_renamed_0 = 32;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprtil[] cfr_renamed_3;
    private final int cfr_renamed_4 = 32;

    @Override
    public int cfr_renamed_3248() {
        return 64;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprvnj.cfr_renamed_9("J`IgM\u001e{\\");
    }

    private /* synthetic */ void cfr_renamed_148(byte[] arg0) {
        int n;
        if (arg0 != null && arg0.length > 0) {
            this.cfr_renamed_79 = arg0.length;
            if (this.cfr_renamed_79 > 32) {
                throw new IllegalArgumentException(sprhlaa.cfr_renamed_9("\r3?%fhfetv$/235v'$#v(92v5#6&)$23\""));
            }
            this.cfr_renamed_105 = sproze.cfr_renamed_158(arg0);
        }
        sprgll sprgll2 = this;
        sprgll sprgll3 = this;
        sprgll sprgll4 = this;
        this.cfr_renamed_1 = 0;
        sprgll4.cfr_renamed_2 = 32;
        sprgll4.cfr_renamed_107 = 8;
        this.cfr_renamed_86 = 2;
        this.cfr_renamed_93 = 32L;
        sprgll sprgll5 = this;
        this.cfr_renamed_152[0] = (byte)sprgll5.cfr_renamed_2;
        sprgll5.cfr_renamed_152[1] = (byte)this.cfr_renamed_79;
        sprgll3.cfr_renamed_152[2] = (byte)this.cfr_renamed_107;
        sprgll3.cfr_renamed_152[3] = (byte)this.cfr_renamed_86;
        sprpxe.cfr_renamed_437(0, this.cfr_renamed_152, 8);
        sprgll3.cfr_renamed_152[14] = 1;
        sprgll2.cfr_renamed_152[15] = (byte)this.cfr_renamed_93;
        sprgll sprgll6 = this;
        this.cfr_renamed_137 = new sprtil(null, this.cfr_renamed_152);
        sprpxe.cfr_renamed_437(sprgll2.cfr_renamed_102, this.cfr_renamed_152, 8);
        sprgll2.cfr_renamed_152[14] = 0;
        int n2 = n = 0;
        while (n2 < 8) {
            sprpxe.cfr_renamed_437(n, this.cfr_renamed_152, 8);
            this.cfr_renamed_3[n++] = new sprtil(null, this.cfr_renamed_152);
            n2 = n;
        }
        sprgll sprgll7 = this;
        sprgll7.cfr_renamed_137.cfr_renamed_10556();
        sprgll7.cfr_renamed_3[7].cfr_renamed_10556();
        if (arg0 != null && this.cfr_renamed_79 > 0) {
            int n3;
            byte[] byArray = new byte[64];
            System.arraycopy(arg0, 0, byArray, 0, this.cfr_renamed_79);
            int n4 = n3 = 0;
            while (n4 < 8) {
                sprtil sprtil2 = this.cfr_renamed_3[n3];
                sprtil2.cfr_renamed_1197(byArray, 0, 64);
                n4 = ++n3;
            }
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = this.cfr_renamed_1;
        int n3 = 512 - n2;
        if (n2 != 0 && arg2 >= n3) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_112, n2, n3);
            int n4 = n = 0;
            while (n4 < 8) {
                this.cfr_renamed_3[n].cfr_renamed_1197(this.cfr_renamed_112, n++ * 64, 64);
                n4 = n;
            }
            arg1 += n3;
            arg2 -= n3;
            n2 = 0;
        }
        int n5 = n = 0;
        while (n5 < 8) {
            int n6 = arg2;
            int n7 = arg1;
            n7 += n * 64;
            int n8 = n6;
            while (n8 >= 512) {
                int n9 = n7;
                n7 += 512;
                this.cfr_renamed_3[n].cfr_renamed_1197(arg0, n9, 64);
                n8 = n6 -= 512;
            }
            n5 = ++n;
        }
        int n10 = arg2;
        arg1 += n10 - n10 % 512;
        if ((arg2 %= 512) > 0) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_112, n2, arg2);
        }
        this.cfr_renamed_1 = n2 + arg2;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        int n;
        byte[][] byArray = new byte[8][32];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 8) {
            if (this.cfr_renamed_1 > n * 64) {
                n2 = this.cfr_renamed_1 - n * 64;
                if (n2 > 64) {
                    n2 = 64;
                }
                this.cfr_renamed_3[n].cfr_renamed_1197(this.cfr_renamed_112, n * 64, n2);
            }
            this.cfr_renamed_3[n].cfr_renamed_1219(byArray[n++], 0);
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < 8) {
            byte[] byArray2 = byArray[n];
            this.cfr_renamed_137.cfr_renamed_1197(byArray2, 0, 32);
            n4 = ++n;
        }
        sprgll sprgll2 = this;
        n = sprgll2.cfr_renamed_137.cfr_renamed_1219(arg0, arg1);
        sprgll2.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_2 = 32;
        this.cfr_renamed_137.cfr_renamed_41();
        int n2 = n = 0;
        while (n2 < 8) {
            this.cfr_renamed_3[n++].cfr_renamed_41();
            n2 = n;
        }
        sprgll sprgll2 = this;
        sprgll2.cfr_renamed_137.cfr_renamed_10556();
        sprgll2.cfr_renamed_3[7].cfr_renamed_10556();
        if (sprgll2.cfr_renamed_105 != null) {
            int n3;
            byte[] byArray = new byte[64];
            System.arraycopy(this.cfr_renamed_105, 0, byArray, 0, this.cfr_renamed_79);
            int n4 = n3 = 0;
            while (n4 < 8) {
                sprtil sprtil2 = this.cfr_renamed_3[n3];
                sprtil2.cfr_renamed_1197(byArray, 0, 64);
                n4 = ++n3;
            }
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprgll(byte[] byArray) {
        void arg0;
        sprgll sprgll2 = this;
        sprgll sprgll3 = this;
        sprgll3.cfr_renamed_1 = 0;
        sprgll3.cfr_renamed_79 = 0;
        sprgll2.cfr_renamed_102 = 0;
        sprgll2.cfr_renamed_3 = new sprtil[8];
        sprgll sprgll4 = this;
        sprgll sprgll5 = this;
        sprgll sprgll6 = this;
        sprgll sprgll7 = this;
        sprgll sprgll8 = this;
        sprgll8.cfr_renamed_112 = null;
        sprgll8.cfr_renamed_91 = null;
        sprgll7.cfr_renamed_152 = null;
        sprgll7.cfr_renamed_105 = null;
        sprgll6.cfr_renamed_119 = 64;
        sprgll6.cfr_renamed_0 = 32;
        sprgll5.cfr_renamed_4 = 32;
        sprgll5.cfr_renamed_132 = 8;
        sprgll4.cfr_renamed_96 = new byte[1];
        sprgll4.cfr_renamed_152 = new byte[32];
        this.cfr_renamed_112 = new byte[512];
        this.cfr_renamed_148((byte[])arg0);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprgll sprgll2 = this;
        sprgll2.cfr_renamed_96[0] = arg0;
        sprgll2.cfr_renamed_1197(sprgll2.cfr_renamed_96, 0, 1);
    }
}

