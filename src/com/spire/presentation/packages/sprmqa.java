/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.sprblb;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbqb;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprcwr;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprefe;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.sprfua;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprgmb;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprgva;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprjqb;
import com.spire.presentation.packages.sprkna;
import com.spire.presentation.packages.sprkpb;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmoa;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprosb;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprtae;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.spruzy;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwm;
import com.spire.presentation.packages.sprwmb;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryke;
import com.spire.presentation.packages.sprz;
import com.spire.presentation.packages.sprzwa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
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

public class sprmqa {
    public static final String cfr_renamed_114;
    public static final String cfr_renamed_96;
    public static final String cfr_renamed_105;
    public static final String cfr_renamed_137;
    public static final String cfr_renamed_79 = "2.5.29.32.0";
    public static final String cfr_renamed_107;
    public static final String cfr_renamed_132;
    public static final String[] cfr_renamed_102;
    public static final String cfr_renamed_93;
    public static final sprbqb cfr_renamed_86;
    public static final String cfr_renamed_152;
    public static final int cfr_renamed_112 = 6;
    public static final int cfr_renamed_119 = 5;
    public static final String cfr_renamed_91;
    public static final String cfr_renamed_0;
    public static final String cfr_renamed_1;
    public static final String cfr_renamed_2;
    public static final String cfr_renamed_3;
    public static final String cfr_renamed_4;

