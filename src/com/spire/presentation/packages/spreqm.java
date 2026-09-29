/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccha;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprjsm;
import com.spire.presentation.packages.sprlnm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprycn;

public class spreqm {
    private final sprrvm cfr_renamed_2;
    private final sprrvm cfr_renamed_3;
    private final sprrvm cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = 2 << 3 ^ (3 ^ 5);
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

    public spreqm() {
        spreqm spreqm2 = this;
        this.cfr_renamed_3 = new sprrvm();
        spreqm2.cfr_renamed_4 = new sprrvm();
        this.cfr_renamed_2 = new sprrvm();
    }

    public sprlnm cfr_renamed_1451() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprrvm2.cfr_renamed_5004(new sprcen(this.cfr_renamed_3));
        if (this.cfr_renamed_4.cfr_renamed_84() != 0) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)new sprcen(this.cfr_renamed_4)));
        }
        if (this.cfr_renamed_2.cfr_renamed_84() != 0) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)new sprcen(this.cfr_renamed_2)));
        }
        return sprlnm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public spreqm cfr_renamed_11337(sprhmm arg0, sprjsm arg1) {
        if (this.cfr_renamed_3.cfr_renamed_84() != this.cfr_renamed_4.cfr_renamed_84()) {
            throw new IllegalStateException(sprccha.cfr_renamed_9("\u0017'\u0005'\u0011 D2\n7D!\u0001%'6\u0016'\u0017s\u00176\u0015&\u0001=\u00076D>\u0011 \u0010s\u00066D:\ns\u0007<\t>\u000b=D<\u00167\u0001!"));
        }
        spreqm spreqm2 = this;
        spreqm2.cfr_renamed_3.cfr_renamed_5004(arg0);
        spreqm2.cfr_renamed_4.cfr_renamed_5004(arg1);
        return spreqm2;
    }

    public spreqm cfr_renamed_11338(sprhmm arg0) {
        spreqm spreqm2 = this;
        spreqm2.cfr_renamed_3.cfr_renamed_5004(arg0);
        return spreqm2;
    }

    public spreqm cfr_renamed_11339(sprffm arg0) {
        spreqm spreqm2 = this;
        spreqm2.cfr_renamed_2.cfr_renamed_5004(arg0);
        return spreqm2;
    }
}

