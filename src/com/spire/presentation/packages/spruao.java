/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;

@sprtea
public abstract class spruao {
    private static final String cfr_renamed_3 = "/DecodeParms";
    private static final String cfr_renamed_4 = "/Filter";

    @sprtea
    public void cfr_renamed_14404(spryjn arg0) {
        spruao spruao2 = this;
        arg0.cfr_renamed_14057(cfr_renamed_4, spruao2.cfr_renamed_14083());
        String string = spruao2.cfr_renamed_14084();
        if (sprznp.cfr_renamed_12328(string)) {
            spryjn spryjn2 = arg0;
            spryjn2.cfr_renamed_11835(cfr_renamed_3);
            spryjn2.cfr_renamed_11735(string);
        }
    }

    @sprtea
    public abstract String cfr_renamed_14084();

    @sprtea
    public abstract String cfr_renamed_14083();

    @sprtea
    public abstract spreen cfr_renamed_14115(spreen var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 5;
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

