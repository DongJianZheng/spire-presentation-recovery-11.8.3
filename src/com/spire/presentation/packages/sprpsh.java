/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.sprerh;
import com.spire.presentation.packages.sprgai;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprivj;
import com.spire.presentation.packages.sprkyh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprmuh;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprooh;
import com.spire.presentation.packages.sprouaa;
import com.spire.presentation.packages.sprpre;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtw;
import com.spire.presentation.packages.sprvnj;
import com.spire.presentation.packages.sprxbi;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class sprpsh
extends CertPathValidatorSpi {
    private final boolean cfr_renamed_3;
    private final sprrr cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9131(X509Certificate arg0) throws sprlhi {
        if (arg0 instanceof sprtw) {
            RuntimeException runtimeException = null;
            try {
                if (null == ((sprtw)((Object)arg0)).cfr_renamed_9137()) throw new sprlhi(sprouaa.cfr_renamed_9("Y-M!@&\f7Cc\\1C I0_cx\u0001\u007f\u0000I1X*J*O\"X&"), runtimeException);
                return;
            }
            catch (RuntimeException runtimeException2) {
                runtimeException = runtimeException2;
            }
            throw new sprlhi(sprouaa.cfr_renamed_9("Y-M!@&\f7Cc\\1C I0_cx\u0001\u007f\u0000I1X*J*O\"X&"), runtimeException);
        }
        try {
            sprdzl.cfr_renamed_23(arg0.getTBSCertificate());
            return;
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new sprlhi(sprvnj.cfr_renamed_9("}BiNdI(Xg\fx^gOm_{\f\\n[om^|EnEkM|I"), certificateEncodingException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlhi(illegalArgumentException.getMessage());
        }
    }

    public sprpsh() {
        this(false);
    }

    @Override
    public CertPathValidatorResult engineValidate(CertPath arg0, CertPathParameters arg1) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        CertPath certPath;
        HashSet<String> hashSet;
        HashSet hashSet2;
        Iterator iterator;
        PublicKey publicKey;
        sprnbm sprnbm2;
        TrustAnchor trustAnchor;
        int n;
        sprgak sprgak2;
        int n2;
        sprgak sprgak3;
        int n3;
        int n4;
        TrustAnchor trustAnchor2;
        sprgak sprgak4;
        sprgak sprgak5;
        Object object;
        if (arg1 instanceof PKIXParameters) {
            object = new sprmdk((PKIXParameters)arg1);
            if (arg1 instanceof sprpre) {
                sprpre sprpre2 = (sprpre)arg1;
                ((sprmdk)object).cfr_renamed_390(sprpre2.cfr_renamed_391());
                ((sprmdk)object).cfr_renamed_389(sprpre2.cfr_renamed_376());
            }
            sprgak4 = sprgak5 = ((sprmdk)object).cfr_renamed_1451();
        } else if (arg1 instanceof sprivj) {
            sprgak4 = sprgak5 = ((sprivj)arg1).cfr_renamed_9128();
        } else if (arg1 instanceof sprgak) {
            sprgak4 = sprgak5 = (sprgak)arg1;
        } else {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprouaa.cfr_renamed_9("\u0013M1M.I7I1_cA6_7\f!IcMc")).append(PKIXParameters.class.getName()).append(sprvnj.cfr_renamed_9("(Ef_|MfOm\u0002")).toString());
        }
        if (sprgak4.cfr_renamed_9129() == null) {
            throw new InvalidAlgorithmParameterException(sprouaa.cfr_renamed_9("X1Y0X\u0002B D,^0\f*_cB6@/\u0000cX+E0\f*_cB,XcM/@,[&HcJ,^cO&^7E%E M7E,Bc\\\"X+\f5M/E'M7E,Bm"));
        }
        object = arg0.getCertificates();
        int n5 = object.size();
        if (object.isEmpty()) {
            throw new CertPathValidatorException(sprvnj.cfr_renamed_9("KIzXaJaOiXaCf\fxM|D(E{\fmAxXq\u0002"), null, arg0, -1);
        }
        Date date = new Date();
        sprgak sprgak6 = sprgak5;
        Date date2 = sprgai.cfr_renamed_7272(sprgak6, date);
        Set set = sprgak6.cfr_renamed_9130();
        try {
            Object object2 = object;
            trustAnchor2 = sprgai.cfr_renamed_2273((X509Certificate)object2.get(object2.size() - 1), sprgak5.cfr_renamed_9129(), sprgak5.cfr_renamed_9097());
            if (trustAnchor2 == null) {
                throw new CertPathValidatorException(sprouaa.cfr_renamed_9("x1Y0XcM-O+C1\f%C1\f I1X*J*O\"X*C-\f3M7DcB,XcJ,Y-Hm"), null, arg0, -1);
            }
            sprpsh.cfr_renamed_9131(trustAnchor2.getTrustedCert());
        }
        catch (sprlhi sprlhi2) {
            throw new CertPathValidatorException(sprlhi2.getMessage(), sprlhi2.cfr_renamed_584(), arg0, object.size() - 1);
        }
        sprgak5 = new sprmdk(sprgak5).cfr_renamed_9132(trustAnchor2).cfr_renamed_1451();
        int n6 = 0;
        List[] listArray = new ArrayList[n5 + 1];
        int n7 = n4 = 0;
        while (n7 < listArray.length) {
            listArray[n4++] = new ArrayList();
            n7 = n4;
        }
        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("2.5.29.32.0");
        sprbrh sprbrh2 = new sprbrh(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
        listArray[0].add(sprbrh2);
        sprerh sprerh2 = new sprerh();
        HashSet hashSet4 = new HashSet();
        if (sprgak5.cfr_renamed_9095()) {
            n3 = 0;
            sprgak3 = sprgak5;
        } else {
            n3 = n5 + 1;
            sprgak3 = sprgak5;
        }
        if (sprgak3.cfr_renamed_9134()) {
            n2 = 0;
            sprgak2 = sprgak5;
        } else {
            n2 = n5 + 1;
            sprgak2 = sprgak5;
        }
        if (sprgak2.cfr_renamed_9135()) {
            n = 0;
            trustAnchor = trustAnchor2;
        } else {
            n = n5 + 1;
            trustAnchor = trustAnchor2;
        }
        X509Certificate x509Certificate = trustAnchor.getTrustedCert();
        try {
            if (x509Certificate != null) {
                X509Certificate x509Certificate2 = x509Certificate;
                sprnbm2 = sprooh.cfr_renamed_282(x509Certificate2);
                publicKey = x509Certificate2.getPublicKey();
            } else {
                TrustAnchor trustAnchor3 = trustAnchor2;
                sprnbm2 = sprooh.cfr_renamed_9126(trustAnchor3);
                publicKey = trustAnchor3.getCAPublicKey();
            }
        }
        catch (RuntimeException runtimeException) {
            throw new sprxbi(sprvnj.cfr_renamed_9("\u007f}NbIkX(Cn\f|^}_|\fiBkDg^(OgYdH(BgX(Nm\f ^m\u0005mBkClIl\u0002"), (Throwable)runtimeException, arg0, -1);
        }
        sprddm sprddm2 = null;
        try {
            sprddm2 = sprgai.cfr_renamed_283(publicKey);
        }
        catch (CertPathValidatorException certPathValidatorException) {
            throw new sprxbi(sprouaa.cfr_renamed_9("\u0002@$C1E7D.\f*H&B7E%E&^cC%\f3Y!@*OcG&UcC%\f7^6_7\f\"B D,^cO,Y/HcB,XcN&\f1I\"Hm"), (Throwable)certPathValidatorException, arg0, -1);
        }
        sprlem sprlem2 = sprddm2.cfr_renamed_593();
        sprco sprco2 = sprddm2.cfr_renamed_284();
        int n8 = n5;
        if (sprgak5.cfr_renamed_397() != null && !sprgak5.cfr_renamed_397().cfr_renamed_9136((X509Certificate)object.get(0))) {
            throw new sprxbi(sprvnj.cfr_renamed_9("\\MzKmX(Om^|EnEkM|I(Ef\fkIzXaJaOiXaCf\fxM|D(HgI{\ffC|\feM|O`\f|MzKmXKCf_|^iEfX{\u0002"), null, arg0, 0);
        }
        List list = sprgak5.cfr_renamed_9133();
        Iterator iterator2 = iterator = list.iterator();
        while (iterator2.hasNext()) {
            ((PKIXCertPathChecker)iterator.next()).init(false);
            iterator2 = iterator;
        }
        sprkyh sprkyh2 = sprgak5.cfr_renamed_9073() ? new sprkyh(this.cfr_renamed_4) : null;
        X509Certificate x509Certificate3 = null;
        int n9 = n6 = object.size() - 1;
        while (n9 >= 0) {
            int n10 = n5 - n6;
            x509Certificate3 = (X509Certificate)object.get(n6);
            boolean bl = n6 == object.size() - 1;
            try {
                sprpsh.cfr_renamed_9131(x509Certificate3);
            }
            catch (sprlhi sprlhi3) {
                throw new CertPathValidatorException(sprlhi3.getMessage(), sprlhi3.cfr_renamed_584(), arg0, n6);
            }
            sprmuh.cfr_renamed_9096(arg0, sprgak5, date2, sprkyh2, n6, publicKey, bl, sprnbm2, x509Certificate);
            CertPath certPath2 = arg0;
            CertPath certPath3 = arg0;
            sprmuh.cfr_renamed_9084(certPath3, n6, sprerh2, this.cfr_renamed_3);
            sprbrh2 = sprmuh.cfr_renamed_9086(certPath2, n6, hashSet4, sprbrh2, listArray, n2, this.cfr_renamed_3);
            sprbrh2 = sprmuh.cfr_renamed_9092(certPath3, n6, sprbrh2);
            sprmuh.cfr_renamed_9090(certPath2, n6, sprbrh2, n3);
            if (n10 != n5) {
                if (x509Certificate3 != null && x509Certificate3.getVersion() == 1) {
                    if (n10 != 1 || !x509Certificate3.equals(trustAnchor2.getTrustedCert())) {
                        throw new CertPathValidatorException(sprouaa.cfr_renamed_9("z&^0E,Bc\u001dcO&^7E%E M7I0\f M-\u000b7\f!IcY0I'\f\"_co\u0002\f,B&_m"), null, arg0, n6);
                    }
                } else {
                    CertPath certPath4;
                    HashSet hashSet5;
                    CertPath certPath5 = arg0;
                    CertPath certPath6 = arg0;
                    sprmuh.cfr_renamed_2218(certPath6, n6);
                    sprbrh2 = sprmuh.cfr_renamed_9093(certPath5, n6, listArray, sprbrh2, n);
                    sprmuh.cfr_renamed_9091(certPath6, n6, sprerh2);
                    n3 = sprmuh.cfr_renamed_2197(certPath5, n6, n3);
                    n = sprmuh.cfr_renamed_2217(certPath5, n6, n);
                    n2 = sprmuh.cfr_renamed_2196(certPath5, n6, n2);
                    n3 = sprmuh.cfr_renamed_2220(certPath5, n6, n3);
                    n = sprmuh.cfr_renamed_2191(certPath5, n6, n);
                    n2 = sprmuh.cfr_renamed_2190(certPath5, n6, n2);
                    sprmuh.cfr_renamed_2212(certPath5, n6);
                    n8 = sprmuh.cfr_renamed_2221(certPath5, n6, n8);
                    n8 = sprmuh.cfr_renamed_2216(certPath5, n6, n8);
                    sprmuh.cfr_renamed_2192(certPath5, n6);
                    hashSet2 = x509Certificate3.getCriticalExtensionOIDs();
                    if (hashSet2 != null) {
                        hashSet5 = new HashSet(hashSet2);
                        hashSet2 = hashSet5;
                        certPath4 = arg0;
                        hashSet2.remove(sprmuh.cfr_renamed_91);
                        hashSet2.remove(sprmuh.cfr_renamed_2);
                        hashSet2.remove(sprmuh.cfr_renamed_114);
                        hashSet2.remove(sprmuh.cfr_renamed_132);
                        hashSet2.remove(sprmuh.cfr_renamed_152);
                        hashSet2.remove(sprmuh.cfr_renamed_112);
                        hashSet2.remove(sprmuh.cfr_renamed_4);
                        hashSet2.remove(sprmuh.cfr_renamed_79);
                        hashSet2.remove(sprmuh.cfr_renamed_107);
                        hashSet2.remove(sprmuh.cfr_renamed_105);
                    } else {
                        hashSet5 = new HashSet();
                        hashSet2 = hashSet5;
                        certPath4 = arg0;
                    }
                    sprmuh.cfr_renamed_2208(certPath4, n6, hashSet2, list);
                    x509Certificate = x509Certificate3;
                    sprnbm2 = sprooh.cfr_renamed_282(x509Certificate);
                    try {
                        publicKey = sprgai.cfr_renamed_7313(arg0.getCertificates(), n6, this.cfr_renamed_4);
                    }
                    catch (CertPathValidatorException certPathValidatorException) {
                        throw new CertPathValidatorException(sprvnj.cfr_renamed_9("FIpX([g^cEfK(GmU(OgYdH(BgX(Nm\fzI|^aI~Il\u0002"), (Throwable)certPathValidatorException, arg0, n6);
                    }
                    sprddm2 = sprgai.cfr_renamed_283(publicKey);
                    sprlem2 = sprddm2.cfr_renamed_593();
                    sprco2 = sprddm2.cfr_renamed_284();
                }
            }
            n9 = --n6;
        }
        n3 = sprmuh.cfr_renamed_2193(n3, x509Certificate3);
        n3 = sprmuh.cfr_renamed_2210(arg0, n6 + 1, n3);
        Set<String> set2 = x509Certificate3.getCriticalExtensionOIDs();
        if (set2 != null) {
            hashSet = new HashSet<String>(set2);
            set2 = hashSet;
            certPath = arg0;
            set2.remove(sprmuh.cfr_renamed_91);
            set2.remove(sprmuh.cfr_renamed_2);
            set2.remove(sprmuh.cfr_renamed_114);
            set2.remove(sprmuh.cfr_renamed_132);
            set2.remove(sprmuh.cfr_renamed_152);
            set2.remove(sprmuh.cfr_renamed_112);
            set2.remove(sprmuh.cfr_renamed_4);
            set2.remove(sprmuh.cfr_renamed_79);
            set2.remove(sprmuh.cfr_renamed_107);
            set2.remove(sprmuh.cfr_renamed_105);
            set2.remove(sprmuh.cfr_renamed_137);
            set2.remove(sprrdm.cfr_renamed_114.cfr_renamed_19());
        } else {
            hashSet = new HashSet<String>();
            set2 = hashSet;
            certPath = arg0;
        }
        sprmuh.cfr_renamed_2198(certPath, n6 + 1, list, set2);
        hashSet2 = sprmuh.cfr_renamed_9094(arg0, sprgak5, set, n6 + 1, listArray, sprbrh2, hashSet4);
        if (n3 > 0 || hashSet2 != null) {
            return new PKIXCertPathValidatorResult(trustAnchor2, (PolicyNode)((Object)hashSet2), x509Certificate3.getPublicKey());
        }
        throw new CertPathValidatorException(sprouaa.cfr_renamed_9("\u0013M7Dc\\1C I0_*B$\f%M*@&HcC-\f3C/E Um"), null, arg0, n6);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 3;
        int cfr_ignored_0 = 4 << 3 ^ 1;
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

    public sprpsh(boolean bl) {
        sprpsh sprpsh2 = this;
        this.cfr_renamed_4 = new sprdki();
        this.cfr_renamed_3 = bl;
    }
}

