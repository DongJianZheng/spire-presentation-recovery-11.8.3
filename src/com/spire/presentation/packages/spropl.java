/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajg;
import com.spire.presentation.packages.sprax;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spretz;
import com.spire.presentation.packages.sprfj;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmyl;
import com.spire.presentation.packages.sprpvl;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryhg;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class spropl
implements sprax {
    private PrivateKey cfr_renamed_1;
    private Provider cfr_renamed_2;
    private sprpvl cfr_renamed_3;
    private String cfr_renamed_4;

    @Override
    public sprfj cfr_renamed_10951(sprddm arg0, sprddm arg1, byte[] arg2) throws sprcsl {
        spropl spropl2 = this;
        Key key = spropl2.cfr_renamed_10706(arg0, arg1, arg2);
        Cipher cipher = spropl2.cfr_renamed_3.cfr_renamed_10701(key, arg1);
        return new sprmyl(this, arg1, cipher);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Key cfr_renamed_10706(sprddm arg0, sprddm arg1, byte[] arg2) throws sprcsl {
        try {
            sprajg sprajg2 = new sprajg(arg0, this.cfr_renamed_1);
            if (this.cfr_renamed_2 != null) {
                sprajg2.cfr_renamed_1498(this.cfr_renamed_2);
            }
            if (this.cfr_renamed_4 != null) {
                sprajg2.cfr_renamed_1499(this.cfr_renamed_4);
            }
            return new SecretKeySpec((byte[])sprajg2.cfr_renamed_7425(arg1, arg2).cfr_renamed_1536(), arg1.cfr_renamed_593().cfr_renamed_19());
        }
        catch (spryhg spryhg2) {
            throw new sprcsl(new StringBuilder().insert(0, spretz.cfr_renamed_9("%K7\u000e'@8O\"G*\u000e'@nC+]=O)Kt\u000e")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public spropl cfr_renamed_1498(Provider provider) {
        void arg0;
        spropl spropl2 = this;
        spropl2.cfr_renamed_3 = new sprpvl(new sprkhi((Provider)arg0));
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_4 = null;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spropl cfr_renamed_1499(String string) {
        void arg0;
        spropl spropl2 = this;
        spropl2.cfr_renamed_3 = new sprpvl(new sprxil((String)arg0));
        this.cfr_renamed_2 = null;
        this.cfr_renamed_4 = string;
        return this;
    }

    public spropl(PrivateKey privateKey) {
        spropl spropl2 = this;
        spropl spropl3 = this;
        this.cfr_renamed_3 = new sprpvl(new sprrul());
        this.cfr_renamed_2 = null;
        spropl2.cfr_renamed_4 = null;
        spropl2.cfr_renamed_1 = privateKey;
    }
}

