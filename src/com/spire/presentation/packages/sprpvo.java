/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprpvo {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = 1 << 3 ^ 3;
        int n4 = n2;
        int n5 = 4 << 3;
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

    @sprtea
    public static sprsuja[] cfr_renamed_14152(sprgdp arg0) {
        float f;
        sprgdp sprgdp2 = arg0;
        float f2 = sprgdp2.cfr_renamed_12644().cfr_renamed_13430();
        float f3 = sprgdp2.cfr_renamed_12644().cfr_renamed_13341();
        float f4 = f = (sprgdp2.cfr_renamed_12644().cfr_renamed_13429() - arg0.cfr_renamed_12644().cfr_renamed_13342()) / 2.0f;
        sprsuja[] sprsujaArray = new sprsuja[2];
        sprsujaArray[0] = new sprsuja(f2, f);
        sprsujaArray[1] = new sprsuja(f3, f4);
        sprsuja[] sprsujaArray2 = sprsujaArray;
        switch (arg0.cfr_renamed_13337()) {
            default: 
        }
        return sprsujaArray2;
    }

    private /* synthetic */ sprpvo() {
    }

    @sprtea
    public static sprdsp cfr_renamed_17122(sprdsp arg0, sprdsp arg1) {
        int n;
        int n2;
        int n3;
        sprdsp sprdsp2 = new sprdsp();
        int n4 = n3 = 0;
        while (n4 < arg0.cfr_renamed_11861()) {
            sprdsp sprdsp3 = arg0;
            n2 = sprdsp3.cfr_renamed_7861(n3);
            n = (Integer)sprdsp3.cfr_renamed_13485(n3);
            if (!sprdsp2.cfr_renamed_14000(n)) {
                sprdsp2.cfr_renamed_13414(n, n2);
            }
            n4 = ++n3;
        }
        int n5 = n3 = 0;
        while (n5 < arg1.cfr_renamed_11861()) {
            sprdsp sprdsp4 = arg1;
            n2 = sprdsp4.cfr_renamed_7861(n3);
            n = (Integer)sprdsp4.cfr_renamed_13485(n3);
            if (!sprdsp2.cfr_renamed_14000(n)) {
                sprdsp2.cfr_renamed_13414(n, n2);
            }
            n5 = ++n3;
        }
        return sprdsp2;
    }
}

