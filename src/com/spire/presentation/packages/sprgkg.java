/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprglg;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprlxj;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprwck;
import com.spire.presentation.packages.sprwng;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class sprgkg {
    public static Set cfr_renamed_7323(sprwng arg0, PKIXParameters arg1) throws sprglg {
        return sprgkg.cfr_renamed_7324(new sprwck(arg0).cfr_renamed_1451(), arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7324(sprlxj arg0, PKIXParameters arg1) throws sprglg {
        HashSet hashSet = new HashSet();
        try {
            sprgkg.cfr_renamed_7325(hashSet, arg0, arg1.getCertStores());
            return hashSet;
        }
        catch (sprglg sprglg2) {
            throw new sprglg(sprctl.cfr_renamed_9("K/m2~#g8`wa5z6g9g9iwm8c'b2z2.\u0014\\\u001b}y"), sprglg2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7277(sprlxj arg0, Date arg1, List arg2, List arg3) throws sprglg {
        HashSet hashSet = new HashSet();
        try {
            sprlxj sprlxj2 = arg0;
            sprgkg.cfr_renamed_7325(hashSet, sprlxj2, arg3);
            sprgkg.cfr_renamed_7325(hashSet, sprlxj2, arg2);
        }
        catch (sprglg sprglg2) {
            throw new sprglg(sprixl.cfr_renamed_9("~7X*K;R UoT-O.R!R!\\oX V?W*O*\u001b\fi\u0003Ha"), sprglg2);
        }
        HashSet<X509CRL> hashSet2 = new HashSet<X509CRL>();
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            X509Certificate x509Certificate;
            X509CRL x509CRL = (X509CRL)iterator.next();
            Date date = x509CRL.getNextUpdate();
            if (date != null && !date.after(arg1) || null != (x509Certificate = arg0.cfr_renamed_7326()) && !x509CRL.getThisUpdate().before(x509Certificate.getNotAfter())) continue;
            hashSet2.add(x509CRL);
        }
        return hashSet2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_7325(HashSet arg0, sprlxj arg1, List arg2) throws sprglg {
        sprglg sprglg2 = null;
        boolean bl = false;
        for (Object e : arg2) {
            Object object;
            if (e instanceof sprug) {
                object = (sprug)e;
                try {
                    arg0.addAll(object.cfr_renamed_3216(arg1));
                    bl = true;
                }
                catch (sprine sprine2) {
                    sprglg2 = new sprglg(sprctl.cfr_renamed_9("\u0012v4k'z>a9.$k6|4f>`0.>`wVy;g7wM\u0005Bw}#a%ky"), sprine2);
                }
                continue;
            }
            object = (CertStore)e;
            try {
                arg0.addAll(sprlxj.cfr_renamed_7327(arg1, (CertStore)object));
                bl = true;
            }
            catch (CertStoreException certStoreException) {
                sprglg2 = new sprglg(sprixl.cfr_renamed_9("\nC,^?O&T!\u001b<^.I,S&U(\u001b&Uoca\u000e\u007f\u0002ox\u001dwoH;T=^a"), certStoreException);
            }
        }
        if (!bl && sprglg2 != null) {
            throw sprglg2;
        }
    }
}

