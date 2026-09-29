/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracg;
import com.spire.presentation.packages.sprawf;
import com.spire.presentation.packages.sprjdg;
import com.spire.presentation.packages.sprovf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwzq;

public class sprcvf
extends spracg {
    public final sprjdg cfr_renamed_3;
    public final sprawf cfr_renamed_4;

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprcvf(sprovf sprovf2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        super(true, sprovf2);
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprcvf sprcvf2 = this;
        this.cfr_renamed_4 = new sprawf((byte[])arg1, (byte[])arg2);
        sprcvf2.cfr_renamed_3 = new sprjdg((byte[])arg3, (byte[])arg4);
    }

    public byte[] cfr_renamed_3536() {
        return sproze.cfr_renamed_527(this.cfr_renamed_284().cfr_renamed_91(), this.cfr_renamed_3.cfr_renamed_3, this.cfr_renamed_3.cfr_renamed_4);
    }

    public byte[] cfr_renamed_1157() {
        return sproze.cfr_renamed_543(this.cfr_renamed_3.cfr_renamed_3, this.cfr_renamed_3.cfr_renamed_4);
    }

    public byte[] cfr_renamed_1411() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprcvf(sprovf sprovf2, sprawf sprawf2, sprjdg sprjdg2) {
        void arg1;
        void arg0;
        sprcvf sprcvf2 = this;
        super(true, (sprovf)arg0);
        sprcvf2.cfr_renamed_4 = arg1;
        sprcvf2.cfr_renamed_3 = sprjdg2;
    }

    public byte[] cfr_renamed_2386() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_3);
    }

    public byte[] cfr_renamed_5769() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3.cfr_renamed_3);
    }

    public byte[] cfr_renamed_91() {
        byte[][] byArrayArray = new byte[5][];
        byArrayArray[0] = this.cfr_renamed_284().cfr_renamed_91();
        byArrayArray[1] = this.cfr_renamed_4.cfr_renamed_4;
        byArrayArray[2] = this.cfr_renamed_4.cfr_renamed_3;
        byArrayArray[3] = this.cfr_renamed_3.cfr_renamed_3;
        byArrayArray[4] = this.cfr_renamed_3.cfr_renamed_4;
        return sproze.cfr_renamed_1120(byArrayArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprcvf(sprovf sprovf2, byte[] byArray) {
        void arg1;
        void arg0;
        void v0 = arg0;
        super(true, (sprovf)v0);
        int n = v0.cfr_renamed_1146();
        if (byArray.length != 4 * n) {
            throw new IllegalArgumentException(sprwzq.cfr_renamed_9("\u0015,\f(\u0004*\u0000~\u000e;\u001c~\u00000\u00061\u00017\u000b9E:\n;\u0016~\u000b1\u0011~\b?\u0011=\r~\u0015?\u0017?\b;\u0011;\u0017-"));
        }
        sprcvf sprcvf2 = this;
        int n2 = n;
        sprcvf2.cfr_renamed_4 = new sprawf(sproze.cfr_renamed_533((byte[])arg1, 0, n), sproze.cfr_renamed_533((byte[])arg1, n2, 2 * n2));
        sprcvf sprcvf3 = this;
        sprcvf2.cfr_renamed_3 = new sprjdg(sproze.cfr_renamed_533((byte[])arg1, 2 * n, 3 * n), sproze.cfr_renamed_533((byte[])arg1, 3 * n, 4 * n));
    }
}

