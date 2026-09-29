/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprlsb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwkd;
import java.util.Enumeration;

public class spronb {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprlsb cfr_renamed_2315(String arg0) {
        sprfpd sprfpd2;
        sprfpd sprfpd3;
        block7: {
            sprfpd3 = sprwkd.cfr_renamed_1837(arg0);
            if (sprfpd3 == null) {
                sprfpd sprfpd4;
                try {
                    sprfpd4 = sprfpd3 = sprwkd.cfr_renamed_2102(new sprtzd(arg0));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    sprfpd4 = sprfpd3;
                }
                if (sprfpd4 == null && (sprfpd3 = sprahe.cfr_renamed_1837(arg0)) == null) {
                    try {
                        sprfpd2 = sprfpd3 = sprahe.cfr_renamed_2102(new sprtzd(arg0));
                        break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        // empty catch block
                    }
                }
            }
            sprfpd2 = sprfpd3;
        }
        if (sprfpd2 == null) {
            return null;
        }
        return new sprlsb(arg0, sprfpd3.cfr_renamed_1769(), sprfpd3.cfr_renamed_1145(), sprfpd3.cfr_renamed_1146(), sprfpd3.cfr_renamed_1153(), sprfpd3.cfr_renamed_2113());
    }

    public static Enumeration cfr_renamed_289() {
        return sprahe.cfr_renamed_289();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 5;
        int cfr_ignored_0 = 4 << 4 ^ 3;
        int n4 = n2;
        int n5 = 4 << 3 ^ 3;
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

