/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprkee
extends sprkra {
    private static final sprije cfr_renamed_0 = new sprije(sprm.cfr_renamed_3249, sprume.cfr_renamed_3);
    private sprooe cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private sprxue cfr_renamed_4;

    private /* synthetic */ sprkee(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_4 = (sprxue)enumeration.nextElement();
        this.cfr_renamed_1 = (sprooe)enumeration.nextElement();
        if (enumeration.hasMoreElements()) {
            Object e;
            Object e2 = enumeration.nextElement();
            if (e2 instanceof sprooe) {
                this.cfr_renamed_3 = sprooe.cfr_renamed_23(e2);
                e = enumeration.hasMoreElements() ? (e2 = enumeration.nextElement()) : (e2 = null);
            } else {
                this.cfr_renamed_3 = null;
                e = e2;
            }
            if (e != null) {
                this.cfr_renamed_2 = sprije.cfr_renamed_23(e2);
            }
        }
    }

    public BigInteger cfr_renamed_1478() {
        return this.cfr_renamed_1.cfr_renamed_97();
    }

    public static sprkee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkee) {
            return (sprkee)arg0;
        }
        if (arg0 != null) {
            return new sprkee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprkee sprkee2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprkee2.cfr_renamed_1);
        if (sprkee2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null && !this.cfr_renamed_2.equals(cfr_renamed_0)) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        return new sprpse(sprlre2);
    }

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_4.cfr_renamed_186();
    }

    /*
     * WARNING - void declaration
     */
    public sprkee(byte[] byArray, int n, int n2, sprije sprije2) {
        this((byte[])arg0, (int)arg1);
        void arg2;
        void arg1;
        void arg0;
        sprkee sprkee2 = this;
        this.cfr_renamed_3 = new sprooe((long)arg2);
        this.cfr_renamed_2 = sprije2;
    }

    /*
     * WARNING - void declaration
     */
    public sprkee(byte[] byArray, int n, int n2) {
        this(byArray, n);
        void arg2;
        sprkee sprkee2 = this;
        sprkee2.cfr_renamed_3 = new sprooe((long)arg2);
    }

    public sprije cfr_renamed_2386() {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2;
        }
        return cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprkee(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprkee sprkee2 = this;
        this.cfr_renamed_4 = new sprlqe((byte[])arg0);
        sprkee2.cfr_renamed_1 = new sprooe((long)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprkee(byte[] byArray, int n, sprije sprije2) {
        this((byte[])arg0, (int)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_2 = sprije2;
    }

    public BigInteger cfr_renamed_4600() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_97();
        }
        return null;
    }

    public boolean cfr_renamed_2431() {
        return this.cfr_renamed_2 == null || this.cfr_renamed_2.equals(cfr_renamed_0);
    }
}

