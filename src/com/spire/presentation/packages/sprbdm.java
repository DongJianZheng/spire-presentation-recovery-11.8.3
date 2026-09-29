/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprujm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;
import java.util.Vector;

public class sprbdm
extends sprqqe {
    private Vector cfr_renamed_4;

    private /* synthetic */ sprbdm(sprszm sprszm2) {
        Enumeration enumeration;
        sprbdm sprbdm2 = this;
        sprbdm2.cfr_renamed_4 = new Vector();
        Enumeration enumeration2 = enumeration = sprszm2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprszm sprszm3 = sprszm.cfr_renamed_23(enumeration3.nextElement());
            this.cfr_renamed_4.addElement(sprujm.cfr_renamed_23(sprszm3));
        }
    }

    public static sprbdm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbdm) {
            return (sprbdm)arg0;
        }
        if (arg0 != null) {
            return new sprbdm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        Enumeration enumeration;
        sprrvm sprrvm2 = new sprrvm(this.cfr_renamed_4.size());
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.elements();
        while (enumeration2.hasMoreElements()) {
            sprrvm2.cfr_renamed_5004((sprujm)enumeration.nextElement());
            enumeration2 = enumeration;
        }
        return new sprcen(sprrvm2);
    }

    public sprbdm(Vector vector) {
        Enumeration enumeration;
        sprbdm sprbdm2 = this;
        sprbdm2.cfr_renamed_4 = new Vector();
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
}

