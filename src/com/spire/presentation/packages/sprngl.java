/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprjjl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkpl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprpaf;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprngl
implements spriw {
    private int[] cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private static final int cfr_renamed_112 = 4;
    private boolean cfr_renamed_119;
    private int[] cfr_renamed_91;
    private int[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprjjl cfr_renamed_4;

    @Override
    public int cfr_renamed_2345(int arg0) {
        return arg0;
    }

    private /* synthetic */ int cfr_renamed_3676() {
        sprngl sprngl2 = this;
        int n = sprngl2.cfr_renamed_93[0];
        int n2 = sprngl2.cfr_renamed_93[0] >>> 7;
        int n3 = sprngl2.cfr_renamed_93[1] >>> 6;
        int n4 = sprngl2.cfr_renamed_93[2] >>> 6;
        int n5 = sprngl2.cfr_renamed_93[2] >>> 17;
        int n6 = sprngl2.cfr_renamed_93[3];
        return (n ^ n2 ^ n3 ^ n4 ^ n5 ^ n6) & 1;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprkpl.cfr_renamed_9("\u00078!#.gqxx\u000b\u0005\u000b\u0004j)$)>`:!8!'%>%83j-?3>`#.),?$/`+.j\t\u001c"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        byte[] byArray = sprkpk2.cfr_renamed_1205();
        if (byArray == null || byArray.length != 12) {
            throw new IllegalArgumentException(sprpaf.cfr_renamed_9("vpPk_/\u00000\tCtCu\"Cg@wXpTq\u0011gIcRv]{\u00113\u0003\"S{EgB\"^d\u0011Kg"));
        }
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(sprkpl.cfr_renamed_9("\u00078!#.gqxx\u000b\u0005\u000b\u0004j)$)>`:!8!'%>%83j-?3>`#.),?$/`+`!%3"));
        }
        byte[] byArray2 = ((sprtpk)sprkpk2.cfr_renamed_284()).cfr_renamed_1521();
        if (byArray2.length != 16) {
            throw new IllegalArgumentException(sprpaf.cfr_renamed_9("vpPk_/\u00000\tCtCu\"ZgH\"\\wBv\u0011`T\"\u00000\t\"SkEq\u0011n^lV"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
        sprngl sprngl2 = this;
        sprngl sprngl3 = this;
        sprngl sprngl4 = this;
        sprngl4.cfr_renamed_86 = new byte[16];
        sprngl4.cfr_renamed_152 = new byte[16];
        sprngl3.cfr_renamed_93 = new int[4];
        sprngl3.cfr_renamed_0 = new int[4];
        sprngl2.cfr_renamed_2 = new int[2];
        sprngl2.cfr_renamed_91 = new int[2];
        System.arraycopy(byArray, 0, this.cfr_renamed_86, 0, byArray.length);
        System.arraycopy(byArray2, 0, this.cfr_renamed_152, 0, byArray2.length);
        this.cfr_renamed_41();
    }

    private static /* synthetic */ int cfr_renamed_10374(int arg0) {
        if ((arg0 & 0xFF) == arg0) {
            return 1;
        }
        if ((arg0 & 0xFFFF) == arg0) {
            return 2;
        }
        if ((arg0 & 0xFFFFFF) == arg0) {
            return 3;
        }
        return 4;
    }

    private /* synthetic */ void cfr_renamed_10375() {
        sprngl sprngl2 = this;
        sprngl2.cfr_renamed_2[0] = sprngl2.cfr_renamed_2[0] ^ this.cfr_renamed_91[0];
        sprngl2.cfr_renamed_2[1] = sprngl2.cfr_renamed_2[1] ^ this.cfr_renamed_91[1];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[] cfr_renamed_3674(int[] nArray, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1[0] = arg0[0] >>> 1 | v1[1] << 31;
        void v2 = arg0;
        v2[1] = arg0[1] >>> 1 | v2[2] << 31;
        v0[2] = arg0[2] >>> 1 | arg0[3] << 31;
        v0[3] = arg0[3] >>> 1 | arg1 << 31;
        return v0;
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    private /* synthetic */ int cfr_renamed_3675() {
        sprngl sprngl2 = this;
        int n = sprngl2.cfr_renamed_0[0];
        int n2 = sprngl2.cfr_renamed_0[0] >>> 3;
        int n3 = sprngl2.cfr_renamed_0[0] >>> 11;
        int n4 = sprngl2.cfr_renamed_0[0] >>> 13;
        int n5 = sprngl2.cfr_renamed_0[0] >>> 17;
        int n6 = sprngl2.cfr_renamed_0[0] >>> 18;
        int n7 = sprngl2.cfr_renamed_0[0] >>> 22;
        int n8 = sprngl2.cfr_renamed_0[0] >>> 24;
        int n9 = sprngl2.cfr_renamed_0[0] >>> 25;
        int n10 = sprngl2.cfr_renamed_0[0] >>> 26;
        int n11 = sprngl2.cfr_renamed_0[0] >>> 27;
        int n12 = sprngl2.cfr_renamed_0[1] >>> 8;
        int n13 = sprngl2.cfr_renamed_0[1] >>> 16;
        int n14 = sprngl2.cfr_renamed_0[1] >>> 24;
        int n15 = sprngl2.cfr_renamed_0[1] >>> 27;
        int n16 = sprngl2.cfr_renamed_0[1] >>> 29;
        int n17 = sprngl2.cfr_renamed_0[2] >>> 1;
        int n18 = sprngl2.cfr_renamed_0[2] >>> 3;
        int n19 = sprngl2.cfr_renamed_0[2] >>> 4;
        int n20 = sprngl2.cfr_renamed_0[2] >>> 6;
        int n21 = sprngl2.cfr_renamed_0[2] >>> 14;
        int n22 = sprngl2.cfr_renamed_0[2] >>> 18;
        int n23 = sprngl2.cfr_renamed_0[2] >>> 20;
        int n24 = sprngl2.cfr_renamed_0[2] >>> 24;
        int n25 = sprngl2.cfr_renamed_0[2] >>> 27;
        int n26 = sprngl2.cfr_renamed_0[2] >>> 28;
        int n27 = sprngl2.cfr_renamed_0[2] >>> 29;
        int n28 = sprngl2.cfr_renamed_0[2] >>> 31;
        int n29 = sprngl2.cfr_renamed_0[3];
        return (n ^ n10 ^ n14 ^ n25 ^ n29 ^ n2 & n18 ^ n3 & n4 ^ n5 & n6 ^ n11 & n15 ^ n12 & n13 ^ n16 & n17 ^ n19 & n23 ^ n7 & n8 & n9 ^ n20 & n21 & n22 ^ n24 & n26 & n27 & n28) & 1;
    }

    private /* synthetic */ void cfr_renamed_3678() {
        int n;
        int n2;
        int n3;
        int n4 = n3 = 0;
        while (n4 < 320) {
            sprngl sprngl2 = this;
            n2 = sprngl2.cfr_renamed_3673();
            sprngl sprngl3 = this;
            sprngl2.cfr_renamed_0 = sprngl3.cfr_renamed_3674(sprngl2.cfr_renamed_0, (this.cfr_renamed_3675() ^ sprngl3.cfr_renamed_93[0] ^ n2) & 1);
            sprngl2.cfr_renamed_93 = sprngl2.cfr_renamed_3674(sprngl2.cfr_renamed_93, (this.cfr_renamed_3676() ^ n2) & 1);
            n4 = ++n3;
        }
        int n5 = n3 = 0;
        while (n5 < 8) {
            int n6 = n2 = 0;
            while (n6 < 8) {
                sprngl sprngl4 = this;
                n = sprngl4.cfr_renamed_3673();
                sprngl sprngl5 = this;
                sprngl4.cfr_renamed_0 = sprngl5.cfr_renamed_3674(sprngl4.cfr_renamed_0, (this.cfr_renamed_3675() ^ sprngl5.cfr_renamed_93[0] ^ n ^ this.cfr_renamed_152[n3] >> n2) & 1);
                int n7 = this.cfr_renamed_3676() ^ n ^ this.cfr_renamed_152[n3 + 8] >> n2;
                sprngl4.cfr_renamed_93 = sprngl4.cfr_renamed_3674(sprngl4.cfr_renamed_93, n7 & 1);
                n6 = ++n2;
            }
            n5 = ++n3;
        }
        int n8 = n3 = 0;
        while (n8 < 2) {
            int n9 = n2 = 0;
            while (n9 < 32) {
                sprngl sprngl6 = this;
                n = sprngl6.cfr_renamed_3673();
                sprngl sprngl7 = this;
                sprngl6.cfr_renamed_0 = sprngl7.cfr_renamed_3674(sprngl6.cfr_renamed_0, (this.cfr_renamed_3675() ^ sprngl7.cfr_renamed_93[0]) & 1);
                sprngl6.cfr_renamed_93 = sprngl6.cfr_renamed_3674(sprngl6.cfr_renamed_93, this.cfr_renamed_3676() & 1);
                int n10 = n3;
                int n11 = sprngl6.cfr_renamed_2[n10] | n << n2;
                sprngl6.cfr_renamed_2[n10] = n11;
                n9 = ++n2;
            }
            n8 = ++n3;
        }
        int n12 = n3 = 0;
        while (n12 < 2) {
            int n13 = n2 = 0;
            while (n13 < 32) {
                sprngl sprngl8 = this;
                n = sprngl8.cfr_renamed_3673();
                sprngl sprngl9 = this;
                sprngl8.cfr_renamed_0 = sprngl9.cfr_renamed_3674(sprngl8.cfr_renamed_0, (this.cfr_renamed_3675() ^ sprngl9.cfr_renamed_93[0]) & 1);
                sprngl8.cfr_renamed_93 = sprngl8.cfr_renamed_3674(sprngl8.cfr_renamed_93, this.cfr_renamed_3676() & 1);
                int n14 = n3;
                int n15 = sprngl8.cfr_renamed_91[n14] | n << n2;
                sprngl8.cfr_renamed_91[n14] = n15;
                n13 = ++n2;
            }
            n12 = ++n3;
        }
        this.cfr_renamed_1 = true;
    }

    public sprngl() {
        sprngl sprngl2 = this;
        sprngl2.cfr_renamed_1 = false;
        sprngl2.cfr_renamed_119 = false;
        sprngl sprngl3 = this;
        sprngl2.cfr_renamed_4 = new sprjjl();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10376(int n) {
        void arg0;
        sprngl sprngl2 = this;
        this.cfr_renamed_91[0] = sprngl2.cfr_renamed_91[0] >>> 1 | this.cfr_renamed_91[1] << 31;
        sprngl2.cfr_renamed_91[1] = this.cfr_renamed_91[1] >>> 1 | arg0 << 31;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + 8;
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        if (this.cfr_renamed_119) {
            throw new IllegalStateException(sprkpl.cfr_renamed_9("+39/))+4/$j$+4+`'594j\"/`+$.%.`(%,/8%j0&!#.>%24e##0\"%84/8>"));
        }
        this.cfr_renamed_4.write(arg0);
    }

    private /* synthetic */ int cfr_renamed_3673() {
        sprngl sprngl2 = this;
        int n = sprngl2.cfr_renamed_0[0] >>> 2;
        int n2 = sprngl2.cfr_renamed_0[0] >>> 12;
        int n3 = sprngl2.cfr_renamed_0[0] >>> 15;
        int n4 = sprngl2.cfr_renamed_0[1] >>> 4;
        int n5 = sprngl2.cfr_renamed_0[1] >>> 13;
        int n6 = sprngl2.cfr_renamed_0[2];
        int n7 = sprngl2.cfr_renamed_0[2] >>> 9;
        int n8 = sprngl2.cfr_renamed_0[2] >>> 25;
        int n9 = sprngl2.cfr_renamed_0[2] >>> 31;
        int n10 = sprngl2.cfr_renamed_93[0] >>> 8;
        int n11 = sprngl2.cfr_renamed_93[0] >>> 13;
        int n12 = sprngl2.cfr_renamed_93[0] >>> 20;
        int n13 = sprngl2.cfr_renamed_93[1] >>> 10;
        int n14 = sprngl2.cfr_renamed_93[1] >>> 28;
        int n15 = sprngl2.cfr_renamed_93[2] >>> 15;
        int n16 = sprngl2.cfr_renamed_93[2] >>> 29;
        int n17 = sprngl2.cfr_renamed_93[2] >>> 30;
        return (n2 & n10 ^ n11 & n12 ^ n9 & n13 ^ n14 & n15 ^ n2 & n9 & n17 ^ n16 ^ n ^ n3 ^ n4 ^ n5 ^ n6 ^ n7 ^ n8) & 1;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return this.cfr_renamed_505(byArray, 0, 1, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_3402(boolean arg0) {
        if (arg0) {
            this.cfr_renamed_3 = null;
        }
        sprngl sprngl2 = this;
        this.cfr_renamed_4.reset();
        this.cfr_renamed_119 = false;
        sprngl sprngl3 = this;
        sprngl3.cfr_renamed_3471(sprngl2.cfr_renamed_152, sprngl3.cfr_renamed_86);
        sprngl2.cfr_renamed_3678();
    }

    @Override
    public String cfr_renamed_1315() {
        return sprpaf.cfr_renamed_9("vpPk_/\u00000\tCtCu");
    }

    private /* synthetic */ byte[] cfr_renamed_10377(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3;
            byte by = 0;
            byte by2 = arg0[arg1 + n];
            int n4 = n3 = 0;
            while (n4 < 8) {
                sprngl sprngl2 = this;
                int n5 = sprngl2.cfr_renamed_3673();
                sprngl sprngl3 = this;
                sprngl2.cfr_renamed_0 = sprngl3.cfr_renamed_3674(sprngl2.cfr_renamed_0, (this.cfr_renamed_3675() ^ sprngl3.cfr_renamed_93[0]) & 1);
                sprngl2.cfr_renamed_93 = sprngl2.cfr_renamed_3674(sprngl2.cfr_renamed_93, this.cfr_renamed_3676() & 1);
                int n6 = by2 >> n3 & 1;
                by = (byte)(by | (n6 ^ n5) << n3);
                int n7 = -n6;
                sprngl2.cfr_renamed_2[0] = sprngl2.cfr_renamed_2[0] ^ this.cfr_renamed_91[0] & n7;
                sprngl2.cfr_renamed_2[1] = sprngl2.cfr_renamed_2[1] ^ this.cfr_renamed_91[1] & n7;
                sprngl2.cfr_renamed_10376(sprngl2.cfr_renamed_3673());
                sprngl2.cfr_renamed_0 = sprngl2.cfr_renamed_3674(sprngl2.cfr_renamed_0, (this.cfr_renamed_3675() ^ this.cfr_renamed_93[0]) & 1);
                sprngl2.cfr_renamed_93 = sprngl2.cfr_renamed_3674(sprngl2.cfr_renamed_93, this.cfr_renamed_3676() & 1);
                n4 = ++n3;
            }
            int n8 = arg4 + n;
            arg3[n8] = by;
            n2 = ++n;
        }
        return arg3;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        if (!this.cfr_renamed_119) {
            sprngl sprngl2 = this;
            sprngl2.cfr_renamed_10378(sprngl2.cfr_renamed_4.cfr_renamed_9247(), 0, this.cfr_renamed_4.size());
            sprngl2.cfr_renamed_119 = true;
        }
        sprngl sprngl3 = this;
        sprngl3.cfr_renamed_10375();
        sprngl3.cfr_renamed_3 = sprpxe.cfr_renamed_448(sprngl3.cfr_renamed_2);
        System.arraycopy(sprngl3.cfr_renamed_3, 0, arg0, arg1, this.cfr_renamed_3.length);
        sprngl sprngl4 = this;
        sprngl4.cfr_renamed_3402(false);
        return sprngl4.cfr_renamed_3.length;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (!this.cfr_renamed_1) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprkpl.cfr_renamed_9("`$/>`#.#4#!&)9%.")).toString());
        }
        if (!this.cfr_renamed_119) {
            sprngl sprngl2 = this;
            sprngl2.cfr_renamed_10378(sprngl2.cfr_renamed_4.cfr_renamed_9247(), 0, this.cfr_renamed_4.size());
            sprngl2.cfr_renamed_119 = true;
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprpaf.cfr_renamed_9("k_rDv\u0011`DdWgC\"Em^\"Bj^pE"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprkpl.cfr_renamed_9("%5>0?4j\"?&,%8`>/%`9(%2>"));
        }
        this.cfr_renamed_10377(arg0, arg1, arg2, arg3, arg4);
        return arg2;
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_119) {
            throw new IllegalStateException(sprpaf.cfr_renamed_9("PqBmRkPvTf\u0011fPvP\"\\wBv\u0011`T\"PfUgU\"SgWmCg\u0011r]cXlEgIv\u001eaXrYgCvTzE"));
        }
        this.cfr_renamed_4.write(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3471(byte[] byArray, byte[] byArray2) {
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[12] = -1;
        v1[13] = -1;
        v0[14] = -1;
        v0[15] = 127;
        sprngl sprngl2 = this;
        sprngl2.cfr_renamed_152 = arg0;
        sprngl2.cfr_renamed_86 = arg1;
        sprngl sprngl3 = this;
        sprpxe.cfr_renamed_454(this.cfr_renamed_152, 0, sprngl3.cfr_renamed_0);
        sprpxe.cfr_renamed_454(sprngl3.cfr_renamed_86, 0, this.cfr_renamed_93);
    }

    private /* synthetic */ void cfr_renamed_10378(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2;
        int n3;
        byte[] byArray;
        if (arg2 < 128) {
            byte[] byArray2 = new byte[1 + arg2];
            byArray = byArray2;
            byArray2[0] = (byte)arg2;
            n3 = 0;
        } else {
            n3 = sprngl.cfr_renamed_10374(arg2);
            byArray = new byte[1 + n3 + arg2];
            byArray[0] = (byte)(0x80 | n3);
            n2 = arg2;
            int n4 = n = 0;
            while (n4 < n3) {
                int n5 = n2;
                byArray[1 + n] = (byte)n5;
                n2 = n5 >>> 8;
                n4 = ++n;
            }
        }
        int n6 = n2 = 0;
        while (n6 < arg2) {
            int n7 = 1 + n3 + n2;
            byte by = arg0[arg1 + n2];
            byArray[n7] = by;
            n6 = ++n2;
        }
        int n8 = n2 = 0;
        while (n8 < byArray.length) {
            int n9;
            n = byArray[n2];
            int n10 = n9 = 0;
            while (n10 < 8) {
                sprngl sprngl2 = this;
                sprngl sprngl3 = this;
                sprngl sprngl4 = this;
                this.cfr_renamed_0 = sprngl4.cfr_renamed_3674(sprngl4.cfr_renamed_0, (this.cfr_renamed_3675() ^ this.cfr_renamed_93[0]) & 1);
                sprngl3.cfr_renamed_93 = sprngl4.cfr_renamed_3674(sprngl4.cfr_renamed_93, this.cfr_renamed_3676() & 1);
                int n11 = -(n >> n9 & 1);
                sprngl2.cfr_renamed_2[0] = sprngl2.cfr_renamed_2[0] ^ this.cfr_renamed_91[0] & n11;
                sprngl3.cfr_renamed_2[1] = sprngl3.cfr_renamed_2[1] ^ this.cfr_renamed_91[1] & n11;
                sprngl2.cfr_renamed_10376(sprngl2.cfr_renamed_3673());
                sprngl2.cfr_renamed_0 = sprngl2.cfr_renamed_3674(sprngl2.cfr_renamed_0, (this.cfr_renamed_3675() ^ this.cfr_renamed_93[0]) & 1);
                sprngl2.cfr_renamed_93 = sprngl2.cfr_renamed_3674(sprngl2.cfr_renamed_93, this.cfr_renamed_3676() & 1);
                n10 = ++n9;
            }
            n8 = ++n2;
        }
    }
}

