/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprgfb;
import com.spire.presentation.packages.spruhe;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class spriab
extends sprgfb {
    public spriab(X500Principal arg0, PublicKey arg1) {
        super(spruhe.cfr_renamed_23(arg0.getEncoded()), sprdce.cfr_renamed_23(arg1.getEncoded()));
    }

    public spriab(spruhe arg0, PublicKey arg1) {
        super(arg0, sprdce.cfr_renamed_23(arg1.getEncoded()));
    }
}

