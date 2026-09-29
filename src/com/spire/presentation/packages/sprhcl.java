/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjcs;
import com.spire.presentation.packages.sproxc;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprruk;
import com.spire.presentation.packages.sprwfl;

public class sprhcl
extends sprruk {
    @Override
    public void cfr_renamed_10346(long arg0) {
        int n = (int)(arg0 >>> 32);
        int n2 = (int)arg0;
        if (n != 0) {
            throw new IllegalStateException(sprjcs.cfr_renamed_9("n\u0000{\u0011b\u0004{T{\u001b/\u0006j\u0010z\u0017jTl\u001bz\u001a{\u0011}T\u007f\u0015|\u0000/\u000ej\u0006`Z"));
        }
        if (((long)this.cfr_renamed_2[12] & 0xFFFFFFFFL) >= ((long)n2 & 0xFFFFFFFFL)) {
            this.cfr_renamed_2[12] = this.cfr_renamed_2[12] - n2;
            return;
        }
        throw new IllegalStateException(sproxc.cfr_renamed_9("I\u0003\\\u0012E\u0007\\W\\\u0018\b\u0005M\u0013]\u0014MWK\u0018]\u0019\\\u0012ZWX\u0016[\u0003\b\rM\u0005GY"));
    }

    @Override
    public void cfr_renamed_3603() {
        if (this.cfr_renamed_2[12] == 0) {
            throw new IllegalStateException(sprjcs.cfr_renamed_9("n\u0000{\u0011b\u0004{T{\u001b/\u0006j\u0010z\u0017jTl\u001bz\u001a{\u0011}T\u007f\u0015|\u0000/\u000ej\u0006`Z"));
        }
        this.cfr_renamed_2[12] = this.cfr_renamed_2[12] - 1;
    }

    @Override
    public void cfr_renamed_10345(long arg0) {
        int n = (int)(arg0 >>> 32);
        int n2 = (int)arg0;
        if (n > 0) {
            throw new IllegalStateException(sproxc.cfr_renamed_9("I\u0003\\\u0012E\u0007\\W\\\u0018\b\u001eF\u0014Z\u0012I\u0004MWK\u0018]\u0019\\\u0012ZWX\u0016[\u0003\bEvD\u001aY"));
        }
        sprhcl sprhcl2 = this;
        int n3 = sprhcl2.cfr_renamed_2[12];
        sprhcl2.cfr_renamed_2[12] = sprhcl2.cfr_renamed_2[12] + n2;
        if (n3 != 0 && this.cfr_renamed_2[12] < n3) {
            throw new IllegalStateException(sprjcs.cfr_renamed_9("n\u0000{\u0011b\u0004{T{\u001b/\u001da\u0017}\u0011n\u0007jTl\u001bz\u001a{\u0011}T\u007f\u0015|\u0000/FQG=Z"));
        }
    }

    @Override
    public void cfr_renamed_3606() {
        this.cfr_renamed_2[12] = 0;
    }

    @Override
    public String cfr_renamed_1315() {
        return sproxc.cfr_renamed_9("k\u001fI4@\u0016\u001fB\u001bN");
    }

    @Override
    public void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            if (arg0.length != 32) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprjcs.cfr_renamed_9("T}\u0011~\u0001f\u0006j\u0007/F:B/\u0016f\u0000/\u001fj\r")).toString());
            }
            this.cfr_renamed_10347(arg0.length, this.cfr_renamed_2, 0);
            sprpxe.cfr_renamed_438(arg0, 0, this.cfr_renamed_2, 4, 8);
        }
        sprpxe.cfr_renamed_438(arg1, 0, this.cfr_renamed_2, 13, 3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3604(byte[] byArray) {
        void arg0;
        sprhcl sprhcl2 = this;
        sprhcl sprhcl3 = this;
        sprwfl.cfr_renamed_3698(sprhcl2.cfr_renamed_119, sprhcl2.cfr_renamed_2, sprhcl3.cfr_renamed_152);
        sprpxe.cfr_renamed_449(sprhcl3.cfr_renamed_152, (byte[])arg0, 0);
    }

    @Override
    public long cfr_renamed_3374() {
        return (long)this.cfr_renamed_2[12] & 0xFFFFFFFFL;
    }

    @Override
    public void cfr_renamed_3602() {
        this.cfr_renamed_2[12] = this.cfr_renamed_2[12] + 1;
        if (this.cfr_renamed_2[12] == 0) {
            throw new IllegalStateException(sproxc.cfr_renamed_9("I\u0003\\\u0012E\u0007\\W\\\u0018\b\u001eF\u0014Z\u0012I\u0004MWK\u0018]\u0019\\\u0012ZWX\u0016[\u0003\bEvD\u001aY"));
        }
    }

    @Override
    public int cfr_renamed_3540() {
        return 12;
    }
}

