/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgho;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmvr;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprwr;
import java.util.HashMap;
import java.util.Map;

public class sprmkg
implements sprcm {
    private static Map cfr_renamed_4 = new HashMap();

    @Override
    public sprddm cfr_renamed_1494(String arg0) {
        return (sprddm)cfr_renamed_4.get(sprkoe.cfr_renamed_116(arg0));
    }

    static {
        cfr_renamed_4.put("HMACSHA1", new sprddm(sprgt.cfr_renamed_0));
        cfr_renamed_4.put(sprmvr.cfr_renamed_9("^.W E+WQ$W"), new sprddm(sprdl.cfr_renamed_3240, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("HMACSHA256", new sprddm(sprdl.cfr_renamed_131, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("HMACSHA384", new sprddm(sprdl.cfr_renamed_1223, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("HMACSHA512", new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprgho.cfr_renamed_9("!Y(W:\\(!X&D&[ "), new sprddm(sprdl.cfr_renamed_129, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprmvr.cfr_renamed_9("^.W E+WV'Q;Q#U"), new sprddm(sprdl.cfr_renamed_123, sprpen.cfr_renamed_4));
        cfr_renamed_4.put(sprgho.cfr_renamed_9("!Y(W:\\('D&[ "), new sprddm(sprwr.cfr_renamed_105));
        cfr_renamed_4.put(sprmvr.cfr_renamed_9("^.W E+WP;Q#U"), new sprddm(sprwr.cfr_renamed_728));
        cfr_renamed_4.put(sprgho.cfr_renamed_9("!Y(W:\\('D'Q "), new sprddm(sprwr.cfr_renamed_145));
        cfr_renamed_4.put(sprmvr.cfr_renamed_9("^.W E+WP;V'Q"), new sprddm(sprwr.cfr_renamed_119));
    }
}

