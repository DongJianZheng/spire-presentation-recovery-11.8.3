/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.spret;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprjwl
implements spret {
    public static final Map cfr_renamed_3;
    public static final Set cfr_renamed_4;

    static {
        cfr_renamed_4 = new HashSet();
        cfr_renamed_3 = new HashMap();
        cfr_renamed_4.add(sprdl.cfr_renamed_1762);
        cfr_renamed_4.add(sprdl.cfr_renamed_957);
        cfr_renamed_4.add(sprdl.cfr_renamed_614);
        cfr_renamed_4.add(sprdl.cfr_renamed_3051);
        cfr_renamed_4.add(sprgt.cfr_renamed_3);
        cfr_renamed_4.add(sprgt.cfr_renamed_119);
        cfr_renamed_4.add(sprgt.cfr_renamed_86);
        cfr_renamed_4.add(sprgt.cfr_renamed_4);
        cfr_renamed_4.add(spris.cfr_renamed_86);
        cfr_renamed_4.add(spris.cfr_renamed_133);
        cfr_renamed_4.add(spris.cfr_renamed_112);
        cfr_renamed_3.put(sprqo.cfr_renamed_96, new sprddm(sprqo.cfr_renamed_93, sprpen.cfr_renamed_4));
        cfr_renamed_3.put(sprdt.cfr_renamed_1, new sprddm(sprdt.cfr_renamed_96, sprpen.cfr_renamed_4));
        cfr_renamed_3.put(sprdt.cfr_renamed_107, new sprddm(sprdt.cfr_renamed_91, sprpen.cfr_renamed_4));
    }

    @Override
    public sprddm cfr_renamed_10659(sprddm arg0) {
        if (cfr_renamed_4.contains(arg0.cfr_renamed_593())) {
            return new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4);
        }
        if (cfr_renamed_3.containsKey(arg0.cfr_renamed_593())) {
            return (sprddm)cfr_renamed_3.get(arg0.cfr_renamed_593());
        }
        return arg0;
    }
}

