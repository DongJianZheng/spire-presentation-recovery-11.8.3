/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpm;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprlsm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprpgp;
import com.spire.presentation.packages.sprtnm;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprymg;

public abstract class sprwcl
implements sprfz {
    private sprdsm cfr_renamed_2;
    private byte[] cfr_renamed_3;
    public final sprymg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwcl(byte[] byArray, sprymg sprymg2) {
        void arg0;
        sprwcl sprwcl2 = this;
        sprwcl2.cfr_renamed_3 = arg0;
        sprwcl2.cfr_renamed_4 = sprymg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwcl(sprdsm sprdsm2, sprymg sprymg2) {
        void arg0;
        sprwcl sprwcl2 = this;
        sprwcl2.cfr_renamed_2 = arg0;
        sprwcl2.cfr_renamed_4 = sprymg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final sprbpm cfr_renamed_10668(sprnfg arg0) throws sprlyl {
        sprtnm sprtnm2;
        byte[] byArray;
        try {
            byArray = this.cfr_renamed_4.cfr_renamed_7424(arg0);
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprpgp.cfr_renamed_9("W?Q\"B3[(\\gE5S7B.\\ \u0012$])F\"\\3\u0012,W>\bg")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
        if (this.cfr_renamed_2 != null) {
            sprtnm2 = new sprtnm(this.cfr_renamed_2);
            return new sprbpm(new sprlsm(sprtnm2, this.cfr_renamed_4.cfr_renamed_615(), new sprfvg(byArray)));
        }
        sprtnm2 = new sprtnm(new sprfvg(this.cfr_renamed_3));
        return new sprbpm(new sprlsm(sprtnm2, this.cfr_renamed_4.cfr_renamed_615(), new sprfvg(byArray)));
    }
}

