/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprgjm {
    private StringBuffer cfr_renamed_1;
    private int cfr_renamed_2;
    private char cfr_renamed_3;
    private String cfr_renamed_4;

    public boolean cfr_renamed_4444() {
        sprgjm sprgjm2 = this;
        return sprgjm2.cfr_renamed_2 != sprgjm2.cfr_renamed_4.length();
    }

    public sprgjm(String arg0) {
        this(arg0, ',');
    }

    /*
     * WARNING - void declaration
     */
    public sprgjm(String string, char c) {
        void arg0;
        sprgjm sprgjm2 = this;
        sprgjm sprgjm3 = this;
        this.cfr_renamed_1 = new StringBuffer();
        this.cfr_renamed_4 = arg0;
        sprgjm2.cfr_renamed_2 = -1;
        sprgjm2.cfr_renamed_3 = c;
    }

    public String cfr_renamed_4445() {
        int n;
        block10: {
            sprgjm sprgjm2;
            sprgjm sprgjm3 = this;
            if (sprgjm3.cfr_renamed_2 == sprgjm3.cfr_renamed_4.length()) {
                return null;
            }
            sprgjm sprgjm4 = this;
            n = sprgjm4.cfr_renamed_2 + 1;
            boolean bl = false;
            boolean bl2 = false;
            sprgjm4.cfr_renamed_1.setLength(0);
            int n2 = n;
            while (n2 != this.cfr_renamed_4.length()) {
                char c = this.cfr_renamed_4.charAt(n);
                if (c == '\"') {
                    if (!bl2) {
                        bl = !bl;
                    }
                    this.cfr_renamed_1.append(c);
                    bl2 = false;
                } else if (bl2 || bl) {
                    this.cfr_renamed_1.append(c);
                    bl2 = false;
                } else if (c == '\\') {
                    this.cfr_renamed_1.append(c);
                    bl2 = true;
                } else {
                    if (c == this.cfr_renamed_3) {
                        sprgjm2 = this;
                        break block10;
                    }
                    this.cfr_renamed_1.append(c);
                }
                n2 = ++n;
            }
            sprgjm2 = this;
        }
        sprgjm2.cfr_renamed_2 = n;
        return this.cfr_renamed_1.toString();
    }
}

