/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsh;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprseo;

public class sprmqj {
    public static sprcsh cfr_renamed_9374(sprirk arg0, byte[] arg1) {
        if (arg0 == null) {
            return new sprcsh(null, null, 128);
        }
        sprmr sprmr2 = arg0.cfr_renamed_2349();
        if (sprmr2.cfr_renamed_1315().equals("DES") || sprmr2.cfr_renamed_1315().equals("RC2") || sprmr2.cfr_renamed_1315().equals(sprseo.cfr_renamed_9("\u0000\u0016gxag")) || sprmr2.cfr_renamed_1315().equals(sprrvy.cfr_renamed_9("@Q'?$&"))) {
            return new sprcsh(null, null, 64, 64, arg1);
        }
        if (sprmr2.cfr_renamed_1315().equals(sprseo.cfr_renamed_9("\u0001\u001e\u001b\u0005\u0018\u0014\u0011\u001e"))) {
            return new sprcsh(null, null, 80, 80, arg1);
        }
        if (sprmr2.cfr_renamed_1315().equals(sprrvy.cfr_renamed_9("U]AF *#&%"))) {
            return new sprcsh(null, null, 256, 256, arg1);
        }
        return new sprcsh(null, null, 128, 128, arg1);
    }
}

