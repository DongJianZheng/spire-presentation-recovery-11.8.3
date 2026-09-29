/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqmn;
import com.spire.presentation.packages.sprut;

public class sprivk
implements sprut {
    private final byte[] cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final boolean cfr_renamed_4;

    public boolean cfr_renamed_3366() {
        return this.cfr_renamed_4;
    }

    public static sprivk cfr_renamed_3364(byte[] arg0, byte[] arg1) {
        return new sprivk(arg0, true, null, arg1);
    }

    public byte[] cfr_renamed_1477() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_3362() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprivk(byte[] byArray, boolean bl, byte[] byArray2, byte[] byArray3) {
        void v0;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprqmn.cfr_renamed_9("\u0010\u000f\u0014dq-74,0y/<=0*>d4%-!+-8(pd*,615 y*60y&<d715("));
        }
        this.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg0);
        this.cfr_renamed_4 = arg1;
        if (arg2 == null || ((void)arg2).length == 0) {
            this.cfr_renamed_3 = null;
            v0 = arg3;
        } else {
            this.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg2);
            v0 = arg3;
        }
        if (v0 == null) {
            this.cfr_renamed_1 = new byte[0];
            return;
        }
        this.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg3);
    }

    public static sprivk cfr_renamed_3363(byte[] arg0) {
        return new sprivk(arg0, false, null, null);
    }

    public byte[] cfr_renamed_3365() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public sprivk(byte[] arg0, byte[] arg1, byte[] arg2) {
        this(arg0, false, arg1, arg2);
    }
}

