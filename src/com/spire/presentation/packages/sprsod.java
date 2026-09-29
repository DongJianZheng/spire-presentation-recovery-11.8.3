/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprjqd;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sprwqd;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sprsod {
    private List cfr_renamed_91;
    private sprjqd cfr_renamed_0;
    private Object cfr_renamed_1;
    private String cfr_renamed_2;
    private List cfr_renamed_3;
    private sprwqd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsod cfr_renamed_1499(String string) {
        void arg0;
        sprwqd sprwqd2 = this.cfr_renamed_4.cfr_renamed_1499(string);
        this.cfr_renamed_0.cfr_renamed_1499(string);
        this.cfr_renamed_1 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprsod cfr_renamed_1498(Provider provider) {
        void arg0;
        sprwqd sprwqd2 = this.cfr_renamed_4.cfr_renamed_1498(provider);
        this.cfr_renamed_0.cfr_renamed_1498(provider);
        this.cfr_renamed_1 = arg0;
        return this;
    }

    private /* synthetic */ CollectionCertStoreParameters cfr_renamed_4324(sprwqd arg0, sprjqd arg1) throws CertificateException, CRLException {
        Iterator iterator;
        ArrayList<X509Extension> arrayList = new ArrayList<X509Extension>(this.cfr_renamed_91.size() + this.cfr_renamed_3.size());
        Iterator iterator2 = iterator = this.cfr_renamed_91.iterator();
        while (iterator2.hasNext()) {
            arrayList.add(arg0.cfr_renamed_4318((sprcyd)iterator.next()));
            iterator2 = iterator;
        }
        iterator = this.cfr_renamed_3.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            arrayList.add(arg1.cfr_renamed_4316((spreud)iterator.next()));
            iterator3 = iterator;
        }
        return new CollectionCertStoreParameters(arrayList);
    }

    public sprsod cfr_renamed_4124(spreud arg0) {
        sprsod sprsod2 = this;
        sprsod2.cfr_renamed_3.add(arg0);
        return sprsod2;
    }

    public sprsod cfr_renamed_4123(sprcyd arg0) {
        sprsod sprsod2 = this;
        sprsod2.cfr_renamed_91.add(arg0);
        return sprsod2;
    }

    public sprsod() {
        sprsod sprsod2 = this;
        sprsod sprsod3 = this;
        this.cfr_renamed_91 = new ArrayList();
        sprsod3.cfr_renamed_3 = new ArrayList();
        sprsod2.cfr_renamed_4 = new sprwqd();
        sprsod2.cfr_renamed_0 = new sprjqd();
        sprsod2.cfr_renamed_2 = "Collection";
    }

    public sprsod cfr_renamed_600(spro arg0) {
        sprsod sprsod2 = this;
        sprsod2.cfr_renamed_91.addAll(arg0.cfr_renamed_152(null));
        return sprsod2;
    }

    public sprsod cfr_renamed_4325(String arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public CertStore cfr_renamed_1451() throws GeneralSecurityException {
        sprsod sprsod2 = this;
        sprsod sprsod3 = this;
        CollectionCertStoreParameters collectionCertStoreParameters = sprsod2.cfr_renamed_4324(sprsod2.cfr_renamed_4, sprsod3.cfr_renamed_0);
        if (sprsod3.cfr_renamed_1 instanceof String) {
            return CertStore.getInstance(this.cfr_renamed_2, (CertStoreParameters)collectionCertStoreParameters, (String)this.cfr_renamed_1);
        }
        if (this.cfr_renamed_1 instanceof Provider) {
            return CertStore.getInstance(this.cfr_renamed_2, (CertStoreParameters)collectionCertStoreParameters, (Provider)this.cfr_renamed_1);
        }
        return CertStore.getInstance(this.cfr_renamed_2, collectionCertStoreParameters);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2;
        int cfr_ignored_0 = (2 ^ 5) << 4;
        int n4 = n2;
        int n5 = 5 << 4 ^ 5 << 1;
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

    public sprsod cfr_renamed_601(spro arg0) {
        sprsod sprsod2 = this;
        sprsod2.cfr_renamed_3.addAll(arg0.cfr_renamed_152(null));
        return sprsod2;
    }
}

