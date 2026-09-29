/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxde;
import java.util.Enumeration;
import java.util.Vector;

public class sprcbe
extends sprkra {
    private Vector cfr_renamed_4;

    public static sprcbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcbe) {
            return (sprcbe)arg0;
        }
        if (arg0 != null) {
            return new sprcbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprcbe(Vector vector) {
        Enumeration enumeration;
        sprcbe sprcbe2 = this;
        sprcbe2.cfr_renamed_4 = new Vector();
        Enumeration enumeration2 = enumeration = vector.elements();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            this.cfr_renamed_4.addElement(enumeration3.nextElement());
        }
    }

    public Vector cfr_renamed_82() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        Enumeration enumeration;
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.elements();
        while (enumeration2.hasMoreElements()) {
            sprlre2.cfr_renamed_49((sprxde)enumeration.nextElement());
            enumeration2 = enumeration;
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprcbe(sprbne sprbne2) {
        Enumeration enumeration;
        sprcbe sprcbe2 = this;
        sprcbe2.cfr_renamed_4 = new Vector();
        Enumeration enumeration2 = enumeration = sprbne2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprbne sprbne3 = sprbne.cfr_renamed_23(enumeration3.nextElement());
            this.cfr_renamed_4.addElement(sprxde.cfr_renamed_23(sprbne3));
        }
    }
}

