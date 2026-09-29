/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmhl;
import com.spire.presentation.packages.sprnbm;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class spruel
extends sprmhl {
    public spruel(X509Certificate arg0) {
        this(arg0.getIssuerX500Principal(), arg0.getSerialNumber());
    }

    public spruel(X500Principal arg0, BigInteger arg1) {
        super(sprnbm.cfr_renamed_23(arg0.getEncoded()), arg1);
    }
}

