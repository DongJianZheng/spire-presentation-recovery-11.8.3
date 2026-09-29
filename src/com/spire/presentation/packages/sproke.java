/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sproke {
    private String cfr_renamed_1;
    private StringBuffer cfr_renamed_2;
    private char cfr_renamed_3;
    private int cfr_renamed_4;

    public boolean cfr_renamed_4444() {
        sproke sproke2 = this;
        return sproke2.cfr_renamed_4 != sproke2.cfr_renamed_1.length();
    }

    public sproke(String arg0) {
        this(arg0, ',');
    }

    public String cfr_renamed_4445() {
        int n;
        block10: {
            sproke sproke2;
            sproke sproke3 = this;
            if (sproke3.cfr_renamed_4 == sproke3.cfr_renamed_1.length()) {
                return null;
            }
            sproke sproke4 = this;
            n = sproke4.cfr_renamed_4 + 1;
            boolean bl = false;
            boolean bl2 = false;
            sproke4.cfr_renamed_2.setLength(0);
            int n2 = n;
            while (n2 != this.cfr_renamed_1.length()) {
                char c = this.cfr_renamed_1.charAt(n);
                if (c == '\"') {
                    if (!bl2) {
                        bl = !bl;
                    }
                    this.cfr_renamed_2.append(c);
                    bl2 = false;
                } else if (bl2 || bl) {
                    this.cfr_renamed_2.append(c);
                    bl2 = false;
                } else if (c == '\\') {
                    this.cfr_renamed_2.append(c);
                    bl2 = true;
                } else {
                    if (c == this.cfr_renamed_3) {
                        sproke2 = this;
                        break block10;
                    }
                    this.cfr_renamed_2.append(c);
                }
                n2 = ++n;
            }
            sproke2 = this;
        }
        sproke2.cfr_renamed_4 = n;
        return this.cfr_renamed_2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sproke(String string, char c) {
        void arg0;
        sproke sproke2 = this;
        sproke sproke3 = this;
        this.cfr_renamed_2 = new StringBuffer();
        this.cfr_renamed_1 = arg0;
        sproke2.cfr_renamed_4 = -1;
        sproke2.cfr_renamed_3 = c;
    }
}

