/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprkcp;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprwr;
import java.util.HashMap;
import java.util.Map;

public class sprieg {
    private static Map<String, sprlem> cfr_renamed_3 = new HashMap<String, sprlem>();
    private static Map<sprlem, String> cfr_renamed_4 = new HashMap<sprlem, String>();

    private static /* synthetic */ sprgf cfr_renamed_6520(sprlem arg0) {
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
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_2)) {
            return new sprnil(256);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprkcp.cfr_renamed_9("\u0012\u0004\u0015\u000f\u0004\u0005\u0000\u0004\u000e\u0010\u0002\u000eG\u000e\u000e\r\u0002\u0019\u0013J(##PG")).append(arg0).toString());
    }

    public static sprgf cfr_renamed_6447(sprsuf arg0) {
        return sprieg.cfr_renamed_6521(arg0.cfr_renamed_6492(), arg0.cfr_renamed_1146());
    }

    public static sprgf cfr_renamed_6485(sprgzf arg0) {
        return sprieg.cfr_renamed_6521(arg0.cfr_renamed_6492(), arg0.cfr_renamed_1186());
    }

    private static /* synthetic */ sprgf cfr_renamed_6521(sprlem arg0, int arg1) {
        sprlem sprlem2 = arg0;
        sprgf sprgf2 = sprieg.cfr_renamed_6520(sprlem2);
        if (sprlem2.cfr_renamed_5078(sprwr.cfr_renamed_2)) {
            return new sprabg(sprgf2, arg1);
        }
        if (arg1 == 24) {
            return new sprabg(sprgf2, arg1);
        }
        return sprgf2;
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
}

