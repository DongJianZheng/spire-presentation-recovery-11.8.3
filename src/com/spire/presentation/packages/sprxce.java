/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjm;
import com.spire.presentation.packages.sprkke;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnce;
import com.spire.presentation.packages.sprnnaa;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwlb;
import java.util.Enumeration;

public class sprxce
extends sprkra
implements sprjm {
    private sprnce cfr_renamed_0;
    private sprkke[] cfr_renamed_1;
    private sprije cfr_renamed_2;
    public static final int cfr_renamed_3 = 16;
    private sprooe cfr_renamed_4;

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_97().intValue();
    }

    private /* synthetic */ void cfr_renamed_4641(int arg0) {
        if (arg0 < 2 || arg0 > 16) {
            throw new IllegalArgumentException(sprwlb.cfr_renamed_9("K;S'[iO F,\u001c Rix(H({;S<L\u0001]:T\u001f]%I,Oi\u0006iR&HiU'\u001ca\u000eg\u0012x\n`"));
        }
    }

    public sprije cfr_renamed_1479() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxce(sprije sprije2, sprkke[] sprkkeArray, sprnce sprnce2) {
        void arg2;
        void arg1;
        void arg0;
        sprxce sprxce2 = this;
        sprxce sprxce3 = this;
        this.cfr_renamed_4 = new sprooe(0L);
        sprxce3.cfr_renamed_4 = new sprooe(1L);
        sprxce2.cfr_renamed_2 = arg0;
        sprxce2.cfr_renamed_1 = arg1;
        this.cfr_renamed_0 = arg2;
        this.cfr_renamed_4641(sprkkeArray.length);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxce(sprbne sprbne2) {
        int n;
        Enumeration enumeration;
        void arg0;
        sprxce sprxce2 = this;
        sprxce2.cfr_renamed_4 = new sprooe(0L);
        if (sprbne2 == null || arg0.cfr_renamed_84() == 0) {
            throw new IllegalArgumentException(sprnnaa.cfr_renamed_9("EZGC\u000b@Y\u000fNB[[R\u000fXJZZNAHJ\u000b_J\\XJO\u0001"));
        }
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(enumeration2.nextElement());
        this.cfr_renamed_2 = sprije.cfr_renamed_23(enumeration2.nextElement());
        sprbne sprbne3 = sprbne.cfr_renamed_23(enumeration.nextElement());
        if (this.cfr_renamed_4.cfr_renamed_97().intValue() == 1) {
            this.cfr_renamed_0 = sprnce.cfr_renamed_23(enumeration.nextElement());
        }
        sprbne sprbne4 = sprbne3;
        this.cfr_renamed_4641(sprbne4.cfr_renamed_84());
        this.cfr_renamed_1 = new sprkke[sprbne4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprbne3.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_1[n3] = sprkke.cfr_renamed_23(sprbne3.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        sprlre sprlre4 = new sprlre();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            sprlre4.cfr_renamed_49(this.cfr_renamed_1[n++]);
            n2 = n;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre4));
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_0);
        }
        return new sprpse(sprlre2);
    }

    public static sprxce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxce) {
            return (sprxce)arg0;
        }
        if (arg0 != null) {
            return new sprxce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprnce cfr_renamed_4642() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprxce(sprije sprije2, sprkke[] sprkkeArray) {
        void arg1;
        void arg0;
        sprxce sprxce2 = this;
        sprxce sprxce3 = this;
        sprxce2.cfr_renamed_4 = new sprooe(0L);
        sprxce2.cfr_renamed_4 = new sprooe(0L);
        sprxce2.cfr_renamed_2 = arg0;
        this.cfr_renamed_1 = arg1;
        this.cfr_renamed_4641(sprkkeArray.length);
    }

    public sprkke[] cfr_renamed_4643() {
        return this.cfr_renamed_1;
    }
}

