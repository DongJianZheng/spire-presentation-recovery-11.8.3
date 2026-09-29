/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsd;
import com.spire.presentation.packages.sprqsd;

public class sprdtd {
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprdsd cfr_renamed_4251(int arg0) {
        sprdtd sprdtd2 = this;
        return new sprdsd(arg0, sprdtd2.cfr_renamed_4, sprdtd2.cfr_renamed_3, this.cfr_renamed_2);
    }

    public void cfr_renamed_4252(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_4253(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_4254(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprdsd cfr_renamed_4255(sprqsd arg0) {
        return this.cfr_renamed_4251(arg0.cfr_renamed_4256());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ 3;
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
}

