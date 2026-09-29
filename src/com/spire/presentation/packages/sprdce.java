/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcjaa;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.util.Enumeration;

public class sprdce
extends sprkra {
    private sprmra cfr_renamed_3;
    private sprije cfr_renamed_4;

    public sprije cfr_renamed_1473() {
        return this.cfr_renamed_4;
    }

    public sprmra cfr_renamed_2314() {
        return this.cfr_renamed_3;
    }

    public static sprdce cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprdce.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprdce(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcjaa.cfr_renamed_9("a\u0003GBP\u0007R\u0017F\f@\u0007\u0003\u0011J\u0018FX\u0003")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprdce sprdce2 = this;
        sprdce2.cfr_renamed_4 = sprije.cfr_renamed_23(enumeration.nextElement());
        sprdce2.cfr_renamed_3 = sprmra.cfr_renamed_23(enumeration.nextElement());
    }

    /*
     * WARNING - void declaration
     */
    public sprdce(sprije sprije2, byte[] byArray) {
        void arg1;
        sprdce sprdce2 = this;
        this.cfr_renamed_3 = new sprmra((byte[])arg1);
        this.cfr_renamed_4 = sprije2;
    }

    public sprije cfr_renamed_593() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprdce(sprije sprije2, spra spra2) throws IOException {
        void arg1;
        sprdce sprdce2 = this;
        this.cfr_renamed_3 = new sprmra((spra)arg1);
        this.cfr_renamed_4 = sprije2;
    }

    public static sprdce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdce) {
            return (sprdce)arg0;
        }
        if (arg0 != null) {
            return new sprdce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvva cfr_renamed_1157() throws IOException {
        return new sprgle(this.cfr_renamed_3.cfr_renamed_81()).cfr_renamed_24();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprvva cfr_renamed_1227() throws IOException {
        return new sprgle(this.cfr_renamed_3.cfr_renamed_81()).cfr_renamed_24();
    }
}

