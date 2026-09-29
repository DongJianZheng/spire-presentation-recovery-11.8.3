/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprjto;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzyo;

public class sprdke
extends sprkra {
    private final spriae[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdke(sprbne sprbne2) {
        void arg0;
        int n;
        this.cfr_renamed_4 = new spriae[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = spriae.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    public spriae[] cfr_renamed_4526() {
        spriae[] spriaeArray = new spriae[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, spriaeArray, 0, this.cfr_renamed_4.length);
        return spriaeArray;
    }

    public sprdke(spriae[] spriaeArray) {
        this.cfr_renamed_4 = spriaeArray;
    }

    public spriae cfr_renamed_4527(sprtzd arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (arg0.equals(this.cfr_renamed_4[n].cfr_renamed_330())) {
                return this.cfr_renamed_4[n];
            }
            n2 = ++n;
        }
        return null;
    }

    public static sprdke cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprdke.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprdke(spriae spriae2) {
        void arg0;
        spriae[] spriaeArray = new spriae[1];
        spriaeArray[0] = arg0;
        this.cfr_renamed_4 = spriaeArray;
    }

    public static sprdke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdke) {
            return (sprdke)arg0;
        }
        if (arg0 != null) {
            return new sprdke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprdke cfr_renamed_2757(sprszd arg0) {
        return sprdke.cfr_renamed_23(arg0.cfr_renamed_4477(sprtie.cfr_renamed_137));
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprpse(this.cfr_renamed_4);
    }

    public String toString() {
        int n;
        String string = null;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            if (string != null) {
                string = new StringBuilder().insert(0, string).append(sprzyo.cfr_renamed_9("\u0002o")).toString();
            }
            spriae spriae2 = this.cfr_renamed_4[n];
            string = new StringBuilder().insert(0, string).append(spriae2).toString();
            n2 = ++n;
        }
        return new StringBuilder().insert(0, sprjto.cfr_renamed_9("Q\u0016`\u0007{\u0015{\u0010s\u0007w#}\u001f{\u0010{\u0016aI2")).append(string).toString();
    }
}

