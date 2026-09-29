/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgwd;
import com.spire.presentation.packages.spruhe;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprevd
extends sprgwd {
    public sprevd(X500Principal arg0, BigInteger arg1) {
        super(spruhe.cfr_renamed_23(arg0.getEncoded()), arg1);
    }

    public sprevd(X509Certificate arg0) {
        this(arg0.getIssuerX500Principal(), arg0.getSerialNumber());
    }
}

