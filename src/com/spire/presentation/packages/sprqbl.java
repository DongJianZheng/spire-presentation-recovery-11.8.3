/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprknp;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sproy;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprujl;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprytm;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

public abstract class sprqbl
implements sproy {
    private PrivateKey cfr_renamed_91;
    public boolean cfr_renamed_0;
    public sprdul cfr_renamed_1;
    public sprdul cfr_renamed_2;
    public Map cfr_renamed_3;
    public boolean cfr_renamed_4;

    public sprqbl cfr_renamed_7451(sprlem arg0, String arg1) {
        sprqbl sprqbl2 = this;
        sprqbl2.cfr_renamed_3.put(arg0, arg1);
        return sprqbl2;
    }

    public sprqbl cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_1 = new sprdul(new sprdhl(arg0));
        this.cfr_renamed_2 = this.cfr_renamed_1;
        return this;
    }

    public sprqbl(PrivateKey privateKey) {
        sprqbl sprqbl2 = this;
        this.cfr_renamed_1 = new sprdul(new sprjrl());
        this.cfr_renamed_2 = this.cfr_renamed_1;
        this.cfr_renamed_3 = new HashMap();
        sprqbl2.cfr_renamed_0 = false;
        sprqbl2.cfr_renamed_91 = sproul.cfr_renamed_10695(privateKey);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_10706(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        Object object;
        sprytm sprytm2 = sprytm.cfr_renamed_23(arg0.cfr_renamed_284());
        sprujl sprujl2 = (sprujl)this.cfr_renamed_1.cfr_renamed_10693(arg0, this.cfr_renamed_91);
        if (!this.cfr_renamed_3.isEmpty()) {
            Object object2 = object = this.cfr_renamed_3.keySet().iterator();
            while (object2.hasNext()) {
                sprlem sprlem2;
                sprlem sprlem3 = sprlem2 = (sprlem)object.next();
                sprujl2.cfr_renamed_7451(sprlem3, (String)this.cfr_renamed_3.get(sprlem3));
                object2 = object;
            }
        }
        try {
            sprqbl sprqbl2 = this;
            object = sprqbl2.cfr_renamed_1.cfr_renamed_10707(arg1.cfr_renamed_593(), sprujl2.cfr_renamed_7425(arg1, arg2));
            if (sprqbl2.cfr_renamed_0) {
                this.cfr_renamed_1.cfr_renamed_10708(arg1, (Key)object);
            }
            return object;
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprknp.cfr_renamed_9("AlGqT`M{J4QzSfEdT}Js\u0004\u007fAm\u001e4")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }

    public sprqbl cfr_renamed_1499(String arg0) {
        this.cfr_renamed_1 = new sprdul(new sprpfl(arg0));
        this.cfr_renamed_2 = this.cfr_renamed_1;
        return this;
    }

    public sprqbl cfr_renamed_4045(String arg0) {
        this.cfr_renamed_2 = sproul.cfr_renamed_4046(arg0);
        return this;
    }

    public sprqbl cfr_renamed_4051(Provider arg0) {
        this.cfr_renamed_2 = sproul.cfr_renamed_4052(arg0);
        return this;
    }

    public sprqbl cfr_renamed_4050(boolean arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprqbl cfr_renamed_7454(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }
}

