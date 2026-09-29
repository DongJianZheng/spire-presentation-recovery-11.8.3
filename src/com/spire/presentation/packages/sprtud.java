/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkk;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprppba;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprsud;
import com.spire.presentation.packages.sprzod;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class sprtud
implements sprkk {
    private sprsud cfr_renamed_2;
    private MessageDigest cfr_renamed_3;
    private Mac cfr_renamed_4;

    @Override
    public void cfr_renamed_3247(sprije arg0, sprije arg1) throws sprzod {
        sprtud sprtud2 = this;
        sprtud2.cfr_renamed_3 = sprtud2.cfr_renamed_2.cfr_renamed_4344(arg0.cfr_renamed_593());
        sprtud2.cfr_renamed_4 = sprtud2.cfr_renamed_2.cfr_renamed_4086(arg1.cfr_renamed_593());
    }

    /*
     * WARNING - void declaration
     */
    public sprtud cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new sprsud(new spritd((Provider)arg0));
        return this;
    }

    public sprtud() {
        sprtud sprtud2 = this;
        sprtud2.cfr_renamed_2 = new sprsud(new sprkvd());
    }

    /*
     * WARNING - void declaration
     */
    public sprtud cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprsud(new sprrwd((String)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_3211(byte[] arg0, byte[] arg1) throws sprzod {
        try {
            sprtud sprtud2 = this;
            sprtud2.cfr_renamed_4.init(new SecretKeySpec(arg0, this.cfr_renamed_4.getAlgorithm()));
            return sprtud2.cfr_renamed_4.doFinal(arg1);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprzod(new StringBuilder().insert(0, sprppba.cfr_renamed_9("&u)x5f%4)z`g%`5dz4")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    @Override
    public byte[] cfr_renamed_3213(byte[] arg0) {
        return this.cfr_renamed_3.digest(arg0);
    }
}

