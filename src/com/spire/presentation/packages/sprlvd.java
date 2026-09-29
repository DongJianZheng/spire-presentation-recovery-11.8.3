/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprok;
import com.spire.presentation.packages.spruhe;
import java.security.cert.X509Certificate;

public class sprlvd {
    public static spruhe cfr_renamed_4319(sprok arg0, X509Certificate arg1) {
        return spruhe.cfr_renamed_2150(arg0, arg1.getSubjectX500Principal().getEncoded());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 1;
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

    public static spruhe cfr_renamed_4320(X509Certificate arg0) {
        return spruhe.cfr_renamed_23(arg0.getIssuerX500Principal().getEncoded());
    }

    public static spruhe cfr_renamed_4321(sprok arg0, X509Certificate arg1) {
        return spruhe.cfr_renamed_2150(arg0, arg1.getIssuerX500Principal().getEncoded());
    }

    public static spruhe cfr_renamed_4322(X509Certificate arg0) {
        return spruhe.cfr_renamed_23(arg0.getSubjectX500Principal().getEncoded());
    }
}

