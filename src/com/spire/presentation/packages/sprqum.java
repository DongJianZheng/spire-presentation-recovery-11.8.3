/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.UnsupportedEncodingException;

public class sprqum {
    private String cfr_renamed_1;
    private String cfr_renamed_2;
    private static final String cfr_renamed_3 = "ISO-8859-1";
    private String cfr_renamed_4;

    public String cfr_renamed_4731() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqum(byte[] arg0) {
        try {
            String string = new String(arg0, cfr_renamed_3);
            sprqum sprqum2 = this;
            String string2 = string;
            this.cfr_renamed_1 = string2.substring(0, 2);
            sprqum2.cfr_renamed_2 = string2.substring(2, string.length() - 5);
            sprqum2.cfr_renamed_4 = string.substring(string.length() - 5);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_91() {
        String string = new StringBuilder().insert(0, this.cfr_renamed_1).append(this.cfr_renamed_2).append(this.cfr_renamed_4).toString();
        try {
            return string.getBytes(cfr_renamed_3);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException.toString());
        }
    }

    public String cfr_renamed_4729() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprqum(String string, String string2, String string3) {
        void arg1;
        void arg0;
        sprqum sprqum2 = this;
        this.cfr_renamed_1 = arg0;
        sprqum2.cfr_renamed_2 = arg1;
        sprqum2.cfr_renamed_4 = string3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 4 << 1;
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

    public String cfr_renamed_4728() {
        return this.cfr_renamed_2;
    }
}

