/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcvd;
import com.spire.presentation.packages.sprgxd;
import com.spire.presentation.packages.spripd;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprtzd;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class sprutd {
    private sprcvd cfr_renamed_0;
    private final sprtzd cfr_renamed_1;
    private static Map cfr_renamed_2 = new HashMap();
    private SecureRandom cfr_renamed_3;
    private final int cfr_renamed_4;

    public static /* synthetic */ sprcvd cfr_renamed_4214(sprutd arg0) {
        return arg0.cfr_renamed_0;
    }

    private static /* synthetic */ int cfr_renamed_1513(sprtzd arg0) {
        Integer n = (Integer)cfr_renamed_2.get(arg0);
        if (n != null) {
            return n;
        }
        return -1;
    }

    public sproa cfr_renamed_1451() throws sprlqd {
        sprutd sprutd2 = this;
        sprutd sprutd3 = this;
        return new sprgxd(sprutd3, sprutd2.cfr_renamed_1, sprutd2.cfr_renamed_4, sprutd3.cfr_renamed_3);
    }

    public sprutd cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprutd(sprtzd sprtzd2, int n) {
        void arg0;
        sprutd sprutd2 = this;
        sprutd sprutd3 = this;
        sprutd3.cfr_renamed_0 = new sprcvd();
        sprutd2.cfr_renamed_1 = arg0;
        sprutd2.cfr_renamed_4 = n;
    }

    public sprutd(sprtzd arg0) {
        sprtzd sprtzd2 = arg0;
        this(sprtzd2, sprutd.cfr_renamed_1513(sprtzd2));
    }

    static {
        cfr_renamed_2.put(spripd.spr\ufe34, spriwa.cfr_renamed_279(128));
        cfr_renamed_2.put(spripd.cfr_renamed_88, spriwa.cfr_renamed_279(192));
        cfr_renamed_2.put(spripd.cfr_renamed_105, spriwa.cfr_renamed_279(256));
        cfr_renamed_2.put(spripd.cfr_renamed_114, spriwa.cfr_renamed_279(128));
        cfr_renamed_2.put(spripd.cfr_renamed_272, spriwa.cfr_renamed_279(192));
        cfr_renamed_2.put(spripd.cfr_renamed_79, spriwa.cfr_renamed_279(256));
    }
}

