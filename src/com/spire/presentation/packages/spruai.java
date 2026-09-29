/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhzh;
import java.security.PrivateKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class spruai {
    public static sprhzh cfr_renamed_9190(PrivateKey arg0, Map<String, Object> arg1) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>(arg1);
        return new sprhzh(arg0, Collections.unmodifiableMap(hashMap));
    }

    public static sprhzh cfr_renamed_9191(PrivateKey arg0, String arg1) {
        return new sprhzh(arg0, arg1);
    }
}

