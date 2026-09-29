/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmik;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprsph;
import com.spire.presentation.packages.sprtgka;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprybl;

public class sprual
implements sprmr {
    private static final int cfr_renamed_0 = -1640531527;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private static final int cfr_renamed_3 = -1209970333;
    private int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        int n2;
        int[] nArray = new int[(arg0.length + 3) / 4];
        int n3 = n2 = 0;
        while (n3 != arg0.length) {
            int n4 = n2 / 4;
            int n5 = nArray[n4] + ((arg0[n2] & 0xFF) << 8 * (n2 % 4));
            nArray[n4] = n5;
            n3 = ++n2;
        }
        this.cfr_renamed_4 = new int[2 * (this.cfr_renamed_1 + 1)];
        this.cfr_renamed_4[0] = -1209970333;
        int n6 = n2 = 1;
        while (n6 < this.cfr_renamed_4.length) {
            sprual sprual2 = this;
            int n7 = n2++;
            sprual2.cfr_renamed_4[n7] = sprual2.cfr_renamed_4[n7 - 1] + -1640531527;
            n6 = n2;
        }
        n2 = nArray.length > this.cfr_renamed_4.length ? 3 * nArray.length : 3 * this.cfr_renamed_4.length;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = n = 0;
        while (n12 < n2) {
            sprual sprual3 = this;
            int n13 = n10;
            int n14 = sprual3.cfr_renamed_494(sprual3.cfr_renamed_4[n13] + n8 + n9, 3);
            this.cfr_renamed_4[n13] = n14;
            n8 = n14;
            n9 = nArray[n11] = this.cfr_renamed_494(nArray[n11] + n8 + n9, n8 + n9);
            n10 = (n10 + 1) % this.cfr_renamed_4.length;
            n11 = (n11 + 1) % nArray.length;
            n12 = ++n;
        }
    }

    private /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> (arg1 & 0x1F) | arg0 << 32 - (arg1 & 0x1F);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        sprual sprual2 = this;
        int n4 = this.cfr_renamed_3562(byArray, n) + sprual2.cfr_renamed_4[0];
        int n5 = sprual2.cfr_renamed_3562(byArray, (int)(arg1 + 4)) + this.cfr_renamed_4[1];
        int n6 = n3 = 1;
        while (n6 <= this.cfr_renamed_1) {
            sprual sprual3 = this;
            n4 = this.cfr_renamed_494(n4 ^ n5, n5) + sprual3.cfr_renamed_4[2 * n3];
            int n7 = 2 * n3 + 1;
            n5 = sprual3.cfr_renamed_494(n5 ^ n4, n4) + this.cfr_renamed_4[n7];
            n6 = ++n3;
        }
        this.cfr_renamed_3582(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3582(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    @Override
    public void cfr_renamed_41() {
    }

    public sprual() {
        sprual sprual2 = this;
        sprual2.cfr_renamed_1 = 12;
        sprual2.cfr_renamed_4 = null;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprsph.cfr_renamed_9("&\u000bAeGz");
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << (arg1 & 0x1F) | arg0 >>> 32 - (arg1 & 0x1F);
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        byte[] byArray;
        sprual sprual2;
        if (arg1 instanceof sprmik) {
            sprmik sprmik2 = (sprmik)arg1;
            sprual sprual3 = this;
            sprual2 = sprual3;
            sprual3.cfr_renamed_1 = sprmik2.cfr_renamed_3343();
            byArray = sprmik2.cfr_renamed_1521();
            sprual3.cfr_renamed_2402(byArray);
        } else if (arg1 instanceof sprtpk) {
            sprtpk sprtpk2 = (sprtpk)arg1;
            byArray = sprtpk2.cfr_renamed_1521();
            sprual sprual4 = this;
            sprual2 = sprual4;
            sprual4.cfr_renamed_2402(byArray);
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtgka.cfr_renamed_9("ujjepmx$leneqahan$leowy`<ps$NG)7.$ujup<)<")).append(arg1.getClass().getName()).toString());
        }
        sprual2.cfr_renamed_2 = arg0;
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray.length * 8, arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    private /* synthetic */ int cfr_renamed_3562(byte[] arg0, int arg1) {
        return arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3582(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)arg0;
        arg1[v1 + true] = (byte)(arg0 >> 8);
        v0[v1 + 2] = (byte)(arg0 >> 16);
        v0[n2 + 3] = (byte)(arg0 >> 24);
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
        sprual sprual2 = this;
        int n4 = sprual2.cfr_renamed_3562((byte[])arg0, (int)arg1);
        int n5 = sprual2.cfr_renamed_3562(byArray, (int)(arg1 + 4));
        int n6 = n3 = sprual2.cfr_renamed_1;
        while (n6 >= 1) {
            sprual sprual3 = this;
            n5 = sprual3.cfr_renamed_493(n5 - sprual3.cfr_renamed_4[2 * n3 + 1], n4) ^ n4;
            int n7 = sprual3.cfr_renamed_493(n4 - this.cfr_renamed_4[2 * n3], n5);
            n4 = n7 ^ n5;
            n6 = --n3;
        }
        sprual sprual4 = this;
        sprual4.cfr_renamed_3582(n4 - sprual4.cfr_renamed_4[0], (byte[])arg2, (int)arg3);
        this.cfr_renamed_3582(n5 - this.cfr_renamed_4[1], (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }
}

