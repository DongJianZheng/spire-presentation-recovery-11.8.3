/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprqme {
    private String cfr_renamed_3;
    private String cfr_renamed_4;

    public int hashCode() {
        sprqme sprqme2 = this;
        sprqme sprqme3 = this;
        return sprqme2.cfr_renamed_490(sprqme2.cfr_renamed_3) + 31 * sprqme3.cfr_renamed_490(sprqme3.cfr_renamed_4);
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

    private /* synthetic */ boolean cfr_renamed_491(String arg0, String arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        return arg0.equals(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprqme(String string, String string2) {
        void arg0;
        sprqme sprqme2 = this;
        sprqme2.cfr_renamed_3 = arg0;
        sprqme2.cfr_renamed_4 = string2;
    }

    public boolean equals(Object arg0) {
        block5: {
            block4: {
                if (!(arg0 instanceof sprqme)) {
                    return false;
                }
                sprqme sprqme2 = (sprqme)arg0;
                if (sprqme2 == this) break block4;
                sprqme sprqme3 = this;
                if (!sprqme3.cfr_renamed_491(sprqme3.cfr_renamed_3, sprqme2.cfr_renamed_3)) break block5;
                sprqme sprqme4 = this;
                if (!sprqme4.cfr_renamed_491(sprqme4.cfr_renamed_4, sprqme2.cfr_renamed_4)) break block5;
            }
            return true;
        }
        return false;
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_3;
    }
}

