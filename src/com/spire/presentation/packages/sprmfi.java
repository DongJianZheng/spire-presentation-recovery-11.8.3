/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.AlgorithmParameters;
import java.security.spec.AlgorithmParameterSpec;

public class sprmfi {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AlgorithmParameterSpec cfr_renamed_9238(AlgorithmParameters arg0, Class[] arg1) {
        try {
            return arg0.getParameterSpec(AlgorithmParameterSpec.class);
        }
        catch (Exception exception) {
            int n;
            int n2 = n = 0;
            while (true) {
                if (n2 == arg1.length) {
                    return null;
                }
                if (arg1[n] != null) {
                    try {
                        return arg0.getParameterSpec(arg1[n]);
                    }
                    catch (Exception exception2) {
                        // empty catch block
                    }
                }
                n2 = ++n;
            }
        }
    }
}

