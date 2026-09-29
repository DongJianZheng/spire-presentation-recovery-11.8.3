/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahg;
import com.spire.presentation.packages.sprbjo;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreog;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprglg;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnmy;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvog;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
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
import java.security.cert.CertificateFactory;
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

public class sprnjg {
    public static final String cfr_renamed_96;
    public static final String cfr_renamed_105;
    public static final String cfr_renamed_137;
    public static final String cfr_renamed_79;
    public static final String[] cfr_renamed_107;
    public static final String cfr_renamed_132;
    public static final String cfr_renamed_102;
    public static final int cfr_renamed_93 = 5;
    public static final int cfr_renamed_86 = 6;
    public static final String cfr_renamed_152;
    public static final String cfr_renamed_112;
    public static final String cfr_renamed_119;
    public static final String cfr_renamed_91;
    public static final String cfr_renamed_0;
    public static final String cfr_renamed_1 = "2.5.29.32.0";
    public static final String cfr_renamed_2;
    public static final String cfr_renamed_3;
    public static final String cfr_renamed_4;

    private static /* synthetic */ void cfr_renamed_7340(List[] arg0, spreog arg1) {
        spreog spreog2 = arg1;
        arg0[arg1.getDepth()].remove(spreog2);
        if (spreog2.cfr_renamed_336()) {
            Iterator iterator;
            Iterator iterator2 = iterator = arg1.getChildren();
            while (iterator2.hasNext()) {
                spreog spreog3 = (spreog)iterator.next();
                iterator2 = iterator;
                sprnjg.cfr_renamed_7340(arg0, spreog3);
            }
        }
    }

