/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlke;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class sprhbe
extends sprkra {
    private sprbne cfr_renamed_4;

    public sprlke[] cfr_renamed_4145() {
        int n;
        sprlke[] sprlkeArray = new sprlke[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprlkeArray.length) {
            int n3 = n++;
            sprlkeArray[n3] = sprlke.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprlkeArray;
    }

    private /* synthetic */ sprhbe(sprbne sprbne2) {
        Enumeration enumeration;
        this.cfr_renamed_4 = (sprbne)sprbne2.cfr_renamed_85(0);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprlke.cfr_renamed_23(enumeration3.nextElement());
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprpse(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprhbe(sprlke[] sprlkeArray) {
        void arg0;
        sprhbe sprhbe2 = this;
        sprhbe2.cfr_renamed_4 = new sprpse((spra[])arg0);
    }

    public static sprhbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhbe) {
            return (sprhbe)arg0;
        }
        if (arg0 != null) {
            return new sprhbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

