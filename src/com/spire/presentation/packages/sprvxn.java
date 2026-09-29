/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprvxn
extends sprqqe {
    private sprlem cfr_renamed_2;
    private sproug cfr_renamed_3;
    private sprbxm cfr_renamed_4;

    public sprbxm cfr_renamed_15462() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public sprvxn cfr_renamed_15463(sprbxm arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sproug cfr_renamed_103() {
        return this.cfr_renamed_3;
    }

    public sprvxn() {
        this.cfr_renamed_4 = sprbxm.cfr_renamed_4;
    }

    public sprlem cfr_renamed_15464() {
        return this.cfr_renamed_2;
    }

    public sprvxn cfr_renamed_15465(sprlem arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprvxn(sprszm sprszm2) {
        this.cfr_renamed_4 = sprbxm.cfr_renamed_4;
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_2 = sprlem.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_4 = sprbxm.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        this.cfr_renamed_3 = sproug.cfr_renamed_23(iterator.next());
    }

    public sprvxn cfr_renamed_15466(sproug arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvxn(sprlem sprlem2, sprbxm sprbxm2, sproug sproug2) {
        void arg1;
        void arg0;
        sprvxn sprvxn2 = this;
        this.cfr_renamed_4 = sprbxm.cfr_renamed_4;
        this.cfr_renamed_2 = arg0;
        sprvxn2.cfr_renamed_4 = arg1;
        sprvxn2.cfr_renamed_3 = sproug2;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public static sprvxn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvxn) {
            return (sprvxn)arg0;
        }
        if (arg0 != null) {
            return new sprvxn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

