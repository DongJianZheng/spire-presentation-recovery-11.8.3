/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.sprgmb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprisga;
import com.spire.presentation.packages.sprkmb;
import com.spire.presentation.packages.sprkpb;
import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprmqa;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwmb;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprsrb
extends CertPathValidatorSpi {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public CertPathValidatorResult engineValidate(CertPath arg0, CertPathParameters arg1) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        CertPath certPath;
        HashSet<String> hashSet;
        HashSet hashSet2;
        Iterator<PKIXCertPathChecker> iterator;
        PublicKey publicKey;
        X500Principal x500Principal;
        TrustAnchor trustAnchor;
        int n;
        sprlsa sprlsa2;
        int n2;
        sprlsa sprlsa3;
        int n3;
        int n4;
        TrustAnchor trustAnchor2;
        sprlsa sprlsa4;
        if (!(arg1 instanceof PKIXParameters)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprisga.cfr_renamed_9("h=J=U9L9J/\u00181M/L|Z9\u0018=\u0018")).append(PKIXParameters.class.getName()).append(sprkrl.cfr_renamed_9("`;.!43.1%|")).toString());
        }
        if ((arg1 instanceof sprlsa ? (sprlsa4 = (sprlsa)arg1) : (sprlsa4 = sprlsa.cfr_renamed_382((PKIXParameters)arg1))).getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException(sprisga.cfr_renamed_9("(J)K(y2[4W.K|Q/\u00182M0Tp\u0018(P5K|Q/\u00182W(\u0018=T0W+]8\u0018:W.\u0018?].L5^5[=L5W2\u0018,Y(P|N=T5\\=L5W2\u0016"));
        }
        List<? extends Certificate> list = arg0.getCertificates();
        int n5 = list.size();
        if (list.isEmpty()) {
            throw new CertPathValidatorException(sprkrl.cfr_renamed_9("\u000372&)4)1!&)=.r034:`;3r%?0&9|"), null, arg0, 0);
        }
        Set<String> set = sprlsa4.getInitialPolicies();
        try {
            List<? extends Certificate> list2 = list;
            trustAnchor2 = sprmqa.cfr_renamed_2273((X509Certificate)list2.get(list2.size() - 1), sprlsa4.getTrustAnchors(), sprlsa4.getSigProvider());
        }
        catch (sprakb sprakb2) {
            throw new CertPathValidatorException(sprakb2.getMessage(), (Throwable)sprakb2, arg0, list.size() - 1);
        }
        if (trustAnchor2 == null) {
            throw new CertPathValidatorException(sprisga.cfr_renamed_9("\bJ)K(\u0018=V?P3J|^3J|[9J(Q:Q?Y(Q3V|H=L4\u00182W(\u0018:W)V8\u0016"), null, arg0, -1);
        }
        int n6 = 0;
        List[] listArray = new ArrayList[n5 + 1];
        int n7 = n4 = 0;
        while (n7 < listArray.length) {
            listArray[n4++] = new ArrayList();
            n7 = n4;
        }
        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("2.5.29.32.0");
        sprkpb sprkpb2 = new sprkpb(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
        listArray[0].add(sprkpb2);
        sprkmb sprkmb2 = new sprkmb();
        HashSet hashSet4 = new HashSet();
        if (sprlsa4.isExplicitPolicyRequired()) {
            n3 = 0;
            sprlsa3 = sprlsa4;
        } else {
            n3 = n5 + 1;
            sprlsa3 = sprlsa4;
        }
        if (sprlsa3.isAnyPolicyInhibited()) {
            n2 = 0;
            sprlsa2 = sprlsa4;
        } else {
            n2 = n5 + 1;
            sprlsa2 = sprlsa4;
        }
        if (sprlsa2.isPolicyMappingInhibited()) {
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
                x500Principal = sprmqa.cfr_renamed_282(x509Certificate2);
                publicKey = x509Certificate2.getPublicKey();
            } else {
                x500Principal = new X500Principal(trustAnchor2.getCAName());
                publicKey = trustAnchor2.getCAPublicKey();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprgmb(sprkrl.cfr_renamed_9("\u000150*7#&`=&r4 5!4r!<#:/ `1/',6`</&`0%rh %{%<#=$7$|"), (Throwable)illegalArgumentException, arg0, -1);
        }
        sprije sprije2 = null;
        try {
            sprije2 = sprmqa.cfr_renamed_283(publicKey);
        }
        catch (CertPathValidatorException certPathValidatorException) {
            throw new sprgmb(sprisga.cfr_renamed_9("y0_3J5L4U|Q8]2L5^5].\u00183^|H)Z0Q?\u00187]%\u00183^|L.M/L|Y2[4W.\u0018?W)T8\u00182W(\u0018>]|J9Y8\u0016"), (Throwable)certPathValidatorException, arg0, -1);
        }
        sprtzd sprtzd2 = sprije2.cfr_renamed_593();
        spra spra2 = sprije2.cfr_renamed_284();
        int n8 = n5;
        if (sprlsa4.cfr_renamed_397() != null && !sprlsa4.cfr_renamed_397().cfr_renamed_132((X509Certificate)list.get(0))) {
            throw new sprgmb(sprkrl.cfr_renamed_9("\u0014325%&`1% 4;&;#347`;.r#72&)4)1!&)=.r034:`6/73r.=4r-341(r4325%&\u0003=.!4 !;.&3|"), null, arg0, 0);
        }
        List<PKIXCertPathChecker> list3 = sprlsa4.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> iterator2 = iterator = list3.iterator();
        while (iterator2.hasNext()) {
            iterator.next().init(false);
            iterator2 = iterator;
        }
        X509Certificate x509Certificate3 = null;
        int n9 = n6 = list.size() - 1;
        while (n9 >= 0) {
            int n10 = n5 - n6;
            x509Certificate3 = (X509Certificate)list.get(n6);
            boolean bl = n6 == list.size() - 1;
            CertPath certPath2 = arg0;
            CertPath certPath3 = arg0;
            int n11 = n6;
            sprwmb.cfr_renamed_2200(arg0, sprlsa4, n11, publicKey, bl, x500Principal, x509Certificate);
            sprwmb.cfr_renamed_2187(certPath3, n11, sprkmb2);
            sprkpb2 = sprwmb.cfr_renamed_2209(certPath2, n6, hashSet4, sprkpb2, listArray, n2);
            sprkpb2 = sprwmb.cfr_renamed_2199(certPath3, n6, sprkpb2);
            sprwmb.cfr_renamed_2213(certPath2, n6, sprkpb2, n3);
            if (n10 != n5) {
                CertPath certPath4;
                HashSet hashSet5;
                if (x509Certificate3 != null && x509Certificate3.getVersion() == 1) {
                    throw new CertPathValidatorException(sprisga.cfr_renamed_9("\n].K5W2\u0018m\u0018?].L5^5[=L9K|[=V{L|Z9\u0018)K9\\|Y/\u0018\u001fy|W2]/\u0016"), null, arg0, n6);
                }
                CertPath certPath5 = arg0;
                CertPath certPath6 = arg0;
                sprwmb.cfr_renamed_2218(certPath6, n6);
                sprkpb2 = sprwmb.cfr_renamed_2214(certPath5, n6, listArray, sprkpb2, n);
                sprwmb.cfr_renamed_2195(certPath6, n6, sprkmb2);
                n3 = sprwmb.cfr_renamed_2197(certPath5, n6, n3);
                n = sprwmb.cfr_renamed_2217(certPath5, n6, n);
                n2 = sprwmb.cfr_renamed_2196(certPath5, n6, n2);
                n3 = sprwmb.cfr_renamed_2220(certPath5, n6, n3);
                n = sprwmb.cfr_renamed_2191(certPath5, n6, n);
                n2 = sprwmb.cfr_renamed_2190(certPath5, n6, n2);
                sprwmb.cfr_renamed_2212(certPath5, n6);
                n8 = sprwmb.cfr_renamed_2221(certPath5, n6, n8);
                n8 = sprwmb.cfr_renamed_2216(certPath5, n6, n8);
                sprwmb.cfr_renamed_2192(certPath5, n6);
                hashSet2 = x509Certificate3.getCriticalExtensionOIDs();
                if (hashSet2 != null) {
                    hashSet5 = new HashSet(hashSet2);
                    hashSet2 = hashSet5;
                    certPath4 = arg0;
                    hashSet2.remove(sprwmb.cfr_renamed_79);
                    hashSet2.remove(sprwmb.cfr_renamed_119);
                    hashSet2.remove(sprwmb.cfr_renamed_1);
                    hashSet2.remove(sprwmb.cfr_renamed_93);
                    hashSet2.remove(sprwmb.cfr_renamed_102);
                    hashSet2.remove(sprwmb.cfr_renamed_0);
                    hashSet2.remove(sprwmb.cfr_renamed_96);
                    hashSet2.remove(sprwmb.cfr_renamed_3);
                    hashSet2.remove(sprwmb.cfr_renamed_107);
                    hashSet2.remove(sprwmb.cfr_renamed_105);
                } else {
                    hashSet5 = new HashSet();
                    hashSet2 = hashSet5;
                    certPath4 = arg0;
                }
                sprwmb.cfr_renamed_2208(certPath4, n6, hashSet2, list3);
                x509Certificate = x509Certificate3;
                x500Principal = sprmqa.cfr_renamed_282(x509Certificate);
                try {
                    publicKey = sprmqa.cfr_renamed_297(arg0.getCertificates(), n6);
                }
                catch (CertPathValidatorException certPathValidatorException) {
                    throw new CertPathValidatorException(sprkrl.cfr_renamed_9("\u000e78&`%/ +;.5`9%+`1/',6`</&`0%r274 )767$|"), (Throwable)certPathValidatorException, arg0, n6);
                }
                sprije2 = sprmqa.cfr_renamed_283(publicKey);
                sprtzd2 = sprije2.cfr_renamed_593();
                spra2 = sprije2.cfr_renamed_284();
            }
            n9 = --n6;
        }
        n3 = sprwmb.cfr_renamed_2193(n3, x509Certificate3);
        n3 = sprwmb.cfr_renamed_2210(arg0, n6 + 1, n3);
        Set<String> set2 = x509Certificate3.getCriticalExtensionOIDs();
        if (set2 != null) {
            hashSet = new HashSet<String>(set2);
            set2 = hashSet;
            certPath = arg0;
            set2.remove(sprwmb.cfr_renamed_79);
            set2.remove(sprwmb.cfr_renamed_119);
            set2.remove(sprwmb.cfr_renamed_1);
            set2.remove(sprwmb.cfr_renamed_93);
            set2.remove(sprwmb.cfr_renamed_102);
            set2.remove(sprwmb.cfr_renamed_0);
            set2.remove(sprwmb.cfr_renamed_96);
            set2.remove(sprwmb.cfr_renamed_3);
            set2.remove(sprwmb.cfr_renamed_107);
            set2.remove(sprwmb.cfr_renamed_105);
            set2.remove(sprwmb.cfr_renamed_112);
        } else {
            hashSet = new HashSet<String>();
            set2 = hashSet;
            certPath = arg0;
        }
        sprwmb.cfr_renamed_2198(certPath, n6 + 1, list3, set2);
        hashSet2 = sprwmb.cfr_renamed_2219(arg0, sprlsa4, set, n6 + 1, listArray, sprkpb2, hashSet4);
        if (n3 <= 0 && hashSet2 == null) {
            throw new CertPathValidatorException(sprisga.cfr_renamed_9("h=L4\u0018,J3[9K/Q2_|^=Q0]8\u00183V|H3T5[%\u0016"), null, arg0, n6);
        }
        return new PKIXCertPathValidatorResult(trustAnchor2, (PolicyNode)((Object)hashSet2), x509Certificate3.getPublicKey());
    }
}

