/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprzzz;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;

public class sprdxl {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CertSelector cfr_renamed_10735(sprnbm arg0, BigInteger arg1, byte[] arg2) {
        BigInteger bigInteger;
        X509CertSelector x509CertSelector = new X509CertSelector();
        if (arg0 != null) {
            try {
                x509CertSelector.setIssuer(arg0.cfr_renamed_91());
                bigInteger = arg1;
            }
            catch (IOException iOException) {
                throw sprvhf.cfr_renamed_5213(new StringBuilder().insert(0, sprqje.cfr_renamed_9("dsp\u007f}x1i~=rr\u007fktoe=xnbhto+=")).append(iOException.getMessage()).toString(), iOException);
            }
        } else {
            bigInteger = arg1;
        }
        if (bigInteger != null) {
            x509CertSelector.setSerialNumber(arg1);
        }
        if (arg2 == null) {
            return x509CertSelector;
        }
        try {
            x509CertSelector.setSubjectKeyIdentifier(new sprfvg(arg2).cfr_renamed_91());
            return x509CertSelector;
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5213(new StringBuilder().insert(0, sprzzz.cfr_renamed_9("\u001b1\u000f=\u0002:N+\u0001\u007f\r0\u0000)\u000b-\u001a\u007f\u001d*\f5\u000b<\u001a\u0014\u000b&';\u000b1\u001a6\b6\u000b-T\u007f")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public X509CertSelector cfr_renamed_10890(sprcyl arg0) {
        return this.cfr_renamed_10735(arg0.cfr_renamed_102(), arg0.cfr_renamed_114(), arg0.cfr_renamed_3955());
    }
}

