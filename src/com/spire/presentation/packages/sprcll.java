/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

public class sprcll
extends Permission {
    public static final String cfr_renamed_0 = "globalConfig";
    private final Set<String> cfr_renamed_1 = new HashSet<String>();
    public static final String cfr_renamed_2 = "threadLocalConfig";
    public static final String cfr_renamed_3 = "defaultRandomConfig";
    public static final String cfr_renamed_4 = "constraints";

    /*
     * WARNING - void declaration
     */
    public sprcll(String string) {
        super(string);
        void arg0;
        this.cfr_renamed_1.add((String)arg0);
    }

    @Override
    public String getActions() {
        return this.cfr_renamed_1.toString();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 4 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 instanceof sprcll) {
            sprcll sprcll2 = (sprcll)arg0;
            if (((Object)this.cfr_renamed_1).equals(sprcll2.cfr_renamed_1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean implies(Permission arg0) {
        if (arg0 instanceof sprcll) {
            sprcll sprcll2 = (sprcll)arg0;
            if (this.getName().equals(sprcll2.getName())) {
                return true;
            }
            if (this.cfr_renamed_1.containsAll(sprcll2.cfr_renamed_1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((Object)this.cfr_renamed_1).hashCode();
    }
}

