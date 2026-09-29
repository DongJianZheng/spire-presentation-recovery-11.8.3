/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprstl;
import com.spire.presentation.packages.sprvhm;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class sprgnl
extends sprstl {
    public sprgnl cfr_renamed_5000(sprlem arg0, boolean arg1, X509Certificate arg2) throws CertificateEncodingException {
        sprgnl sprgnl2 = this;
        sprgnl2.cfr_renamed_10842(arg0, arg1, new sprowl(arg2));
        return sprgnl2;
    }

    public sprgnl(X509Certificate arg0, BigInteger arg1, Date arg2, Date arg3, sprnbm arg4, PublicKey arg5) {
        this(sprnbm.cfr_renamed_23(arg0.getSubjectX500Principal().getEncoded()), arg1, arg2, arg3, arg4, arg5);
    }

    public sprgnl(sprnbm arg0, BigInteger arg1, Date arg2, Date arg3, sprnbm arg4, sprvhm arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public sprgnl(sprnbm arg0, BigInteger arg1, Date arg2, Date arg3, sprnbm arg4, PublicKey arg5) {
        super(arg0, arg1, arg2, arg3, arg4, sprvhm.cfr_renamed_23(arg5.getEncoded()));
    }

    public sprgnl(X509Certificate arg0, BigInteger arg1, Date arg2, Date arg3, X500Principal arg4, PublicKey arg5) {
        this(arg0.getSubjectX500Principal(), arg1, arg2, arg3, arg4, arg5);
    }

    /*
     * WARNING - void declaration
     */
    public sprgnl(X509Certificate x509Certificate) throws CertificateEncodingException {
        super(new sprowl((X509Certificate)arg0));
        void arg0;
    }

    public sprgnl(sprnbm arg0, BigInteger arg1, sprrcm arg2, sprrcm arg3, sprnbm arg4, PublicKey arg5) {
        super(arg0, arg1, arg2, arg3, arg4, sprvhm.cfr_renamed_23(arg5.getEncoded()));
    }

    public sprgnl(X500Principal arg0, BigInteger arg1, Date arg2, Date arg3, X500Principal arg4, PublicKey arg5) {
        super(sprnbm.cfr_renamed_23(arg0.getEncoded()), arg1, arg2, arg3, sprnbm.cfr_renamed_23(arg4.getEncoded()), sprvhm.cfr_renamed_23(arg5.getEncoded()));
    }
}

