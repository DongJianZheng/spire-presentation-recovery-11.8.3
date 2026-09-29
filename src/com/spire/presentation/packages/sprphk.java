/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjch;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprwr;
import java.util.HashMap;
import java.util.Map;

public class sprphk {
    private static final Map<Object, sprjch> cfr_renamed_4 = new HashMap<Object, sprjch>();

    static {
        cfr_renamed_4.put(sprwr.cfr_renamed_1226, sprjch.cfr_renamed_4);
        cfr_renamed_4.put(sprwr.cfr_renamed_112, sprjch.cfr_renamed_3);
    }

    public static sprjch cfr_renamed_9573(sprlem arg0) {
        return cfr_renamed_4.get(arg0);
    }
}

