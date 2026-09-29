/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprvxn;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprdao
extends sprqqe {
    private sprdz<sprvxn> cfr_renamed_4;

    public int cfr_renamed_15383() {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprdao(sprszm sprszm2) {
        int n;
        void arg0;
        sprdao sprdao2 = this;
        sprdao2.cfr_renamed_4 = new sprvrx<sprvxn>(arg0.cfr_renamed_84());
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_84()) {
            this.cfr_renamed_15461(sprvxn.cfr_renamed_23(arg0.cfr_renamed_85(n++)));
            n2 = n;
        }
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprdao(sprvxn[] arg0) {
        this();
    }

    public Iterator cfr_renamed_12162() {
        return this.cfr_renamed_4.cfr_renamed_12162();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprdao cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdao) {
            return (sprdao)arg0;
        }
        if (arg0 == null) {
            return null;
        }
        try {
            return new sprdao(sprszm.cfr_renamed_23(arg0));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public sprdao cfr_renamed_15461(sprvxn arg0) {
        sprdao sprdao2 = this;
        sprdao2.cfr_renamed_4.cfr_renamed_12808(arg0);
        return sprdao2;
    }

    public sprdao() {
        sprdao sprdao2 = this;
        sprdao2.cfr_renamed_4 = new sprvrx<sprvxn>();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprvxn cfr_renamed_576(int arg0) {
        return this.cfr_renamed_4.cfr_renamed_12151(arg0);
    }
}

