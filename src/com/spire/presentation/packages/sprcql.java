/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtpl;
import java.util.HashSet;
import java.util.Set;

public class sprcql {
    public static Set cfr_renamed_10904(sprtpl[] arg0) {
        int n;
        HashSet hashSet = new HashSet();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            hashSet.addAll(arg0[n++].cfr_renamed_662());
            n2 = n;
        }
        return hashSet;
    }
}

