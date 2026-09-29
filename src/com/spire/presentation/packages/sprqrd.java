/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprlcb;
import com.spire.presentation.packages.sprqf;
import com.spire.presentation.packages.sprqhb;
import com.spire.presentation.packages.sprvab;
import java.security.PrivateKey;
import java.security.Provider;
import javax.crypto.SecretKey;

public class sprqrd
extends spritd
implements sprqf {
    public sprqrd(Provider arg0) {
        super(arg0);
    }

    @Override
    public sprlcb cfr_renamed_4038(sprije arg0, PrivateKey arg1) {
        return new sprlcb(arg0, arg1).cfr_renamed_1498(this.cfr_renamed_4);
    }

    @Override
    public sprqhb cfr_renamed_4039(sprije arg0, SecretKey arg1) {
        return new sprvab(arg0, arg1).cfr_renamed_1498(this.cfr_renamed_4);
    }
}

