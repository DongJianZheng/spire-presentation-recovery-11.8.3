/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjkg;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprvhm;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprlig
extends sprjkg {
    public sprlig(X500Principal arg0, PublicKey arg1) {
        super(sprnbm.cfr_renamed_23(arg0.getEncoded()), sprvhm.cfr_renamed_23(arg1.getEncoded()));
    }

    public sprlig(sprnbm arg0, PublicKey arg1) {
        super(arg0, sprvhm.cfr_renamed_23(arg1.getEncoded()));
    }
}

