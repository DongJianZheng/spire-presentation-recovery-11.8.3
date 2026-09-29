/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprpzm {
    private String cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpzm(String string) {
        void arg0;
        sprpzm sprpzm2 = this;
        sprpzm2.cfr_renamed_3 = arg0;
        sprpzm2.cfr_renamed_4 = 0;
    }

    public String cfr_renamed_4445() {
        if (this.cfr_renamed_4 == -1) {
            return null;
        }
        int n = this.cfr_renamed_3.indexOf(46, this.cfr_renamed_4);
        if (n == -1) {
            String string = this.cfr_renamed_3.substring(this.cfr_renamed_4);
            this.cfr_renamed_4 = -1;
            return string;
        }
        sprpzm sprpzm2 = this;
        String string = sprpzm2.cfr_renamed_3.substring(sprpzm2.cfr_renamed_4, n);
        sprpzm2.cfr_renamed_4 = n + 1;
        return string;
    }

    public boolean cfr_renamed_4444() {
        return this.cfr_renamed_4 != -1;
    }
}

