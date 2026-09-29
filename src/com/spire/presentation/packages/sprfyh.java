/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprke;
import com.spire.presentation.packages.sprwzj;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

public class sprfyh
implements sprke {
    private final PKIXCertPathChecker cfr_renamed_4;

    public sprfyh(PKIXCertPathChecker pKIXCertPathChecker) {
        this.cfr_renamed_4 = pKIXCertPathChecker;
    }

    @Override
    public void cfr_renamed_9066(sprwzj arg0) throws CertPathValidatorException {
        this.cfr_renamed_4.init(false);
    }

    @Override
    public void cfr_renamed_1262(String arg0, Object arg1) {
    }

    @Override
    public void check(Certificate arg0) throws CertPathValidatorException {
        this.cfr_renamed_4.check(arg0, null);
    }
}

