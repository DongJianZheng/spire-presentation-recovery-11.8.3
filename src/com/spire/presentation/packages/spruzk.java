/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprqpaa;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxik;

public class spruzk {
    private sprmr cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_1315()).append(sprxik.cfr_renamed_9("\u0013>z?")).append(this.cfr_renamed_2 * 8).toString();
    }

    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (arg1 + this.cfr_renamed_2 > arg0.length) {
            throw new sprddl(sprqpaa.cfr_renamed_9("e0|+x~n+j8i,,*c1,-d1~*"));
        }
        if (arg3 + this.cfr_renamed_2 > arg2.length) {
            throw new sprwjl(sprxik.cfr_renamed_9("\u0012I\tL\bH]^\bZ\u001bY\u000f\u001c\tS\u0012\u001c\u000eT\u0012N\t"));
        }
        spruzk spruzk2 = this;
        spruzk2.cfr_renamed_0.cfr_renamed_3064(spruzk2.cfr_renamed_1, 0, this.cfr_renamed_3, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_2) {
            int n3 = arg3 + n;
            byte by = (byte)(this.cfr_renamed_3[n] ^ arg0[arg1 + n]);
            arg2[n3] = by;
            n2 = ++n;
        }
        spruzk spruzk3 = this;
        System.arraycopy(spruzk3.cfr_renamed_1, spruzk3.cfr_renamed_2, this.cfr_renamed_1, 0, this.cfr_renamed_1.length - this.cfr_renamed_2);
        spruzk spruzk4 = this;
        System.arraycopy(arg2, arg3, spruzk4.cfr_renamed_1, spruzk4.cfr_renamed_1.length - this.cfr_renamed_2, this.cfr_renamed_2);
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_4, 0, this.cfr_renamed_1, 0, this.cfr_renamed_4.length);
        this.cfr_renamed_0.cfr_renamed_41();
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_3474(byte[] arg0) {
        spruzk spruzk2 = this;
        spruzk2.cfr_renamed_0.cfr_renamed_3064(spruzk2.cfr_renamed_1, 0, arg0, 0);
    }

    /*
     * WARNING - void declaration
     */
    public spruzk(sprmr sprmr2, int n) {
        void arg1;
        void arg0;
        spruzk spruzk2 = this;
        void v1 = arg0;
        spruzk spruzk3 = this;
        this.cfr_renamed_0 = null;
        spruzk3.cfr_renamed_0 = arg0;
        spruzk3.cfr_renamed_2 = arg1 / 8;
        this.cfr_renamed_4 = new byte[v1.cfr_renamed_1195()];
        spruzk2.cfr_renamed_1 = new byte[v1.cfr_renamed_1195()];
        spruzk2.cfr_renamed_3 = new byte[sprmr2.cfr_renamed_1195()];
    }

    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprkpk) {
            spruzk spruzk2;
            sprkpk sprkpk2 = (sprkpk)arg0;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_4.length) {
                spruzk spruzk3 = this;
                System.arraycopy(byArray, 0, spruzk3.cfr_renamed_4, spruzk3.cfr_renamed_4.length - byArray.length, byArray.length);
                spruzk2 = this;
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
                spruzk2 = this;
            }
            spruzk2.cfr_renamed_41();
            this.cfr_renamed_0.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
            return;
        }
        spruzk spruzk4 = this;
        spruzk4.cfr_renamed_41();
        spruzk4.cfr_renamed_0.cfr_renamed_5535(true, arg0);
    }
}

