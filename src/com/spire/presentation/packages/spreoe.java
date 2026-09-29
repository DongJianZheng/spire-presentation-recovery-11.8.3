/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class spreoe
extends sprkra {
    private sprije cfr_renamed_2;
    private sprxue cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spreoe spreoe2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(spreoe2.cfr_renamed_2);
        if (spreoe2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprdpe(0 != 0, 0, this.cfr_renamed_3));
        }
        return new sprjve(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public spreoe(sprtzd sprtzd2, sprije sprije2, sprxue sprxue2) {
        void arg1;
        void arg0;
        spreoe spreoe2 = this;
        this.cfr_renamed_4 = arg0;
        spreoe2.cfr_renamed_2 = arg1;
        spreoe2.cfr_renamed_3 = sprxue2;
    }

    public sprxue cfr_renamed_4178() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spreoe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 2) {
            throw new IllegalArgumentException(sprbva.cfr_renamed_9("vaW}ArVvF3qvSfG}Av\u0002UMfLw"));
        }
        this.cfr_renamed_4 = (sprtzd)arg0.cfr_renamed_85(0);
        void v0 = arg0;
        this.cfr_renamed_2 = sprije.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (v0.cfr_renamed_84() > 2) {
            this.cfr_renamed_3 = sprxue.cfr_renamed_341((spryte)arg0.cfr_renamed_85(2), false);
        }
    }

    public static spreoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreoe) {
            return (spreoe)arg0;
        }
        if (arg0 != null) {
            return new spreoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprije cfr_renamed_4173() {
        return this.cfr_renamed_2;
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_4;
    }
}

