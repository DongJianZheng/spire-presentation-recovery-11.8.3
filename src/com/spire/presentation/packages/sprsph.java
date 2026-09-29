/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprbkn;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprgai;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprirh;
import com.spire.presentation.packages.sprlob;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprpre;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.spryue;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class sprsph
extends CertPathValidatorSpi {
    private final sprrr cfr_renamed_4;

    @Override
    public CertPathValidatorResult engineValidate(CertPath arg0, CertPathParameters arg1) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        X509Certificate x509Certificate;
        sprgak sprgak2;
        Cloneable cloneable;
        Object object;
        if (!(arg1 instanceof sprpre) && !(arg1 instanceof sprgak)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprlob.cfr_renamed_9("[^y^fZ\u007fZyL+R~L\u007f\u001fiZ+^+")).append(sprpre.class.getName()).append(sprbkn.cfr_renamed_9("\n\nD\u0010^\u0002D\u0000OM")).toString());
        }
        Set set = new HashSet();
        Set set2 = new HashSet();
        Set set3 = new HashSet();
        HashSet hashSet = new HashSet();
        if (arg1 instanceof PKIXParameters) {
            object = new sprmdk((PKIXParameters)arg1);
            if (arg1 instanceof sprpre) {
                cloneable = (sprpre)arg1;
                ((sprmdk)object).cfr_renamed_390(((sprpre)cloneable).cfr_renamed_391());
                ((sprmdk)object).cfr_renamed_389(((sprpre)cloneable).cfr_renamed_376());
                Cloneable cloneable2 = cloneable;
                set = ((sprpre)cloneable2).cfr_renamed_393();
                set2 = ((sprpre)cloneable2).cfr_renamed_378();
                set3 = ((sprpre)cloneable2).cfr_renamed_395();
            }
            sprgak2 = ((sprmdk)object).cfr_renamed_1451();
        } else {
            sprgak2 = (sprgak)arg1;
        }
        object = new Date();
        sprgak sprgak3 = sprgak2;
        cloneable = sprgai.cfr_renamed_7272(sprgak3, (Date)object);
        sprexj sprexj2 = sprgak3.cfr_renamed_397();
        if (!(sprexj2 instanceof spryue)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprlob.cfr_renamed_9("_^yXnKHPeL\u007fMjVeKx\u001ffJxK+]n\u001fjQ+VeL\u007f^e\\n\u001fdY+")).append(spryue.class.getName()).append(sprbkn.cfr_renamed_9("CL\fXC")).append(this.getClass().getName()).append(sprlob.cfr_renamed_9("+\\g^xL%")).toString());
        }
        sprbd sprbd2 = ((spryue)((Object)sprexj2)).cfr_renamed_201();
        CertPath certPath = sprirh.cfr_renamed_9068(sprbd2, sprgak2);
        CertPath certPath2 = arg0;
        CertPathValidatorResult certPathValidatorResult = sprirh.cfr_renamed_9069(certPath2, sprgak2);
        X509Certificate x509Certificate2 = x509Certificate = (X509Certificate)certPath2.getCertificates().get(0);
        sprirh.cfr_renamed_9070(x509Certificate2, sprgak2);
        sprirh.cfr_renamed_9083(x509Certificate2, hashSet);
        sprbd sprbd3 = sprbd2;
        sprbd sprbd4 = sprbd2;
        sprirh.cfr_renamed_9076(sprbd4, (Date)cloneable);
        sprirh.cfr_renamed_9071(sprbd4, arg0, certPath, sprgak2, set);
        sprirh.cfr_renamed_9067(sprbd3, set2, set3);
        sprirh.cfr_renamed_9072(sprbd3, sprgak2, (Date)object, (Date)cloneable, x509Certificate, arg0.getCertificates(), this.cfr_renamed_4);
        return certPathValidatorResult;
    }

    public sprsph() {
        sprsph sprsph2 = this;
        sprsph2.cfr_renamed_4 = new sprdki();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 2 << 1;
        int cfr_ignored_0 = 4 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 4 ^ 4 << 1;
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

