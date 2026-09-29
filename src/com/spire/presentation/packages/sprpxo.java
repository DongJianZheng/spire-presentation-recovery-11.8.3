/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprpxo {
    public static final int cfr_renamed_1 = 65536;
    public int cfr_renamed_2;
    public static final int cfr_renamed_3 = 0x4F54544F;
    public int cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 2 << 1;
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n4 = n2;
        int n5 = 3 << 3;
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

    public boolean cfr_renamed_1974() {
        return (this.cfr_renamed_2 == 65536 || this.cfr_renamed_2 == 0x4F54544F) && (this.cfr_renamed_4 & 0xFFFF) > 0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_18252(sprruo sprruo2) {
        int n;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_12761(this.cfr_renamed_2);
        v0.cfr_renamed_15085(this.cfr_renamed_4 & 0xFFFF);
        int n2 = 0;
        int n3 = n = 1;
        while ((n3 & 0xFFFF) < (this.cfr_renamed_4 & 0xFFFF) >> 1) {
            ++n2;
            n3 = n << 1;
        }
        void v2 = arg0;
        arg0.cfr_renamed_15085((n <<= 4) & 0xFFFF);
        v2.cfr_renamed_15085(n2 & 0xFFFF);
        v2.cfr_renamed_15085((this.cfr_renamed_4 & 0xFFFF) * 16 - (n & 0xFFFF) & 0xFFFF);
    }

    public static sprpxo cfr_renamed_15088(sprmzo arg0) {
        sprpxo sprpxo2 = new sprpxo();
        sprmzo sprmzo2 = arg0;
        sprpxo2.cfr_renamed_2 = sprmzo2.cfr_renamed_12261();
        sprpxo2.cfr_renamed_4 = sprmzo2.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        return sprpxo2;
    }
}

