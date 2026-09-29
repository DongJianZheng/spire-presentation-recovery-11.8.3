/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprieg;
import com.spire.presentation.packages.sprnuf;
import com.spire.presentation.packages.sprpag;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprvcg;

public class sprxag {
    private final byte[] cfr_renamed_1;
    private final int cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final sprsuf cfr_renamed_4;

    public byte[] cfr_renamed_2667() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_1604() {
        return this.cfr_renamed_2;
    }

    public sprnuf cfr_renamed_6448() {
        sprxag sprxag2 = this;
        sprnuf sprnuf2 = new sprnuf(sprxag2.cfr_renamed_3, sprxag2.cfr_renamed_1, sprieg.cfr_renamed_6447(this.cfr_renamed_4));
        sprnuf2.cfr_renamed_6442(this.cfr_renamed_2);
        return sprnuf2;
    }

    public byte[] cfr_renamed_6439() {
        return this.cfr_renamed_3;
    }

    public sprsuf cfr_renamed_6445() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxag(sprsuf sprsuf2, byte[] byArray, int n, byte[] byArray2) {
        void arg2;
        void arg1;
        void arg0;
        sprxag sprxag2 = this;
        sprxag sprxag3 = this;
        sprxag3.cfr_renamed_4 = arg0;
        sprxag3.cfr_renamed_3 = arg1;
        sprxag2.cfr_renamed_2 = arg2;
        sprxag2.cfr_renamed_1 = byArray2;
    }

    public sprvcg cfr_renamed_6464(sprgzf arg0, byte[][] arg1) {
        sprnuf sprnuf2;
        sprxag sprxag2 = this;
        byte[] byArray = new byte[sprxag2.cfr_renamed_4.cfr_renamed_1146()];
        sprnuf sprnuf3 = sprnuf2 = sprxag2.cfr_renamed_6448();
        sprnuf3.cfr_renamed_6440(-3);
        sprnuf3.cfr_renamed_6437(byArray, false);
        sprgf sprgf2 = sprieg.cfr_renamed_6447(sprxag2.cfr_renamed_4);
        sprpag.cfr_renamed_6455(sprxag2.cfr_renamed_6439(), sprgf2);
        sprpag.cfr_renamed_6460(sprxag2.cfr_renamed_1604(), sprgf2);
        sprpag.cfr_renamed_6461((short)-32383, sprgf2);
        sprpag.cfr_renamed_6455(byArray, sprgf2);
        return new sprvcg(this, arg0, sprgf2, byArray, arg1);
    }
}

