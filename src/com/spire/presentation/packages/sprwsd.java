/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgxa;
import com.spire.presentation.packages.sprkne;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnue;
import com.spire.presentation.packages.sprvn;
import com.spire.presentation.packages.sprxne;

public abstract class sprwsd
implements sprvn {
    public final sprgxa cfr_renamed_3;
    private final sprkne cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwsd(sprkne sprkne2, sprgxa sprgxa2) {
        void arg0;
        sprwsd sprwsd2 = this;
        sprwsd2.cfr_renamed_4 = arg0;
        sprwsd2.cfr_renamed_3 = sprgxa2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final sprnue cfr_renamed_3242(spreya arg0) throws sprlqd {
        try {
            sprlqe sprlqe2 = new sprlqe(this.cfr_renamed_3.cfr_renamed_1533(arg0));
            sprwsd sprwsd2 = this;
            return new sprnue(new sprxne(sprwsd2.cfr_renamed_4, sprwsd2.cfr_renamed_3.cfr_renamed_615(), sprlqe2));
        }
        catch (sprmfb sprmfb2) {
            throw new sprlqd(new StringBuilder().insert(0, spraxo.cfr_renamed_9("z-|0o!v:quh'~%o<q2?6p;k0q!?>z,%u")).append(sprmfb2.getMessage()).toString(), sprmfb2);
        }
    }
}

