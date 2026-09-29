/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprwxo {
    public short cfr_renamed_2;
    public short cfr_renamed_3;
    public int cfr_renamed_4;

    public static sprwxo cfr_renamed_15088(sprmzo arg0) {
        sprwxo sprwxo2 = new sprwxo();
        sprmzo sprmzo2 = arg0;
        sprwxo2.cfr_renamed_4 = sprmzo2.cfr_renamed_13218();
        sprwxo2.cfr_renamed_2 = sprmzo2.cfr_renamed_12254();
        sprwxo2.cfr_renamed_3 = arg0.cfr_renamed_12254();
        return sprwxo2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 2 ^ 5;
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

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_18252(sprruo sprruo2) {
        void arg0;
        void v0 = arg0;
        sprwxo sprwxo2 = this;
        arg0.cfr_renamed_15085(sprwxo2.cfr_renamed_4 & 0xFFFF);
        v0.cfr_renamed_14639(sprwxo2.cfr_renamed_2);
        v0.cfr_renamed_14639(this.cfr_renamed_3);
    }
}

