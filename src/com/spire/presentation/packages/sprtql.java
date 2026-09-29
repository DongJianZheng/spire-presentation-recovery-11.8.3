/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnl;
import com.spire.presentation.packages.sprbwl;
import com.spire.presentation.packages.sprnbm;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class sprtql
extends sprbnl {
    public sprtql(X509Certificate arg0, Date arg1) {
        this(arg0.getSubjectX500Principal(), arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprtql(X509CRL x509CRL) throws CRLException {
        super(new sprbwl((X509CRL)arg0));
        void arg0;
    }

    public sprtql(X500Principal arg0, Date arg1) {
        super(sprnbm.cfr_renamed_23(arg0.getEncoded()), arg1);
    }
}

