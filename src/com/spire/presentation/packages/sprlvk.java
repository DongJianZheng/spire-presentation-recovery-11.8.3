/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxxda;
import com.spire.presentation.packages.sprybl;

public class sprlvk
implements sprvv {
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private final int cfr_renamed_152 = 256;
    private int cfr_renamed_112;
    private int[] cfr_renamed_119;
    private int cfr_renamed_91;
    private final int cfr_renamed_0 = 8;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        this.cfr_renamed_1 = arg0;
        if (this.cfr_renamed_119 == null) {
            this.cfr_renamed_119 = new int[256];
        }
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = new int[256];
        }
        int n2 = n = 0;
        while (n2 < 256) {
            sprlvk sprlvk2 = this;
            int n3 = n++;
            sprlvk2.cfr_renamed_3[n3] = 0;
            sprlvk2.cfr_renamed_119[n3] = 0;
            n2 = n;
        }
        sprlvk sprlvk3 = this;
        sprlvk3.cfr_renamed_86 = 0;
        sprlvk3.cfr_renamed_93 = 0;
        sprlvk3.cfr_renamed_112 = 0;
        this.cfr_renamed_91 = 0;
        byte[] byArray = new byte[arg0.length + (arg0.length & 3)];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        int n4 = n = 0;
        while (n4 < byArray.length) {
            int n5 = n >>> 2;
            int n6 = sprpxe.cfr_renamed_439(byArray, n);
            this.cfr_renamed_3[n5] = n6;
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
                    nArray[n14] = nArray[n14] + (n < 1 ? this.cfr_renamed_3[n10 + n12] : this.cfr_renamed_119[n10 + n12]);
                    n13 = ++n12;
                }
                this.cfr_renamed_3651(nArray);
                int n15 = n12 = 0;
                while (n15 < 8) {
                    int n16 = n10 + n12;
                    int n17 = nArray[n12];
                    this.cfr_renamed_119[n16] = n17;
                    n15 = ++n12;
                }
                n11 = n10 += 8;
            }
            n9 = ++n;
        }
        this.cfr_renamed_3652();
        this.cfr_renamed_4 = true;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprbj sprbj2;
        int n;
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcye.cfr_renamed_9("5\u001b*\u00140\u001c8U,\u0014.\u00141\u0010(\u0010.U,\u0014/\u00069\u0011|\u00013U\u0015&\u001d4\u001fU5\u001b5\u0001|X|")).append(arg1.getClass().getName()).toString());
        }
        byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
        this.cfr_renamed_2402(byArray);
        String string = this.cfr_renamed_1315();
        if (byArray.length < 32) {
            n = byArray.length * 8;
            sprbj2 = arg1;
        } else {
            n = 256;
            sprbj2 = arg1;
        }
        sprybl.cfr_renamed_9170(new sprfdl(string, n, sprbj2, sprlrk.cfr_renamed_9915(arg0)));
    }

    @Override
    public void cfr_renamed_41() {
        sprlvk sprlvk2 = this;
        sprlvk2.cfr_renamed_2402(sprlvk2.cfr_renamed_1);
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (this.cfr_renamed_91 == 0) {
            sprlvk sprlvk2 = this;
            sprlvk2.cfr_renamed_3652();
            sprlvk2.cfr_renamed_2 = sprpxe.cfr_renamed_460(sprlvk2.cfr_renamed_3);
        }
        sprlvk sprlvk3 = this;
        byte by = (byte)(this.cfr_renamed_2[sprlvk3.cfr_renamed_91] ^ arg0);
        this.cfr_renamed_91 = sprlvk3.cfr_renamed_91 + 1 & 0x3FF;
        return by;
    }

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

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprxxda.cfr_renamed_9("A:\u000e A=\u000f=\u0015=\u00008\b'\u00040")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprcye.cfr_renamed_9("\u001c2\u0005)\u0001|\u0017)\u0013:\u0010.U(\u001a3U/\u001d3\u0007("));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprxxda.cfr_renamed_9(";\u0014 \u0011!\u0015t\u0003!\u00072\u0004&A \u000e;A'\t;\u0013 "));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            if (this.cfr_renamed_91 == 0) {
                sprlvk sprlvk2 = this;
                sprlvk2.cfr_renamed_3652();
                sprlvk2.cfr_renamed_2 = sprpxe.cfr_renamed_460(sprlvk2.cfr_renamed_3);
            }
            sprlvk sprlvk3 = this;
            arg3[n + arg4] = (byte)(sprlvk3.cfr_renamed_2[sprlvk3.cfr_renamed_91] ^ arg0[n + arg1]);
            this.cfr_renamed_91 = this.cfr_renamed_91 + 1 & 0x3FF;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprcye.cfr_renamed_9("\u0015&\u001d4\u001f");
    }

    public sprlvk() {
        sprlvk sprlvk2 = this;
        sprlvk sprlvk3 = this;
        sprlvk sprlvk4 = this;
        sprlvk sprlvk5 = this;
        sprlvk sprlvk6 = this;
        this.cfr_renamed_0 = 8;
        sprlvk6.cfr_renamed_152 = 256;
        sprlvk6.cfr_renamed_119 = null;
        sprlvk5.cfr_renamed_3 = null;
        sprlvk5.cfr_renamed_112 = 0;
        sprlvk4.cfr_renamed_93 = 0;
        sprlvk4.cfr_renamed_86 = 0;
        sprlvk3.cfr_renamed_91 = 0;
        sprlvk3.cfr_renamed_2 = new byte[1024];
        sprlvk2.cfr_renamed_1 = null;
        sprlvk2.cfr_renamed_4 = false;
    }

    private /* synthetic */ void cfr_renamed_3652() {
        int n;
        this.cfr_renamed_93 += ++this.cfr_renamed_86;
        int n2 = n = 0;
        while (n2 < 256) {
            int n3;
            int n4 = this.cfr_renamed_119[n];
            switch (n & 3) {
                case 0: {
                    sprlvk sprlvk2 = this;
                    while (false) {
                    }
                    sprlvk sprlvk3 = sprlvk2;
                    sprlvk2.cfr_renamed_112 ^= this.cfr_renamed_112 << 13;
                    break;
                }
                case 1: {
                    sprlvk sprlvk4 = this;
                    sprlvk sprlvk3 = sprlvk4;
                    sprlvk4.cfr_renamed_112 ^= this.cfr_renamed_112 >>> 6;
                    break;
                }
                case 2: {
                    sprlvk sprlvk5 = this;
                    sprlvk sprlvk3 = sprlvk5;
                    sprlvk5.cfr_renamed_112 ^= this.cfr_renamed_112 << 2;
                    break;
                }
                case 3: {
                    this.cfr_renamed_112 ^= this.cfr_renamed_112 >>> 16;
                }
                default: {
                    sprlvk sprlvk3 = this;
                }
            }
            sprlvk3.cfr_renamed_112 += this.cfr_renamed_119[n + 128 & 0xFF];
            sprlvk sprlvk6 = this;
            this.cfr_renamed_119[n] = n3 = sprlvk6.cfr_renamed_119[n4 >>> 2 & 0xFF] + this.cfr_renamed_112 + this.cfr_renamed_93;
            sprlvk6.cfr_renamed_3[n++] = this.cfr_renamed_93 = this.cfr_renamed_119[n3 >>> 10 & 0xFF] + n4;
            n2 = n;
        }
    }
}

