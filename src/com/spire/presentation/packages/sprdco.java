/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprdco
extends sprqqe {
    private sprpfn cfr_renamed_3;
    private sproug cfr_renamed_4;

    public sprdco cfr_renamed_15430(sprpfn arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprpfn cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprdco cfr_renamed_15431(byte[] byArray) {
        void arg0;
        this.cfr_renamed_4 = new sprfvg((byte[])arg0);
        return this;
    }

    public sprdco(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_3 = sprpfn.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        this.cfr_renamed_4 = sproug.cfr_renamed_23(iterator.next());
    }

    /*
     * WARNING - void declaration
     */
    public sprdco(sprpfn sprpfn2, sproug sproug2) {
        void arg0;
        sprdco sprdco2 = this;
        sprdco2.cfr_renamed_3 = arg0;
        sprdco2.cfr_renamed_4 = sproug2;
    }

    public sproug cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprdco cfr_renamed_4325(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprldn((String)arg0);
        return this;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public static sprdco cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdco) {
            return (sprdco)arg0;
        }
        if (arg0 != null) {
            return new sprdco(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprdco cfr_renamed_15432(sproug arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprdco() {
    }
}

