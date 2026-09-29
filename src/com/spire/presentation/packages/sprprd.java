/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.spreyd;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprkzd;
import com.spire.presentation.packages.sprn;
import com.spire.presentation.packages.sprqa;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprprd {
    private sprkzd cfr_renamed_4;

    public sprprd cfr_renamed_3979(sprn arg0) {
        sprprd sprprd2 = this;
        sprprd2.cfr_renamed_4.cfr_renamed_3979(arg0);
        return sprprd2;
    }

    public sprbod cfr_renamed_4083(sprqa arg0, X509Certificate arg1) throws sprfya, CertificateEncodingException {
        return this.cfr_renamed_3981(arg0, new spreyd(arg1));
    }

    public sprprd cfr_renamed_3977(boolean arg0) {
        sprprd sprprd2 = this;
        sprprd2.cfr_renamed_4.cfr_renamed_3977(arg0);
        return sprprd2;
    }

    public sprprd cfr_renamed_3980(sprn arg0) {
        sprprd sprprd2 = this;
        sprprd2.cfr_renamed_4.cfr_renamed_3980(arg0);
        return sprprd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprprd(spraa spraa2) {
        void arg0;
        sprprd sprprd2 = this;
        sprprd2.cfr_renamed_4 = new sprkzd((spraa)arg0);
    }

    public sprbod cfr_renamed_3981(sprqa arg0, sprcyd arg1) throws sprfya {
        return this.cfr_renamed_4.cfr_renamed_3981(arg0, arg1);
    }

    public sprbod cfr_renamed_3983(sprqa arg0, byte[] arg1) throws sprfya {
        return this.cfr_renamed_4.cfr_renamed_3983(arg0, arg1);
    }
}

