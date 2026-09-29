/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbte;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnue;
import com.spire.presentation.packages.sprnza;
import com.spire.presentation.packages.sprrte;
import com.spire.presentation.packages.sprvn;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprxgk;

public abstract class sprvtd
implements sprvn {
    private sprvre cfr_renamed_2;
    private byte[] cfr_renamed_3;
    public final sprnza cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final sprnue cfr_renamed_3242(spreya arg0) throws sprlqd {
        sprrte sprrte2;
        byte[] byArray;
        try {
            byArray = this.cfr_renamed_4.cfr_renamed_1533(arg0);
        }
        catch (sprmfb sprmfb2) {
            throw new sprlqd(new StringBuilder().insert(0, sprxgk.cfr_renamed_9("T{RfAwXl_#FqPsAj_d\u0011`^mEf_w\u0011hTz\u000b#")).append(sprmfb2.getMessage()).toString(), sprmfb2);
        }
        if (this.cfr_renamed_2 != null) {
            sprrte2 = new sprrte(this.cfr_renamed_2);
            return new sprnue(new sprbte(sprrte2, this.cfr_renamed_4.cfr_renamed_615(), new sprlqe(byArray)));
        }
        sprrte2 = new sprrte(new sprlqe(this.cfr_renamed_3));
        return new sprnue(new sprbte(sprrte2, this.cfr_renamed_4.cfr_renamed_615(), new sprlqe(byArray)));
    }

    /*
     * WARNING - void declaration
     */
    public sprvtd(byte[] byArray, sprnza sprnza2) {
        void arg0;
        sprvtd sprvtd2 = this;
        sprvtd2.cfr_renamed_3 = arg0;
        sprvtd2.cfr_renamed_4 = sprnza2;
    }

    /*
     * WARNING - void declaration
     */
    public sprvtd(sprvre sprvre2, sprnza sprnza2) {
        void arg0;
        sprvtd sprvtd2 = this;
        sprvtd2.cfr_renamed_2 = arg0;
        sprvtd2.cfr_renamed_4 = sprnza2;
    }
}

