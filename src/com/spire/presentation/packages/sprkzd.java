/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprem;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprn;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqqd;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprwme;
import com.spire.presentation.packages.sprwxd;

public class sprkzd {
    private boolean cfr_renamed_0;
    private sprem cfr_renamed_1;
    private spraa cfr_renamed_2;
    private sprn cfr_renamed_3;
    private sprn cfr_renamed_4;

    public sprkzd cfr_renamed_3977(boolean arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    private /* synthetic */ sprbod cfr_renamed_3978(sprqa arg0, sprwme arg1) throws sprfya {
        if (this.cfr_renamed_0) {
            sprkzd sprkzd2 = this;
            return new sprbod(arg1, arg0, sprkzd2.cfr_renamed_2, sprkzd2.cfr_renamed_1, true);
        }
        if (this.cfr_renamed_3 != null || this.cfr_renamed_4 != null) {
            if (this.cfr_renamed_3 == null) {
                sprkzd sprkzd3 = this;
                sprkzd3.cfr_renamed_3 = new sprqqd();
            }
            sprkzd sprkzd4 = this;
            sprkzd sprkzd5 = this;
            return new sprbod(arg1, arg0, sprkzd4.cfr_renamed_2, sprkzd4.cfr_renamed_1, sprkzd5.cfr_renamed_3, sprkzd5.cfr_renamed_4);
        }
        sprkzd sprkzd6 = this;
        return new sprbod(arg1, arg0, sprkzd6.cfr_renamed_2, sprkzd6.cfr_renamed_1);
    }

    public sprkzd cfr_renamed_3979(sprn arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprkzd cfr_renamed_3980(sprn arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprbod cfr_renamed_3981(sprqa arg0, sprcyd arg1) throws sprfya {
        sprwme sprwme2 = new sprwme(new sprvre(arg1.cfr_renamed_568()));
        sprbod sprbod2 = this.cfr_renamed_3978(arg0, sprwme2);
        sprbod2.cfr_renamed_3982(arg1);
        return sprbod2;
    }

    /*
     * WARNING - void declaration
     */
    public sprkzd(spraa spraa2, sprem sprem2) {
        void arg0;
        sprkzd sprkzd2 = this;
        sprkzd2.cfr_renamed_2 = arg0;
        sprkzd2.cfr_renamed_1 = sprem2;
    }

    public sprkzd(spraa arg0) {
        this(arg0, new sprwxd());
    }

    public sprbod cfr_renamed_3983(sprqa arg0, byte[] arg1) throws sprfya {
        sprwme sprwme2 = new sprwme(new sprlqe(arg1));
        return this.cfr_renamed_3978(arg0, sprwme2);
    }
}

