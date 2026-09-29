/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprywn;
import java.util.Iterator;

@sprtea
public class sprsdo
extends sprqqe {
    private sprywn cfr_renamed_1;
    private sprgbf cfr_renamed_2;
    private sproug cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public static sprsdo cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsdo) {
            return (sprsdo)arg0;
        }
        if (arg0 != null) {
            return new sprsdo(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprsdo cfr_renamed_15422(byte[] byArray) {
        void arg0;
        this.cfr_renamed_2 = new sprdye((byte[])arg0);
        return this;
    }

    public sprsdo cfr_renamed_15423(sprlem arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprsdo cfr_renamed_15393(sproug arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprsdo cfr_renamed_15424(sprywn arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprsdo(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_1 = sprywn.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_3 = sproug.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        this.cfr_renamed_2 = sprgbf.cfr_renamed_23(iterator.next());
    }

    public sproug cfr_renamed_8455() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprsdo(sprywn sprywn2, sproug sproug2, sprlem sprlem2, sprgbf sprgbf2) {
        void arg2;
        void arg1;
        void arg0;
        sprsdo sprsdo2 = this;
        sprsdo sprsdo3 = this;
        sprsdo3.cfr_renamed_1 = arg0;
        sprsdo3.cfr_renamed_3 = arg1;
        sprsdo2.cfr_renamed_4 = arg2;
        sprsdo2.cfr_renamed_2 = sprgbf2;
    }

    public sprlem cfr_renamed_15425() {
        return this.cfr_renamed_4;
    }

    public sprsdo cfr_renamed_15426(sprgbf arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprywn cfr_renamed_15427() {
        return this.cfr_renamed_1;
    }

    public sprsdo() {
    }

    public sprgbf cfr_renamed_15350() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }
}

