/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkol;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproul;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class spryxl
extends sprkol {
    private static /* synthetic */ sprnbm cfr_renamed_124(X500Principal arg0) {
        if (arg0 == null) {
            return null;
        }
        return sprnbm.cfr_renamed_23(arg0.getEncoded());
    }

    public spryxl(X509Certificate arg0) {
        super(spryxl.cfr_renamed_124(arg0.getIssuerX500Principal()), arg0.getSerialNumber(), sproul.cfr_renamed_4044(arg0));
    }

    public spryxl(X500Principal arg0, BigInteger arg1) {
        super(spryxl.cfr_renamed_124(arg0), arg1);
    }

    public spryxl(X500Principal arg0, BigInteger arg1, byte[] arg2) {
        super(spryxl.cfr_renamed_124(arg0), arg1, arg2);
    }
}

