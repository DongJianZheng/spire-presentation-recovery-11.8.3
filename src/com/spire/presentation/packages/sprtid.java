/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdgk;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprild;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprt;

public class sprtid
implements sprff {
    private static final long cfr_renamed_119 = -7046029254386353131L;
    private boolean cfr_renamed_91;
    private long[] cfr_renamed_0;
    private static final int cfr_renamed_1 = 64;
    private static final long cfr_renamed_2 = -5196783011329398165L;
    private int cfr_renamed_3;
    private static final int cfr_renamed_4 = 8;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprtid sprtid2 = this;
        long l = sprtid2.cfr_renamed_3562((byte[])arg0, (int)arg1) + this.cfr_renamed_0[0];
        long l2 = sprtid2.cfr_renamed_3562(byArray, (int)(arg1 + 8)) + this.cfr_renamed_0[1];
        int n4 = n3 = 1;
        while (n4 <= this.cfr_renamed_3) {
            sprtid sprtid3 = this;
            l = this.cfr_renamed_3634(l ^ l2, l2) + sprtid3.cfr_renamed_0[2 * n3];
            int n5 = 2 * n3 + 1;
            l2 = sprtid3.cfr_renamed_3634(l2 ^ l, l) + this.cfr_renamed_0[n5];
            n4 = ++n3;
        }
        this.cfr_renamed_3561(l, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3561(l2, (byte[])arg2, (int)(arg3 + 8));
        return 16;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
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

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (!(arg1 instanceof sprild)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqed.cfr_renamed_9("F\u0004Y\u000bC\u0003KJ_\u000b]\u000bB\u000f[\u000f]J_\u000b\\\u0019J\u000e\u000f\u001e@J})\u001a\\\u001bJF\u0004F\u001e\u000fG\u000f")).append(arg1.getClass().getName()).toString());
        }
        sprild sprild2 = (sprild)arg1;
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_3 = sprild2.cfr_renamed_3343();
        this.cfr_renamed_2402(sprild2.cfr_renamed_1521());
    }

    private /* synthetic */ long cfr_renamed_3634(long arg0, long arg1) {
        return arg0 << (int)(arg1 & 0x3FL) | arg0 >>> (int)(64L - (arg1 & 0x3FL));
    }

    private /* synthetic */ long cfr_renamed_3635(long arg0, long arg1) {
        return arg0 >>> (int)(arg1 & 0x3FL) | arg0 << (int)(64L - (arg1 & 0x3FL));
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
        this.cfr_renamed_0 = new long[2 * (this.cfr_renamed_3 + 1)];
        this.cfr_renamed_0[0] = -5196783011329398165L;
        int n5 = n2 = 1;
        while (n5 < this.cfr_renamed_0.length) {
            sprtid sprtid2 = this;
            int n6 = n2++;
            sprtid2.cfr_renamed_0[n6] = sprtid2.cfr_renamed_0[n6 - 1] + -7046029254386353131L;
            n5 = n2;
        }
        n2 = lArray.length > this.cfr_renamed_0.length ? 3 * lArray.length : 3 * this.cfr_renamed_0.length;
        long l = 0L;
        long l2 = 0L;
        int n7 = 0;
        int n8 = 0;
        int n9 = n = 0;
        while (n9 < n2) {
            sprtid sprtid3 = this;
            int n10 = n7;
            long l3 = sprtid3.cfr_renamed_3634(sprtid3.cfr_renamed_0[n10] + l + l2, 3L);
            this.cfr_renamed_0[n10] = l3;
            l = l3;
            l2 = lArray[n8] = this.cfr_renamed_3634(lArray[n8] + l + l2, l + l2);
            n7 = (n7 + 1) % this.cfr_renamed_0.length;
            n8 = (n8 + 1) % lArray.length;
            n9 = ++n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprdgk.cfr_renamed_9("Bw%\u0019&\u0000");
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
        sprtid sprtid2 = this;
        long l = sprtid2.cfr_renamed_3562((byte[])arg0, (int)arg1);
        long l2 = sprtid2.cfr_renamed_3562(byArray, (int)(arg1 + 8));
        int n4 = n3 = sprtid2.cfr_renamed_3;
        while (n4 >= 1) {
            sprtid sprtid3 = this;
            l2 = sprtid3.cfr_renamed_3635(l2 - sprtid3.cfr_renamed_0[2 * n3 + 1], l) ^ l;
            sprtid sprtid4 = this;
            long l3 = sprtid4.cfr_renamed_3635(l - sprtid4.cfr_renamed_0[2 * n3], l2);
            l = l3 ^ l2;
            n4 = --n3;
        }
        sprtid sprtid5 = this;
        sprtid5.cfr_renamed_3561(l - sprtid5.cfr_renamed_0[0], (byte[])arg2, (int)arg3);
        this.cfr_renamed_3561(l2 - this.cfr_renamed_0[1], (byte[])arg2, (int)(arg3 + 8));
        return 16;
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_91) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    public sprtid() {
        sprtid sprtid2 = this;
        sprtid2.cfr_renamed_3 = 12;
        sprtid2.cfr_renamed_0 = null;
    }
}

