/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnng;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprxrc;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.spryye;

public abstract class sprvgg
extends sprnng {
    private spryye cfr_renamed_4;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprnfg cfr_renamed_7425(sprddm arg0, byte[] arg1) throws spryhg {
        sprvgg sprvgg2 = this;
        sprwn sprwn2 = sprvgg2.cfr_renamed_7486(sprvgg2.cfr_renamed_615().cfr_renamed_593());
        sprwn2.cfr_renamed_5535(false, this.cfr_renamed_4);
        try {
            byte[] byArray = sprwn2.cfr_renamed_1337(arg1, 0, arg1.length);
            if (!arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_2797)) return new sprnfg(arg0, byArray);
            return new sprnfg(arg0, byArray);
        }
        catch (sprull sprull2) {
            throw new spryhg(new StringBuilder().insert(0, sprxrc.cfr_renamed_9("JZ^VSQ\u001f@P\u0014MQ\\[IQM\u0014LQ\\FZ@\u001f_ZM\u0005\u0014")).append(sprull2.getMessage()).toString(), sprull2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprvgg(sprddm sprddm2, spryye spryye2) {
        super((sprddm)arg0);
        void arg0;
        this.cfr_renamed_4 = spryye2;
    }

    public abstract sprwn cfr_renamed_7486(sprlem var1);
}

