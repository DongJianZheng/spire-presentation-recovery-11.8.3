/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcbd;
import com.spire.presentation.packages.sprcue;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.sprime;
import com.spire.presentation.packages.sprjgka;
import com.spire.presentation.packages.sprkm;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprotc;
import com.spire.presentation.packages.sprxue;

public class sprvwc
extends sprotc {
    private sprime cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvwc(sprnte arg0) throws sprcbd {
        super(arg0);
        if (!sprkm.cfr_renamed_1.equals(arg0.cfr_renamed_696())) {
            throw new sprcbd(spraqe.cfr_renamed_9("JGg\\lF}agNf\bgG}\bh\bM~J{)zlY|Mz\\"));
        }
        try {
            if (arg0.cfr_renamed_480().cfr_renamed_119() instanceof sprbne) {
                this.cfr_renamed_4 = sprime.cfr_renamed_23(arg0.cfr_renamed_480());
                return;
            }
            this.cfr_renamed_4 = sprime.cfr_renamed_23(sprxue.cfr_renamed_23(arg0.cfr_renamed_480()).cfr_renamed_186());
            return;
        }
        catch (Exception exception) {
            throw new sprcbd(new StringBuilder().insert(0, sprjgka.cfr_renamed_9("\u0016\f\"\u0000/\u0007c\u0016,B3\u00031\u0011&B \r-\u0016&\f7Xc")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprvwc(sprfud arg0) throws sprcbd {
        this(sprcue.cfr_renamed_23(arg0.cfr_renamed_568().cfr_renamed_480()).cfr_renamed_2589());
    }

    @Override
    public spra cfr_renamed_480() {
        return this.cfr_renamed_4;
    }
}

