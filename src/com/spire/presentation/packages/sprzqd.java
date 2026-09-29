/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprntd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprzqd
extends sprntd {
    private static /* synthetic */ spruhe cfr_renamed_124(X500Principal arg0) {
        if (arg0 == null) {
            return null;
        }
        return spruhe.cfr_renamed_23(arg0.getEncoded());
    }

    private static /* synthetic */ byte[] cfr_renamed_4044(X509Certificate arg0) {
        byte[] byArray = arg0.getExtensionValue(sprtie.cfr_renamed_93.cfr_renamed_19());
        if (byArray != null) {
            return sprxue.cfr_renamed_23(sprxue.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_186();
        }
        return null;
    }

    public sprzqd(X500Principal arg0, BigInteger arg1) {
        super(sprzqd.cfr_renamed_124(arg0), arg1);
    }

    public sprzqd(X500Principal arg0, BigInteger arg1, byte[] arg2) {
        super(sprzqd.cfr_renamed_124(arg0), arg1, arg2);
    }

    public sprzqd(X509Certificate arg0) {
        super(sprzqd.cfr_renamed_124(arg0.getIssuerX500Principal()), arg0.getSerialNumber(), sprzqd.cfr_renamed_4044(arg0));
    }
}

