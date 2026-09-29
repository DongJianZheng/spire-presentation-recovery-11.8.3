/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprqnl;
import java.security.PrivateKey;
import javax.security.auth.x500.X500Principal;

public class sprlol
extends sprqnl {
    public sprlol(PrivateKey arg0, sprnbm arg1) {
        this(arg0, new sprigm(arg1));
    }

    public sprlol(PrivateKey arg0, X500Principal arg1) {
        this(arg0, sprnbm.cfr_renamed_23(arg1.getEncoded()));
    }

    public sprlol(PrivateKey arg0, sprigm arg1) {
        super(sprcom.cfr_renamed_23(arg0.getEncoded()), arg1);
    }
}

