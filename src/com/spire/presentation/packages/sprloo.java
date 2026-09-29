/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprioo;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzmo;

@sprtea
public class sprloo
extends sprzmo {
    public static sprwbp cfr_renamed_3;
    public static sprwbp cfr_renamed_4;

    static {
        cfr_renamed_4 = sprwbp.cfr_renamed_1513;
        cfr_renamed_3 = sprwbp.cfr_renamed_955;
    }

    @Override
    public sprpln cfr_renamed_16280(sprioo arg0) {
        sprpip sprpip2 = (sprpip)super.cfr_renamed_16280(arg0);
        sprwbp[] sprwbpArray = new sprwbp[4];
        sprwbpArray[0] = cfr_renamed_4;
        sprwbpArray[1] = arg0.cfr_renamed_16215();
        sprwbpArray[2] = cfr_renamed_3;
        sprwbpArray[3] = arg0.cfr_renamed_12676();
        sprpip2.cfr_renamed_16285(sprwbpArray);
        return sprpip2;
    }

    public sprloo(byte[] arg0) {
        super(arg0);
    }
}

