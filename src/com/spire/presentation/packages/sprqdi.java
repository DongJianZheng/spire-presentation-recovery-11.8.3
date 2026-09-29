/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprsx;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprwr;
import java.util.HashMap;
import java.util.Map;

public class sprqdi {
    private static Map cfr_renamed_4 = new HashMap();

    static {
        cfr_renamed_4.put(sprdl.cfr_renamed_2797.cfr_renamed_19(), spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprwr.cfr_renamed_88, spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put(sprwr.cfr_renamed_1223, spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprwr.cfr_renamed_724, spruaf.cfr_renamed_279(256));
        cfr_renamed_4.put(sprsx.cfr_renamed_2, spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put(sprsx.cfr_renamed_1, spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprsx.cfr_renamed_4, spruaf.cfr_renamed_279(256));
    }

    public static int cfr_renamed_7413(sprlem arg0) {
        Integer n = (Integer)cfr_renamed_4.get(arg0);
        if (n != null) {
            return n;
        }
        return -1;
    }
}

