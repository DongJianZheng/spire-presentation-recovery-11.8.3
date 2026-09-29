/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmsd;
import com.spire.presentation.packages.spruhe;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sproxd
extends sprmsd {
    public sproxd(X500Principal arg0) {
        super(spruhe.cfr_renamed_23(arg0.getEncoded()));
    }

    public sproxd(X509Certificate arg0) {
        this(arg0.getIssuerX500Principal());
    }
}

