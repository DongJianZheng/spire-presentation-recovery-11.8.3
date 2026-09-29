/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqog;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruuia;

public class sprgmd
implements sprff {
    private static final int cfr_renamed_112 = 20;
    private static final int cfr_renamed_119 = 4;
    private static final int cfr_renamed_91 = -1640531527;
    private static final int cfr_renamed_0 = -1209970333;
    private static final int cfr_renamed_1 = 32;
    private static final int cfr_renamed_2 = 5;
    private int[] cfr_renamed_3 = null;
    private boolean cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3562(byte[] arg0, int arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 3;
        while (n3 >= 0) {
            byte by = arg0[n + arg1];
            n2 = (n2 << 8) + (by & 0xFF);
            n3 = --n;
        }
        return n2;
    }

    private /* synthetic */ void cfr_renamed_3582(int arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = arg0;
            arg1[n + arg2] = (byte)n3;
            arg0 = n3 >>> 8;
            n2 = ++n;
        }
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3396(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprgmd sprgmd2 = this;
        void v1 = arg0;
        int n4 = this.cfr_renamed_3562((byte[])arg0, (int)arg1);
        int n5 = this.cfr_renamed_3562((byte[])v1, (int)(arg1 + 4));
        int n6 = sprgmd2.cfr_renamed_3562((byte[])v1, (int)(arg1 + 8));
        int n7 = sprgmd2.cfr_renamed_3562(byArray, (int)(arg1 + 12));
        n6 -= this.cfr_renamed_3[43];
        n4 -= this.cfr_renamed_3[42];
        int n8 = n3 = 20;
        while (n8 >= 1) {
            int n9 = 0;
            int n10 = 0;
            int n11 = n7;
            n7 = n6;
            n6 = n5;
            n5 = n4;
            n4 = n11;
            int n12 = n5;
            n9 = n12 * (2 * n12 + 1);
            sprgmd sprgmd3 = this;
            n9 = sprgmd3.cfr_renamed_494(n9, 5);
            int n13 = n7;
            n10 = n13 * (2 * n13 + 1);
            n10 = sprgmd3.cfr_renamed_494(n10, 5);
            sprgmd sprgmd4 = this;
            n6 -= sprgmd4.cfr_renamed_3[2 * n3 + 1];
            n6 = sprgmd4.cfr_renamed_493(n6, n9);
            n6 ^= n10;
            n4 -= this.cfr_renamed_3[2 * n3];
            n4 = sprgmd3.cfr_renamed_493(n4, n10);
            n4 ^= n9;
            n8 = --n3;
        }
        n7 -= this.cfr_renamed_3[1];
        sprgmd sprgmd5 = this;
        sprgmd sprgmd6 = this;
        sprgmd6.cfr_renamed_3582(n4, (byte[])arg2, (int)arg3);
        sprgmd6.cfr_renamed_3582(n5 -= this.cfr_renamed_3[0], (byte[])arg2, (int)(arg3 + 4));
        sprgmd5.cfr_renamed_3582(n6, (byte[])arg2, (int)(arg3 + 8));
        sprgmd5.cfr_renamed_3582(n7, (byte[])arg2, (int)(arg3 + 12));
        return 16;
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (!(arg1 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqog.cfr_renamed_9("y#f,|$tm`,b,}(d(bm`,c>u)09\u007fmB\u000e&my#y90`0")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2402(((sprnld)arg1).cfr_renamed_1521());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprgmd sprgmd2 = this;
        void v1 = arg0;
        int n4 = this.cfr_renamed_3562((byte[])arg0, (int)arg1);
        int n5 = this.cfr_renamed_3562((byte[])v1, (int)(arg1 + 4));
        int n6 = sprgmd2.cfr_renamed_3562((byte[])v1, (int)(arg1 + 8));
        int n7 = sprgmd2.cfr_renamed_3562(byArray, (int)(arg1 + 12));
        n5 += this.cfr_renamed_3[0];
        n7 += this.cfr_renamed_3[1];
        int n8 = n3 = 1;
        while (n8 <= 20) {
            int n9 = 0;
            int n10 = 0;
            int n11 = n5;
            n9 = n11 * (2 * n11 + 1);
            sprgmd sprgmd3 = this;
            n9 = sprgmd3.cfr_renamed_494(n9, 5);
            int n12 = n7;
            n10 = n12 * (2 * n12 + 1);
            n10 = sprgmd3.cfr_renamed_494(n10, 5);
            n4 ^= n9;
            n4 = sprgmd3.cfr_renamed_494(n4, n10);
            n6 ^= n10;
            n6 = sprgmd3.cfr_renamed_494(n6, n9);
            int n13 = n4 += this.cfr_renamed_3[2 * n3];
            n4 = n5;
            n5 = n6 += this.cfr_renamed_3[2 * n3 + 1];
            n6 = n7;
            n7 = n13;
            n8 = ++n3;
        }
        sprgmd sprgmd4 = this;
        sprgmd sprgmd5 = this;
        sprgmd5.cfr_renamed_3582(n4 += this.cfr_renamed_3[42], (byte[])arg2, (int)arg3);
        sprgmd5.cfr_renamed_3582(n5, (byte[])arg2, (int)(arg3 + 4));
        sprgmd4.cfr_renamed_3582(n6 += this.cfr_renamed_3[43], (byte[])arg2, (int)(arg3 + 8));
        sprgmd4.cfr_renamed_3582(n7, (byte[])arg2, (int)(arg3 + 12));
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return spruuia.cfr_renamed_9("\u007f\u0016\u001b");
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprgmd sprgmd2 = this;
        int n = sprgmd2.cfr_renamed_1195();
        if (sprgmd2.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprqog.cfr_renamed_9("\u001fS{0(~*y#um~\"dmy#y9y,|$c(t"));
        }
        if (arg1 + n > arg0.length) {
            throw new sprjkd(spruuia.cfr_renamed_9("<C%X!\r7X3K0_uY:Bu^=B'Y"));
        }
        if (arg3 + n > arg2.length) {
            throw new spreid(sprqog.cfr_renamed_9("\u007f8d=e90/e+v(bmd\"\u007fmc%\u007f?d"));
        }
        if (this.cfr_renamed_4) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        int n2;
        int n3 = (arg0.length + 3) / 4;
        if (n3 == 0) {
            n3 = 1;
        }
        int[] nArray = new int[(arg0.length + 4 - 1) / 4];
        int n4 = n2 = arg0.length - 1;
        while (n4 >= 0) {
            nArray[--n2 / 4] = (nArray[n2 / 4] << 8) + (arg0[n2] & 0xFF);
            n4 = n2;
        }
        this.cfr_renamed_3 = new int[44];
        this.cfr_renamed_3[0] = -1209970333;
        int n5 = n2 = 1;
        while (n5 < this.cfr_renamed_3.length) {
            sprgmd sprgmd2 = this;
            int n6 = n2++;
            sprgmd2.cfr_renamed_3[n6] = sprgmd2.cfr_renamed_3[n6 - 1] + -1640531527;
            n5 = n2;
        }
        n2 = nArray.length > this.cfr_renamed_3.length ? 3 * nArray.length : 3 * this.cfr_renamed_3.length;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = n = 0;
        while (n11 < n2) {
            sprgmd sprgmd3 = this;
            int n12 = n9;
            int n13 = sprgmd3.cfr_renamed_494(sprgmd3.cfr_renamed_3[n12] + n7 + n8, 3);
            this.cfr_renamed_3[n12] = n13;
            n7 = n13;
            n8 = nArray[n10] = this.cfr_renamed_494(nArray[n10] + n7 + n8, n7 + n8);
            n9 = (n9 + 1) % this.cfr_renamed_3.length;
            n10 = (n10 + 1) % nArray.length;
            n11 = ++n;
        }
    }

    private /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }
}

