/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprtw;
import com.spire.presentation.packages.spruu;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprooh {
    public static sprnbm cfr_renamed_9099(X509Certificate arg0) {
        if (arg0 instanceof sprtw) {
            return sprooh.cfr_renamed_9117(((sprtw)((Object)arg0)).cfr_renamed_9118());
        }
        return sprooh.cfr_renamed_7314(sprooh.cfr_renamed_9119(arg0).getIssuerX500Principal());
    }

    private static /* synthetic */ X509CRL cfr_renamed_9120(X509CRL arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }

    private static /* synthetic */ byte[] cfr_renamed_9121(byte[] arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }

    public static sprnbm cfr_renamed_282(X509Certificate arg0) {
        if (arg0 instanceof sprtw) {
            return sprooh.cfr_renamed_9117(((sprtw)((Object)arg0)).cfr_renamed_9122());
        }
        return sprooh.cfr_renamed_7314(sprooh.cfr_renamed_9119(arg0).getSubjectX500Principal());
    }

    public static sprnbm cfr_renamed_9123(spruu arg0, X500Principal arg1) {
        return sprooh.cfr_renamed_9117(sprnbm.cfr_renamed_9063(arg0, sprooh.cfr_renamed_9121(sprooh.cfr_renamed_9124(arg1).getEncoded())));
    }

    public static sprnbm cfr_renamed_302(Object arg0) {
        if (arg0 instanceof X509Certificate) {
            return sprooh.cfr_renamed_9099((X509Certificate)arg0);
        }
        return sprooh.cfr_renamed_7314((X500Principal)((sprbd)arg0).cfr_renamed_102().cfr_renamed_271()[0]);
    }

    private static /* synthetic */ TrustAnchor cfr_renamed_9125(TrustAnchor arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }

    private static /* synthetic */ X509Certificate cfr_renamed_9119(X509Certificate arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }

    public static sprnbm cfr_renamed_305(X509CRL arg0) {
        return sprooh.cfr_renamed_7314(sprooh.cfr_renamed_9120(arg0).getIssuerX500Principal());
    }

    public static sprnbm cfr_renamed_7314(X500Principal arg0) {
        return sprooh.cfr_renamed_9117(sprnbm.cfr_renamed_23(sprooh.cfr_renamed_9121(sprooh.cfr_renamed_9124(arg0).getEncoded())));
    }

    private static /* synthetic */ X500Principal cfr_renamed_9124(X500Principal arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }

    public static sprnbm cfr_renamed_9126(TrustAnchor arg0) {
        return sprooh.cfr_renamed_7314(sprooh.cfr_renamed_9125(arg0).getCA());
    }

    private static /* synthetic */ sprnbm cfr_renamed_9117(sprnbm arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }
}

