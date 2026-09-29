/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvl;
import com.spire.presentation.packages.sprgql;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzwl;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprsul
extends sprbvl {
    /*
     * WARNING - void declaration
     */
    public sprsul(X500Principal x500Principal) {
        super(new sprgql((X500Principal)arg0));
        void arg0;
    }

    public sprsul(PublicKey arg0, sprjj arg1) throws sprzwl {
        super(sprvhm.cfr_renamed_23(arg0.getEncoded()), arg1);
    }
}

