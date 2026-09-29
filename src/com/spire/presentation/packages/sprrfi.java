/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprzcf;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class sprrfi
extends CertStoreSpi {
    private CollectionCertStoreParameters cfr_renamed_4;

    public Collection engineGetCRLs(CRLSelector arg0) throws CertStoreException {
        ArrayList arrayList = new ArrayList();
        Iterator<?> iterator = this.cfr_renamed_4.getCollection().iterator();
        if (arg0 == null) {
            while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (!(obj instanceof CRL)) continue;
                arrayList.add(obj);
            }
        } else {
            while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (!(obj instanceof CRL) || !arg0.match((CRL)obj)) continue;
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public Collection engineGetCertificates(CertSelector arg0) throws CertStoreException {
        ArrayList arrayList = new ArrayList();
        Iterator<?> iterator = this.cfr_renamed_4.getCollection().iterator();
        if (arg0 == null) {
            while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (!(obj instanceof Certificate)) continue;
                arrayList.add(obj);
            }
        } else {
            while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (!(obj instanceof Certificate) || !arg0.match((Certificate)obj)) continue;
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 5;
        int cfr_ignored_0 = 2 << 3 ^ 4;
        int n4 = n2;
        int n5 = 2 << 3 ^ 2;
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

    public sprrfi(CertStoreParameters arg0) throws InvalidAlgorithmParameterException {
        CertStoreParameters certStoreParameters = arg0;
        super(certStoreParameters);
        if (!(certStoreParameters instanceof CollectionCertStoreParameters)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprzcf.cfr_renamed_9("\u0002\\\f\u001d\u0012C\bA\u0004\u001d\u0011@\f\\\u0005V\r\u001d\u0012V\u0002F\u0013Z\u0015JOY\u0002VOC\u0013\\\u0017Z\u0005V\u0013\u001d\"V\u0013G2G\u000eA\u0004p\u000e_\rV\u0002G\b\\\u000f`\u0011Z[\u0013\u0011R\u0013R\fV\u0015V\u0013\u0013\fF\u0012GAQ\u0004\u0013\u0000\u0013\"\\\r_\u0004P\u0015Z\u000e]\"V\u0013G2G\u000eA\u0004c\u0000A\u0000^\u0004G\u0004A\u0012\u0013\u000eQ\u000bV\u0002Gk")).append(arg0.toString()).toString());
        }
        this.cfr_renamed_4 = (CollectionCertStoreParameters)arg0;
    }
}

