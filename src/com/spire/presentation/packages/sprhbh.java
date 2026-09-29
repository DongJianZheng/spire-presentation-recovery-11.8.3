/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkyg;
import com.spire.presentation.packages.sprvxg;
import java.util.List;

public class sprhbh {
    private final List<Object> cfr_renamed_4;

    public List<Object> cfr_renamed_205() {
        return this.cfr_renamed_4;
    }

    public static sprvxg cfr_renamed_7843() {
        return new sprvxg();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = 4 << 3 ^ 3;
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

    public /* synthetic */ sprhbh(List arg0, sprkyg arg1) {
        this(arg0);
    }

    private /* synthetic */ sprhbh(List<Object> list) {
        this.cfr_renamed_4 = list;
    }
}

