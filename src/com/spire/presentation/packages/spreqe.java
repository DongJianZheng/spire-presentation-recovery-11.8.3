/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdwe;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class spreqe
extends sprkra {
    private sprdwe[] cfr_renamed_4;

    public sprdwe[] cfr_renamed_686() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spreqe(sprbne sprbne2) {
        void arg0;
        Enumeration enumeration;
        this.cfr_renamed_4 = new sprdwe[sprbne2.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            this.cfr_renamed_4[++n] = sprdwe.cfr_renamed_23(enumeration3.nextElement());
        }
    }

    public static spreqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreqe) {
            return (spreqe)arg0;
        }
        if (arg0 != null) {
            return new spreqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spreqe(sprdwe sprdwe2) {
        void arg0;
        this.cfr_renamed_4 = new sprdwe[1];
        this.cfr_renamed_4[0] = arg0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4[n++]);
            n2 = n;
        }
        return new sprpse(sprlre2);
    }

    public spreqe(sprdwe[] sprdweArray) {
        this.cfr_renamed_4 = sprdweArray;
    }

    public static spreqe cfr_renamed_341(spryte arg0, boolean arg1) {
        return spreqe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}

