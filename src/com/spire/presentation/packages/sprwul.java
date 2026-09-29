/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprvaea;
import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class sprwul
extends sprtul {
    public sprwul(Collection arg0) throws CRLException {
        super(sprwul.cfr_renamed_4323(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_4323(Collection arg0) throws CRLException {
        ArrayList<sprpxl> arrayList = new ArrayList<sprpxl>(arg0.size());
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (e instanceof X509CRL) {
                try {
                    arrayList.add(new sprpxl(((X509CRL)e).getEncoded()));
                }
                catch (IOException iOException) {
                    throw new CRLException(new StringBuilder().insert(0, sprvaea.cfr_renamed_9("6\u007f;p:jul0\u007f1>0p6q1w;yo>")).append(iOException.getMessage()).toString());
                }
            }
            arrayList.add((sprpxl)e);
        }
        return arrayList;
    }
}

