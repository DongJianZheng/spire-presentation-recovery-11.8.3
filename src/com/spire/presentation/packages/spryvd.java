/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class spryvd
extends Exception {
    private Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public spryvd(String arg0) {
        super(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        char c = '\u0001';
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n3 = n2;
        int n4 = 5 << 4 ^ (3 << 2 ^ 1);
        while (n3 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ n4);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ c);
            n3 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public spryvd(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}

