/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrcg;
import com.spire.presentation.packages.sprwuf;

public class sprkeg
extends sprrcg {
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkeg(sprwuf sprwuf2, byte[] byArray) {
        super(false, (sprwuf)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_533(byArray, 0, ((void)arg1).length - 32);
        void v0 = arg1;
        this.cfr_renamed_3 = sproze.cfr_renamed_533((byte[])v0, ((void)v0).length - 32, ((void)arg1).length);
    }

    public byte[] cfr_renamed_5955() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_91() {
        sprkeg sprkeg2 = this;
        return sprkeg.cfr_renamed_7015(sprkeg2.cfr_renamed_4, sprkeg2.cfr_renamed_3);
    }

    public byte[] cfr_renamed_1144() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_1157() {
        return this.cfr_renamed_91();
    }

    public static byte[] cfr_renamed_7015(byte[] arg0, byte[] arg1) {
        return sproze.cfr_renamed_543(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprkeg(sprwuf sprwuf2, byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprkeg sprkeg2 = this;
        super(false, (sprwuf)arg0);
        sprkeg2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg1);
        sprkeg2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray2);
    }
}

