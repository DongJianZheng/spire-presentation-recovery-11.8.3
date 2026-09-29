/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdco;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprxsn
extends sprqqe {
    private sprdz<sprdco> cfr_renamed_4;

    public static sprxsn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxsn) {
            return (sprxsn)arg0;
        }
        if (arg0 != null) {
            return new sprxsn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprxsn cfr_renamed_15433(sprdco arg0) {
        sprxsn sprxsn2 = this;
        sprxsn2.cfr_renamed_4.cfr_renamed_12808(arg0);
        return sprxsn2;
    }

    public Iterator cfr_renamed_12162() {
        return this.cfr_renamed_4.cfr_renamed_12162();
    }

    public sprxsn() {
        sprxsn sprxsn2 = this;
        sprxsn2.cfr_renamed_4 = new sprvrx<sprdco>();
    }

    public sprxsn(sprdco[] arg0) {
        this();
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprdco cfr_renamed_576(int arg0) {
        return this.cfr_renamed_4.cfr_renamed_12151(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprxsn(sprszm sprszm2) {
        int n;
        void arg0;
        sprxsn sprxsn2 = this;
        sprxsn2.cfr_renamed_4 = new sprvrx<sprdco>(arg0.cfr_renamed_84());
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            this.cfr_renamed_15433(sprdco.cfr_renamed_23(arg0.cfr_renamed_85(n++)));
            n2 = n;
        }
    }
}

