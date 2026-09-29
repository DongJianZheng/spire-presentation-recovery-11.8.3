/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprece;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprjde
extends sprkra {
    public sprbne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjde(Hashtable hashtable) {
        void arg0;
        Enumeration enumeration;
        this.cfr_renamed_4 = null;
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration2 = enumeration = arg0.keys();
        while (enumeration2.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            String string2 = (String)arg0.get(string);
            sprlre sprlre3 = new sprlre();
            enumeration2 = enumeration;
            sprlre sprlre4 = sprlre3;
            sprlre4.cfr_renamed_49(new sprtzd(string));
            sprlre4.cfr_renamed_49(new sprtzd(string2));
            sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprjde(sprece[] spreceArray, sprece[] spreceArray2) {
        void arg0;
        int n;
        this.cfr_renamed_4 = null;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            void arg1;
            sprlre sprlre3;
            sprlre sprlre4 = sprlre3 = new sprlre();
            int n3 = n++;
            sprlre4.cfr_renamed_49((spra)arg0[n3]);
            sprlre4.cfr_renamed_49((spra)arg1[n3]);
            sprlre2.cfr_renamed_49(new sprpse(sprlre3));
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    public static sprjde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjde) {
            return (sprjde)arg0;
        }
        if (arg0 != null) {
            return new sprjde(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprjde(sprbne sprbne2) {
        sprjde sprjde2 = this;
        sprjde2.cfr_renamed_4 = null;
        sprjde2.cfr_renamed_4 = sprbne2;
    }

    /*
     * WARNING - void declaration
     */
    public sprjde(sprece sprece2, sprece sprece3) {
        void arg1;
        void arg0;
        sprlre sprlre2;
        this.cfr_renamed_4 = null;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49((spra)arg0);
        sprlre3.cfr_renamed_49((spra)arg1);
        sprjde sprjde2 = this;
        this.cfr_renamed_4 = new sprpse(new sprpse(sprlre2));
    }
}

