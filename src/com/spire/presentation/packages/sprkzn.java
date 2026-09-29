/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzn;
import com.spire.presentation.packages.sprkun;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruvn;
import com.spire.presentation.packages.spruzn;
import com.spire.presentation.packages.sprzyn;

@sprtea
public class sprkzn {
    private sprfzn cfr_renamed_0;
    private sprkun cfr_renamed_1;
    private spruvn cfr_renamed_2;
    private sprzyn cfr_renamed_3;
    private spruzn cfr_renamed_4;

    @sprtea
    public spruzn cfr_renamed_2524() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprfzn cfr_renamed_14984() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public sprkun cfr_renamed_14991() {
        return this.cfr_renamed_1;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 5;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 5;
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 ^ 5) << 1;
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
    public spruvn cfr_renamed_14979() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public sprkzn(sprzyn arg0, spruvn arg1) {
        sprkzn sprkzn2 = this;
        sprkzn sprkzn3 = this;
        sprkzn3.cfr_renamed_3 = arg0;
        sprkzn3.cfr_renamed_2 = arg1;
        sprkzn sprkzn4 = this;
        sprkzn2.cfr_renamed_0 = new sprfzn(this);
        sprkzn4.cfr_renamed_1 = new sprkun(arg1.cfr_renamed_15122());
        sprkzn2.cfr_renamed_4 = new spruzn(this);
    }

    @sprtea
    public sprzyn cfr_renamed_13380() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public void cfr_renamed_13269(int arg0, String arg1) {
    }
}

