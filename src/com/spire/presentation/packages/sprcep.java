/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtlp;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprxip;

@sprtea
public class sprcep {
    public sprxip[] cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 2 << 3 ^ 4;
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

    public static sprcep cfr_renamed_18689(sprujo arg0, long arg1) {
        int n;
        int n2;
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        sprcep sprcep2 = new sprcep();
        int n3 = arg0.cfr_renamed_13218();
        sprtlp[] sprtlpArray = new sprtlp[n3];
        int n4 = n2 = 0;
        while (n4 < (n3 & 0xFFFF)) {
            sprtlpArray[n2++] = new sprtlp(arg0.cfr_renamed_13220(), arg0.cfr_renamed_13218());
            n4 = n2;
        }
        sprcep2.cfr_renamed_4 = new sprxip[n3];
        sprxip[] sprxipArray = sprcep2.cfr_renamed_4;
        int n5 = n = 0;
        while (n5 < (n3 & 0xFFFF)) {
            sprtlp sprtlp2 = sprtlpArray[n];
            sprxip sprxip2 = sprxip.cfr_renamed_18689(arg0, arg1 + (long)(sprtlp2.cfr_renamed_4 & 0xFFFF));
            sprxipArray[n] = sprxip2;
            sprxip2.cfr_renamed_18916(sprtlp2.cfr_renamed_3);
            n5 = ++n;
        }
        return sprcep2;
    }
}

