/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.spryul;
import com.spire.presentation.packages.sprztl;
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

public class sprdnl {
    private Object cfr_renamed_91;
    private spryul cfr_renamed_0;
    private sprztl cfr_renamed_1;
    private List cfr_renamed_2;
    private List cfr_renamed_3;
    private String cfr_renamed_4;

    public sprdnl cfr_renamed_4325(String arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprdnl() {
        sprdnl sprdnl2 = this;
        sprdnl sprdnl3 = this;
        this.cfr_renamed_3 = new ArrayList();
        sprdnl3.cfr_renamed_2 = new ArrayList();
        sprdnl2.cfr_renamed_0 = new spryul();
        sprdnl2.cfr_renamed_1 = new sprztl();
        sprdnl2.cfr_renamed_4 = "Collection";
    }

    public sprdnl cfr_renamed_10772(sprtpl arg0) {
        sprdnl sprdnl2 = this;
        sprdnl2.cfr_renamed_3.add(arg0);
        return sprdnl2;
    }

    public CertStore cfr_renamed_1451() throws GeneralSecurityException {
        sprdnl sprdnl2 = this;
        sprdnl sprdnl3 = this;
        CollectionCertStoreParameters collectionCertStoreParameters = sprdnl2.cfr_renamed_10934(sprdnl2.cfr_renamed_0, sprdnl3.cfr_renamed_1);
        if (sprdnl3.cfr_renamed_91 instanceof String) {
            return CertStore.getInstance(this.cfr_renamed_4, (CertStoreParameters)collectionCertStoreParameters, (String)this.cfr_renamed_91);
        }
        if (this.cfr_renamed_91 instanceof Provider) {
            return CertStore.getInstance(this.cfr_renamed_4, (CertStoreParameters)collectionCertStoreParameters, (Provider)this.cfr_renamed_91);
        }
        return CertStore.getInstance(this.cfr_renamed_4, collectionCertStoreParameters);
    }

    /*
     * WARNING - void declaration
     */
    public sprdnl cfr_renamed_1498(Provider provider) {
        void arg0;
        spryul spryul2 = this.cfr_renamed_0.cfr_renamed_1498(provider);
        this.cfr_renamed_1.cfr_renamed_1498(provider);
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprdnl cfr_renamed_5285(sprug arg0) {
        sprdnl sprdnl2 = this;
        sprdnl2.cfr_renamed_3.addAll(arg0.cfr_renamed_3216(null));
        return sprdnl2;
    }

    public sprdnl cfr_renamed_5286(sprug arg0) {
        sprdnl sprdnl2 = this;
        sprdnl2.cfr_renamed_2.addAll(arg0.cfr_renamed_3216(null));
        return sprdnl2;
    }

    public sprdnl cfr_renamed_10769(sprpxl arg0) {
        sprdnl sprdnl2 = this;
        sprdnl2.cfr_renamed_2.add(arg0);
        return sprdnl2;
    }

    private /* synthetic */ CollectionCertStoreParameters cfr_renamed_10934(spryul arg0, sprztl arg1) throws CertificateException, CRLException {
        Iterator iterator;
        ArrayList<X509Extension> arrayList = new ArrayList<X509Extension>(this.cfr_renamed_3.size() + this.cfr_renamed_2.size());
        Iterator iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            arrayList.add(arg0.cfr_renamed_7519((sprtpl)iterator.next()));
            iterator2 = iterator;
        }
        iterator = this.cfr_renamed_2.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            arrayList.add(arg1.cfr_renamed_10930((sprpxl)iterator.next()));
            iterator3 = iterator;
        }
        return new CollectionCertStoreParameters(arrayList);
    }

    /*
     * WARNING - void declaration
     */
    public sprdnl cfr_renamed_1499(String string) {
        void arg0;
        spryul spryul2 = this.cfr_renamed_0.cfr_renamed_1499(string);
        this.cfr_renamed_1.cfr_renamed_1499(string);
        this.cfr_renamed_91 = arg0;
        return this;
    }
}

