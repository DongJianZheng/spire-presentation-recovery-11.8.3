/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdao;
import com.spire.presentation.packages.sprjco;
import com.spire.presentation.packages.sprjvn;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvtn;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprhwn
extends sprqqe {
    private sprupm cfr_renamed_0;
    private sprjco cfr_renamed_1;
    private sprdao cfr_renamed_2;
    private sprjvn cfr_renamed_3;
    private sprvtn cfr_renamed_4;

    public sprhwn cfr_renamed_15442(sprjvn arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprhwn cfr_renamed_15400(String string) {
        void arg0;
        this.cfr_renamed_0 = new sprnrm((String)arg0);
        return this;
    }

    public sprhwn(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        boolean bl = iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_1 = sprjco.cfr_renamed_23(iterator2.next());
        Iterator<sprco> iterator3 = iterator;
        iterator2.hasNext();
        this.cfr_renamed_0 = sprupm.cfr_renamed_23(iterator.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_3 = sprjvn.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        this.cfr_renamed_4 = sprvtn.cfr_renamed_23(iterator.next());
        if (iterator3.hasNext()) {
            this.cfr_renamed_2 = sprdao.cfr_renamed_23(iterator.next());
        }
    }

    public sprjco cfr_renamed_4409() {
        return this.cfr_renamed_1;
    }

    public sprdao cfr_renamed_15386() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprupm cfr_renamed_15401() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprhwn(sprjco sprjco2, sprupm sprupm2, sprjvn sprjvn2, sprvtn sprvtn2, sprdao sprdao2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhwn sprhwn2 = this;
        sprhwn sprhwn3 = this;
        this.cfr_renamed_1 = arg0;
        sprhwn3.cfr_renamed_0 = arg1;
        sprhwn3.cfr_renamed_3 = arg2;
        sprhwn2.cfr_renamed_4 = arg3;
        sprhwn2.cfr_renamed_2 = sprdao2;
    }

    public sprjvn cfr_renamed_15404() {
        return this.cfr_renamed_3;
    }

    public static sprhwn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhwn) {
            return (sprhwn)arg0;
        }
        if (arg0 != null) {
            return new sprhwn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvtn cfr_renamed_15406() {
        return this.cfr_renamed_4;
    }

    public sprhwn cfr_renamed_15405(sprvtn arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprhwn cfr_renamed_15403(sprjco arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprhwn() {
    }

    public sprhwn cfr_renamed_15391(sprdao arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprhwn cfr_renamed_15402(sprupm arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public int cfr_renamed_15383() {
        return 0;
    }
}

