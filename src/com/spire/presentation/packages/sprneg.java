/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkeg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrcg;
import com.spire.presentation.packages.sprwuf;

public class sprneg
extends sprrcg {
    public final byte[] cfr_renamed_0;
    public final byte[] cfr_renamed_1;
    public final byte[] cfr_renamed_2;
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_1369() {
        return this.cfr_renamed_91();
    }

    /*
     * WARNING - void declaration
     */
    public sprneg(sprwuf sprwuf2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprneg sprneg2 = this;
        sprneg sprneg3 = this;
        super(true, (sprwuf)arg0);
        this.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg1);
        sprneg3.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg2);
        sprneg3.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg3);
        sprneg2.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg4);
        sprneg2.cfr_renamed_0 = sproze.cfr_renamed_158(byArray5);
    }

    public byte[] cfr_renamed_1157() {
        sprneg sprneg2 = this;
        return sprkeg.cfr_renamed_7015(sprneg2.cfr_renamed_1, sprneg2.cfr_renamed_0);
    }

    public byte[] cfr_renamed_91() {
        byte[][] byArrayArray = new byte[5][];
        byArrayArray[0] = this.cfr_renamed_2;
        byArrayArray[1] = this.cfr_renamed_1;
        byArrayArray[2] = this.cfr_renamed_0;
        byArrayArray[3] = this.cfr_renamed_3;
        byArrayArray[4] = this.cfr_renamed_4;
        return sproze.cfr_renamed_1120(byArrayArray);
    }

    public byte[] cfr_renamed_1144() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public byte[] cfr_renamed_5950() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_5956() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_5955() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    public byte[] cfr_renamed_596() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprkeg cfr_renamed_130() {
        sprneg sprneg2 = this;
        return new sprkeg(this.cfr_renamed_284(), sprneg2.cfr_renamed_1, sprneg2.cfr_renamed_0);
    }
}

