/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprae;
import com.spire.presentation.packages.sprba;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprtzd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprsya
implements sprba {
    public static final sprba cfr_renamed_3 = new sprsya();
    private static final Map cfr_renamed_4;

    @Override
    public int cfr_renamed_1513(sprtzd arg0) {
        Integer n = (Integer)cfr_renamed_4.get(arg0);
        if (n != null) {
            return n;
        }
        return -1;
    }

    @Override
    public int cfr_renamed_1497(sprije arg0) {
        int n = this.cfr_renamed_1513(arg0.cfr_renamed_593());
        if (n > 0) {
            return n;
        }
        return -1;
    }

    static {
        HashMap<sprtzd, Integer> hashMap = new HashMap<sprtzd, Integer>();
        hashMap.put(new sprtzd("1.2.840.113533.7.66.10"), spriwa.cfr_renamed_279(128));
        hashMap.put(sprm.cfr_renamed_1262, spriwa.cfr_renamed_279(192));
        hashMap.put(sprdg.cfr_renamed_287, spriwa.cfr_renamed_279(128));
        hashMap.put(sprdg.cfr_renamed_152, spriwa.cfr_renamed_279(192));
        hashMap.put(sprdg.cfr_renamed_102, spriwa.cfr_renamed_279(256));
        hashMap.put(sprae.cfr_renamed_3, spriwa.cfr_renamed_279(128));
        hashMap.put(sprae.cfr_renamed_1, spriwa.cfr_renamed_279(192));
        hashMap.put(sprae.cfr_renamed_2, spriwa.cfr_renamed_279(256));
        hashMap.put(sprji.cfr_renamed_112, spriwa.cfr_renamed_279(256));
        cfr_renamed_4 = Collections.unmodifiableMap(hashMap);
    }
}

