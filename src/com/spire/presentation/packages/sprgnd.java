/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sproqj;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprzra;

public class sprgnd
implements sprff {
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprff cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        int n;
        if (arg1 + this.cfr_renamed_4 > arg0.length) {
            throw new sprjkd(sprxvh.cfr_renamed_9("y}`fd3rfvuua0g\u007f|0`x|bg"));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            int n3 = n;
            byte by = (byte)(this.cfr_renamed_91[n3] ^ arg0[arg1 + n]);
            this.cfr_renamed_91[n3] = by;
            n2 = ++n;
        }
        sprgnd sprgnd2 = this;
        n = sprgnd2.cfr_renamed_3.cfr_renamed_3064(sprgnd2.cfr_renamed_91, 0, arg2, arg3);
        System.arraycopy(arg2, arg3, this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
        return n;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        boolean bl2 = this.cfr_renamed_1;
        this.cfr_renamed_1 = arg0;
        if (sprt2 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg1;
            byte[] byArray = sprnjd2.cfr_renamed_1205();
            if (byArray.length != this.cfr_renamed_4) {
                throw new IllegalArgumentException(sproqj.cfr_renamed_9("L*L0L%I-V%Q-J*\u00052@'Q+WdH1V0\u0005&@dQ,@dV%H!\u0005(@*B0MdD7\u0005&I+F/\u00057L>@"));
            }
            System.arraycopy(byArray, 0, this.cfr_renamed_0, 0, byArray.length);
            this.cfr_renamed_41();
            if (sprnjd2.cfr_renamed_284() != null) {
                this.cfr_renamed_3.cfr_renamed_1217((boolean)arg0, sprnjd2.cfr_renamed_284());
                return;
            }
            if (bl2 != arg0) {
                throw new IllegalArgumentException(sprxvh.cfr_renamed_9("pq}~|d3s{q}wv0v~pbj`gy}w3cgqgu3gzd{\u007ffd3`a\u007feywy}w3{vi="));
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_3.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
                return;
            }
            if (bl2 != arg0) {
                throw new IllegalArgumentException(sproqj.cfr_renamed_9("F%K*J0\u0005'M%K#@d@*F6\\4Q-K#\u00057Q%Q!\u00053L0M+P0\u00054W+S-A-K#\u0005/@=\u000b"));
            }
        }
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_3.cfr_renamed_1195();
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append(sprxvh.cfr_renamed_9("?PRP")).toString();
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (this.cfr_renamed_1) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    @Override
    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_0, 0, this.cfr_renamed_91, 0, this.cfr_renamed_0.length);
        sprgnd sprgnd2 = this;
        sprzra.cfr_renamed_492(sprgnd2.cfr_renamed_2, (byte)0);
        sprgnd2.cfr_renamed_3.cfr_renamed_41();
    }

    public sprgnd(sprff arg0) {
        sprgnd sprgnd2 = this;
        this.cfr_renamed_3 = null;
        this.cfr_renamed_3 = arg0;
        sprgnd2.cfr_renamed_4 = arg0.cfr_renamed_1195();
        sprgnd2.cfr_renamed_0 = new byte[this.cfr_renamed_4];
        sprgnd2.cfr_renamed_91 = new byte[sprgnd2.cfr_renamed_4];
        sprgnd2.cfr_renamed_2 = new byte[sprgnd2.cfr_renamed_4];
    }

    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        int n;
        if (arg1 + this.cfr_renamed_4 > arg0.length) {
            throw new sprjkd(sproqj.cfr_renamed_9("-K4P0\u0005&P\"C!WdQ+JdV,J6Q"));
        }
        System.arraycopy(arg0, arg1, this.cfr_renamed_2, 0, this.cfr_renamed_4);
        int n2 = this.cfr_renamed_3.cfr_renamed_3064(arg0, arg1, arg2, arg3);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4) {
            int n4 = arg3 + n;
            byte by = (byte)(arg2[n4] ^ this.cfr_renamed_91[n]);
            arg2[n4] = by;
            n3 = ++n;
        }
        sprgnd sprgnd2 = this;
        byte[] byArray = sprgnd2.cfr_renamed_91;
        sprgnd2.cfr_renamed_91 = sprgnd2.cfr_renamed_2;
        sprgnd2.cfr_renamed_2 = byArray;
        return n2;
    }

    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_3;
    }
}

