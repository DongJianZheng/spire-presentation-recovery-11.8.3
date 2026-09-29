/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkyp;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvfo;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.util.Enumeration;

public class sprmke
extends sprkra {
    private sprere cfr_renamed_2;
    private sprxue cfr_renamed_3;
    private sprije cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmke(sprije sprije2, spra spra2, sprere sprere2) throws IOException {
        void arg0;
        void arg1;
        sprmke sprmke2 = this;
        sprmke sprmke3 = this;
        sprmke3.cfr_renamed_3 = new sprlqe(arg1.cfr_renamed_119().cfr_renamed_104("DER"));
        sprmke2.cfr_renamed_4 = arg0;
        sprmke2.cfr_renamed_2 = sprere2;
    }

    public sprere cfr_renamed_82() {
        return this.cfr_renamed_2;
    }

    public sprije cfr_renamed_1254() {
        return this.cfr_renamed_4;
    }

    public sprmke(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        if (((sprooe)enumeration.nextElement()).cfr_renamed_97().intValue() != 0) {
            throw new IllegalArgumentException(sprvfo.cfr_renamed_9("(@0\\8\u0012)W-A6]1\u00129]-\u0012/@6D>F:\u00124W&\u00126\\9]"));
        }
        sprmke sprmke2 = this;
        Enumeration enumeration2 = enumeration;
        sprmke2.cfr_renamed_4 = sprije.cfr_renamed_23(enumeration2.nextElement());
        sprmke2.cfr_renamed_3 = sprxue.cfr_renamed_23(enumeration2.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_2 = sprere.cfr_renamed_341((spryte)enumeration.nextElement(), false);
        }
    }

    public sprije cfr_renamed_1473() {
        return this.cfr_renamed_4;
    }

    public spra cfr_renamed_1229() throws IOException {
        return sprvva.cfr_renamed_184(this.cfr_renamed_3.cfr_renamed_186());
    }

    public sprmke(sprije arg0, spra arg1) throws IOException {
        this(arg0, arg1, null);
    }

    public static sprmke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmke) {
            return (sprmke)arg0;
        }
        if (arg0 != null) {
            return new sprmke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprmke cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmke.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvva cfr_renamed_1369() {
        try {
            return this.cfr_renamed_1229().cfr_renamed_119();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprkyp.cfr_renamed_9("\u0003\u001a\u0017\u0016\u001a\u0011V\u0000\u0019T\u0006\u0015\u0004\u0007\u0013T\u0006\u0006\u001f\u0002\u0017\u0000\u0013T\u001d\u0011\u000f"));
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprmke sprmke2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprooe(0L));
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprmke2.cfr_renamed_3);
        if (sprmke2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }
}

