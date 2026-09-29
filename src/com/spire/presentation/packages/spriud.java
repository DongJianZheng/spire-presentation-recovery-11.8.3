/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnue;
import com.spire.presentation.packages.sprstq;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruve;
import com.spire.presentation.packages.sprvn;
import com.spire.presentation.packages.sprvqe;
import com.spire.presentation.packages.sprype;
import java.io.IOException;

public abstract class spriud
implements sprvn {
    private sprdce cfr_renamed_2;
    private sprtzd cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spriud(sprtzd sprtzd2, sprdce sprdce2, sprtzd sprtzd3) {
        void arg0;
        void arg1;
        spriud spriud2 = this;
        this.cfr_renamed_2 = arg1;
        spriud2.cfr_renamed_4 = arg0;
        spriud2.cfr_renamed_3 = sprtzd3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprnue cfr_renamed_3242(spreya arg0) throws sprlqd {
        spriud spriud2 = this;
        spruve spruve2 = new spruve(spriud2.cfr_renamed_4033(spriud2.cfr_renamed_2));
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprume.cfr_renamed_3);
        sprije sprije2 = new sprije(this.cfr_renamed_3, sprume.cfr_renamed_3);
        sprije sprije3 = new sprije(this.cfr_renamed_4, sprije2);
        spriud spriud3 = this;
        sprbne sprbne2 = spriud3.cfr_renamed_4034(sprije3, sprije2, arg0);
        spra spra2 = spriud3.cfr_renamed_4035(sprije3);
        if (spra2 == null) {
            return new sprnue(new sprype(spruve2, null, sprije3, sprbne2));
        }
        try {
            return new sprnue(new sprype(spruve2, new sprlqe(spra2), sprije3, sprbne2));
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprstq.cfr_renamed_9("-#9/4(x97m=#;\"<(x8+(*\u0006=41#?\u000099=?1,4wx")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprvqe cfr_renamed_4033(sprdce arg0) {
        return new sprvqe(new sprije(arg0.cfr_renamed_593().cfr_renamed_593(), sprume.cfr_renamed_3), arg0.cfr_renamed_2314().cfr_renamed_81());
    }

    public abstract sprbne cfr_renamed_4034(sprije var1, sprije var2, spreya var3) throws sprlqd;

    public abstract spra cfr_renamed_4035(sprije var1) throws sprlqd;
}