    private static /* synthetic */ BigInteger cfr_renamed_2337(Object arg0) {
        return ((X509Certificate)arg0).getSerialNumber();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprddm cfr_renamed_283(PublicKey arg0) throws CertPathValidatorException {
        try {
            sprrzm sprrzm2 = new sprrzm(arg0.getEncoded());
            return sprvhm.cfr_renamed_23(sprrzm2.cfr_renamed_24()).cfr_renamed_593();
        }
        catch (Exception exception) {
            throw new CertPathValidatorException(sprnmy.cfr_renamed_9("r\u001aC\u0005D\fUOQ\u001aC\u0003H\f\u0001\u0004D\u0016\u0001\f@\u0001O\u0000UOC\n\u0001\u000bD\fN\u000bD\u000b\u000f"), exception);
        }
    }

    public static X500Principal cfr_renamed_282(X509Certificate arg0) {
        return arg0.getSubjectX500Principal();
    }

    public static void cfr_renamed_339(int arg0, List[] arg1, String arg2, Map arg3, X509Certificate arg4) throws sprglg, CertPathValidatorException {
        boolean bl;
        block11: {
            boolean bl2 = false;
            for (spreog spreog2 : arg1[arg0]) {
                if (!spreog2.getValidPolicy().equals(arg2)) continue;
                bl2 = true;
                spreog2.cfr_renamed_5094((Set)arg3.get(arg2));
                bl = bl2;
                break block11;
            }
            bl = bl2;
        }
        if (!bl) {
            for (spreog spreog2 : arg1[arg0]) {
                spreog spreog3;
                if (!cfr_renamed_1.equals(spreog2.getValidPolicy())) continue;
                Set set = null;
                sprszm sprszm2 = null;
                try {
                    sprszm2 = sprcen.cfr_renamed_23(sprnjg.cfr_renamed_292(arg4, cfr_renamed_119));
                }
                catch (Exception exception) {
                    throw new sprglg(sprbjo.cfr_renamed_9("QZ`K{Y{\\sKw\u001fbP~VqVwL2\\sQ|Pf\u001fpZ2[w\\}[w[<"), exception);
                }
                Enumeration enumeration = sprszm2.cfr_renamed_329();
                while (enumeration.hasMoreElements()) {
                    sprdcm sprdcm2 = null;
                    try {
                        sprdcm2 = sprdcm.cfr_renamed_23(enumeration.nextElement());
                    }
                    catch (Exception exception) {
                        throw new sprglg(sprnmy.cfr_renamed_9("q\u0000M\u0006B\u0016\u0001\u0006O\tN\u001dL\u000eU\u0006N\u0001\u0001\f@\u0001O\u0000UOC\n\u0001\u000bD\fN\u000bD\u000b\u000f"), exception);
                    }
                    if (!cfr_renamed_1.equals(sprdcm2.cfr_renamed_330().cfr_renamed_19())) continue;
                    try {
                        set = sprnjg.cfr_renamed_5079(sprdcm2.cfr_renamed_332());
                        break;
                    }
                    catch (CertPathValidatorException certPathValidatorException) {
                        throw new CertPathValidatorException(sprbjo.cfr_renamed_9("BP~VqF2Ng^~VtVwM2V|Y}\u001faZf\u001fqPgSv\u001f|Pf\u001fpZ2]gV~K<"), certPathValidatorException);
                    }
                }
                boolean bl3 = false;
                if (arg4.getCriticalExtensionOIDs() != null) {
                    bl3 = arg4.getCriticalExtensionOIDs().contains(cfr_renamed_119);
                }
                if (!cfr_renamed_1.equals((spreog3 = (spreog)spreog2.getParent()).getValidPolicy())) break;
                spreog spreog4 = new spreog(new ArrayList(), arg0, (Set)arg3.get(arg2), spreog3, set, arg2, bl3);
                spreog3.cfr_renamed_7322(spreog4);
                arg1[arg0].add(spreog4);
                return;
            }
        }
    }

    public static X500Principal cfr_renamed_305(X509CRL arg0) {
        return arg0.getIssuerX500Principal();
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
                throw new CertPathValidatorException(sprnmy.cfr_renamed_9("e<`OQ\u000eS\u000eL\nU\nS\u001c\u0001\f@\u0001O\u0000UOC\n\u0001\u0006O\u0007D\u001dH\u001bD\u000b\u0001\tS\u0000LOQ\u001dD\u0019H\u0000T\u001c\u0001\fD\u001dU\u0006G\u0006B\u000eU\n\u000f"));
            }
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey)publicKey;
            if (dSAPublicKey2.getParams() != null) {
                DSAParams dSAParams = dSAPublicKey2.getParams();
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(dSAPublicKey.getY(), dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
                try {
                    KeyFactory keyFactory = KeyFactory.getInstance("DSA");
                    return keyFactory.generatePublic(dSAPublicKeySpec);
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.getMessage());
                }
            }
            n2 = ++n;
        }
        throw new CertPathValidatorException(sprbjo.cfr_renamed_9("VlS\u001fb^`^\u007fZfZ`L2\\sQ|Pf\u001fpZ2V|WwM{Kw[2Y`P\u007f\u001fbMwI{PgL2\\wMfVtVq^fZ<"));
    }

    public static spreog cfr_renamed_7333(int arg0, List[] arg1, String arg2, spreog arg3) {
        Iterator iterator = arg1[arg0].iterator();
        while (iterator.hasNext()) {
            spreog spreog2 = (spreog)iterator.next();
            if (!spreog2.getValidPolicy().equals(arg2)) continue;
            ((spreog)spreog2.getParent()).cfr_renamed_7320(spreog2);
            iterator.remove();
            int n = arg0 - 1;
            while (n >= 0) {
                spreog spreog3;
                int n2;
                int n3;
                List list = arg1[n3];
                int n4 = n2 = 0;
                while (n4 < list.size() && ((spreog3 = (spreog)list.get(n2)).cfr_renamed_336() || (arg3 = sprnjg.cfr_renamed_7332(arg3, arg1, spreog3)) != null)) {
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
    private static /* synthetic */ sprxgf cfr_renamed_2338(String arg0, byte[] arg1) throws sprglg {
        try {
            sprrzm sprrzm2 = new sprrzm(arg1);
            sproug sproug2 = (sproug)sprrzm2.cfr_renamed_24();
            sprrzm2 = new sprrzm(sproug2.cfr_renamed_186());
            return sprrzm2.cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new sprglg(new StringBuilder().insert(0, sprnmy.cfr_renamed_9("D\u0017B\nQ\u001bH\u0000OOQ\u001dN\fD\u001cR\u0006O\b\u0001\nY\u001bD\u0001R\u0006N\u0001\u0001")).append(arg0).toString(), exception);
        }
    }

    public static void cfr_renamed_5081(int arg0, List[] arg1, sprlem arg2, Set arg3) {
        int n;
        List list = arg1[arg0 - 1];
        int n2 = n = 0;
        while (n2 < list.size()) {
            spreog spreog2 = (spreog)list.get(n);
            if (cfr_renamed_1.equals(spreog2.getValidPolicy())) {
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add(arg2.cfr_renamed_19());
                spreog spreog3 = new spreog(new ArrayList(), arg0, hashSet, spreog2, arg3, arg2.cfr_renamed_19(), false);
                spreog2.cfr_renamed_7322(spreog3);
                arg1[arg0].add(spreog3);
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
    public static void cfr_renamed_7304(Date arg0, X509CRL arg1, Object arg2, sprahg arg3) throws sprglg {
        int n;
        Object object;
        boolean bl;
        X509CRLEntry x509CRLEntry = null;
        try {
            bl = sprnjg.cfr_renamed_2130(arg1);
        }
        catch (CRLException cRLException) {
            throw new sprglg(sprbjo.cfr_renamed_9("ysV~Zv\u001fqWw\\y\u001ftP`\u001f{QvV`ZqK2|@s<"), cRLException);
        }
        if (bl) {
            x509CRLEntry = arg1.getRevokedCertificate(sprnjg.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
            object = x509CRLEntry.getCertificateIssuer();
            if (object == null) {
                object = sprnjg.cfr_renamed_305(arg1);
            }
            if (!sprnjg.cfr_renamed_302(arg2).equals(object)) {
                return;
            }
        } else {
            if (!sprnjg.cfr_renamed_302(arg2).equals(sprnjg.cfr_renamed_305(arg1))) {
                return;
            }
            x509CRLEntry = arg1.getRevokedCertificate(sprnjg.cfr_renamed_2337(arg2));
            if (x509CRLEntry == null) {
                return;
            }
        }
        object = null;
        if (x509CRLEntry.hasExtensions()) {
            try {
                object = sprqvg.cfr_renamed_23(sprnjg.cfr_renamed_292(x509CRLEntry, sprrdm.cfr_renamed_953.cfr_renamed_19()));
            }
            catch (Exception exception) {
                throw new sprglg(sprnmy.cfr_renamed_9("s\n@\u001cN\u0001\u0001\fN\u000bDOb=mOD\u0001U\u001dXOD\u0017U\nO\u001cH\u0000OOB\u0000T\u0003EOO\u0000UOC\n\u0001\u000bD\fN\u000bD\u000b\u000f"), exception);
            }
        }
        int n2 = n = null == object ? 0 : ((sprqvg)object).cfr_renamed_97().intValue();
        if (arg0.getTime() >= x509CRLEntry.getRevocationDate().getTime() || n == 0 || n == 1 || n == 2 || n == 10) {
            arg3.cfr_renamed_2164(n);
            arg3.cfr_renamed_2333(x509CRLEntry.getRevocationDate());
        }
    }

    public static boolean cfr_renamed_5080(int arg0, List[] arg1, sprlem arg2, Set arg3) {
        int n;
        List list = arg1[arg0 - 1];
        int n2 = n = 0;
        while (n2 < list.size()) {
            spreog spreog2 = (spreog)list.get(n);
            if (spreog2.getExpectedPolicies().contains(arg2.cfr_renamed_19())) {
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add(arg2.cfr_renamed_19());
                spreog spreog3 = new spreog(new ArrayList(), arg0, hashSet, spreog2, arg3, arg2.cfr_renamed_19(), false);
                spreog2.cfr_renamed_7322(spreog3);
                arg1[arg0].add(spreog3);
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static boolean cfr_renamed_286(X509Certificate arg0) {
        return ((Object)arg0.getSubjectDN()).equals(arg0.getIssuerDN());
    }

    static {
        cfr_renamed_119 = sprrdm.cfr_renamed_723.cfr_renamed_19();
        cfr_renamed_112 = sprrdm.cfr_renamed_133.cfr_renamed_19();
        cfr_renamed_2 = sprrdm.cfr_renamed_31.cfr_renamed_19();
        cfr_renamed_79 = sprrdm.cfr_renamed_137.cfr_renamed_19();
        cfr_renamed_105 = sprrdm.spr\ufe34.cfr_renamed_19();
        cfr_renamed_96 = sprrdm.cfr_renamed_272.cfr_renamed_19();
        cfr_renamed_102 = sprrdm.cfr_renamed_145.cfr_renamed_19();
        cfr_renamed_152 = sprrdm.cfr_renamed_96.cfr_renamed_19();
        cfr_renamed_3 = sprrdm.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_91 = sprrdm.cfr_renamed_82.cfr_renamed_19();
        cfr_renamed_4 = sprrdm.cfr_renamed_957.cfr_renamed_19();
        cfr_renamed_132 = sprrdm.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_0 = sprrdm.cfr_renamed_105.cfr_renamed_19();
        cfr_renamed_137 = sprrdm.cfr_renamed_128.cfr_renamed_19();
        String[] stringArray = new String[11];
        stringArray[0] = sprbjo.cfr_renamed_9("gQaOw\\{Y{Zv");
        stringArray[1] = sprnmy.cfr_renamed_9("J\nX,N\u0002Q\u001dN\u0002H\u001cD");
        stringArray[2] = sprbjo.cfr_renamed_9("\\S|}RbM}R{Lw");
        stringArray[3] = sprnmy.cfr_renamed_9("\u000eG\tH\u0003H\u000eU\u0006N\u0001b\u0007@\u0001F\nE");
        stringArray[4] = sprbjo.cfr_renamed_9("LgOwMaZvZv");
        stringArray[5] = sprnmy.cfr_renamed_9("\fD\u001cR\u000eU\u0006N\u0001n\tn\u001fD\u001d@\u001bH\u0000O");
        stringArray[6] = sprbjo.cfr_renamed_9("qZ`K{Y{\\sKww}Sv");
        stringArray[7] = "unknown";
        stringArray[8] = sprnmy.cfr_renamed_9("S\nL\u0000W\ng\u001dN\u0002b=m");
        stringArray[9] = sprbjo.cfr_renamed_9("O`VdV~ZuZEVfWvMsH|");
        stringArray[10] = sprnmy.cfr_renamed_9("\u000e`,N\u0002Q\u001dN\u0002H\u001cD");
        cfr_renamed_107 = stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_5097(sprexj arg0, List arg1) throws sprglg {
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
                    throw new sprglg(sprbjo.cfr_renamed_9("o`PpSwR2HzV~Z2O{\\yV|X2\\wMfVtVq^fZa\u001ftM}R2g<\n\"\u00062LfP`Z<"), sprine2);
                }
            }
            object = (CertStore)e;
            try {
                hashSet.addAll(sprexj.cfr_renamed_5098(arg0, (CertStore)object));
            }
            catch (CertStoreException certStoreException) {
                throw new sprglg(sprnmy.cfr_renamed_9("?S\u0000C\u0003D\u0002\u0001\u0018I\u0006M\n\u0001\u001fH\fJ\u0006O\b\u0001\fD\u001dU\u0006G\u0006B\u000eU\nROG\u001dN\u0002\u0001\fD\u001dU\u0006G\u0006B\u000eU\n\u0001\u001cU\u0000S\n\u000f"), certStoreException);
            }
        }
        return hashSet;
    }

    public static void cfr_renamed_280(X509Certificate arg0, PublicKey arg1, String arg2) throws GeneralSecurityException {
        if (arg2 == null) {
            arg0.verify(arg1);
            return;
        }
        arg0.verify(arg1, arg2);
    }

    public static spreog cfr_renamed_7332(spreog arg0, List[] arg1, spreog arg2) {
        spreog spreog2 = (spreog)arg2.getParent();
        if (arg0 == null) {
            return null;
        }
        if (spreog2 == null) {
            int n;
            int n2 = n = 0;
            while (n2 < arg1.length) {
                arg1[n++] = new ArrayList();
                n2 = n;
            }
            return null;
        }
        spreog2.cfr_renamed_7320(arg2);
        sprnjg.cfr_renamed_7340(arg1, arg2);
        return arg0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_7341(sprvog arg0, List arg1) throws sprglg {
        var2_2 = new HashSet<Certificate>();
        var3_3 = arg1.iterator();
        var4_4 = null;
        try {
            var4_4 = CertificateFactory.getInstance(sprbjo.cfr_renamed_9("J\u0011'\u000f+"));
            v0 = var3_3;
            if (true) ** GOTO lbl12
        }
        catch (CertificateException var5_5) {
            throw new sprglg(var5_5.getMessage(), var5_5);
        }
        block8: while (true) {
            v0 = var3_3;
lbl12:
            // 2 sources

            if (!v0.hasNext()) {
                return var2_2;
            }
            var5_6 = var3_3.next();
            if (var5_6 instanceof sprug) {
                var6_7 = (sprug)var5_6;
                try {
                    var7_8 = var6_7.cfr_renamed_3216(arg0).iterator();
                    while (true) {
                        if (!var7_8.hasNext()) continue block8;
                        var8_13 = var7_8.next();
                        if (var8_13 instanceof sprjn) {
                            var2_2.add(var4_4.generateCertificate(new ByteArrayInputStream(((sprjn)var8_13).cfr_renamed_91())));
                            continue;
                        }
                        if (!(var8_13 instanceof Certificate)) {
                            throw new sprglg(sprnmy.cfr_renamed_9(":O\u0004O\u0000V\u0001\u0001\u0000C\u0005D\fUOG\u0000T\u0001EOH\u0001\u0001\fD\u001dU\u0006G\u0006B\u000eU\n\u0001\u001cU\u0000S\n\u000f"));
                        }
                        var2_2.add((Certificate)var8_13);
                    }
                }
                catch (sprine var7_9) {
                    throw new sprglg(sprbjo.cfr_renamed_9("o`PpSwR2HzV~Z2O{\\yV|X2\\wMfVtVq^fZa\u001ftM}R2g<\n\"\u00062LfP`Z<"), var7_9);
                }
                catch (IOException var7_10) {
                    throw new sprglg(sprnmy.cfr_renamed_9("q\u001dN\rM\nLOV\u0007H\u0003DOD\u0017U\u001d@\fU\u0006O\b\u0001\fD\u001dU\u0006G\u0006B\u000eU\nROG\u001dN\u0002\u00017\u000fZ\u0011V\u0001\u001cU\u0000S\n\u000f"), var7_10);
                }
                catch (CertificateException var7_11) {
                    throw new sprglg(sprbjo.cfr_renamed_9("BM}]~Z\u007f\u001feW{Sw\u001fwGfMs\\fV|X2\\wMfVtVq^fZa\u001ftM}R2g<\n\"\u00062LfP`Z<"), var7_11);
                }
            }
            var6_7 = (CertStore)var5_6;
            try {
                var2_2.addAll(var6_7.getCertificates(arg0));
            }
            catch (CertStoreException var7_12) {
                throw new sprglg(sprnmy.cfr_renamed_9("?S\u0000C\u0003D\u0002\u0001\u0018I\u0006M\n\u0001\u001fH\fJ\u0006O\b\u0001\fD\u001dU\u0006G\u0006B\u000eU\nROG\u001dN\u0002\u0001\fD\u001dU\u0006G\u0006B\u000eU\n\u0001\u001cU\u0000S\n\u000f"), var7_12);
            }
        }
    }

    public static sprxgf cfr_renamed_292(X509Extension arg0, String arg1) throws sprglg {
        byte[] byArray = arg0.getExtensionValue(arg1);
        if (byArray == null) {
            return null;
        }
        return sprnjg.cfr_renamed_2338(arg1, byArray);
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
            throw new CRLException(new StringBuilder().insert(0, sprbjo.cfr_renamed_9("zj\\wOfV}Q2Mw^vV|X2vaLgV|XVVaK`VpJfV}QBP{Qf\u00052")).append(exception).toString());
        }
    }

    public static Date cfr_renamed_5077(PKIXParameters arg0, Date arg1) {
        Date date = arg0.getDate();
        if (null == date) {
            return arg1;
        }
        return date;
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
                throw new CertPathValidatorException(sprnmy.cfr_renamed_9("?N\u0003H\fXOP\u001a@\u0003H\tH\nSOH\u0001G\u0000\u0001\f@\u0001O\u0000UOC\n\u0001\u000bD\fN\u000bD\u000b\u000f"), iOException);
            }
            byteArrayOutputStream.reset();
            enumeration2 = enumeration;
        }
        return hashSet;
    }

    public static boolean cfr_renamed_342(Set arg0) {
        return arg0 == null || arg0.contains(cfr_renamed_1) || arg0.isEmpty();
    }

    public static Date cfr_renamed_364(PKIXParameters arg0) {
        Date date = arg0.getDate();
        if (date == null) {
            date = new Date();
        }
        return date;
    }

    public static X500Principal cfr_renamed_302(Object arg0) {
        if (arg0 instanceof X509Certificate) {
            return ((X509Certificate)arg0).getIssuerX500Principal();
        }
        throw new IllegalArgumentException(sprbjo.cfr_renamed_9("J|T|PeQ2\\wMfVtVq^fZ2KkOw"));
    }
}

