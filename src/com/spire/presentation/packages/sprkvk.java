/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcll;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprolj;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprkvk
implements sprmr {
    private static final int cfr_renamed_112 = 4;
    private static final int cfr_renamed_119 = 5;
    private static final int cfr_renamed_91 = -1640531527;
    private static final int cfr_renamed_0 = -1209970333;
    private static final int cfr_renamed_1 = 20;
    private static final int cfr_renamed_2 = 32;
    private boolean cfr_renamed_3;
    private int[] cfr_renamed_4 = null;

    @Override
    public void cfr_renamed_41() {
    }

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
        this.cfr_renamed_4 = new int[44];
        this.cfr_renamed_4[0] = -1209970333;
        int n5 = n2 = 1;
        while (n5 < this.cfr_renamed_4.length) {
            sprkvk sprkvk2 = this;
            int n6 = n2++;
            sprkvk2.cfr_renamed_4[n6] = sprkvk2.cfr_renamed_4[n6 - 1] + -1640531527;
            n5 = n2;
        }
        n2 = nArray.length > this.cfr_renamed_4.length ? 3 * nArray.length : 3 * this.cfr_renamed_4.length;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = n = 0;
        while (n11 < n2) {
            sprkvk sprkvk3 = this;
            int n12 = n9;
            int n13 = sprkvk3.cfr_renamed_494(sprkvk3.cfr_renamed_4[n12] + n7 + n8, 3);
            this.cfr_renamed_4[n12] = n13;
            n7 = n13;
            n8 = nArray[n10] = this.cfr_renamed_494(nArray[n10] + n7 + n8, n7 + n8);
            n9 = (n9 + 1) % this.cfr_renamed_4.length;
            n10 = (n10 + 1) % nArray.length;
            n11 = ++n;
        }
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
        sprkvk sprkvk2 = this;
        void v1 = arg0;
        int n4 = this.cfr_renamed_3562((byte[])arg0, (int)arg1);
        int n5 = this.cfr_renamed_3562((byte[])v1, (int)(arg1 + 4));
        int n6 = sprkvk2.cfr_renamed_3562((byte[])v1, (int)(arg1 + 8));
        int n7 = sprkvk2.cfr_renamed_3562(byArray, (int)(arg1 + 12));
        n6 -= this.cfr_renamed_4[43];
        n4 -= this.cfr_renamed_4[42];
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
            sprkvk sprkvk3 = this;
            n9 = sprkvk3.cfr_renamed_494(n9, 5);
            int n13 = n7;
            n10 = n13 * (2 * n13 + 1);
            n10 = sprkvk3.cfr_renamed_494(n10, 5);
            sprkvk sprkvk4 = this;
            n6 -= sprkvk4.cfr_renamed_4[2 * n3 + 1];
            n6 = sprkvk4.cfr_renamed_493(n6, n9);
            n6 ^= n10;
            n4 -= this.cfr_renamed_4[2 * n3];
            n4 = sprkvk3.cfr_renamed_493(n4, n10);
            n4 ^= n9;
            n8 = --n3;
        }
        n7 -= this.cfr_renamed_4[1];
        sprkvk sprkvk5 = this;
        sprkvk sprkvk6 = this;
        sprkvk6.cfr_renamed_3582(n4, (byte[])arg2, (int)arg3);
        sprkvk6.cfr_renamed_3582(n5 -= this.cfr_renamed_4[0], (byte[])arg2, (int)(arg3 + 4));
        sprkvk5.cfr_renamed_3582(n6, (byte[])arg2, (int)(arg3 + 8));
        sprkvk5.cfr_renamed_3582(n7, (byte[])arg2, (int)(arg3 + 12));
        return 16;
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

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprkvk sprkvk2 = this;
        void v1 = arg0;
        int n4 = this.cfr_renamed_3562((byte[])arg0, (int)arg1);
        int n5 = this.cfr_renamed_3562((byte[])v1, (int)(arg1 + 4));
        int n6 = sprkvk2.cfr_renamed_3562((byte[])v1, (int)(arg1 + 8));
        int n7 = sprkvk2.cfr_renamed_3562(byArray, (int)(arg1 + 12));
        n5 += this.cfr_renamed_4[0];
        n7 += this.cfr_renamed_4[1];
        int n8 = n3 = 1;
        while (n8 <= 20) {
            int n9 = 0;
            int n10 = 0;
            int n11 = n5;
            n9 = n11 * (2 * n11 + 1);
            sprkvk sprkvk3 = this;
            n9 = sprkvk3.cfr_renamed_494(n9, 5);
            int n12 = n7;
            n10 = n12 * (2 * n12 + 1);
            n10 = sprkvk3.cfr_renamed_494(n10, 5);
            n4 ^= n9;
            n4 = sprkvk3.cfr_renamed_494(n4, n10);
            n6 ^= n10;
            n6 = sprkvk3.cfr_renamed_494(n6, n9);
            int n13 = n4 += this.cfr_renamed_4[2 * n3];
            n4 = n5;
            n5 = n6 += this.cfr_renamed_4[2 * n3 + 1];
            n6 = n7;
            n7 = n13;
            n8 = ++n3;
        }
        sprkvk sprkvk4 = this;
        sprkvk sprkvk5 = this;
        sprkvk5.cfr_renamed_3582(n4 += this.cfr_renamed_4[42], (byte[])arg2, (int)arg3);
        sprkvk5.cfr_renamed_3582(n5, (byte[])arg2, (int)(arg3 + 4));
        sprkvk4.cfr_renamed_3582(n6 += this.cfr_renamed_4[43], (byte[])arg2, (int)(arg3 + 8));
        sprkvk4.cfr_renamed_3582(n7, (byte[])arg2, (int)(arg3 + 12));
        return 16;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprkvk sprkvk2 = this;
        int n = sprkvk2.cfr_renamed_1195();
        if (sprkvk2.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprcll.cfr_renamed_9("i+\rH^\u0006\\\u0001U\r\u001b\u0006T\u001c\u001b\u0001U\u0001O\u0001Z\u0004R\u001b^\f"));
        }
        if (arg1 + n > arg0.length) {
            throw new sprddl(sprolj.cfr_renamed_9("%Z<A8\u0014.A*R)Fl@#[lG$[>@"));
        }
        if (arg3 + n > arg2.length) {
            throw new sprwjl(sprcll.cfr_renamed_9("\u0007N\u001cK\u001dOHY\u001d]\u000e^\u001a\u001b\u001cT\u0007\u001b\u001bS\u0007I\u001c"));
        }
        if (this.cfr_renamed_3) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprolj.cfr_renamed_9("]\"B-X%PlD-F-Y)@)FlD-G?Q(\u00148[lf\u000f\u0002l]\"]8\u0014a\u0014")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_3 = arg0;
        byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
        this.cfr_renamed_2402(byArray);
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray.length * 8, arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprcll.cfr_renamed_9(":x^");
    }

    private /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }
}

