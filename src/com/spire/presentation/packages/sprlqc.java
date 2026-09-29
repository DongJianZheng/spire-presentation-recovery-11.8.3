/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbad;
import com.spire.presentation.packages.sprdcz;
import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprpmb;

public class sprlqc {
    public static sprpmb cfr_renamed_2470(sprhfd arg0) {
        if (arg0.cfr_renamed_2471() == null) {
            return new sprpmb(null, null, 128);
        }
        if (arg0.cfr_renamed_2471().cfr_renamed_2349().cfr_renamed_1315().equals("DES") || arg0.cfr_renamed_2471().cfr_renamed_2349().cfr_renamed_1315().equals("RC2") || arg0.cfr_renamed_2471().cfr_renamed_2349().cfr_renamed_1315().equals(sprdcz.cfr_renamed_9("y2\u001e\\\u0018C")) || arg0.cfr_renamed_2471().cfr_renamed_2349().cfr_renamed_1315().equals(sprbad.cfr_renamed_9("\"\u001fEqFh"))) {
            return new sprpmb(null, null, 64, 64);
        }
        if (arg0.cfr_renamed_2471().cfr_renamed_2349().cfr_renamed_1315().equals(sprdcz.cfr_renamed_9("x:b!a0h:"))) {
            return new sprpmb(null, null, 80, 80);
        }
        if (arg0.cfr_renamed_2471().cfr_renamed_2349().cfr_renamed_1315().equals(sprbad.cfr_renamed_9("\u001b?\u000f$nHmDk"))) {
            return new sprpmb(null, null, 256, 256);
        }
        return new sprpmb(null, null, 128, 128);
    }
}

