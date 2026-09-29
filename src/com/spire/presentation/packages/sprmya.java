/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakia;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprtzd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class sprmya {
    private static final Map cfr_renamed_2 = new HashMap();
    private static final Set cfr_renamed_3;
    private static final Set cfr_renamed_4;

    static {
        cfr_renamed_4 = new HashSet();
        cfr_renamed_3 = new HashSet();
        cfr_renamed_4.add(sprm.cfr_renamed_1579);
        cfr_renamed_4.add(sprm.cfr_renamed_1521);
        cfr_renamed_4.add(sprm.cfr_renamed_84);
        cfr_renamed_4.add(sprm.cfr_renamed_4);
        cfr_renamed_4.add(sprm.cfr_renamed_112);
        cfr_renamed_4.add(sprm.cfr_renamed_957);
        cfr_renamed_3.add(sprm.cfr_renamed_1494);
        cfr_renamed_3.add(sprm.cfr_renamed_1262);
        cfr_renamed_3.add(sprdg.cfr_renamed_287);
        cfr_renamed_3.add(sprdg.cfr_renamed_152);
        cfr_renamed_3.add(sprdg.cfr_renamed_102);
        cfr_renamed_2.put(sprm.cfr_renamed_1262.cfr_renamed_19(), spriwa.cfr_renamed_279(192));
        cfr_renamed_2.put(sprdg.cfr_renamed_287.cfr_renamed_19(), spriwa.cfr_renamed_279(128));
        cfr_renamed_2.put(sprdg.cfr_renamed_152.cfr_renamed_19(), spriwa.cfr_renamed_279(192));
        cfr_renamed_2.put(sprdg.cfr_renamed_102.cfr_renamed_19(), spriwa.cfr_renamed_279(256));
    }

    public static boolean cfr_renamed_1593(sprtzd arg0) {
        return cfr_renamed_3.contains(arg0);
    }

    public static boolean cfr_renamed_1492(sprtzd arg0) {
        return arg0.cfr_renamed_19().startsWith(sprm.cfr_renamed_580.cfr_renamed_19());
    }

    public static boolean cfr_renamed_1594(sprtzd arg0) {
        return cfr_renamed_4.contains(arg0);
    }

    public static int cfr_renamed_1595(String arg0) {
        if (!cfr_renamed_2.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprakia.cfr_renamed_9("\u0007ZI^\fLIF\u0000O\f\u0015\u000fZ\u001b\u0015\bY\u000eZ\u001b\\\u001d]\u0004\u000fI")).append(arg0).toString());
        }
        return (Integer)cfr_renamed_2.get(arg0);
    }
}

