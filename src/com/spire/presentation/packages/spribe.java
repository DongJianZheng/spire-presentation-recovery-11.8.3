/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class spribe {
    private char cfr_renamed_1;
    private int cfr_renamed_2;
    private StringBuffer cfr_renamed_3;
    private String cfr_renamed_4;

    public spribe(String arg0) {
        this(arg0, ',');
    }

    public String cfr_renamed_4445() {
        int n;
        block10: {
            spribe spribe2;
            spribe spribe3 = this;
            if (spribe3.cfr_renamed_2 == spribe3.cfr_renamed_4.length()) {
                return null;
            }
            spribe spribe4 = this;
            n = spribe4.cfr_renamed_2 + 1;
            boolean bl = false;
            boolean bl2 = false;
            spribe4.cfr_renamed_3.setLength(0);
            int n2 = n;
            while (n2 != this.cfr_renamed_4.length()) {
                char c = this.cfr_renamed_4.charAt(n);
                if (c == '\"') {
                    if (!bl2) {
                        bl = !bl;
                    }
                    this.cfr_renamed_3.append(c);
                    bl2 = false;
                } else if (bl2 || bl) {
                    this.cfr_renamed_3.append(c);
                    bl2 = false;
                } else if (c == '\\') {
                    this.cfr_renamed_3.append(c);
                    bl2 = true;
                } else {
                    if (c == this.cfr_renamed_1) {
                        spribe2 = this;
                        break block10;
                    }
                    this.cfr_renamed_3.append(c);
                }
                n2 = ++n;
            }
            spribe2 = this;
        }
        spribe2.cfr_renamed_2 = n;
        return this.cfr_renamed_3.toString();
    }

    public boolean cfr_renamed_4444() {
        spribe spribe2 = this;
        return spribe2.cfr_renamed_2 != spribe2.cfr_renamed_4.length();
    }

    /*
     * WARNING - void declaration
     */
    public spribe(String string, char c) {
        void arg0;
        spribe spribe2 = this;
        spribe spribe3 = this;
        this.cfr_renamed_3 = new StringBuffer();
        this.cfr_renamed_4 = arg0;
        spribe2.cfr_renamed_2 = -1;
        spribe2.cfr_renamed_1 = c;
    }
}

