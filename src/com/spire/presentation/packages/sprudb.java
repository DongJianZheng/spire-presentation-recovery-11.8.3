/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbeb;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprdib;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgcb;
import com.spire.presentation.packages.sprigb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjbb;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlbb;
import com.spire.presentation.packages.sprlib;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprqcb;
import com.spire.presentation.packages.sprsra;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprva;
import com.spire.presentation.packages.sprvdb;
import com.spire.presentation.packages.sprvya;
import com.spire.presentation.packages.spryhb;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprzhb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprudb
implements sprva {
    private static final Map cfr_renamed_3 = sprudb.cfr_renamed_1585();
    public static final sprva cfr_renamed_4 = new sprudb();

    private /* synthetic */ sprudb() {
    }

    private static /* synthetic */ Map cfr_renamed_1585() {
        HashMap<sprtzd, sprva> hashMap = new HashMap<sprtzd, sprva>();
        sprvdb sprvdb2 = hashMap.put(sprdh.cfr_renamed_86, new sprvdb());
        HashMap<sprtzd, sprva> hashMap2 = hashMap;
        hashMap.put(sprdg.spr\ufe34, new sprigb());
        hashMap2.put(sprdg.cfr_renamed_119, new sprqcb());
        hashMap.put(sprdg.cfr_renamed_112, new sprvya());
        hashMap.put(sprdg.cfr_renamed_107, new sprlib());
        hashMap.put(sprm.cfr_renamed_102, new sprjbb());
        hashMap.put(sprm.cfr_renamed_1479, new sprbeb());
        hashMap.put(sprm.cfr_renamed_1575, new sprzhb());
        hashMap.put(sprji.cfr_renamed_31, new sprgcb());
        hashMap.put(spryk.cfr_renamed_126, new sprdib());
        hashMap.put(spryk.cfr_renamed_91, new spryhb());
        hashMap.put(spryk.cfr_renamed_3, new sprlbb());
        return Collections.unmodifiableMap(hashMap2);
    }

    @Override
    public sprko cfr_renamed_578(sprije arg0) throws sprfya {
        sprva sprva2 = (sprva)cfr_renamed_3.get(arg0.cfr_renamed_593());
        if (sprva2 == null) {
            throw new sprfya(sprsra.cfr_renamed_9("\b\u0000\u0005\u000f\u0004\u0015K\u0013\u000e\u0002\u0004\u0006\u0005\b\u0018\u0004K\u0005\u0002\u0006\u000e\u0012\u001f"));
        }
        return sprva2.cfr_renamed_578(arg0);
    }
}

