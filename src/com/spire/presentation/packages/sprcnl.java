/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjnl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprvhm;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class sprcnl
extends sprjnl {
    public sprcnl(X500Principal arg0, BigInteger arg1, Date arg2, Date arg3, X500Principal arg4, PublicKey arg5) {
        super(sprnbm.cfr_renamed_23(arg0.getEncoded()), arg1, arg2, arg3, sprnbm.cfr_renamed_23(arg4.getEncoded()), sprvhm.cfr_renamed_23(arg5.getEncoded()));
    }

    public sprcnl(sprnbm arg0, BigInteger arg1, Date arg2, Date arg3, sprnbm arg4, PublicKey arg5) {
        super(arg0, arg1, arg2, arg3, arg4, sprvhm.cfr_renamed_23(arg5.getEncoded()));
    }
}

