/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjo;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprprca;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrdl;
import com.spire.presentation.packages.sprwjl;
import java.io.ByteArrayOutputStream;

public class spredl
implements sprgf {
    private final int cfr_renamed_79 = 2;
    private int cfr_renamed_107;
    private final int cfr_renamed_132 = 1;
    private final int cfr_renamed_102 = 16;
    private final ByteArrayOutputStream cfr_renamed_93;
    private final int cfr_renamed_86 = 12;
    private final int cfr_renamed_152 = 3;
    private final int cfr_renamed_112 = 12;
    private final int[] cfr_renamed_119;
    private final int cfr_renamed_91 = 48;
    private byte[] cfr_renamed_0;
    private final int cfr_renamed_1 = 4;
    private final int cfr_renamed_2 = 16;
    private int cfr_renamed_3;
    private sprrdl cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        sproze.cfr_renamed_492(this.cfr_renamed_0, (byte)0);
        this.cfr_renamed_3 = 2;
        this.cfr_renamed_4 = sprrdl.cfr_renamed_2;
        this.cfr_renamed_107 = 16;
        this.cfr_renamed_93.reset();
    }

    private /* synthetic */ int cfr_renamed_10292(int arg0, int arg1) {
        return arg1 % 3 * 4 + arg0 % 4;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprbjo.cfr_renamed_9("g}PvFsT2wsLz");
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    private /* synthetic */ int cfr_renamed_10293(int arg0, int arg1) {
        return arg0 << (arg1 & 0x1F) ^ arg0 >>> (32 - arg1 & 0x1F);
    }

    public spredl() {
        spredl spredl2 = this;
        spredl spredl3 = this;
        spredl spredl4 = this;
        spredl spredl5 = this;
        spredl spredl6 = this;
        spredl6.cfr_renamed_91 = 48;
        spredl6.cfr_renamed_102 = 16;
        spredl5.cfr_renamed_132 = 1;
        spredl5.cfr_renamed_79 = 2;
        spredl4.cfr_renamed_112 = 12;
        spredl4.cfr_renamed_152 = 3;
        spredl3.cfr_renamed_1 = 4;
        spredl3.cfr_renamed_86 = 12;
        spredl2.cfr_renamed_2 = 16;
        int[] nArray = new int[12];
        nArray[0] = 88;
        nArray[1] = 56;
        nArray[2] = 960;
        nArray[3] = 208;
        nArray[4] = 288;
        nArray[5] = 20;
        nArray[6] = 96;
        nArray[7] = 44;
        nArray[8] = 896;
        nArray[9] = 240;
        nArray[10] = 416;
        nArray[11] = 18;
        spredl2.cfr_renamed_119 = nArray;
        spredl spredl7 = this;
        this.cfr_renamed_93 = new ByteArrayOutputStream();
        this.cfr_renamed_0 = new byte[48];
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprprca.cfr_renamed_9("?Z&A\"\u00144A0R3Fv@9[vG>[$@"));
        }
        this.cfr_renamed_93.write(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_93.write(arg0);
    }

    private /* synthetic */ void cfr_renamed_10470(byte[] arg0, int arg1, int arg2, int arg3) {
        int n;
        if (this.cfr_renamed_4 != sprrdl.cfr_renamed_2) {
            this.cfr_renamed_0[47] = (byte)(this.cfr_renamed_0[47] ^ arg3);
        }
        int[] nArray = new int[12];
        sprpxe.cfr_renamed_438(this.cfr_renamed_0, 0, nArray, 0, nArray.length);
        int[] nArray2 = new int[12];
        int[] nArray3 = new int[4];
        int[] nArray4 = new int[4];
        int n2 = n = 0;
        while (n2 < 12) {
            int n3;
            int n4;
            int n5 = n4 = 0;
            while (n5 < 4) {
                int n6 = n4;
                int n7 = nArray[this.cfr_renamed_10292(n6, 0)] ^ nArray[this.cfr_renamed_10292(n4, 1)] ^ nArray[this.cfr_renamed_10292(n4, 2)];
                nArray3[n6] = n7;
                n5 = ++n4;
            }
            int n8 = n4 = 0;
            while (n8 < 4) {
                n3 = nArray3[n4 + 3 & 3];
                nArray4[n4++] = this.cfr_renamed_10293(n3, 5) ^ this.cfr_renamed_10293(n3, 14);
                n8 = n4;
            }
            int n9 = n4 = 0;
            while (n9 < 4) {
                int n10 = n3 = 0;
                while (n10 < 3) {
                    int n11 = this.cfr_renamed_10292(n4, n3);
                    nArray[n11] = nArray[n11] ^ nArray4[n4];
                    n10 = ++n3;
                }
                n9 = ++n4;
            }
            int n12 = n4 = 0;
            while (n12 < 4) {
                spredl spredl2 = this;
                nArray2[spredl2.cfr_renamed_10292((int)n4, (int)0)] = nArray[this.cfr_renamed_10292(n4, 0)];
                nArray2[spredl2.cfr_renamed_10292((int)n4, (int)1)] = nArray[this.cfr_renamed_10292(n4 + 3, 1)];
                int n13 = this.cfr_renamed_10292(n4, 2);
                spredl spredl3 = this;
                int n14 = spredl3.cfr_renamed_10293(nArray[spredl3.cfr_renamed_10292(n4, 2)], 11);
                nArray2[n13] = n14;
                n12 = ++n4;
            }
            nArray2[0] = nArray2[0] ^ this.cfr_renamed_119[n];
            int n15 = n4 = 0;
            while (n15 < 4) {
                int n16 = n3 = 0;
                while (n16 < 3) {
                    int n17 = this.cfr_renamed_10292(n4, n3);
                    int n18 = nArray2[this.cfr_renamed_10292(n4, n3)] ^ ~nArray2[this.cfr_renamed_10292(n4, n3 + 1)] & nArray2[this.cfr_renamed_10292(n4, n3 + 2)];
                    nArray[n17] = n18;
                    n16 = ++n3;
                }
                n15 = ++n4;
            }
            int n19 = n4 = 0;
            while (n19 < 4) {
                spredl spredl4 = this;
                nArray2[spredl4.cfr_renamed_10292((int)n4, (int)0)] = nArray[this.cfr_renamed_10292(n4, 0)];
                spredl spredl5 = this;
                nArray2[spredl4.cfr_renamed_10292((int)n4, (int)1)] = spredl5.cfr_renamed_10293(nArray[spredl5.cfr_renamed_10292(n4, 1)], 1);
                int n20 = this.cfr_renamed_10292(n4, 2);
                spredl spredl6 = this;
                int n21 = spredl6.cfr_renamed_10293(nArray[spredl6.cfr_renamed_10292(n4 + 2, 2)], 8);
                nArray2[n20] = n21;
                n19 = ++n4;
            }
            System.arraycopy(nArray2, 0, nArray, 0, 12);
            n2 = ++n;
        }
        sprpxe.cfr_renamed_5171(nArray, 0, nArray.length, this.cfr_renamed_0, 0);
        this.cfr_renamed_3 = 2;
        if (arg0 != null) {
            System.arraycopy(this.cfr_renamed_0, 0, arg0, arg1, arg2);
        }
    }

    public void cfr_renamed_10296(byte[] arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n++;
            byte by = (byte)(this.cfr_renamed_0[n3] ^ arg0[arg1]);
            ++arg1;
            this.cfr_renamed_0[n3] = by;
            n2 = n;
        }
        spredl spredl2 = this;
        int n4 = arg2;
        spredl2.cfr_renamed_0[n4] = (byte)(spredl2.cfr_renamed_0[n4] ^ 1);
        spredl2.cfr_renamed_0[47] = (byte)(spredl2.cfr_renamed_0[47] ^ (this.cfr_renamed_4 == sprrdl.cfr_renamed_2 ? arg3 & 1 : arg3));
        this.cfr_renamed_3 = 1;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        int n;
        if (32 + arg1 > arg0.length) {
            throw new sprwjl(sprbjo.cfr_renamed_9("PgKbJf\u001fpJtYwM2Va\u001ffP}\u001faW}Mf"));
        }
        spredl spredl2 = this;
        byte[] byArray = spredl2.cfr_renamed_93.toByteArray();
        int n2 = 0;
        int n3 = spredl2.cfr_renamed_93.size();
        int n4 = 3;
        do {
            if (this.cfr_renamed_3 != 2) {
                this.cfr_renamed_10470(null, 0, 0, 0);
            }
            n = Math.min(n3, this.cfr_renamed_107);
            this.cfr_renamed_10296(byArray, n2, n, n4);
            n4 = 0;
            n2 += n;
        } while ((n3 -= n) != 0);
        spredl spredl3 = this;
        this.cfr_renamed_10470(arg0, arg1, 16, 64);
        spredl3.cfr_renamed_10296(null, 0, 0, 0);
        spredl3.cfr_renamed_10470(arg0, arg1 + 16, 16, 0);
        return 32;
    }
}

