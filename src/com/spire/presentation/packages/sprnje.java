/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprnje
extends sprkra {
    private byte[] cfr_renamed_3;
    private sprije cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnje(sprije sprije2, byte[] byArray) {
        void arg1;
        sprnje sprnje2 = this;
        sprnje2.cfr_renamed_3 = arg1;
        sprnje2.cfr_renamed_4 = sprije2;
    }

    public static sprnje cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprnje.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public byte[] cfr_renamed_580() {
        return this.cfr_renamed_3;
    }

    public sprije cfr_renamed_1473() {
        return this.cfr_renamed_4;
    }

    public static sprnje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnje) {
            return (sprnje)arg0;
        }
        if (arg0 != null) {
            return new sprnje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_3));
        return new sprpse(sprlre2);
    }

    public sprnje(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_4 = sprije.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprxue.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_186();
    }
}

