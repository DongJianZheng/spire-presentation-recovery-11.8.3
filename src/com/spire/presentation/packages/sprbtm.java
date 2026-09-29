/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.util.Hashtable;

public class sprbtm
extends Hashtable {
    private static final long cfr_renamed_3 = -7457289971962812909L;
    public Hashtable cfr_renamed_4;

    public Object cfr_renamed_4735(Object arg0) {
        return this.cfr_renamed_4.get(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Object put(Object object, Object object2) {
        void arg0;
        void arg1;
        sprbtm sprbtm2 = this;
        sprbtm2.cfr_renamed_4.put(arg1, arg0);
        return super.put(object, arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 2 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
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

    public sprbtm() {
        sprbtm sprbtm2 = this;
        sprbtm2.cfr_renamed_4 = new Hashtable();
    }
}

