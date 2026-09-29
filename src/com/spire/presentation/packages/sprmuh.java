/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprbrh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprddk;
import com.spire.presentation.packages.sprebm;
import com.spire.presentation.packages.sprefi;
import com.spire.presentation.packages.sprerh;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprgai;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprgth;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spritj;
import com.spire.presentation.packages.sprixh;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprke;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprluh;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprmfka;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprooh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsem;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxbi;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxjm;
import com.spire.presentation.packages.sprxqy;
import com.spire.presentation.packages.sprygm;
import com.spire.presentation.packages.spryrh;
import com.spire.presentation.packages.spryth;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

public class sprmuh {
    public static final String cfr_renamed_114;
    public static final String cfr_renamed_96;
    public static final String cfr_renamed_105;
    public static final String cfr_renamed_137;
    public static final String cfr_renamed_79;
    public static final String cfr_renamed_107;
    public static final String cfr_renamed_132;
    public static final String[] cfr_renamed_102;
    public static final String cfr_renamed_93;
    public static final String cfr_renamed_86 = "2.5.29.32.0";
    public static final String cfr_renamed_152;
    public static final String cfr_renamed_112;
    public static final int cfr_renamed_119 = 6;
    public static final String cfr_renamed_91;
    public static final String cfr_renamed_0;
    public static final int cfr_renamed_1 = 5;
    public static final String cfr_renamed_2;
    private static final Class cfr_renamed_3;
    public static final String cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9084(CertPath arg0, int arg1, sprerh arg2, boolean arg3) throws CertPathValidatorException {
        List<? extends Certificate> list = arg0.getCertificates();
        X509Certificate x509Certificate = (X509Certificate)list.get(arg1);
        int n = list.size();
        int n2 = n - arg1;
        if (!sprgai.cfr_renamed_286(x509Certificate) || n2 >= n && !arg3) {
            int n3;
            sprszm sprszm2;
            sprnbm sprnbm2 = sprooh.cfr_renamed_282(x509Certificate);
            try {
                sprszm2 = sprszm.cfr_renamed_23(sprnbm2);
            }
            catch (Exception exception) {
                throw new CertPathValidatorException(sprxqy.cfr_renamed_9("\u001fY9D*U3N4\u0001?Y.S;B.H4FzR/C0D9UzO;L?\u0001-I?OzB2D9J3O=\u0001)T8U(D?Rt"), (Throwable)exception, arg0, arg1);
            }
            {
                arg2.cfr_renamed_5066(sprszm2);
                arg2.cfr_renamed_5067(sprszm2);
            }
            spraem spraem2 = null;
            try {
                spraem2 = spraem.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_107));
            }
            catch (Exception exception) {
                throw new CertPathValidatorException(sprxqy.cfr_renamed_9("r/C0D9Uz@6U?S4@.H,DzO;L?\u0001?Y.D4R3N4\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), (Throwable)exception, arg0, arg1);
            }
            sprxjm[] sprxjmArray = sprnbm.cfr_renamed_23(sprszm2).cfr_renamed_9085(sprebm.cfr_renamed_951);
            int n4 = n3 = 0;
            while (n4 != sprxjmArray.length) {
                String string = ((sprml)((Object)sprxjmArray[n3].cfr_renamed_4541().cfr_renamed_97())).cfr_renamed_314();
                sprigm sprigm2 = new sprigm(1, string);
                try {
                    sprerh sprerh2 = arg2;
                    sprigm sprigm3 = sprigm2;
                    sprerh2.cfr_renamed_5068(sprigm3);
                    sprerh2.cfr_renamed_5069(sprigm3);
                }
                catch (sprixh sprixh2) {
                    throw new CertPathValidatorException(sprmfka.cfr_renamed_9("fOWNG_P\u001aVRPY^\u001aSUG\u001aV_GN\\\\\\YTNP\u001aFOWPPYA\u001aTVA_GTTN\\LP\u001aPWTSY\u001aS[\\VP^\u001b"), (Throwable)sprixh2, arg0, arg1);
                }
                n4 = ++n3;
            }
            if (spraem2 != null) {
                int n5;
                sprigm[] sprigmArray = null;
                try {
                    sprigmArray = spraem2.cfr_renamed_289();
                }
                catch (Exception exception) {
                    throw new CertPathValidatorException(sprxqy.cfr_renamed_9("\tT8K?B.\u0001;M.D(O;U3W?\u00014@7DzB5O.D4U)\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), (Throwable)exception, arg0, arg1);
                }
                int n6 = n5 = 0;
                while (n6 < sprigmArray.length) {
                    try {
                        arg2.cfr_renamed_5068(sprigmArray[n5]);
                        arg2.cfr_renamed_5069(sprigmArray[n5]);
                    }
                    catch (sprixh sprixh3) {
                        throw new CertPathValidatorException(sprmfka.cfr_renamed_9("i@XAHP_\u0015Y]_VQ\u0015\\ZH\u0015YPHASSSV[A_\u0015I@X__VN\u0015[YNPH[[ASC_\u0015TTWP\u001aS[\\VP^\u001b"), (Throwable)sprixh3, arg0, arg1);
                    }
                    n6 = ++n5;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprbrh cfr_renamed_9086(CertPath arg0, int arg1, Set arg2, sprbrh arg3, List[] arg4, int arg5, boolean arg6) throws CertPathValidatorException {
        int n;
        Object object;
        sprbrh sprbrh2;
        int n2;
        int n3;
        Collection collection;
        Object object2;
        Object object3;
        HashSet<String> hashSet;
        Enumeration enumeration;
        List<? extends Certificate> list = arg0.getCertificates();
        X509Certificate x509Certificate = (X509Certificate)list.get(arg1);
        int n4 = list.size();
        int n5 = n4 - arg1;
        sprszm sprszm2 = null;
        try {
            sprszm2 = sprszm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_2));
        }
        catch (sprlhi sprlhi2) {
            throw new sprxbi(sprxqy.cfr_renamed_9("\u0019N/M>\u00014N.\u0001(D;EzB?S.H<H9@.DzQ5M3B3D)\u0001?Y.D4R3N4\u0001<S5LzB?S.H<H9@.Dt"), (Throwable)sprlhi2, arg0, arg1);
        }
        if (sprszm2 != null && arg3 != null) {
            enumeration = sprszm2.cfr_renamed_329();
            hashSet = new HashSet<String>();
        } else {
            return null;
        }
        while (enumeration.hasMoreElements()) {
            object3 = sprdcm.cfr_renamed_23(enumeration.nextElement());
            object2 = ((sprdcm)object3).cfr_renamed_330();
            hashSet.add(((sprlem)object2).cfr_renamed_19());
            if (cfr_renamed_86.equals(((sprlem)object2).cfr_renamed_19())) continue;
            collection = null;
            try {
                collection = sprgai.cfr_renamed_5079(((sprdcm)object3).cfr_renamed_332());
            }
            catch (CertPathValidatorException certPathValidatorException) {
                throw new sprxbi(sprmfka.cfr_renamed_9("eUYSVC\u0015K@[YSSSPH\u0015S[\\Z\u001aF_A\u001aVU@VQ\u001a[UA\u001aW_\u0015X@SY^\u001b"), (Throwable)certPathValidatorException, arg0, arg1);
            }
            n3 = sprgai.cfr_renamed_5080(n5, arg4, (sprlem)object2, (Set)collection);
            if (n3 != 0) continue;
            sprgai.cfr_renamed_5081(n5, arg4, (sprlem)object2, collection);
        }
        if (arg2.isEmpty() || arg2.contains(cfr_renamed_86)) {
            arg2.clear();
            arg2.addAll(hashSet);
            n2 = arg5;
        } else {
            object3 = arg2.iterator();
            object2 = new HashSet();
            while (object3.hasNext()) {
                collection = (Collection)object3.next();
                if (!hashSet.contains(collection)) continue;
                object2.add(collection);
            }
            arg2.clear();
            arg2.addAll(object2);
            n2 = arg5;
        }
        if (n2 > 0 || (n5 < n4 || arg6) && sprgai.cfr_renamed_286(x509Certificate)) {
            enumeration = sprszm2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                object3 = sprdcm.cfr_renamed_23(enumeration.nextElement());
                if (!cfr_renamed_86.equals(((sprdcm)object3).cfr_renamed_330().cfr_renamed_19())) continue;
                object2 = sprgai.cfr_renamed_5079(((sprdcm)object3).cfr_renamed_332());
                collection = arg4[n5 - 1];
                int n6 = n3 = 0;
                while (n6 < collection.size()) {
                    sprbrh2 = (sprbrh)collection.get(n3);
                    object = sprbrh2.getExpectedPolicies().iterator();
                    while (object.hasNext()) {
                        Object object4;
                        String string;
                        Object e;
                        Object e2 = e = object.next();
                        if (e instanceof String) {
                            string = (String)e2;
                        } else {
                            if (!(e2 instanceof sprlem)) continue;
                            string = ((sprlem)e).cfr_renamed_19();
                        }
                        boolean bl = false;
                        Iterator iterator = sprbrh2.getChildren();
                        while (iterator.hasNext()) {
                            object4 = (sprbrh)iterator.next();
                            if (!string.equals(((sprbrh)object4).getValidPolicy())) continue;
                            bl = true;
                        }
                        if (bl) continue;
                        object4 = new HashSet<String>();
                        object4.add(string);
                        sprbrh sprbrh3 = new sprbrh(new ArrayList(), n5, (Set)object4, sprbrh2, (Set)object2, string, false);
                        sprbrh2.cfr_renamed_5082(sprbrh3);
                        arg4[n5].add(sprbrh3);
                    }
                    n6 = ++n3;
                }
                break block6;
            }
        }
        object3 = arg3;
        int n7 = n = n5 - 1;
        while (true) {
            int n8;
            if (n7 >= 0) {
                collection = arg4[n];
                n8 = n3 = 0;
            } else {
                Set<String> set = x509Certificate.getCriticalExtensionOIDs();
                if (set != null) {
                    int n9;
                    boolean bl = set.contains(cfr_renamed_2);
                    List list2 = arg4[n5];
                    int n10 = n9 = 0;
                    while (n10 < list2.size()) {
                        sprbrh sprbrh4 = (sprbrh)list2.get(n9);
                        object = sprbrh4;
                        sprbrh4.cfr_renamed_338(bl);
                        n10 = ++n9;
                    }
                }
                return object3;
            }
            while (n8 < collection.size() && ((sprbrh2 = (sprbrh)collection.get(n3)).cfr_renamed_336() || (object3 = sprgai.cfr_renamed_5083((sprbrh)object3, arg4, sprbrh2)) != null)) {
                n8 = ++n3;
            }
            n7 = --n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_9087(sprwzj arg0, sprjgm arg1, sprgak arg2, Date arg3, Date arg4, X509Certificate arg5, X509Certificate arg6, PublicKey arg7, sprefi arg8, sprgth arg9, List arg10, sprrr arg11) throws sprlhi, sprluh {
        Iterator iterator;
        if (arg3 == null) {
            boolean bl = true;
        }
        if (arg4.getTime() > arg3.getTime()) {
            throw new sprlhi(sprxqy.cfr_renamed_9("\f@6H>@.H5OzU3L?\u00013RzH4\u0001<T.T(Dt"));
        }
        Set set = sprgai.cfr_renamed_9077(arg0, arg1, arg5, arg2, arg4);
        boolean bl = false;
        sprlhi sprlhi2 = null;
        Iterator iterator2 = iterator = set.iterator();
        while (iterator2.hasNext() && arg8.cfr_renamed_2161() == 11 && !arg9.cfr_renamed_2162()) {
            try {
                Set<String> set2;
                X509CRL x509CRL = (X509CRL)iterator.next();
                sprgth sprgth2 = sprmuh.cfr_renamed_7294(x509CRL, arg1);
                if (!sprgth2.cfr_renamed_9078(arg9)) {
                    iterator2 = iterator;
                }
                X509CRL x509CRL2 = x509CRL;
                PublicKey publicKey = sprmuh.cfr_renamed_2168(x509CRL2, sprmuh.cfr_renamed_7296(x509CRL2, arg5, arg6, arg7, arg2, arg10, arg11));
                X509CRL x509CRL3 = null;
                if (arg2.cfr_renamed_391()) {
                    set2 = sprgai.cfr_renamed_9079(arg4, x509CRL, arg2.cfr_renamed_2283(), arg2.cfr_renamed_7293(), arg11);
                    x509CRL3 = sprmuh.cfr_renamed_2170(set2, publicKey);
                }
                if (arg2.cfr_renamed_376() != 1 && arg5.getNotAfter().getTime() < x509CRL.getThisUpdate().getTime()) {
                    throw new sprlhi(sprmfka.cfr_renamed_9("tZ\u001aC[YSQ\u001avhy\u001aSUG\u001aVOGHPTA\u001aASX_\u0015\\ZO[^\u001b"));
                }
                X509Certificate x509Certificate = arg5;
                sprmuh.cfr_renamed_7298(arg1, x509Certificate, x509CRL);
                sprmuh.cfr_renamed_7299(arg1, x509Certificate, x509CRL);
                X509CRL x509CRL4 = x509CRL;
                sprmuh.cfr_renamed_7300(x509CRL3, x509CRL4, arg2);
                Date date = arg4;
                sprmuh.cfr_renamed_9080(date, x509CRL3, arg5, arg8, arg2);
                sprmuh.cfr_renamed_9081(date, x509CRL4, arg5, arg8);
                if (arg8.cfr_renamed_2161() == 8) {
                    arg8.cfr_renamed_2164(11);
                }
                arg9.cfr_renamed_9082(sprgth2);
                set2 = x509CRL.getCriticalExtensionOIDs();
                if (set2 != null) {
                    Set<String> set3 = set2 = new HashSet<String>(set2);
                    set2.remove(sprrdm.cfr_renamed_96.cfr_renamed_19());
                    set3.remove(sprrdm.cfr_renamed_4.cfr_renamed_19());
                    if (!set3.isEmpty()) {
                        throw new sprlhi(sprxqy.cfr_renamed_9("\u0019s\u0016\u00019N4U;H4RzT4R/Q*N(U?EzB(H.H9@6\u0001?Y.D4R3N4Rt"));
                    }
                }
                if (x509CRL3 != null && (set2 = x509CRL3.getCriticalExtensionOIDs()) != null) {
                    Set<String> set4 = set2 = new HashSet<String>(set2);
                    set2.remove(sprrdm.cfr_renamed_96.cfr_renamed_19());
                    set4.remove(sprrdm.cfr_renamed_4.cfr_renamed_19());
                    if (!set4.isEmpty()) {
                        throw new sprlhi(sprmfka.cfr_renamed_9("~PVA[\u0015ygv\u0015YZTA[\\TF\u001a@TFOEJZHA_Q\u001aVH\\N\\YTV\u0015_MNPTFSZT\u001b"));
                    }
                }
                bl = true;
                iterator2 = iterator;
            }
            catch (sprlhi sprlhi3) {
                sprlhi2 = sprlhi3;
                iterator2 = iterator;
            }
        }
        if (!bl) {
            throw sprlhi2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprgth cfr_renamed_7294(X509CRL arg0, sprjgm arg1) throws sprlhi {
        sprgth sprgth2;
        sprwzl sprwzl2;
        sprgth sprgth3;
        sprwzl sprwzl3 = null;
        try {
            sprwzl3 = sprwzl.cfr_renamed_23(sprgai.cfr_renamed_292(arg0, cfr_renamed_152));
        }
        catch (Exception exception) {
            throw new sprlhi(sprxqy.cfr_renamed_9("h)R/H4FzE3R.S3C/U3N4\u0001*N3O.\u0001?Y.D4R3N4\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), exception);
        }
        if (sprwzl3 != null && sprwzl3.cfr_renamed_2203() != null && arg1.cfr_renamed_2204() != null) {
            return new sprgth(arg1.cfr_renamed_2204()).cfr_renamed_9088(new sprgth(sprwzl3.cfr_renamed_2203()));
        }
        if ((sprwzl3 == null || sprwzl3.cfr_renamed_2203() == null) && arg1.cfr_renamed_2204() == null) {
            return sprgth.cfr_renamed_4;
        }
        if (arg1.cfr_renamed_2204() == null) {
            sprgth3 = sprgth.cfr_renamed_4;
            sprwzl2 = sprwzl3;
        } else {
            sprgth3 = new sprgth(arg1.cfr_renamed_2204());
            sprwzl2 = sprwzl3;
        }
        if (sprwzl2 == null) {
            sprgth2 = sprgth.cfr_renamed_4;
            return sprgth3.cfr_renamed_9088(sprgth2);
        }
        sprgth2 = new sprgth(sprwzl3.cfr_renamed_2203());
        return sprgth3.cfr_renamed_9088(sprgth2);
    }

    public static void cfr_renamed_2192(CertPath arg0, int arg1) throws CertPathValidatorException {
        boolean[] blArray = ((X509Certificate)arg0.getCertificates().get(arg1)).getKeyUsage();
        if (!(blArray == null || blArray.length > 5 && blArray[5])) {
            throw new sprxbi(sprmfka.cfr_renamed_9("sFI@_G\u001aV_GN\\\\\\YTNP\u001a^_LOF[R_\u0015_MNPTFSZT\u0015SF\u001aVH\\N\\YTV\u0015[[^\u0015^Z_F\u001a[UA\u001aE_GW\\N\u0015QPC\u0015I\\][S[]\u001b"), null, arg0, arg1);
        }
    }

    public static void cfr_renamed_9080(Date arg0, X509CRL arg1, Object arg2, sprefi arg3, sprgak arg4) throws sprlhi {
        if (arg4.cfr_renamed_391() && arg1 != null) {
            sprgai.cfr_renamed_9089(arg0, arg1, arg2, arg3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7300(X509CRL arg0, X509CRL arg1, sprgak arg2) throws sprlhi {
        block16: {
            boolean bl;
            block19: {
                boolean bl2;
                block18: {
                    sprwzl sprwzl2;
                    sprwzl sprwzl3;
                    block17: {
                        if (arg0 == null) {
                            return;
                        }
                        if (arg0.hasUnsupportedCriticalExtension()) {
                            throw new sprlhi(sprxqy.cfr_renamed_9(">D6U;\u0001\u0019s\u0016\u00012@)\u0001/O)T*Q5S.D>\u00019S3U3B;MzD\"U?O)H5O)"));
                        }
                        sprwzl3 = null;
                        try {
                            sprwzl3 = sprwzl.cfr_renamed_23(sprgai.cfr_renamed_292(arg1, cfr_renamed_152));
                        }
                        catch (Exception exception) {
                            throw new sprlhi(sprmfka.cfr_renamed_9("sFI@S[]\u0015^\\IAH\\X@N\\U[\u001aEU\\TA\u001aPBA_[I\\U[\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), exception);
                        }
                        if (!arg2.cfr_renamed_391()) break block16;
                        if (!sprooh.cfr_renamed_305(arg0).equals(sprooh.cfr_renamed_305(arg1))) {
                            throw new sprlhi(sprxqy.cfr_renamed_9("b5L*M?U?\u0001\u0019s\u0016\u00013R)T?SzE5D)\u00014N.\u00017@.B2\u0001>D6U;\u0001\u0019s\u0016\u00013R)T?St"));
                        }
                        sprwzl2 = null;
                        try {
                            sprwzl2 = sprwzl.cfr_renamed_23(sprgai.cfr_renamed_292(arg0, cfr_renamed_152));
                        }
                        catch (Exception exception) {
                            throw new sprlhi(sprmfka.cfr_renamed_9("|IFO\\TR\u001aQSFNGSWOASZT\u0015JZS[N\u0015_MNPTFSZT\u0015\\GUX\u001aQ_YNT\u001avhy\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), exception);
                        }
                        bl2 = false;
                        if (sprwzl3 != null) break block17;
                        if (sprwzl2 != null) break block18;
                        bl = bl2 = true;
                        break block19;
                    }
                    if (sprwzl3.equals(sprwzl2)) {
                        bl2 = true;
                    }
                }
                bl = bl2;
            }
            if (!bl) {
                throw new sprlhi(sprxqy.cfr_renamed_9("h)R/H4FzE3R.S3C/U3N4\u0001*N3O.\u0001?Y.D4R3N4\u0001<S5LzE?M.@zb\bmz@4EzB5L*M?U?\u0001\u0019s\u0016\u0001>N?RzO5UzL;U9It"));
            }
            sprxgf sprxgf2 = null;
            try {
                sprxgf2 = sprgai.cfr_renamed_292(arg1, cfr_renamed_96);
            }
            catch (sprlhi sprlhi2) {
                throw new sprlhi(sprmfka.cfr_renamed_9("{@N]UGSAC\u0015QPC\u0015SQ_[N\\\\\\_G\u001aPBA_[I\\U[\u001aVU@VQ\u001a[UA\u001aW_\u0015_MNG[VNP^\u0015\\GUX\u001aVUXJY_A_\u0015ygv\u001b"), sprlhi2);
            }
            sprxgf sprxgf3 = null;
            try {
                sprxgf3 = sprgai.cfr_renamed_292(arg0, cfr_renamed_96);
            }
            catch (sprlhi sprlhi3) {
                throw new sprlhi(sprxqy.cfr_renamed_9("\u001bT.I5S3U#\u00011D#\u00013E?O.H<H?SzD\"U?O)H5OzB5T6EzO5UzC?\u0001?Y.S;B.D>\u0001<S5LzE?M.@zb\bmt"), sprlhi3);
            }
            if (sprxgf2 == null) {
                throw new sprlhi(sprmfka.cfr_renamed_9("vhy\u001aTOARZH\\NL\u001a^_L\u001a\\^PTASSSPH\u0015SF\u001a[OYV\u001b"));
            }
            if (sprxgf3 == null) {
                throw new sprlhi(sprxqy.cfr_renamed_9("\u001eD6U;\u0001\u0019s\u0016\u0001;T.I5S3U#\u00011D#\u00013E?O.H<H?SzH)\u00014T6Mt"));
            }
            if (!sprxgf2.cfr_renamed_5078(sprxgf3)) {
                throw new sprlhi(sprmfka.cfr_renamed_9("~PVA[\u0015ygv\u0015[@N]UGSAC\u0015QPC\u0015SQ_[N\\\\\\_G\u001aQUPI\u0015TZN\u0015WTNVR\u0015YZWEVPNP\u001avhy\u001aTOARZH\\NL\u001a^_L\u001a\\^PTASSSPH\u001b"));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_2210(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprszm sprszm2 = null;
        try {
            sprszm2 = sprszm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_4));
        }
        catch (sprlhi sprlhi2) {
            throw new sprxbi(sprxqy.cfr_renamed_9("q5M3B#\u00019N4R.S;H4U)\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), (Throwable)sprlhi2, arg0, arg1);
        }
        if (sprszm2 != null) {
            Enumeration enumeration = sprszm2.cfr_renamed_329();
            block7: while (enumeration.hasMoreElements()) {
                sprnvm sprnvm2 = (sprnvm)enumeration.nextElement();
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        int n;
                        try {
                            n = sprktm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_5023();
                        }
                        catch (Exception exception) {
                            throw new sprxbi(sprmfka.cfr_renamed_9("jZV\\YL\u001aVU[IAHTS[NF\u001aG_DO\\HP\u007fMJYSVSAjZV\\YL\u001aSSPVQ\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), (Throwable)exception, arg0, arg1);
                        }
                        if (n != 0) continue block7;
                        return 0;
                    }
                }
            }
        }
        return arg2;
    }

    /*
     * Exception decompiling
     */
    public static int cfr_renamed_2191(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_2190(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        int n;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprktm sprktm2 = null;
        try {
            sprktm2 = sprktm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_132));
        }
        catch (Exception exception) {
            throw new sprxbi(sprxqy.cfr_renamed_9("\u0013O2H8H.\u0001;O#\f*N6H9XzD\"U?O)H5OzB;O4N.\u00018DzE?B5E?Et"), (Throwable)exception, arg0, arg1);
        }
        if (sprktm2 != null && (n = sprktm2.cfr_renamed_5023()) < arg2) {
            return n;
        }
        return arg2;
    }

    public static void cfr_renamed_9090(CertPath arg0, int arg1, sprbrh arg2, int arg3) throws CertPathValidatorException {
        if (arg3 <= 0 && arg2 == null) {
            throw new sprxbi(sprmfka.cfr_renamed_9("{U\u0015LTV\\^\u0015JZV\\YL\u001aAHP_\u0015\\ZO[^\u0015M]_[\u001aZTP\u001aPBE_VNP^\u001b"), null, arg0, arg1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9091(CertPath arg0, int arg1, sprerh arg2) throws CertPathValidatorException {
        sprsem[] sprsemArray;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprygm sprygm2 = null;
        try {
            sprsemArray = sprszm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_105));
            if (sprsemArray != null) {
                sprygm2 = sprygm.cfr_renamed_23(sprsemArray);
            }
        }
        catch (Exception exception) {
            throw new sprxbi(sprxqy.cfr_renamed_9("o;L?\u00019N4R.S;H4U)\u0001?Y.D4R3N4\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), (Throwable)exception, arg0, arg1);
        }
        if (sprygm2 != null) {
            sprygm sprygm3;
            sprsemArray = sprygm2.cfr_renamed_348();
            if (sprsemArray != null) {
                try {
                    arg2.cfr_renamed_5070(sprsemArray);
                    sprygm3 = sprygm2;
                }
                catch (Exception exception) {
                    throw new sprxbi(sprmfka.cfr_renamed_9("e_GW\\NA_Q\u001aFOWNG_PI\u0015YTT[UA\u001aW_\u0015X@SY^\u0015\\GUX\u001a[[X_\u0015YZTFNG[\\TAI\u0015_MNPTFSZT\u001b"), (Throwable)exception, arg0, arg1);
                }
            } else {
                sprygm3 = sprygm2;
            }
            sprsem[] sprsemArray2 = sprygm3.cfr_renamed_350();
            if (sprsemArray2 != null) {
                int n;
                int n2 = n = 0;
                while (n2 != sprsemArray2.length) {
                    try {
                        arg2.cfr_renamed_5071(sprsemArray2[n]);
                    }
                    catch (Exception exception) {
                        throw new sprxbi(sprxqy.cfr_renamed_9("d\"B6T>D>\u0001)T8U(D?RzB;O4N.\u00018DzC/H6EzG(N7\u00014@7DzB5O)U(@3O.RzD\"U?O)H5Ot"), (Throwable)exception, arg0, arg1);
                    }
                    n2 = ++n;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_2216(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprbcm sprbcm2 = null;
        try {
            sprbcm2 = sprbcm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_79));
        }
        catch (Exception exception) {
            throw new sprxbi(sprmfka.cfr_renamed_9("xTI\\Y\u0015YZTFNG[\\TAI\u0015_MNPTFSZT\u0015YTT[UA\u001aW_\u0015^PYZ^P^\u001b"), (Throwable)exception, arg0, arg1);
        }
        if (sprbcm2 == null) return arg2;
        if (!sprbcm2.cfr_renamed_296()) return arg2;
        sprktm sprktm2 = sprbcm2.cfr_renamed_5086();
        if (sprktm2 == null) return arg2;
        return Math.min(arg2, sprktm2.cfr_renamed_5087());
    }

    public static int cfr_renamed_2221(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        if (!sprgai.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1))) {
            if (arg2 <= 0) {
                throw new sprxbi(sprxqy.cfr_renamed_9("\u0017@\"\u0001*@.IzM?O=U2\u00014N.\u0001=S?@.D(\u0001.I;Oz[?S5"), null, arg0, arg1);
            }
            return arg2 - 1;
        }
        return arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PublicKey cfr_renamed_2168(X509CRL arg0, Set arg1) throws sprlhi {
        Iterator iterator;
        Exception exception = null;
        Iterator iterator2 = iterator = arg1.iterator();
        while (true) {
            if (!iterator2.hasNext()) {
                throw new sprlhi(sprmfka.cfr_renamed_9("yTT[UA\u001aC_GSSC\u0015ygv\u001b"), exception);
            }
            PublicKey publicKey = (PublicKey)iterator.next();
            try {
                arg0.verify(publicKey);
                return publicKey;
            }
            catch (Exception exception2) {
                exception = exception2;
                iterator2 = iterator;
                continue;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprbrh cfr_renamed_9092(CertPath arg0, int arg1, sprbrh arg2) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprszm sprszm2 = null;
        try {
            sprszm2 = sprszm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_2));
        }
        catch (sprlhi sprlhi2) {
            throw new sprxbi(sprxqy.cfr_renamed_9("\u0019N/M>\u00014N.\u0001(D;EzB?S.H<H9@.DzQ5M3B3D)\u0001?Y.D4R3N4\u0001<S5LzB?S.H<H9@.Dt"), (Throwable)sprlhi2, arg0, arg1);
        }
        if (sprszm2 != null) return arg2;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2218(CertPath arg0, int arg1) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprszm sprszm2 = null;
        try {
            sprszm2 = sprszm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_114));
        }
        catch (sprlhi sprlhi2) {
            throw new sprxbi(sprmfka.cfr_renamed_9("eUYSVC\u0015WTJES[]F\u001aPBA_[I\\U[\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), (Throwable)sprlhi2, arg0, arg1);
        }
        if (sprszm2 != null) {
            int n;
            sprszm sprszm3 = sprszm2;
            int n2 = n = 0;
            while (n2 < sprszm3.cfr_renamed_84()) {
                sprlem sprlem2 = null;
                sprlem sprlem3 = null;
                try {
                    sprszm sprszm4 = sprszm.cfr_renamed_23(sprszm3.cfr_renamed_85(n));
                    sprlem2 = sprlem.cfr_renamed_23(sprszm4.cfr_renamed_85(0));
                    sprlem3 = sprlem.cfr_renamed_23(sprszm4.cfr_renamed_85(1));
                }
                catch (Exception exception) {
                    throw new sprxbi(sprxqy.cfr_renamed_9("q5M3B#\u00017@*Q3O=RzD\"U?O)H5OzB5O.D4U)\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), (Throwable)exception, arg0, arg1);
                }
                if (cfr_renamed_86.equals(sprlem2.cfr_renamed_19())) {
                    throw new CertPathValidatorException(sprmfka.cfr_renamed_9("|IFOPHqUX[\\TeUYSVC\u0015SF\u001aTTLjZV\\YL"), null, arg0, arg1);
                }
                if (cfr_renamed_86.equals(sprlem3.cfr_renamed_19())) {
                    throw new CertPathValidatorException(sprxqy.cfr_renamed_9("r/C0D9U\u001eN7@3O\nN6H9XzH)\u0001;O#q5M3B#"), null, arg0, arg1);
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
    public static void cfr_renamed_2212(CertPath arg0, int arg1) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        sprbcm sprbcm2 = null;
        try {
            sprbcm2 = sprbcm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_79));
        }
        catch (Exception exception) {
            throw new sprxbi(sprmfka.cfr_renamed_9("xTI\\Y\u0015YZTFNG[\\TAI\u0015_MNPTFSZT\u0015YTT[UA\u001aW_\u0015^PYZ^P^\u001b"), (Throwable)exception, arg0, arg1);
        }
        if (sprbcm2 == null) {
            throw new CertPathValidatorException(sprmfka.cfr_renamed_9("|TA_GWP^\\[A_\u0015YPHASSSV[A_\u0015VTY^I\u0015xTI\\YvU[IAHTS[NF"), null, arg0, arg1);
        }
        if (!sprbcm2.cfr_renamed_296()) {
            throw new CertPathValidatorException(sprxqy.cfr_renamed_9("o5Uz@zb\u001b\u00019D(U3G3B;U?"), null, arg0, arg1);
        }
    }

    public static int cfr_renamed_2197(CertPath arg0, int arg1, int arg2) {
        if (!sprgai.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1)) && arg2 != 0) {
            return arg2 - 1;
        }
        return arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7298(sprjgm arg0, Object arg1, X509CRL arg2) throws sprlhi {
        byte[] byArray;
        sprxgf sprxgf2 = sprgai.cfr_renamed_292(arg2, cfr_renamed_152);
        boolean bl = false;
        if (sprxgf2 != null && sprwzl.cfr_renamed_23(sprxgf2).cfr_renamed_2131()) {
            bl = true;
        }
        try {
            byArray = sprooh.cfr_renamed_305(arg2).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprlhi(new StringBuilder().insert(0, sprxqy.cfr_renamed_9("\u001fY9D*U3N4\u0001?O9N>H4Fzb\bmzH)R/D(\u001bz")).append(iOException.getMessage()).toString(), iOException);
        }
        boolean bl2 = false;
        if (arg0.cfr_renamed_2186() == null) {
            if (sprooh.cfr_renamed_305(arg2).equals(sprooh.cfr_renamed_302(arg1))) {
                return;
            }
        } else {
            int n;
            sprigm[] sprigmArray = arg0.cfr_renamed_2186().cfr_renamed_289();
            int n2 = n = 0;
            while (n2 < sprigmArray.length) {
                if (sprigmArray[n].cfr_renamed_312() == 4) {
                    try {
                        if (sproze.cfr_renamed_92(sprigmArray[n].cfr_renamed_313().cfr_renamed_119().cfr_renamed_91(), byArray)) {
                            bl2 = true;
                        }
                    }
                    catch (IOException iOException) {
                        throw new sprlhi(sprmfka.cfr_renamed_9("vhy\u001a\\IFOPH\u0015S[\\ZHX[ASZT\u0015\\GUX\u001aQSFNGSWOASZT\u0015JZS[N\u0015YTT[UA\u001aW_\u0015^PYZ^P^\u001b"), iOException);
                    }
                }
                n2 = ++n;
            }
            if (bl2 && !bl) {
                throw new sprlhi(sprxqy.cfr_renamed_9("e3R.S3C/U3N4\u0001*N3O.\u00019N4U;H4RzB\bm\u0013R)T?SzG3D6EzC/Uzb\bmzH)\u00014N.\u00013O>H(D9Ut"));
            }
            if (!bl2) {
                throw new sprlhi(sprmfka.cfr_renamed_9("ygv\u0015SFI@_G\u001aZ\\\u0015ygv\u0015^Z_F\u001a[UA\u001aX[AY]\u001avhy\u001a\\IFOPH\u0015US\u001aQSFNGSWOASZT\u0015JZS[N\u001b"));
            }
        }
        if (bl2) return;
        throw new sprlhi(sprxqy.cfr_renamed_9("b;O4N.\u0001<H4EzL;U9I3O=\u0001\u0019s\u0016\u00013R)T?SzG5SzB?S.H<H9@.Dt"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7299(sprjgm arg0, Object arg1, X509CRL arg2) throws sprlhi {
        block31: {
            sprqqe sprqqe2;
            sprwzl sprwzl2;
            block32: {
                boolean bl;
                block30: {
                    int n;
                    int n2;
                    sprigm[] sprigmArray;
                    boolean bl2;
                    ArrayList<sprigm> arrayList;
                    block36: {
                        boolean bl3;
                        block29: {
                            int n3;
                            sprigm[] sprigmArray2;
                            block34: {
                                int n4;
                                block35: {
                                    block33: {
                                        Object object;
                                        sprwzl2 = null;
                                        try {
                                            sprwzl2 = sprwzl.cfr_renamed_23(sprgai.cfr_renamed_292(arg2, cfr_renamed_152));
                                        }
                                        catch (Exception exception) {
                                            throw new sprlhi(sprmfka.cfr_renamed_9("sFI@S[]\u0015^\\IAH\\X@N\\U[\u001aEU\\TA\u001aPBA_[I\\U[\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), exception);
                                        }
                                        if (sprwzl2 == null) break block31;
                                        if (sprwzl2.cfr_renamed_323() == null) break block32;
                                        sprqqe2 = sprwzl.cfr_renamed_23(sprwzl2).cfr_renamed_323();
                                        arrayList = new ArrayList<sprigm>();
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() == 0) {
                                            int n5;
                                            object = spraem.cfr_renamed_23(((sprhhm)sprqqe2).cfr_renamed_313()).cfr_renamed_289();
                                            int n6 = n5 = 0;
                                            while (n6 < ((sprigm[])object).length) {
                                                arrayList.add(object[n5++]);
                                                n6 = n5;
                                            }
                                        }
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() == 1) {
                                            object = new sprrvm();
                                            try {
                                                Enumeration enumeration = sprszm.cfr_renamed_23(sprooh.cfr_renamed_305(arg2)).cfr_renamed_329();
                                                while (enumeration.hasMoreElements()) {
                                                    ((sprrvm)object).cfr_renamed_5004((sprco)enumeration.nextElement());
                                                }
                                            }
                                            catch (Exception exception) {
                                                throw new sprlhi(sprxqy.cfr_renamed_9("b5T6EzO5UzS?@>\u0001\u0019s\u0016\u00013R)T?St"), exception);
                                            }
                                            ((sprrvm)object).cfr_renamed_5004(((sprhhm)sprqqe2).cfr_renamed_313());
                                            arrayList.add(new sprigm(sprnbm.cfr_renamed_23(new sprcen((sprrvm)object))));
                                        }
                                        bl2 = false;
                                        if (arg0.cfr_renamed_323() == null) break block33;
                                        sprqqe2 = arg0.cfr_renamed_323();
                                        sprigmArray2 = null;
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() == 0) {
                                            sprigmArray2 = spraem.cfr_renamed_23(((sprhhm)sprqqe2).cfr_renamed_313()).cfr_renamed_289();
                                        }
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() != 1) break block34;
                                        if (arg0.cfr_renamed_2186() != null) {
                                            sprigmArray2 = arg0.cfr_renamed_2186().cfr_renamed_289();
                                        } else {
                                            sprigmArray2 = new sprigm[1];
                                            try {
                                                sprigmArray2[0] = new sprigm(sprooh.cfr_renamed_302(arg1));
                                            }
                                            catch (Exception exception) {
                                                throw new sprlhi(sprmfka.cfr_renamed_9("yZOY^\u0015TZN\u0015HP[Q\u001aV_GN\\\\\\YTNP\u001a\\IFOPH\u001b"), exception);
                                            }
                                        }
                                        n4 = n3 = 0;
                                        break block35;
                                    }
                                    if (arg0.cfr_renamed_2186() == null) {
                                        throw new sprlhi(sprmfka.cfr_renamed_9("pSARPH\u0015N]_\u0015Ygv|IFOPH\u0015UG\u001aARP\u001aQSFNGSWOASZTeU\\TA\u001aSSPVQ\u001aXOFN\u0015XP\u001aVU[NTS[_Q\u001a\\T\u0015~\\IAH\\X@N\\U[jZS[N\u001b"));
                                    }
                                    sprigmArray = arg0.cfr_renamed_2186().cfr_renamed_289();
                                    n = n2 = 0;
                                    break block36;
                                }
                                while (n4 < sprigmArray2.length) {
                                    Enumeration enumeration = sprszm.cfr_renamed_23(sprigmArray2[n3].cfr_renamed_313().cfr_renamed_119()).cfr_renamed_329();
                                    sprrvm sprrvm2 = new sprrvm();
                                    Enumeration enumeration2 = enumeration;
                                    while (enumeration2.hasMoreElements()) {
                                        sprrvm2.cfr_renamed_5004((sprco)enumeration.nextElement());
                                        enumeration2 = enumeration;
                                    }
                                    sprrvm2.cfr_renamed_5004(((sprhhm)sprqqe2).cfr_renamed_313());
                                    sprigmArray2[n3++] = new sprigm(sprnbm.cfr_renamed_23(new sprcen(sprrvm2)));
                                    n4 = n3;
                                }
                            }
                            if (sprigmArray2 != null) {
                                int n7 = n3 = 0;
                                while (n7 < sprigmArray2.length) {
                                    if (arrayList.contains(sprigmArray2[n3])) {
                                        bl3 = bl2 = true;
                                        break block29;
                                    }
                                    n7 = ++n3;
                                }
                            }
                            bl3 = bl2;
                        }
                        if (!bl3) {
                            throw new sprlhi(sprxqy.cfr_renamed_9("\u0014NzL;U9IzG5SzB?S.H<H9@.Dzb\bmzH)R/H4FzE3R.S3C/U3N4\u0001*N3O.\u00014@7DzU5\u00019s\u0016h)R/D(\u0001\u0019s\u0016\u0001>H)U(H8T.H5OzQ5H4Ut"));
                        }
                        break block32;
                    }
                    while (n < sprigmArray.length) {
                        if (arrayList.contains(sprigmArray[n2])) {
                            bl = bl2 = true;
                            break block30;
                        }
                        n = ++n2;
                    }
                    bl = bl2;
                }
                if (!bl) {
                    throw new sprlhi(sprxqy.cfr_renamed_9("\u0014NzL;U9IzG5SzB?S.H<H9@.Dzb\bmzH)R/H4FzE3R.S3C/U3N4\u0001*N3O.\u00014@7DzU5\u00019s\u0016h)R/D(\u0001\u0019s\u0016\u0001>H)U(H8T.H5OzQ5H4Ut"));
                }
            }
            sprqqe2 = null;
            try {
                sprqqe2 = sprbcm.cfr_renamed_23(sprgai.cfr_renamed_292((X509Extension)arg1, cfr_renamed_79));
            }
            catch (Exception exception) {
                throw new sprlhi(sprmfka.cfr_renamed_9("w[FSV\u001aVU[IAHTS[NF\u001aPBA_[I\\U[\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), exception);
            }
            if (arg1 instanceof X509Certificate) {
                if (sprwzl2.cfr_renamed_306() && sprqqe2 != null && ((sprbcm)sprqqe2).cfr_renamed_296()) {
                    throw new sprlhi(sprxqy.cfr_renamed_9("b\u001b\u0001\u0019D(Uzb\bmzN4M#\u00019N4U;H4RzT)D(\u00019D(U3G3B;U?Rt"));
                }
                if (sprwzl2.cfr_renamed_307() && (sprqqe2 == null || !((sprbcm)sprqqe2).cfr_renamed_296())) {
                    throw new sprlhi(sprmfka.cfr_renamed_9("\u007f[^\u0015ygv\u0015U[VL\u001aVU[NTS[I\u0015yt\u001aV_GN\\\\\\YTNPI\u001b"));
                }
            }
            if (sprwzl2.cfr_renamed_308()) {
                throw new sprlhi(sprxqy.cfr_renamed_9("5O6X\u0019N4U;H4R\u001bU.S3C/U?b?S.RzC5N6D;OzH)\u0001;R)D(U?Et"));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2198(CertPath arg0, int arg1, List arg2, Set arg3) throws CertPathValidatorException {
        Iterator iterator;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        Iterator iterator2 = iterator = arg2.iterator();
        while (iterator2.hasNext()) {
            try {
                ((PKIXCertPathChecker)iterator.next()).check(x509Certificate, arg3);
                iterator2 = iterator;
            }
            catch (CertPathValidatorException certPathValidatorException) {
                throw new sprxbi(certPathValidatorException.getMessage(), (Throwable)certPathValidatorException, arg0, arg1);
            }
            catch (Exception exception) {
                throw new CertPathValidatorException(sprmfka.cfr_renamed_9("t^QSASZTTV\u0015YPHASSSV[A_\u0015JTN]\u001aVRPY^_G\u001aS[\\VP^\u001b"), (Throwable)exception, arg0, arg1);
            }
        }
        if (!arg3.isEmpty()) {
            throw new sprxbi(new StringBuilder().insert(0, sprxqy.cfr_renamed_9("b?S.H<H9@.DzI;RzT4R/Q*N(U?EzB(H.H9@6\u0001?Y.D4R3N4\u001bz")).append(arg3).toString(), null, arg0, arg1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprbrh cfr_renamed_9093(CertPath arg0, int arg1, List[] arg2, sprbrh arg3, int arg4) throws CertPathValidatorException {
        sprbrh sprbrh2;
        block22: {
            Object object4;
            Object object2;
            int n;
            List<? extends Certificate> list = arg0.getCertificates();
            X509Certificate x509Certificate = (X509Certificate)list.get(arg1);
            int n2 = list.size() - arg1;
            sprszm sprszm2 = null;
            try {
                sprszm2 = sprszm.cfr_renamed_23(sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_114));
            }
            catch (sprlhi sprlhi2) {
                throw new sprxbi(sprmfka.cfr_renamed_9("eUYSVC\u0015WTJES[]F\u001aPBA_[I\\U[\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), (Throwable)sprlhi2, arg0, arg1);
            }
            sprbrh2 = arg3;
            if (sprszm2 == null) break block22;
            sprszm sprszm3 = sprszm2;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            HashSet<String> hashSet = new HashSet<String>();
            int n3 = n = 0;
            while (n3 < sprszm3.cfr_renamed_84()) {
                Object object3 = (sprszm)sprszm3.cfr_renamed_85(n);
                String string = ((sprlem)((sprszm)object3).cfr_renamed_85(0)).cfr_renamed_19();
                object2 = ((sprlem)((sprszm)object3).cfr_renamed_85(1)).cfr_renamed_19();
                if (!hashMap.containsKey(string)) {
                    object4 = new HashSet();
                    object4.add(object2);
                    hashMap.put(string, object4);
                    hashSet.add(string);
                } else {
                    object4 = (Set)hashMap.get(string);
                    object4.add(object2);
                }
                n3 = ++n;
            }
            for (Object object3 : hashSet) {
                Iterator iterator;
                Iterable iterable;
                block23: {
                    sprbrh sprbrh3;
                    Enumeration enumeration;
                    Set set;
                    block21: {
                        if (arg4 > 0) {
                            boolean bl;
                            block20: {
                                boolean bl2 = false;
                                for (Object object4 : arg2[n2]) {
                                    if (!((sprbrh)object4).getValidPolicy().equals(object3)) continue;
                                    bl2 = true;
                                    ((sprbrh)object4).cfr_renamed_0 = (Set)hashMap.get(object3);
                                    bl = bl2;
                                    break block20;
                                }
                                bl = bl2;
                            }
                            if (bl) continue;
                            for (Object object4 : arg2[n2]) {
                                if (!cfr_renamed_86.equals(((sprbrh)object4).getValidPolicy())) continue;
                                set = null;
                                iterable = null;
                                try {
                                    iterable = (sprszm)sprgai.cfr_renamed_292(x509Certificate, cfr_renamed_2);
                                }
                                catch (sprlhi sprlhi3) {
                                    throw new sprxbi(sprxqy.cfr_renamed_9("b?S.H<H9@.DzQ5M3B3D)\u0001?Y.D4R3N4\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), (Throwable)sprlhi3, arg0, arg1);
                                }
                                enumeration = ((sprszm)iterable).cfr_renamed_329();
                                break block21;
                            }
                            continue;
                        }
                        if (arg4 > 0) continue;
                        iterator = arg2[n2].iterator();
                        break block23;
                    }
                    while (enumeration.hasMoreElements()) {
                        sprdcm sprdcm2 = null;
                        try {
                            sprdcm2 = sprdcm.cfr_renamed_23(enumeration.nextElement());
                        }
                        catch (Exception exception) {
                            throw new CertPathValidatorException(sprmfka.cfr_renamed_9("jZV\\YL\u001a\\TSUGWTN\\U[\u001aVU@VQ\u001a[UA\u001aW_\u0015^PYZ^P^\u001b"), (Throwable)exception, arg0, arg1);
                        }
                        if (!cfr_renamed_86.equals(sprdcm2.cfr_renamed_330().cfr_renamed_19())) continue;
                        try {
                            set = sprgai.cfr_renamed_5079(sprdcm2.cfr_renamed_332());
                            break;
                        }
                        catch (CertPathValidatorException certPathValidatorException) {
                            throw new sprxbi(sprxqy.cfr_renamed_9("\nN6H9XzP/@6H<H?SzH4G5\u0001)D.\u00019N/M>\u00014N.\u00018DzE?B5E?Et"), (Throwable)certPathValidatorException, arg0, arg1);
                        }
                    }
                    boolean bl = false;
                    if (x509Certificate.getCriticalExtensionOIDs() != null) {
                        bl = x509Certificate.getCriticalExtensionOIDs().contains(cfr_renamed_2);
                    }
                    if (!cfr_renamed_86.equals((sprbrh3 = (sprbrh)((sprbrh)object4).getParent()).getValidPolicy())) continue;
                    sprbrh sprbrh4 = new sprbrh(new ArrayList(), n2, (Set)hashMap.get(object3), sprbrh3, set, (String)object3, bl);
                    sprbrh3.cfr_renamed_5082(sprbrh4);
                    arg2[n2].add(sprbrh4);
                    continue;
                }
                while (iterator.hasNext()) {
                    object2 = (sprbrh)iterator.next();
                    if (!((sprbrh)object2).getValidPolicy().equals(object3)) continue;
                    object4 = (sprbrh)((sprbrh)object2).getParent();
                    ((sprbrh)object4).cfr_renamed_5095((sprbrh)object2);
                    iterator.remove();
                    int n4 = n2 - 1;
                    while (n4 >= 0) {
                        sprbrh sprbrh5;
                        int n5;
                        int n6;
                        iterable = arg2[n6];
                        int n7 = n5 = 0;
                        while (n7 < iterable.size() && ((sprbrh5 = (sprbrh)iterable.get(n5)).cfr_renamed_336() || (sprbrh2 = sprgai.cfr_renamed_5083(sprbrh2, arg2, sprbrh5)) != null)) {
                            n7 = ++n5;
                        }
                        n4 = --n6;
                    }
                }
            }
        }
        return sprbrh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7296(X509CRL arg0, Object arg1, X509Certificate arg2, PublicKey arg3, sprgak arg4, List arg5, sprrr arg6) throws sprlhi {
        int n;
        Object object;
        Object object2;
        Object object3;
        Serializable serializable;
        Object object4;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            object4 = sprooh.cfr_renamed_305(arg0).cfr_renamed_91();
            x509CertSelector.setSubject((byte[])object4);
        }
        catch (IOException iOException) {
            throw new sprlhi(sprmfka.cfr_renamed_9("i@X__VN\u0015YGSA_GST\u001aSUG\u001aV_GN\\\\\\YTNP\u001aF_Y_VNZH\u0015NZ\u001aSS[^\u0015SFI@_G\u001aV_GN\\\\\\YTNP\u001aSUG\u001avhy\u001aVU@VQ\u001a[UA\u001aW_\u0015IPN\u001b"), iOException);
        }
        object4 = new sprddk(x509CertSelector).cfr_renamed_1451();
        LinkedHashSet<X509Certificate> linkedHashSet = new LinkedHashSet<X509Certificate>();
        try {
            sprgai.cfr_renamed_7308(linkedHashSet, (sprexj)object4, arg4.cfr_renamed_7309());
            sprgai.cfr_renamed_7308(linkedHashSet, (sprexj)object4, arg4.cfr_renamed_2283());
        }
        catch (sprlhi sprlhi2) {
            throw new sprlhi(sprxqy.cfr_renamed_9("h)R/D(\u00019D(U3G3B;U?\u0001<N(\u0001\u0019s\u0016\u00019@4O5UzC?\u0001)D;S9I?Et"), sprlhi2);
        }
        linkedHashSet.add(arg2);
        Iterator iterator = linkedHashSet.iterator();
        ArrayList<Serializable> arrayList = new ArrayList<Serializable>();
        ArrayList<PublicKey> arrayList2 = new ArrayList<PublicKey>();
        block8: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                serializable = (X509Certificate)iterator.next();
                if (((Certificate)serializable).equals(arg2)) {
                    iterator2 = iterator;
                    arrayList.add(serializable);
                    arrayList2.add(arg3);
                    continue;
                }
                try {
                    object3 = cfr_renamed_3 != null ? new spryrh(true) : new spryth(true);
                    X509CertSelector x509CertSelector2 = new X509CertSelector();
                    x509CertSelector2.setCertificate((X509Certificate)serializable);
                    Object object5 = object2 = new sprmdk(arg4).cfr_renamed_7311(new sprddk(x509CertSelector2).cfr_renamed_1451());
                    if (arg5.contains(serializable)) {
                        ((sprmdk)object5).cfr_renamed_7312(false);
                    } else {
                        ((sprmdk)object5).cfr_renamed_7312(true);
                    }
                    object = new spritj(((sprmdk)object2).cfr_renamed_1451()).cfr_renamed_1451();
                    List<? extends Certificate> list = ((CertPathBuilderSpi)object3).engineBuild((CertPathParameters)object).getCertPath().getCertificates();
                    arrayList.add(serializable);
                    arrayList2.add(sprgai.cfr_renamed_7313(list, 0, arg6));
                }
                catch (CertPathBuilderException certPathBuilderException) {
                    throw new sprlhi(sprmfka.cfr_renamed_9("v_GNe[AR\u0015\\ZH\u0015ygv\u0015I\\][_G\u001aS[\\VP^\u0015NZ\u001aC[YSQ[A_\u001b"), certPathBuilderException);
                }
                catch (CertPathValidatorException certPathValidatorException) {
                    throw new sprlhi(sprxqy.cfr_renamed_9("\nT8M3BzJ?XzN<\u00013R)T?SzB?S.H<H9@.DzN<\u0001\u0019s\u0016\u00019N/M>\u00014N.\u00018DzS?U(H?W?Et"), certPathValidatorException);
                }
                catch (Exception exception) {
                    throw new sprlhi(exception.getMessage());
                }
                continue block8;
            }
            break;
        }
        serializable = new HashSet();
        object3 = null;
        int n2 = n = 0;
        while (n2 < arrayList.size()) {
            object2 = (X509Certificate)arrayList.get(n);
            object = ((X509Certificate)object2).getKeyUsage();
            if (!(object == null || ((boolean[])object).length > 6 && object[6])) {
                object3 = new sprlhi(sprmfka.cfr_renamed_9("|IFOPH\u0015YPHASSSV[A_\u0015QPC\u0015OF[R_\u0015_MNPTFSZT\u0015^Z_F\u001a[UA\u001aE_GW\\N\u0015ygv\u0015I\\][S[]\u001b"));
            } else {
                serializable.add(arrayList2.get(n));
            }
            n2 = ++n;
        }
        if (serializable.isEmpty() && object3 == null) {
            throw new sprlhi(sprxqy.cfr_renamed_9("\u0019@4O5UzG3O>\u0001;\u0001,@6H>\u00013R)T?SzB?S.H<H9@.Dt"));
        }
        if (serializable.isEmpty() && object3 != null) {
            throw object3;
        }
        return serializable;
    }

    public static int cfr_renamed_2217(CertPath arg0, int arg1, int arg2) {
        if (!sprgai.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1)) && arg2 != 0) {
            return arg2 - 1;
        }
        return arg2;
    }

    public static void cfr_renamed_9081(Date arg0, X509CRL arg1, Object arg2, sprefi arg3) throws sprlhi {
        if (arg3.cfr_renamed_2161() == 11) {
            sprgai.cfr_renamed_9089(arg0, arg1, arg2, arg3);
        }
    }

    static {
        cfr_renamed_3 = spruci.cfr_renamed_5727(sprmuh.class, sprmfka.cfr_renamed_9("PTLT\u0014F_VOGSAC\u001bYPHA\u0014eq|bg_CUV[ASZTvRPY^_G"));
        cfr_renamed_2 = sprrdm.cfr_renamed_723.cfr_renamed_19();
        cfr_renamed_114 = sprrdm.cfr_renamed_31.cfr_renamed_19();
        cfr_renamed_132 = sprrdm.cfr_renamed_145.cfr_renamed_19();
        cfr_renamed_152 = sprrdm.cfr_renamed_96.cfr_renamed_19();
        cfr_renamed_0 = sprrdm.cfr_renamed_957.cfr_renamed_19();
        cfr_renamed_112 = sprrdm.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_4 = sprrdm.cfr_renamed_82.cfr_renamed_19();
        cfr_renamed_79 = sprrdm.cfr_renamed_133.cfr_renamed_19();
        cfr_renamed_137 = sprrdm.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_107 = sprrdm.cfr_renamed_137.cfr_renamed_19();
        cfr_renamed_105 = sprrdm.spr\ufe34.cfr_renamed_19();
        cfr_renamed_96 = sprrdm.cfr_renamed_105.cfr_renamed_19();
        cfr_renamed_91 = sprrdm.cfr_renamed_272.cfr_renamed_19();
        cfr_renamed_93 = sprrdm.cfr_renamed_128.cfr_renamed_19();
        String[] stringArray = new String[11];
        stringArray[0] = sprxqy.cfr_renamed_9("/O)Q?B3G3D>");
        stringArray[1] = sprmfka.cfr_renamed_9("^_LyZWEHZW\\IP");
        stringArray[2] = sprxqy.cfr_renamed_9("B\u001bb5L*S5L3R?");
        stringArray[3] = sprmfka.cfr_renamed_9("[S\\\\V\\[ASZTvRTTR_Q");
        stringArray[4] = sprxqy.cfr_renamed_9("R/Q?S)D>D>");
        stringArray[5] = sprmfka.cfr_renamed_9("YPIF[ASZTz\\zJPHTN\\U[");
        stringArray[6] = sprxqy.cfr_renamed_9("9D(U3G3B;U?i5M>");
        stringArray[7] = "unknown";
        stringArray[8] = sprmfka.cfr_renamed_9("G_XUC_sHZWvhy");
        stringArray[9] = sprxqy.cfr_renamed_9("Q(H,H6D=D\rH.I>S;V4");
        stringArray[10] = sprmfka.cfr_renamed_9("[tyZWEHZW\\IP");
        cfr_renamed_102 = stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static X509CRL cfr_renamed_2170(Set arg0, PublicKey arg1) throws sprlhi {
        Iterator iterator;
        Exception exception = null;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            X509CRL x509CRL = (X509CRL)iterator.next();
            try {
                x509CRL.verify(arg1);
                return x509CRL;
            }
            catch (Exception exception2) {
                exception = exception2;
                iterator2 = iterator;
            }
        }
        if (exception != null) {
            throw new sprlhi(sprxqy.cfr_renamed_9("b;O4N.\u0001,D(H<XzE?M.@zb\bmt"), exception);
        }
        return null;
    }

    public static int cfr_renamed_2193(int arg0, X509Certificate arg1) {
        if (!sprgai.cfr_renamed_286(arg1) && arg0 != 0) {
            --arg0;
        }
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public static sprbrh cfr_renamed_9094(CertPath certPath, sprgak sprgak2, Set set, int n, List[] listArray, sprbrh sprbrh2, Set set2) throws CertPathValidatorException {
        Object object;
        int n2;
        sprbrh arg5;
        void arg4;
        void arg2;
        void arg3;
        void arg1;
        CertPath arg0;
        int n3 = arg0.getCertificates().size();
        if (sprbrh2 == null) {
            if (arg1.cfr_renamed_9095()) {
                throw new sprxbi(sprmfka.cfr_renamed_9("pBEV\\Y\\N\u0015JZV\\YL\u001aG_DOPIA_Q\u001aWOA\u001a[U[_\u0015[C[\\VTXY_\u001b"), null, arg0, (int)arg3);
            }
            sprbrh sprbrh3 = null;
            return null;
        }
        if (sprgai.cfr_renamed_342((Set)arg2)) {
            if (arg1.cfr_renamed_9095()) {
                sprbrh sprbrh4;
                int n4;
                void arg6;
                if (arg6.isEmpty()) {
                    throw new sprxbi(sprxqy.cfr_renamed_9("\u001fY*M3B3UzQ5M3B#\u0001(D+T?R.D>\u00018T.\u00014N4Dz@,@3M;C6Dt"), null, arg0, (int)arg3);
                }
                HashSet hashSet = new HashSet();
                int n5 = n4 = 0;
                while (n5 < ((void)arg4).length) {
                    int n6;
                    sprbrh sprbrh5 = arg4[n4];
                    int n7 = n6 = 0;
                    while (n7 < sprbrh5.size()) {
                        sprbrh sprbrh6 = (sprbrh)sprbrh5.get(n6);
                        if (cfr_renamed_86.equals(sprbrh6.getValidPolicy())) {
                            Iterator iterator = sprbrh6.getChildren();
                            while (iterator.hasNext()) {
                                Iterator iterator2 = sprbrh4;
                                iterator = iterator2;
                                hashSet.add(iterator2.next());
                            }
                        }
                        n7 = ++n6;
                    }
                    n5 = ++n4;
                }
                for (sprbrh sprbrh5 : hashSet) {
                    String string = sprbrh5.getValidPolicy();
                    if (arg6.contains(string)) continue;
                }
                if (arg5 != null) {
                    int n8;
                    int n9 = n8 = n3 - 1;
                    while (n9 >= 0) {
                        int n10;
                        void var12_24 = arg4[n8];
                        int n11 = n10 = 0;
                        while (n11 < var12_24.size()) {
                            sprbrh4 = (sprbrh)var12_24.get(n10);
                            if (!sprbrh4.cfr_renamed_336()) {
                                arg5 = sprgai.cfr_renamed_5083(arg5, (List[])arg4, sprbrh4);
                            }
                            n11 = ++n10;
                        }
                        n9 = --n8;
                    }
                }
            }
            void var8_9 = arg5;
            return var8_9;
        }
        HashSet<sprbrh> hashSet = new HashSet<sprbrh>();
        int n12 = n2 = 0;
        while (n12 < ((void)arg4).length) {
            int n13;
            sprbrh sprbrh7 = arg4[n2];
            int n14 = n13 = 0;
            while (n14 < sprbrh7.size()) {
                sprbrh sprbrh8 = (sprbrh)sprbrh7.get(n13);
                if (cfr_renamed_86.equals(sprbrh8.getValidPolicy())) {
                    object = sprbrh8.getChildren();
                    while (object.hasNext()) {
                        sprbrh sprbrh9 = (sprbrh)object.next();
                        if (cfr_renamed_86.equals(sprbrh9.getValidPolicy())) continue;
                        hashSet.add(sprbrh9);
                    }
                }
                n14 = ++n13;
            }
            n12 = ++n2;
        }
        for (sprbrh sprbrh7 : hashSet) {
            String string = sprbrh7.getValidPolicy();
            if (arg2.contains(string)) continue;
            arg5 = sprgai.cfr_renamed_5083(arg5, (List[])arg4, sprbrh7);
        }
        if (arg5 != null) {
            int n15;
            int n16 = n15 = n3 - 1;
            while (n16 >= 0) {
                int n17;
                void var12_27 = arg4[n15];
                int n18 = n17 = 0;
                while (n18 < var12_27.size()) {
                    object = (sprbrh)var12_27.get(n17);
                    if (!((sprbrh)object).cfr_renamed_336()) {
                        arg5 = sprgai.cfr_renamed_5083(arg5, (List[])arg4, (sprbrh)object);
                    }
                    n18 = ++n17;
                }
                n16 = --n15;
            }
        }
        void var8_10 = arg5;
        return var8_10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2208(CertPath arg0, int arg1, Set arg2, List arg3) throws CertPathValidatorException {
        Iterator iterator;
        X509Certificate x509Certificate = (X509Certificate)arg0.getCertificates().get(arg1);
        Iterator iterator2 = iterator = arg3.iterator();
        while (iterator2.hasNext()) {
            try {
                ((PKIXCertPathChecker)iterator.next()).check(x509Certificate, arg2);
                iterator2 = iterator;
            }
            catch (CertPathValidatorException certPathValidatorException) {
                throw new CertPathValidatorException(certPathValidatorException.getMessage(), certPathValidatorException.getCause(), arg0, arg1);
            }
        }
        if (!arg2.isEmpty()) {
            throw new sprxbi(new StringBuilder().insert(0, sprmfka.cfr_renamed_9("yPHASSSV[A_\u0015RTI\u0015O[I@JEUGNP^\u0015YGSASV[Y\u001aPBA_[I\\U[\u0000\u0015")).append(arg2).toString(), null, arg0, arg1);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9096(CertPath arg0, sprgak arg1, Date arg2, sprke arg3, int arg4, PublicKey arg5, boolean arg6, sprnbm arg7, X509Certificate arg8) throws CertPathValidatorException {
        block7: {
            var10_9 = (X509Certificate)arg0.getCertificates().get(arg4);
            if (arg6) break block7;
            try {
                sprgai.cfr_renamed_280(var10_9, arg5, arg1.cfr_renamed_9097());
                v0 = arg2;
                ** GOTO lbl12
            }
            catch (GeneralSecurityException var11_10) {
                throw new sprxbi(sprxqy.cfr_renamed_9("\u0019N/M>\u00014N.\u0001,@6H>@.DzB?S.H<H9@.DzR3F4@.T(Dt"), (Throwable)var11_10, arg0, arg4);
            }
        }
        try {
            v0 = arg2;
lbl12:
            // 2 sources

            var11_11 = sprgai.cfr_renamed_9098(v0, arg1.cfr_renamed_376(), arg0, arg4);
        }
        catch (sprlhi var12_12) {
            throw new sprxbi(sprmfka.cfr_renamed_9("vU@VQ\u001a[UA\u001aC[YSQ[A_\u0015N\\WP\u001aZ\\\u0015YPHASSSV[A_\u001b"), (Throwable)var12_12, arg0, arg4);
        }
        {
            var10_9.checkValidity(var11_11);
        }
        if (arg3 != null) {
            v1 = arg3;
            v2 = arg3;
            v1.cfr_renamed_9066(new sprwzj(arg1, var11_11, arg0, arg4, arg8, arg5));
            v1.check(var10_9);
        }
        if (!(var12_13 = sprooh.cfr_renamed_9099(var10_9)).equals(arg7)) {
            throw new sprxbi(new StringBuilder().insert(0, sprxqy.cfr_renamed_9("\u0013R)T?S\u0014@7Dr")).append(var12_13).append(sprmfka.cfr_renamed_9("\u001c\u001aQUPI\u0015TZN\u0015WTNVR\u0015i@X__VN{[X_\u001d")).append(arg7).append(sprxqy.cfr_renamed_9("s\u00015GzR3F4H4FzB?S.H<H9@.Dt")).toString(), null, arg0, arg4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9100(sprwzj arg0, sprgak arg1, Date arg2, Date arg3, X509Certificate arg4, X509Certificate arg5, PublicKey arg6, List arg7, sprrr arg8) throws sprlhi, sprluh {
        boolean bl;
        Object object;
        Object object2;
        Object object3;
        sprlhi sprlhi2;
        block22: {
            sprlhi2 = null;
            sprvcm sprvcm2 = null;
            try {
                sprvcm2 = sprvcm.cfr_renamed_23(sprgai.cfr_renamed_292(arg4, cfr_renamed_137));
            }
            catch (Exception exception) {
                throw new sprlhi(sprmfka.cfr_renamed_9("vhy\u001aQSFNGSWOASZT\u0015JZS[N\u0015_MNPTFSZT\u0015YZOY^\u0015TZN\u0015XP\u001aG_T^\u001b"), exception);
            }
            sprmdk sprmdk2 = new sprmdk(arg1);
            try {
                object3 = sprgai.cfr_renamed_9074(sprvcm2, arg1.cfr_renamed_7289(), arg3, arg8);
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    sprmdk2.cfr_renamed_7271(object2.next());
                }
            }
            catch (sprlhi sprlhi3) {
                throw new sprlhi(sprxqy.cfr_renamed_9("\u0014Nz@>E3U3N4@6\u0001\u0019s\u0016\u00016N9@.H5O)\u00019N/M>\u00018DzE?B5E?EzG(N7\u0001\u0019s\u0016\u0001>H)U(H8T.H5OzQ5H4UzD\"U?O)H5Ot"), sprlhi3);
            }
            object3 = new sprefi();
            object2 = new sprgth();
            sprgak sprgak2 = sprmdk2.cfr_renamed_1451();
            boolean bl2 = false;
            if (sprvcm2 != null) {
                object = null;
                try {
                    object = sprvcm2.cfr_renamed_322();
                }
                catch (Exception exception) {
                    throw new sprlhi(sprmfka.cfr_renamed_9("~\\IAH\\X@N\\U[\u001aEU\\TAI\u0015YZOY^\u0015TZN\u0015XP\u001aG_T^\u001b"), exception);
                }
                if (object != null) {
                    int n;
                    int n2 = n = 0;
                    while (n2 < ((sprjgm[])object).length && ((sprefi)object3).cfr_renamed_2161() == 11 && !((sprgth)object2).cfr_renamed_2162()) {
                        try {
                            sprmuh.cfr_renamed_9087(arg0, object[n], sprgak2, arg2, arg3, arg4, arg5, arg6, (sprefi)object3, (sprgth)object2, arg7, arg8);
                            bl2 = true;
                        }
                        catch (sprlhi sprlhi4) {
                            sprlhi2 = sprlhi4;
                        }
                        n2 = ++n;
                    }
                }
            }
            if (((sprefi)object3).cfr_renamed_2161() == 11 && !((sprgth)object2).cfr_renamed_2162()) {
                try {
                    try {
                        object = sprooh.cfr_renamed_9099(arg4);
                    }
                    catch (RuntimeException runtimeException) {
                        throw new sprlhi(sprxqy.cfr_renamed_9("\u0013R)T?SzG(N7\u00019D(U3G3B;U?\u0001<N(\u0001\u0019s\u0016\u00019N/M>\u00014N.\u00018DzS?D4B5E?Et"), runtimeException);
                    }
                    sprjgm sprjgm2 = new sprjgm(new sprhhm(0, new spraem(new sprigm(4, (sprco)object))), null, null);
                    sprgak sprgak3 = (sprgak)arg1.clone();
                    sprmuh.cfr_renamed_9087(arg0, sprjgm2, sprgak3, arg2, arg3, arg4, arg5, arg6, (sprefi)object3, (sprgth)object2, arg7, arg8);
                    bl = bl2 = true;
                    break block22;
                }
                catch (sprlhi sprlhi5) {
                    sprlhi2 = sprlhi5;
                }
            }
            bl = bl2;
        }
        if (!bl) {
            if (sprlhi2 instanceof sprlhi) {
                throw sprlhi2;
            }
            throw new sprlhi(sprmfka.cfr_renamed_9("{U\u0015LTV\\^\u0015ygv\u0015\\ZO[^\u001b"), sprlhi2);
        }
        if (((sprefi)object3).cfr_renamed_2161() != 11) {
            object = new SimpleDateFormat(sprxqy.cfr_renamed_9("#X#Xwl\u0017\f>Ezi\u0012\u001b7L`R)\u0001\u0000"));
            ((DateFormat)object).setTimeZone(TimeZone.getTimeZone("UTC"));
            String string = new StringBuilder().insert(0, sprmfka.cfr_renamed_9("v_GN\\\\\\YTNP\u001aG_CUV[ASZT\u0015[SNPH\u0015")).append(((DateFormat)object).format(((sprefi)object3).cfr_renamed_2139())).toString();
            string = new StringBuilder().insert(0, string).append(sprxqy.cfr_renamed_9("\rzS?@)N4\u001bz")).append(cfr_renamed_102[((sprefi)object3).cfr_renamed_2161()]).toString();
            throw new sprlhi(string);
        }
        if (!((sprgth)object2).cfr_renamed_2162() && ((sprefi)object3).cfr_renamed_2161() == 11) {
            ((sprefi)object3).cfr_renamed_2164(12);
        }
        if (((sprefi)object3).cfr_renamed_2161() == 12) {
            throw new sprlhi(sprmfka.cfr_renamed_9("v_GN\\\\\\YTNP\u001aFNTN@I\u0015YZOY^\u0015TZN\u0015XP\u001aQ_A_GW\\TP^\u001b"));
        }
    }

    /*
     * Exception decompiling
     */
    public static int cfr_renamed_2220(CertPath arg0, int arg1, int arg2) throws CertPathValidatorException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static int cfr_renamed_2196(CertPath arg0, int arg1, int arg2) {
        if (!sprgai.cfr_renamed_286((X509Certificate)arg0.getCertificates().get(arg1)) && arg2 != 0) {
            return arg2 - 1;
        }
        return arg2;
    }
}

