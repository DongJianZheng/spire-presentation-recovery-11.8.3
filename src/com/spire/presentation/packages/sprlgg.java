/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgp;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprsx;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprwr;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprlgg
implements sprni {
    public static final sprni cfr_renamed_3 = new sprlgg();
    private static final Map cfr_renamed_4;

    static {
        HashMap<sprlem, Integer> hashMap = new HashMap<sprlem, Integer>();
        hashMap.put(new sprlem("1.2.840.113533.7.66.10"), spruaf.cfr_renamed_279(128));
        hashMap.put(sprdl.cfr_renamed_2797, spruaf.cfr_renamed_279(192));
        hashMap.put(sprdl.cfr_renamed_152, spruaf.cfr_renamed_279(192));
        hashMap.put(sprdl.cfr_renamed_1397, spruaf.cfr_renamed_279(64));
        hashMap.put(sprdl.cfr_renamed_1452, spruaf.cfr_renamed_279(64));
        hashMap.put(sprwr.cfr_renamed_88, spruaf.cfr_renamed_279(128));
        hashMap.put(sprwr.cfr_renamed_1223, spruaf.cfr_renamed_279(192));
        hashMap.put(sprwr.cfr_renamed_724, spruaf.cfr_renamed_279(256));
        hashMap.put(sprwr.cfr_renamed_134, spruaf.cfr_renamed_279(128));
        hashMap.put(sprwr.cfr_renamed_133, spruaf.cfr_renamed_279(192));
        hashMap.put(sprwr.cfr_renamed_805, spruaf.cfr_renamed_279(256));
        hashMap.put(sprwr.cfr_renamed_951, spruaf.cfr_renamed_279(128));
        hashMap.put(sprwr.cfr_renamed_107, spruaf.cfr_renamed_279(192));
        hashMap.put(sprwr.cfr_renamed_1228, spruaf.cfr_renamed_279(256));
        hashMap.put(sprwr.cfr_renamed_136, spruaf.cfr_renamed_279(128));
        hashMap.put(sprwr.cfr_renamed_287, spruaf.cfr_renamed_279(192));
        hashMap.put(sprwr.cfr_renamed_3, spruaf.cfr_renamed_279(256));
        hashMap.put(sprwr.cfr_renamed_723, spruaf.cfr_renamed_279(128));
        hashMap.put(sprwr.cfr_renamed_132, spruaf.cfr_renamed_279(192));
        hashMap.put(sprwr.cfr_renamed_185, spruaf.cfr_renamed_279(256));
        hashMap.put(sprsx.cfr_renamed_2, spruaf.cfr_renamed_279(128));
        hashMap.put(sprsx.cfr_renamed_1, spruaf.cfr_renamed_279(192));
        hashMap.put(sprsx.cfr_renamed_4, spruaf.cfr_renamed_279(256));
        hashMap.put(sprsx.cfr_renamed_91, spruaf.cfr_renamed_279(128));
        hashMap.put(sprsx.cfr_renamed_0, spruaf.cfr_renamed_279(192));
        hashMap.put(sprsx.cfr_renamed_3, spruaf.cfr_renamed_279(256));
        hashMap.put(sprgp.cfr_renamed_4, spruaf.cfr_renamed_279(128));
        hashMap.put(sprgt.cfr_renamed_2, spruaf.cfr_renamed_279(64));
        hashMap.put(sprqo.cfr_renamed_132, spruaf.cfr_renamed_279(256));
        cfr_renamed_4 = Collections.unmodifiableMap(hashMap);
    }

    @Override
    public int cfr_renamed_7413(sprlem arg0) {
        Integer n = (Integer)cfr_renamed_4.get(arg0);
        if (n != null) {
            return n;
        }
        return -1;
    }

    @Override
    public int cfr_renamed_7385(sprddm arg0) {
        int n = this.cfr_renamed_7413(arg0.cfr_renamed_593());
        if (n > 0) {
            return n;
        }
        return -1;
    }
}

