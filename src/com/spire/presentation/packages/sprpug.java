/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprquo;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.spruim;
import java.io.IOException;

public class sprpug {
    private spruim cfr_renamed_4;

    public sprpug(sprmam sprmam2) throws IOException {
        sprtzl sprtzl2 = sprmam2.cfr_renamed_7676();
        if (!(sprtzl2 instanceof spruim)) {
            throw new IOException(new StringBuilder().insert(0, sprquo.cfr_renamed_9("ZJJ\\_ALPJ@\u000fTNGDA[\u0004FJ\u000fW[VJEB\u001e\u000f")).append(sprtzl2).toString());
        }
        this.cfr_renamed_4 = (spruim)sprtzl2;
    }

    public byte[] cfr_renamed_5888() {
        return this.cfr_renamed_4.cfr_renamed_5888();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3;
        int cfr_ignored_0 = 5 << 3;
        int n4 = n2;
        int n5 = 3 << 3;
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

