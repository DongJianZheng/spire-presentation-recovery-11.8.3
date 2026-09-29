/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprzgg
extends Exception {
    private Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public sprzgg(String arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzgg(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = 2 << 3 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4;
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

