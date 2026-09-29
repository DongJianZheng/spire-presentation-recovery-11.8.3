/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfyha;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtul;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class sprtol
extends sprtul {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_4326(Collection arg0) throws CertificateEncodingException {
        ArrayList<sprtpl> arrayList = new ArrayList<sprtpl>(arg0.size());
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (e instanceof X509Certificate) {
                X509Certificate x509Certificate = (X509Certificate)e;
                try {
                    arrayList.add(new sprtpl(x509Certificate.getEncoded()));
                }
                catch (IOException iOException) {
                    throw new CertificateEncodingException(new StringBuilder().insert(0, sprfyha.cfr_renamed_9("}\u0005i\td\u000e(\u001fgKz\u000ei\u000f(\u000ef\bg\u000fa\u0005oQ(")).append(iOException.getMessage()).toString());
                }
            }
            arrayList.add((sprtpl)e);
        }
        return arrayList;
    }

    public sprtol(Collection arg0) throws CertificateEncodingException {
        super(sprtol.cfr_renamed_4326(arg0));
    }
}

