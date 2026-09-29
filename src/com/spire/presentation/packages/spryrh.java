/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranj;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprgai;
import com.spire.presentation.packages.sprgv;
import com.spire.presentation.packages.spritj;
import com.spire.presentation.packages.sprivj;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprltq;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprnve;
import com.spire.presentation.packages.sprpre;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprynh;
import com.spire.presentation.packages.sprzoh;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class spryrh
extends CertPathBuilderSpi {
    private Exception cfr_renamed_2;
    private final boolean cfr_renamed_3;
    private final sprrr cfr_renamed_4;

    public PKIXCertPathChecker cfr_renamed_9061() {
        return new sprzoh(this.cfr_renamed_4);
    }

    public CertPathBuilderResult cfr_renamed_9138(X509Certificate arg0, sprivj arg1, List arg2) {
        if (arg2.contains(arg0)) {
            return null;
        }
        if (arg1.cfr_renamed_399().contains(arg0)) {
            return null;
        }
        if (arg1.cfr_renamed_401() != -1 && arg2.size() - 1 > arg1.cfr_renamed_401()) {
            return null;
        }
        arg2.add(arg0);
        CertPathBuilderResult certPathBuilderResult = null;
        try {
            sprynh sprynh2;
            spranj spranj2;
            try {
                spranj2 = new spranj();
                sprynh2 = new sprynh(this.cfr_renamed_3);
            }
            catch (Exception exception) {
                throw new RuntimeException(sprtsa.cfr_renamed_9("m\u0004K\u0019X\bA\u0013F\\K\u000eM\u001d\\\u0015F\u001b\b\u000f]\fX\u0013Z\b\b\u001fD\u001d[\u000fM\u000f\u0006"));
            }
            if (sprgai.cfr_renamed_9139(arg0, arg1.cfr_renamed_9128().cfr_renamed_9129(), arg1.cfr_renamed_9128().cfr_renamed_9097())) {
                CertPath certPath = null;
                PKIXCertPathValidatorResult pKIXCertPathValidatorResult = null;
                try {
                    certPath = spranj2.engineGenerateCertPath(arg2);
                }
                catch (Exception exception) {
                    throw new sprlhi(sprltq.cfr_renamed_9("\"\u0006\u0013\u0017\b\u0005\b\u0000\u0000\u0017\b\f\u000fC\u0011\u0002\u0015\u000bA\u0000\u000e\u0016\r\u0007A\r\u000e\u0017A\u0001\u0004C\u0002\f\u000f\u0010\u0015\u0011\u0014\u0000\u0015\u0006\u0005C\u0007\u0011\u000e\u000eA\u0000\u0004\u0011\u0015\n\u0007\n\u0002\u0002\u0015\u0006A\u000f\b\u0010\u0015M"), exception);
                }
                {
                    pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult)sprynh2.engineValidate(certPath, arg1);
                }
                return new PKIXCertPathBuilderResult(certPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
            }
            ArrayList<sprgv> arrayList = new ArrayList<sprgv>();
            arrayList.addAll(arg1.cfr_renamed_9128().cfr_renamed_7309());
            try {
                arrayList.addAll(sprgai.cfr_renamed_9140(arg0.getExtensionValue(sprrdm.cfr_renamed_3.cfr_renamed_19()), arg1.cfr_renamed_9128().cfr_renamed_9141()));
            }
            catch (CertificateParsingException certificateParsingException) {
                throw new sprlhi(sprltq.cfr_renamed_9("-\u000eC\u0000\u0007\u0005\n\u0015\n\u000e\r\u0000\u000fA;OVQZA\u0010\u0015\f\u0013\u0006\u0012C\u0002\u0002\u000fC\u0003\u0006A\u0002\u0005\u0007\u0004\u0007A\u0005\u0013\f\fC\u0002\u0006\u0013\u0017\b\u0005\b\u0000\u0000\u0017\u0004C\r\f\u0002\u0002\u0015\n\u000e\r\u0012M"), certificateParsingException);
            }
            HashSet hashSet = new HashSet();
            try {
                hashSet.addAll(sprgai.cfr_renamed_9142(arg0, arg1.cfr_renamed_9128().cfr_renamed_2283(), arrayList));
            }
            catch (sprlhi sprlhi2) {
                throw new sprlhi(sprtsa.cfr_renamed_9("k\u001dF\u0012G\b\b\u001aA\u0012L\\A\u000f[\tM\u000e\b\u001fM\u000e\\\u0015N\u0015K\u001d\\\u0019\b\u001aG\u000e\b\u001fM\u000e\\\u0015N\u0015K\u001d\\\u0019\b\u0015F\\K\u0019Z\bA\u001aA\u001fI\bA\u0013F\\X\u001d\\\u0014\u0006"), sprlhi2);
            }
            if (hashSet.isEmpty()) {
                throw new sprlhi(sprltq.cfr_renamed_9("/\fA\n\u0012\u0010\u0014\u0006\u0013C\u0002\u0006\u0013\u0017\b\u0005\b\u0000\u0000\u0017\u0004C\u0007\f\u0013C\u0002\u0006\u0013\u0017\b\u0005\b\u0000\u0000\u0017\u0004C\b\rA\u0000\u0004\u0011\u0015\n\u0007\n\u0002\u0002\u0015\n\u000e\rA\u0013\u0000\u0017\tC\u0007\f\u0014\r\u0005M"));
            }
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext() && certPathBuilderResult == null) {
                X509Certificate x509Certificate = (X509Certificate)iterator.next();
                certPathBuilderResult = this.cfr_renamed_9138(x509Certificate, arg1, arg2);
            }
        }
        catch (sprlhi sprlhi3) {
            this.cfr_renamed_2 = sprlhi3;
        }
        if (certPathBuilderResult == null) {
            arg2.remove(arg0);
        }
        return certPathBuilderResult;
    }

    public spryrh(boolean bl) {
        spryrh spryrh2 = this;
        this.cfr_renamed_4 = new sprdki();
        this.cfr_renamed_3 = bl;
    }

    @Override
    public CertPathBuilderResult engineBuild(CertPathParameters arg0) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        sprivj sprivj2;
        Object object;
        Object object2;
        Cloneable cloneable;
        Object object3;
        if (arg0 instanceof PKIXBuilderParameters) {
            Object object4;
            object3 = new sprmdk((PKIXBuilderParameters)arg0);
            if (arg0 instanceof sprpre) {
                cloneable = (sprnve)arg0;
                Object object5 = object2 = ((sprpre)cloneable).cfr_renamed_377().iterator();
                while (object5.hasNext()) {
                    ((sprmdk)object3).cfr_renamed_9143((sprgv)object2.next());
                    object5 = object2;
                }
                Object object6 = object = new spritj(((sprmdk)object3).cfr_renamed_1451());
                ((spritj)object).cfr_renamed_9144(((sprnve)cloneable).cfr_renamed_399());
                object4 = object6;
                ((spritj)object6).cfr_renamed_400(((sprnve)cloneable).cfr_renamed_401());
            } else {
                object4 = object = new spritj((PKIXBuilderParameters)arg0);
            }
            sprivj2 = ((spritj)object4).cfr_renamed_1451();
        } else if (arg0 instanceof sprivj) {
            sprivj2 = (sprivj)arg0;
        } else {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprtsa.cfr_renamed_9(",I\u000eI\u0011M\bM\u000e[\\E\t[\b\b\u001eM\\I\u0012\b\u0015F\u000f\\\u001dF\u001fM\\G\u001a\b")).append(PKIXBuilderParameters.class.getName()).append(sprltq.cfr_renamed_9("A\f\u0013C")).append(sprivj.class.getName()).append(".").toString());
        }
        cloneable = new ArrayList();
        object3 = sprgai.cfr_renamed_9145(sprivj2);
        CertPathBuilderResult certPathBuilderResult = null;
        Object object7 = object = object3.iterator();
        while (object7.hasNext() && certPathBuilderResult == null) {
            object2 = (X509Certificate)object.next();
            certPathBuilderResult = this.cfr_renamed_9138((X509Certificate)object2, sprivj2, (List)((Object)cloneable));
            object7 = object;
        }
        if (certPathBuilderResult == null && this.cfr_renamed_2 != null) {
            if (this.cfr_renamed_2 instanceof sprlhi) {
                throw new CertPathBuilderException(this.cfr_renamed_2.getMessage(), this.cfr_renamed_2.getCause());
            }
            throw new CertPathBuilderException(sprtsa.cfr_renamed_9(",G\u000f[\u0015J\u0010M\\K\u0019Z\bA\u001aA\u001fI\bM\\K\u0014I\u0015F\\K\u0013]\u0010L\\F\u0013\\\\J\u0019\b\nI\u0010A\u0018I\bM\u0018\u0006"), this.cfr_renamed_2);
        }
        if (certPathBuilderResult == null && this.cfr_renamed_2 == null) {
            throw new CertPathBuilderException(sprltq.cfr_renamed_9("6\u000f\u0002\u0003\u000f\u0004C\u0015\fA\u0005\b\r\u0005C\u0002\u0006\u0013\u0017\b\u0005\b\u0000\u0000\u0017\u0004C\u0002\u000b\u0000\n\u000fM"));
        }
        return certPathBuilderResult;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3 << 1;
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

    public spryrh() {
        this(false);
    }
}

