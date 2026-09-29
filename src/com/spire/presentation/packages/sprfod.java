/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprltd;
import com.spire.presentation.packages.sprvub;
import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class sprfod
extends sprltd {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_4323(Collection arg0) throws CRLException {
        ArrayList<spreud> arrayList = new ArrayList<spreud>(arg0.size());
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (e instanceof X509CRL) {
                try {
                    arrayList.add(new spreud(((X509CRL)e).getEncoded()));
                }
                catch (IOException iOException) {
                    throw new CRLException(new StringBuilder().insert(0, sprvub.cfr_renamed_9("\b0\u0005?\u0004%K#\u000e0\u000fq\u000e?\b>\u000f8\u00056Qq")).append(iOException.getMessage()).toString());
                }
            }
            arrayList.add((spreud)e);
        }
        return arrayList;
    }

    public sprfod(Collection arg0) throws CRLException {
        super(sprfod.cfr_renamed_4323(arg0));
    }
}

