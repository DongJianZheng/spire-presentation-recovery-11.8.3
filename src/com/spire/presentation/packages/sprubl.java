/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdjl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproul;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprubl
extends sprdjl {
    public sprubl(X500Principal arg0, BigInteger arg1, byte[] arg2) {
        super(sprubl.cfr_renamed_124(arg0), arg1, arg2);
    }

    public sprubl(X500Principal arg0, BigInteger arg1) {
        super(sprubl.cfr_renamed_124(arg0), arg1);
    }

    private static /* synthetic */ sprnbm cfr_renamed_124(X500Principal arg0) {
        if (arg0 == null) {
            return null;
        }
        return sprnbm.cfr_renamed_23(arg0.getEncoded());
    }

    public sprubl(X509Certificate arg0) {
        super(sprubl.cfr_renamed_124(arg0.getIssuerX500Principal()), arg0.getSerialNumber(), sproul.cfr_renamed_4044(arg0));
    }
}

