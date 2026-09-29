/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruol;
import java.util.HashMap;
import java.util.Map;

public class sprgpl
extends spruol {
    public sprak cfr_renamed_3;
    public sprak cfr_renamed_4;

    public void cfr_renamed_10823(sprak arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_10822(sprak arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public Map cfr_renamed_10657(sprlem arg0, sprddm arg1, sprddm arg2, byte[] arg3) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        sprlem sprlem2 = hashMap.put("contentType", arg0);
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap.put("digestAlgID", arg1);
        hashMap2.put("digest", sproze.cfr_renamed_158(arg3));
        hashMap.put("macAlgID", arg2);
        return hashMap2;
    }
}

