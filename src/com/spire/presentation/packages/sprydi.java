/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnhm;
import java.util.Enumeration;

public class sprydi {
    public static Enumeration cfr_renamed_289() {
        return sprnhm.cfr_renamed_289();
    }

    private static /* synthetic */ boolean cfr_renamed_9180(String arg0) {
        if (arg0.length() < 3 || arg0.charAt(1) != '.') {
            return false;
        }
        char c = arg0.charAt(0);
        return c >= '0' && c <= '2';
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spreph cfr_renamed_2315(String arg0) {
        try {
            v0 = var1_1 = sprydi.cfr_renamed_9180(arg0) != false ? new sprlem(arg0) : null;
        }
        catch (IllegalArgumentException var2_2) {
            v0 = var1_1 = null;
        }
        if ((v0 != null ? (var2_3 = sprchl.cfr_renamed_7994(var1_1)) : (var2_3 = sprchl.cfr_renamed_1837(arg0))) != null) ** GOTO lbl11
        if (var1_1 != null) {
            v1 = var2_3 = sprnhm.cfr_renamed_7994(var1_1);
        } else {
            var2_3 = sprnhm.cfr_renamed_1837(arg0);
lbl11:
            // 2 sources

            v1 = var2_3;
        }
        if (v1 == null) {
            return null;
        }
        return new spreph(arg0, var2_3.cfr_renamed_1769(), var2_3.cfr_renamed_1145(), var2_3.cfr_renamed_1146(), var2_3.cfr_renamed_1153(), var2_3.cfr_renamed_2113());
    }
}

