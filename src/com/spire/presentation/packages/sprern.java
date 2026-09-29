/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprern {
    public static final String cfr_renamed_0 = "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml";
    public static final String cfr_renamed_1 = "application/vnd.openxmlformats-package.digital-signature-certificate";
    public static final String cfr_renamed_2 = "application/vnd.openxmlformats-package.core-properties+xml";
    public static final String cfr_renamed_3 = "application/vnd.openxmlformats-package.relationships+xml";
    public static final String cfr_renamed_4 = "application/vnd.openxmlformats-package.digital-signature-origin";

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 2 << 1;
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

