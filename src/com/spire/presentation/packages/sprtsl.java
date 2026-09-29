/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbye;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmol;
import com.spire.presentation.packages.sprnrk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryrm;
import com.spire.presentation.packages.spryy;
import com.spire.presentation.packages.sprzq;

public abstract class sprtsl
implements sprzq {
    private final char[] cfr_renamed_1;
    private int cfr_renamed_2;

    public sprtsl cfr_renamed_4012(int arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_10670(int arg0, sprddm arg1, int arg2) throws sprlyl {
        spryrm spryrm2 = spryrm.cfr_renamed_23(arg1.cfr_renamed_284());
        byte[] byArray = arg0 == 0 ? sprkuh.cfr_renamed_1606(this.cfr_renamed_1) : sprkuh.cfr_renamed_2400(this.cfr_renamed_1);
        try {
            sprnrk sprnrk2;
            sprnrk sprnrk3 = sprnrk2 = new sprnrk(sprmol.cfr_renamed_10838(spryrm2.cfr_renamed_2386()));
            sprnrk3.cfr_renamed_1515(byArray, spryrm2.cfr_renamed_1477(), spryrm2.cfr_renamed_1478().intValue());
            return ((sprtpk)sprnrk3.cfr_renamed_249(arg2)).cfr_renamed_1521();
        }
        catch (Exception exception) {
            throw new sprlyl(new StringBuilder().insert(0, sprhtc.cfr_renamed_9("%m#p0a)z.5#g%t4|.r`q%g)c%q`~%lz5")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprtsl(char[] cArray) {
        sprtsl sprtsl2 = this;
        sprtsl2.cfr_renamed_2 = 1;
        sprtsl2.cfr_renamed_1 = cArray;
    }

    @Override
    public int cfr_renamed_3233() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtpk cfr_renamed_10700(sprddm arg0, sprddm arg1, byte[] arg2, byte[] arg3) throws sprlyl {
        spryy spryy2 = sprmol.cfr_renamed_10698(arg0.cfr_renamed_593());
        spryy2.cfr_renamed_5535(false, new sprkpk(new sprtpk(arg2), sproug.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_186()));
        try {
            return new sprtpk(spryy2.cfr_renamed_1579(arg3, 0, arg3.length));
        }
        catch (sprull sprull2) {
            throw new sprlyl(new StringBuilder().insert(0, sprbye.cfr_renamed_9("}aimdj({g/}a\u007f}i\u007f(dmv2/")).append(sprull2.getMessage()).toString(), sprull2);
        }
    }

    @Override
    public char[] cfr_renamed_1601() {
        return this.cfr_renamed_1;
    }
}

