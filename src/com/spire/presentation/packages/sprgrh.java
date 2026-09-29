/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sprkhb;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprlxj;
import com.spire.presentation.packages.sprug;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class sprgrh {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_7325(HashSet arg0, sprlxj arg1, List arg2) throws sprlhi {
        sprlhi sprlhi2 = null;
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
                    sprlhi2 = new sprlhi(sprkhb.cfr_renamed_9("!f\u0007{\u0014j\rq\n>\u0017{\u0005l\u0007v\rp\u0003>\rpDFJ+T'D]6RDm\u0010q\u0016{J"), sprine2);
                }
                continue;
            }
            object = (CertStore)e;
            try {
                arg0.addAll(sprlxj.cfr_renamed_7327(arg1, (CertStore)object));
                bl = true;
            }
            catch (CertStoreException certStoreException) {
                sprlhi2 = new sprlhi(sprjyk.cfr_renamed_9("k8M%^4G/@`]%O2M(G.I`G.\u000e\u0018\u0000u\u001ey\u000e\u0003|\f\u000e3Z/\\%\u0000"), certStoreException);
            }
        }
        if (!bl && sprlhi2 != null) {
            throw sprlhi2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7277(sprlxj arg0, Date arg1, List arg2, List arg3) throws sprlhi {
        HashSet hashSet = new HashSet();
        try {
            sprlxj sprlxj2 = arg0;
            sprgrh.cfr_renamed_7325(hashSet, sprlxj2, arg3);
            sprgrh.cfr_renamed_7325(hashSet, sprlxj2, arg2);
        }
        catch (sprlhi sprlhi2) {
            throw new sprlhi(sprkhb.cfr_renamed_9("[\u001c}\u0001n\u0010w\u000bpDq\u0006j\u0005w\nw\nyD}\u000bs\u0014r\u0001j\u0001>'L(mJ"), sprlhi2);
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
}

