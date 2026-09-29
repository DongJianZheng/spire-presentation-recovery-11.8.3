/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprjsr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryeo;
import com.spire.presentation.packages.spryjn;

public abstract class sprdnn
extends sprcrn {
    private float[] cfr_renamed_1;
    private float[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public abstract int cfr_renamed_14752();

    @sprtea
    public int cfr_renamed_14792() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprdnn(sprgdo sprgdo2, int n, int n2, float[] fArray, float[] fArray2) {
        void arg2;
        void arg1;
        void arg0;
        void arg3;
        sprdnn sprdnn2 = this;
        void v1 = arg3;
        sprdnn sprdnn3 = this;
        super((sprgdo)arg0);
        sprdnn3.cfr_renamed_3 = arg1;
        sprdnn3.cfr_renamed_4 = arg2;
        sprdnn.cfr_renamed_14793((float[])v1, this.cfr_renamed_14794());
        sprdnn2.cfr_renamed_1 = v1;
        sprdnn.cfr_renamed_14793(fArray2, this.cfr_renamed_14792());
        sprdnn2.cfr_renamed_2 = fArray2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_14404(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        arg0.cfr_renamed_14094(sprjsr.cfr_renamed_9("t7.\u001f8\u00052\u001e5%\"\u0001>"), this.cfr_renamed_14752());
        v0.cfr_renamed_14092(spryeo.cfr_renamed_9("\t0I\u0019G\u001dH"), this.cfr_renamed_1);
        v0.cfr_renamed_14092(sprjsr.cfr_renamed_9("^\t\u00105\u0016>"), this.cfr_renamed_2);
        super.cfr_renamed_14404((spryjn)v0);
    }

    private static /* synthetic */ void cfr_renamed_14793(float[] arg0, int arg1) {
        int n;
        if (arg0.length % arg1 != 0) {
            throw new IllegalArgumentException(spryeo.cfr_renamed_9("=H\u0017I\u0006T\u0011E\u0000\u0006\u0015T\u0006G\r\u0006\u0010O\u0019C\u001aU\u001dI\u001a\b"));
        }
        int n2 = n = 0;
        while (n2 < arg1) {
            if (arg0[n * 2] > arg0[n * 2 + 1]) {
                throw new IllegalArgumentException(sprjsr.cfr_renamed_9("<2\u001f{\u0018(Q<\u0003>\u0010/\u0014)Q/\u0019:\u001f{<:\tu"));
            }
            n2 = ++n;
        }
    }

    @sprtea
    public float[] cfr_renamed_14153() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public float[] cfr_renamed_14154() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public int cfr_renamed_14794() {
        return this.cfr_renamed_3;
    }
}

