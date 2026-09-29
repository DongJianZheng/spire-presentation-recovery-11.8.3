/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnica;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprt;

public class spradd {
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private sprff cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public int cfr_renamed_1195() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_4, 0, this.cfr_renamed_3, 0, this.cfr_renamed_4.length);
        this.cfr_renamed_2.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    public spradd(sprff sprff2, int n) {
        void arg1;
        void arg0;
        spradd spradd2 = this;
        void v1 = arg0;
        spradd spradd3 = this;
        this.cfr_renamed_2 = null;
        spradd3.cfr_renamed_2 = arg0;
        spradd3.cfr_renamed_1 = arg1 / 8;
        this.cfr_renamed_4 = new byte[v1.cfr_renamed_1195()];
        spradd2.cfr_renamed_3 = new byte[v1.cfr_renamed_1195()];
        spradd2.cfr_renamed_0 = new byte[sprff2.cfr_renamed_1195()];
    }

    public void cfr_renamed_3474(byte[] arg0) {
        spradd spradd2 = this;
        spradd2.cfr_renamed_2.cfr_renamed_3064(spradd2.cfr_renamed_3, 0, arg0, 0);
    }

    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        if (arg1 + this.cfr_renamed_1 > arg0.length) {
            throw new sprjkd(sprdfj.cfr_renamed_9("s=j&nsx&|5\u007f!:'u<: r<h'"));
        }
        if (arg3 + this.cfr_renamed_1 > arg2.length) {
            throw new sprjkd(sprnica.cfr_renamed_9("\u0012W\tR\bV]@\bD\u001bG\u000f\u0002\tM\u0012\u0002\u000eJ\u0012P\t"));
        }
        spradd spradd2 = this;
        spradd2.cfr_renamed_2.cfr_renamed_3064(spradd2.cfr_renamed_3, 0, this.cfr_renamed_0, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_1) {
            int n3 = arg3 + n;
            byte by = (byte)(this.cfr_renamed_0[n] ^ arg0[arg1 + n]);
            arg2[n3] = by;
            n2 = ++n;
        }
        spradd spradd3 = this;
        System.arraycopy(spradd3.cfr_renamed_3, spradd3.cfr_renamed_1, this.cfr_renamed_3, 0, this.cfr_renamed_3.length - this.cfr_renamed_1);
        spradd spradd4 = this;
        System.arraycopy(arg2, arg3, spradd4.cfr_renamed_3, spradd4.cfr_renamed_3.length - this.cfr_renamed_1, this.cfr_renamed_1);
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprnjd) {
            spradd spradd2;
            sprnjd sprnjd2 = (sprnjd)arg0;
            byte[] byArray = sprnjd2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_4.length) {
                spradd spradd3 = this;
                System.arraycopy(byArray, 0, spradd3.cfr_renamed_4, spradd3.cfr_renamed_4.length - byArray.length, byArray.length);
                spradd2 = this;
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
                spradd2 = this;
            }
            spradd2.cfr_renamed_41();
            this.cfr_renamed_2.cfr_renamed_1217(true, sprnjd2.cfr_renamed_284());
            return;
        }
        spradd spradd4 = this;
        spradd4.cfr_renamed_41();
        spradd4.cfr_renamed_2.cfr_renamed_1217(true, arg0);
    }

    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_2.cfr_renamed_1315()).append(sprdfj.cfr_renamed_9("5\u0010\\\u0011")).append(this.cfr_renamed_1 * 8).toString();
    }
}

