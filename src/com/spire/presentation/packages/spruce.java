/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Vector;

public class spruce
extends sprkra {
    private sprbne cfr_renamed_3;
    private sprpee cfr_renamed_4;

    public sprooe[] cfr_renamed_4503() {
        int n;
        sprooe[] sprooeArray = new sprooe[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.cfr_renamed_84()) {
            int n3 = n++;
            sprooeArray[n3] = sprooe.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprooeArray;
    }

    public static spruce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruce) {
            return (spruce)arg0;
        }
        if (arg0 != null) {
            return new spruce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprpee cfr_renamed_4504() {
        return this.cfr_renamed_4;
    }

    private static /* synthetic */ sprlre cfr_renamed_4505(Vector arg0) {
        Enumeration enumeration;
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration2 = enumeration = arg0.elements();
        while (enumeration2.hasMoreElements()) {
            sprlre sprlre3;
            sprooe sprooe2;
            Object e = enumeration.nextElement();
            if (e instanceof BigInteger) {
                sprooe2 = new sprooe((BigInteger)e);
                sprlre3 = sprlre2;
            } else if (e instanceof Integer) {
                sprooe2 = new sprooe(((Integer)e).intValue());
                sprlre3 = sprlre2;
            } else {
                throw new IllegalArgumentException();
            }
            sprlre3.cfr_renamed_49(sprooe2);
            enumeration2 = enumeration;
        }
        return sprlre2;
    }

    /*
     * WARNING - void declaration
     */
    public spruce(String string, sprlre sprlre2) {
        this(new sprpee((String)arg0), (sprlre)arg1);
        void arg1;
        void arg0;
    }

    public spruce(String arg0, Vector arg1) {
        this(arg0, spruce.cfr_renamed_4505(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public spruce(sprpee sprpee2, sprlre sprlre2) {
        void arg1;
        this.cfr_renamed_4 = sprpee2;
        spruce spruce2 = this;
        this.cfr_renamed_3 = new sprpse((sprlre)arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruce(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsvh.cfr_renamed_9("$\u0014\u0002U\u0015\u0010\u0017\u0000\u0003\u001b\u0005\u0010F\u0006\u000f\u000f\u0003OF")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprpee.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprbne.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }
}

