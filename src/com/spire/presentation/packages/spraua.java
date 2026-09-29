/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnzja;
import com.spire.presentation.packages.sproee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryie;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

public class spraua
implements CertSelector,
sprb {
    public final spra cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraua(sprfjb sprfjb2) {
        void arg0;
        spraua spraua2 = this;
        spraua2.cfr_renamed_4 = new spryie(spryee.cfr_renamed_23(new sprpse(new sprmee((spruib)arg0))));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_402(X500Principal arg0, spryee arg1) {
        int n;
        sprmee[] sprmeeArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprmeeArray.length) {
            sprmee sprmee2 = sprmeeArray[n];
            if (sprmee2.cfr_renamed_312() == 4) {
                try {
                    if (new X500Principal(sprmee2.cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()).equals(arg0)) {
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

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        return this.match((Certificate)arg0);
    }

    @Override
    public Object clone() {
        return new spraua(sproee.cfr_renamed_23(this.cfr_renamed_4));
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof spraua)) {
            return false;
        }
        spraua spraua2 = (spraua)arg0;
        return this.cfr_renamed_4.equals(spraua2.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Object[] cfr_renamed_289() {
        int n;
        spryee spryee2;
        sprmee[] sprmeeArray = (this.cfr_renamed_4 instanceof spryie ? (spryee2 = ((spryie)this.cfr_renamed_4).cfr_renamed_403()) : (spryee2 = (spryee)this.cfr_renamed_4)).cfr_renamed_289();
        ArrayList<X500Principal> arrayList = new ArrayList<X500Principal>(sprmeeArray.length);
        int n2 = n = 0;
        while (true) {
            if (n2 == sprmeeArray.length) {
                ArrayList<X500Principal> arrayList2 = arrayList;
                return arrayList2.toArray(new Object[arrayList2.size()]);
            }
            if (sprmeeArray[n].cfr_renamed_312() == 4) {
                try {
                    arrayList.add(new X500Principal(sprmeeArray[n].cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()));
                }
                catch (IOException iOException) {
                    throw new RuntimeException(sprnzja.cfr_renamed_9("tXrUo\u0019pVdTs]6wwTs\u0019y[|\\uM"));
                }
            }
            n2 = ++n;
        }
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

    @Override
    public boolean match(Certificate arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate)arg0;
        if (this.cfr_renamed_4 instanceof spryie) {
            spryie spryie2 = (spryie)this.cfr_renamed_4;
            if (spryie2.cfr_renamed_404() != null) {
                return spryie2.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97().equals(x509Certificate.getSerialNumber()) && this.cfr_renamed_402(x509Certificate.getIssuerX500Principal(), spryie2.cfr_renamed_404().cfr_renamed_102());
            }
            spryee spryee2 = spryie2.cfr_renamed_403();
            if (this.cfr_renamed_402(x509Certificate.getSubjectX500Principal(), spryee2)) {
                return true;
            }
        } else {
            spryee spryee3 = (spryee)this.cfr_renamed_4;
            if (this.cfr_renamed_402(x509Certificate.getSubjectX500Principal(), spryee3)) {
                return true;
            }
        }
        return false;
    }

    public spraua(sproee sproee2) {
        this.cfr_renamed_4 = sproee2.cfr_renamed_102();
    }

    /*
     * WARNING - void declaration
     */
    public spraua(X500Principal x500Principal) throws IOException {
        this(new sprfjb(arg0.getEncoded()));
        void arg0;
    }
}

