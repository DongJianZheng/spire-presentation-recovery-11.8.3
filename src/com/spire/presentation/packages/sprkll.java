/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprikl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrfi;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;

public class sprkll
extends sprikl {
    private int cfr_renamed_119;
    private int[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 32;
    private static final int cfr_renamed_1 = 16;
    private int[] cfr_renamed_2;
    private static final int[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_10477(sprkll arg0) {
        System.arraycopy(arg0.cfr_renamed_4, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        System.arraycopy(arg0.cfr_renamed_91, 0, this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
        this.cfr_renamed_119 = arg0.cfr_renamed_119;
    }

    public sprkll() {
        this(spriil.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        this.cfr_renamed_91[this.cfr_renamed_119++] = sprpxe.cfr_renamed_446(arg0, arg1);
        if (this.cfr_renamed_119 >= 16) {
            this.cfr_renamed_3473();
        }
    }

    static {
        int n;
        int n2;
        cfr_renamed_3 = new int[64];
        int n3 = n2 = 0;
        while (n3 < 16) {
            n = 2043430169;
            int n4 = n2;
            int n5 = n << n4 | n >>> 32 - n2;
            sprkll.cfr_renamed_3[n4] = n5;
            n3 = ++n2;
        }
        int n6 = n2 = 16;
        while (n6 < 64) {
            n = n2 % 32;
            int n7 = 2055708042;
            sprkll.cfr_renamed_3[n2++] = n7 << n | n7 >>> 32 - n;
            n6 = n2;
        }
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprkll sprkll2 = (sprkll)arg0;
        sprkll sprkll3 = this;
        super.cfr_renamed_10478(sprkll2);
        sprkll3.cfr_renamed_10477(sprkll2);
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15 = n14 = 0;
        while (n15 < 16) {
            sprkll sprkll2 = this;
            int n16 = n14++;
            sprkll2.cfr_renamed_2[n16] = sprkll2.cfr_renamed_91[n16];
            n15 = n14;
        }
        int n17 = n14 = 16;
        while (n17 < 68) {
            sprkll sprkll3 = this;
            n13 = sprkll3.cfr_renamed_2[n14 - 3];
            n12 = n13 << 15 | n13 >>> 17;
            n11 = sprkll3.cfr_renamed_2[n14 - 13];
            n10 = n11 << 7 | n11 >>> 25;
            sprkll sprkll4 = this;
            int n18 = n14;
            int n19 = sprkll4.cfr_renamed_3769(sprkll4.cfr_renamed_2[n18 - 16] ^ this.cfr_renamed_2[n14 - 9] ^ n12) ^ n10 ^ this.cfr_renamed_2[n14 - 6];
            sprkll3.cfr_renamed_2[n18] = n19;
            n17 = ++n14;
        }
        sprkll sprkll5 = this;
        n14 = sprkll5.cfr_renamed_4[0];
        n13 = sprkll5.cfr_renamed_4[1];
        n12 = sprkll5.cfr_renamed_4[2];
        n11 = sprkll5.cfr_renamed_4[3];
        n10 = sprkll5.cfr_renamed_4[4];
        int n20 = sprkll5.cfr_renamed_4[5];
        int n21 = sprkll5.cfr_renamed_4[6];
        int n22 = sprkll5.cfr_renamed_4[7];
        int n23 = n9 = 0;
        while (n23 < 16) {
            n8 = n14 << 12 | n14 >>> 20;
            n7 = n8 + n10 + cfr_renamed_3[n9];
            n6 = n7 << 7 | n7 >>> 25;
            n5 = n6 ^ n8;
            sprkll sprkll6 = this;
            n4 = sprkll6.cfr_renamed_2[n9];
            sprkll sprkll7 = this;
            n3 = n4 ^ sprkll7.cfr_renamed_2[n9 + 4];
            n2 = sprkll6.cfr_renamed_3770(n14, n13, n12) + n11 + n5 + n3;
            n = sprkll7.cfr_renamed_3771(n10, n20, n21) + n22 + n6 + n4;
            n11 = n12;
            n12 = n13 << 9 | n13 >>> 23;
            n13 = n14;
            n14 = n2;
            n22 = n21;
            n21 = n20 << 19 | n20 >>> 13;
            n20 = n10;
            n10 = sprkll6.cfr_renamed_3772(n);
            n23 = ++n9;
        }
        int n24 = n9 = 16;
        while (n24 < 64) {
            n8 = n14 << 12 | n14 >>> 20;
            n7 = n8 + n10 + cfr_renamed_3[n9];
            n6 = n7 << 7 | n7 >>> 25;
            n5 = n6 ^ n8;
            sprkll sprkll8 = this;
            n4 = sprkll8.cfr_renamed_2[n9];
            sprkll sprkll9 = this;
            n3 = n4 ^ sprkll9.cfr_renamed_2[n9 + 4];
            n2 = sprkll8.cfr_renamed_3773(n14, n13, n12) + n11 + n5 + n3;
            n = sprkll9.cfr_renamed_3774(n10, n20, n21) + n22 + n6 + n4;
            n11 = n12;
            n12 = n13 << 9 | n13 >>> 23;
            n13 = n14;
            n14 = n2;
            n22 = n21;
            n21 = n20 << 19 | n20 >>> 13;
            n20 = n10;
            n10 = sprkll8.cfr_renamed_3772(n);
            n24 = ++n9;
        }
        sprkll sprkll10 = this;
        sprkll10.cfr_renamed_4[0] = sprkll10.cfr_renamed_4[0] ^ n14;
        sprkll10.cfr_renamed_4[1] = sprkll10.cfr_renamed_4[1] ^ n13;
        sprkll10.cfr_renamed_4[2] = sprkll10.cfr_renamed_4[2] ^ n12;
        sprkll10.cfr_renamed_4[3] = sprkll10.cfr_renamed_4[3] ^ n11;
        sprkll10.cfr_renamed_4[4] = sprkll10.cfr_renamed_4[4] ^ n10;
        sprkll10.cfr_renamed_4[5] = sprkll10.cfr_renamed_4[5] ^ n20;
        sprkll10.cfr_renamed_4[6] = sprkll10.cfr_renamed_4[6] ^ n21;
        sprkll10.cfr_renamed_4[7] = sprkll10.cfr_renamed_4[7] ^ n22;
        this.cfr_renamed_119 = 0;
    }

    private /* synthetic */ int cfr_renamed_3770(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprrfi.cfr_renamed_9("AX!");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprkll sprkll2 = this;
        sprkll2.cfr_renamed_3120();
        sprpxe.cfr_renamed_457(sprkll2.cfr_renamed_4, (byte[])arg0, (int)arg1);
        sprkll2.cfr_renamed_41();
        return 32;
    }

    private /* synthetic */ int cfr_renamed_3771(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public void cfr_renamed_41() {
        sprkll sprkll2 = this;
        sprkll sprkll3 = this;
        super.cfr_renamed_41();
        sprkll3.cfr_renamed_4[0] = 1937774191;
        sprkll3.cfr_renamed_4[1] = 1226093241;
        sprkll3.cfr_renamed_4[2] = 388252375;
        sprkll3.cfr_renamed_4[3] = -628488704;
        sprkll3.cfr_renamed_4[4] = -1452330820;
        sprkll3.cfr_renamed_4[5] = 372324522;
        sprkll2.cfr_renamed_4[6] = -477237683;
        sprkll2.cfr_renamed_4[7] = -1325724082;
        sprkll2.cfr_renamed_119 = 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprkll(sprkll sprkll2) {
        void arg0;
        sprkll sprkll3 = this;
        sprkll sprkll4 = this;
        super((sprikl)arg0);
        sprkll4.cfr_renamed_4 = new int[8];
        sprkll4.cfr_renamed_91 = new int[16];
        sprkll3.cfr_renamed_2 = new int[68];
        sprybl.cfr_renamed_9170(sprkll3.cfr_renamed_10476());
        sprkll3.cfr_renamed_10477(sprkll2);
    }

    private /* synthetic */ int cfr_renamed_3772(int arg0) {
        int n = arg0 << 9 | arg0 >>> 23;
        int n2 = arg0 << 17 | arg0 >>> 15;
        return arg0 ^ n ^ n2;
    }

    private /* synthetic */ int cfr_renamed_3769(int arg0) {
        int n = arg0 << 15 | arg0 >>> 17;
        int n2 = arg0 << 23 | arg0 >>> 9;
        return arg0 ^ n ^ n2;
    }

    private /* synthetic */ int cfr_renamed_3773(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg0 & arg2 | arg1 & arg2;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_119 > 14) {
            sprkll sprkll2 = this;
            sprkll sprkll3 = this;
            sprkll2.cfr_renamed_91[sprkll3.cfr_renamed_119] = 0;
            ++sprkll2.cfr_renamed_119;
            sprkll3.cfr_renamed_3473();
        }
        sprkll sprkll4 = this;
        while (sprkll4.cfr_renamed_119 < 14) {
            sprkll sprkll5 = this;
            sprkll sprkll6 = this;
            sprkll4 = sprkll6;
            sprkll5.cfr_renamed_91[sprkll6.cfr_renamed_119] = 0;
            ++sprkll5.cfr_renamed_119;
        }
        this.cfr_renamed_91[this.cfr_renamed_119++] = (int)(arg0 >>> 32);
        this.cfr_renamed_91[this.cfr_renamed_119++] = (int)arg0;
    }

    private /* synthetic */ int cfr_renamed_3774(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprkll(this);
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprkll sprkll2 = this;
        return sprhel.cfr_renamed_10472(sprkll2, 256, (spriil)sprkll2.cfr_renamed_0);
    }

    public sprkll(spriil arg0) {
        super(arg0);
        this.cfr_renamed_4 = new int[8];
        this.cfr_renamed_91 = new int[16];
        this.cfr_renamed_2 = new int[68];
        sprybl.cfr_renamed_9170(this.cfr_renamed_10476());
        this.cfr_renamed_41();
    }
}

