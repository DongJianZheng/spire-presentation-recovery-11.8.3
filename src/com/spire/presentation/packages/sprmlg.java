/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.sprkam;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprovl;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtar;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprxg;
import com.spire.presentation.packages.sprypg;

public class sprmlg {
    private sprszm cfr_renamed_4;

    public sprypg[] cfr_renamed_1448() {
        int n;
        sprypg[] sprypgArray = new sprypg[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n;
            sprypg sprypg2 = new sprypg(sprkam.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n)));
            sprypgArray[n3] = sprypg2;
            n2 = ++n;
        }
        return sprypgArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprmlg(spruom spruom2) {
        void arg0;
        if (spruom2.cfr_renamed_696().cfr_renamed_5078(sprdl.cfr_renamed_3249)) {
            throw new IllegalArgumentException(sprtar.cfr_renamed_9("EaC}Y\u007fTjDKA{A/RjQzI}E|\u0000lOaS{RzC{O}\u0000xI{H/DjC}Y\u007fT`R!"));
        }
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(sproug.cfr_renamed_23(arg0.cfr_renamed_480()).cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmlg(spruom spruom2, sprxg sprxg2) throws sprhng {
        void arg0;
        if (!spruom2.cfr_renamed_696().cfr_renamed_5078(sprdl.cfr_renamed_3249)) {
            throw new IllegalArgumentException(sprtar.cfr_renamed_9("EaC}Y\u007fTjDKA{A/RjQzI}E|\u0000lOaS{RzC{O}\u0000xI{H/DjC}Y\u007fT`R!"));
        }
        sprovl sprovl2 = new sprovl(sprlvm.cfr_renamed_23(arg0));
        try {
            void arg1;
            this.cfr_renamed_4 = sprszm.cfr_renamed_23(sprovl2.cfr_renamed_7359((sprxg)arg1));
            return;
        }
        catch (sprlyl sprlyl2) {
            throw new sprhng(new StringBuilder().insert(0, sprald.cfr_renamed_9("Z)N%C\"\u000f3@gJ?[5N$[gK&[&\u0015g")).append(sprlyl2.getMessage()).toString(), sprlyl2);
        }
    }
}

