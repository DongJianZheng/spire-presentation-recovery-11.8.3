/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprwpd;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprkxd
extends sprwpd {
    public sprkxd cfr_renamed_4346(X500Principal arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4347(new sprmee(spruhe.cfr_renamed_23(arg0.getEncoded())));
        }
        return this;
    }

    public sprkxd cfr_renamed_4348(X500Principal arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4216(spruhe.cfr_renamed_23(arg0.getEncoded()));
        }
        return this;
    }

    public sprkxd cfr_renamed_4349(X500Principal arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4217(spruhe.cfr_renamed_23(arg0.getEncoded()));
        }
        return this;
    }

    public sprkxd(BigInteger arg0) {
        super(arg0);
    }

    public sprkxd cfr_renamed_21(PublicKey arg0) {
        sprkxd sprkxd2 = this;
        sprkxd2.cfr_renamed_4350(sprdce.cfr_renamed_23(arg0.getEncoded()));
        return sprkxd2;
    }
}

