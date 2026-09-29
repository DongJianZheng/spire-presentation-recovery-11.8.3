/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreyd;
import com.spire.presentation.packages.sprryd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class spryrd
extends sprryd {
    public spryrd(X509Certificate arg0, BigInteger arg1, Date arg2, Date arg3, spruhe arg4, PublicKey arg5) {
        this(spruhe.cfr_renamed_23(arg0.getSubjectX500Principal().getEncoded()), arg1, arg2, arg3, arg4, arg5);
    }

    public spryrd(X500Principal arg0, BigInteger arg1, Date arg2, Date arg3, X500Principal arg4, PublicKey arg5) {
        super(spruhe.cfr_renamed_23(arg0.getEncoded()), arg1, arg2, arg3, spruhe.cfr_renamed_23(arg4.getEncoded()), sprdce.cfr_renamed_23(arg5.getEncoded()));
    }

    public spryrd cfr_renamed_34(sprtzd arg0, boolean arg1, X509Certificate arg2) throws CertificateEncodingException {
        spryrd spryrd2 = this;
        spryrd2.cfr_renamed_4218(arg0, arg1, new spreyd(arg2));
        return spryrd2;
    }

    public spryrd(spruhe arg0, BigInteger arg1, spruzd arg2, spruzd arg3, spruhe arg4, PublicKey arg5) {
        super(arg0, arg1, arg2, arg3, arg4, sprdce.cfr_renamed_23(arg5.getEncoded()));
    }

    public spryrd(spruhe arg0, BigInteger arg1, Date arg2, Date arg3, spruhe arg4, PublicKey arg5) {
        super(arg0, arg1, arg2, arg3, arg4, sprdce.cfr_renamed_23(arg5.getEncoded()));
    }

    public spryrd(X509Certificate arg0, BigInteger arg1, Date arg2, Date arg3, X500Principal arg4, PublicKey arg5) {
        this(arg0.getSubjectX500Principal(), arg1, arg2, arg3, arg4, arg5);
    }
}

