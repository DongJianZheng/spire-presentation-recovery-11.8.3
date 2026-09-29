/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjqe;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsve;

public class sprove {
    private sprlre cfr_renamed_2;
    private sprlre cfr_renamed_3;
    private sprlre cfr_renamed_4;

    public sprjqe cfr_renamed_1451() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(new sprpse(this.cfr_renamed_4));
        if (this.cfr_renamed_3.cfr_renamed_84() != 0) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, new sprpse(this.cfr_renamed_3)));
        }
        if (this.cfr_renamed_2.cfr_renamed_84() != 0) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, new sprpse(this.cfr_renamed_2)));
        }
        return sprjqe.cfr_renamed_23(new sprpse(sprlre2));
    }

    public sprove cfr_renamed_4845(sproje arg0) {
        sprove sprove2 = this;
        sprove2.cfr_renamed_2.cfr_renamed_49(arg0);
        return sprove2;
    }

    public sprove() {
        sprove sprove2 = this;
        this.cfr_renamed_4 = new sprlre();
        sprove2.cfr_renamed_3 = new sprlre();
        this.cfr_renamed_2 = new sprlre();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ (3 ^ 5);
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

    public sprove cfr_renamed_4846(sprkme arg0, sprsve arg1) {
        if (this.cfr_renamed_4.cfr_renamed_84() != this.cfr_renamed_3.cfr_renamed_84()) {
            throw new IllegalStateException(spronq.cfr_renamed_9("hAzAnF;TuQ;G~CXPiAh\u0015hPj@~[xP;XnFo\u0015yP;\\u\u0015xZvXt[;ZiQ~G"));
        }
        sprove sprove2 = this;
        sprove2.cfr_renamed_4.cfr_renamed_49(arg0);
        sprove2.cfr_renamed_3.cfr_renamed_49(arg1);
        return sprove2;
    }

    public sprove cfr_renamed_4847(sprkme arg0) {
        sprove sprove2 = this;
        sprove2.cfr_renamed_4.cfr_renamed_49(arg0);
        return sprove2;
    }
}

