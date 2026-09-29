/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprywd;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class sprkud
extends sprywd {
    public sprkud(spruhe arg0, BigInteger arg1, Date arg2, Date arg3, spruhe arg4, PublicKey arg5) {
        super(arg0, arg1, arg2, arg3, arg4, sprdce.cfr_renamed_23(arg5.getEncoded()));
    }

    public sprkud(X500Principal arg0, BigInteger arg1, Date arg2, Date arg3, X500Principal arg4, PublicKey arg5) {
        super(spruhe.cfr_renamed_23(arg0.getEncoded()), arg1, arg2, arg3, spruhe.cfr_renamed_23(arg4.getEncoded()), sprdce.cfr_renamed_23(arg5.getEncoded()));
    }
}

