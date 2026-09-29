/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprgva;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprmoa;
import com.spire.presentation.packages.sprxcja;
import com.spire.presentation.packages.sprzwa;
import java.security.cert.CRL;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class sprbqb {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final /* synthetic */ Collection cfr_renamed_2272(sprgva arg0, List arg1) throws sprakb {
        HashSet<? extends CRL> hashSet = new HashSet<CRL>();
        Iterator iterator = arg1.iterator();
        sprakb sprakb2 = null;
        boolean bl = false;
        while (iterator.hasNext()) {
            Object object;
            Object e = iterator.next();
            if (e instanceof sprmoa) {
                object = (sprmoa)e;
                try {
                    hashSet.addAll(((sprmoa)object).cfr_renamed_152(arg0));
                    bl = true;
                }
                catch (sprzwa sprzwa2) {
                    sprakb2 = new sprakb(sprxcja.cfr_renamed_9("\u000fy)d:u#n$!9d+s)i#o-!#ojYd4z8jB\u0018Mjr>n8dd"), sprzwa2);
                }
                continue;
            }
            object = (CertStore)e;
            try {
                hashSet.addAll(((CertStore)object).getCRLs(arg0));
                bl = true;
            }
            catch (CertStoreException certStoreException) {
                sprakb2 = new sprakb(spraqe.cfr_renamed_9("mqKlX}AfF)[lI{KaAgO)Ag\bQ\u0006<\u00180\bJzE\bz\\fZl\u0006"), certStoreException);
            }
        }
        if (!bl && sprakb2 != null) {
            throw sprakb2;
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set cfr_renamed_2207(sprgva arg0, sprlsa arg1, Date arg2) throws sprakb {
        HashSet hashSet = new HashSet();
        try {
            sprbqb sprbqb2 = this;
            hashSet.addAll(sprbqb2.cfr_renamed_2272(arg0, arg1.cfr_renamed_377()));
            hashSet.addAll(this.cfr_renamed_2272(arg0, arg1.cfr_renamed_385()));
            hashSet.addAll(sprbqb2.cfr_renamed_2272(arg0, arg1.getCertStores()));
        }
        catch (sprakb sprakb2) {
            throw new sprakb(sprxcja.cfr_renamed_9("D2b/q>h%ojn(u+h$h$fjb%l:m/u/!\tS\u0006rd"), sprakb2);
        }
        HashSet<X509CRL> hashSet2 = new HashSet<X509CRL>();
        Date date = arg2;
        if (arg1.getDate() != null) {
            date = arg1.getDate();
        }
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            X509CRL x509CRL = (X509CRL)iterator.next();
            if (!x509CRL.getNextUpdate().after(date)) continue;
            X509Certificate x509Certificate = arg0.getCertificateChecking();
            if (x509Certificate != null) {
                if (!x509CRL.getThisUpdate().before(x509Certificate.getNotAfter())) continue;
                hashSet2.add(x509CRL);
                continue;
            }
            hashSet2.add(x509CRL);
        }
        return hashSet2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set cfr_renamed_303(sprgva arg0, PKIXParameters arg1) throws sprakb {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(this.cfr_renamed_2272(arg0, arg1.getCertStores()));
            return hashSet;
        }
        catch (sprakb sprakb2) {
            throw new sprakb(spraqe.cfr_renamed_9("LPjMy\\`Gg\bfJ}I`F`Fn\bjGdXeM}M)k[dz\u0006"), sprakb2);
        }
    }
}

