/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajk;
import com.spire.presentation.packages.spreik;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproik;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.spruhk;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprynm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class spruik {
    private static HashMap<sprgxh, String> cfr_renamed_1;
    private static final Map<sprlem, String> cfr_renamed_2;
    private static final Map<String, String> cfr_renamed_3;
    private static final Map<String, sprlem> cfr_renamed_4;

    public static String cfr_renamed_7555(sprlem arg0) {
        return cfr_renamed_2.get(arg0);
    }

    public static /* synthetic */ Map cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    public static String cfr_renamed_9844(sprqxk arg0) {
        if (arg0 instanceof sprxrk) {
            return spruik.cfr_renamed_7555(((sprxrk)arg0).cfr_renamed_313());
        }
        return spruik.cfr_renamed_9845(arg0.cfr_renamed_1769());
    }

    static {
        cfr_renamed_4 = Collections.unmodifiableMap(new sprajk());
        cfr_renamed_3 = Collections.unmodifiableMap(new sproik());
        cfr_renamed_1 = new spreik();
        cfr_renamed_2 = Collections.unmodifiableMap(new spruhk());
    }

    public static sprhfm cfr_renamed_9846(String arg0) {
        return sprynm.cfr_renamed_7994(cfr_renamed_4.get(sprkoe.cfr_renamed_425(arg0)));
    }

    public static sprhfm cfr_renamed_9847(sprlem arg0) {
        return sprynm.cfr_renamed_7994(arg0);
    }

    public static String cfr_renamed_9845(sprgxh arg0) {
        return cfr_renamed_3.get(cfr_renamed_1.get(arg0));
    }

    public static sprlem cfr_renamed_1837(String arg0) {
        return cfr_renamed_4.get(arg0);
    }
}

