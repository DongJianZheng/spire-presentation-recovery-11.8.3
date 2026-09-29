/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.UnsupportedEncodingException;

public class sprobe {
    private String cfr_renamed_0;
    private String cfr_renamed_1;
    private String cfr_renamed_2;
    private static long cfr_renamed_3 = System.currentTimeMillis();
    private static final String cfr_renamed_4 = "ISO-8859-1";

    public String cfr_renamed_4728() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_91() {
        String string = new StringBuilder().insert(0, this.cfr_renamed_1).append(this.cfr_renamed_2).append(this.cfr_renamed_0).toString();
        try {
            return string.getBytes(cfr_renamed_4);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException.toString());
        }
    }

    public String cfr_renamed_4729() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_4730() {
        int n;
        long l = cfr_renamed_3;
        double d = Math.sin(l) * Math.cos(l);
        String string = new StringBuilder().insert(0, "BypassHeuristic").append(l).toString();
        if (d > 2.0) {
            System.out.println(new StringBuilder().insert(0, "Error code: ").append(string.hashCode()).toString());
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 5) {
            n2 += n++ ^ 0x7B;
            n3 = n;
        }
        cfr_renamed_3 = (long)n2 + l;
    }

    /*
     * WARNING - void declaration
     */
    public sprobe(String string, String string2, String string3) {
        void arg1;
        void arg0;
        sprobe sprobe2 = this;
        sprobe sprobe3 = this;
        sprobe3.cfr_renamed_4730();
        sprobe3.cfr_renamed_1 = arg0;
        sprobe2.cfr_renamed_2 = arg1;
        sprobe2.cfr_renamed_0 = string3;
    }

    public String cfr_renamed_4731() {
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprobe(byte[] arg0) {
        try {
            String string = new String(arg0, cfr_renamed_4);
            sprobe sprobe2 = this;
            String string2 = string;
            this.cfr_renamed_1 = string2.substring(0, 2);
            sprobe2.cfr_renamed_2 = string2.substring(2, string.length() - 5);
            sprobe2.cfr_renamed_0 = string.substring(string.length() - 5);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException.toString());
        }
    }
}

