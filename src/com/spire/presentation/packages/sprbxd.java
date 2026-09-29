/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spryyd;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprbxd
extends spryyd {
    public sprbxd(PublicKey arg0, sprpa arg1) throws sprbud {
        super(sprdce.cfr_renamed_23(arg0.getEncoded()), arg1);
    }

    public sprbxd(X500Principal arg0) {
        super(spruhe.cfr_renamed_23(arg0.getEncoded()));
    }
}

