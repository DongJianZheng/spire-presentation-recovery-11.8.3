/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboy;
import com.spire.presentation.packages.sprcjaa;
import com.spire.presentation.packages.sprsrd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzud;
import java.io.IOException;
import java.security.cert.X509CertSelector;

public class sprxxd {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzud cfr_renamed_4084(X509CertSelector arg0) {
        try {
            if (arg0.getSubjectKeyIdentifier() == null) return new sprzud(spruhe.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber());
            return new sprzud(spruhe.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber(), sprxue.cfr_renamed_23(arg0.getSubjectKeyIdentifier()).cfr_renamed_186());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprboy.cfr_renamed_9("$ 0,=+q:>n2!?84<%n8=\";4<kn")).append(iOException.getMessage()).toString());
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = 3 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5 << 1;
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
    public sprsrd cfr_renamed_4085(X509CertSelector arg0) {
        try {
            if (arg0.getSubjectKeyIdentifier() == null) return new sprsrd(spruhe.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber());
            return new sprsrd(spruhe.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber(), sprxue.cfr_renamed_23(arg0.getSubjectKeyIdentifier()).cfr_renamed_186());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcjaa.cfr_renamed_9("\u0017M\u0003A\u000eFBW\r\u0003\u0001L\fU\u0007Q\u0016\u0003\u000bP\u0011V\u0007QX\u0003")).append(iOException.getMessage()).toString());
        }
    }
}

