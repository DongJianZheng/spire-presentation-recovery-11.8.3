/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlcb;
import com.spire.presentation.packages.sprqf;
import com.spire.presentation.packages.sprqhb;
import com.spire.presentation.packages.sprvab;
import java.security.PrivateKey;
import javax.crypto.SecretKey;

public class sprypd
extends sprkvd
implements sprqf {
    @Override
    public sprlcb cfr_renamed_4038(sprije arg0, PrivateKey arg1) {
        return new sprlcb(arg0, arg1);
    }

    @Override
    public sprqhb cfr_renamed_4039(sprije arg0, SecretKey arg1) {
        return new sprvab(arg0, arg1);
    }
}

