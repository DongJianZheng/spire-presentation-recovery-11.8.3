/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhwh;
import com.spire.presentation.packages.sprxnh;
import com.spire.presentation.packages.sprzi;
import java.math.BigInteger;

public class sproyh {
    public static final String cfr_renamed_4 = "bc_fixed_point";

    public static int cfr_renamed_8900(sprgxh arg0) {
        BigInteger bigInteger = arg0.cfr_renamed_1932();
        if (bigInteger == null) {
            return arg0.cfr_renamed_1938() + 1;
        }
        return bigInteger.bitLength();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 5 << 1;
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

    public static sprxnh cfr_renamed_8901(sprzi arg0) {
        if (arg0 instanceof sprxnh) {
            return (sprxnh)arg0;
        }
        return null;
    }

    public static sprxnh cfr_renamed_8902(spreuh arg0) {
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        return (sprxnh)sprgxh2.cfr_renamed_8628(arg0, cfr_renamed_4, new sprhwh(sprgxh2, arg0));
    }
}

