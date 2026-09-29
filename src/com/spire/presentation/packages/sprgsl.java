/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvsl;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprgsl
extends sprvsl {
    public sprgsl cfr_renamed_4348(X500Principal arg0) {
        if (arg0 != null) {
            this.cfr_renamed_10846(sprnbm.cfr_renamed_23(arg0.getEncoded()));
        }
        return this;
    }

    public sprgsl(BigInteger arg0) {
        super(arg0);
    }

    public sprgsl cfr_renamed_4346(X500Principal arg0) {
        if (arg0 != null) {
            this.cfr_renamed_10964(new sprigm(sprnbm.cfr_renamed_23(arg0.getEncoded())));
        }
        return this;
    }

    public sprgsl cfr_renamed_21(PublicKey arg0) {
        sprgsl sprgsl2 = this;
        sprgsl2.cfr_renamed_10965(sprvhm.cfr_renamed_23(arg0.getEncoded()));
        return sprgsl2;
    }

    public sprgsl cfr_renamed_4349(X500Principal arg0) {
        if (arg0 != null) {
            this.cfr_renamed_10847(sprnbm.cfr_renamed_23(arg0.getEncoded()));
        }
        return this;
    }
}

