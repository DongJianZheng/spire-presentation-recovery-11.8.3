/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhwl;
import com.spire.presentation.packages.sprnbm;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprcvl
extends sprhwl {
    public sprcvl(X509Certificate arg0) {
        this(arg0.getIssuerX500Principal());
    }

    public sprcvl(X500Principal arg0) {
        super(sprnbm.cfr_renamed_23(arg0.getEncoded()));
    }
}