    public static boolean cfr_renamed_333(int arg0, List[] arg1, sprtzd arg2, Set arg3) {
        int n;
        List list = arg1[arg0 - 1];
        int n2 = n = 0;
        while (n2 < list.size()) {
            sprkpb sprkpb2 = (sprkpb)list.get(n);
            if (sprkpb2.getExpectedPolicies().contains(arg2.cfr_renamed_19())) {
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add(arg2.cfr_renamed_19());
                sprkpb sprkpb3 = new sprkpb(new ArrayList(), arg0, hashSet, sprkpb2, arg3, arg2.cfr_renamed_19(), false);
                sprkpb2.cfr_renamed_335(sprkpb3);
                arg1[arg0].add(sprkpb3);
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
    public static sprije cfr_renamed_283(PublicKey arg0) throws CertPathValidatorException {
        try {
            sprgle sprgle2 = new sprgle(arg0.getEncoded());
            return sprdce.cfr_renamed_23(sprgle2.cfr_renamed_24()).cfr_renamed_1473();
        }
        catch (Exception exception) {
            throw new sprgmb(sprcwr.cfr_renamed_9("oy^fYoH,Ly^`Uo\u001cgYu\u001co]bRcH,^i\u001chYoShYh\u0012"), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_2276(X509Certificate arg0, sprfua arg1) throws sprakb {
        Iterator iterator;
        Serializable serializable;
        sprgma sprgma2 = new sprgma();
        HashSet hashSet = new HashSet();
        try {
            sprgma2.setSubject(arg0.getIssuerX500Principal().getEncoded());
        }
        catch (IOException iOException) {
            throw new sprakb(spruzy.cfr_renamed_9("6~\u0007a\u0000h\u0011+\u0006y\f\u007f\u0000y\fjEm\nyEh\u0000y\u0011b\u0003b\u0006j\u0011nEx\u0000g\u0000h\u0011d\u0017+\u0011dEm\fe\u0001+\fx\u0016~\u0000yEh\u0000y\u0011b\u0003b\u0006j\u0011nEh\n~\toEe\n\u007fEi\u0000+\u0016n\u0011%"), iOException);
        }
        try {
            serializable = new ArrayList();
            boolean bl = serializable.addAll(sprmqa.cfr_renamed_2181(sprgma2, arg1.getCertStores()));
            ArrayList arrayList = serializable;
            serializable.addAll(sprmqa.cfr_renamed_2181(sprgma2, arg1.cfr_renamed_385()));
            arrayList.addAll(sprmqa.cfr_renamed_2181(sprgma2, arg1.cfr_renamed_377()));
            iterator = arrayList.iterator();
        }
        catch (sprakb sprakb2) {
            throw new sprakb(sprcwr.cfr_renamed_9("EO\u007fIiN,_iNxUjUo]xY,_mRbSx\u001cnY,Oi]~_dYh\u0012"), sprakb2);
        }
        serializable = null;
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            serializable = (X509Certificate)iterator.next();
            iterator2 = iterator;
            hashSet.add(serializable);
        }
        return hashSet;
    }

    public static void cfr_renamed_339(int arg0, List[] arg1, String arg2, Map arg3, X509Certificate arg4) throws sprakb, CertPathValidatorException {
        boolean bl;
        block11: {
            boolean bl2 = false;
            for (sprkpb sprkpb2 : arg1[arg0]) {
                if (!sprkpb2.getValidPolicy().equals(arg2)) continue;
                bl2 = true;
                sprkpb2.cfr_renamed_119 = (Set)arg3.get(arg2);
                bl = bl2;
                break block11;
            }
            bl = bl2;
        }
        if (!bl) {
            for (sprkpb sprkpb2 : arg1[arg0]) {
                sprkpb sprkpb3;
                if (!cfr_renamed_79.equals(sprkpb2.getValidPolicy())) continue;
                Set set = null;
                sprbne sprbne2 = null;
                try {
                    sprbne2 = sprpse.cfr_renamed_23(sprmqa.cfr_renamed_292(arg4, cfr_renamed_152));
                }
                catch (Exception exception) {
                    throw new sprakb(spruzy.cfr_renamed_9("H\u0000y\u0011b\u0003b\u0006j\u0011nE{\ng\fh\fn\u0016+\u0006j\u000be\n\u007fEi\u0000+\u0001n\u0006d\u0001n\u0001%"), exception);
                }
                Enumeration enumeration = sprbne2.cfr_renamed_329();
                while (enumeration.hasMoreElements()) {
                    spriae spriae2 = null;
                    try {
                        spriae2 = spriae.cfr_renamed_23(enumeration.nextElement());
                    }
                    catch (Exception exception) {
                        throw new sprakb(sprcwr.cfr_renamed_9("lcPe_u\u001ceRjS~QmHeSb\u001co]bRcH,^i\u001chYoShYh\u0012"), exception);
                    }
                    if (!cfr_renamed_79.equals(spriae2.cfr_renamed_330().cfr_renamed_19())) continue;
                    try {
                        set = sprmqa.cfr_renamed_331(spriae2.cfr_renamed_332());
                        break;
                    }
                    catch (CertPathValidatorException certPathValidatorException) {
                        throw new sprgmb(spruzy.cfr_renamed_9("[\ng\fh\u001c+\u0014~\u0004g\fm\fn\u0017+\fe\u0003dEx\u0000\u007fEh\n~\toEe\n\u007fEi\u0000+\u0007~\fg\u0011%"), certPathValidatorException);
                    }
                }
                boolean bl3 = false;
                if (arg4.getCriticalExtensionOIDs() != null) {
                    bl3 = arg4.getCriticalExtensionOIDs().contains(cfr_renamed_152);
                }
                if (!cfr_renamed_79.equals((sprkpb3 = (sprkpb)sprkpb2.getParent()).getValidPolicy())) break;
                sprkpb sprkpb4 = new sprkpb(new ArrayList(), arg0, (Set)arg3.get(arg2), sprkpb3, set, arg2, bl3);
                sprkpb3.cfr_renamed_335(sprkpb4);
                arg1[arg0].add(sprkpb4);
                return;
            }
        }
    }

    public static X500Principal cfr_renamed_302(Object arg0) {
        if (arg0 instanceof X509Certificate) {
            return ((X509Certificate)arg0).getIssuerX500Principal();
        }
        return (X500Principal)((sprz)arg0).cfr_renamed_102().cfr_renamed_271()[0];
    }

    public static void cfr_renamed_280(X509Certificate arg0, PublicKey arg1, String arg2) throws GeneralSecurityException {
        if (arg2 == null) {
            arg0.verify(arg1);
            return;
        }
        arg0.verify(arg1, arg2);
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
                throw new CertPathValidatorException(sprcwr.cfr_renamed_9("x_},LmNmQiHiN\u007f\u001co]bRcH,^i\u001ceRdY~UxYh\u001cjNcQ,L~YzUcI\u007f\u001coY~HeZe_mHi\u0012"));
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
        throw new CertPathValidatorException(spruzy.cfr_renamed_9("O6JE{\u0004y\u0004f\u0000\u007f\u0000y\u0016+\u0006j\u000be\n\u007fEi\u0000+\fe\rn\u0017b\u0011n\u0001+\u0003y\nfE{\u0017n\u0013b\n~\u0016+\u0006n\u0017\u007f\fm\fh\u0004\u007f\u0000%"));
    }

    public static Date cfr_renamed_364(PKIXParameters arg0) {
        Date date = arg0.getDate();
        if (date == null) {
            date = new Date();
        }
        return date;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_2165(spryke arg0, Object arg1, Date arg2, sprlsa arg3) throws sprakb {
        sprgva sprgva2;
        Set<Principal> set;
        sprgva sprgva3 = new sprgva();
        try {
            spryke spryke2;
            set = new HashSet<Principal>();
            if (arg1 instanceof sprz) {
                set.add(((sprz)arg1).cfr_renamed_102().cfr_renamed_271()[0]);
                spryke2 = arg0;
            } else {
                set.add(sprmqa.cfr_renamed_302(arg1));
                spryke2 = arg0;
            }
            sprmqa.cfr_renamed_2334(spryke2, set, sprgva3, arg3);
        }
        catch (sprakb sprakb2) {
            throw new sprakb(sprcwr.cfr_renamed_9("\u007fcI`X,RcH,[iH,U\u007fOyY~\u001ceRjS~QmHeSb\u001cjNcQ,XeOxNe^yHeSb\u001c|SeRx\u0012"), sprakb2);
        }
        if (arg1 instanceof X509Certificate) {
            sprgva3.setCertificateChecking((X509Certificate)arg1);
            sprgva2 = sprgva3;
        } else {
            if (arg1 instanceof sprz) {
                sprgva3.cfr_renamed_160((sprz)arg1);
            }
            sprgva2 = sprgva3;
        }
        sprgva2.cfr_renamed_167(true);
        set = cfr_renamed_86.cfr_renamed_2207(sprgva3, arg3, arg2);
        if (!set.isEmpty()) {
            return set;
        }
        if (arg1 instanceof sprz) {
            sprz sprz2 = (sprz)arg1;
            throw new sprakb(new StringBuilder().insert(0, spruzy.cfr_renamed_9("+dEH7G\u0016+\u0003d\u0010e\u0001+\u0003d\u0017+\fx\u0016~\u0000yE)")).append(sprz2.cfr_renamed_102().cfr_renamed_271()[0]).append(sprcwr.cfr_renamed_9("\u001e")).toString());
        }
        X509Certificate x509Certificate = (X509Certificate)arg1;
        throw new sprakb(new StringBuilder().insert(0, spruzy.cfr_renamed_9("+dEH7G\u0016+\u0003d\u0010e\u0001+\u0003d\u0017+\fx\u0016~\u0000yE)")).append(x509Certificate.getIssuerX500Principal()).append(sprcwr.cfr_renamed_9("\u001e")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date cfr_renamed_2201(sprlsa arg0, CertPath arg1, int arg2) throws sprakb {
        if (arg0.cfr_renamed_376() != 1) {
            return sprmqa.cfr_renamed_364(arg0);
        }
        if (arg2 <= 0) {
            return sprmqa.cfr_renamed_364(arg0);
        }
        if (arg2 - 1 != 0) {
            return ((X509Certificate)arg1.getCertificates().get(arg2 - 1)).getNotBefore();
        }
        sprrpe sprrpe2 = null;
        try {
            byte[] byArray = ((X509Certificate)arg1.getCertificates().get(arg2 - 1)).getExtensionValue(sprwm.cfr_renamed_0.cfr_renamed_19());
            if (byArray != null) {
                sprrpe2 = sprrpe.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
            }
        }
        catch (IOException iOException) {
            throw new sprakb(spruzy.cfr_renamed_9("O\u0004\u007f\u0000+\nmEh\u0000y\u0011+\u0002n\u000b+\u0000s\u0011n\u000bx\fd\u000b+\u0006d\u0010g\u0001+\u000bd\u0011+\u0007nEy\u0000j\u0001%"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprakb(sprcwr.cfr_renamed_9("xmHi\u001ccZ,_iNx\u001ckYb\u001ciDxYbOeSb\u001coSyPh\u001cbSx\u001cnY,Ni]h\u0012"));
        }
        if (sprrpe2 == null) {
            return ((X509Certificate)arg1.getCertificates().get(arg2 - 1)).getNotBefore();
        }
        try {
            return sprrpe2.cfr_renamed_110();
        }
        catch (ParseException parseException) {
            throw new sprakb(spruzy.cfr_renamed_9("O\u0004\u007f\u0000+\u0003y\nfEo\u0004\u007f\u0000+\nmEh\u0000y\u0011+\u0002n\u000b+\u0000s\u0011n\u000bx\fd\u000b+\u0006d\u0010g\u0001+\u000bd\u0011+\u0007nE{\u0004y\u0016n\u0001%"), parseException);
        }
    }

    public static sprkpb cfr_renamed_337(sprkpb arg0, List[] arg1, sprkpb arg2) {
        sprkpb sprkpb2 = (sprkpb)arg2.getParent();
        if (arg0 == null) {
            return null;
        }
        if (sprkpb2 == null) {
            int n;
            int n2 = n = 0;
            while (n2 < arg1.length) {
                arg1[n++] = new ArrayList();
                n2 = n;
            }
            return null;
        }
        sprkpb2.cfr_renamed_2215(arg2);
        sprmqa.cfr_renamed_2335(arg1, arg2);
        return arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_2181(sprgma arg0, List arg1) throws sprakb {
        HashSet<? extends Certificate> hashSet = new HashSet<Certificate>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            Object object;
            Object e = iterator.next();
            if (e instanceof sprmoa) {
                object = (sprmoa)e;
                try {
                    hashSet.addAll(((sprmoa)object).cfr_renamed_152(arg0));
                }
                catch (sprzwa sprzwa2) {
                    throw new sprakb(sprcwr.cfr_renamed_9("\\Nc^`Ya\u001c{TePi\u001c|UoWeRk\u001coY~HeZe_mHiO,Z~Sa\u001cT\u00129\f5\u001c\u007fHcNi\u0012"), sprzwa2);
                }
            }
            object = (CertStore)e;
            try {
                hashSet.addAll(((CertStore)object).getCertificates(arg0));
            }
            catch (CertStoreException certStoreException) {
                throw new sprakb(spruzy.cfr_renamed_9("5y\ni\tn\b+\u0012c\fg\u0000+\u0015b\u0006`\fe\u0002+\u0006n\u0017\u007f\fm\fh\u0004\u007f\u0000xEm\u0017d\b+\u0006n\u0017\u007f\fm\fh\u0004\u007f\u0000+\u0016\u007f\ny\u0000%"), certStoreException);
            }
        }
        return hashSet;
    }

    static {
        cfr_renamed_86 = new sprbqb();
        cfr_renamed_152 = sprtie.cfr_renamed_137.cfr_renamed_19();
        cfr_renamed_114 = sprtie.cfr_renamed_272.cfr_renamed_19();
        cfr_renamed_2 = sprtie.cfr_renamed_112.cfr_renamed_19();
        cfr_renamed_4 = sprtie.cfr_renamed_107.cfr_renamed_19();
        cfr_renamed_96 = sprtie.cfr_renamed_84.cfr_renamed_19();
        cfr_renamed_0 = sprtie.cfr_renamed_953.cfr_renamed_19();
        cfr_renamed_93 = sprtie.cfr_renamed_133.cfr_renamed_19();
        cfr_renamed_1 = sprtie.cfr_renamed_0.cfr_renamed_19();
        cfr_renamed_137 = sprtie.cfr_renamed_185.cfr_renamed_19();
        cfr_renamed_91 = sprtie.cfr_renamed_102.cfr_renamed_19();
        cfr_renamed_107 = sprtie.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_3 = sprtie.spr\ufe34.cfr_renamed_19();
        cfr_renamed_132 = sprtie.cfr_renamed_96.cfr_renamed_19();
        cfr_renamed_105 = sprtie.cfr_renamed_132.cfr_renamed_19();
        String[] stringArray = new String[11];
        stringArray[0] = sprcwr.cfr_renamed_9("IbO|YoUjUiX");
        stringArray[1] = spruzy.cfr_renamed_9("`\u0000r&d\b{\u0017d\bb\u0016n");
        stringArray[2] = sprcwr.cfr_renamed_9("o}OSaL~SaU\u007fY");
        stringArray[3] = spruzy.cfr_renamed_9("\u0004m\u0003b\tb\u0004\u007f\fd\u000bH\rj\u000bl\u0000o");
        stringArray[4] = sprcwr.cfr_renamed_9("\u007fI|Y~OiXiX");
        stringArray[5] = spruzy.cfr_renamed_9("\u0006n\u0016x\u0004\u007f\fd\u000bD\u0003D\u0015n\u0017j\u0011b\ne");
        stringArray[6] = sprcwr.cfr_renamed_9("_iNxUjUo]xYDS`X");
        stringArray[7] = "unknown";
        stringArray[8] = spruzy.cfr_renamed_9("y\u0000f\n}\u0000M\u0017d\bH7G");
        stringArray[9] = sprcwr.cfr_renamed_9("|NeJePi[ikeHdX~]{R");
        stringArray[10] = spruzy.cfr_renamed_9("\u0004J&d\b{\u0017d\bb\u0016n");
        cfr_renamed_102 = stringArray;
    }

    public static void cfr_renamed_334(int arg0, List[] arg1, sprtzd arg2, Set arg3) {
        int n;
        List list = arg1[arg0 - 1];
        int n2 = n = 0;
        while (n2 < list.size()) {
            sprkpb sprkpb2 = (sprkpb)list.get(n);
            if (cfr_renamed_79.equals(sprkpb2.getValidPolicy())) {
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add(arg2.cfr_renamed_19());
                sprkpb sprkpb3 = new sprkpb(new ArrayList(), arg0, hashSet, sprkpb2, arg3, arg2.cfr_renamed_19(), false);
                sprkpb2.cfr_renamed_335(sprkpb3);
                arg1[arg0].add(sprkpb3);
                return;
            }
            n2 = ++n;
        }
    }

    public static boolean cfr_renamed_286(X509Certificate arg0) {
        return ((Object)arg0.getSubjectDN()).equals(arg0.getIssuerDN());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void cfr_renamed_2334(spryke arg0, Collection arg1, X509CRLSelector arg2, sprlsa arg3) throws sprakb {
        Object object;
        ArrayList<X500Principal> arrayList;
        block11: {
            int n;
            int n2;
            block10: {
                block9: {
                    arrayList = new ArrayList<X500Principal>();
                    if (arg0.cfr_renamed_2186() == null) break block9;
                    object = arg0.cfr_renamed_2186().cfr_renamed_289();
                    n = n2 = 0;
                    break block10;
                }
                if (arg0.cfr_renamed_323() == null) {
                    throw new sprakb(spruzy.cfr_renamed_9("H7GEb\u0016x\u0010n\u0017+\fxEd\bb\u0011\u007f\u0000oEm\u0017d\b+\u0001b\u0016\u007f\u0017b\u0007~\u0011b\neE{\nb\u000b\u007fEi\u0010\u007fEe\n+\u0001b\u0016\u007f\u0017b\u0007~\u0011b\ne5d\fe\u0011+\u0003b\u0000g\u0001+\u0015y\u0000x\u0000e\u0011%"));
                }
                Object object2 = object = arg1.iterator();
                while (object2.hasNext()) {
                    arrayList.add((X500Principal)object.next());
                    object2 = object;
                }
                return;
                break block11;
            }
            while (n < ((sprmee[])object).length) {
                if (((sprmee)object[n2]).cfr_renamed_312() == 4) {
                    try {
                        arrayList.add(new X500Principal(((sprmee)object[n2]).cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()));
                    }
                    catch (IOException iOException) {
                        throw new sprakb(sprcwr.cfr_renamed_9("\u007f^p,U\u007fOyY~\u001ceRjS~QmHeSb\u001cjNcQ,XeOxNe^yHeSb\u001c|SeRx\u001co]bRcH,^i\u001chYoShYh\u0012"), iOException);
                    }
                }
                n = ++n2;
            }
        }
        Object object3 = object = arrayList.iterator();
        while (object3.hasNext()) {
            try {
                arg2.addIssuerName(((X500Principal)object.next()).getEncoded());
                object3 = object;
            }
            catch (IOException iOException) {
                throw new sprakb(sprcwr.cfr_renamed_9("\u007fmRbSx\u001chYoShY,\u007f^p,U\u007fOyY~\u001ceRjS~QmHeSb\u0012"), iOException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_2278(sprkna arg0, List arg1) throws sprakb {
        HashSet hashSet = new HashSet();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (!(e instanceof sprmoa)) continue;
            sprmoa sprmoa2 = (sprmoa)e;
            try {
                hashSet.addAll(sprmoa2.cfr_renamed_152(arg0));
            }
            catch (sprzwa sprzwa2) {
                throw new sprakb(spruzy.cfr_renamed_9("5y\ni\tn\b+\u0012c\fg\u0000+\u0015b\u0006`\fe\u0002+\u0006n\u0017\u007f\fm\fh\u0004\u007f\u0000xEm\u0017d\b+=%P;\\+\u0016\u007f\ny\u0000%"), sprzwa2);
            }
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2336(String arg0, sprlsa arg1) {
        if (!arg1.cfr_renamed_374()) return;
        try {
            if (!arg0.startsWith(sprcwr.cfr_renamed_9("Ph]|\u0006#\u0013"))) return;
            arg0 = arg0.substring(7);
            String string = null;
            String string2 = null;
            if (arg0.indexOf("/") != -1) {
                String string3 = arg0;
                string = string3.substring(string3.indexOf("/"));
                String string4 = arg0;
                string2 = new StringBuilder().insert(0, spruzy.cfr_renamed_9("g\u0001j\u00151J$")).append(string4.substring(0, string4.indexOf("/"))).toString();
            } else {
                string2 = new StringBuilder().insert(0, sprcwr.cfr_renamed_9("Ph]|\u0006#\u0013")).append(arg0).toString();
            }
            sprblb sprblb2 = new sprjqb(string2, string).cfr_renamed_1451();
            sprlsa sprlsa2 = arg1;
            sprlsa sprlsa3 = arg1;
            sprlsa3.cfr_renamed_381(sprmoa.cfr_renamed_156(spruzy.cfr_renamed_9("&N7_,M,H$_ $)O$["), sprblb2, "BC"));
            sprlsa3.cfr_renamed_381(sprmoa.cfr_renamed_156(sprcwr.cfr_renamed_9("On@\u0013@xMl"), sprblb2, "BC"));
            sprlsa2.cfr_renamed_381(sprmoa.cfr_renamed_156(spruzy.cfr_renamed_9("J1_7B'^1N&N7_,M,H$_ $)O$["), sprblb2, "BC"));
            sprlsa2.cfr_renamed_381(sprmoa.cfr_renamed_156(sprcwr.cfr_renamed_9("Oy^hEzE\u007fMhIlMu^\u0013@xMl"), sprblb2, "BC"));
            return;
        }
        catch (Exception exception) {
            throw new RuntimeException(spruzy.cfr_renamed_9(" s\u0006n\u0015\u007f\fd\u000b+\u0004o\u0001b\u000blESK>U2Ex\u0011d\u0017n\u0016%"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2160(sprefe arg0, sprlsa arg1) throws sprakb {
        if (arg0 != null) {
            int n;
            spryke[] sprykeArray = null;
            try {
                sprykeArray = arg0.cfr_renamed_322();
            }
            catch (Exception exception) {
                throw new sprakb(sprcwr.cfr_renamed_9("HU\u007fH~UnIxUcR,LcUbH\u007f\u001coSyPh\u001cbSx\u001cnY,Ni]h\u0012"), exception);
            }
            int n2 = n = 0;
            while (n2 < sprykeArray.length) {
                sprtae sprtae2 = sprykeArray[n].cfr_renamed_323();
                if (sprtae2 != null && sprtae2.cfr_renamed_324() == 0) {
                    int n3;
                    sprmee[] sprmeeArray = spryee.cfr_renamed_23(sprtae2.cfr_renamed_313()).cfr_renamed_289();
                    int n4 = n3 = 0;
                    while (n4 < sprmeeArray.length) {
                        if (sprmeeArray[n3].cfr_renamed_312() == 6) {
                            sprmqa.cfr_renamed_2336(sprcae.cfr_renamed_23(sprmeeArray[n3].cfr_renamed_313()).cfr_renamed_314(), arg1);
                        }
                        n4 = ++n3;
                    }
                }
                n2 = ++n;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2211(Date arg0, X509CRL arg1, Object arg2, sprosb arg3) throws sprakb {
        Date date;
        Object object;
        boolean bl;
        X509CRLEntry x509CRLEntry = null;
        try {
            bl = sprgtb.cfr_renamed_2130(arg1);
        }
        catch (CRLException cRLException) {
            throw new sprakb(spruzy.cfr_renamed_9("#j\fg\u0000oEh\rn\u0006`Em\nyEb\u000bo\fy\u0000h\u0011+&Y)%"), cRLException);
        }
        if (bl) {
            x509CRLEntry = arg1.getRevokedCertificate(sprmqa.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
            object = x509CRLEntry.getCertificateIssuer();
            if (object == null) {
                object = sprmqa.cfr_renamed_305(arg1);
            }
            if (!sprmqa.cfr_renamed_302(arg2).equals(object)) {
                return;
            }
        } else {
            if (!sprmqa.cfr_renamed_302(arg2).equals(sprmqa.cfr_renamed_305(arg1))) {
                return;
            }
            x509CRLEntry = arg1.getRevokedCertificate(sprmqa.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
        }
        object = null;
        if (x509CRLEntry.hasExtensions()) {
            try {
                object = sprune.cfr_renamed_23(sprmqa.cfr_renamed_292(x509CRLEntry, sprfje.cfr_renamed_145.cfr_renamed_19()));
                date = arg0;
            }
            catch (Exception exception) {
                throw new sprakb(sprcwr.cfr_renamed_9("ni]\u007fSb\u001coShY,\u007f^p,YbH~E,YtHiR\u007fUcR,_cI`X,RcH,^i\u001chYoShYh\u0012"), exception);
            }
        } else {
            date = arg0;
        }
        if (date.getTime() >= x509CRLEntry.getRevocationDate().getTime() || object == null || ((sprune)object).cfr_renamed_97().intValue() == 0 || ((sprune)object).cfr_renamed_97().intValue() == 1 || ((sprune)object).cfr_renamed_97().intValue() == 2 || ((sprune)object).cfr_renamed_97().intValue() == 8) {
            sprosb sprosb2;
            sprosb sprosb3 = arg3;
            if (object != null) {
                sprosb3.cfr_renamed_2164(((sprune)object).cfr_renamed_97().intValue());
                sprosb2 = arg3;
            } else {
                sprosb3.cfr_renamed_2164(0);
                sprosb2 = arg3;
            }
            sprosb2.cfr_renamed_2333(x509CRLEntry.getRevocationDate());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprvva cfr_renamed_2338(String arg0, byte[] arg1) throws sprakb {
        try {
            sprgle sprgle2 = new sprgle(arg1);
            sprxue sprxue2 = (sprxue)sprgle2.cfr_renamed_24();
            sprgle2 = new sprgle(sprxue2.cfr_renamed_186());
            return sprgle2.cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new sprakb(new StringBuilder().insert(0, spruzy.cfr_renamed_9("n\u001dh\u0000{\u0011b\neE{\u0017d\u0006n\u0016x\fe\u0002+\u0000s\u0011n\u000bx\fd\u000b+")).append(arg0).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_2171(Date arg0, sprlsa arg1, X509CRL arg2) throws sprakb {
        Object object;
        sprgva sprgva2 = new sprgva();
        try {
            sprgva2.addIssuerName(sprmqa.cfr_renamed_305(arg2).getEncoded());
        }
        catch (IOException iOException) {
            throw new sprakb(sprcwr.cfr_renamed_9("\u007fmRbSx\u001ciDxNm_x\u001ceO\u007fIiN,Z~Sa\u001cOn@\u0012"), iOException);
        }
        BigInteger bigInteger = null;
        try {
            object = sprmqa.cfr_renamed_292(arg2, cfr_renamed_105);
            if (object != null) {
                bigInteger = sprooe.cfr_renamed_23(object).cfr_renamed_162();
            }
        }
        catch (Exception exception) {
            throw new sprakb(spruzy.cfr_renamed_9("H7GEe\u0010f\u0007n\u0017+\u0000s\u0011n\u000bx\fd\u000b+\u0006d\u0010g\u0001+\u000bd\u0011+\u0007nEn\u001d\u007f\u0017j\u0006\u007f\u0000oEm\u0017d\b+&Y)%"), exception);
        }
        object = null;
        try {
            object = arg2.getExtensionValue(cfr_renamed_1);
        }
        catch (Exception exception) {
            throw new sprakb(sprcwr.cfr_renamed_9("u\u007fOyUb[,XeOxNe^yHeSb\u001c|SeRx\u001ciDxYbOeSb\u001cz]`Ii\u001coSyPh\u001cbSx\u001cnY,Ni]h\u0012"), exception);
        }
        sprgva2.setMinCRLNumber(bigInteger == null ? null : bigInteger.add(BigInteger.valueOf(1L)));
        sprgva sprgva3 = sprgva2;
        sprgva2.cfr_renamed_157((byte[])object);
        sprgva3.cfr_renamed_166(true);
        sprgva3.cfr_renamed_164(bigInteger);
        Set set = cfr_renamed_86.cfr_renamed_2207(sprgva2, arg1, arg0);
        HashSet<X509CRL> hashSet = new HashSet<X509CRL>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            X509CRL x509CRL = (X509CRL)iterator.next();
            if (!sprmqa.cfr_renamed_2339(x509CRL)) continue;
            hashSet.add(x509CRL);
        }
        return hashSet;
    }

    public static X500Principal cfr_renamed_282(X509Certificate arg0) {
        return arg0.getSubjectX500Principal();
    }

    public static void cfr_renamed_2275(X509Certificate arg0, sprlsa arg1) throws CertificateParsingException {
        if (arg0.getIssuerAlternativeNames() != null) {
            for (List<?> list : arg0.getIssuerAlternativeNames()) {
                if (!list.get(0).equals(spriwa.cfr_renamed_279(6))) continue;
                sprmqa.cfr_renamed_2336((String)list.get(1), arg1);
            }
        }
    }

    public static sprkpb cfr_renamed_340(int arg0, List[] arg1, String arg2, sprkpb arg3) {
        Iterator iterator = arg1[arg0].iterator();
        while (iterator.hasNext()) {
            sprkpb sprkpb2 = (sprkpb)iterator.next();
            if (!sprkpb2.getValidPolicy().equals(arg2)) continue;
            ((sprkpb)sprkpb2.getParent()).cfr_renamed_2215(sprkpb2);
            iterator.remove();
            int n = arg0 - 1;
            while (n >= 0) {
                sprkpb sprkpb3;
                int n2;
                int n3;
                List list = arg1[n3];
                int n4 = n2 = 0;
                while (n4 < list.size() && ((sprkpb3 = (sprkpb)list.get(n2)).cfr_renamed_336() || (arg3 = sprmqa.cfr_renamed_337(arg3, arg1, sprkpb3)) != null)) {
                    n4 = ++n2;
                }
                n = --n3;
            }
        }
        return arg3;
    }

    private static /* synthetic */ BigInteger cfr_renamed_2337(Object arg0) {
        if (arg0 instanceof X509Certificate) {
            return ((X509Certificate)arg0).getSerialNumber();
        }
        return ((sprz)arg0).cfr_renamed_114();
    }

    private static /* synthetic */ boolean cfr_renamed_2339(X509CRL arg0) {
        Set<String> set = arg0.getCriticalExtensionOIDs();
        if (set == null) {
            return false;
        }
        return set.contains(sprwmb.cfr_renamed_0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static TrustAnchor cfr_renamed_2273(X509Certificate arg0, Set arg1, String arg2) throws sprakb {
        TrustAnchor trustAnchor = null;
        PublicKey publicKey = null;
        Exception exception = null;
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal x500Principal = sprmqa.cfr_renamed_302(arg0);
        try {
            x509CertSelector.setSubject(x500Principal.getEncoded());
        }
        catch (IOException iOException) {
            throw new sprakb(spruzy.cfr_renamed_9("&j\u000be\n\u007fEx\u0000\u007fEx\u0010i\u000fn\u0006\u007fEx\u0000j\u0017h\r+\u0006y\f\u007f\u0000y\fjEm\nyE\u007f\u0017~\u0016\u007fEj\u000bh\rd\u0017%"), iOException);
        }
        Iterator iterator = arg1.iterator();
        block6: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext() && trustAnchor == null) {
                PublicKey publicKey2;
                block16: {
                    trustAnchor = (TrustAnchor)iterator.next();
                    if (trustAnchor.getTrustedCert() != null) {
                        if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                            publicKey2 = trustAnchor.getTrustedCert().getPublicKey();
                        } else {
                            trustAnchor = null;
                            publicKey2 = publicKey;
                        }
                    } else {
                        block17: {
                            if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
                                try {
                                    X500Principal x500Principal2 = new X500Principal(trustAnchor.getCAName());
                                    if (x500Principal.equals(x500Principal2)) {
                                        publicKey = trustAnchor.getCAPublicKey();
                                        break block17;
                                    } else {
                                        trustAnchor = null;
                                    }
                                    break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    trustAnchor = null;
                                    publicKey2 = publicKey;
                                    break block16;
                                }
                            }
                            trustAnchor = null;
                        }
                        publicKey2 = publicKey;
                    }
                }
                if (publicKey2 == null) continue block6;
                try {
                    sprmqa.cfr_renamed_280(arg0, publicKey, arg2);
                    iterator2 = iterator;
                }
                catch (Exception exception2) {
                    exception = exception2;
                    trustAnchor = null;
                    publicKey = null;
                    iterator2 = iterator;
                }
            }
            break;
        }
        if (trustAnchor == null && exception != null) {
            throw new sprakb(sprcwr.cfr_renamed_9("XNyOx}b_dS~\u001cjSyRh\u001cnIx\u001coY~HeZe_mHi\u001cz]`Uh]xUcR,ZmU`Yh\u0012"), exception);
        }
        return trustAnchor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Set cfr_renamed_331(sprbne arg0) throws CertPathValidatorException {
        Enumeration enumeration;
        HashSet<PolicyQualifierInfo> hashSet = new HashSet<PolicyQualifierInfo>();
        if (arg0 == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprope sprope2 = new sprope(byteArrayOutputStream);
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            try {
                sprope2.cfr_renamed_2149((spra)enumeration.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
            }
            catch (IOException iOException) {
                throw new sprgmb(spruzy.cfr_renamed_9("5d\tb\u0006rEz\u0010j\tb\u0003b\u0000yEb\u000bm\n+\u0006j\u000be\n\u007fEi\u0000+\u0001n\u0006d\u0001n\u0001%"), iOException);
            }
            byteArrayOutputStream.reset();
            enumeration2 = enumeration;
        }
        return hashSet;
    }

    private static /* synthetic */ void cfr_renamed_2335(List[] arg0, sprkpb arg1) {
        sprkpb sprkpb2 = arg1;
        arg0[arg1.getDepth()].remove(sprkpb2);
        if (sprkpb2.cfr_renamed_336()) {
            Iterator iterator;
            Iterator iterator2 = iterator = arg1.getChildren();
            while (iterator2.hasNext()) {
                sprkpb sprkpb3 = (sprkpb)iterator.next();
                iterator2 = iterator;
                sprmqa.cfr_renamed_2335(arg0, sprkpb3);
            }
        }
    }

    public static TrustAnchor cfr_renamed_2340(X509Certificate arg0, Set arg1) throws sprakb {
        return sprmqa.cfr_renamed_2273(arg0, arg1, null);
    }

    public static X500Principal cfr_renamed_305(X509CRL arg0) {
        return arg0.getIssuerX500Principal();
    }

    public static sprvva cfr_renamed_292(X509Extension arg0, String arg1) throws sprakb {
        byte[] byArray = arg0.getExtensionValue(arg1);
        if (byArray == null) {
            return null;
        }
        return sprmqa.cfr_renamed_2338(arg1, byArray);
    }

    public static boolean cfr_renamed_342(Set arg0) {
        return arg0 == null || arg0.contains(cfr_renamed_79) || arg0.isEmpty();
    }
}

