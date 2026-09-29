/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.spreta;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmwe;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprtre;
import com.spire.presentation.packages.sprxte;
import java.net.URI;

public class sprmna {
    public URI cfr_renamed_3;
    public sprmwe cfr_renamed_4;

    public void cfr_renamed_689(URI arg0) {
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_690(boolean bl, sprxte sprxte2, sprcae sprcae2, sprtre sprtre2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprmna sprmna2 = this;
        sprmna2.cfr_renamed_4 = new sprmwe(sprnpe.cfr_renamed_655((boolean)arg0), (sprxte)arg1, (sprcae)arg2, (sprtre)arg3);
    }

    public void cfr_renamed_691(boolean arg0, String arg1, String arg2, sprtre arg3) {
        sprxte sprxte2 = null;
        if (arg1 != null) {
            sprxte2 = new sprxte(arg1);
        }
        sprcae sprcae2 = null;
        if (arg2 != null) {
            sprcae2 = new sprcae(arg2);
        }
        this.cfr_renamed_690(arg0, sprxte2, sprcae2, arg3);
    }

    public void cfr_renamed_677(sprpa arg0) throws sprlqd {
        new spreta(this.cfr_renamed_4).cfr_renamed_677(arg0);
    }

    public void cfr_renamed_692(boolean arg0, String arg1, String arg2) {
        this.cfr_renamed_691(arg0, arg1, arg2, null);
    }
}

