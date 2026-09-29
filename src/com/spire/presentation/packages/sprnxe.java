/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqxe;

public class sprnxe
extends Exception {
    private sprqxe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnxe(String string, sprqxe sprqxe2) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = sprqxe2;
    }

    public sprqxe cfr_renamed_652() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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
}

