/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprqjba;
import com.spire.presentation.packages.sprrdaa;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprwr;
import java.util.HashMap;
import java.util.Map;

public class sprljf {
    private static Map<String, sprlem> cfr_renamed_3 = new HashMap<String, sprlem>();
    private static Map<sprlem, String> cfr_renamed_4 = new HashMap<sprlem, String>();

    public static sprgf cfr_renamed_5654(sprlem arg0) {
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_1226)) {
            return new sprohl();
        }
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_272)) {
            return new sprocl();
        }
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_1)) {
            return new sprnil(128);
        }
        if (arg0.cfr_renamed_5078(sprwr.spr\ufe34)) {
            return new sprnil(256);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrdaa.cfr_renamed_9("~%y.h$l%b1n/+/b,n8\u007fkD\u0002Oq+")).append(arg0).toString());
    }

    static {
        cfr_renamed_3.put("SHA-256", sprwr.cfr_renamed_1226);
        cfr_renamed_3.put("SHA-512", sprwr.cfr_renamed_272);
        cfr_renamed_3.put("SHAKE128", sprwr.cfr_renamed_1);
        cfr_renamed_3.put("SHAKE256", sprwr.spr\ufe34);
        cfr_renamed_4.put(sprwr.cfr_renamed_1226, "SHA-256");
        cfr_renamed_4.put(sprwr.cfr_renamed_272, "SHA-512");
        cfr_renamed_4.put(sprwr.cfr_renamed_1, "SHAKE128");
        cfr_renamed_4.put(sprwr.spr\ufe34, "SHAKE256");
    }

    public static int cfr_renamed_5657(sprgf arg0) {
        if (arg0 instanceof sprud) {
            return arg0.cfr_renamed_1218() * 2;
        }
        return arg0.cfr_renamed_1218();
    }

    public static String cfr_renamed_5816(sprlem arg0) {
        String string = cfr_renamed_4.get(arg0);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqjba.cfr_renamed_9("P=W6F<B=L)@7\u00057L4@ QsJ:Ai\u0005")).append(arg0).toString());
    }

    public static sprlem cfr_renamed_5655(String arg0) {
        sprlem sprlem2 = cfr_renamed_3.get(arg0);
        if (sprlem2 != null) {
            return sprlem2;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrdaa.cfr_renamed_9(">e9n(d,e\"q.oko\"l.x?+%j&nq+")).append(arg0).toString());
    }
}

