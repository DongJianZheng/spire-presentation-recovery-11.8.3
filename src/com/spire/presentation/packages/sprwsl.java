/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrdm;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprwsl
extends sprcyl {
    private static /* synthetic */ sprnbm cfr_renamed_124(X500Principal arg0) {
        if (arg0 == null) {
            return null;
        }
        return sprnbm.cfr_renamed_23(arg0.getEncoded());
    }

    public sprwsl(X509Certificate arg0) {
        super(sprwsl.cfr_renamed_124(arg0.getIssuerX500Principal()), arg0.getSerialNumber(), sprwsl.cfr_renamed_4044(arg0));
    }

    private static /* synthetic */ byte[] cfr_renamed_4044(X509Certificate arg0) {
        byte[] byArray = arg0.getExtensionValue(sprrdm.cfr_renamed_126.cfr_renamed_19());
        if (byArray != null) {
            return sproug.cfr_renamed_23(sproug.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_186();
        }
        return null;
    }

    public sprwsl(X500Principal arg0, BigInteger arg1, byte[] arg2) {
        super(sprwsl.cfr_renamed_124(arg0), arg1, arg2);
    }

    public sprwsl(X500Principal arg0, BigInteger arg1) {
        super(sprwsl.cfr_renamed_124(arg0), arg1);
    }
}

