/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class spriwk {
    private long cfr_renamed_1;
    private int cfr_renamed_2;
    private long cfr_renamed_3;
    private int cfr_renamed_4;

    public int hashCode() {
        spriwk spriwk2 = this;
        return spriwk2.cfr_renamed_4 ^ spriwk2.cfr_renamed_2 ^ (int)this.cfr_renamed_1 ^ (int)(this.cfr_renamed_1 >> 32) ^ (int)this.cfr_renamed_3 ^ (int)(this.cfr_renamed_3 >> 32);
    }

    /*
     * WARNING - void declaration
     */
    public spriwk(int n, int n2) {
        void arg0;
        spriwk spriwk2 = this;
        spriwk2.cfr_renamed_4 = arg0;
        spriwk2.cfr_renamed_2 = n2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof spriwk)) {
            return false;
        }
        spriwk spriwk2 = (spriwk)arg0;
        if (spriwk2.cfr_renamed_2 != this.cfr_renamed_2) {
            return false;
        }
        if (spriwk2.cfr_renamed_4 != this.cfr_renamed_4) {
            return false;
        }
        if (spriwk2.cfr_renamed_3 != this.cfr_renamed_3) {
            return false;
        }
        return spriwk2.cfr_renamed_1 == this.cfr_renamed_1;
    }

    public int cfr_renamed_3367() {
        return this.cfr_renamed_4;
    }

    public long cfr_renamed_3368() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3369() {
        return this.cfr_renamed_2;
    }

    public long cfr_renamed_3370() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public spriwk(long l, long l2) {
        void arg0;
        spriwk spriwk2 = this;
        spriwk2.cfr_renamed_1 = arg0;
        spriwk2.cfr_renamed_3 = l2;
    }
}

