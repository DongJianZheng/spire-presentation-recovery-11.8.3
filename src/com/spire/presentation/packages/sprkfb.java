/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprhfb;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprndb;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprtfb;
import com.spire.presentation.packages.sprygb;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprkfb {
    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprtfb) {
            sprtfb sprtfb2 = (sprtfb)arg0;
            return new sprygb(sprtfb2.cfr_renamed_1135(), sprtfb2.cfr_renamed_1136(), sprtfb2.cfr_renamed_1137(), sprtfb2.cfr_renamed_1138(), sprtfb2.cfr_renamed_1139(), sprtfb2.cfr_renamed_1134());
        }
        throw new InvalidKeyException(sprrxj.cfr_renamed_9("vP{\u0016a\u0011|Up_aXsH5ctX{SzF5AgXcPaT5ZpH;"));
    }

    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprndb) {
            sprndb sprndb2 = (sprndb)arg0;
            return new sprhfb(sprndb2.cfr_renamed_1130(), sprndb2.cfr_renamed_1132(), sprndb2.cfr_renamed_1131(), sprndb2.cfr_renamed_1133());
        }
        throw new InvalidKeyException(new StringBuilder().insert(0, spraqe.cfr_renamed_9("KhF.\\)AmMg\\`Np\b[I`FkG~\by]kD`K)ClQ3\b")).append(arg0.getClass().getName()).toString());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 3 << 3 ^ 4;
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

