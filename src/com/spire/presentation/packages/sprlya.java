/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprudb;
import com.spire.presentation.packages.sprva;
import com.spire.presentation.packages.sprzfb;
import java.security.SecureRandom;

public abstract class sprlya {
    private SecureRandom cfr_renamed_1;
    private sprije cfr_renamed_2;
    public sprva cfr_renamed_3;
    private sprije cfr_renamed_4;

    public static /* synthetic */ sprije cfr_renamed_1589(sprlya arg0) {
        return arg0.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprlya(sprije sprije2, sprije sprije3) {
        void arg0;
        sprlya sprlya2 = this;
        sprlya2.cfr_renamed_2 = arg0;
        sprlya2.cfr_renamed_4 = sprije3;
        sprlya2.cfr_renamed_3 = sprudb.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 4;
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
    public sprqa cfr_renamed_1588(sprhgb sprhgb2) throws sprfya {
        void arg0;
        sprlya sprlya2 = this;
        sprlya sprlya3 = this;
        sprta sprta2 = sprlya2.cfr_renamed_1582(sprlya2.cfr_renamed_2, sprlya3.cfr_renamed_4);
        if (sprlya3.cfr_renamed_1 != null) {
            sprta2.cfr_renamed_1217(true, new spraed((sprt)arg0, this.cfr_renamed_1));
        } else {
            sprta2.cfr_renamed_1217(true, (sprt)arg0);
        }
        return new sprzfb(this, sprta2);
    }

    public abstract sprta cfr_renamed_1582(sprije var1, sprije var2) throws sprfya;

    public sprlya cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }
}

