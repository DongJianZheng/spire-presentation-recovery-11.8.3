/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprez;
import com.spire.presentation.packages.sprjlg;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprwlp;
import com.spire.presentation.packages.spryhg;
import java.security.Key;
import java.security.Provider;
import javax.crypto.SecretKey;

public abstract class sprjhl
implements sprez {
    public sprdul cfr_renamed_1;
    private SecretKey cfr_renamed_2;
    public sprdul cfr_renamed_3;
    public boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjhl cfr_renamed_4045(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprdul(new sprpfl((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprjhl cfr_renamed_4051(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprdul(new sprdhl((Provider)arg0));
        return this;
    }

    public sprjhl cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_3 = new sprdul(new sprdhl(arg0));
        this.cfr_renamed_1 = this.cfr_renamed_3;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_10706(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprjlg sprjlg2 = this.cfr_renamed_3.cfr_renamed_10696(arg0, this.cfr_renamed_2);
        try {
            sprjhl sprjhl2 = this;
            Key key = sprjhl2.cfr_renamed_3.cfr_renamed_10707(arg1.cfr_renamed_593(), sprjlg2.cfr_renamed_7425(arg1, arg2));
            if (sprjhl2.cfr_renamed_4) {
                this.cfr_renamed_3.cfr_renamed_10708(arg1, key);
            }
            return key;
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprwlp.cfr_renamed_9("\u0011w\u0017j\u0004{\u001d`\u001a/\u0001a\u0003}\u0015\u007f\u0004f\u001ahTd\u0011vN/")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }

    public sprjhl cfr_renamed_4050(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprjhl cfr_renamed_1499(String arg0) {
        this.cfr_renamed_3 = new sprdul(new sprpfl(arg0));
        this.cfr_renamed_1 = this.cfr_renamed_3;
        return this;
    }

    public sprjhl(SecretKey secretKey) {
        sprjhl sprjhl2 = this;
        this.cfr_renamed_3 = new sprdul(new sprjrl());
        this.cfr_renamed_1 = this.cfr_renamed_3;
        sprjhl2.cfr_renamed_4 = false;
        sprjhl2.cfr_renamed_2 = secretKey;
    }
}

