/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprtge;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;
import java.util.Vector;

public class sprshe
extends sprkra {
    public static final sprtzd cfr_renamed_119;
    public static final sprtzd cfr_renamed_91;
    public static final sprtzd cfr_renamed_0;
    public static final sprtzd cfr_renamed_1;
    private sprbne cfr_renamed_2;
    public static final sprtzd cfr_renamed_3;
    public static final sprtzd cfr_renamed_4;

    public Vector cfr_renamed_4591(sprtzd arg0) {
        Enumeration enumeration = this.cfr_renamed_2.cfr_renamed_329();
        Vector<sprtge> vector = new Vector<sprtge>();
        if (arg0 == null) {
            Enumeration enumeration2 = enumeration;
            while (enumeration2.hasMoreElements()) {
                Enumeration enumeration3 = enumeration;
                enumeration2 = enumeration3;
                sprtge sprtge2 = sprtge.cfr_renamed_23(enumeration3.nextElement());
                vector.addElement(sprtge2);
            }
        } else {
            while (enumeration.hasMoreElements()) {
                sprtge sprtge3 = sprtge.cfr_renamed_23(enumeration.nextElement());
                if (!arg0.equals(sprtge3.cfr_renamed_4590())) continue;
                vector.addElement(sprtge3);
            }
        }
        return vector;
    }

    public static sprshe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprshe) {
            return (sprshe)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprshe((sprbne)arg0);
        }
        if (arg0 instanceof sprche) {
            return new sprshe((sprbne)((sprche)arg0).cfr_renamed_206().cfr_renamed_85(0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjze.cfr_renamed_9("\fM\u0012M\u0016T\u0017\u0003\u0016A\u0013F\u001aWYJ\u0017\u0003\u001fB\u001aW\u0016Q\u0000\u0019Y")).append(arg0.getClass().getName()).toString());
    }

    public sprshe(sprbne sprbne2) {
        this.cfr_renamed_2 = sprbne2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_2;
    }

    static {
        cfr_renamed_0 = sprm.cfr_renamed_152;
        cfr_renamed_119 = sprm.cfr_renamed_1600;
        cfr_renamed_1 = sprm.cfr_renamed_272;
        cfr_renamed_3 = new sprtzd("1.3.14.3.2.7");
        cfr_renamed_4 = sprm.cfr_renamed_1262;
        cfr_renamed_91 = sprm.cfr_renamed_1435;
    }
}

