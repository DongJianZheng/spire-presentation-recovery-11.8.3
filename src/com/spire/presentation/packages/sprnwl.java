/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprksq;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmol;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnrk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpol;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvll;
import com.spire.presentation.packages.spryrm;
import com.spire.presentation.packages.spryy;

public class sprnwl
extends sprvll {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_10670(int arg0, sprddm arg1, int arg2) throws sprlyl {
        spryrm spryrm2 = spryrm.cfr_renamed_23(arg1.cfr_renamed_284());
        byte[] byArray = arg0 == 0 ? sprkuh.cfr_renamed_1606(this.cfr_renamed_0) : sprkuh.cfr_renamed_2400(this.cfr_renamed_0);
        try {
            sprnrk sprnrk2;
            sprnrk sprnrk3 = sprnrk2 = new sprnrk(sprmol.cfr_renamed_10838(spryrm2.cfr_renamed_2386()));
            sprnrk3.cfr_renamed_1515(byArray, spryrm2.cfr_renamed_1477(), spryrm2.cfr_renamed_1478().intValue());
            return ((sprtpk)sprnrk3.cfr_renamed_249(arg2)).cfr_renamed_1521();
        }
        catch (Exception exception) {
            throw new sprlyl(new StringBuilder().insert(0, sprksq.cfr_renamed_9("0)64%%<>;q6#00!8;6u50#<'05u:0(oq")).append(exception.getMessage()).toString(), exception);
        }
    }

    @Override
    public byte[] cfr_renamed_10673(sprddm arg0, byte[] arg1, sprnfg arg2) throws sprlyl {
        spryy spryy2;
        byte[] byArray = ((sprtpk)sprpol.cfr_renamed_10840(arg2)).cfr_renamed_1521();
        spryy spryy3 = spryy2 = sprmol.cfr_renamed_10698(arg0.cfr_renamed_593());
        spryy3.cfr_renamed_5535(true, new sprkpk(new sprtpk(arg1), sproug.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_186()));
        return spryy3.cfr_renamed_1575(byArray, 0, byArray.length);
    }

    public sprnwl(sprlem arg0, char[] arg1) {
        super(arg0, arg1);
    }
}

