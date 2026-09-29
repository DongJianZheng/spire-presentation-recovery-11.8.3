/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprshn {
    private sprktp cfr_renamed_4;

    public static void cfr_renamed_13809(sprshn arg0, sprktp arg1) {
        arg0.cfr_renamed_4 = arg1;
    }

    public void cfr_renamed_13605(sprsuja arg0) {
        int n = 4;
        if (this.cfr_renamed_4.cfr_renamed_12961() == 0) {
            this.cfr_renamed_4.cfr_renamed_12102(n * this.cfr_renamed_13606());
        }
        this.cfr_renamed_4.cfr_renamed_13516(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 4 ^ 5 << 1;
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

    public sprsuja cfr_renamed_13610(int arg0, int arg1) {
        return this.cfr_renamed_4.cfr_renamed_576(arg0 * this.cfr_renamed_13606() + arg1);
    }

    public abstract int cfr_renamed_13606();

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.cfr_renamed_11861() / this.cfr_renamed_13606();
    }

    public void cfr_renamed_13599(int arg0, int arg1, sprsuja arg2) {
        this.cfr_renamed_4.cfr_renamed_13597(arg0 * this.cfr_renamed_13606() + arg1, arg2);
    }

    public void cfr_renamed_722() {
        this.cfr_renamed_4.cfr_renamed_722();
    }

    public sprshn() {
        sprshn sprshn2 = this;
        sprshn2.cfr_renamed_4 = new sprktp();
    }

    /*
     * WARNING - void declaration
     */
    public sprshn(int n) {
        void arg0;
        sprshn sprshn2 = this;
        sprshn2.cfr_renamed_4 = new sprktp((int)(arg0 * this.cfr_renamed_13606()));
    }

    public static sprktp cfr_renamed_13810(sprshn arg0) {
        return arg0.cfr_renamed_4;
    }

    public static int cfr_renamed_13811(sprshn arg0) {
        return arg0.cfr_renamed_13606();
    }
}

