/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgyz;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprjco
extends sprqqe {
    public static sprnrm cfr_renamed_0;
    private sprktm cfr_renamed_1;
    private sprupm cfr_renamed_2;
    private sprupm cfr_renamed_3;
    public static sprktm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprjco cfr_renamed_4767(int n) {
        void arg0;
        this.cfr_renamed_1 = new sprktm((long)arg0);
        return this;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    static {
        cfr_renamed_4 = new sprktm(4L);
        cfr_renamed_0 = new sprnrm(sprgyz.cfr_renamed_9("Z#"));
    }

    public sprjco(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_2 = sprupm.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_1 = sprktm.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        this.cfr_renamed_3 = sprupm.cfr_renamed_23(iterator.next());
    }

    public sprjco cfr_renamed_15443(sprupm arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprjco cfr_renamed_15444(String arg0) {
        this.cfr_renamed_3 = sprupm.cfr_renamed_23(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprjco(sprktm sprktm2, sprupm sprupm2) {
        void arg0;
        sprjco sprjco2 = this;
        this.cfr_renamed_2 = cfr_renamed_0;
        sprjco2.cfr_renamed_1 = arg0;
        sprjco2.cfr_renamed_3 = sprupm2;
    }

    public sprjco cfr_renamed_15387(sprktm arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public sprupm cfr_renamed_19() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprupm cfr_renamed_15445() {
        return this.cfr_renamed_3;
    }

    public static sprjco cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjco) {
            return (sprjco)arg0;
        }
        if (arg0 != null) {
            return new sprjco(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjco() {
    }

    @sprtea
    public void cfr_renamed_15429(sproen arg0) {
    }
}

