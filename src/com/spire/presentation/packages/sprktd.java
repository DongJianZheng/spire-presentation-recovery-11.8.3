/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqyd;
import com.spire.presentation.packages.spruhe;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class sprktd
extends sprqyd {
    public sprktd(X500Principal arg0, Date arg1) {
        super(spruhe.cfr_renamed_23(arg0.getEncoded()), arg1);
    }

    public sprktd(X509Certificate arg0, Date arg1) {
        this(arg0.getSubjectX500Principal(), arg1);
    }
}

