/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprsrd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprwrd;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprmqd
extends sprsrd {
    public sprmqd(X509Certificate arg0) {
        super(sprmqd.cfr_renamed_124(arg0.getIssuerX500Principal()), arg0.getSerialNumber(), sprwrd.cfr_renamed_4044(arg0));
    }

    public sprmqd(X500Principal arg0, BigInteger arg1) {
        super(sprmqd.cfr_renamed_124(arg0), arg1);
    }

    public sprmqd(X500Principal arg0, BigInteger arg1, byte[] arg2) {
        super(sprmqd.cfr_renamed_124(arg0), arg1, arg2);
    }

    private static /* synthetic */ spruhe cfr_renamed_124(X500Principal arg0) {
        if (arg0 == null) {
            return null;
        }
        return spruhe.cfr_renamed_23(arg0.getEncoded());
    }
}

