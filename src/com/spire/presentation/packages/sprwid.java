/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprhym;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprt;

public class sprwid
extends sprcnd {
    private byte[] cfr_renamed_91;
    private final int cfr_renamed_0;
    private final sprff cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_4, 0, this.cfr_renamed_91, 0, this.cfr_renamed_4.length);
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_1.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    public sprwid(sprff sprff2, int n) {
        void arg1;
        void arg0;
        sprwid sprwid2 = this;
        void v1 = arg0;
        sprwid sprwid3 = this;
        void v3 = arg0;
        super((sprff)v3);
        sprwid3.cfr_renamed_1 = v3;
        sprwid3.cfr_renamed_0 = arg1 / 8;
        this.cfr_renamed_4 = new byte[v1.cfr_renamed_1195()];
        sprwid2.cfr_renamed_91 = new byte[v1.cfr_renamed_1195()];
        sprwid2.cfr_renamed_2 = new byte[sprff2.cfr_renamed_1195()];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprjkd, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprwid sprwid2 = this;
        sprwid2.cfr_renamed_505(byArray, (int)arg1, sprwid2.cfr_renamed_0, (byte[])arg2, (int)arg3);
        return sprwid2.cfr_renamed_0;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        if (arg1 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg1;
            byte[] byArray = sprnjd2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_4.length) {
                int n;
                sprwid sprwid2 = this;
                System.arraycopy(byArray, 0, sprwid2.cfr_renamed_4, sprwid2.cfr_renamed_4.length - byArray.length, byArray.length);
                int n2 = n = 0;
                while (n2 < this.cfr_renamed_4.length - byArray.length) {
                    this.cfr_renamed_4[n++] = 0;
                    n2 = n;
                }
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            }
            this.cfr_renamed_41();
            if (sprnjd2.cfr_renamed_284() != null) {
                this.cfr_renamed_1.cfr_renamed_1217(true, sprnjd2.cfr_renamed_284());
                return;
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_1.cfr_renamed_1217(true, arg1);
            }
        }
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) throws sprjkd, IllegalStateException {
        if (this.cfr_renamed_3 == 0) {
            sprwid sprwid2 = this;
            sprwid2.cfr_renamed_1.cfr_renamed_3064(sprwid2.cfr_renamed_91, 0, this.cfr_renamed_2, 0);
        }
        byte by = (byte)(this.cfr_renamed_2[this.cfr_renamed_3++] ^ arg0);
        sprwid sprwid3 = this;
        if (sprwid3.cfr_renamed_3 == sprwid3.cfr_renamed_0) {
            this.cfr_renamed_3 = 0;
            sprwid sprwid4 = this;
            System.arraycopy(this.cfr_renamed_91, sprwid4.cfr_renamed_0, sprwid4.cfr_renamed_91, 0, this.cfr_renamed_91.length - this.cfr_renamed_0);
            sprwid sprwid5 = this;
            System.arraycopy(this.cfr_renamed_2, 0, sprwid5.cfr_renamed_91, sprwid5.cfr_renamed_91.length - this.cfr_renamed_0, this.cfr_renamed_0);
        }
        return by;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_1.cfr_renamed_1315()).append(sprhym.cfr_renamed_9("G\u0016.\u001b")).append(this.cfr_renamed_0 * 8).toString();
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_0;
    }
}

