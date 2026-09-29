/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreyj;
import com.spire.presentation.packages.sprjxj;
import com.spire.presentation.packages.sprqxj;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Mac;

public class sprrxj {
    public static OutputStream cfr_renamed_7467(Signature arg0) {
        return new spreyj(arg0);
    }

    public static OutputStream cfr_renamed_7919(MessageDigest arg0) {
        return new sprjxj(arg0);
    }

    public static OutputStream cfr_renamed_9493(Mac arg0) {
        return new sprqxj(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = 4 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
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

