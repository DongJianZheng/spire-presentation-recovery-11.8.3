/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewi;
import com.spire.presentation.packages.sprke;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprmuh;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprwzj;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;

public class sprkyh
implements sprke {
    private final sprrr cfr_renamed_2;
    private Date cfr_renamed_3;
    private sprwzj cfr_renamed_4;

    public void cfr_renamed_9102(boolean arg0) throws CertPathValidatorException {
        if (arg0) {
            throw new CertPathValidatorException(sprewi.cfr_renamed_9("|2h*{/~}y5\u007f>q4t::3u):.o-j2h)\u007f9"));
        }
        sprkyh sprkyh2 = this;
        sprkyh2.cfr_renamed_4 = null;
        sprkyh sprkyh3 = this;
        sprkyh2.cfr_renamed_3 = new Date();
    }

    public sprkyh(sprrr sprrr2) {
        sprkyh sprkyh2 = this;
        sprkyh2.cfr_renamed_3 = null;
        sprkyh2.cfr_renamed_2 = sprrr2;
    }

    @Override
    public void cfr_renamed_9066(sprwzj sprwzj2) {
        this.cfr_renamed_4 = sprwzj2;
        sprkyh sprkyh2 = this;
        sprkyh2.cfr_renamed_3 = new Date();
    }

    @Override
    public void cfr_renamed_1262(String arg0, Object arg1) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void check(Certificate arg0) throws CertPathValidatorException {
        try {
            sprkyh sprkyh2 = this;
            sprkyh sprkyh3 = this;
            sprmuh.cfr_renamed_9100(sprkyh2.cfr_renamed_4, sprkyh2.cfr_renamed_4.cfr_renamed_9115(), sprkyh3.cfr_renamed_3, sprkyh3.cfr_renamed_4.cfr_renamed_9110(), (X509Certificate)arg0, this.cfr_renamed_4.cfr_renamed_9113(), this.cfr_renamed_4.cfr_renamed_9116(), this.cfr_renamed_4.cfr_renamed_315().getCertificates(), this.cfr_renamed_2);
            return;
        }
        catch (sprlhi sprlhi2) {
            Throwable throwable = sprlhi2;
            if (null != sprlhi2.getCause()) {
                throwable = sprlhi2.getCause();
            }
            throw new CertPathValidatorException(sprlhi2.getMessage(), throwable, this.cfr_renamed_4.cfr_renamed_315(), this.cfr_renamed_4.cfr_renamed_320());
        }
    }
}

