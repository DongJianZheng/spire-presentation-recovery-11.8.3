/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprvsc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.security.SecureRandom;

public class sprzxc
implements sprmc {
    public sprff cfr_renamed_112;
    public sprvsc cfr_renamed_119;
    public sprsc cfr_renamed_91;
    public sprff cfr_renamed_0;
    public boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public sprvsc cfr_renamed_4;

    public int cfr_renamed_3061(int arg0) {
        if (arg0 == 0) {
            return 32;
        }
        int n = 0;
        int n2 = arg0;
        while ((n2 & 1) == 0) {
            ++n;
            n2 = arg0 >> 1;
        }
        return n;
    }

    public sprvsc cfr_renamed_3062() {
        return this.cfr_renamed_4;
    }

    @Override
    public byte[] cfr_renamed_2771(long arg0, short arg1, byte[] arg2, int arg3, int arg4) {
        int n;
        int n2;
        sprzxc sprzxc2 = this;
        int n3 = sprzxc2.cfr_renamed_0.cfr_renamed_1195();
        int n4 = sprzxc2.cfr_renamed_4.cfr_renamed_2773();
        sprpxc sprpxc2 = sprzxc2.cfr_renamed_91.cfr_renamed_2683();
        int n5 = arg4;
        if (!sprzxc2.cfr_renamed_2) {
            n5 += n4;
        }
        int n6 = n3 - 1 - n5 % n3;
        if (!sprpxc2.cfr_renamed_2848() && !sprpxc2.cfr_renamed_2684()) {
            n2 = (255 - n6) / n3;
            sprzxc sprzxc3 = this;
            int n7 = sprzxc3.cfr_renamed_3063(sprzxc3.cfr_renamed_91.cfr_renamed_2794(), n2);
            n6 += n7 * n3;
        }
        n2 = arg4 + n4 + n6 + 1;
        if (this.cfr_renamed_1) {
            n2 += n3;
        }
        byte[] byArray = new byte[n2];
        int n8 = 0;
        if (this.cfr_renamed_1) {
            byte[] byArray2 = new byte[n3];
            sprzxc sprzxc4 = this;
            sprzxc4.cfr_renamed_91.cfr_renamed_2866().cfr_renamed_1354(byArray2);
            sprzxc4.cfr_renamed_0.cfr_renamed_1217(true, new sprnjd(null, byArray2));
            System.arraycopy(byArray2, 0, byArray, n8, n3);
            n8 += n3;
        }
        int n9 = n8;
        System.arraycopy(arg2, arg3, byArray, n8, arg4);
        n8 += arg4;
        if (!this.cfr_renamed_2) {
            byte[] byArray3 = this.cfr_renamed_4.cfr_renamed_2774(arg0, arg1, arg2, arg3, arg4);
            System.arraycopy(byArray3, 0, byArray, n8, byArray3.length);
            n8 += byArray3.length;
        }
        int n10 = n = 0;
        while (n10 <= n6) {
            byArray[n8++] = (byte)n6;
            n10 = ++n;
        }
        int n11 = n = n9;
        while (n11 < n8) {
            this.cfr_renamed_0.cfr_renamed_3064(byArray, n, byArray, n);
            n11 = n += n3;
        }
        if (this.cfr_renamed_2) {
            byte[] byArray4 = this.cfr_renamed_4.cfr_renamed_2774(arg0, arg1, byArray, 0, n8);
            System.arraycopy(byArray4, 0, byArray, n8, byArray4.length);
            n8 += byArray4.length;
        }
        return byArray;
    }

    public sprvsc cfr_renamed_3065() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprzxc(sprsc sprsc2, sprff sprff2, sprff sprff3, sprlc sprlc2, sprlc sprlc3, int n) throws IOException {
        sprnjd sprnjd2;
        sprnjd sprnjd3;
        sprzxc sprzxc2;
        int n2;
        byte[] byArray;
        byte[] byArray2;
        void arg2;
        void arg1;
        void arg4;
        void arg3;
        void arg5;
        void arg0;
        void v0 = arg0;
        sprzxc sprzxc3 = this;
        sprzxc3.cfr_renamed_91 = arg0;
        sprzxc3.cfr_renamed_3 = new byte[256];
        v0.cfr_renamed_2866().cfr_renamed_1354(this.cfr_renamed_3);
        this.cfr_renamed_1 = sprzsc.cfr_renamed_2755((sprsc)v0);
        this.cfr_renamed_2 = v0.cfr_renamed_2666().cfr_renamed_1;
        int n3 = 2 * arg5 + arg3.cfr_renamed_1218() + arg4.cfr_renamed_1218();
        if (!this.cfr_renamed_1) {
            n3 += arg1.cfr_renamed_1195() + arg2.cfr_renamed_1195();
        }
        byte[] byArray3 = sprzsc.cfr_renamed_2753((sprsc)arg0, n3);
        int n4 = 0;
        void v2 = arg3;
        sprvsc sprvsc2 = new sprvsc((sprsc)arg0, (sprlc)v2, byArray3, n4, v2.cfr_renamed_1218());
        void v3 = arg4;
        sprvsc sprvsc3 = new sprvsc((sprsc)arg0, (sprlc)v3, byArray3, n4 += arg3.cfr_renamed_1218(), v3.cfr_renamed_1218());
        sprnld sprnld2 = new sprnld(byArray3, n4 += arg4.cfr_renamed_1218(), (int)arg5);
        sprnld sprnld3 = new sprnld(byArray3, n4 += arg5, (int)arg5);
        n4 += arg5;
        if (this.cfr_renamed_1) {
            byArray2 = new byte[arg1.cfr_renamed_1195()];
            byArray = new byte[arg2.cfr_renamed_1195()];
            n2 = n4;
        } else {
            int n5 = n4;
            byArray2 = sprzra.cfr_renamed_533(byArray3, n5, n5 + arg1.cfr_renamed_1195());
            byArray = sprzra.cfr_renamed_533(byArray3, n4 += arg1.cfr_renamed_1195(), n4 + arg2.cfr_renamed_1195());
            n2 = n4 = n4 + arg2.cfr_renamed_1195();
        }
        if (n2 != n3) {
            throw new spryad(80);
        }
        if (arg0.cfr_renamed_2770()) {
            sprzxc2 = this;
            sprzxc sprzxc4 = this;
            sprzxc4.cfr_renamed_4 = sprvsc3;
            sprzxc4.cfr_renamed_119 = sprvsc2;
            this.cfr_renamed_0 = arg2;
            this.cfr_renamed_112 = arg1;
            sprnjd3 = new sprnjd(sprnld3, byArray);
            sprnjd2 = new sprnjd(sprnld2, byArray2);
        } else {
            sprzxc2 = this;
            sprzxc sprzxc5 = this;
            sprzxc sprzxc6 = this;
            sprzxc6.cfr_renamed_4 = sprvsc2;
            sprzxc6.cfr_renamed_119 = sprvsc3;
            sprzxc5.cfr_renamed_0 = arg1;
            sprzxc5.cfr_renamed_112 = arg2;
            sprnjd3 = new sprnjd(sprnld2, byArray2);
            sprnjd2 = new sprnjd(sprnld3, byArray);
        }
        sprzxc2.cfr_renamed_0.cfr_renamed_1217(true, sprnjd3);
        this.cfr_renamed_112.cfr_renamed_1217(false, sprnjd2);
    }

    public int cfr_renamed_3066(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        sprzxc sprzxc2;
        int n = arg1 + arg2;
        byte by = arg0[n - 1];
        int n2 = (by & 0xFF) + 1;
        int n3 = 0;
        int n4 = 0;
        if (sprzsc.cfr_renamed_2665(this.cfr_renamed_91) && n2 > arg3 || arg4 + n2 > arg2) {
            n2 = 0;
            sprzxc2 = this;
        } else {
            int n5 = n - n2;
            do {
                int n6 = arg0[n5] ^ by;
                n4 = (byte)(n4 | n6);
            } while (++n5 < n);
            n3 = n2;
            if (n4 != 0) {
                n2 = 0;
            }
            sprzxc2 = this;
        }
        byte[] byArray = sprzxc2.cfr_renamed_3;
        int n7 = n3;
        while (n7 < 256) {
            int n8 = byArray[n3] ^ by;
            n4 = (byte)(n4 | n8);
            n7 = ++n3;
        }
        byArray[0] = (byte)(byArray[0] ^ n4);
        return n2;
    }

    @Override
    public int cfr_renamed_2775(int arg0) {
        sprzxc sprzxc2 = this;
        int n = sprzxc2.cfr_renamed_0.cfr_renamed_1195();
        int n2 = sprzxc2.cfr_renamed_4.cfr_renamed_2773();
        int n3 = arg0;
        if (sprzxc2.cfr_renamed_1) {
            n3 -= n;
        }
        if (this.cfr_renamed_2) {
            n3 -= n2;
            n3 -= n3 % n;
        } else {
            int n4 = n3;
            n3 = n4 - n4 % n;
            n3 -= n2;
        }
        return --n3;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_3063(SecureRandom secureRandom, int n) {
        void arg1;
        void arg0;
        return Math.min(this.cfr_renamed_3061(arg0.nextInt()), (int)arg1);
    }

    @Override
    public byte[] cfr_renamed_2776(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        int n;
        int n2;
        sprzxc sprzxc2;
        sprzxc sprzxc3 = this;
        int n3 = sprzxc3.cfr_renamed_112.cfr_renamed_1195();
        int n4 = sprzxc3.cfr_renamed_119.cfr_renamed_2773();
        int n5 = n3;
        if (sprzxc3.cfr_renamed_2) {
            n5 += n4;
            sprzxc2 = this;
        } else {
            n5 = Math.max(n5, n4 + 1);
            sprzxc2 = this;
        }
        if (sprzxc2.cfr_renamed_1) {
            n5 += n3;
        }
        if (arg4 < n5) {
            throw new spryad(50);
        }
        int n6 = arg4;
        if (this.cfr_renamed_2) {
            n6 -= n4;
        }
        if (n6 % n3 != 0) {
            throw new spryad(21);
        }
        if (this.cfr_renamed_2) {
            n2 = arg3 + arg4;
            byte[] byArray = sprzra.cfr_renamed_533(arg2, n2 - n4, n2);
            byte[] byArray2 = this.cfr_renamed_119.cfr_renamed_2774(arg0, arg1, arg2, arg3, arg4 - n4);
            int n7 = n = !sprzra.cfr_renamed_559(byArray2, byArray) ? 1 : 0;
            if (n != 0) {
                throw new spryad(20);
            }
        }
        if (this.cfr_renamed_1) {
            this.cfr_renamed_112.cfr_renamed_1217(false, new sprnjd(null, arg2, arg3, n3));
            arg3 += n3;
            n6 -= n3;
        }
        int n8 = n2 = 0;
        while (n8 < n6) {
            this.cfr_renamed_112.cfr_renamed_3064(arg2, arg3 + n2, arg2, arg3 + n2);
            n8 = n2 += n3;
        }
        n2 = this.cfr_renamed_3066(arg2, arg3, n6, n3, this.cfr_renamed_2 ? 0 : n4);
        int n9 = n6 - n2;
        if (!this.cfr_renamed_2) {
            boolean bl;
            int n10 = n9 -= n4;
            int n11 = n = arg3 + n10;
            byte[] byArray = sprzra.cfr_renamed_533(arg2, n11, n11 + n4);
            boolean bl2 = bl = !sprzra.cfr_renamed_559(this.cfr_renamed_119.cfr_renamed_2955(arg0, arg1, arg2, arg3, n10, n6 - n4, this.cfr_renamed_3), byArray);
            if (bl || n2 == 0) {
                throw new spryad(20);
            }
        }
        int n12 = arg3;
        return sprzra.cfr_renamed_533(arg2, n12, n12 + n9);
    }
}

