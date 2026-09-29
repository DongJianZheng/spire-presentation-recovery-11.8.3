/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpaf;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class sprwde
extends sprkra {
    private sprtzd cfr_renamed_3;
    private sprmee[] cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null) {
            int n;
            sprlre sprlre3 = new sprlre();
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4.length) {
                sprlre3.cfr_renamed_49(this.cfr_renamed_4[n++]);
                n2 = n;
            }
            sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        }
        return new sprpse(sprlre2);
    }

    public sprwde(sprmee[] sprmeeArray) {
        sprwde sprwde2 = this;
        sprwde2.cfr_renamed_3 = null;
        sprwde2.cfr_renamed_4 = sprmeeArray;
    }

    public static sprwde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwde) {
            return (sprwde)arg0;
        }
        if (arg0 != null) {
            return new sprwde(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprwde(sprtzd sprtzd2, sprmee[] sprmeeArray) {
        void arg0;
        sprwde sprwde2 = this;
        sprwde2.cfr_renamed_3 = arg0;
        sprwde2.cfr_renamed_4 = sprmeeArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprwde(sprtzd sprtzd2) {
        void arg0;
        sprwde sprwde2 = this;
        sprwde2.cfr_renamed_3 = arg0;
        sprwde2.cfr_renamed_4 = null;
    }

    public sprtzd cfr_renamed_4496() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprwde(sprbne sprbne2) {
        int n;
        Object e;
        sprbne sprbne3 = sprbne2;
        Enumeration enumeration = sprbne3.cfr_renamed_329();
        if (sprbne3.cfr_renamed_84() < 1) {
            throw new IllegalArgumentException(sprpaf.cfr_renamed_9("l^\"^`[gRvB\"Xl\u0011QToPlEkRqxlWmCoPvXm_"));
        }
        Object e2 = enumeration.nextElement();
        if (e2 instanceof sprtzd) {
            this.cfr_renamed_3 = sprtzd.cfr_renamed_23(e2);
            if (!enumeration.hasMoreElements()) return;
            e = e2 = enumeration.nextElement();
        } else {
            e = e2;
        }
        if (e == null) return;
        sprbne sprbne4 = sprbne.cfr_renamed_23(e2);
        this.cfr_renamed_4 = new sprmee[sprbne4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprbne4.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprmee.cfr_renamed_23(sprbne4.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    public sprmee[] cfr_renamed_4497() {
        return this.cfr_renamed_4;
    }
}

