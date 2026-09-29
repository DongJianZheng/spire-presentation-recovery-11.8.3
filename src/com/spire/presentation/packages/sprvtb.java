/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtno;
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

public class sprvtb
extends CertStoreSpi {
    private CollectionCertStoreParameters cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 2;
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 1);
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

    public sprvtb(CertStoreParameters arg0) throws InvalidAlgorithmParameterException {
        CertStoreParameters certStoreParameters = arg0;
        super(certStoreParameters);
        if (!(certStoreParameters instanceof CollectionCertStoreParameters)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprtno.cfr_renamed_9("}8udp%g$q3q+a>~/< q/<:`%d#v/`dQ/`>A>}8w\t}&~/q>{%|\u0019b#(jb+`+\u007f/f/`j\u007f?a>2(wjsjQ%~&w)f#}$Q/`>A>}8w\u001as8s'w>w8aj}(x/q>\u0018")).append(arg0.toString()).toString());
        }
        this.cfr_renamed_4 = (CollectionCertStoreParameters)arg0;
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
}

