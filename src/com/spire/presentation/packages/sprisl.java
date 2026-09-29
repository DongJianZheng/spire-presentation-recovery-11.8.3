/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprhpg;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprus;
import com.spire.presentation.packages.sprvhm;
import java.security.Provider;
import java.security.cert.CertificateException;

public class sprisl
implements sprus {
    private sprhpg cfr_renamed_4;

    @Override
    public sprhk cfr_renamed_7463(sprvhm arg0) throws sprhjg {
        return this.cfr_renamed_4.cfr_renamed_7463(arg0);
    }

    public sprisl cfr_renamed_1499(String arg0) {
        sprisl sprisl2 = this;
        sprisl2.cfr_renamed_4.cfr_renamed_1499(arg0);
        return sprisl2;
    }

    public sprisl() {
        sprisl sprisl2 = this;
        sprisl2.cfr_renamed_4 = new sprhpg();
    }

    public sprisl cfr_renamed_1498(Provider arg0) {
        sprisl sprisl2 = this;
        sprisl2.cfr_renamed_4.cfr_renamed_1498(arg0);
        return sprisl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprhk cfr_renamed_7464(sprtpl arg0) throws sprhjg {
        try {
            return this.cfr_renamed_4.cfr_renamed_7464(arg0);
        }
        catch (CertificateException certificateException) {
            throw new sprhjg(new StringBuilder().insert(0, sprklg.cfr_renamed_9("GRs^~Y2H}\u001cbN}_wOa\u001cqY`H{Z{_sHw\u00062")).append(certificateException.getMessage()).toString(), certificateException);
        }
    }
}

