/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprjgka;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmik;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprwxo;
import com.spire.presentation.packages.sprybl;

public class sprxtk
implements sprmr {
    private long[] cfr_renamed_119;
    private int cfr_renamed_91;
    private static final long cfr_renamed_0 = -7046029254386353131L;
    private static final int cfr_renamed_1 = 64;
    private boolean cfr_renamed_2;
    private static final long cfr_renamed_3 = -5196783011329398165L;
    private static final int cfr_renamed_4 = 8;

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    private /* synthetic */ void cfr_renamed_3561(long arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            long l = arg0;
            arg1[n + arg2] = (byte)l;
            arg0 = l >>> 8;
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
        sprxtk sprxtk2 = this;
        long l = sprxtk2.cfr_renamed_3562((byte[])arg0, (int)arg1) + this.cfr_renamed_119[0];
        long l2 = sprxtk2.cfr_renamed_3562(byArray, (int)(arg1 + 8)) + this.cfr_renamed_119[1];
        int n4 = n3 = 1;
        while (n4 <= this.cfr_renamed_91) {
            sprxtk sprxtk3 = this;
            l = this.cfr_renamed_3634(l ^ l2, l2) + sprxtk3.cfr_renamed_119[2 * n3];
            int n5 = 2 * n3 + 1;
            l2 = sprxtk3.cfr_renamed_3634(l2 ^ l, l) + this.cfr_renamed_119[n5];
            n4 = ++n3;
        }
        this.cfr_renamed_3561(l, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3561(l2, (byte[])arg2, (int)(arg3 + 8));
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprwxo.cfr_renamed_9("+DL*O3");
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        int n2;
        long[] lArray = new long[(arg0.length + 7) / 8];
        int n3 = n2 = 0;
        while (n3 != arg0.length) {
            int n4 = n2 / 8;
            long l = lArray[n4] + ((long)(arg0[n2] & 0xFF) << 8 * (n2 % 8));
            lArray[n4] = l;
            n3 = ++n2;
        }
        this.cfr_renamed_119 = new long[2 * (this.cfr_renamed_91 + 1)];
        this.cfr_renamed_119[0] = -5196783011329398165L;
        int n5 = n2 = 1;
        while (n5 < this.cfr_renamed_119.length) {
            sprxtk sprxtk2 = this;
            int n6 = n2++;
            sprxtk2.cfr_renamed_119[n6] = sprxtk2.cfr_renamed_119[n6 - 1] + -7046029254386353131L;
            n5 = n2;
        }
        n2 = lArray.length > this.cfr_renamed_119.length ? 3 * lArray.length : 3 * this.cfr_renamed_119.length;
        long l = 0L;
        long l2 = 0L;
        int n7 = 0;
        int n8 = 0;
        int n9 = n = 0;
        while (n9 < n2) {
            sprxtk sprxtk3 = this;
            int n10 = n7;
            long l3 = sprxtk3.cfr_renamed_3634(sprxtk3.cfr_renamed_119[n10] + l + l2, 3L);
            this.cfr_renamed_119[n10] = l3;
            l = l3;
            l2 = lArray[n8] = this.cfr_renamed_3634(lArray[n8] + l + l2, l + l2);
            n7 = (n7 + 1) % this.cfr_renamed_119.length;
            n8 = (n8 + 1) % lArray.length;
            n9 = ++n;
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprmik)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjgka.cfr_renamed_9("*\f5\u0003/\u000b'B3\u00031\u0003.\u00077\u00071B3\u00030\u0011&\u0006c\u0016,B\u0011!vTwB*\f*\u0016cOc")).append(arg1.getClass().getName()).toString());
        }
        sprmik sprmik2 = (sprmik)arg1;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_91 = sprmik2.cfr_renamed_3343();
        byte[] byArray = sprmik2.cfr_renamed_1521();
        this.cfr_renamed_2402(byArray);
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray.length * 8, arg1, sprlrk.cfr_renamed_9915(arg0)));
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
        sprxtk sprxtk2 = this;
        long l = sprxtk2.cfr_renamed_3562((byte[])arg0, (int)arg1);
        long l2 = sprxtk2.cfr_renamed_3562(byArray, (int)(arg1 + 8));
        int n4 = n3 = sprxtk2.cfr_renamed_91;
        while (n4 >= 1) {
            sprxtk sprxtk3 = this;
            l2 = sprxtk3.cfr_renamed_3635(l2 - sprxtk3.cfr_renamed_119[2 * n3 + 1], l) ^ l;
            sprxtk sprxtk4 = this;
            long l3 = sprxtk4.cfr_renamed_3635(l - sprxtk4.cfr_renamed_119[2 * n3], l2);
            l = l3 ^ l2;
            n4 = --n3;
        }
        sprxtk sprxtk5 = this;
        sprxtk5.cfr_renamed_3561(l - sprxtk5.cfr_renamed_119[0], (byte[])arg2, (int)arg3);
        this.cfr_renamed_3561(l2 - this.cfr_renamed_119[1], (byte[])arg2, (int)(arg3 + 8));
        return 16;
    }

    private /* synthetic */ long cfr_renamed_3635(long arg0, long arg1) {
        return arg0 >>> (int)(arg1 & 0x3FL) | arg0 << (int)(64L - (arg1 & 0x3FL));
    }

    public sprxtk() {
        sprxtk sprxtk2 = this;
        sprxtk2.cfr_renamed_91 = 12;
        sprxtk2.cfr_renamed_119 = null;
    }

    private /* synthetic */ long cfr_renamed_3634(long arg0, long arg1) {
        return arg0 << (int)(arg1 & 0x3FL) | arg0 >>> (int)(64L - (arg1 & 0x3FL));
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ long cfr_renamed_3562(byte[] arg0, int arg1) {
        int n;
        long l = 0L;
        int n2 = n = 7;
        while (n2 >= 0) {
            int n3 = arg0[n + arg1] & 0xFF;
            l = (l << 8) + (long)n3;
            n2 = --n;
        }
        return l;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }
}

