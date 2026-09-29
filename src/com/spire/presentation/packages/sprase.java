/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spreoe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnue;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.sprtre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprase
extends sprkra {
    private sprrve cfr_renamed_0;
    private spreoe cfr_renamed_1;
    private sprooe cfr_renamed_2;
    private sprere cfr_renamed_3;
    private sprere cfr_renamed_4;

    public spreoe cfr_renamed_4172() {
        return this.cfr_renamed_1;
    }

    public static sprase cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprase.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprere cfr_renamed_4171() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprase(sprrve sprrve2, sprere sprere2, spreoe spreoe2, sprtre sprtre2) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        sprase sprase2 = this;
        sprase sprase3 = this;
        sprase sprase4 = this;
        sprase4.cfr_renamed_2 = new sprooe(sprase.cfr_renamed_4164((sprrve)arg0, (sprere)arg1, sprere.cfr_renamed_23(arg3)));
        sprase3.cfr_renamed_0 = arg0;
        sprase3.cfr_renamed_4 = arg1;
        sprase2.cfr_renamed_1 = arg2;
        sprase2.cfr_renamed_3 = sprere.cfr_renamed_23(sprtre2);
    }

    public sprere cfr_renamed_4176() {
        return this.cfr_renamed_3;
    }

    public sprrve cfr_renamed_4170() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprase(sprrve sprrve2, sprere sprere2, spreoe spreoe2, sprere sprere3) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        sprase sprase2 = this;
        sprase sprase3 = this;
        sprase sprase4 = this;
        sprase4.cfr_renamed_2 = new sprooe(sprase.cfr_renamed_4164((sprrve)arg0, (sprere)arg1, (sprere)arg3));
        sprase3.cfr_renamed_0 = arg0;
        sprase3.cfr_renamed_4 = arg1;
        sprase2.cfr_renamed_1 = arg2;
        sprase2.cfr_renamed_3 = sprere3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprase sprase2 = this;
        sprlre2.cfr_renamed_49(sprase2.cfr_renamed_2);
        if (sprase2.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_0));
        }
        sprlre sprlre3 = sprlre2;
        sprase sprase3 = this;
        sprlre3.cfr_renamed_49(sprase3.cfr_renamed_4);
        sprlre3.cfr_renamed_49(sprase3.cfr_renamed_1);
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_3));
        }
        return new sprjve(sprlre2);
    }

    public static sprase cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprase) {
            return (sprase)arg0;
        }
        if (arg0 != null) {
            return new sprase(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprase(sprbne sprbne2) {
        void arg0;
        int n = 0;
        this.cfr_renamed_2 = (sprooe)sprbne2.cfr_renamed_85(0);
        spra spra2 = arg0.cfr_renamed_85(++n);
        ++n;
        if (spra2 instanceof spryte) {
            this.cfr_renamed_0 = sprrve.cfr_renamed_341((spryte)spra2, false);
            spra2 = arg0.cfr_renamed_85(n);
        }
        int n2 = ++n;
        this.cfr_renamed_4 = sprere.cfr_renamed_23(spra2);
        this.cfr_renamed_1 = spreoe.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        if (arg0.cfr_renamed_84() > ++n) {
            this.cfr_renamed_3 = sprere.cfr_renamed_341((spryte)arg0.cfr_renamed_85(n), false);
        }
    }

    public static int cfr_renamed_4164(sprrve arg0, sprere arg1, sprere arg2) {
        if (arg0 != null || arg2 != null) {
            int n = 2;
            return 2;
        }
        int n = 0;
        Enumeration enumeration = arg1.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            if (sprnue.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_3().cfr_renamed_97().intValue() == n) continue;
            n = 2;
            return 2;
        }
        return n;
    }
}

