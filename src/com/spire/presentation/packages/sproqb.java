/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartRotationThreeD;
import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.sprasb;
import com.spire.presentation.packages.sprefe;
import com.spire.presentation.packages.sprfua;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprgmb;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprmae;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmqa;
import com.spire.presentation.packages.sprosb;
import com.spire.presentation.packages.sprreaa;
import com.spire.presentation.packages.sprssa;
import com.spire.presentation.packages.sprtae;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprwmb;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryke;
import com.spire.presentation.packages.sprz;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sproqb {
    private static final String cfr_renamed_1;
    private static final String cfr_renamed_2;
    private static final String cfr_renamed_3;
    private static final String cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2159(sprz arg0, sprlsa arg1, X509Certificate arg2, Date arg3, List arg4) throws CertPathValidatorException {
        if (!arg1.isRevocationEnabled()) return;
        if (arg0.getExtensionValue(cfr_renamed_1) == null) {
            boolean bl;
            Object object;
            sprakb sprakb2;
            sprasb sprasb2;
            sprosb sprosb2;
            block20: {
                sprlsa sprlsa2;
                sprefe sprefe2 = null;
                try {
                    sprefe2 = sprefe.cfr_renamed_23(sprmqa.cfr_renamed_292(arg0, cfr_renamed_4));
                }
                catch (sprakb sprakb3) {
                    throw new CertPathValidatorException(sprreaa.cfr_renamed_9("%=*O\u0002\u0006\u0015\u001b\u0014\u0006\u0004\u001a\u0012\u0006\t\u0001F\u001f\t\u0006\b\u001bF\n\u001e\u001b\u0003\u0001\u0015\u0006\t\u0001F\f\t\u001a\n\u000bF\u0001\t\u001bF\r\u0003O\u0014\n\u0007\u000bH"), sprakb3);
                }
                {
                    sprmqa.cfr_renamed_2160(sprefe2, arg1);
                }
                sprosb2 = new sprosb();
                sprasb2 = new sprasb();
                sprakb2 = null;
                boolean bl2 = false;
                if (sprefe2 != null) {
                    object = null;
                    try {
                        object = sprefe2.cfr_renamed_322();
                    }
                    catch (Exception exception) {
                        throw new sprgmb(sprreaa.cfr_renamed_9("+\u000f\u001c\u0012\u001d\u000f\r\u0013\u001b\u000f\u0000\bO\u0016\u0000\u000f\u0001\u0012\u001cF\f\t\u001a\n\u000bF\u0001\t\u001bF\r\u0003O\u0014\n\u0007\u000bH"), exception);
                    }
                    try {
                        for (int i = 0; i < ((spryke[])object).length && sprosb2.cfr_renamed_2161() == 11 && !sprasb2.cfr_renamed_2162(); ++i) {
                            sprlsa2 = (sprlsa)arg1.clone();
                            spryke spryke2 = object[i];
                            sproqb.cfr_renamed_2163(spryke2, arg0, sprlsa2, arg3, arg2, sprosb2, sprasb2, arg4);
                            bl2 = true;
                        }
                    }
                    catch (sprakb sprakb4) {
                        sprakb2 = new sprakb(ChartRotationThreeD.cfr_renamed_9("qH\u001fQ^KVC\u001fdmk\u001fAPU\u001fCVTKUVEJSVHQ\u0007OHVIK\u0007YHJI[\t"), sprakb4);
                    }
                }
                if (sprosb2.cfr_renamed_2161() == 11 && !sprasb2.cfr_renamed_2162()) {
                    try {
                        object = null;
                        try {
                            object = new sprgle(((X500Principal)arg0.cfr_renamed_102().cfr_renamed_271()[0]).getEncoded()).cfr_renamed_24();
                        }
                        catch (Exception exception) {
                            throw new sprakb(sprreaa.cfr_renamed_9("/\u001c\u0015\u001a\u0003\u001dF\t\u0014\u0000\u000bO\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u0000\u0000\u0014O%=*O\u0005\u0000\u0013\u0003\u0002O\b\u0000\u0012O\u0004\nF\u001d\u0003\n\b\f\t\u000b\u0003\u000bH"), exception);
                        }
                        spryke spryke3 = new spryke(new sprtae(0, new spryee(new sprmee(4, (spra)object))), null, null);
                        sprlsa2 = (sprlsa)arg1.clone();
                        sproqb.cfr_renamed_2163(spryke3, arg0, sprlsa2, arg3, arg2, sprosb2, sprasb2, arg4);
                        bl = bl2 = true;
                        break block20;
                    }
                    catch (sprakb sprakb5) {
                        sprakb2 = new sprakb(ChartRotationThreeD.cfr_renamed_9("qH\u001fQ^KVC\u001fdmk\u001fAPU\u001fCVTKUVEJSVHQ\u0007OHVIK\u0007YHJI[\t"), sprakb5);
                    }
                }
                bl = bl2;
            }
            if (!bl) {
                throw new sprgmb(sprreaa.cfr_renamed_9("(\u0000F\u0019\u0007\u0003\u000f\u000bF,4#F\t\t\u001a\b\u000bH"), sprakb2);
            }
            if (sprosb2.cfr_renamed_2161() != 11) {
                object = new StringBuilder().insert(0, ChartRotationThreeD.cfr_renamed_9("fKSMN]RKB\u001fDZUKNYN\\FKB\u001fUZQPD^SVHQ\u0007^AKBM\u0007")).append(sprosb2.cfr_renamed_2139()).toString();
                object = new StringBuilder().insert(0, (String)object).append(sprreaa.cfr_renamed_9("CF\u001d\u0003\u000e\u0015\u0000\bUF")).append(sprwmb.cfr_renamed_86[sprosb2.cfr_renamed_2161()]).toString();
                throw new CertPathValidatorException((String)object);
            }
            if (!sprasb2.cfr_renamed_2162() && sprosb2.cfr_renamed_2161() == 11) {
                sprosb2.cfr_renamed_2164(12);
            }
            if (sprosb2.cfr_renamed_2161() != 12) return;
            throw new CertPathValidatorException(ChartRotationThreeD.cfr_renamed_9("fKSMN]RKB\u001fDZUKNYN\\FKB\u001fTKFKRL\u0007\\HJK[\u0007QHK\u0007]B\u001fCZSZURNQB[\t"));
        }
        if (arg0.getExtensionValue(cfr_renamed_4) == null && arg0.getExtensionValue(cfr_renamed_3) == null) return;
        throw new CertPathValidatorException(sprreaa.cfr_renamed_9("(\u0000F\u001d\u0003\u0019F\u000e\u0010\u000e\u000f\u0003F\n\u001e\u001b\u0003\u0001\u0015\u0006\t\u0001F\u0006\u0015O\u0015\n\u0012CF\r\u0013\u001bF\u000e\n\u001c\tO\u0007\u0001F.%O\u0014\n\u0010\u0000\u0005\u000e\u0012\u0006\t\u0001F\u001f\t\u0006\b\u001b\u0003\u001dH"));
    }

    private static /* synthetic */ void cfr_renamed_2163(spryke arg0, sprz arg1, sprlsa arg2, Date arg3, X509Certificate arg4, sprosb arg5, sprasb arg6, List arg7) throws sprakb {
        Iterator iterator;
        if (arg1.getExtensionValue(sprude.cfr_renamed_107.cfr_renamed_19()) != null) {
            return;
        }
        Date date = new Date(System.currentTimeMillis());
        if (arg3.getTime() > date.getTime()) {
            throw new sprakb(ChartRotationThreeD.cfr_renamed_9("q^KVC^SVHQ\u0007KNRB\u001fNL\u0007VI\u001fAJSJUZ\t"));
        }
        Set set = sprmqa.cfr_renamed_2165(arg0, arg1, date, arg2);
        boolean bl = false;
        sprakb sprakb2 = null;
        Iterator iterator2 = iterator = set.iterator();
        while (iterator2.hasNext() && arg5.cfr_renamed_2161() == 11 && !arg6.cfr_renamed_2162()) {
            sprasb sprasb2;
            X509CRL x509CRL;
            block10: {
                x509CRL = (X509CRL)iterator.next();
                sprasb2 = sprwmb.cfr_renamed_2166(x509CRL, arg0);
                if (sprasb2.cfr_renamed_2167(arg6)) break block10;
                iterator2 = iterator;
            }
            try {
                X509CRL x509CRL2 = x509CRL;
                PublicKey publicKey = sprwmb.cfr_renamed_2168(x509CRL2, sprwmb.cfr_renamed_2169(x509CRL2, arg1, null, null, arg2, arg7));
                X509CRL x509CRL3 = null;
                if (arg2.cfr_renamed_391()) {
                    x509CRL3 = sprwmb.cfr_renamed_2170(sprmqa.cfr_renamed_2171(date, arg2, x509CRL), publicKey);
                }
                if (arg2.cfr_renamed_376() != 1 && arg1.cfr_renamed_86().getTime() < x509CRL.getThisUpdate().getTime()) {
                    throw new sprakb(sprreaa.cfr_renamed_9("!\tO\u0010\u000e\n\u0006\u0002O%=*O\u0000\u0000\u0014O\u0005\u001a\u0014\u001d\u0003\u0001\u0012O\u0012\u0006\u000b\nF\t\t\u001a\b\u000bH"));
                }
                sprz sprz2 = arg1;
                sprwmb.cfr_renamed_2172(arg0, sprz2, x509CRL);
                sprwmb.cfr_renamed_2173(arg0, sprz2, x509CRL);
                X509CRL x509CRL4 = x509CRL;
                sprwmb.cfr_renamed_2174(x509CRL3, x509CRL4, arg2);
                Date date2 = arg3;
                sprwmb.cfr_renamed_2175(date2, x509CRL3, arg1, arg5, arg2);
                sprwmb.cfr_renamed_2176(date2, x509CRL4, arg1, arg5);
                if (arg5.cfr_renamed_2161() == 8) {
                    arg5.cfr_renamed_2164(11);
                }
                arg6.cfr_renamed_2177(sprasb2);
                bl = true;
                iterator2 = iterator;
            }
            catch (sprakb sprakb3) {
                sprakb2 = sprakb3;
                iterator2 = iterator;
            }
        }
        if (!bl) {
            throw sprakb2;
        }
    }

    public static void cfr_renamed_2178(X509Certificate arg0, sprlsa arg1) throws CertPathValidatorException {
        if (arg0.getKeyUsage() != null && !arg0.getKeyUsage()[0] && !arg0.getKeyUsage()[1]) {
            throw new CertPathValidatorException(ChartRotationThreeD.cfr_renamed_9("~SKUVEJSZ\u0007\\BMSVAVD^SZ\u0007VTLRZU\u001fWJESN\\\u0007TBF\u0007\\FQIPS\u001fEZ\u0007JTZC\u001fSP\u0007IFSN[FKB\u001fCV@VS^K\u001fTV@QFKRMBL\t"));
        }
        if (arg0.getBasicConstraints() != -1) {
            throw new CertPathValidatorException(sprreaa.cfr_renamed_9("'\u001b\u0012\u001d\u000f\r\u0013\u001b\u0003O\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u000f\u001c\u0015\u001a\u0003\u001dF\u0006\u0015O\u0007\u0003\u0015\u0000F\u000eF\u001f\u0013\r\n\u0006\u0005O\r\n\u001fO\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u000f\u001c\u0015\u001a\u0003\u001dH"));
        }
    }

    static {
        cfr_renamed_2 = sprude.cfr_renamed_185.cfr_renamed_19();
        cfr_renamed_1 = sprude.cfr_renamed_107.cfr_renamed_19();
        cfr_renamed_4 = sprude.cfr_renamed_93.cfr_renamed_19();
        cfr_renamed_3 = sprude.cfr_renamed_1.cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2179(sprz arg0, CertPath arg1, CertPath arg2, sprlsa arg3) throws CertPathValidatorException {
        Set<String> set;
        Set<String> set2 = arg0.getCriticalExtensionOIDs();
        if (set2.contains(cfr_renamed_2)) {
            try {
                sprmae.cfr_renamed_23(sprmqa.cfr_renamed_292(arg0, cfr_renamed_2));
                set = set2;
            }
            catch (sprakb sprakb2) {
                throw new sprgmb(ChartRotationThreeD.cfr_renamed_9("s^UXBK\u0007VIYHMJ^SVHQ\u0007Z_KBQTVHQ\u0007\\HJK[\u0007QHK\u0007]B\u001fUZF[\t"), sprakb2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new sprgmb(sprreaa.cfr_renamed_9("2\u000e\u0014\b\u0003\u001bF\u0006\b\t\t\u001d\u000b\u000e\u0012\u0006\t\u0001F\n\u001e\u001b\u0003\u0001\u0015\u0006\t\u0001F\f\t\u001a\n\u000bF\u0001\t\u001bF\r\u0003O\u0014\n\u0007\u000bH"), illegalArgumentException);
            }
        } else {
            set = set2;
        }
        set.remove(cfr_renamed_2);
        Iterator iterator = arg3.cfr_renamed_393().iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            ((sprssa)iterator.next()).cfr_renamed_366(arg0, arg1, arg2, set2);
            iterator2 = iterator;
        }
        if (!set2.isEmpty()) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, ChartRotationThreeD.cfr_renamed_9("~SKUVEJSZ\u0007\\BMSVAVD^SZ\u0007\\HQS^NQT\u001fRQTJWOHMSZC\u001fDMNKN\\FS\u0007Z_KBQTVHQT\u0005\u0007")).append(set2).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CertPath cfr_renamed_2180(sprz arg0, sprlsa arg1) throws CertPathValidatorException {
        int n;
        Principal[] principalArray;
        Cloneable cloneable;
        CertPathBuilderResult certPathBuilderResult = null;
        HashSet hashSet = new HashSet();
        if (arg0.cfr_renamed_93().cfr_renamed_102() != null) {
            cloneable = new sprgma();
            sprz sprz2 = arg0;
            ((X509CertSelector)cloneable).setSerialNumber(sprz2.cfr_renamed_93().cfr_renamed_114());
            principalArray = sprz2.cfr_renamed_93().cfr_renamed_102();
            int n2 = n = 0;
            while (n2 < principalArray.length) {
                try {
                    if (principalArray[n] instanceof X500Principal) {
                        ((X509CertSelector)cloneable).setIssuer(((X500Principal)principalArray[n]).getEncoded());
                    }
                    hashSet.addAll(sprmqa.cfr_renamed_2181((sprgma)cloneable, arg1.cfr_renamed_385()));
                }
                catch (sprakb sprakb2) {
                    throw new sprgmb(sprreaa.cfr_renamed_9("?\u0013\r\n\u0006\u0005O\r\n\u001fO\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u0000\u0000\u0014O\u0007\u001b\u0012\u001d\u000f\r\u0013\u001b\u0003O\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u0005\u000e\b\u0001\t\u001bF\r\u0003O\u0015\n\u0007\u001d\u0005\u0007\u0003\u000bH"), sprakb2);
                }
                catch (IOException iOException) {
                    throw new sprgmb(ChartRotationThreeD.cfr_renamed_9("jI^ESB\u001fSP\u0007ZI\\H[B\u001f\u007f\n\u0017\u000f\u0007OUVI\\NOFS\t"), iOException);
                }
                n2 = ++n;
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException(sprreaa.cfr_renamed_9("?\u0013\r\n\u0006\u0005O\r\n\u001fO\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u0015\u001f\u0003\f\u000f\t\u000f\n\u0002O\u000f\u0001F\r\u0007\u001c\u0003O\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O/+F\t\t\u001dF\u000e\u0012\u001b\u0014\u0006\u0004\u001a\u0012\nF\f\u0003\u001d\u0012\u0006\u0000\u0006\u0005\u000e\u0012\nF\f\u0007\u0001\b\u0000\u0012O\u0004\nF\t\t\u001a\b\u000bH"));
            }
        }
        if (arg0.cfr_renamed_93().cfr_renamed_238() != null) {
            cloneable = new sprgma();
            principalArray = arg0.cfr_renamed_93().cfr_renamed_238();
            int n3 = n = 0;
            while (n3 < principalArray.length) {
                try {
                    if (principalArray[n] instanceof X500Principal) {
                        ((X509CertSelector)cloneable).setIssuer(((X500Principal)principalArray[n]).getEncoded());
                    }
                    hashSet.addAll(sprmqa.cfr_renamed_2181((sprgma)cloneable, arg1.cfr_renamed_385()));
                }
                catch (sprakb sprakb3) {
                    throw new sprgmb(ChartRotationThreeD.cfr_renamed_9("oR]KVD\u001fLZ^\u001fDZUKNYN\\FKB\u001fAPU\u001fFKSMN]RKB\u001fDZUKNYN\\FKB\u001fD^IQHK\u0007]B\u001fTZFMDWB[\t"), sprakb3);
                }
                catch (IOException iOException) {
                    throw new sprgmb(sprreaa.cfr_renamed_9(":\b\u000e\u0004\u0003\u0003O\u0012\u0000F\n\b\f\t\u000b\u0003O>ZV_F\u001f\u0014\u0006\b\f\u000f\u001f\u0007\u0003H"), iOException);
                }
                n3 = ++n;
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException(ChartRotationThreeD.cfr_renamed_9("oR]KVD\u001fLZ^\u001fDZUKNYN\\FKB\u001fTOB\\NYNZC\u001fNQ\u0007ZIKNK^\u001fI^JZ\u0007YHM\u0007^SKUVEJSZ\u0007\\BMSVAVD^SZ\u0007\\FQIPS\u001fEZ\u0007YHJI[\t"));
            }
        }
        cloneable = (sprfua)sprfua.cfr_renamed_382(arg1);
        principalArray = null;
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            sprgma sprgma2 = new sprgma();
            sprgma2.setCertificate((X509Certificate)iterator.next());
            ((sprlsa)cloneable).cfr_renamed_396(sprgma2);
            CertPathBuilder certPathBuilder = null;
            try {
                certPathBuilder = CertPathBuilder.getInstance(sprreaa.cfr_renamed_9("?-&>"), "BC");
            }
            catch (NoSuchProviderException noSuchProviderException) {
                throw new sprgmb(ChartRotationThreeD.cfr_renamed_9("tJWOHMS\u001fDSFLT\u001fDPRSC\u001fIPS\u001fEZ\u0007\\UZFKB[\t"), noSuchProviderException);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new sprgmb(sprreaa.cfr_renamed_9("5\u001a\u0016\u001f\t\u001d\u0012O\u0005\u0003\u0007\u001c\u0015O\u0005\u0000\u0013\u0003\u0002O\b\u0000\u0012O\u0004\nF\f\u0014\n\u0007\u001b\u0003\u000bH"), noSuchAlgorithmException);
            }
            {
                certPathBuilderResult = certPathBuilder.build(sprfua.cfr_renamed_382((PKIXParameters)cloneable));
            }
        }
        if (principalArray != null) {
            throw principalArray;
        }
        return certPathBuilderResult.getCertPath();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CertPathValidatorResult cfr_renamed_2182(CertPath arg0, sprlsa arg1) throws CertPathValidatorException {
        CertPathValidator certPathValidator = null;
        try {
            certPathValidator = CertPathValidator.getInstance(sprreaa.cfr_renamed_9("?-&>"), "BC");
            return certPathValidator.validate(arg0, arg1);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprgmb(ChartRotationThreeD.cfr_renamed_9("tJWOHMS\u001fDSFLT\u001fDPRSC\u001fIPS\u001fEZ\u0007\\UZFKB[\t"), noSuchProviderException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprgmb(sprreaa.cfr_renamed_9("5\u001a\u0016\u001f\t\u001d\u0012O\u0005\u0003\u0007\u001c\u0015O\u0005\u0000\u0013\u0003\u0002O\b\u0000\u0012O\u0004\nF\f\u0014\n\u0007\u001b\u0003\u000bH"), noSuchAlgorithmException);
        }
    }

    public static void cfr_renamed_2183(X509Certificate arg0, sprlsa arg1) throws CertPathValidatorException {
        Set set = arg1.cfr_renamed_392();
        boolean bl = false;
        for (TrustAnchor trustAnchor : set) {
            if (!arg0.getSubjectX500Principal().getName(sprreaa.cfr_renamed_9("4)%]TZU")).equals(trustAnchor.getCAName()) && !arg0.equals(trustAnchor.getTrustedCert())) continue;
            bl = true;
        }
        if (!bl) {
            throw new CertPathValidatorException(ChartRotationThreeD.cfr_renamed_9("fKSMN]RKB\u001fDZUKNYN\\FKB\u001fNLTJBM\u0007VT\u001fIPS\u001fCVUZDKKF\u0007KUJTKB[\t"));
        }
    }

    public static void cfr_renamed_2184(sprz arg0, sprlsa arg1) throws CertPathValidatorException {
        for (String string : arg1.cfr_renamed_378()) {
            if (arg0.cfr_renamed_112(string) == null) continue;
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprreaa.cfr_renamed_9("'\u001b\u0012\u001d\u000f\r\u0013\u001b\u0003O\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u0005\u0000\b\u001b\u0007\u0006\b\u001cF\u001f\u0014\u0000\u000e\u0006\u0004\u0006\u0012\n\u0002O\u0007\u001b\u0012\u001d\u000f\r\u0013\u001b\u0003UF")).append(string).append(".").toString());
        }
        for (String string : arg1.cfr_renamed_395()) {
            if (arg0.cfr_renamed_112(string) != null) continue;
            throw new CertPathValidatorException(new StringBuilder().insert(0, ChartRotationThreeD.cfr_renamed_9("~SKUVEJSZ\u0007\\BMSVAVD^SZ\u0007[HZT\u001fIPS\u001fDPIKFVI\u001fIZDZTLFM^\u001fFKSMN]RKB\u0005\u0007")).append(string).append(".").toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2185(sprz arg0, sprlsa arg1) throws CertPathValidatorException {
        try {
            arg0.cfr_renamed_96(sprmqa.cfr_renamed_364(arg1));
            return;
        }
        catch (CertificateExpiredException certificateExpiredException) {
            throw new sprgmb(sprreaa.cfr_renamed_9("'\u001b\u0012\u001d\u000f\r\u0013\u001b\u0003O\u0005\n\u0014\u001b\u000f\t\u000f\f\u0007\u001b\u0003O\u000f\u001cF\u0001\t\u001bF\u0019\u0007\u0003\u000f\u000bH"), certificateExpiredException);
        }
        catch (CertificateNotYetValidException certificateNotYetValidException) {
            throw new sprgmb(ChartRotationThreeD.cfr_renamed_9("fKSMN]RKB\u001fDZUKNYN\\FKB\u001fNL\u0007QHK\u0007IFSN[\t"), certificateNotYetValidException);
        }
    }
}

