/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhem;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprklga;
import com.spire.presentation.packages.sprtgm;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

public class sprbve
implements CertSelector,
sprhd {
    public final sprco cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprbve)) {
            return false;
        }
        sprbve sprbve2 = (sprbve)arg0;
        return this.cfr_renamed_4.equals(sprbve2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprbve(X500Principal x500Principal) throws IOException {
        this(new sprdzh(arg0.getEncoded()));
        void arg0;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public sprbve(sprtgm sprtgm2) {
        this.cfr_renamed_4 = sprtgm2.cfr_renamed_102();
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        return this.match((Certificate)arg0);
    }

    public Principal[] cfr_renamed_271() {
        int n;
        Object[] objectArray = this.cfr_renamed_289();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n2 = n = 0;
        while (n2 != objectArray.length) {
            if (objectArray[n] instanceof Principal) {
                arrayList.add(objectArray[n]);
            }
            n2 = ++n;
        }
        ArrayList<Object> arrayList2 = arrayList;
        return arrayList2.toArray(new Principal[arrayList2.size()]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Object[] cfr_renamed_289() {
        int n;
        spraem spraem2;
        sprigm[] sprigmArray = (this.cfr_renamed_4 instanceof sprhem ? (spraem2 = ((sprhem)this.cfr_renamed_4).cfr_renamed_403()) : (spraem2 = (spraem)this.cfr_renamed_4)).cfr_renamed_289();
        ArrayList<X500Principal> arrayList = new ArrayList<X500Principal>(sprigmArray.length);
        int n2 = n = 0;
        while (true) {
            if (n2 == sprigmArray.length) {
                ArrayList<X500Principal> arrayList2 = arrayList;
                return arrayList2.toArray(new Object[arrayList2.size()]);
            }
            if (sprigmArray[n].cfr_renamed_312() == 4) {
                try {
                    arrayList.add(new X500Principal(sprigmArray[n].cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()));
                }
                catch (IOException iOException) {
                    throw new RuntimeException(sprklga.cfr_renamed_9(" H&E;\t$F0D'Mbg#D'\t-K(L!]"));
                }
            }
            n2 = ++n;
        }
    }

    @Override
    public Object clone() {
        return new sprbve(sprtgm.cfr_renamed_23(this.cfr_renamed_4));
    }

    @Override
    public boolean match(Certificate arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate)arg0;
        if (this.cfr_renamed_4 instanceof sprhem) {
            sprhem sprhem2 = (sprhem)this.cfr_renamed_4;
            if (sprhem2.cfr_renamed_404() != null) {
                return sprhem2.cfr_renamed_404().cfr_renamed_405().cfr_renamed_5103(x509Certificate.getSerialNumber()) && this.cfr_renamed_5104(x509Certificate.getIssuerX500Principal(), sprhem2.cfr_renamed_404().cfr_renamed_102());
            }
            spraem spraem2 = sprhem2.cfr_renamed_403();
            if (this.cfr_renamed_5104(x509Certificate.getSubjectX500Principal(), spraem2)) {
                return true;
            }
        } else {
            spraem spraem3 = (spraem)this.cfr_renamed_4;
            if (this.cfr_renamed_5104(x509Certificate.getSubjectX500Principal(), spraem3)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_5104(X500Principal arg0, spraem arg1) {
        int n;
        sprigm[] sprigmArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            sprigm sprigm2 = sprigmArray[n];
            if (sprigm2.cfr_renamed_312() == 4) {
                try {
                    if (new X500Principal(sprigm2.cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()).equals(arg0)) {
                        return true;
                    }
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprbve(sprdzh sprdzh2) {
        void arg0;
        sprbve sprbve2 = this;
        sprbve2.cfr_renamed_4 = new sprhem(spraem.cfr_renamed_23(new sprcen(new sprigm((sprjii)arg0))));
    }
}

