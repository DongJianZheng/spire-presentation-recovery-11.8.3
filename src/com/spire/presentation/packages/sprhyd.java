/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkyz;
import com.spire.presentation.packages.sprlcb;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnf;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwrd;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzxd;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

public abstract class sprhyd
implements sprnf {
    public sprzxd cfr_renamed_0;
    public sprzxd cfr_renamed_1;
    public Map cfr_renamed_2;
    private PrivateKey cfr_renamed_3;
    public boolean cfr_renamed_4;

    public sprhyd cfr_renamed_4045(String arg0) {
        this.cfr_renamed_0 = sprwrd.cfr_renamed_4046(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_4047(sprije sprije2, sprije sprije3, byte[] byArray) throws sprlqd {
        Object object;
        void arg0;
        sprhyd sprhyd2 = this;
        sprlcb sprlcb2 = this.cfr_renamed_1.cfr_renamed_4038((sprije)arg0, sprhyd2.cfr_renamed_3);
        if (!sprhyd2.cfr_renamed_2.isEmpty()) {
            Object object2 = object = this.cfr_renamed_2.keySet().iterator();
            while (object2.hasNext()) {
                sprtzd sprtzd2;
                sprtzd sprtzd3 = sprtzd2 = (sprtzd)object.next();
                sprlcb2.cfr_renamed_1557(sprtzd3, (String)this.cfr_renamed_2.get(sprtzd3));
                object2 = object;
            }
        }
        try {
            void arg2;
            void arg1;
            sprhyd sprhyd3 = this;
            object = sprhyd3.cfr_renamed_1.cfr_renamed_4048(arg1.cfr_renamed_593(), sprlcb2.cfr_renamed_1534((sprije)arg1, (byte[])arg2));
            if (sprhyd3.cfr_renamed_4) {
                this.cfr_renamed_1.cfr_renamed_4049((sprije)arg1, (Key)object);
            }
            return object;
        }
        catch (sprmfb sprmfb2) {
            throw new sprlqd(new StringBuilder().insert(0, sprkyz.cfr_renamed_9(".8(%;4\"/%`>.<2*0;)%'k+.9q`")).append(sprmfb2.getMessage()).toString(), sprmfb2);
        }
    }

    public sprhyd cfr_renamed_4050(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprhyd(PrivateKey privateKey) {
        sprhyd sprhyd2 = this;
        this.cfr_renamed_1 = new sprzxd(new sprypd());
        this.cfr_renamed_0 = this.cfr_renamed_1;
        this.cfr_renamed_2 = new HashMap();
        sprhyd2.cfr_renamed_4 = false;
        sprhyd2.cfr_renamed_3 = privateKey;
    }

    public sprhyd cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_1 = new sprzxd(new sprqrd(arg0));
        this.cfr_renamed_0 = this.cfr_renamed_1;
        return this;
    }

    public sprhyd cfr_renamed_1499(String arg0) {
        this.cfr_renamed_1 = new sprzxd(new sprbqd(arg0));
        this.cfr_renamed_0 = this.cfr_renamed_1;
        return this;
    }

    public sprhyd cfr_renamed_1557(sprtzd arg0, String arg1) {
        sprhyd sprhyd2 = this;
        sprhyd2.cfr_renamed_2.put(arg0, arg1);
        return sprhyd2;
    }

    public sprhyd cfr_renamed_4051(Provider arg0) {
        this.cfr_renamed_0 = sprwrd.cfr_renamed_4052(arg0);
        return this;
    }
}

