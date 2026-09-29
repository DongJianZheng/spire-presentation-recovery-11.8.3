/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraaf;
import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqkm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprypm;
import java.net.URI;

public class sprvff {
    public sprqkm cfr_renamed_3;
    public URI cfr_renamed_4;

    public void cfr_renamed_692(boolean arg0, String arg1, String arg2) {
        this.cfr_renamed_5386(arg0, arg1, arg2, null);
    }

    public void cfr_renamed_5386(boolean arg0, String arg1, String arg2, sprypm arg3) {
        spraen spraen2 = null;
        if (arg1 != null) {
            spraen2 = new spraen(arg1);
        }
        sprnrm sprnrm2 = null;
        if (arg2 != null) {
            sprnrm2 = new sprnrm(arg2);
        }
        this.cfr_renamed_5387(arg0, spraen2, sprnrm2, arg3);
    }

    public void cfr_renamed_5376(sprjj arg0) throws sprlyl {
        new spraaf(this.cfr_renamed_3).cfr_renamed_5376(arg0);
    }

    public void cfr_renamed_689(URI arg0) {
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5387(boolean bl, sprkgn sprkgn2, sprupm sprupm2, sprypm sprypm2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvff sprvff2 = this;
        sprvff2.cfr_renamed_3 = new sprqkm(sprbxm.cfr_renamed_655((boolean)arg0), (sprkgn)arg1, (sprupm)arg2, (sprypm)arg3);
    }
}

