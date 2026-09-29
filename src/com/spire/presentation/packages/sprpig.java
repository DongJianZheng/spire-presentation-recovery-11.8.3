/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjhg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvmg;

public class sprpig
extends sprjhg {
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    public static byte[] cfr_renamed_7015(byte[] arg0, byte[] arg1) {
        return sproze.cfr_renamed_543(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprpig(sprvmg sprvmg2, byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprpig sprpig2 = this;
        super(false, (sprvmg)arg0);
        sprpig2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg1);
        sprpig2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray2);
    }

    public byte[] cfr_renamed_5974() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_91() {
        sprpig sprpig2 = this;
        return sprpig.cfr_renamed_7015(sprpig2.cfr_renamed_4, sprpig2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprpig(sprvmg sprvmg2, byte[] byArray) {
        void arg1;
        void arg0;
        sprpig sprpig2 = this;
        super(0 != 0, (sprvmg)arg0);
        sprpig2.cfr_renamed_4 = sproze.cfr_renamed_533((byte[])arg1, 0, 32);
        sprpig2.cfr_renamed_3 = sproze.cfr_renamed_533(byArray, 32, ((void)arg1).length);
    }

    public byte[] cfr_renamed_5955() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

