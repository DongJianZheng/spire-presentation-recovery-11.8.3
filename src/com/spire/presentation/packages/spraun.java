/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class spraun
extends sprqqe {
    private sprdz<sproug> cfr_renamed_4;

    public int cfr_renamed_15383() {
        return 0;
    }

    public spraun(sproug[] arg0) {
        this();
    }

    public static spraun cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraun) {
            return (spraun)arg0;
        }
        if (arg0 != null) {
            return new spraun(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spraun(sprszm sprszm2) {
        int n;
        void arg0;
        spraun spraun2 = this;
        spraun2.cfr_renamed_4 = new sprvrx<sproug>(arg0.cfr_renamed_84());
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            this.cfr_renamed_15428(sprfvg.cfr_renamed_23(arg0.cfr_renamed_85(n++)));
            n2 = n;
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sproug cfr_renamed_576(int arg0) {
        return this.cfr_renamed_4.cfr_renamed_12151(arg0);
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public Iterator cfr_renamed_12162() {
        return this.cfr_renamed_4.cfr_renamed_12162();
    }

    public spraun cfr_renamed_15428(sproug arg0) {
        spraun spraun2 = this;
        spraun2.cfr_renamed_4.cfr_renamed_12808(arg0);
        return spraun2;
    }

    public spraun() {
        spraun spraun2 = this;
        spraun2.cfr_renamed_4 = new sprvrx<sproug>();
    }

    @sprtea
    public void cfr_renamed_15429(sproen arg0) {
    }
}

