/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprnvg;
import com.spire.presentation.packages.sprqbm;
import com.spire.presentation.packages.sprqcm;
import java.util.ArrayList;
import java.util.List;

public class sprdyg {
    private List cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 1 << 1;
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

    public sprnvg cfr_renamed_31() {
        sprdyg sprdyg2 = this;
        return new sprnvg(sprdyg2.cfr_renamed_4.toArray(new sprqbm[sprdyg2.cfr_renamed_4.size()]));
    }

    public sprdyg() {
        sprdyg sprdyg2 = this;
        sprdyg2.cfr_renamed_4 = new ArrayList();
    }

    public void cfr_renamed_7561(int arg0, byte[] arg1) {
        if (arg1 == null) {
            throw new IllegalArgumentException(sprign.cfr_renamed_9("(P=A$T=\u0004=KiW,PiJ<H%\u0004 I(C,"));
        }
        this.cfr_renamed_4.add(new sprqcm(arg0, arg1));
    }
}

