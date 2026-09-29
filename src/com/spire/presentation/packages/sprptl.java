/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprevl;
import com.spire.presentation.packages.sprfnl;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhmg;
import com.spire.presentation.packages.sprjtl;
import com.spire.presentation.packages.sprsvl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvul;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class sprptl {
    private sprjtl cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprptl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprfnl((Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprptl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprvul((String)arg0);
        return this;
    }

    public sprsvl cfr_renamed_1559(PublicKey arg0) throws sprhjg {
        return new sprsvl(new sprevl(), new sprhmg(), this.cfr_renamed_4.cfr_renamed_4075(arg0), this.cfr_renamed_4.cfr_renamed_4073());
    }

    public sprptl() {
        sprptl sprptl2 = this;
        sprptl2.cfr_renamed_4 = new sprjtl(null);
    }

    public sprsvl cfr_renamed_7464(sprtpl arg0) throws sprhjg, CertificateException {
        return new sprsvl(new sprevl(), new sprhmg(), this.cfr_renamed_4.cfr_renamed_10737(arg0), this.cfr_renamed_4.cfr_renamed_4073());
    }

    public sprsvl cfr_renamed_1561(X509Certificate arg0) throws sprhjg {
        return new sprsvl(new sprevl(), new sprhmg(), this.cfr_renamed_4.cfr_renamed_4074(arg0), this.cfr_renamed_4.cfr_renamed_4073());
    }
}

