/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprjfd {
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjfd(long l, long l2) {
        void arg0;
        sprjfd sprjfd2 = this;
        sprjfd2.cfr_renamed_4 = arg0;
        sprjfd2.cfr_renamed_3 = l2;
    }

    public int cfr_renamed_3367() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprjfd(int n, int n2) {
        void arg0;
        sprjfd sprjfd2 = this;
        sprjfd2.cfr_renamed_1 = arg0;
        sprjfd2.cfr_renamed_2 = n2;
    }

    public int hashCode() {
        sprjfd sprjfd2 = this;
        return sprjfd2.cfr_renamed_1 ^ sprjfd2.cfr_renamed_2 ^ (int)this.cfr_renamed_4 ^ (int)(this.cfr_renamed_4 >> 32) ^ (int)this.cfr_renamed_3 ^ (int)(this.cfr_renamed_3 >> 32);
    }

    public long cfr_renamed_3368() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3369() {
        return this.cfr_renamed_2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 3 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public long cfr_renamed_3370() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprjfd)) {
            return false;
        }
        sprjfd sprjfd2 = (sprjfd)arg0;
        if (sprjfd2.cfr_renamed_2 != this.cfr_renamed_2) {
            return false;
        }
        if (sprjfd2.cfr_renamed_1 != this.cfr_renamed_1) {
            return false;
        }
        if (sprjfd2.cfr_renamed_3 != this.cfr_renamed_3) {
            return false;
        }
        return sprjfd2.cfr_renamed_4 == this.cfr_renamed_4;
    }
}

