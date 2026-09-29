/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbvk;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprgng;
import com.spire.presentation.packages.sprgrk;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpzk;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvro;
import com.spire.presentation.packages.sprwwk;
import com.spire.presentation.packages.sprxhl;
import com.spire.presentation.packages.sprxyk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprbhg {
    private static Set cfr_renamed_2;
    private static Map cfr_renamed_3;
    private static Set cfr_renamed_4;

    public static int cfr_renamed_7413(sprlem arg0) {
        return (Integer)cfr_renamed_3.get(arg0);
    }

    public static boolean cfr_renamed_7414(sprlem arg0) {
        return cfr_renamed_4.contains(arg0);
    }

    public static sprgrk cfr_renamed_7415(sprlem arg0) {
        sprmr sprmr2;
        if (arg0.cfr_renamed_5078(sprdl.cfr_renamed_954) || arg0.cfr_renamed_5078(sprdl.cfr_renamed_805)) {
            sprmr2 = new sprxhl();
        } else if (arg0.cfr_renamed_5078(sprdl.cfr_renamed_1260) || arg0.cfr_renamed_5078(sprdl.cfr_renamed_2)) {
            sprmr2 = new sprpzk();
        } else {
            throw new IllegalStateException(sprvro.cfr_renamed_9("8,&,\"5#b,.*-?+9* "));
        }
        return new sprgrk(new sprhqk(sprmr2), new sprxyk());
    }

    public static sprbj cfr_renamed_7416(sprlem arg0, sprpl arg1, int arg2, sprqrm arg3, char[] arg4) {
        sprbvk sprbvk2 = new sprbvk(arg1);
        sprbvk2.cfr_renamed_1515(sprbvk.cfr_renamed_1516(arg4), arg3.cfr_renamed_1205(), arg3.cfr_renamed_1490().intValue());
        if (sprbhg.cfr_renamed_7414(arg0)) {
            sprbj sprbj2 = sprbvk2.cfr_renamed_249(sprbhg.cfr_renamed_7413(arg0));
            return sprbj2;
        }
        sprbj sprbj3 = sprbvk2.cfr_renamed_1518(sprbhg.cfr_renamed_7413(arg0), arg2 * 8);
        if (sprbhg.cfr_renamed_7417(arg0)) {
            sprwwk.cfr_renamed_1520(((sprtpk)((sprkpk)sprbj3).cfr_renamed_284()).cfr_renamed_1521());
        }
        return sprbj3;
    }

    static {
        cfr_renamed_3 = new HashMap();
        cfr_renamed_4 = new HashSet();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_3.put(sprdl.cfr_renamed_272, spruaf.cfr_renamed_279(128));
        cfr_renamed_3.put(sprdl.cfr_renamed_1454, spruaf.cfr_renamed_279(40));
        cfr_renamed_3.put(sprdl.cfr_renamed_954, spruaf.cfr_renamed_279(192));
        cfr_renamed_3.put(sprdl.cfr_renamed_805, spruaf.cfr_renamed_279(128));
        cfr_renamed_3.put(sprdl.cfr_renamed_1260, spruaf.cfr_renamed_279(128));
        cfr_renamed_3.put(sprdl.cfr_renamed_2, spruaf.cfr_renamed_279(40));
        cfr_renamed_4.add(sprdl.cfr_renamed_272);
        cfr_renamed_4.add(sprdl.cfr_renamed_1454);
        cfr_renamed_2.add(sprdl.cfr_renamed_805);
        cfr_renamed_2.add(sprdl.cfr_renamed_954);
    }

    public static boolean cfr_renamed_7417(sprlem arg0) {
        return cfr_renamed_2.contains(arg0);
    }

    public static sprsf cfr_renamed_7418(sprlem arg0, sprpl arg1, sprqrm arg2, char[] arg3) {
        sprbvk sprbvk2;
        sprbvk sprbvk3 = sprbvk2 = new sprbvk(arg1);
        sprbvk3.cfr_renamed_1515(sprbvk.cfr_renamed_1516(arg3), arg2.cfr_renamed_1205(), arg2.cfr_renamed_1490().intValue());
        sprtpk sprtpk2 = (sprtpk)sprbvk3.cfr_renamed_1523(arg1.cfr_renamed_1218() * 8);
        sprfwk sprfwk2 = new sprfwk(arg1);
        sprfwk2.cfr_renamed_5692(sprtpk2);
        return new sprgng(arg0, arg2, sprfwk2, arg3);
    }
}

