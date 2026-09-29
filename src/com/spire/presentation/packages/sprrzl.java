/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjw;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.spros;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprrzl
extends sprqqe
implements sprjw,
spros {
    public sprco cfr_renamed_132;
    public sprlem cfr_renamed_102;

    public sprlem cfr_renamed_356() {
        return this.cfr_renamed_102;
    }

    /*
     * WARNING - void declaration
     */
    public sprrzl(sprlem sprlem2) {
        void arg0;
        sprrzl sprrzl2 = this;
        sprrzl2.cfr_renamed_102 = arg0;
        sprrzl2.cfr_renamed_132 = null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrzl sprrzl2 = this;
        sprrvm2.cfr_renamed_5004(sprrzl2.cfr_renamed_102);
        if (sprrzl2.cfr_renamed_132 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_132);
        }
        return new sprcen(sprrvm2);
    }

    public static sprrzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrzl) {
            return (sprrzl)arg0;
        }
        if (arg0 != null) {
            return new sprrzl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprrzl(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_102 = sprlem.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_132 = (sprco)enumeration.nextElement();
        }
    }

    public sprco cfr_renamed_357() {
        return this.cfr_renamed_132;
    }

    /*
     * WARNING - void declaration
     */
    public sprrzl(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprrzl sprrzl2 = this;
        sprrzl2.cfr_renamed_102 = arg0;
        sprrzl2.cfr_renamed_132 = sprco2;
    }
}

