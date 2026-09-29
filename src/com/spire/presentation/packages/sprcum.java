/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprubs;
import com.spire.presentation.packages.sprvsm;
import com.spire.presentation.packages.sprxgf;

public class sprcum
extends sprqqe {
    private sprvsm cfr_renamed_2;
    private sprjfn cfr_renamed_3;
    private sproug cfr_renamed_4;

    public static sprcum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprcum.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprcum(byte[] byArray, sprjfn sprjfn2, sprvsm sprvsm2) {
        void arg1;
        void arg0;
        sprcum sprcum2 = this;
        sprcum sprcum3 = this;
        sprcum3.cfr_renamed_4 = new sprfvg((byte[])arg0);
        sprcum2.cfr_renamed_3 = arg1;
        sprcum2.cfr_renamed_2 = sprvsm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprcum(sproug sproug2, sprjfn sprjfn2, sprvsm sprvsm2) {
        void arg1;
        void arg0;
        sprcum sprcum2 = this;
        this.cfr_renamed_4 = arg0;
        sprcum2.cfr_renamed_3 = arg1;
        sprcum2.cfr_renamed_2 = sprvsm2;
    }

    private /* synthetic */ sprcum(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        switch (sprszm2.cfr_renamed_84()) {
            case 1: {
                return;
            }
            case 2: {
                if (arg0.cfr_renamed_85(1) instanceof sprjfn) {
                    this.cfr_renamed_3 = sprjfn.cfr_renamed_23(arg0.cfr_renamed_85(1));
                    return;
                }
                this.cfr_renamed_2 = sprvsm.cfr_renamed_23(arg0.cfr_renamed_85(2));
                return;
            }
            case 3: {
                sprszm sprszm3 = arg0;
                this.cfr_renamed_3 = sprjfn.cfr_renamed_23(sprszm3.cfr_renamed_85(1));
                this.cfr_renamed_2 = sprvsm.cfr_renamed_23(sprszm3.cfr_renamed_85(2));
                return;
            }
        }
        throw new IllegalArgumentException(sprubs.cfr_renamed_9(";B\u0004M\u001eE\u0016\f I\u0011E\u0002E\u0017B\u0006g\u0017U;H\u0017B\u0006E\u0014E\u0017^"));
    }

    public sprcum(byte[] arg0) {
        this(arg0, null, null);
    }

    public sproug cfr_renamed_3955() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprcum sprcum2 = this;
        sprrvm2.cfr_renamed_5004(sprcum2.cfr_renamed_4);
        if (sprcum2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    public sprjfn cfr_renamed_110() {
        return this.cfr_renamed_3;
    }

    public sprvsm cfr_renamed_4832() {
        return this.cfr_renamed_2;
    }

    public static sprcum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcum) {
            return (sprcum)arg0;
        }
        if (arg0 != null) {
            return new sprcum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

