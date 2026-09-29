/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprae;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprtzd;
import java.util.HashMap;
import java.util.Map;

public class sprslb {
    private static Map cfr_renamed_4 = new HashMap();

    static {
        cfr_renamed_4.put(sprm.cfr_renamed_1262.cfr_renamed_19(), spriwa.cfr_renamed_279(192));
        cfr_renamed_4.put(sprdg.cfr_renamed_287, spriwa.cfr_renamed_279(128));
        cfr_renamed_4.put(sprdg.cfr_renamed_152, spriwa.cfr_renamed_279(192));
        cfr_renamed_4.put(sprdg.cfr_renamed_102, spriwa.cfr_renamed_279(256));
        cfr_renamed_4.put(sprae.cfr_renamed_3, spriwa.cfr_renamed_279(128));
        cfr_renamed_4.put(sprae.cfr_renamed_1, spriwa.cfr_renamed_279(192));
        cfr_renamed_4.put(sprae.cfr_renamed_2, spriwa.cfr_renamed_279(256));
    }

    public static int cfr_renamed_1513(sprtzd arg0) {
        Integer n = (Integer)cfr_renamed_4.get(arg0);
        if (n != null) {
            return n;
        }
        return -1;
    }
}

