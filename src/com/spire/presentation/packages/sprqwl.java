/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprupl;
import com.spire.presentation.packages.sprzrl;

public class sprqwl {
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprzrl cfr_renamed_4251(int arg0) {
        sprqwl sprqwl2 = this;
        return new sprzrl(arg0, sprqwl2.cfr_renamed_2, sprqwl2.cfr_renamed_4, this.cfr_renamed_3);
    }

    public sprzrl cfr_renamed_10896(sprupl arg0) {
        return this.cfr_renamed_4251(arg0.cfr_renamed_4256());
    }

    public void cfr_renamed_4252(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 2 << 3 ^ 3;
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

    public void cfr_renamed_4254(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_4253(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }
}

