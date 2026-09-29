/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprfjn {
    public static final String cfr_renamed_152 = "http://schemas.microsoft.com/xps/2005/06/signature-definitions";
    public static final String cfr_renamed_112 = "http://schemas.microsoft.com/xps/2005/06/fixedrepresentation";
    public static final String cfr_renamed_119 = "http://schemas.microsoft.com/xps/2005/06/restricted-font";
    public static final String cfr_renamed_91 = "http://schemas.microsoft.com/xps/2005/06/printticket";
    public static final String cfr_renamed_0 = "http://schemas.microsoft.com/xps/2005/06/documentstructure";
    public static final String cfr_renamed_1 = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties";
    public static final String cfr_renamed_2 = "http://schemas.microsoft.com/xps/2005/06/discard-control";
    public static final String cfr_renamed_3 = "http://schemas.microsoft.com/xps/2005/06/required-resource";
    public static final String cfr_renamed_4 = "http://schemas.microsoft.com/xps/2005/06/storyfragments";

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 3 << 1;
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

