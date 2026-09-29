/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbgo;
import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sproib;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprqzd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprxll;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzxd;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprwrd {
    public static sprqzd cfr_renamed_4092(X509Certificate arg0) throws CertificateEncodingException {
        return sprqzd.cfr_renamed_23(arg0.getTBSCertificate());
    }

    public static sprvre cfr_renamed_4054(X509Certificate arg0) throws CertificateEncodingException {
        sprcge sprcge2 = sprcge.cfr_renamed_23(arg0.getEncoded());
        return new sprvre(sprcge2.cfr_renamed_102(), arg0.getSerialNumber());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spra cfr_renamed_2383(AlgorithmParameters arg0) throws sprlqd {
        try {
            return sproib.cfr_renamed_2383(arg0);
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprbgo.cfr_renamed_9("Z<W3V)\u00198A)K<Z)\u0019-X/X0\\)\\/Jg\u0019")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static byte[] cfr_renamed_4044(X509Certificate arg0) {
        byte[] byArray = arg0.getExtensionValue(sprtie.cfr_renamed_93.cfr_renamed_19());
        if (byArray != null) {
            return sprxue.cfr_renamed_23(sprxue.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_186();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_1541(AlgorithmParameters arg0, spra arg1) throws sprlqd {
        try {
            sproib.cfr_renamed_1541(arg0, arg1);
            return;
        }
        catch (IOException iOException) {
            throw new sprlqd(sprxll.cfr_renamed_9("1\"&?&p1>7?09:7t187;\"=$<=t 5\"5=1$1\"'~"), iOException);
        }
    }

    public static sprzxd cfr_renamed_4052(Provider arg0) {
        if (arg0 != null) {
            return new sprzxd(new sprqrd(arg0));
        }
        return new sprzxd(new sprypd());
    }

    public static sprzxd cfr_renamed_4046(String arg0) {
        if (arg0 != null) {
            return new sprzxd(new sprbqd(arg0));
        }
        return new sprzxd(new sprypd());
    }
}

