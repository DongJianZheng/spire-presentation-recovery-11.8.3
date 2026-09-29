/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpvd;
import java.security.PublicKey;

public class spretd
extends sprpvd {
    public spretd(PublicKey arg0, sprpa arg1) throws sprbud {
        super(sprdce.cfr_renamed_23(arg0.getEncoded()), arg1);
    }
}

