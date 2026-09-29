/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxra;

public class sprnce
extends sprkra {
    private spraoe cfr_renamed_3;
    private spraoe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnce(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprxra.cfr_renamed_9("q\u001ds\rg\u0016a\u001d\"\u000fp\u0017l\u001f\"\u000bk\u0002gXd\u0017pXN<Q.g\nq\u0011m\u0016K\u0016d\u0017"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = spraoe.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = spraoe.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprnce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnce) {
            return (sprnce)arg0;
        }
        if (arg0 != null) {
            return new sprnce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public String cfr_renamed_4639() {
        return this.cfr_renamed_4.cfr_renamed_314();
    }

    public String cfr_renamed_4640() {
        return this.cfr_renamed_3.cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public sprnce(String string, String string2) {
        void arg1;
        void arg0;
        sprnce sprnce2 = this;
        this.cfr_renamed_4 = new spraoe((String)arg0);
        sprnce2.cfr_renamed_3 = new spraoe((String)arg1);
    }
}

