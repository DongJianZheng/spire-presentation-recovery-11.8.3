/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmqfa;
import com.spire.presentation.packages.sprpyl;
import com.spire.presentation.packages.sprtzl;
import java.io.IOException;

public class sprttg {
    private sprpyl cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4;
        int cfr_ignored_0 = 4 << 3 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    public sprttg(sprmam sprmam2) throws IOException {
        sprtzl sprtzl2 = sprmam2.cfr_renamed_7676();
        if (!(sprtzl2 instanceof sprpyl)) {
            throw new IOException(new StringBuilder().insert(0, sprmqfa.cfr_renamed_9("s\u0012c\u0004v\u0019e\bc\u0018&\fg\u001fm\u0019r\\o\u0012&\u000fr\u000ec\u001dkF&")).append(sprtzl2).toString());
        }
        this.cfr_renamed_4 = (sprpyl)sprtzl2;
    }
}

