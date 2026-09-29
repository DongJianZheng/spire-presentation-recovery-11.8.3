/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprdtm;
import com.spire.presentation.packages.sprfym;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprkxl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmum;
import com.spire.presentation.packages.sprtmha;
import com.spire.presentation.packages.sprxs;
import com.spire.presentation.packages.spryq;

public class sprfol
implements spryq {
    public static final int cfr_renamed_0 = 2;
    private final sprmum cfr_renamed_1;
    private static final sprlem cfr_renamed_2 = sprxs.cfr_renamed_0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 0;

    public boolean cfr_renamed_4341() {
        return !sprdtm.cfr_renamed_23(this.cfr_renamed_1.cfr_renamed_97()).cfr_renamed_4342();
    }

    @Override
    public sprlem cfr_renamed_324() {
        return cfr_renamed_2;
    }

    public sprfol(sprmum sprmum2) {
        this.cfr_renamed_1 = sprmum2;
    }

    @Override
    public sprco cfr_renamed_97() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkxl cfr_renamed_4343() throws sprcsl {
        try {
            sprdtm sprdtm2 = sprdtm.cfr_renamed_23(this.cfr_renamed_1.cfr_renamed_97());
            sprjtm sprjtm2 = sprjtm.cfr_renamed_23(sprdtm2.cfr_renamed_97());
            return new sprkxl(new sprlvm(sprgz.cfr_renamed_86, sprjtm2));
        }
        catch (sprlyl sprlyl2) {
            throw new sprcsl(new StringBuilder().insert(0, sprtmha.cfr_renamed_9("m0}]^\u001c\\\u000eG\u0013I]K\u000f\\\u0012\\G\u000e")).append(sprlyl2.getMessage()).toString(), sprlyl2.getCause());
        }
        catch (Exception exception) {
            throw new sprcsl(new StringBuilder().insert(0, sprfym.cfr_renamed_9("8h6|[J\u001aH\bS\u0015][_\tH\u0014HA\u001a")).append(exception.getMessage()).toString(), exception);
        }
    }

    public int cfr_renamed_4340() {
        return this.cfr_renamed_1.cfr_renamed_324();
    }
}

