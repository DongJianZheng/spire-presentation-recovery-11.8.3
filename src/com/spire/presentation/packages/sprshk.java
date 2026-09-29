/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcih;
import com.spire.presentation.packages.sprfih;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprgq;
import com.spire.presentation.packages.sprinq;
import com.spire.presentation.packages.sprkgh;
import com.spire.presentation.packages.sprlfh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruih;

public class sprshk {
    private final sprfih cfr_renamed_3;
    private final sprlfh cfr_renamed_4;

    public sprlfh cfr_renamed_8278() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprshk(sprlfh sprlfh2) {
        void arg0;
        sprshk sprshk2 = this;
        sprshk2.cfr_renamed_4 = arg0;
        sprshk2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprshk(sprfih sprfih2, sprlfh sprlfh2) {
        void arg1;
        sprshk sprshk2 = this;
        sprshk2.cfr_renamed_4 = arg1;
        sprshk2.cfr_renamed_3 = sprfih2;
    }

    public byte[] cfr_renamed_9602(sprgq arg0) {
        if (0 != this.cfr_renamed_3.cfr_renamed_8323().cfr_renamed_8227()) {
            throw new IllegalArgumentException(sprinq.cfr_renamed_9("Y \u007f<e>h+xnx/h/<'onr!<\u000fY\u001d<\u007f.v<\r_\u0003"));
        }
        sprshk sprshk2 = this;
        sprkgh sprkgh2 = sprkgh.cfr_renamed_23(sprshk2.cfr_renamed_3.cfr_renamed_8323().cfr_renamed_8261());
        spruih spruih2 = spruih.cfr_renamed_23(sprcih.cfr_renamed_23(sprshk2.cfr_renamed_4.cfr_renamed_8278()).cfr_renamed_8259().cfr_renamed_8322());
        byte[] byArray = sproze.cfr_renamed_527(sprgfh.cfr_renamed_23(spruih2.cfr_renamed_3694()).cfr_renamed_7976(), spruih2.cfr_renamed_3369().cfr_renamed_186(), spruih2.cfr_renamed_1144().cfr_renamed_186());
        return arg0.cfr_renamed_7163(byArray, sprkgh2.cfr_renamed_8424().cfr_renamed_480(), sprkgh2.cfr_renamed_596().cfr_renamed_186());
    }

    public sprfih cfr_renamed_1446() {
        return this.cfr_renamed_3;
    }
}

