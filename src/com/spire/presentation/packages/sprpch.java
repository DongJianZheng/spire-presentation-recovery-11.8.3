/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravr;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcmh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruab;
import java.security.AccessController;
import java.util.List;

public class sprpch {
    public static sprszm cfr_renamed_8211(sprco ... arg0) {
        return new sprcen(arg0);
    }

    public static byte[] cfr_renamed_8212(byte[] arg0, int arg1) {
        if (arg0.length != arg1) {
            throw new IllegalArgumentException(spruab.cfr_renamed_9("f\u0010}\u0016}Sz\u0007{\u001ag\u0014)\u001c|\u0007)\u001coS{\u0012g\u0014l"));
        }
        return arg0;
    }

    @Deprecated
    public static <T> List<T> cfr_renamed_8213(Class<T> arg0, sprszm arg1) {
        return (List)AccessController.doPrivileged(new sprcmh(arg1, arg0));
    }

    public static sprszm cfr_renamed_8214(List arg0) {
        return new sprcen(arg0.toArray(new sprco[0]));
    }

    public static byte[] cfr_renamed_8215(byte[] arg0) {
        if (arg0.length < 1 || arg0.length > 32) {
            throw new IllegalArgumentException(spravr.cfr_renamed_9(")Z2\\2\u00195M4P(^fV3MfV \u00194X(^#"));
        }
        return sproze.cfr_renamed_158(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 ^ 5) << 1;
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

