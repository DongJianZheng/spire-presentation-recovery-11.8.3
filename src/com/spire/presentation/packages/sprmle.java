/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranj;
import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprbrh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhve;
import com.spire.presentation.packages.sprile;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprloe;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprvbz;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxbi;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryim;
import com.spire.presentation.packages.spryue;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprmle {
    public static final int cfr_renamed_79 = 6;
    public static final String cfr_renamed_107;
    public static final String cfr_renamed_132;
    public static final String cfr_renamed_102;
    public static final String cfr_renamed_93;
    public static final String cfr_renamed_86;
    public static final String cfr_renamed_152 = "2.5.29.32.0";
    public static final String cfr_renamed_112;
    public static final String cfr_renamed_119;
    public static final String[] cfr_renamed_91;
    public static final String cfr_renamed_0;
    public static final int cfr_renamed_1 = 5;
    public static final String cfr_renamed_2;
    public static final String cfr_renamed_3;
    public static final String cfr_renamed_4;

    public static boolean cfr_renamed_342(Set arg0) {
        return arg0 == null || arg0.contains(cfr_renamed_152) || arg0.isEmpty();
    }

    public static X500Principal cfr_renamed_282(X509Certificate arg0) {
        return arg0.getSubjectX500Principal();
    }

    public static Date cfr_renamed_5077(PKIXParameters arg0, Date arg1) {
        Date date = arg0.getDate();
        if (null == date) {
            return arg1;
        }
        return date;
    }

    public static void cfr_renamed_280(X509Certificate arg0, PublicKey arg1, String arg2) throws GeneralSecurityException {
        if (arg2 == null) {
            arg0.verify(arg1);
            return;
        }
        arg0.verify(arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprddm cfr_renamed_283(PublicKey arg0) throws CertPathValidatorException {
        try {
            sprrzm sprrzm2 = new sprrzm(arg0.getEncoded());
            return sprvhm.cfr_renamed_23(sprrzm2.cfr_renamed_24()).cfr_renamed_1473();
        }
        catch (Exception exception) {
            throw new sprxbi(sprzra.cfr_renamed_9("13\u0000,\u0007%\u0016f\u00123\u0000*\u000b%B-\u0007?B%\u0003(\f)\u0016f\u0000#B\"\u0007%\r\"\u0007\"L"), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_2130(X509CRL arg0) throws CRLException {
        try {
            byte[] byArray = arg0.getExtensionValue(sprrdm.cfr_renamed_96.cfr_renamed_19());
            return byArray != null && sprwzl.cfr_renamed_23(sproug.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_2131();
        }
        catch (Exception exception) {
            throw new CRLException(new StringBuilder().insert(0, sprvbz.cfr_renamed_9("g?A\"R3K(LgP\"C#K)Egk4Q2K)E\u0003K4V5K%W3K(L\u0017M.L3\u0018g")).append(exception).toString());
        }
    }

    public static boolean cfr_renamed_5080(int arg0, List[] arg1, sprlem arg2, Set arg3) {
        int n;
        List list = arg1[arg0 - 1];
        int n2 = n = 0;
        while (n2 < list.size()) {
            sprbrh sprbrh2 = (sprbrh)list.get(n);
            if (sprbrh2.getExpectedPolicies().contains(arg2.cfr_renamed_19())) {
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add(arg2.cfr_renamed_19());
                sprbrh sprbrh3 = new sprbrh(new ArrayList(), arg0, hashSet, sprbrh2, arg3, arg2.cfr_renamed_19(), false);
                sprbrh2.cfr_renamed_5082(sprbrh3);
                arg1[arg0].add(sprbrh3);
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_5093(spryue arg0, List arg1) throws sprlhi {
        HashSet hashSet = new HashSet();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (!(e instanceof sprile)) continue;
            sprile sprile2 = (sprile)e;
            try {
                hashSet.addAll(sprile2.cfr_renamed_3216((sprhd)arg0));
            }
            catch (sprine sprine2) {
                throw new sprlhi(sprzra.cfr_renamed_9("\u0016\u0010)\u0000*\u0007+B1\n/\u000e#B6\u000b%\t/\f!B%\u00074\u0016/\u0004/\u0001'\u0016#\u0011f\u00044\r+B\u001eLsR\u007fB5\u0016)\u0010#L"), sprine2);
            }
        }
        return hashSet;
    }

    public static void cfr_renamed_339(int arg0, List[] arg1, String arg2, Map arg3, X509Certificate arg4) throws sprlhi, CertPathValidatorException {
        boolean bl;
        block11: {
            boolean bl2 = false;
            for (sprbrh sprbrh2 : arg1[arg0]) {
                if (!sprbrh2.getValidPolicy().equals(arg2)) continue;
                bl2 = true;
                sprbrh2.cfr_renamed_5094((Set)arg3.get(arg2));
                bl = bl2;
                break block11;
            }
            bl = bl2;
        }
        if (!bl) {
            for (sprbrh sprbrh2 : arg1[arg0]) {
                sprbrh sprbrh3;
                if (!cfr_renamed_152.equals(sprbrh2.getValidPolicy())) continue;
                Set set = null;
                sprszm sprszm2 = null;
                try {
                    sprszm2 = sprcen.cfr_renamed_23(sprmle.cfr_renamed_292(arg4, cfr_renamed_3));
                }
                catch (Exception exception) {
                    throw new sprlhi(sprvbz.cfr_renamed_9("\u0004G5V.D.A&V\"\u00027M+K$K\"QgA&L)M3\u0002%GgF\"A(F\"Fi"), exception);
                }
                Enumeration enumeration = sprszm2.cfr_renamed_329();
                while (enumeration.hasMoreElements()) {
                    sprdcm sprdcm2 = null;
                    try {
                        sprdcm2 = sprdcm.cfr_renamed_23(enumeration.nextElement());
                    }
                    catch (Exception exception) {
                        throw new sprlhi(sprzra.cfr_renamed_9("2)\u000e/\u0001?B/\f \r4\u000f'\u0016/\r(B%\u0003(\f)\u0016f\u0000#B\"\u0007%\r\"\u0007\"L"), exception);
                    }
                    if (!cfr_renamed_152.equals(sprdcm2.cfr_renamed_330().cfr_renamed_19())) continue;
                    try {
                        set = sprmle.cfr_renamed_5079(sprdcm2.cfr_renamed_332());
                        break;
                    }
                    catch (CertPathValidatorException certPathValidatorException) {
                        throw new sprxbi(sprvbz.cfr_renamed_9("\u0017M+K$[gS2C+K!K\"PgK)D(\u00024G3\u0002$M2N#\u0002)M3\u0002%Gg@2K+Vi"), certPathValidatorException);
                    }
                }
                boolean bl3 = false;
                if (arg4.getCriticalExtensionOIDs() != null) {
                    bl3 = arg4.getCriticalExtensionOIDs().contains(cfr_renamed_3);
                }
                if (!cfr_renamed_152.equals((sprbrh3 = (sprbrh)sprbrh2.getParent()).getValidPolicy())) break;
                sprbrh sprbrh4 = new sprbrh(new ArrayList(), arg0, (Set)arg3.get(arg2), sprbrh3, set, arg2, bl3);
                sprbrh3.cfr_renamed_5082(sprbrh4);
                arg1[arg0].add(sprbrh4);
                return;
            }
        }
    }

    public static sprbrh cfr_renamed_5084(int arg0, List[] arg1, String arg2, sprbrh arg3) {
        Iterator iterator = arg1[arg0].iterator();
        while (iterator.hasNext()) {
            sprbrh sprbrh2 = (sprbrh)iterator.next();
            if (!sprbrh2.getValidPolicy().equals(arg2)) continue;
            ((sprbrh)sprbrh2.getParent()).cfr_renamed_5095(sprbrh2);
            iterator.remove();
            int n = arg0 - 1;
            while (n >= 0) {
                sprbrh sprbrh3;
                int n2;
                int n3;
                List list = arg1[n3];
                int n4 = n2 = 0;
                while (n4 < list.size() && ((sprbrh3 = (sprbrh)list.get(n2)).cfr_renamed_336() || (arg3 = sprmle.cfr_renamed_5083(arg3, arg1, sprbrh3)) != null)) {
                    n4 = ++n2;
                }
                n = --n3;
            }
        }
        return arg3;
    }

    public static sprxgf cfr_renamed_292(X509Extension arg0, String arg1) throws sprlhi {
        byte[] byArray = arg0.getExtensionValue(arg1);
        if (byArray == null) {
            return null;
        }
        return sprmle.cfr_renamed_2338(arg1, byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_5096(Date arg0, X509CRL arg1, Object arg2, sprloe arg3) throws sprlhi {
        int n;
        Object object;
        boolean bl;
        X509CRLEntry x509CRLEntry = null;
        try {
            bl = sprmle.cfr_renamed_2130(arg1);
        }
        catch (CRLException cRLException) {
            throw new sprlhi(sprzra.cfr_renamed_9("\u0000\u0003/\u000e#\u0006f\u0001.\u0007%\tf\u0004)\u0010f\u000b(\u0006/\u0010#\u00012B\u00050\nL"), cRLException);
        }
        if (bl) {
            x509CRLEntry = arg1.getRevokedCertificate(sprmle.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
            object = x509CRLEntry.getCertificateIssuer();
            if (object == null) {
                object = sprmle.cfr_renamed_305(arg1);
            }
            if (!sprmle.cfr_renamed_302(arg2).equals(object)) {
                return;
            }
        } else {
            if (!sprmle.cfr_renamed_302(arg2).equals(sprmle.cfr_renamed_305(arg1))) {
                return;
            }
            x509CRLEntry = arg1.getRevokedCertificate(sprmle.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
        }
        object = null;
        if (x509CRLEntry.hasExtensions()) {
            try {
                object = sprqvg.cfr_renamed_23(sprmle.cfr_renamed_292(x509CRLEntry, spryim.cfr_renamed_185.cfr_renamed_19()));
            }
            catch (Exception exception) {
                throw new sprlhi(sprvbz.cfr_renamed_9("\u0015G&Q(LgA(F\"\u0002\u0004p\u000b\u0002\"L3P>\u0002\"Z3G)Q.M)\u0002$M2N#\u0002)M3\u0002%GgF\"A(F\"Fi"), exception);
            }
        }
        int n2 = n = null == object ? 0 : ((sprqvg)object).cfr_renamed_5023();
        if (arg0.getTime() >= x509CRLEntry.getRevocationDate().getTime() || n == 0 || n == 1 || n == 2 || n == 10) {
            arg3.cfr_renamed_2164(n);
            arg3.cfr_renamed_2333(x509CRLEntry.getRevocationDate());
        }
    }

    static {
        cfr_renamed_3 = sprrdm.cfr_renamed_723.cfr_renamed_19();
        cfr_renamed_107 = sprrdm.cfr_renamed_133.cfr_renamed_19();
        cfr_renamed_86 = sprrdm.cfr_renamed_31.cfr_renamed_19();
        cfr_renamed_2 = sprrdm.cfr_renamed_137.cfr_renamed_19();
        cfr_renamed_4 = sprrdm.spr\ufe34.cfr_renamed_19();
        cfr_renamed_93 = sprrdm.cfr_renamed_272.cfr_renamed_19();
        cfr_renamed_112 = sprrdm.cfr_renamed_145.cfr_renamed_19();
        cfr_renamed_102 = sprrdm.cfr_renamed_96.cfr_renamed_19();
        cfr_renamed_132 = sprrdm.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_119 = sprrdm.cfr_renamed_82.cfr_renamed_19();
        cfr_renamed_0 = sprrdm.cfr_renamed_128.cfr_renamed_19();
        String[] stringArray = new String[11];
        stringArray[0] = sprzra.cfr_renamed_9("\u0017(\u00116\u0007%\u000b \u000b#\u0006");
        stringArray[1] = sprvbz.cfr_renamed_9(",G>a(O7P(O.Q\"");
        stringArray[2] = sprzra.cfr_renamed_9("%#\u0005\r+\u00124\r+\u000b5\u0007");
        stringArray[3] = sprvbz.cfr_renamed_9("C!D.N.C3K(L\u0004J&L G#");
        stringArray[4] = sprzra.cfr_renamed_9("5\u00176\u00074\u0011#\u0006#\u0006");
        stringArray[5] = sprvbz.cfr_renamed_9("A\"Q4C3K(L\bD\bR\"P&V.M)");
        stringArray[6] = sprzra.cfr_renamed_9("\u0001#\u00102\u000b \u000b%\u00032\u0007\u000e\r*\u0006");
        stringArray[7] = "unknown";
        stringArray[8] = sprvbz.cfr_renamed_9("5G*M1G\u0001P(O\u0004p\u000b");
        stringArray[9] = sprzra.cfr_renamed_9("6\u0010/\u0014/\u000e#\u0005#5/\u0016.\u00064\u00031\f");
        stringArray[10] = sprvbz.cfr_renamed_9("C\u0006a(O7P(O.Q\"");
        cfr_renamed_91 = stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_5097(sprexj arg0, List arg1) throws sprlhi {
        HashSet<Object> hashSet = new HashSet<Object>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            Object object;
            Object e = iterator.next();
            if (e instanceof sprug) {
                object = (sprug)e;
                try {
                    hashSet.addAll(object.cfr_renamed_3216(arg0));
                }
                catch (sprine sprine2) {
                    throw new sprlhi(sprzra.cfr_renamed_9("\u0016\u0010)\u0000*\u0007+B1\n/\u000e#B6\u000b%\t/\f!B%\u00074\u0016/\u0004/\u0001'\u0016#\u0011f\u00044\r+B\u001eLsR\u007fB5\u0016)\u0010#L"), sprine2);
                }
            }
            object = (CertStore)e;
            try {
                hashSet.addAll(sprexj.cfr_renamed_5098(arg0, (CertStore)object));
            }
            catch (CertStoreException certStoreException) {
                throw new sprlhi(sprvbz.cfr_renamed_9("r5M%N\"OgU/K+GgR.A,K)EgA\"P3K!K$C3G4\u0002!P(OgA\"P3K!K$C3GgQ3M5Gi"), certStoreException);
            }
        }
        return hashSet;
    }

    public static X500Principal cfr_renamed_305(X509CRL arg0) {
        return arg0.getIssuerX500Principal();
    }

    public static X500Principal cfr_renamed_302(Object arg0) {
        if (arg0 instanceof X509Certificate) {
            return ((X509Certificate)arg0).getIssuerX500Principal();
        }
        return (X500Principal)((sprbd)arg0).cfr_renamed_102().cfr_renamed_271()[0];
    }

    public static boolean cfr_renamed_286(X509Certificate arg0) {
        return ((Object)arg0.getSubjectDN()).equals(arg0.getIssuerDN());
    }

    public static sprbrh cfr_renamed_5083(sprbrh arg0, List[] arg1, sprbrh arg2) {
        sprbrh sprbrh2 = (sprbrh)arg2.getParent();
        if (arg0 == null) {
            return null;
        }
        if (sprbrh2 == null) {
            int n;
            int n2 = n = 0;
            while (n2 < arg1.length) {
                arg1[n++] = new ArrayList();
                n2 = n;
            }
            return null;
        }
        sprbrh2.cfr_renamed_5095(arg2);
        sprmle.cfr_renamed_5099(arg1, arg2);
        return arg0;
    }

    private static /* synthetic */ void cfr_renamed_5099(List[] arg0, sprbrh arg1) {
        sprbrh sprbrh2 = arg1;
        arg0[arg1.getDepth()].remove(sprbrh2);
        if (sprbrh2.cfr_renamed_336()) {
            Iterator iterator;
            Iterator iterator2 = iterator = arg1.getChildren();
            while (iterator2.hasNext()) {
                sprbrh sprbrh3 = (sprbrh)iterator.next();
                iterator2 = iterator;
                sprmle.cfr_renamed_5099(arg0, sprbrh3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprxgf cfr_renamed_2338(String arg0, byte[] arg1) throws sprlhi {
        try {
            sprrzm sprrzm2 = new sprrzm(arg1);
            sproug sproug2 = (sproug)sprrzm2.cfr_renamed_24();
            sprrzm2 = new sprrzm(sproug2.cfr_renamed_186());
            return sprrzm2.cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new sprlhi(new StringBuilder().insert(0, sprzra.cfr_renamed_9("\u0007>\u0001#\u00122\u000b)\ff\u00124\r%\u00075\u0011/\f!B#\u001a2\u0007(\u0011/\r(B")).append(arg0).toString(), exception);
        }
    }

    public static void cfr_renamed_5081(int arg0, List[] arg1, sprlem arg2, Set arg3) {
        int n;
        List list = arg1[arg0 - 1];
        int n2 = n = 0;
        while (n2 < list.size()) {
            sprbrh sprbrh2 = (sprbrh)list.get(n);
            if (cfr_renamed_152.equals(sprbrh2.getValidPolicy())) {
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add(arg2.cfr_renamed_19());
                sprbrh sprbrh3 = new sprbrh(new ArrayList(), arg0, hashSet, sprbrh2, arg3, arg2.cfr_renamed_19(), false);
                sprbrh2.cfr_renamed_5082(sprbrh3);
                arg1[arg0].add(sprbrh3);
                return;
            }
            n2 = ++n;
        }
    }

    public static Collection cfr_renamed_5100(sprhve arg0, List arg1) throws sprlhi {
        HashSet<? extends Certificate> hashSet = new HashSet<Certificate>();
        Iterator iterator = arg1.iterator();
        spranj spranj2 = new spranj();
        while (iterator.hasNext()) {
            Object object;
            Object e = iterator.next();
            if (e instanceof sprug) {
                object = (sprug)e;
                try {
                    for (Object t : object.cfr_renamed_3216(arg0)) {
                        if (t instanceof sprjn) {
                            hashSet.add(spranj2.engineGenerateCertificate(new ByteArrayInputStream(((sprjn)t).cfr_renamed_91())));
                            continue;
                        }
                        if (t instanceof Certificate) {
                            hashSet.add((Certificate)t);
                            continue;
                        }
                        throw new sprlhi(sprvbz.cfr_renamed_9("w)I)M0LgM%H\"A3\u0002!M2L#\u0002.LgA\"P3K!K$C3GgQ3M5Gi"));
                    }
                    continue;
                }
                catch (sprine sprine2) {
                    throw new sprlhi(sprzra.cfr_renamed_9("\u0016\u0010)\u0000*\u0007+B1\n/\u000e#B6\u000b%\t/\f!B%\u00074\u0016/\u0004/\u0001'\u0016#\u0011f\u00044\r+B\u001eLsR\u007fB5\u0016)\u0010#L"), sprine2);
                }
                catch (IOException iOException) {
                    throw new sprlhi(sprvbz.cfr_renamed_9("\u0017P(@+G*\u00020J.N\"\u0002\"Z3P&A3K)EgA\"P3K!K$C3G4\u0002!P(Ogzi\u0017w\u001bgQ3M5Gi"), iOException);
                }
                catch (CertificateException certificateException) {
                    throw new sprlhi(sprzra.cfr_renamed_9("24\r$\u000e#\u000ff\u0015.\u000b*\u0007f\u0007>\u00164\u0003%\u0016/\f!B%\u00074\u0016/\u0004/\u0001'\u0016#\u0011f\u00044\r+B\u001eLsR\u007fB5\u0016)\u0010#L"), certificateException);
                }
            }
            object = (CertStore)e;
            try {
                hashSet.addAll(((CertStore)object).getCertificates(arg0));
            }
            catch (CertStoreException certStoreException) {
                throw new sprlhi(sprvbz.cfr_renamed_9("r5M%N\"OgU/K+GgR.A,K)EgA\"P3K!K$C3G4\u0002!P(OgA\"P3K!K$C3GgQ3M5Gi"), certStoreException);
            }
        }
        return hashSet;
    }

    public static PublicKey cfr_renamed_297(List arg0, int arg1) throws CertPathValidatorException {
        int n;
        PublicKey publicKey = ((Certificate)arg0.get(arg1)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey)publicKey;
        if (dSAPublicKey.getParams() != null) {
            return dSAPublicKey;
        }
        int n2 = n = arg1 + 1;
        while (n2 < arg0.size()) {
            publicKey = ((X509Certificate)arg0.get(n)).getPublicKey();
            if (!(publicKey instanceof DSAPublicKey)) {
                throw new CertPathValidatorException(sprzra.cfr_renamed_9("&\u0015#f\u0012'\u0010'\u000f#\u0016#\u00105B%\u0003(\f)\u0016f\u0000#B/\f.\u00074\u000b2\u0007\"B \u0010)\u000ff\u00124\u00070\u000b)\u00175B%\u00074\u0016/\u0004/\u0001'\u0016#L"));
            }
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey)publicKey;
            if (dSAPublicKey2.getParams() != null) {
                DSAParams dSAParams = dSAPublicKey2.getParams();
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(dSAPublicKey.getY(), dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
                try {
                    KeyFactory keyFactory = KeyFactory.getInstance("DSA", "BC");
                    return keyFactory.generatePublic(dSAPublicKeySpec);
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.getMessage());
                }
            }
            n2 = ++n;
        }
        throw new CertPathValidatorException(sprvbz.cfr_renamed_9("\u0003q\u0006\u00027C5C*G3G5QgA&L)M3\u0002%GgK)J\"P.V\"FgD5M*\u00027P\"T.M2QgA\"P3K!K$C3Gi"));
    }

    private static /* synthetic */ BigInteger cfr_renamed_2337(Object arg0) {
        if (arg0 instanceof X509Certificate) {
            return ((X509Certificate)arg0).getSerialNumber();
        }
        return ((sprbd)arg0).cfr_renamed_114();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Set cfr_renamed_5079(sprszm arg0) throws CertPathValidatorException {
        Enumeration enumeration;
        HashSet<PolicyQualifierInfo> hashSet = new HashSet<PolicyQualifierInfo>();
        if (arg0 == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sproen sproen2 = sproen.cfr_renamed_5101(byteArrayOutputStream);
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            try {
                sproen2.cfr_renamed_5102((sprco)enumeration.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
            }
            catch (IOException iOException) {
                throw new sprxbi(sprzra.cfr_renamed_9("\u0016\r*\u000b%\u001bf\u00133\u0003*\u000b \u000b#\u0010f\u000b(\u0004)B%\u0003(\f)\u0016f\u0000#B\"\u0007%\r\"\u0007\"L"), iOException);
            }
            byteArrayOutputStream.reset();
            enumeration2 = enumeration;
        }
        return hashSet;
    }
}

