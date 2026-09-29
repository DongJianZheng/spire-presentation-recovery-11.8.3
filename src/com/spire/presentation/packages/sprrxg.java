/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.spretk;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.spritg;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprxal;
import java.math.BigInteger;

public class sprrxg {
    public static sprirk cfr_renamed_7999(boolean arg0, sprmr arg1, byte[] arg2, byte[] arg3) {
        sprmr sprmr2 = arg1;
        sprirk sprirk2 = new sprirk(new spretk(sprmr2, sprmr2.cfr_renamed_1195() * 8));
        sprirk2.cfr_renamed_5535(arg0, new sprkpk(new sprtpk(arg2), arg3));
        return sprirk2;
    }

    public static sprhfm cfr_renamed_7928(sprlem arg0) {
        sprhfm sprhfm2 = sprchl.cfr_renamed_7994(arg0);
        if (sprhfm2 == null) {
            sprhfm2 = sprnhm.cfr_renamed_7994(arg0);
        }
        return sprhfm2;
    }

    public static sprirk cfr_renamed_8000(boolean arg0, sprmr arg1, boolean arg2, byte[] arg3) {
        sprirk sprirk2;
        if (arg2) {
            sprmr sprmr2 = arg1;
            sprirk2 = new sprirk(new spretk(sprmr2, sprmr2.cfr_renamed_1195() * 8));
        } else {
            sprirk2 = new sprirk(new sprxal(arg1));
        }
        sprtpk sprtpk2 = new sprtpk(arg3);
        if (arg2) {
            sprirk sprirk3 = sprirk2;
            sprirk3.cfr_renamed_5535(arg0, new sprkpk(sprtpk2, new byte[arg1.cfr_renamed_1195()]));
            return sprirk3;
        }
        sprirk sprirk4 = sprirk2;
        sprirk4.cfr_renamed_5535(arg0, sprtpk2);
        return sprirk4;
    }

    public static spreuh cfr_renamed_7977(BigInteger arg0, sprgxh arg1) {
        return arg1.cfr_renamed_2002(sprhdf.cfr_renamed_514(arg0));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 4 ^ 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 5;
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

    public static sprbg cfr_renamed_8001(boolean arg0, sprmr arg1, byte[] arg2) {
        sprirk sprirk2 = sprrxg.cfr_renamed_8000(false, arg1, arg0, arg2);
        return new spritg(sprirk2);
    }
}

