/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjdz;
import com.spire.presentation.packages.sprpjb;
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

public class sprlob
extends CertStoreSpi {
    private sprpjb cfr_renamed_4;

    public Collection engineGetCRLs(CRLSelector arg0) throws CertStoreException {
        List list;
        sprlob sprlob2 = this;
        boolean bl = sprlob2.cfr_renamed_4.cfr_renamed_2282();
        Iterator iterator = sprlob2.cfr_renamed_4.cfr_renamed_2283().iterator();
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 1 << 3 ^ 3;
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

    public sprlob(CertStoreParameters arg0) throws InvalidAlgorithmParameterException {
        CertStoreParameters certStoreParameters = arg0;
        super(certStoreParameters);
        if (!(certStoreParameters instanceof sprpjb)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprjdz.cfr_renamed_9("wl\u007f0zqmp{g{\u007fkjt{6t{{6njqnw|{j0Uktjq]}llMlqj{Knq$8nylys}j}l8smml>z{8\u007f8Smrlw[{jjKjwl}Nylys}j}lk>w|r{{j\u0012")).append(arg0.toString()).toString());
        }
        this.cfr_renamed_4 = (sprpjb)arg0;
    }

    public Collection engineGetCertificates(CertSelector arg0) throws CertStoreException {
        List list;
        sprlob sprlob2 = this;
        boolean bl = sprlob2.cfr_renamed_4.cfr_renamed_2282();
        Iterator iterator = sprlob2.cfr_renamed_4.cfr_renamed_2283().iterator();
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
}

