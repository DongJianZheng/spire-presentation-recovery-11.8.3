/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprpp;
import com.spire.presentation.packages.sprppx;
import com.spire.presentation.packages.sprpvl;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprxil;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class sprpql
implements sprpp {
    private sprpvl cfr_renamed_2;
    private Mac cfr_renamed_3;
    private MessageDigest cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpql cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new sprpvl(new sprkhi((Provider)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_3211(byte[] arg0, byte[] arg1) throws sprcsl {
        try {
            sprpql sprpql2 = this;
            sprpql2.cfr_renamed_3.init(new SecretKeySpec(arg0, this.cfr_renamed_3.getAlgorithm()));
            return sprpql2.cfr_renamed_3.doFinal(arg1);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprcsl(new StringBuilder().insert(0, sprppx.cfr_renamed_9("@\u0012O\u001fS\u0001CSO\u001d\u0006\u0000C\u0007S\u0003\u001cS")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    @Override
    public void cfr_renamed_10958(sprddm arg0, sprddm arg1) throws sprcsl {
        sprpql sprpql2 = this;
        sprpql2.cfr_renamed_4 = sprpql2.cfr_renamed_2.cfr_renamed_6520(arg0.cfr_renamed_593());
        sprpql2.cfr_renamed_3 = sprpql2.cfr_renamed_2.cfr_renamed_10743(arg1.cfr_renamed_593());
    }

    public sprpql() {
        sprpql sprpql2 = this;
        sprpql2.cfr_renamed_2 = new sprpvl(new sprrul());
    }

    /*
     * WARNING - void declaration
     */
    public sprpql cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprpvl(new sprxil((String)arg0));
        return this;
    }

    @Override
    public byte[] cfr_renamed_3213(byte[] arg0) {
        return this.cfr_renamed_4.digest(arg0);
    }
}

