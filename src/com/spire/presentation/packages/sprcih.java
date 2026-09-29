/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhyda;
import com.spire.presentation.packages.sprigh;
import com.spire.presentation.packages.sprjeh;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprplh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprcih
extends sprqqe {
    private final sprjfh cfr_renamed_3;
    private final sprjeh cfr_renamed_4;

    public static sprigh cfr_renamed_7843() {
        return new sprigh();
    }

    /*
     * WARNING - void declaration
     */
    public sprcih(sprjfh sprjfh2, sprjeh sprjeh2) {
        void arg0;
        sprcih sprcih2 = this;
        sprcih2.cfr_renamed_3 = arg0;
        sprcih2.cfr_renamed_4 = sprjeh2;
    }

    public sprjeh cfr_renamed_8259() {
        return this.cfr_renamed_4;
    }

    public static sprcih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcih) {
            return (sprcih)arg0;
        }
        if (arg0 != null) {
            return new sprcih(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public sprplh cfr_renamed_7267() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcih(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprhyda.cfr_renamed_9("\f(\u00195\n$\f4I#\f!\u001c5\u00073\fp\u001a9\u00135I?\u000fp["));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprjfh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprjeh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

