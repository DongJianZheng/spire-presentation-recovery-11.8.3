/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraig;
import com.spire.presentation.packages.sprazo;
import com.spire.presentation.packages.sprbjg;
import com.spire.presentation.packages.sprbog;
import com.spire.presentation.packages.sprchg;
import com.spire.presentation.packages.sprcmg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprej;
import com.spire.presentation.packages.sprfjg;
import com.spire.presentation.packages.sprgjg;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhgg;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprigg;
import com.spire.presentation.packages.sprikg;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjpg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmog;
import com.spire.presentation.packages.sprojg;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprplg;
import com.spire.presentation.packages.sprpng;
import com.spire.presentation.packages.sprqmg;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrkg;
import com.spire.presentation.packages.sprrlg;
import com.spire.presentation.packages.sprrq;
import com.spire.presentation.packages.sprsfg;
import com.spire.presentation.packages.sprsng;
import com.spire.presentation.packages.sprtmg;
import com.spire.presentation.packages.sprtog;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprylg;
import com.spire.presentation.packages.sprzng;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprifg
implements sprej {
    public static final sprej cfr_renamed_3;
    private static final Map cfr_renamed_4;

    @Override
    public sprpl cfr_renamed_5279(sprddm arg0) throws sprhjg {
        sprej sprej2 = (sprej)cfr_renamed_4.get(arg0.cfr_renamed_593());
        if (sprej2 == null) {
            throw new sprhjg(sprazo.cfr_renamed_9("CuNzO`\u0000fEwOsN}Sq\u0000pIsEgT"));
        }
        return sprej2.cfr_renamed_5279(arg0);
    }

    private /* synthetic */ sprifg() {
    }

    private static /* synthetic */ Map cfr_renamed_1585() {
        HashMap<sprlem, sprej> hashMap = new HashMap<sprlem, sprej>();
        sprojg sprojg2 = hashMap.put(sprgt.cfr_renamed_0, new sprojg());
        HashMap<sprlem, sprej> hashMap2 = hashMap;
        hashMap.put(sprwr.cfr_renamed_957, new spraig());
        hashMap2.put(sprwr.cfr_renamed_1226, new sprplg());
        hashMap.put(sprwr.cfr_renamed_112, new sprgjg());
        hashMap.put(sprwr.cfr_renamed_272, new sprsng());
        hashMap.put(sprwr.cfr_renamed_93, new sprtmg());
        hashMap.put(sprwr.cfr_renamed_129, new sprsfg());
        hashMap.put(sprwr.cfr_renamed_131, new sprcmg());
        hashMap.put(sprwr.cfr_renamed_128, new sprbjg());
        hashMap.put(sprwr.cfr_renamed_1, new sprylg());
        hashMap.put(sprwr.spr\ufe34, new sprjpg());
        hashMap.put(sprwr.cfr_renamed_314, new sprikg());
        hashMap.put(sprwr.cfr_renamed_2, new sprzng());
        hashMap.put(sprdl.cfr_renamed_1540, new sprpng());
        hashMap.put(sprdl.cfr_renamed_2094, new sprchg());
        hashMap.put(sprdl.cfr_renamed_956, new sprfjg());
        hashMap.put(sprqo.cfr_renamed_112, new sprrkg());
        hashMap.put(sprdt.cfr_renamed_4, new sprqmg());
        hashMap.put(sprdt.cfr_renamed_3, new sprmog());
        hashMap.put(spris.cfr_renamed_91, new sprigg());
        hashMap.put(spris.cfr_renamed_272, new sprrlg());
        hashMap.put(spris.cfr_renamed_102, new sprbog());
        hashMap.put(sprrq.cfr_renamed_1344, new sprtog());
        hashMap.put(sprow.cfr_renamed_102, new sprhgg());
        return Collections.unmodifiableMap(hashMap2);
    }

    static {
        cfr_renamed_4 = sprifg.cfr_renamed_1585();
        cfr_renamed_3 = new sprifg();
    }
}

