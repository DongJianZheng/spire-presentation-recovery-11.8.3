/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprazd;
import com.spire.presentation.packages.sprbte;
import com.spire.presentation.packages.sprch;
import com.spire.presentation.packages.sprdqe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgi;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprivd;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprmsba;
import com.spire.presentation.packages.sprnue;
import com.spire.presentation.packages.sprswd;
import com.spire.presentation.packages.sprxne;
import com.spire.presentation.packages.sprxyd;
import com.spire.presentation.packages.sprype;
import com.spire.presentation.packages.spryud;
import com.spire.presentation.packages.spryxd;
import com.spire.presentation.packages.sprzqh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sprhqd {
    public static final sprhqd cfr_renamed_0 = new sprhqd();
    private static final Map cfr_renamed_1 = new HashMap();
    private static final Map cfr_renamed_2 = new HashMap();
    private static final Map cfr_renamed_3 = new HashMap();
    private static final Map cfr_renamed_4 = new HashMap();

    static {
        cfr_renamed_1.put(sprswd.cfr_renamed_86, spriwa.cfr_renamed_279(192));
        cfr_renamed_1.put(sprswd.cfr_renamed_102, spriwa.cfr_renamed_279(128));
        cfr_renamed_1.put(sprswd.cfr_renamed_1, spriwa.cfr_renamed_279(192));
        cfr_renamed_1.put(sprswd.cfr_renamed_2, spriwa.cfr_renamed_279(256));
        cfr_renamed_2.put(sprswd.cfr_renamed_86, sprmsba.cfr_renamed_9("-k:k-k"));
        cfr_renamed_2.put(sprswd.cfr_renamed_102, sprzqh.cfr_renamed_9("EiW"));
        cfr_renamed_2.put(sprswd.cfr_renamed_1, sprmsba.cfr_renamed_9("o,}"));
        cfr_renamed_2.put(sprswd.cfr_renamed_2, sprzqh.cfr_renamed_9("EiW"));
        cfr_renamed_3.put(sprswd.cfr_renamed_86, sprmsba.cfr_renamed_9("j,},j,\u0001*l*\u00019e*}\\~\bJ\rG\u0007I"));
        cfr_renamed_3.put(sprswd.cfr_renamed_102, sprzqh.cfr_renamed_9("mA\u007f+oFo+|OoW\u0019TM`HmBc"));
        cfr_renamed_3.put(sprswd.cfr_renamed_1, sprmsba.cfr_renamed_9("(k:\u0001*l*\u00019e*}\\~\bJ\rG\u0007I"));
        cfr_renamed_3.put(sprswd.cfr_renamed_2, sprzqh.cfr_renamed_9("mA\u007f+oFo+|OoW\u0019TM`HmBc"));
        cfr_renamed_4.put(sprswd.cfr_renamed_86, sprmsba.cfr_renamed_9("j,},j,c\bM"));
        cfr_renamed_4.put(sprswd.cfr_renamed_102, sprzqh.cfr_renamed_9("mA\u007fIMg"));
        cfr_renamed_4.put(sprswd.cfr_renamed_1, sprmsba.cfr_renamed_9("(k:c\bM"));
        cfr_renamed_4.put(sprswd.cfr_renamed_2, sprzqh.cfr_renamed_9("mA\u007fIMg"));
    }

    public static spryxd cfr_renamed_4157(sprere arg0, sprije arg1, sprch arg2) {
        return sprhqd.cfr_renamed_4158(arg0, arg1, arg2, null);
    }

    public int cfr_renamed_1595(String arg0) {
        Integer n = (Integer)cfr_renamed_1.get(arg0);
        if (n == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmsba.cfr_renamed_9("@\u0006\u000e\u0002K\u0010]\u0000T\f\u000e\u000fA\u001b\u000e")).append(arg0).toString());
        }
        return n;
    }

    private static /* synthetic */ void cfr_renamed_4159(List arg0, sprnue arg1, sprije arg2, sprch arg3, sprgi arg4) {
        spra spra2 = arg1.cfr_renamed_3365();
        if (spra2 instanceof sprbte) {
            arg0.add(new spryud((sprbte)spra2, arg2, arg3, arg4));
            return;
        }
        if (spra2 instanceof sprxne) {
            arg0.add(new sprxyd((sprxne)spra2, arg2, arg3, arg4));
            return;
        }
        if (spra2 instanceof sprype) {
            sprazd.cfr_renamed_4026(arg0, (sprype)spra2, arg2, arg3, arg4);
            return;
        }
        if (spra2 instanceof sprdqe) {
            arg0.add(new sprivd((sprdqe)spra2, arg2, arg3, arg4));
        }
    }

    public static spryxd cfr_renamed_4158(sprere arg0, sprije arg1, sprch arg2, sprgi arg3) {
        int n;
        ArrayList arrayList = new ArrayList();
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprnue sprnue2 = sprnue.cfr_renamed_23(arg0.cfr_renamed_85(n));
            sprhqd.cfr_renamed_4159(arrayList, sprnue2, arg1, arg2, arg3);
            n2 = ++n;
        }
        return new spryxd(arrayList);
    }
}

