/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprkue {
    private String cfr_renamed_3;
    private int cfr_renamed_4;

    public boolean cfr_renamed_4444() {
        return this.cfr_renamed_4 != -1;
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
        sprkue sprkue2 = this;
        String string = sprkue2.cfr_renamed_3.substring(sprkue2.cfr_renamed_4, n);
        sprkue2.cfr_renamed_4 = n + 1;
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprkue(String string) {
        void arg0;
        sprkue sprkue2 = this;
        sprkue2.cfr_renamed_3 = arg0;
        sprkue2.cfr_renamed_4 = 0;
    }
}

