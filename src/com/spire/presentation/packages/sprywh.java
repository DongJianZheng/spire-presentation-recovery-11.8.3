/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkcp;
import com.spire.presentation.packages.sprzii;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprywh
extends CertStoreSpi {
    private sprzii cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ 2;
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

    public Collection engineGetCRLs(CRLSelector arg0) throws CertStoreException {
        List list;
        sprywh sprywh2 = this;
        boolean bl = sprywh2.cfr_renamed_4.cfr_renamed_2282();
        Iterator iterator = sprywh2.cfr_renamed_4.cfr_renamed_2283().iterator();
        List list2 = list = bl ? new ArrayList() : Collections.EMPTY_LIST;
        while (iterator.hasNext()) {
            Collection<? extends CRL> collection = ((CertStore)iterator.next()).getCRLs(arg0);
            if (bl) {
                list.addAll(collection);
                continue;
            }
            if (collection.isEmpty()) continue;
            return collection;
        }
        return list;
    }

    public Collection engineGetCertificates(CertSelector arg0) throws CertStoreException {
        List list;
        sprywh sprywh2 = this;
        boolean bl = sprywh2.cfr_renamed_4.cfr_renamed_2282();
        Iterator iterator = sprywh2.cfr_renamed_4.cfr_renamed_2283().iterator();
        List list2 = list = bl ? new ArrayList() : Collections.EMPTY_LIST;
        while (iterator.hasNext()) {
            Collection<? extends Certificate> collection = ((CertStore)iterator.next()).getCertificates(arg0);
            if (bl) {
                list.addAll(collection);
                continue;
            }
            if (collection.isEmpty()) continue;
            return collection;
        }
        return list;
    }

    public sprywh(CertStoreParameters arg0) throws InvalidAlgorithmParameterException {
        CertStoreParameters certStoreParameters = arg0;
        super(certStoreParameters);
        if (!(certStoreParameters instanceof sprzii)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprkcp.cfr_renamed_9("\u0004\u0005\nD\u0014\u001a\u000e\u0018\u0002D\u0017\u0019\n\u0005\u0003\u000f\u000bD\u0014\u000f\u0004\u001f\u0015\u0003\u0013\u0013I\u0000\u0004\u000fI\u001a\u0015\u0005\u0011\u0003\u0003\u000f\u0015D*\u001f\u000b\u001e\u000e)\u0002\u0018\u00139\u0013\u0005\u0015\u000f4\u001a\u000ePG\u001a\u0006\u0018\u0006\u0007\u0002\u001e\u0002\u0018G\u0007\u0012\u0019\u0013J\u0005\u000fG\u000bG'\u0012\u0006\u0013\u0003$\u000f\u0015\u001e4\u001e\b\u0018\u0002:\u0006\u0018\u0006\u0007\u0002\u001e\u0002\u0018\u0014J\b\b\r\u000f\u0004\u001em")).append(arg0.toString()).toString());
        }
        this.cfr_renamed_4 = (sprzii)arg0;
    }
}

