/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprpxl;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;

public class sprbwl
extends sprpxl {
    public sprbwl(X509CRL arg0) throws CRLException {
        super(sprffm.cfr_renamed_23(arg0.getEncoded()));
    }
}

