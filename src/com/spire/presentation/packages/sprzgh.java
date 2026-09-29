/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spriih;
import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

public class sprzgh
extends sprqqe {
    private final sprmjh cfr_renamed_3;
    private final sprbvg cfr_renamed_4;

    public static spriih cfr_renamed_7843() {
        return new spriih();
    }

    /*
     * WARNING - void declaration
     */
    public sprzgh(sprbvg sprbvg2, sprmjh sprmjh2) {
        void arg0;
        sprzgh sprzgh2 = this;
        sprzgh2.cfr_renamed_4 = arg0;
        sprzgh2.cfr_renamed_3 = sprmjh2;
    }

    public static sprzgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzgh) {
            return (sprzgh)arg0;
        }
        if (arg0 != null) {
            return new sprzgh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmjh cfr_renamed_480() {
        return this.cfr_renamed_3;
    }

    public sprbvg cfr_renamed_8296() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzgh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprqad.cfr_renamed_9("\u0002\\\u0017A\u0004P\u0002@GW\u0002U\u0012A\tG\u0002\u0004\u0014M\u001dAGK\u0001\u0004U"));
        }
        Iterator<sprco> iterator = sprszm.cfr_renamed_23(arg0).iterator();
        sprzgh sprzgh2 = this;
        sprzgh2.cfr_renamed_4 = sprbvg.cfr_renamed_23(iterator.next());
        sprzgh2.cfr_renamed_3 = sprmjh.cfr_renamed_23(iterator.next());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }
}

