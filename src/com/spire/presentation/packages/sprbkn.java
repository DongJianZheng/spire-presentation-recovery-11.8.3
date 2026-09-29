/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprbkn {
    @sprtea
    public static sprsuja[] cfr_renamed_14152(sprgdp arg0) {
        sprsuja[] sprsujaArray = new sprsuja[2];
        sprsujaArray[0] = arg0.cfr_renamed_13167();
        sprsujaArray[1] = arg0.cfr_renamed_13171();
        sprsuja[] sprsujaArray2 = sprsujaArray;
        switch (arg0.cfr_renamed_13337()) {
            default: 
        }
        return sprsujaArray2;
    }

    @sprtea
    public static sprdsp cfr_renamed_14162(sprdsp arg0) {
        int n;
        sprdsp sprdsp2 = new sprdsp();
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprdsp sprdsp3 = arg0;
            int n3 = sprdsp3.cfr_renamed_7861(n);
            int n4 = (Integer)sprdsp3.cfr_renamed_13485(n);
            if (!sprdsp2.cfr_renamed_14000(n4)) {
                sprdsp2.cfr_renamed_13414(n4, n3);
            }
            n2 = ++n;
        }
        return sprdsp2;
    }

    private /* synthetic */ sprbkn() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 3;
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

