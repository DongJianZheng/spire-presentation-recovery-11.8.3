/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlql;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public abstract class sprysb
extends AlgorithmParametersSpi {
    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprlql.cfr_renamed_9("|\u0015z\u0012p\u0002s\u0013=\u0013rGz\u0002i7|\u0015|\nx\u0013x\u0015N\u0017x\u0004=\nh\u0014iGs\biG\u007f\u0002=\th\u000bq"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    public abstract AlgorithmParameterSpec cfr_renamed_2397(Class var1) throws InvalidParameterSpecException;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5;
        int cfr_ignored_0 = 2 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ 1 << 1;
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

