/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprurr;
import com.spire.presentation.packages.sprwve;
import com.spire.presentation.packages.sprxi;
import java.util.Collection;

public class sprosh
extends sprsvh {
    private sprtul cfr_renamed_4;

    @Override
    public void cfr_renamed_5027(sprxi arg0) {
        if (!(arg0 instanceof sprwve)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprurr.cfr_renamed_9("raR{RnWfAnOfTa\u001b\u007fZ}Zb^{^}H/VzH{\u001bm^/Za\u001bfU|OnUl^/Ti\u001b")).append(sprwve.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprtul(((sprwve)arg0).cfr_renamed_172());
    }

    @Override
    public Collection cfr_renamed_5028(sprhd arg0) {
        return this.cfr_renamed_4.cfr_renamed_3216(arg0);
    }
}

