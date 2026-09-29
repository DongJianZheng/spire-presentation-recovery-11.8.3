/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprgkm;
import com.spire.presentation.packages.sprjjea;
import com.spire.presentation.packages.sprkng;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprplm;
import com.spire.presentation.packages.spryhg;

public abstract class sprgil
implements sprfz {
    private final sprplm cfr_renamed_3;
    public final sprkng cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final sprbpm cfr_renamed_10668(sprnfg arg0) throws sprlyl {
        try {
            sprfvg sprfvg2 = new sprfvg(this.cfr_renamed_4.cfr_renamed_7424(arg0));
            sprgil sprgil2 = this;
            return new sprbpm(new sprgkm(sprgil2.cfr_renamed_3, sprgil2.cfr_renamed_4.cfr_renamed_615(), sprfvg2));
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprjjea.cfr_renamed_9("462+!:8!?n&<0>!'?)q-> %+?:q%47kn")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprgil(sprplm sprplm2, sprkng sprkng2) {
        void arg0;
        sprgil sprgil2 = this;
        sprgil2.cfr_renamed_3 = arg0;
        sprgil2.cfr_renamed_4 = sprkng2;
    }
}

