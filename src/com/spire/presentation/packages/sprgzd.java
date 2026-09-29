/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprn;
import com.spire.presentation.packages.sprswd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprzra;
import java.util.HashMap;
import java.util.Map;

public class sprgzd
extends sprswd {
    public sprn cfr_renamed_3;
    public sprn cfr_renamed_4;

    public void cfr_renamed_4192(sprn arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public Map cfr_renamed_3989(sprtzd arg0, sprije arg1, byte[] arg2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        sprtzd sprtzd2 = hashMap.put("contentType", arg0);
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap.put("digestAlgID", arg1);
        hashMap2.put("digest", sprzra.cfr_renamed_158(arg2));
        return hashMap2;
    }

    public void cfr_renamed_4193(sprn arg0) {
        this.cfr_renamed_3 = arg0;
    }
}

