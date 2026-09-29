/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.sprali;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprgmb;
import com.spire.presentation.packages.sprkna;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprmqa;
import com.spire.presentation.packages.sprmwy;
import com.spire.presentation.packages.sproqb;
import com.spire.presentation.packages.sprz;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.X509Certificate;
import java.util.Date;

public class sprcqb
extends CertPathValidatorSpi {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public CertPathValidatorResult engineValidate(CertPath arg0, CertPathParameters arg1) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        if (!(arg1 instanceof sprlsa)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmwy.cfr_renamed_9("w\u0006U\u0006J\u0002S\u0002U\u0014\u0007\nR\u0014SGE\u0002\u0007\u0006\u0007")).append(sprlsa.class.getName()).append(sprali.cfr_renamed_9("\u001d\u0004S\u001eI\fS\u000eXC")).toString());
        }
        sprlsa sprlsa2 = (sprlsa)arg1;
        sprb sprb2 = sprlsa2.cfr_renamed_397();
        if (!(sprb2 instanceof sprkna)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmwy.cfr_renamed_9("s\u0006U\u0000B\u0013d\bI\u0014S\u0015F\u000eI\u0013TGJ\u0012T\u0013\u0007\u0005BGF\t\u0007\u000eI\u0014S\u0006I\u0004BGH\u0001\u0007")).append(sprkna.class.getName()).append(sprali.cfr_renamed_9("M[\u0002OM")).append(this.getClass().getName()).append(sprmwy.cfr_renamed_9("\u0007\u0004K\u0006T\u0014\t")).toString());
        }
        sprz sprz2 = ((sprkna)sprb2).cfr_renamed_201();
        CertPath certPath = sproqb.cfr_renamed_2180(sprz2, sprlsa2);
        CertPath certPath2 = arg0;
        CertPathValidatorResult certPathValidatorResult = sproqb.cfr_renamed_2182(certPath2, sprlsa2);
        X509Certificate x509Certificate = (X509Certificate)certPath2.getCertificates().get(0);
        sprlsa sprlsa3 = sprlsa2;
        X509Certificate x509Certificate2 = x509Certificate;
        sproqb.cfr_renamed_2178(x509Certificate2, sprlsa2);
        sproqb.cfr_renamed_2183(x509Certificate2, sprlsa3);
        sprz sprz3 = sprz2;
        sproqb.cfr_renamed_2185(sprz2, sprlsa2);
        sproqb.cfr_renamed_2179(sprz3, arg0, certPath, sprlsa2);
        sproqb.cfr_renamed_2184(sprz3, sprlsa3);
        Date date = null;
        try {
            date = sprmqa.cfr_renamed_2201(sprlsa2, null, -1);
        }
        catch (sprakb sprakb2) {
            throw new sprgmb(sprali.cfr_renamed_9(".R\u0018Q\t\u001d\u0003R\u0019\u001d\nX\u0019\u001d\u001b\\\u0001T\tT\u0019DMY\fI\b\u001d\u000bO\u0002PM\\\u0019I\u001fT\u000fH\u0019XM^\bO\u0019T\u000bT\u000e\\\u0019XC"), sprakb2);
        }
        sproqb.cfr_renamed_2159(sprz2, sprlsa2, x509Certificate, date, arg0.getCertificates());
        return certPathValidatorResult;
    }
}

