/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwn;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.spryce;

public class sprcoa {
    private spryce cfr_renamed_4;

    public int cfr_renamed_666() {
        sprcoa sprcoa2 = this;
        return sprcoa2.cfr_renamed_667(sprcoa2.cfr_renamed_4.cfr_renamed_666());
    }

    public String toString() {
        sprcoa sprcoa2 = this;
        sprcoa sprcoa3 = this;
        return this.cfr_renamed_668() + "." + sprcoa2.cfr_renamed_669(sprcoa2.cfr_renamed_670()) + sprcoa3.cfr_renamed_669(sprcoa3.cfr_renamed_666());
    }

    public sprcoa(spryce spryce2) {
        this.cfr_renamed_4 = spryce2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = 5 << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    private /* synthetic */ String cfr_renamed_669(int arg0) {
        if (arg0 < 10) {
            return new StringBuilder().insert(0, sprbwn.cfr_renamed_9("-=")).append(arg0).toString();
        }
        if (arg0 < 100) {
            return new StringBuilder().insert(0, "0").append(arg0).toString();
        }
        return Integer.toString(arg0);
    }

    public int cfr_renamed_668() {
        sprcoa sprcoa2 = this;
        return sprcoa2.cfr_renamed_667(sprcoa2.cfr_renamed_4.cfr_renamed_668());
    }

    public int cfr_renamed_670() {
        sprcoa sprcoa2 = this;
        return sprcoa2.cfr_renamed_667(sprcoa2.cfr_renamed_4.cfr_renamed_670());
    }

    private /* synthetic */ int cfr_renamed_667(sprooe arg0) {
        if (arg0 != null) {
            return arg0.cfr_renamed_97().intValue();
        }
        return 0;
    }
}

