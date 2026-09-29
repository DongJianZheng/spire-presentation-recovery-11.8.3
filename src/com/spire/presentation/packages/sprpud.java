/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctd;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.spruhe;
import java.security.PrivateKey;
import javax.security.auth.x500.X500Principal;

public class sprpud
extends sprctd {
    public sprpud(PrivateKey arg0, sprmee arg1) {
        super(sprmke.cfr_renamed_23(arg0.getEncoded()), arg1);
    }

    public sprpud(PrivateKey arg0, spruhe arg1) {
        this(arg0, new sprmee(arg1));
    }

    public sprpud(PrivateKey arg0, X500Principal arg1) {
        this(arg0, spruhe.cfr_renamed_23(arg1.getEncoded()));
    }
}

