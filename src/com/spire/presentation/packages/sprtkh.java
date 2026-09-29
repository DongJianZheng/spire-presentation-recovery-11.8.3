/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnfh;
import com.spire.presentation.packages.sprvlh;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprtkh {
    public static sprco cfr_renamed_8205(byte[] arg0, sprvlh arg1) throws IOException {
        return sprtkh.cfr_renamed_8206(new ByteArrayInputStream(arg0), arg1);
    }

    public static sprco cfr_renamed_8206(InputStream arg0, sprvlh arg1) throws IOException {
        return new sprnfh(arg0).cfr_renamed_8143(arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
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

