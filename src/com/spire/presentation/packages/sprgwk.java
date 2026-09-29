/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmbba;
import com.spire.presentation.packages.sprnyk;
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;
import java.io.ByteArrayOutputStream;

public class sprgwk
implements spriw {
    private final int cfr_renamed_126 = 48;
    private final int cfr_renamed_88 = 2;
    private boolean cfr_renamed_31;
    private int cfr_renamed_272;
    private boolean cfr_renamed_145;
    private final int cfr_renamed_114 = 24;
    private byte[] cfr_renamed_96;
    private sprnyk cfr_renamed_105;
    private final int cfr_renamed_137 = 12;
    private int cfr_renamed_79;
    public final int cfr_renamed_107 = 44;
    private final int cfr_renamed_132 = 4;
    private final int cfr_renamed_102 = 12;
    private boolean cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private boolean cfr_renamed_152;
    private final ByteArrayOutputStream cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private final int cfr_renamed_91 = 1;
    private final int[] cfr_renamed_0;
    private final ByteArrayOutputStream cfr_renamed_1;
    private final int cfr_renamed_2 = 16;
    private final int cfr_renamed_3 = 3;
    private byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return this.cfr_renamed_505(byArray, 0, 1, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_10291(byte[] arg0, int arg1, int arg2) {
        int n;
        if (this.cfr_renamed_105 != sprnyk.cfr_renamed_4) {
            this.cfr_renamed_119[47] = (byte)(this.cfr_renamed_119[47] ^ arg2);
        }
        int[] nArray = new int[12];
        sprpxe.cfr_renamed_438(this.cfr_renamed_119, 0, nArray, 0, nArray.length);
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
                sprgwk sprgwk2 = this;
                nArray2[sprgwk2.cfr_renamed_10292((int)n4, (int)0)] = nArray[this.cfr_renamed_10292(n4, 0)];
                nArray2[sprgwk2.cfr_renamed_10292((int)n4, (int)1)] = nArray[this.cfr_renamed_10292(n4 + 3, 1)];
                int n13 = this.cfr_renamed_10292(n4, 2);
                sprgwk sprgwk3 = this;
                int n14 = sprgwk3.cfr_renamed_10293(nArray[sprgwk3.cfr_renamed_10292(n4, 2)], 11);
                nArray2[n13] = n14;
                n12 = ++n4;
            }
            nArray2[0] = nArray2[0] ^ this.cfr_renamed_0[n];
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
                sprgwk sprgwk4 = this;
                nArray2[sprgwk4.cfr_renamed_10292((int)n4, (int)0)] = nArray[this.cfr_renamed_10292(n4, 0)];
                sprgwk sprgwk5 = this;
                nArray2[sprgwk4.cfr_renamed_10292((int)n4, (int)1)] = sprgwk5.cfr_renamed_10293(nArray[sprgwk5.cfr_renamed_10292(n4, 1)], 1);
                int n20 = this.cfr_renamed_10292(n4, 2);
                sprgwk sprgwk6 = this;
                int n21 = sprgwk6.cfr_renamed_10293(nArray[sprgwk6.cfr_renamed_10292(n4 + 2, 2)], 8);
                nArray2[n20] = n21;
                n19 = ++n4;
            }
            System.arraycopy(nArray2, 0, nArray, 0, 12);
            n2 = ++n;
        }
        sprpxe.cfr_renamed_5171(nArray, 0, nArray.length, this.cfr_renamed_119, 0);
        this.cfr_renamed_79 = 2;
        if (arg0 != null) {
            System.arraycopy(this.cfr_renamed_119, 0, arg0, 0, arg1);
        }
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        if (this.cfr_renamed_31) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmbba.cfr_renamed_9("'\b\"i\u0005(\b'\t=F+\u0003i\u0007-\u0002,\u0002i\u0007/\u0012,\u0014i\u0014,\u0007-\u000f'\u0001i\u0007i\u0000<\n%F+\n&\u0005\"N")).append(this.cfr_renamed_1195()).append(spronq.cfr_renamed_9("\u0015yLoPh\u001c;Z}\u0015r[k@o\u0015}Zi\u0015")).append(this.cfr_renamed_152 ? sprmbba.cfr_renamed_9(",\b*\u00140\u0016=\u000f&\b") : spronq.cfr_renamed_9("\u007fPxGbEo\\t[")).toString());
        }
        this.cfr_renamed_112.write(arg0);
    }

    public int cfr_renamed_1195() {
        return 24;
    }

    public int cfr_renamed_10294() {
        return 16;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_152 = arg0;
        if (!(sprbj2 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\u0011\t&\u00020\u0007\"F \b \u0012i\u0016(\u0014(\u000b,\u0012,\u0014:F$\u0013:\u0012i\u000f'\u0005%\u0013-\u0003i\u0007'F\u00000"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        this.cfr_renamed_96 = sprkpk2.cfr_renamed_1205();
        if (this.cfr_renamed_96 == null || this.cfr_renamed_96.length != 16) {
            throw new IllegalArgumentException(spronq.cfr_renamed_9("mtZ\u007fLz^;G~Dn\\iPh\u0015~MzVoYb\u0015*\u0003;WbA~F;Z}\u0015Rc"));
        }
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\u0011\t&\u00020\u0007\"F \b \u0012i\u0016(\u0014(\u000b,\u0012,\u0014:F$\u0013:\u0012i\u000f'\u0005%\u0013-\u0003i\u0007i\r,\u001f"));
        }
        sprtpk sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
        this.cfr_renamed_86 = sprtpk2.cfr_renamed_1521();
        if (this.cfr_renamed_86.length != 16) {
            throw new IllegalArgumentException(spronq.cfr_renamed_9("mtZ\u007fLz^;^~L;XnFo\u0015yP;\u0004)\r;WrAh\u0015wZuR"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915((boolean)arg0)));
        this.cfr_renamed_119 = new byte[48];
        this.cfr_renamed_4 = new byte[16];
        this.cfr_renamed_145 = true;
        this.cfr_renamed_41();
    }

    private /* synthetic */ int cfr_renamed_10295(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n = arg2;
        byte[] byArray = new byte[24];
        int n2 = this.cfr_renamed_93 ? 0 : 128;
        int n3 = n;
        while (n3 != 0 || !this.cfr_renamed_93) {
            int n4;
            int n5 = Math.min(n, 24);
            if (this.cfr_renamed_152) {
                System.arraycopy(arg0, arg1, byArray, 0, n5);
            }
            this.cfr_renamed_10291(null, 0, n2);
            int n6 = n4 = 0;
            while (n6 < n5) {
                int n7 = arg4 + n4;
                byte by = arg0[arg1];
                ++arg1;
                byte by2 = (byte)(by ^ this.cfr_renamed_119[n4]);
                arg3[n7] = by2;
                n6 = ++n4;
            }
            sprgwk sprgwk2 = this;
            if (this.cfr_renamed_152) {
                sprgwk2.cfr_renamed_10296(byArray, 0, n5, 0);
            } else {
                sprgwk2.cfr_renamed_10296(arg3, arg4, n5, 0);
            }
            n2 = 0;
            arg4 += n5;
            n3 = n - n5;
            this.cfr_renamed_93 = true;
        }
        return arg2;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return arg0;
    }

    private /* synthetic */ void cfr_renamed_10297(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n;
        do {
            if (this.cfr_renamed_79 != 2) {
                this.cfr_renamed_10291(null, 0, 0);
            }
            n = Math.min(arg2, arg3);
            this.cfr_renamed_10296(arg0, arg1, n, arg4);
            arg4 = 0;
            arg1 += n;
        } while ((arg2 -= n) != 0);
    }

    private /* synthetic */ int cfr_renamed_10293(int arg0, int arg1) {
        return arg0 << (arg1 & 0x1F) ^ arg0 >>> (32 - arg1 & 0x1F);
    }

    @Override
    public String cfr_renamed_1315() {
        return sprmbba.cfr_renamed_9("\u0011\t&\u00020\u0007\"F\b#\b\"");
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sprgwk sprgwk2;
        if (!this.cfr_renamed_145) {
            throw new IllegalArgumentException(spronq.cfr_renamed_9("UP~Q;VzYw\u0015r[rA;Sn[xArZu\u0015yP}ZiP;PuViLkArZu\u001a\u007fPxGbEo\\t["));
        }
        sprgwk sprgwk3 = this;
        byte[] byArray = sprgwk3.cfr_renamed_1.toByteArray();
        int n = sprgwk3.cfr_renamed_1.size();
        if (sprgwk3.cfr_renamed_152 && n + 16 + arg1 > arg0.length || !this.cfr_renamed_152 && n - 16 + arg1 > arg0.length) {
            throw new sprwjl(sprmbba.cfr_renamed_9("\t<\u00129\u0013=F+\u0013/\u0000,\u0014i\u0012&\ti\u0015!\t;\u0012"));
        }
        this.cfr_renamed_10298();
        int n2 = 0;
        if (this.cfr_renamed_152) {
            int n3 = this.cfr_renamed_10295(byArray, 0, n, arg0, arg1);
            arg1 += n;
            sprgwk sprgwk4 = this;
            sprgwk2 = sprgwk4;
            sprgwk sprgwk5 = this;
            sprgwk5.cfr_renamed_4 = new byte[16];
            sprgwk5.cfr_renamed_10291(sprgwk5.cfr_renamed_4, 16, 64);
            System.arraycopy(sprgwk4.cfr_renamed_4, 0, arg0, arg1, 16);
            n2 = n + 16;
        } else {
            int n4;
            n2 = n4 = n - 16;
            this.cfr_renamed_10295(byArray, 0, n4, arg0, arg1);
            sprgwk sprgwk6 = this;
            sprgwk6.cfr_renamed_4 = new byte[16];
            sprgwk6.cfr_renamed_10291(sprgwk6.cfr_renamed_4, 16, 64);
            int n5 = 0;
            int n6 = n5;
            while (n6 < 16) {
                byte by = byArray[n4];
                ++n4;
                if (this.cfr_renamed_4[n5] != by) {
                    throw new IllegalArgumentException(spronq.cfr_renamed_9("VTx\u0015\u007fZ~F;[tA;XzAx]"));
                }
                n6 = ++n5;
            }
            sprgwk2 = this;
        }
        sprgwk2.cfr_renamed_3402(false);
        return n2;
    }

    public sprgwk() {
        sprgwk sprgwk2 = this;
        sprgwk sprgwk3 = this;
        sprgwk sprgwk4 = this;
        sprgwk sprgwk5 = this;
        sprgwk sprgwk6 = this;
        sprgwk sprgwk7 = this;
        sprgwk7.cfr_renamed_126 = 48;
        sprgwk7.cfr_renamed_114 = 24;
        sprgwk6.cfr_renamed_91 = 1;
        sprgwk6.cfr_renamed_88 = 2;
        sprgwk5.cfr_renamed_137 = 12;
        sprgwk5.cfr_renamed_3 = 3;
        sprgwk4.cfr_renamed_132 = 4;
        sprgwk4.cfr_renamed_102 = 12;
        sprgwk3.cfr_renamed_2 = 16;
        sprgwk3.cfr_renamed_107 = 44;
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
        sprgwk2.cfr_renamed_0 = nArray;
        sprgwk2.cfr_renamed_145 = false;
        sprgwk sprgwk8 = this;
        sprgwk2.cfr_renamed_112 = new ByteArrayOutputStream();
        sprgwk8.cfr_renamed_1 = new ByteArrayOutputStream();
    }

    private /* synthetic */ int cfr_renamed_10292(int arg0, int arg1) {
        return arg1 % 3 * 4 + arg0 % 4;
    }

    private /* synthetic */ void cfr_renamed_10298() {
        if (!this.cfr_renamed_31) {
            sprgwk sprgwk2 = this;
            byte[] byArray = sprgwk2.cfr_renamed_112.toByteArray();
            sprgwk2.cfr_renamed_10297(byArray, 0, byArray.length, this.cfr_renamed_272, 3);
            this.cfr_renamed_31 = true;
        }
    }

    private /* synthetic */ void cfr_renamed_3402(boolean arg0) {
        if (arg0) {
            this.cfr_renamed_4 = null;
        }
        sprgwk sprgwk2 = this;
        sproze.cfr_renamed_492(this.cfr_renamed_119, (byte)0);
        this.cfr_renamed_31 = false;
        this.cfr_renamed_93 = false;
        sprgwk2.cfr_renamed_79 = 2;
        this.cfr_renamed_1.reset();
        sprgwk2.cfr_renamed_112.reset();
        int n = sprgwk2.cfr_renamed_86.length;
        int n2 = this.cfr_renamed_96.length;
        byte[] byArray = new byte[44];
        byte[] byArray2 = byArray;
        sprgwk sprgwk3 = this;
        this.cfr_renamed_105 = sprnyk.cfr_renamed_3;
        this.cfr_renamed_272 = 44;
        System.arraycopy(this.cfr_renamed_86, 0, byArray2, 0, n);
        System.arraycopy(sprgwk3.cfr_renamed_96, 0, byArray2, n, n2);
        byArray[n + n2] = (byte)n2;
        sprgwk3.cfr_renamed_10297(byArray, 0, n + n2 + 1, this.cfr_renamed_272, 2);
    }

    public int cfr_renamed_10299() {
        return 16;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (!this.cfr_renamed_145) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\u0007\u0003,\u0002i\u0005(\n%F \b \u0012i\u0000<\b*\u0012 \t'F+\u0003/\t;\u0003i\u0003'\u0005;\u001f9\u0012 \t'I-\u0003*\u00140\u0016=\u000f&\b"));
        }
        if (this.cfr_renamed_105 != sprnyk.cfr_renamed_3) {
            throw new IllegalArgumentException(spronq.cfr_renamed_9("CZtQbTp\u0015sTh\u0015uZo\u0015yP~[;\\u\\o\\zYrF~Q"));
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprmbba.cfr_renamed_9(" \b9\u0013=F+\u0013/\u0000,\u0014i\u0012&\ti\u0015!\t;\u0012"));
        }
        sprgwk sprgwk2 = this;
        sprgwk2.cfr_renamed_1.write(arg0, arg1, arg2);
        int n = sprgwk2.cfr_renamed_1.size() - (this.cfr_renamed_152 ? 0 : 16);
        if (n >= this.cfr_renamed_1195()) {
            byte[] byArray = this.cfr_renamed_1.toByteArray();
            arg2 = n / this.cfr_renamed_1195() * this.cfr_renamed_1195();
            if (arg2 + arg4 > arg3.length) {
                throw new sprwjl(spronq.cfr_renamed_9("t@oEnA;WnS}Pi\u0015rF;AtZ;FsZiA"));
            }
            sprgwk sprgwk3 = this;
            sprgwk3.cfr_renamed_10298();
            sprgwk3.cfr_renamed_10295(byArray, 0, arg2, arg3, arg4);
            this.cfr_renamed_1.reset();
            this.cfr_renamed_1.write(byArray, arg2, byArray.length - arg2);
            return arg2;
        }
        return 0;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + 16;
    }

    public void cfr_renamed_10296(byte[] arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n++;
            byte by = (byte)(this.cfr_renamed_119[n3] ^ arg0[arg1]);
            ++arg1;
            this.cfr_renamed_119[n3] = by;
            n2 = n;
        }
        sprgwk sprgwk2 = this;
        int n4 = arg2;
        sprgwk2.cfr_renamed_119[n4] = (byte)(sprgwk2.cfr_renamed_119[n4] ^ 1);
        sprgwk2.cfr_renamed_119[47] = (byte)(sprgwk2.cfr_renamed_119[47] ^ (this.cfr_renamed_105 == sprnyk.cfr_renamed_4 ? arg3 & 1 : arg3));
        this.cfr_renamed_79 = 1;
    }

    @Override
    public void cfr_renamed_41() {
        if (!this.cfr_renamed_145) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\u0007\u0003,\u0002i\u0005(\n%F \b \u0012i\u0000<\b*\u0012 \t'F+\u0003/\t;\u0003i\u0003'\u0005;\u001f9\u0012 \t'I-\u0003*\u00140\u0016=\u000f&\b"));
        }
        this.cfr_renamed_3402(true);
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_31) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spronq.cfr_renamed_9("tZq;Vz[uZo\u0015yP;T\u007fQ~Q;T}A~G;G~T\u007f\\uR;T;SnYw\u0015yYtVp\u001d")).append(this.cfr_renamed_1195()).append(sprmbba.cfr_renamed_9("F+\u001f=\u0003:Oi\t/F \b9\u0013=F/\t;F")).append(this.cfr_renamed_152 ? spronq.cfr_renamed_9("~[xGbEo\\t[") : sprmbba.cfr_renamed_9("-\u0003*\u00140\u0016=\u000f&\b")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(spronq.cfr_renamed_9("r[k@o\u0015y@}S~G;AtZ;FsZiA"));
        }
        this.cfr_renamed_112.write(arg0, arg1, arg2);
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return this.cfr_renamed_4;
    }
}

