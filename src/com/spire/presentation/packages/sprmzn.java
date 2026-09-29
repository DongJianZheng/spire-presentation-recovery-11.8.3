/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnwn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzyn;

@sprtea
public class sprmzn {
    private sprzyn cfr_renamed_4;

    private /* synthetic */ sprzyn cfr_renamed_13380() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = 1 << 3 ^ 4;
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
    public void cfr_renamed_15035(sprson arg0) {
        sprnwn sprnwn2 = new sprnwn(this.cfr_renamed_4);
        sprnwn2.cfr_renamed_15036(arg0.cfr_renamed_12510(), arg0.cfr_renamed_13240(), arg0.cfr_renamed_2773());
        if (sprnwn2.cfr_renamed_5902()) {
            sprmzn sprmzn2 = this;
            sprnwn sprnwn3 = sprnwn2;
            this.cfr_renamed_15037();
            sprnwn3.cfr_renamed_15038();
            this.cfr_renamed_13380().cfr_renamed_14973((byte)-80);
            sprnwn3.cfr_renamed_15039();
            sprmzn2.cfr_renamed_13380().cfr_renamed_14973((byte)-79);
            sprnwn2.cfr_renamed_15040();
            sprmzn2.cfr_renamed_13380().cfr_renamed_14973((byte)-78);
        }
    }

    @sprtea
    public sprmzn(sprzyn sprzyn2) {
        this.cfr_renamed_4 = sprzyn2;
    }

    private /* synthetic */ void cfr_renamed_15037() {
        sprmzn sprmzn2 = this;
        sprmzn2.cfr_renamed_13380().cfr_renamed_15016((byte)2);
        sprmzn2.cfr_renamed_13380().cfr_renamed_14970((byte)3);
        sprmzn2.cfr_renamed_13380().cfr_renamed_14973((byte)106);
    }
}

