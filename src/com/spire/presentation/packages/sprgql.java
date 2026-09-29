/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprool;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzwl;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprgql
extends sprool {
    public sprgql(PublicKey arg0, sprjj arg1) throws sprzwl {
        super(sprvhm.cfr_renamed_23(arg0.getEncoded()), arg1);
    }

    public sprgql(X500Principal arg0) {
        super(sprnbm.cfr_renamed_23(arg0.getEncoded()));
    }
}

