/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprgoa {
    private String cfr_renamed_3;
    private String cfr_renamed_4;

    public int hashCode() {
        sprgoa sprgoa2 = this;
        sprgoa sprgoa3 = this;
        return sprgoa2.cfr_renamed_490(sprgoa2.cfr_renamed_3) + 31 * sprgoa3.cfr_renamed_490(sprgoa3.cfr_renamed_4);
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ boolean cfr_renamed_491(String arg0, String arg1) {
        if (arg0 == null && arg1 == null) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        return arg0.equals(arg1);
    }

    public boolean equals(Object arg0) {
        block5: {
            block4: {
                if (!(arg0 instanceof sprgoa)) {
                    return false;
                }
                sprgoa sprgoa2 = (sprgoa)arg0;
                if (sprgoa2 == this) break block4;
                sprgoa sprgoa3 = this;
                if (!sprgoa3.cfr_renamed_491(sprgoa3.cfr_renamed_3, sprgoa2.cfr_renamed_3)) break block5;
                sprgoa sprgoa4 = this;
                if (!sprgoa4.cfr_renamed_491(sprgoa4.cfr_renamed_4, sprgoa2.cfr_renamed_4)) break block5;
            }
            return true;
        }
        return false;
    }

    public String cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ int cfr_renamed_490(String arg0) {
        if (arg0 == null) {
            return 1;
        }
        return arg0.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprgoa(String string, String string2) {
        void arg0;
        sprgoa sprgoa2 = this;
        sprgoa2.cfr_renamed_3 = arg0;
        sprgoa2.cfr_renamed_4 = string2;
    }
}

