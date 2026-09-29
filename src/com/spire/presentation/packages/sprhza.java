/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraya;
import com.spire.presentation.packages.sprcwq;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreyd;
import com.spire.presentation.packages.sprfra;
import com.spire.presentation.packages.sprftd;
import com.spire.presentation.packages.sprjnb;
import com.spire.presentation.packages.sprldha;
import com.spire.presentation.packages.sprlza;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmud;
import com.spire.presentation.packages.sprna;
import com.spire.presentation.packages.sprz;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

public class sprhza
extends spraya {
    private Object cfr_renamed_0;
    private char[] cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private Provider cfr_renamed_3;
    private String cfr_renamed_4;

    public sprhza(Object arg0, sprna arg1) throws IOException {
        super(sprhza.cfr_renamed_1621(arg0), arg1);
    }

    public sprhza(Object arg0) throws IOException {
        super(sprhza.cfr_renamed_1621(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object cfr_renamed_1621(Object arg0) throws IOException {
        if (arg0 instanceof X509Certificate) {
            try {
                return new spreyd((X509Certificate)arg0);
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprldha.cfr_renamed_9(" d\rk\fqC`\rf\fa\u0006%\fg\t`\u0000qY%")).append(certificateEncodingException.toString()).toString());
            }
        }
        if (arg0 instanceof X509CRL) {
            try {
                return new sprmud((X509CRL)arg0);
            }
            catch (CRLException cRLException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprcwq.cfr_renamed_9("?=\u00122\u0013(\\9\u0012?\u00138\u0019|\u0013>\u00169\u001f(F|")).append(cRLException.toString()).toString());
            }
        }
        if (arg0 instanceof KeyPair) {
            return sprhza.cfr_renamed_1621(((KeyPair)arg0).getPrivate());
        }
        if (arg0 instanceof PrivateKey) {
            return sprmke.cfr_renamed_23(((Key)arg0).getEncoded());
        }
        if (arg0 instanceof PublicKey) {
            return sprdce.cfr_renamed_23(((PublicKey)arg0).getEncoded());
        }
        if (arg0 instanceof sprz) {
            return new sprftd((sprfra)arg0);
        }
        if (arg0 instanceof sprjnb) {
            return new sprlza(((sprjnb)arg0).cfr_renamed_91());
        }
        return arg0;
    }
}

