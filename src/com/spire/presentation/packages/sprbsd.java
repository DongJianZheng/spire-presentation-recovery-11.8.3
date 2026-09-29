/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdjy;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprncb;
import com.spire.presentation.packages.sprol;
import java.security.Provider;
import java.security.cert.CertificateException;

public class sprbsd
implements sprol {
    private sprncb cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprja cfr_renamed_1560(sprcyd arg0) throws sprfya {
        try {
            return this.cfr_renamed_4.cfr_renamed_1560(arg0);
        }
        catch (CertificateException certificateException) {
            throw new sprfya(new StringBuilder().insert(0, sprdjy.cfr_renamed_9("y3M?@8\f)C}\\/C>I._}O8^)E;E>M)Ig\f")).append(certificateException.getMessage()).toString(), certificateException);
        }
    }

    public sprbsd() {
        sprbsd sprbsd2 = this;
        sprbsd2.cfr_renamed_4 = new sprncb();
    }

    public sprbsd cfr_renamed_1498(Provider arg0) {
        sprbsd sprbsd2 = this;
        sprbsd2.cfr_renamed_4.cfr_renamed_1498(arg0);
        return sprbsd2;
    }

    public sprbsd cfr_renamed_1499(String arg0) {
        sprbsd sprbsd2 = this;
        sprbsd2.cfr_renamed_4.cfr_renamed_1499(arg0);
        return sprbsd2;
    }

    @Override
    public sprja cfr_renamed_1567(sprdce arg0) throws sprfya {
        return this.cfr_renamed_4.cfr_renamed_1567(arg0);
    }
}

