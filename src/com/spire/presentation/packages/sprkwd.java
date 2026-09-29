/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.spridb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprle;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprqhb;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzxd;
import java.security.Key;
import java.security.Provider;
import javax.crypto.SecretKey;

public abstract class sprkwd
implements sprle {
    public sprzxd cfr_renamed_1;
    public sprzxd cfr_renamed_2;
    private SecretKey cfr_renamed_3;
    public boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkwd cfr_renamed_4045(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprzxd(new sprbqd((String)arg0));
        return this;
    }

    public sprkwd(SecretKey secretKey) {
        sprkwd sprkwd2 = this;
        this.cfr_renamed_1 = new sprzxd(new sprypd());
        this.cfr_renamed_2 = this.cfr_renamed_1;
        sprkwd2.cfr_renamed_4 = false;
        sprkwd2.cfr_renamed_3 = secretKey;
    }

    public sprkwd cfr_renamed_4050(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_4047(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        sprqhb sprqhb2 = this.cfr_renamed_1.cfr_renamed_4039(arg0, this.cfr_renamed_3);
        try {
            sprkwd sprkwd2 = this;
            Key key = sprkwd2.cfr_renamed_1.cfr_renamed_4048(arg1.cfr_renamed_593(), sprqhb2.cfr_renamed_1534(arg1, arg2));
            if (sprkwd2.cfr_renamed_4) {
                this.cfr_renamed_1.cfr_renamed_4049(arg1, key);
            }
            return key;
        }
        catch (sprmfb sprmfb2) {
            throw new sprlqd(new StringBuilder().insert(0, spridb.cfr_renamed_9("{_}BnSwHp\u0007kIiU\u007fWnNp@>L{^$\u0007")).append(sprmfb2.getMessage()).toString(), sprmfb2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprkwd cfr_renamed_4051(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new sprzxd(new sprqrd((Provider)arg0));
        return this;
    }

    public sprkwd cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_1 = new sprzxd(new sprqrd(arg0));
        this.cfr_renamed_2 = this.cfr_renamed_1;
        return this;
    }

    public sprkwd cfr_renamed_1499(String arg0) {
        this.cfr_renamed_1 = new sprzxd(new sprbqd(arg0));
        this.cfr_renamed_2 = this.cfr_renamed_1;
        return this;
    }
}

