/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpm;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprghl;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprjkm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnjj;
import com.spire.presentation.packages.sprtnm;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprytm;

public abstract class sprdml
implements sprfz {
    private byte[] cfr_renamed_2;
    public final sprghl cfr_renamed_3;
    private sprdsm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdml(sprdsm sprdsm2, sprghl sprghl2) {
        void arg0;
        sprdml sprdml2 = this;
        sprdml2.cfr_renamed_4 = arg0;
        sprdml2.cfr_renamed_3 = sprghl2;
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
            byArray = this.cfr_renamed_3.cfr_renamed_7424(arg0);
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprnjj.cfr_renamed_9("\u0016\u000b\u0010\u0016\u0003\u0007\u001a\u001c\u001dS\u0004\u0001\u0012\u0003\u0003\u001a\u001d\u0014S\u0010\u001c\u001d\u0007\u0016\u001d\u0007S\u0018\u0016\nIS")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
        if (this.cfr_renamed_4 != null) {
            sprtnm2 = new sprtnm(this.cfr_renamed_4);
            return new sprbpm(new sprjkm(sprgz.cfr_renamed_96, new sprytm(sprtnm2, this.cfr_renamed_3.cfr_renamed_615(), new sprfvg(this.cfr_renamed_3.cfr_renamed_5684()), this.cfr_renamed_3.cfr_renamed_10688(), new sprktm(this.cfr_renamed_3.cfr_renamed_10689()), null, this.cfr_renamed_3.cfr_renamed_10690(), new sprfvg(byArray))));
        }
        sprtnm2 = new sprtnm(new sprfvg(this.cfr_renamed_2));
        return new sprbpm(new sprjkm(sprgz.cfr_renamed_96, new sprytm(sprtnm2, this.cfr_renamed_3.cfr_renamed_615(), new sprfvg(this.cfr_renamed_3.cfr_renamed_5684()), this.cfr_renamed_3.cfr_renamed_10688(), new sprktm(this.cfr_renamed_3.cfr_renamed_10689()), null, this.cfr_renamed_3.cfr_renamed_10690(), new sprfvg(byArray))));
    }

    /*
     * WARNING - void declaration
     */
    public sprdml(byte[] byArray, sprghl sprghl2) {
        void arg0;
        sprdml sprdml2 = this;
        sprdml2.cfr_renamed_2 = arg0;
        sprdml2.cfr_renamed_3 = sprghl2;
    }
}

