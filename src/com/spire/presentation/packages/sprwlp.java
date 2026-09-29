/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprwlp {
    public sprhhp cfr_renamed_19051(String arg0, float arg1, int arg2, String arg3, int arg4) {
        return new sprhhp(arg1, arg2, this.cfr_renamed_19052(arg0, arg4, arg3));
    }

    public sprhhp cfr_renamed_19053(String arg0, float arg1, int arg2, String arg3) {
        int n = arg2;
        return this.cfr_renamed_19051(arg0, arg1, n, arg3, n);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 2 << 1;
        int cfr_ignored_0 = 3 << 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ (2 ^ 5);
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

    public abstract sprfzo cfr_renamed_19052(String var1, int var2, String var3);

    public sprhhp cfr_renamed_14804(String arg0, float arg1, int arg2) {
        return this.cfr_renamed_19053(arg0, arg1, arg2, null);
    }
}

