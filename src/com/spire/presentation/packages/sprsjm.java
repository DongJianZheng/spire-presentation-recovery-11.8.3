/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprsjm {
    private int cfr_renamed_1;
    private char cfr_renamed_2;
    private String cfr_renamed_3;
    private StringBuffer cfr_renamed_4;

    public String cfr_renamed_4445() {
        int n;
        block10: {
            sprsjm sprsjm2;
            sprsjm sprsjm3 = this;
            if (sprsjm3.cfr_renamed_1 == sprsjm3.cfr_renamed_3.length()) {
                return null;
            }
            sprsjm sprsjm4 = this;
            n = sprsjm4.cfr_renamed_1 + 1;
            boolean bl = false;
            boolean bl2 = false;
            sprsjm4.cfr_renamed_4.setLength(0);
            int n2 = n;
            while (n2 != this.cfr_renamed_3.length()) {
                char c = this.cfr_renamed_3.charAt(n);
                if (c == '\"') {
                    if (!bl2) {
                        bl = !bl;
                    }
                    this.cfr_renamed_4.append(c);
                    bl2 = false;
                } else if (bl2 || bl) {
                    this.cfr_renamed_4.append(c);
                    bl2 = false;
                } else if (c == '\\') {
                    this.cfr_renamed_4.append(c);
                    bl2 = true;
                } else {
                    if (c == this.cfr_renamed_2) {
                        sprsjm2 = this;
                        break block10;
                    }
                    this.cfr_renamed_4.append(c);
                }
                n2 = ++n;
            }
            sprsjm2 = this;
        }
        sprsjm2.cfr_renamed_1 = n;
        return this.cfr_renamed_4.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprsjm(String string, char c) {
        void arg0;
        sprsjm sprsjm2 = this;
        sprsjm sprsjm3 = this;
        this.cfr_renamed_4 = new StringBuffer();
        this.cfr_renamed_3 = arg0;
        sprsjm2.cfr_renamed_1 = -1;
        sprsjm2.cfr_renamed_2 = c;
    }

    public boolean cfr_renamed_4444() {
        sprsjm sprsjm2 = this;
        return sprsjm2.cfr_renamed_1 != sprsjm2.cfr_renamed_3.length();
    }

    public sprsjm(String arg0) {
        this(arg0, ',');
    }
}

