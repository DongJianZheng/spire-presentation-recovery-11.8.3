/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbdd;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhdca;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmce;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprjae
extends sprkra {
    private sprmce[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjae(sprtzd sprtzd2, sprmee sprmee2) {
        this(new sprmce((sprtzd)arg0, (sprmee)arg1));
        void arg1;
        void arg0;
    }

    public sprmce[] cfr_renamed_309() {
        return this.cfr_renamed_4;
    }

    public static sprjae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjae) {
            return (sprjae)arg0;
        }
        if (arg0 != null) {
            return new sprjae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprbdd.cfr_renamed_9("\u0005\u00110\f+\u0016-\u0010=-*\u0002+\u0016)\u00050\r+\n\u0005\u0007'\u00017\u0017~D\u000b\r L")).append(this.cfr_renamed_4[0].cfr_renamed_310().cfr_renamed_19()).append(")").toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprjae(sprmce sprmce2) {
        void arg0;
        sprmce[] sprmceArray = new sprmce[1];
        sprmceArray[0] = arg0;
        this.cfr_renamed_4 = sprmceArray;
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

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjae(sprbne sprbne2) {
        int n;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1) {
            throw new IllegalArgumentException(sprhdca.cfr_renamed_9("O\u0011M\u0001Y\u001a_\u0011\u001c\u0019]\r\u001c\u001aS\u0000\u001c\u0016YTY\u0019L\u0000E"));
        }
        this.cfr_renamed_4 = new sprmce[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprmce.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }
}

