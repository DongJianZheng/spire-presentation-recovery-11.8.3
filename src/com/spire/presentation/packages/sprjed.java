/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprseea;
import com.spire.presentation.packages.sprtsa;

public class sprjed
extends sprehd {
    private int cfr_renamed_112;
    private int[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 16;
    private int[] cfr_renamed_0;
    private static final int[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 32;
    private int[] cfr_renamed_4;

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprjed sprjed2 = (sprjed)arg0;
        sprjed sprjed3 = this;
        super.cfr_renamed_3767(sprjed2);
        sprjed3.cfr_renamed_3768(sprjed2);
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
        int n13 = n12 = 0;
        while (n13 < 16) {
            sprjed sprjed2 = this;
            int n14 = n12++;
            sprjed2.cfr_renamed_119[n14] = sprjed2.cfr_renamed_2[n14];
            n13 = n12;
        }
        int n15 = n12 = 16;
        while (n15 < 68) {
            sprjed sprjed3 = this;
            n11 = sprjed3.cfr_renamed_119[n12 - 3];
            n10 = n11 << 15 | n11 >>> 17;
            n9 = sprjed3.cfr_renamed_119[n12 - 13];
            n8 = n9 << 7 | n9 >>> 25;
            sprjed sprjed4 = this;
            int n16 = n12;
            int n17 = sprjed4.cfr_renamed_3769(sprjed4.cfr_renamed_119[n16 - 16] ^ this.cfr_renamed_119[n12 - 9] ^ n10) ^ n8 ^ this.cfr_renamed_119[n12 - 6];
            sprjed3.cfr_renamed_119[n16] = n17;
            n15 = ++n12;
        }
        int n18 = n12 = 0;
        while (n18 < 64) {
            sprjed sprjed5 = this;
            int n19 = n12;
            int n20 = sprjed5.cfr_renamed_119[n12] ^ this.cfr_renamed_119[n19 + 4];
            sprjed5.cfr_renamed_4[n19] = n20;
            n18 = ++n12;
        }
        sprjed sprjed6 = this;
        n12 = sprjed6.cfr_renamed_0[0];
        n11 = sprjed6.cfr_renamed_0[1];
        n10 = sprjed6.cfr_renamed_0[2];
        n9 = sprjed6.cfr_renamed_0[3];
        n8 = sprjed6.cfr_renamed_0[4];
        int n21 = sprjed6.cfr_renamed_0[5];
        int n22 = sprjed6.cfr_renamed_0[6];
        int n23 = sprjed6.cfr_renamed_0[7];
        int n24 = n7 = 0;
        while (n24 < 16) {
            n6 = n12 << 12 | n12 >>> 20;
            n5 = n6 + n8 + cfr_renamed_1[n7];
            n4 = n5 << 7 | n5 >>> 25;
            n3 = n4 ^ n6;
            sprjed sprjed7 = this;
            sprjed sprjed8 = this;
            n2 = sprjed7.cfr_renamed_3770(n12, n11, n10) + n9 + n3 + sprjed8.cfr_renamed_4[n7];
            n = sprjed7.cfr_renamed_3771(n8, n21, n22) + n23 + n4 + this.cfr_renamed_119[n7];
            n9 = n10;
            n10 = n11 << 9 | n11 >>> 23;
            n11 = n12;
            n12 = n2;
            n23 = n22;
            n22 = n21 << 19 | n21 >>> 13;
            n21 = n8;
            n8 = sprjed8.cfr_renamed_3772(n);
            n24 = ++n7;
        }
        int n25 = n7 = 16;
        while (n25 < 64) {
            n6 = n12 << 12 | n12 >>> 20;
            n5 = n6 + n8 + cfr_renamed_1[n7];
            n4 = n5 << 7 | n5 >>> 25;
            n3 = n4 ^ n6;
            sprjed sprjed9 = this;
            sprjed sprjed10 = this;
            n2 = sprjed9.cfr_renamed_3773(n12, n11, n10) + n9 + n3 + sprjed10.cfr_renamed_4[n7];
            n = sprjed9.cfr_renamed_3774(n8, n21, n22) + n23 + n4 + this.cfr_renamed_119[n7];
            n9 = n10;
            n10 = n11 << 9 | n11 >>> 23;
            n11 = n12;
            n12 = n2;
            n23 = n22;
            n22 = n21 << 19 | n21 >>> 13;
            n21 = n8;
            n8 = sprjed10.cfr_renamed_3772(n);
            n25 = ++n7;
        }
        sprjed sprjed11 = this;
        sprjed11.cfr_renamed_0[0] = sprjed11.cfr_renamed_0[0] ^ n12;
        sprjed11.cfr_renamed_0[1] = sprjed11.cfr_renamed_0[1] ^ n11;
        sprjed11.cfr_renamed_0[2] = sprjed11.cfr_renamed_0[2] ^ n10;
        sprjed11.cfr_renamed_0[3] = sprjed11.cfr_renamed_0[3] ^ n9;
        sprjed11.cfr_renamed_0[4] = sprjed11.cfr_renamed_0[4] ^ n8;
        sprjed11.cfr_renamed_0[5] = sprjed11.cfr_renamed_0[5] ^ n21;
        sprjed11.cfr_renamed_0[6] = sprjed11.cfr_renamed_0[6] ^ n22;
        sprjed11.cfr_renamed_0[7] = sprjed11.cfr_renamed_0[7] ^ n23;
        this.cfr_renamed_112 = 0;
    }

    private /* synthetic */ int cfr_renamed_3772(int arg0) {
        int n = arg0 << 9 | arg0 >>> 23;
        int n2 = arg0 << 17 | arg0 >>> 15;
        return arg0 ^ n ^ n2;
    }

    private /* synthetic */ void cfr_renamed_3768(sprjed arg0) {
        System.arraycopy(arg0.cfr_renamed_0, 0, this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        System.arraycopy(arg0.cfr_renamed_2, 0, this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_112 > 14) {
            sprjed sprjed2 = this;
            sprjed sprjed3 = this;
            sprjed2.cfr_renamed_2[sprjed3.cfr_renamed_112] = 0;
            ++sprjed2.cfr_renamed_112;
            sprjed3.cfr_renamed_3473();
        }
        sprjed sprjed4 = this;
        while (sprjed4.cfr_renamed_112 < 14) {
            sprjed sprjed5 = this;
            sprjed sprjed6 = this;
            sprjed4 = sprjed6;
            sprjed5.cfr_renamed_2[sprjed6.cfr_renamed_112] = 0;
            ++sprjed5.cfr_renamed_112;
        }
        this.cfr_renamed_2[this.cfr_renamed_112++] = (int)(arg0 >>> 32);
        this.cfr_renamed_2[this.cfr_renamed_112++] = (int)arg0;
    }

    private /* synthetic */ int cfr_renamed_3769(int arg0) {
        int n = arg0 << 15 | arg0 >>> 17;
        int n2 = arg0 << 23 | arg0 >>> 9;
        return arg0 ^ n ^ n2;
    }

    static {
        int n;
        int n2;
        cfr_renamed_1 = new int[64];
        int n3 = n2 = 0;
        while (n3 < 16) {
            n = 2043430169;
            int n4 = n2;
            int n5 = n << n4 | n >>> 32 - n2;
            sprjed.cfr_renamed_1[n4] = n5;
            n3 = ++n2;
        }
        int n6 = n2 = 16;
        while (n6 < 64) {
            n = n2 % 32;
            int n7 = 2055708042;
            sprjed.cfr_renamed_1[n2++] = n7 << n | n7 >>> 32 - n;
            n6 = n2;
        }
    }

    private /* synthetic */ int cfr_renamed_3774(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    public sprjed() {
        sprjed sprjed2 = this;
        sprjed2.cfr_renamed_0 = new int[8];
        sprjed2.cfr_renamed_2 = new int[16];
        this.cfr_renamed_119 = new int[68];
        this.cfr_renamed_4 = new int[64];
        this.cfr_renamed_41();
    }

    private /* synthetic */ int cfr_renamed_3771(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    private /* synthetic */ int cfr_renamed_3773(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg0 & arg2 | arg1 & arg2;
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprseea.cfr_renamed_9(" !@");
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        int n = (arg0[arg1] & 0xFF) << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        sprjed sprjed2 = this;
        this.cfr_renamed_2[sprjed2.cfr_renamed_112] = n;
        ++sprjed2.cfr_renamed_112;
        if (sprjed2.cfr_renamed_112 >= 16) {
            this.cfr_renamed_3473();
        }
    }

    private /* synthetic */ int cfr_renamed_3770(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprjed(sprjed sprjed2) {
        void arg0;
        sprjed sprjed3 = this;
        super((sprehd)arg0);
        this.cfr_renamed_0 = new int[8];
        sprjed3.cfr_renamed_2 = new int[16];
        sprjed3.cfr_renamed_119 = new int[68];
        this.cfr_renamed_4 = new int[64];
        this.cfr_renamed_3768(sprjed2);
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprjed(this);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprjed sprjed2 = this;
        sprjed2.cfr_renamed_3120();
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[0], (byte[])arg0, (int)(arg1 + false));
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[1], (byte[])arg0, (int)(arg1 + 4));
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[2], (byte[])arg0, (int)(arg1 + 8));
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[3], (byte[])arg0, (int)(arg1 + 12));
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[4], (byte[])arg0, (int)(arg1 + 16));
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[5], (byte[])arg0, (int)(arg1 + 20));
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[6], (byte[])arg0, (int)(arg1 + 24));
        sprtsa.cfr_renamed_442(sprjed2.cfr_renamed_0[7], (byte[])arg0, (int)(arg1 + 28));
        sprjed2.cfr_renamed_41();
        return 32;
    }

    @Override
    public void cfr_renamed_41() {
        sprjed sprjed2 = this;
        sprjed sprjed3 = this;
        super.cfr_renamed_41();
        sprjed3.cfr_renamed_0[0] = 1937774191;
        sprjed3.cfr_renamed_0[1] = 1226093241;
        sprjed3.cfr_renamed_0[2] = 388252375;
        sprjed3.cfr_renamed_0[3] = -628488704;
        sprjed3.cfr_renamed_0[4] = -1452330820;
        sprjed3.cfr_renamed_0[5] = 372324522;
        sprjed2.cfr_renamed_0[6] = -477237683;
        sprjed2.cfr_renamed_0[7] = -1325724082;
        sprjed2.cfr_renamed_112 = 0;
    }
}

