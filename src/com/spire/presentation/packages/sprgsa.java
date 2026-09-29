/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spryvc;
import java.util.Locale;

public class sprgsa
extends Exception {
    public spryvc cfr_renamed_3;
    private Throwable cfr_renamed_4;

    public spryvc cfr_renamed_281() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgsa(spryvc spryvc2) {
        super(arg0.cfr_renamed_2520(Locale.getDefault()));
        void arg0;
        this.cfr_renamed_3 = spryvc2;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprgsa(spryvc spryvc2, Throwable throwable) {
        void arg0;
        sprgsa sprgsa2 = this;
        void v1 = arg0;
        super(v1.cfr_renamed_2520(Locale.getDefault()));
        sprgsa2.cfr_renamed_3 = v1;
        sprgsa2.cfr_renamed_4 = throwable;
    }
}

