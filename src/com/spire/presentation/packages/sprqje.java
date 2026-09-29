/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprywa;
import java.io.IOException;

public abstract class sprqje {
    public sprvva cfr_renamed_4446(String arg0, int arg1) throws IOException {
        int n;
        arg0 = sprywa.cfr_renamed_425(arg0);
        byte[] byArray = new byte[(arg0.length() - arg1) / 2];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            char c;
            String string = arg0;
            char c2 = string.charAt(n * 2 + arg1);
            char c3 = string.charAt(n * 2 + arg1 + 1);
            if (c2 < 'a') {
                c = c3;
                byArray[n] = (byte)(c2 - 48 << 4);
            } else {
                byArray[n] = (byte)(c2 - 97 + 10 << 4);
                c = c3;
            }
            if (c < 'a') {
                int n3 = n;
                byArray[n3] = (byte)(byArray[n3] | (byte)(c3 - 48));
            } else {
                int n4 = n;
                byArray[n4] = (byte)(byArray[n4] | (byte)(c3 - 97 + 10));
            }
            n2 = ++n;
        }
        sprgle sprgle2 = new sprgle(byArray);
        return sprgle2.cfr_renamed_24();
    }

    public abstract sprvva cfr_renamed_4447(sprtzd var1, String var2);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 1;
        int cfr_ignored_0 = 5 << 3 ^ 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ 5;
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

    public boolean cfr_renamed_4448(String arg0) {
        return spraoe.cfr_renamed_4449(arg0);
    }
}

