/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprvom
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sproug cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprvom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvom) {
            return (sprvom)arg0;
        }
        if (arg0 != null) {
            return new sprvom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprvom(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_4 = (sproug)enumeration.nextElement();
        this.cfr_renamed_3 = (sprlem)enumeration.nextElement();
    }

    public sprlem cfr_renamed_2105() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_1205() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprvom(byte[] byArray, sprlem sprlem2) {
        void arg0;
        sprvom sprvom2 = this;
        this.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg0));
        this.cfr_renamed_3 = sprlem2;
    }

    public static sprvom cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprvom.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

