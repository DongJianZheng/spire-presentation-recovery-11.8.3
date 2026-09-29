/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhwn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwxn;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprown
extends sprqqe {
    private sprwxn cfr_renamed_3;
    private sprhwn cfr_renamed_4;

    public static sprown cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprown) {
            return (sprown)arg0;
        }
        if (arg0 != null) {
            return new sprown(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprown cfr_renamed_15458(sprwxn arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprown cfr_renamed_15459(sprhwn arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprhwn cfr_renamed_15427() {
        return this.cfr_renamed_4;
    }

    public sprown(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_4 = sprhwn.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        this.cfr_renamed_3 = sprwxn.cfr_renamed_23(iterator.next());
    }

    public sprwxn cfr_renamed_15460() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprown(sprhwn sprhwn2, sprwxn sprwxn2) {
        void arg0;
        sprown sprown2 = this;
        sprown2.cfr_renamed_4 = arg0;
        sprown2.cfr_renamed_3 = sprwxn2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprown() {
    }
}

