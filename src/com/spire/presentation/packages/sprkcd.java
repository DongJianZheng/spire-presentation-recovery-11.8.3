/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazc;
import com.spire.presentation.packages.sprcbd;
import com.spire.presentation.packages.sprery;
import com.spire.presentation.packages.spreue;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprovy;

public class sprkcd
extends sprazc {
    private sprfud cfr_renamed_4;

    public sprfud cfr_renamed_2577() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_2578() {
        return ((spreue)((Object)this.cfr_renamed_4)).cfr_renamed_2578().cfr_renamed_186();
    }

    public sprkcd(spreue arg0) throws sprcbd {
        sprkcd sprkcd2 = this;
        super(arg0);
        sprkcd2.cfr_renamed_2579();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2579() throws sprcbd {
        if (this.cfr_renamed_4 != null) {
            return;
        }
        if (((spreue)((Object)this.cfr_renamed_4)).cfr_renamed_2578() == null) {
            throw new sprcbd(sprery.cfr_renamed_9("|{{~jHIX]^L\u0003\\LLL\u0016@]^KL_H\u0018^PBMA\\\rZH\u0018^HH[D^D]I\u0018KW_\u0018{ki\u0018^]_ND[H"));
        }
        try {
            this.cfr_renamed_4 = new sprfud(((spreue)((Object)this.cfr_renamed_4)).cfr_renamed_2578().cfr_renamed_186());
            return;
        }
        catch (sprlqd sprlqd2) {
            throw new sprcbd(sprovy.cfr_renamed_9("V\u0000{FaAg\u0004t\u00055\"X252|\u0006{\u0004q%t\u0015tAs\u0013z\f5\b{\u0011`\u0015"), sprlqd2);
        }
    }
}

