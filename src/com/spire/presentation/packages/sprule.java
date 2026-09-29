/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprile;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprrme;
import com.spire.presentation.packages.sprseea;
import com.spire.presentation.packages.sprywh;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class sprule {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_5062(sprrme arg0, PKIXParameters arg1) throws sprlhi {
        HashSet hashSet = new HashSet();
        try {
            sprule.cfr_renamed_5063(hashSet, arg0, arg1.getCertStores());
            return hashSet;
        }
        catch (sprlhi sprlhi2) {
            throw new sprlhi(sprywh.cfr_renamed_9("\u0002b$\u007f7n.u):(x3{.t.t :$u*j+\u007f3\u007fgY\u0015V44"), sprlhi2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_5063(HashSet arg0, sprrme arg1, List arg2) throws sprlhi {
        sprlhi sprlhi2 = null;
        boolean bl = false;
        for (Object e : arg2) {
            Object object;
            if (e instanceof sprile) {
                object = (sprile)e;
                try {
                    arg0.addAll(((sprile)object).cfr_renamed_3216((sprhd)arg1));
                    bl = true;
                }
                catch (sprine sprine2) {
                    sprlhi2 = new sprlhi(sprseea.cfr_renamed_9("6\u0014\u0010\t\u0003\u0018\u001a\u0003\u001dL\u0000\t\u0012\u001e\u0010\u0004\u001a\u0002\u0014L\u001a\u0002S4]YCUS/! S\u001f\u0007\u0003\u0001\t]"), sprine2);
                }
                continue;
            }
            object = (CertStore)e;
            try {
                arg0.addAll(((CertStore)object).getCRLs(arg1));
                bl = true;
            }
            catch (CertStoreException certStoreException) {
                sprlhi2 = new sprlhi(sprywh.cfr_renamed_9("_?y\"j3s(tgi\"{5y/s)}gs):\u001f4r*~:\u0004H\u000b:4n(h\"4"), certStoreException);
            }
        }
        if (!bl && sprlhi2 != null) {
            throw sprlhi2;
        }
    }
}

