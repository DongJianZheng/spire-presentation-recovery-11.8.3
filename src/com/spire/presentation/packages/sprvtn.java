/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprvtn
extends sprqqe {
    private sprktm cfr_renamed_1;
    private sprupm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sproug cfr_renamed_4;

    public sprupm cfr_renamed_324() {
        return this.cfr_renamed_2;
    }

    public sproug cfr_renamed_2609() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprvtn cfr_renamed_4325(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprnrm((String)arg0);
        return this;
    }

    public sprvtn(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_2 = sprupm.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_4 = sproug.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_1 = sprktm.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(iterator.next());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public sprktm cfr_renamed_15450() {
        return this.cfr_renamed_3;
    }

    public sprvtn cfr_renamed_15451(sproug arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvtn(sprupm sprupm2, sproug sproug2, sprktm sprktm2, sprktm sprktm3) {
        void arg2;
        void arg1;
        void arg0;
        sprvtn sprvtn2 = this;
        sprvtn sprvtn3 = this;
        sprvtn3.cfr_renamed_2 = arg0;
        sprvtn3.cfr_renamed_4 = arg1;
        sprvtn2.cfr_renamed_1 = arg2;
        sprvtn2.cfr_renamed_3 = sprktm3;
    }

    public sprvtn cfr_renamed_15452(sprktm arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprktm cfr_renamed_1942() {
        return this.cfr_renamed_1;
    }

    public sprvtn cfr_renamed_15453(sprktm arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprvtn cfr_renamed_15454(sprupm arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprvtn() {
    }

    /*
     * WARNING - void declaration
     */
    public sprvtn cfr_renamed_15455(long l) {
        void arg0;
        this.cfr_renamed_3 = new sprktm((int)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvtn cfr_renamed_15456(byte[] byArray) {
        void arg0;
        this.cfr_renamed_4 = new sprfvg((byte[])arg0);
        return this;
    }

    public static sprvtn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvtn) {
            return (sprvtn)arg0;
        }
        if (arg0 != null) {
            return new sprvtn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprvtn cfr_renamed_15457(long l) {
        void arg0;
        this.cfr_renamed_1 = new sprktm((int)arg0);
        return this;
    }
}

