/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprljn {
    private sprphja cfr_renamed_3;
    private sprgeja cfr_renamed_4;

    public sprphja cfr_renamed_13471() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprljn(sprgeja sprgeja2, sprphja sprphja2) {
        void arg0;
        sprljn sprljn2 = this;
        sprljn2.cfr_renamed_4 = arg0;
        sprljn2.cfr_renamed_3 = sprphja2;
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_4.cfr_renamed_29();
    }

    public sprgeja cfr_renamed_13296() {
        float f = this.cfr_renamed_3.cfr_renamed_1452() - this.cfr_renamed_13550().cfr_renamed_13429();
        return new sprgeja(this.cfr_renamed_4.cfr_renamed_1980(), f, this.cfr_renamed_4.cfr_renamed_1942(), this.cfr_renamed_4.cfr_renamed_1452());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3;
        int cfr_ignored_0 = 4 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4;
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

    public sprgeja cfr_renamed_13550() {
        return this.cfr_renamed_4;
    }
}

