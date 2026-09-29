/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprntd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprwiea;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.security.cert.X509CertSelector;

public class sprmwd {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 << 2 ^ 1);
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprntd cfr_renamed_4244(X509CertSelector arg0) {
        try {
            if (arg0.getSubjectKeyIdentifier() == null) return new sprntd(spruhe.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber());
            return new sprntd(spruhe.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber(), sprxue.cfr_renamed_23(arg0.getSubjectKeyIdentifier()).cfr_renamed_186());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwiea.cfr_renamed_9(";\u0015/\u0019\"\u001en\u000f![-\u0014 \r+\t:['\b=\u000e+\tt[")).append(iOException.getMessage()).toString());
        }
    }
}

