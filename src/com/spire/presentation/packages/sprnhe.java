/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjgka;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprnhe
extends sprkra {
    public sprmra cfr_renamed_2;
    public spryee cfr_renamed_3;
    public sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnhe(spryee spryee2, sprooe sprooe2) {
        void arg0;
        sprnhe sprnhe2 = this;
        sprnhe2.cfr_renamed_3 = arg0;
        sprnhe2.cfr_renamed_4 = sprooe2;
    }

    public static sprnhe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnhe) {
            return (sprnhe)arg0;
        }
        if (arg0 != null) {
            return new sprnhe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnhe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2 && arg0.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjgka.cfr_renamed_9("\u0001\u0003'B0\u00072\u0017&\f \u0007c\u0011*\u0018&Xc")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = spryee.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_2 = sprmra.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public sprmra cfr_renamed_4509() {
        return this.cfr_renamed_2;
    }

    public static sprnhe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprnhe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprnhe(spruhe spruhe2, BigInteger bigInteger) {
        this(new spryee(new sprmee((spruhe)arg0)), new sprooe((BigInteger)arg1));
        void arg1;
        void arg0;
    }

    public spryee cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public sprooe cfr_renamed_405() {
        return this.cfr_renamed_4;
    }

    public sprnhe(spryee arg0, BigInteger arg1) {
        this(arg0, new sprooe(arg1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprnhe sprnhe2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprnhe2.cfr_renamed_4);
        if (sprnhe2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        return new sprpse(sprlre2);
    }
}

