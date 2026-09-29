/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprhle;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sproce
extends sprkra
implements sprm {
    private spra cfr_renamed_131;
    private sprtzd cfr_renamed_722;
    private boolean cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sproce sproce2 = this;
        sprlre2.cfr_renamed_49(sproce2.cfr_renamed_722);
        if (sproce2.cfr_renamed_131 != null) {
            sprlre2.cfr_renamed_49(new sprdpe(true, 0, this.cfr_renamed_131));
        }
        if (this.cfr_renamed_4) {
            return new sprjve(sprlre2);
        }
        return new sprhle(sprlre2);
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_722;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sproce(sprbne sprbne2) {
        void arg0;
        sproce sproce2 = this;
        sproce2.cfr_renamed_4 = true;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        sproce2.cfr_renamed_722 = (sprtzd)enumeration.nextElement();
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_131 = ((spryte)enumeration.nextElement()).cfr_renamed_2456();
        }
        this.cfr_renamed_4 = arg0 instanceof sprjve;
    }

    public static sproce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproce) {
            return (sproce)arg0;
        }
        if (arg0 != null) {
            return new sproce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sproce(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sproce sproce2 = this;
        this.cfr_renamed_4 = true;
        sproce2.cfr_renamed_722 = arg0;
        sproce2.cfr_renamed_131 = spra2;
    }

    public spra cfr_renamed_480() {
        return this.cfr_renamed_131;
    }
}

