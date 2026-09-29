/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprlem;
import java.util.Enumeration;

public class sprzfi {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spreph cfr_renamed_2315(String arg0) {
        sprhfm sprhfm2;
        sprhfm sprhfm3 = spralm.cfr_renamed_9183(arg0);
        if (sprhfm3 == null) {
            try {
                sprhfm2 = sprhfm3 = spralm.cfr_renamed_9184(new sprlem(arg0));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        } else {
            sprhfm2 = sprhfm3;
        }
        if (sprhfm2 == null) {
            return null;
        }
        return new spreph(arg0, sprhfm3.cfr_renamed_1769(), sprhfm3.cfr_renamed_1145(), sprhfm3.cfr_renamed_1146(), sprhfm3.cfr_renamed_1153(), sprhfm3.cfr_renamed_2113());
    }

    public static Enumeration cfr_renamed_289() {
        return spralm.cfr_renamed_289();
    }
}

