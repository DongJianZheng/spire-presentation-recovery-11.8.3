/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgaa;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprvof;

public class sprhid
implements sprqk {
    private int[] cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private int[] cfr_renamed_119;
    private final int cfr_renamed_91 = 256;
    private final int cfr_renamed_0 = 8;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3651(int[] nArray) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        void v4 = arg0;
        void v5 = arg0;
        void v6 = arg0;
        void v7 = arg0;
        void v8 = arg0;
        void v9 = arg0;
        void v10 = arg0;
        void v11 = arg0;
        v11[0] = v11[0] ^ arg0[1] << 11;
        v11[3] = v11[3] + arg0[0];
        v10[1] = v10[1] + arg0[2];
        v10[1] = v10[1] ^ arg0[2] >>> 2;
        v9[4] = v9[4] + arg0[1];
        v9[2] = v9[2] + arg0[3];
        v8[2] = v8[2] ^ arg0[3] << 8;
        v8[5] = v8[5] + arg0[2];
        v7[3] = v7[3] + arg0[4];
        v7[3] = v7[3] ^ arg0[4] >>> 16;
        v6[6] = v6[6] + arg0[3];
        v6[4] = v6[4] + arg0[5];
        v5[4] = v5[4] ^ arg0[5] << 10;
        v5[7] = v5[7] + arg0[4];
        v4[5] = v4[5] + arg0[6];
        v4[5] = v4[5] ^ arg0[6] >>> 4;
        v3[0] = v3[0] + arg0[5];
        v3[6] = v3[6] + arg0[7];
        v2[6] = v2[6] ^ arg0[7] << 8;
        v2[1] = v2[1] + arg0[6];
        v1[7] = v1[7] + arg0[0];
        v1[7] = v1[7] ^ arg0[0] >>> 9;
        v0[2] = v0[2] + arg0[7];
        v0[0] = v0[0] + arg0[1];
    }

    public sprhid() {
        sprhid sprhid2 = this;
        sprhid sprhid3 = this;
        sprhid sprhid4 = this;
        sprhid sprhid5 = this;
        sprhid sprhid6 = this;
        this.cfr_renamed_0 = 8;
        sprhid6.cfr_renamed_91 = 256;
        sprhid6.cfr_renamed_93 = null;
        sprhid5.cfr_renamed_119 = null;
        sprhid5.cfr_renamed_152 = 0;
        sprhid4.cfr_renamed_86 = 0;
        sprhid4.cfr_renamed_3 = 0;
        sprhid3.cfr_renamed_1 = 0;
        sprhid3.cfr_renamed_112 = new byte[1024];
        sprhid2.cfr_renamed_4 = null;
        sprhid2.cfr_renamed_2 = false;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (this.cfr_renamed_1 == 0) {
            sprhid sprhid2 = this;
            sprhid2.cfr_renamed_3652();
            sprhid2.cfr_renamed_112 = sprtsa.cfr_renamed_460(sprhid2.cfr_renamed_119);
        }
        sprhid sprhid3 = this;
        byte by = (byte)(this.cfr_renamed_112[sprhid3.cfr_renamed_1] ^ arg0);
        this.cfr_renamed_1 = sprhid3.cfr_renamed_1 + 1 & 0x3FF;
        return by;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (!(arg1 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvof.cfr_renamed_9("o\u001fp\u0010j\u0018bQv\u0010t\u0010k\u0014r\u0014tQv\u0010u\u0002c\u0015&\u0005iQO\"G0EQo\u001fo\u0005&\\&")).append(arg1.getClass().getName()).toString());
        }
        sprnld sprnld2 = (sprnld)arg1;
        this.cfr_renamed_2402(sprnld2.cfr_renamed_1521());
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprbgaa.cfr_renamed_9("47{-40z0`0u5}*q=")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(sprvof.cfr_renamed_9("\u0018h\u0001s\u0005&\u0013s\u0017`\u0014tQr\u001eiQu\u0019i\u0003r"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(sprbgaa.cfr_renamed_9("6a-d,`yv,r?q+4-{64*|6f-"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            if (this.cfr_renamed_1 == 0) {
                sprhid sprhid2 = this;
                sprhid2.cfr_renamed_3652();
                sprhid2.cfr_renamed_112 = sprtsa.cfr_renamed_460(sprhid2.cfr_renamed_119);
            }
            sprhid sprhid3 = this;
            arg3[n + arg4] = (byte)(sprhid3.cfr_renamed_112[sprhid3.cfr_renamed_1] ^ arg0[n + arg1]);
            this.cfr_renamed_1 = this.cfr_renamed_1 + 1 & 0x3FF;
            n2 = ++n;
        }
        return arg2;
    }

    private /* synthetic */ void cfr_renamed_3652() {
        int n;
        this.cfr_renamed_86 += ++this.cfr_renamed_3;
        int n2 = n = 0;
        while (n2 < 256) {
            int n3;
            int n4 = this.cfr_renamed_93[n];
            switch (n & 3) {
                case 0: {
                    sprhid sprhid2 = this;
                    while (false) {
                    }
                    sprhid sprhid3 = sprhid2;
                    sprhid2.cfr_renamed_152 ^= this.cfr_renamed_152 << 13;
                    break;
                }
                case 1: {
                    sprhid sprhid4 = this;
                    sprhid sprhid3 = sprhid4;
                    sprhid4.cfr_renamed_152 ^= this.cfr_renamed_152 >>> 6;
                    break;
                }
                case 2: {
                    sprhid sprhid5 = this;
                    sprhid sprhid3 = sprhid5;
                    sprhid5.cfr_renamed_152 ^= this.cfr_renamed_152 << 2;
                    break;
                }
                case 3: {
                    this.cfr_renamed_152 ^= this.cfr_renamed_152 >>> 16;
                }
                default: {
                    sprhid sprhid3 = this;
                }
            }
            sprhid3.cfr_renamed_152 += this.cfr_renamed_93[n + 128 & 0xFF];
            sprhid sprhid6 = this;
            this.cfr_renamed_93[n] = n3 = sprhid6.cfr_renamed_93[n4 >>> 2 & 0xFF] + this.cfr_renamed_152 + this.cfr_renamed_86;
            sprhid6.cfr_renamed_119[n++] = this.cfr_renamed_86 = this.cfr_renamed_93[n3 >>> 10 & 0xFF] + n4;
            n2 = n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprvof.cfr_renamed_9("O\"G0E");
    }

    @Override
    public void cfr_renamed_41() {
        sprhid sprhid2 = this;
        sprhid2.cfr_renamed_2402(sprhid2.cfr_renamed_4);
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        this.cfr_renamed_4 = arg0;
        if (this.cfr_renamed_93 == null) {
            this.cfr_renamed_93 = new int[256];
        }
        if (this.cfr_renamed_119 == null) {
            this.cfr_renamed_119 = new int[256];
        }
        int n2 = n = 0;
        while (n2 < 256) {
            sprhid sprhid2 = this;
            int n3 = n++;
            sprhid2.cfr_renamed_119[n3] = 0;
            sprhid2.cfr_renamed_93[n3] = 0;
            n2 = n;
        }
        sprhid sprhid3 = this;
        sprhid3.cfr_renamed_3 = 0;
        sprhid3.cfr_renamed_86 = 0;
        sprhid3.cfr_renamed_152 = 0;
        this.cfr_renamed_1 = 0;
        byte[] byArray = new byte[arg0.length + (arg0.length & 3)];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        int n4 = n = 0;
        while (n4 < byArray.length) {
            int n5 = n >>> 2;
            int n6 = sprtsa.cfr_renamed_439(byArray, n);
            this.cfr_renamed_119[n5] = n6;
            n4 = n += 4;
        }
        int[] nArray = new int[8];
        int n7 = n = 0;
        while (n7 < 8) {
            nArray[n++] = -1640531527;
            n7 = n;
        }
        int n8 = n = 0;
        while (n8 < 4) {
            this.cfr_renamed_3651(nArray);
            n8 = ++n;
        }
        int n9 = n = 0;
        while (n9 < 2) {
            int n10;
            int n11 = n10 = 0;
            while (n11 < 256) {
                int n12;
                int n13 = n12 = 0;
                while (n13 < 8) {
                    int n14 = n12;
                    nArray[n14] = nArray[n14] + (n < 1 ? this.cfr_renamed_119[n10 + n12] : this.cfr_renamed_93[n10 + n12]);
                    n13 = ++n12;
                }
                this.cfr_renamed_3651(nArray);
                int n15 = n12 = 0;
                while (n15 < 8) {
                    int n16 = n10 + n12;
                    int n17 = nArray[n12];
                    this.cfr_renamed_93[n16] = n17;
                    n15 = ++n12;
                }
                n11 = n10 += 8;
            }
            n9 = ++n;
        }
        this.cfr_renamed_3652();
        this.cfr_renamed_2 = true;
    }
}

