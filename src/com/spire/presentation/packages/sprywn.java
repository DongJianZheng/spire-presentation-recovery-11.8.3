/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdao;
import com.spire.presentation.packages.spreyn;
import com.spire.presentation.packages.sprjco;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvtn;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprywn
extends sprqqe {
    private spreyn cfr_renamed_0;
    private sprvtn cfr_renamed_1;
    private sprupm cfr_renamed_2;
    private sprdao cfr_renamed_3;
    private sprjco cfr_renamed_4;

    public sprdao cfr_renamed_15386() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprywn cfr_renamed_15400(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprnrm((String)arg0);
        return this;
    }

    public sprupm cfr_renamed_15401() {
        return this.cfr_renamed_2;
    }

    public sprywn cfr_renamed_15402(sprupm arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprywn cfr_renamed_15403(sprjco arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprywn(sprjco sprjco2, sprupm sprupm2, spreyn spreyn2, sprvtn sprvtn2, sprdao sprdao2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprywn sprywn2 = this;
        sprywn sprywn3 = this;
        this.cfr_renamed_4 = arg0;
        sprywn3.cfr_renamed_2 = arg1;
        sprywn3.cfr_renamed_0 = arg2;
        sprywn2.cfr_renamed_1 = arg3;
        sprywn2.cfr_renamed_3 = sprdao2;
    }

    public sprjco cfr_renamed_4409() {
        return this.cfr_renamed_4;
    }

    public spreyn cfr_renamed_15404() {
        return this.cfr_renamed_0;
    }

    public sprywn() {
    }

    public static sprywn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprywn) {
            return (sprywn)arg0;
        }
        if (arg0 != null) {
            return new sprywn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprywn cfr_renamed_15405(sprvtn arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprywn(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        boolean bl = iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_4 = sprjco.cfr_renamed_23(iterator2.next());
        Iterator<sprco> iterator3 = iterator;
        iterator2.hasNext();
        this.cfr_renamed_2 = sprupm.cfr_renamed_23(iterator.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_0 = spreyn.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        this.cfr_renamed_1 = sprvtn.cfr_renamed_23(iterator.next());
        if (iterator3.hasNext()) {
            this.cfr_renamed_3 = sprdao.cfr_renamed_23(iterator.next());
        }
    }

    public sprywn cfr_renamed_15391(sprdao arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprvtn cfr_renamed_15406() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprywn cfr_renamed_15407(spreyn arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }
}

