/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxlg;
import java.util.Locale;

public class sprsog
extends Exception {
    public sprxlg cfr_renamed_3;
    private Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsog(sprxlg sprxlg2) {
        super(arg0.cfr_renamed_2520(Locale.getDefault()));
        void arg0;
        this.cfr_renamed_3 = sprxlg2;
    }

    public sprxlg cfr_renamed_281() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprsog(sprxlg sprxlg2, Throwable throwable) {
        void arg0;
        sprsog sprsog2 = this;
        void v1 = arg0;
        super(v1.cfr_renamed_2520(Locale.getDefault()));
        sprsog2.cfr_renamed_3 = v1;
        sprsog2.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}

