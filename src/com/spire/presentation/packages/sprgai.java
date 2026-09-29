/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprbrh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprddk;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdxh;
import com.spire.presentation.packages.sprefi;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprggi;
import com.spire.presentation.packages.sprgrh;
import com.spire.presentation.packages.sprgv;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprhxr;
import com.spire.presentation.packages.sprhyh;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprivj;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprkdm;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprluh;
import com.spire.presentation.packages.sprlxj;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprmuh;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprooh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrx;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwck;
import com.spire.presentation.packages.sprwhja;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprxbi;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzne;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
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
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprgai {
    public static final String cfr_renamed_96;
    public static final int cfr_renamed_105 = 6;
    public static final String cfr_renamed_137;
    public static final String cfr_renamed_79;
    public static final String cfr_renamed_107;
    public static final String[] cfr_renamed_132;
    public static final String cfr_renamed_102;
    public static final String cfr_renamed_93;
    public static final String cfr_renamed_86;
    public static final int cfr_renamed_152 = 5;
    public static final String cfr_renamed_112;
    public static final String cfr_renamed_119;
    public static final String cfr_renamed_91;
    public static final String cfr_renamed_0;
    public static final String cfr_renamed_1;
    public static final String cfr_renamed_2;
    public static final String cfr_renamed_3 = "2.5.29.32.0";
    public static final String cfr_renamed_4;

    private static /* synthetic */ boolean cfr_renamed_2339(X509CRL arg0) {
        Set<String> set = arg0.getCriticalExtensionOIDs();
        if (set == null) {
            return false;
        }
        return set.contains(sprmuh.cfr_renamed_112);
    }

    public static boolean cfr_renamed_286(X509Certificate arg0) {
        return ((Object)arg0.getSubjectDN()).equals(arg0.getIssuerDN());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_9145(sprivj arg0) throws CertPathBuilderException {
        sprgak sprgak2 = arg0.cfr_renamed_9128();
        sprexj sprexj2 = sprgak2.cfr_renamed_397();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            sprexj sprexj3 = sprexj2;
            sprgai.cfr_renamed_7308(linkedHashSet, sprexj3, sprgak2.cfr_renamed_7309());
            sprgai.cfr_renamed_7308(linkedHashSet, sprexj3, sprgak2.cfr_renamed_2283());
        }
        catch (sprlhi sprlhi2) {
            throw new sprggi(sprhxr.cfr_renamed_9("%\u0003\u0012\u001e\u0012Q\u0006\u0018\u000e\u0015\t\u001f\u0007Q\u0014\u0010\u0012\u0016\u0005\u0005@\u0012\u0005\u0003\u0014\u0018\u0006\u0018\u0003\u0010\u0014\u0014N"), sprlhi2);
        }
        if (!linkedHashSet.isEmpty()) {
            return linkedHashSet;
        }
        Certificate certificate = sprexj2.cfr_renamed_2141();
        if (null == certificate) {
            throw new CertPathBuilderException(sprwhja.cfr_renamed_9("dA\nMO\\^GLGIO^K\nHE[DJ\nCKZIFC@M\u000e^OXIOZiAD]^\\KGDZY\u0000"));
        }
        return Collections.singleton(certificate);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7308(LinkedHashSet arg0, sprexj arg1, List arg2) throws sprlhi {
        Iterator iterator = arg2.iterator();
        while (iterator.hasNext()) {
            Object object;
            Object e = iterator.next();
            if (e instanceof sprug) {
                object = (sprug)e;
                try {
                    arg0.addAll(object.cfr_renamed_3216(arg1));
                }
                catch (sprine sprine2) {
                    throw new sprlhi(sprhxr.cfr_renamed_9("!\u0012\u001e\u0002\u001d\u0005\u001c@\u0006\b\u0018\f\u0014@\u0001\t\u0012\u000b\u0018\u000e\u0016@\u0012\u0005\u0003\u0014\u0018\u0006\u0018\u0003\u0010\u0014\u0014\u0013Q\u0006\u0003\u000f\u001c@)NDPH@\u0002\u0014\u001e\u0012\u0014N"), sprine2);
                }
            }
            object = (CertStore)e;
            try {
                arg0.addAll(sprexj.cfr_renamed_5098(arg1, (CertStore)object));
            }
            catch (CertStoreException certStoreException) {
                throw new sprlhi(sprwhja.cfr_renamed_9("z\\ELFKG\u000e]FCBO\u000eZGIEC@M\u000eIKXZCHCMKZO]\nHXAG\u000eIKXZCHCMKZO\u000eYZE\\O\u0000"), certStoreException);
            }
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void cfr_renamed_7317(sprjgm arg0, Collection arg1, X509CRLSelector arg2) throws sprlhi {
        Object object;
        ArrayList<sprnbm> arrayList;
        block11: {
            int n;
            int n2;
            block10: {
                block9: {
                    arrayList = new ArrayList<sprnbm>();
                    if (arg0.cfr_renamed_2186() == null) break block9;
                    object = arg0.cfr_renamed_2186().cfr_renamed_289();
                    n = n2 = 0;
                    break block10;
                }
                if (arg0.cfr_renamed_323() == null) {
                    throw new sprlhi(sprwhja.cfr_renamed_9("mxb\nGY]_KX\u000eC]\nAGG^ZOJ\nHXAG\u000eNGYZXGH[^GE@\n^EGDZ\nL_Z\n@E\u000eNGYZXGH[^GE@zAC@^\u000eLGOBN\u000eZ\\O]O@^\u0000"));
                }
                Object object2 = object = arg1.iterator();
                while (object2.hasNext()) {
                    Object object3 = object;
                    object2 = object3;
                    arrayList.add((sprnbm)object3.next());
                }
                return;
                break block11;
            }
            while (n < ((sprigm[])object).length) {
                if (object[n2].cfr_renamed_312() == 4) {
                    try {
                        arrayList.add(sprnbm.cfr_renamed_23(((sprigm)object[n2]).cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()));
                    }
                    catch (IOException iOException) {
                        throw new sprlhi(sprhxr.cfr_renamed_9("##,Q\t\u0002\u0013\u0004\u0005\u0003@\u0018\u000e\u0017\u000f\u0003\r\u0010\u0014\u0018\u000f\u001f@\u0017\u0012\u001e\rQ\u0004\u0018\u0013\u0005\u0012\u0018\u0002\u0004\u0014\u0018\u000f\u001f@\u0001\u000f\u0018\u000e\u0005@\u0012\u0001\u001f\u000e\u001e\u0014Q\u0002\u0014@\u0015\u0005\u0012\u000f\u0015\u0005\u0015N"), iOException);
                    }
                }
                n = ++n2;
            }
        }
        Object object4 = object = arrayList.iterator();
        while (object4.hasNext()) {
            try {
                arg2.addIssuerName(((sprnbm)object.next()).cfr_renamed_91());
                object4 = object;
            }
            catch (IOException iOException) {
                throw new sprlhi(sprhxr.cfr_renamed_9("#\u0010\u000e\u001f\u000f\u0005@\u0015\u0005\u0012\u000f\u0015\u0005Q##,Q\t\u0002\u0013\u0004\u0005\u0003@\u0018\u000e\u0017\u000f\u0003\r\u0010\u0014\u0018\u000f\u001fN"), iOException);
            }
        }
    }

    static {
        cfr_renamed_86 = sprrdm.cfr_renamed_723.cfr_renamed_19();
        cfr_renamed_1 = sprrdm.cfr_renamed_133.cfr_renamed_19();
        cfr_renamed_107 = sprrdm.cfr_renamed_31.cfr_renamed_19();
        cfr_renamed_91 = sprrdm.cfr_renamed_137.cfr_renamed_19();
        cfr_renamed_119 = sprrdm.spr\ufe34.cfr_renamed_19();
        cfr_renamed_96 = sprrdm.cfr_renamed_272.cfr_renamed_19();
        cfr_renamed_137 = sprrdm.cfr_renamed_145.cfr_renamed_19();
        cfr_renamed_79 = sprrdm.cfr_renamed_96.cfr_renamed_19();
        cfr_renamed_4 = sprrdm.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_2 = sprrdm.cfr_renamed_82.cfr_renamed_19();
        cfr_renamed_0 = sprrdm.cfr_renamed_957.cfr_renamed_19();
        cfr_renamed_93 = sprrdm.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_102 = sprrdm.cfr_renamed_105.cfr_renamed_19();
        cfr_renamed_112 = sprrdm.cfr_renamed_128.cfr_renamed_19();
        String[] stringArray = new String[11];
        stringArray[0] = sprwhja.cfr_renamed_9("[D]ZKIGLGOJ");
        stringArray[1] = sprhxr.cfr_renamed_9("\u000b\u0014\u00192\u000f\u001c\u0010\u0003\u000f\u001c\t\u0002\u0005");
        stringArray[2] = sprwhja.cfr_renamed_9("IoiAG^XAGGYK");
        stringArray[3] = sprhxr.cfr_renamed_9("\u0010\u0006\u0017\t\u001d\t\u0010\u0014\u0018\u000f\u001f#\u0019\u0001\u001f\u0007\u0014\u0004");
        stringArray[4] = sprwhja.cfr_renamed_9("Y[ZKX]OJOJ");
        stringArray[5] = sprhxr.cfr_renamed_9("\u0012\u0005\u0002\u0013\u0010\u0014\u0018\u000f\u001f/\u0017/\u0001\u0005\u0003\u0001\u0005\t\u001e\u000e");
        stringArray[6] = sprwhja.cfr_renamed_9("MO\\^GLGIO^KbAFJ");
        stringArray[7] = "unknown";
        stringArray[8] = sprhxr.cfr_renamed_9("\u0012\u0014\r\u001e\u0016\u0014&\u0003\u000f\u001c##,");
        stringArray[9] = sprwhja.cfr_renamed_9("Z\\CXCBOIOyCZBJXO]@");
        stringArray[10] = sprhxr.cfr_renamed_9("\u0010!2\u000f\u001c\u0010\u0003\u000f\u001c\t\u0002\u0005");
        cfr_renamed_132 = stringArray;
    }

    public static void cfr_renamed_9162(sprwzj arg0, Set arg1, Object arg2) throws sprluh {
        if (arg1.isEmpty()) {
            if (arg2 instanceof sprbd) {
                sprbd sprbd2 = (sprbd)arg2;
                throw new sprluh(new StringBuilder().insert(0, sprwhja.cfr_renamed_9("dA\nmxbY\u000eLA_@N\u000eLAX\u000eC]Y[O\\\n\f")).append(sprbd2.cfr_renamed_102().cfr_renamed_271()[0]).append(sprhxr.cfr_renamed_9("B")).toString(), null, arg0.cfr_renamed_315(), arg0.cfr_renamed_320());
            }
            X509Certificate x509Certificate = (X509Certificate)arg2;
            throw new sprluh(new StringBuilder().insert(0, sprwhja.cfr_renamed_9("dA\nmxbY\u000eLA_@N\u000eLAX\u000eC]Y[O\\\n\f")).append(sprkdm.cfr_renamed_952.cfr_renamed_7319(sprooh.cfr_renamed_9099(x509Certificate))).append(sprhxr.cfr_renamed_9("B")).toString(), null, arg0.cfr_renamed_315(), arg0.cfr_renamed_320());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<sprkl> cfr_renamed_9074(sprvcm arg0, Map<sprigm, sprkl> arg1, Date arg2, sprrr arg3) throws sprlhi {
        Object object;
        int n;
        sprjgm[] sprjgmArray;
        if (null == arg0) {
            return Collections.EMPTY_LIST;
        }
        try {
            sprjgmArray = arg0.cfr_renamed_322();
        }
        catch (Exception exception) {
            throw new sprlhi(sprwhja.cfr_renamed_9("nGYZXGH[^GE@\n^EGDZY\u000eIA_BN\u000eDA^\u000eHK\n\\OON\u0000"), exception);
        }
        ArrayList<sprkl> arrayList = new ArrayList<sprkl>();
        int n2 = n = 0;
        while (n2 < sprjgmArray.length) {
            sprhhm sprhhm2 = sprjgmArray[n].cfr_renamed_323();
            if (sprhhm2 != null && sprhhm2.cfr_renamed_324() == 0) {
                int n3;
                object = spraem.cfr_renamed_23(sprhhm2.cfr_renamed_313()).cfr_renamed_289();
                int n4 = n3 = 0;
                while (n4 < ((sprigm[])object).length) {
                    sprkl sprkl2 = arg1.get(object[n3]);
                    if (sprkl2 != null) {
                        arrayList.add(sprkl2);
                    }
                    n4 = ++n3;
                }
            }
            n2 = ++n;
        }
        if (arrayList.isEmpty() && sprjcf.cfr_renamed_5159(sprhxr.cfr_renamed_9("\u0003\u001e\r_\u0013\u0001\t\u0003\u0005_\u0010\u0002\r\u001e\u0004\u0014\f_\u0013\u0014\u0003\u0004\u0012\u0018\u0014\bN\tUAY_\u0005\u001f\u0001\u0013\f\u0014##,50"))) {
            int n5;
            CertificateFactory certificateFactory;
            try {
                certificateFactory = arg3.cfr_renamed_1550(sprwhja.cfr_renamed_9("v\u0004\u001b\u001a\u0017"));
            }
            catch (Exception exception) {
                throw new sprlhi(new StringBuilder().insert(0, sprhxr.cfr_renamed_9("\u0003\u0010\u000e\u001f\u000f\u0005@\u0012\u0012\u0014\u0001\u0005\u0005Q\u0003\u0014\u0012\u0005\t\u0017\t\u0012\u0001\u0005\u0005Q\u0006\u0010\u0003\u0005\u000f\u0003\u0019K@")).append(exception.getMessage()).toString(), exception);
            }
            int n6 = n5 = 0;
            while (n6 < sprjgmArray.length) {
                object = sprjgmArray[n5].cfr_renamed_323();
                if (object != null && ((sprhhm)object).cfr_renamed_324() == 0) {
                    int n7;
                    sprigm[] sprigmArray = spraem.cfr_renamed_23(((sprhhm)object).cfr_renamed_313()).cfr_renamed_289();
                    int n8 = n7 = 0;
                    while (n8 < sprigmArray.length) {
                        sprigm sprigm2 = sprigmArray[n7];
                        if (sprigm2.cfr_renamed_312() == 6) {
                            try {
                                URI uRI = new URI(((sprml)((Object)sprigm2.cfr_renamed_313())).cfr_renamed_314());
                                sprkl sprkl3 = sprdxh.cfr_renamed_7276(certificateFactory, arg2, uRI);
                                if (sprkl3 == null) break;
                                arrayList.add(sprkl3);
                                break;
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                        }
                        n8 = ++n7;
                    }
                }
                n6 = ++n5;
            }
        }
        return arrayList;
    }

    public static void cfr_renamed_280(X509Certificate arg0, PublicKey arg1, String arg2) throws GeneralSecurityException {
        if (arg2 == null) {
            arg0.verify(arg1);
            return;
        }
        arg0.verify(arg1, arg2);
    }

    public static List<sprgv> cfr_renamed_9140(byte[] arg0, Map<sprigm, sprgv> arg1) throws CertificateParsingException {
        int n;
        if (arg0 == null) {
            return Collections.EMPTY_LIST;
        }
        sprigm[] sprigmArray = spraem.cfr_renamed_23(sproug.cfr_renamed_23(arg0).cfr_renamed_186()).cfr_renamed_289();
        ArrayList<sprgv> arrayList = new ArrayList<sprgv>();
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            sprigm sprigm2 = sprigmArray[n];
            sprgv sprgv2 = arg1.get(sprigm2);
            if (sprgv2 != null) {
                arrayList.add(sprgv2);
            }
            n2 = ++n;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprxgf cfr_renamed_2338(String arg0, byte[] arg1) throws sprlhi {
        try {
            sproug sproug2 = sproug.cfr_renamed_23(arg1);
            return sprxgf.cfr_renamed_184(sproug2.cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new sprlhi(new StringBuilder().insert(0, sprwhja.cfr_renamed_9("KRMO^^GE@\n^XAIKY]C@M\u000eOV^KD]CAD\u000e")).append(arg0).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9089(Date arg0, X509CRL arg1, Object arg2, sprefi arg3) throws sprlhi {
        int n;
        Object object;
        X509CRLEntry x509CRLEntry;
        boolean bl;
        try {
            bl = sprhyh.cfr_renamed_2130(arg1);
        }
        catch (CRLException cRLException) {
            throw new sprlhi(sprhxr.cfr_renamed_9("7\u0001\u0018\f\u0014\u0004Q\u0003\u0019\u0005\u0012\u000bQ\u0006\u001e\u0012Q\t\u001f\u0004\u0018\u0012\u0014\u0003\u0005@22=N"), cRLException);
        }
        if (bl) {
            Object object2;
            sprnbm sprnbm2;
            x509CRLEntry = arg1.getRevokedCertificate(sprgai.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
            object = x509CRLEntry.getCertificateIssuer();
            if (object == null) {
                sprnbm2 = sprooh.cfr_renamed_305(arg1);
                object2 = arg2;
            } else {
                sprnbm2 = sprooh.cfr_renamed_7314((X500Principal)object);
                object2 = arg2;
            }
            if (!sprooh.cfr_renamed_302(object2).equals(sprnbm2)) {
                return;
            }
        } else {
            if (!sprooh.cfr_renamed_302(arg2).equals(sprooh.cfr_renamed_305(arg1))) {
                return;
            }
            x509CRLEntry = arg1.getRevokedCertificate(sprgai.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
        }
        object = null;
        if (x509CRLEntry.hasExtensions()) {
            if (x509CRLEntry.hasUnsupportedCriticalExtension()) {
                throw new sprlhi(sprwhja.cfr_renamed_9("i|f\u000eO@^\\S\u000eBOY\u000e_@Y[Z^E\\^KN\u000eI\\CZCMKB\nKRZO@YGE@Y\u0000"));
            }
            try {
                object = sprqvg.cfr_renamed_23(sprgai.cfr_renamed_292(x509CRLEntry, sprrdm.cfr_renamed_953.cfr_renamed_19()));
            }
            catch (Exception exception) {
                throw new sprlhi(sprhxr.cfr_renamed_9("2\u0014\u0001\u0002\u000f\u001f@\u0012\u000f\u0015\u0005Q##,Q\u0005\u001f\u0014\u0003\u0019Q\u0005\t\u0014\u0014\u000e\u0002\t\u001e\u000eQ\u0003\u001e\u0015\u001d\u0004Q\u000e\u001e\u0014Q\u0002\u0014@\u0015\u0005\u0012\u000f\u0015\u0005\u0015N"), exception);
            }
        }
        int n2 = n = null == object ? 0 : ((sprqvg)object).cfr_renamed_5023();
        if (arg0.getTime() >= x509CRLEntry.getRevocationDate().getTime() || n == 0 || n == 1 || n == 2 || n == 10) {
            arg3.cfr_renamed_2164(n);
            arg3.cfr_renamed_2333(x509CRLEntry.getRevocationDate());
        }
    }

    public static sprxgf cfr_renamed_292(X509Extension arg0, String arg1) throws sprlhi {
        byte[] byArray = arg0.getExtensionValue(arg1);
        if (null == byArray) {
            return null;
        }
        return sprgai.cfr_renamed_2338(arg1, byArray);
    }

    public static boolean cfr_renamed_342(Set arg0) {
        return arg0 == null || arg0.contains(cfr_renamed_3) || arg0.isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date cfr_renamed_9098(Date arg0, int arg1, CertPath arg2, int arg3) throws sprlhi {
        if (1 != arg1 || arg3 <= 0) {
            return arg0;
        }
        X509Certificate x509Certificate = (X509Certificate)arg2.getCertificates().get(arg3 - 1);
        if (arg3 - 1 == 0) {
            sprjfn sprjfn2 = null;
            try {
                byte[] byArray = ((X509Certificate)arg2.getCertificates().get(arg3 - 1)).getExtensionValue(sprrx.cfr_renamed_0.cfr_renamed_19());
                if (byArray != null) {
                    sprjfn2 = sprjfn.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
                }
            }
            catch (IOException iOException) {
                throw new sprlhi(sprwhja.cfr_renamed_9("jKZO\u000eEH\nMO\\^\u000eMKD\u000eOV^KD]CAD\u000eIA_BN\u000eDA^\u000eHK\n\\OON\u0000"));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new sprlhi(sprhxr.cfr_renamed_9("$\u0010\u0014\u0014@\u001e\u0006Q\u0003\u0014\u0012\u0005@\u0016\u0005\u001f@\u0014\u0018\u0005\u0005\u001f\u0013\u0018\u000f\u001f@\u0012\u000f\u0004\f\u0015@\u001f\u000f\u0005@\u0013\u0005Q\u0012\u0014\u0001\u0015N"));
            }
            if (sprjfn2 != null) {
                try {
                    return sprjfn2.cfr_renamed_110();
                }
                catch (ParseException parseException) {
                    throw new sprlhi(sprwhja.cfr_renamed_9("jKZO\u000eL\\EC\nJKZO\u000eEH\nMO\\^\u000eMKD\u000eOV^KD]CAD\u000eIA_BN\u000eDA^\u000eHK\n^K\\YKN\u0000"), parseException);
                }
            }
        }
        return x509Certificate.getNotBefore();
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
                throw new sprxbi(sprhxr.cfr_renamed_9("!\u000f\u001d\t\u0012\u0019Q\u0011\u0004\u0001\u001d\t\u0017\t\u0014\u0012Q\t\u001f\u0006\u001e@\u0012\u0001\u001f\u000e\u001e\u0014Q\u0002\u0014@\u0015\u0005\u0012\u000f\u0015\u0005\u0015N"), iOException);
            }
            byteArrayOutputStream.reset();
            enumeration2 = enumeration;
        }
        return hashSet;
    }

    private static /* synthetic */ BigInteger cfr_renamed_2337(Object arg0) {
        return ((X509Certificate)arg0).getSerialNumber();
    }

    public static void cfr_renamed_5081(int arg0, List[] arg1, sprlem arg2, Set arg3) {
        int n;
        List list = arg1[arg0 - 1];
        int n2 = n = 0;
        while (n2 < list.size()) {
            sprbrh sprbrh2 = (sprbrh)list.get(n);
            if (cfr_renamed_3.equals(sprbrh2.getValidPolicy())) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprddm cfr_renamed_283(PublicKey arg0) throws CertPathValidatorException {
        try {
            return sprvhm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_593();
        }
        catch (Exception exception) {
            throw new sprxbi(sprwhja.cfr_renamed_9("}_L@KIZ\n^_LFGI\u000eAKS\u000eIOD@EZ\nLO\u000eNKIANKN\u0000"), exception);
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
                while (n4 < list.size() && ((sprbrh3 = (sprbrh)list.get(n2)).cfr_renamed_336() || (arg3 = sprgai.cfr_renamed_5083(arg3, arg1, sprbrh3)) != null)) {
                    n4 = ++n2;
                }
                n = --n3;
            }
        }
        return arg3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_9079(Date arg0, X509CRL arg1, List<CertStore> arg2, List<sprkl> arg3, sprrr arg4) throws sprlhi {
        sprjgm[] sprjgmArray;
        Object object;
        Object object2;
        sprwck sprwck2;
        Object object3;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(sprooh.cfr_renamed_305(arg1).cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new sprlhi(sprhxr.cfr_renamed_9("#\u0010\u000e\u001f\u000f\u0005@\u0014\u0018\u0005\u0012\u0010\u0003\u0005@\u0018\u0013\u0002\u0015\u0014\u0012Q\u0006\u0003\u000f\u001c@22=N"), iOException);
        }
        BigInteger bigInteger = null;
        try {
            object3 = sprgai.cfr_renamed_292(arg1, cfr_renamed_112);
            if (object3 != null) {
                bigInteger = sprktm.cfr_renamed_23(object3).cfr_renamed_162();
            }
        }
        catch (Exception exception) {
            throw new sprlhi(sprwhja.cfr_renamed_9("mxb\n@_CHKX\u000eOV^KD]CAD\u000eIA_BN\u000eDA^\u000eHK\nKRZXOIZOJ\nHXAG\u000ei|f\u0000"), exception);
        }
        try {
            object3 = arg1.getExtensionValue(cfr_renamed_79);
        }
        catch (Exception exception) {
            throw new sprlhi(sprhxr.cfr_renamed_9(")\u0002\u0013\u0004\t\u001f\u0007Q\u0004\u0018\u0013\u0005\u0012\u0018\u0002\u0004\u0014\u0018\u000f\u001f@\u0001\u000f\u0018\u000e\u0005@\u0014\u0018\u0005\u0005\u001f\u0013\u0018\u000f\u001f@\u0007\u0001\u001d\u0015\u0014@\u0012\u000f\u0004\f\u0015@\u001f\u000f\u0005@\u0013\u0005Q\u0012\u0014\u0001\u0015N"), exception);
        }
        x509CRLSelector.setMinCRLNumber(bigInteger == null ? null : bigInteger.add(BigInteger.valueOf(1L)));
        sprwck sprwck3 = sprwck2 = new sprwck(x509CRLSelector);
        sprwck2.cfr_renamed_157((byte[])object3);
        sprwck3.cfr_renamed_166(true);
        sprwck3.cfr_renamed_164(bigInteger);
        sprlxj<? extends CRL> sprlxj2 = sprwck3.cfr_renamed_1451();
        Set set = sprgrh.cfr_renamed_7277(sprlxj2, arg0, arg2, arg3);
        if (set.isEmpty() && sprjcf.cfr_renamed_5159(sprwhja.cfr_renamed_9("MEC\u0004]ZGXK\u0004^YCEJOB\u0004]OM_\\CZS\u0000R\u001b\u001a\u0017\u0004KDOHBOmxbn~"))) {
            int n;
            try {
                object2 = arg4.cfr_renamed_1550(sprhxr.cfr_renamed_9("8_UAY"));
            }
            catch (Exception exception) {
                throw new sprlhi(new StringBuilder().insert(0, sprwhja.cfr_renamed_9("MK@DA^\u000eI\\OO^K\nMO\\^GLGIO^K\nHKM^AXW\u0010\u000e")).append(exception.getMessage()).toString(), exception);
            }
            object = sprvcm.cfr_renamed_23(object3);
            sprjgmArray = ((sprvcm)object).cfr_renamed_322();
            int n2 = n = 0;
            while (n2 < sprjgmArray.length) {
                sprhhm sprhhm2 = sprjgmArray[n].cfr_renamed_323();
                if (sprhhm2 != null && sprhhm2.cfr_renamed_324() == 0) {
                    int n3;
                    sprigm[] sprigmArray = spraem.cfr_renamed_23(sprhhm2.cfr_renamed_313()).cfr_renamed_289();
                    int n4 = n3 = 0;
                    while (n4 < sprigmArray.length) {
                        sprigm sprigm2 = sprigmArray[n];
                        if (sprigm2.cfr_renamed_312() == 6) {
                            try {
                                sprkl sprkl2 = sprdxh.cfr_renamed_7276((CertificateFactory)object2, arg0, new URI(((sprml)((Object)sprigm2.cfr_renamed_313())).cfr_renamed_314()));
                                if (sprkl2 == null) break;
                                set = sprgrh.cfr_renamed_7277(sprlxj2, arg0, Collections.EMPTY_LIST, Collections.singletonList(sprkl2));
                                break;
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                        }
                        n4 = ++n3;
                    }
                }
                n2 = ++n;
            }
        }
        object2 = new HashSet();
        object = set.iterator();
        while (object.hasNext()) {
            sprjgmArray = (sprjgm[])object.next();
            if (!sprgai.cfr_renamed_2339((X509CRL)sprjgmArray)) continue;
            object2.add(sprjgmArray);
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_9077(sprwzj arg0, sprjgm arg1, Object arg2, sprgak arg3, Date arg4) throws sprlhi, sprluh {
        Set set;
        Cloneable cloneable;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet<sprnbm> hashSet = cloneable = new HashSet<sprnbm>();
            hashSet.add(sprooh.cfr_renamed_302(arg2));
            sprgai.cfr_renamed_7317(arg1, hashSet, x509CRLSelector);
        }
        catch (sprlhi sprlhi2) {
            throw new sprlhi(sprhxr.cfr_renamed_9("#\u001e\u0015\u001d\u0004Q\u000e\u001e\u0014Q\u0007\u0014\u0014Q\t\u0002\u0013\u0004\u0005\u0003@\u0018\u000e\u0017\u000f\u0003\r\u0010\u0014\u0018\u000f\u001f@\u0017\u0012\u001e\rQ\u0004\u0018\u0013\u0005\u0012\u0018\u0002\u0004\u0014\u0018\u000f\u001f@\u0001\u000f\u0018\u000e\u0005N"), sprlhi2);
        }
        if (arg2 instanceof X509Certificate) {
            x509CRLSelector.setCertificateChecking((X509Certificate)arg2);
        }
        cloneable = new sprwck(x509CRLSelector).cfr_renamed_167(true).cfr_renamed_1451();
        Set set2 = set = sprgrh.cfr_renamed_7277(cloneable, arg4, arg3.cfr_renamed_2283(), arg3.cfr_renamed_7293());
        sprgai.cfr_renamed_9162(arg0, set2, arg2);
        return set2;
    }

    public static TrustAnchor cfr_renamed_2273(X509Certificate arg0, Set arg1, String arg2) throws sprlhi {
        TrustAnchor trustAnchor = null;
        PublicKey publicKey = null;
        Exception exception = null;
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal x500Principal = arg0.getIssuerX500Principal();
        x509CertSelector.setSubject(x500Principal);
        sprnbm sprnbm2 = null;
        Iterator iterator = arg1.iterator();
        block4: while (true) {
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
                        block15: {
                            if (trustAnchor.getCA() != null && trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
                                if (sprnbm2 == null) {
                                    sprnbm2 = sprnbm.cfr_renamed_23(x500Principal.getEncoded());
                                }
                                try {
                                    sprnbm sprnbm3 = sprnbm.cfr_renamed_23(trustAnchor.getCA().getEncoded());
                                    if (sprnbm2.equals(sprnbm3)) {
                                        publicKey = trustAnchor.getCAPublicKey();
                                    } else {
                                        trustAnchor = null;
                                    }
                                    break block15;
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
                if (publicKey2 == null) continue block4;
                try {
                    sprgai.cfr_renamed_280(arg0, publicKey, arg2);
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
            throw new sprlhi(sprwhja.cfr_renamed_9("~\\_]^oDMBAX\u000eLA_@N\u000eH[^\u000eIKXZCHCMKZO\u000e\\OFGNO^GE@\nHKGFKN\u0000"), exception);
        }
        return trustAnchor;
    }

    public static void cfr_renamed_339(int arg0, List[] arg1, String arg2, Map arg3, X509Certificate arg4) throws sprlhi, CertPathValidatorException {
        boolean bl;
        block11: {
            boolean bl2 = false;
            for (sprbrh sprbrh2 : arg1[arg0]) {
                if (!sprbrh2.getValidPolicy().equals(arg2)) continue;
                bl2 = true;
                sprbrh2.cfr_renamed_0 = (Set)arg3.get(arg2);
                bl = bl2;
                break block11;
            }
            bl = bl2;
        }
        if (!bl) {
            for (sprbrh sprbrh2 : arg1[arg0]) {
                sprbrh sprbrh3;
                if (!cfr_renamed_3.equals(sprbrh2.getValidPolicy())) continue;
                Set set = null;
                sprszm sprszm2 = null;
                try {
                    sprszm2 = sprcen.cfr_renamed_23(sprgai.cfr_renamed_292(arg4, cfr_renamed_86));
                }
                catch (Exception exception) {
                    throw new sprlhi(sprhxr.cfr_renamed_9("#\u0014\u0012\u0005\t\u0017\t\u0012\u0001\u0005\u0005Q\u0010\u001e\f\u0018\u0003\u0018\u0005\u0002@\u0012\u0001\u001f\u000e\u001e\u0014Q\u0002\u0014@\u0015\u0005\u0012\u000f\u0015\u0005\u0015N"), exception);
                }
                Enumeration enumeration = sprszm2.cfr_renamed_329();
                while (enumeration.hasMoreElements()) {
                    sprdcm sprdcm2 = null;
                    try {
                        sprdcm2 = sprdcm.cfr_renamed_23(enumeration.nextElement());
                    }
                    catch (Exception exception) {
                        throw new sprlhi(sprwhja.cfr_renamed_9("~EBCMS\u000eC@LAXCKZCAD\u000eIOD@EZ\nLO\u000eNKIANKN\u0000"), exception);
                    }
                    if (!cfr_renamed_3.equals(sprdcm2.cfr_renamed_330().cfr_renamed_19())) continue;
                    try {
                        set = sprgai.cfr_renamed_5079(sprdcm2.cfr_renamed_332());
                        break;
                    }
                    catch (CertPathValidatorException certPathValidatorException) {
                        throw new sprxbi(sprhxr.cfr_renamed_9("0\u001e\f\u0018\u0003\b@\u0000\u0015\u0010\f\u0018\u0006\u0018\u0005\u0003@\u0018\u000e\u0017\u000fQ\u0013\u0014\u0014Q\u0003\u001e\u0015\u001d\u0004Q\u000e\u001e\u0014Q\u0002\u0014@\u0013\u0015\u0018\f\u0005N"), certPathValidatorException);
                    }
                }
                boolean bl3 = false;
                if (arg4.getCriticalExtensionOIDs() != null) {
                    bl3 = arg4.getCriticalExtensionOIDs().contains(cfr_renamed_86);
                }
                if (!cfr_renamed_3.equals((sprbrh3 = (sprbrh)sprbrh2.getParent()).getValidPolicy())) break;
                sprbrh sprbrh4 = new sprbrh(new ArrayList(), arg0, (Set)arg3.get(arg2), sprbrh3, set, arg2, bl3);
                sprbrh3.cfr_renamed_5082(sprbrh4);
                arg1[arg0].add(sprbrh4);
                return;
            }
        }
    }

    public static PublicKey cfr_renamed_7313(List arg0, int arg1, sprrr arg2) throws CertPathValidatorException {
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
                throw new CertPathValidatorException(sprwhja.cfr_renamed_9("jyo\n^K\\KCOZO\\Y\u000eIOD@EZ\nLO\u000eC@BKXG^KN\u000eL\\EC\n^XK\\GE[Y\u000eIKXZCHCMKZO\u0000"));
            }
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey)publicKey;
            if (dSAPublicKey2.getParams() != null) {
                DSAParams dSAParams = dSAPublicKey2.getParams();
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(dSAPublicKey.getY(), dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
                try {
                    KeyFactory keyFactory = arg2.cfr_renamed_1511("DSA");
                    return keyFactory.generatePublic(dSAPublicKeySpec);
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.getMessage());
                }
            }
            n2 = ++n;
        }
        throw new CertPathValidatorException(sprhxr.cfr_renamed_9("$\"!Q\u0010\u0010\u0012\u0010\r\u0014\u0014\u0014\u0012\u0002@\u0012\u0001\u001f\u000e\u001e\u0014Q\u0002\u0014@\u0018\u000e\u0019\u0005\u0003\t\u0005\u0005\u0015@\u0017\u0012\u001e\rQ\u0010\u0003\u0005\u0007\t\u001e\u0015\u0002@\u0012\u0005\u0003\u0014\u0018\u0006\u0018\u0003\u0010\u0014\u0014N"));
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
                sprgai.cfr_renamed_5099(arg0, sprbrh3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_9139(X509Certificate arg0, Set arg1, String arg2) throws sprlhi {
        try {
            return sprgai.cfr_renamed_2273(arg0, arg1, arg2) != null;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_9142(X509Certificate arg0, List<CertStore> arg1, List<sprgv> arg2) throws sprlhi {
        Object object;
        Object object2;
        X509CertSelector x509CertSelector;
        block5: {
            x509CertSelector = new X509CertSelector();
            try {
                x509CertSelector.setSubject(sprooh.cfr_renamed_9099(arg0).cfr_renamed_91());
            }
            catch (Exception exception) {
                throw new sprlhi(sprwhja.cfr_renamed_9("y[HDOM^\u000eI\\CZO\\CO\nHE\\\nMO\\^GLGIO^K\n]OBOM^AX\u000e^A\nHC@N\u000eC]Y[O\\\nMO\\^GLGIO^K\nME[FJ\n@EZ\nLO\u000eYK^\u0000"), exception);
            }
            {
                byte[] byArray;
                object2 = arg0.getExtensionValue(cfr_renamed_102);
                if (object2 == null || (byArray = sprzne.cfr_renamed_23(((sproug)(object = sproug.cfr_renamed_23(object2))).cfr_renamed_186()).cfr_renamed_327()) == null) break block5;
                x509CertSelector.setSubjectKeyIdentifier(new sprfvg(byArray).cfr_renamed_91());
            }
        }
        object2 = new sprddk(x509CertSelector).cfr_renamed_1451();
        object = new LinkedHashSet();
        try {
            sprgai.cfr_renamed_7308((LinkedHashSet)object, (sprexj)object2, arg1);
            sprgai.cfr_renamed_7308((LinkedHashSet)object, (sprexj)object2, arg2);
            return object;
        }
        catch (sprlhi sprlhi2) {
            throw new sprlhi(sprhxr.cfr_renamed_9("8\u0013\u0002\u0015\u0014\u0012Q\u0003\u0014\u0012\u0005\t\u0017\t\u0012\u0001\u0005\u0005Q\u0003\u0010\u000e\u001f\u000f\u0005@\u0013\u0005Q\u0013\u0014\u0001\u0003\u0003\u0019\u0005\u0015N"), sprlhi2);
        }
    }

    public static Date cfr_renamed_7272(sprgak arg0, Date arg1) {
        Date date = arg0.cfr_renamed_7315();
        if (null == date) {
            return arg1;
        }
        return date;
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
        sprgai.cfr_renamed_5099(arg1, arg2);
        return arg0;
    }

    public static TrustAnchor cfr_renamed_2340(X509Certificate arg0, Set arg1) throws sprlhi {
        return sprgai.cfr_renamed_2273(arg0, arg1, null);
    }
}

