/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnjo;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprsqe
extends sprkra {
    private sprawe cfr_renamed_2;
    private sprmra cfr_renamed_3;
    private sprije cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsqe(sprbne sprbne2) {
        void arg0;
        int n = 0;
        if (sprbne2.cfr_renamed_85(0) instanceof spryte) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            ++n;
            spryte spryte3 = spryte2;
            if (spryte2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprnjo.cfr_renamed_9("x[F[BBC\u0015}z}z~\\J[D[J~HLd[]@Y\u0015YTJ\u000f\r")).append(spryte3.cfr_renamed_312()).toString());
            }
            this.cfr_renamed_2 = sprawe.cfr_renamed_23(spryte3.cfr_renamed_2456());
        }
        sprsqe sprsqe2 = this;
        void v2 = arg0;
        sprsqe2.cfr_renamed_4 = sprije.cfr_renamed_23(v2.cfr_renamed_85(n));
        sprsqe2.cfr_renamed_3 = sprmra.cfr_renamed_23(v2.cfr_renamed_85(++n));
    }

    public sprije cfr_renamed_615() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsqe(sprawe sprawe2, sprije sprije2, sprmra sprmra2) {
        void arg1;
        void arg0;
        sprsqe sprsqe2 = this;
        this.cfr_renamed_2 = arg0;
        sprsqe2.cfr_renamed_4 = arg1;
        sprsqe2.cfr_renamed_3 = sprmra2;
    }

    public sprmra cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_2));
        }
        sprlre sprlre3 = sprlre2;
        sprsqe sprsqe2 = this;
        sprlre3.cfr_renamed_49(sprsqe2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(sprsqe2.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public static sprsqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsqe) {
            return (sprsqe)arg0;
        }
        if (arg0 != null) {
            return new sprsqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprsqe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprsqe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprawe cfr_renamed_4380() {
        return this.cfr_renamed_2;
    }
}

