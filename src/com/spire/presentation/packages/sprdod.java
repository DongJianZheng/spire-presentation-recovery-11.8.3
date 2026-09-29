/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprkgka;
import com.spire.presentation.packages.sprltd;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class sprdod
extends sprltd {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_4326(Collection arg0) throws CertificateEncodingException {
        ArrayList<sprcyd> arrayList = new ArrayList<sprcyd>(arg0.size());
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (e instanceof X509Certificate) {
                X509Certificate x509Certificate = (X509Certificate)e;
                try {
                    arrayList.add(new sprcyd(x509Certificate.getEncoded()));
                }
                catch (IOException iOException) {
                    throw new CertificateEncodingException(new StringBuilder().insert(0, sprkgka.cfr_renamed_9("\u0000\u001c\u0014\u0010\u0019\u0017U\u0006\u001aR\u0007\u0017\u0014\u0016U\u0017\u001b\u0011\u001a\u0016\u001c\u001c\u0012HU")).append(iOException.getMessage()).toString());
                }
            }
            arrayList.add((sprcyd)e);
        }
        return arrayList;
    }

    public sprdod(Collection arg0) throws CertificateEncodingException {
        super(sprdod.cfr_renamed_4326(arg0));
    }
}

