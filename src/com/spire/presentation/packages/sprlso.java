/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwo;
import com.spire.presentation.packages.sprcx;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprmu;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqxo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzo;
import com.spire.presentation.packages.spruro;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprwz;

@sprtea
public class sprlso {
    private sprcx cfr_renamed_2;
    private sprbwo cfr_renamed_3;
    private sprwvn cfr_renamed_4;

    public sprlso(sprcx sprcx2) {
        sprlso sprlso2 = this;
        sprlso sprlso3 = this;
        sprlso2.cfr_renamed_4 = new sprwvn();
        sprlso2.cfr_renamed_3 = new sprbwo();
        sprlso2.cfr_renamed_2 = sprcx2;
    }

    private /* synthetic */ sprwvn cfr_renamed_16775() {
        return this.cfr_renamed_4;
    }

    public sprwvn cfr_renamed_17091(sprmu arg0) {
        sprlso sprlso2 = new sprlso(this.cfr_renamed_2);
        sprlso2.cfr_renamed_17094(arg0);
        return sprlso2.cfr_renamed_16775();
    }

    private /* synthetic */ void cfr_renamed_17094(sprmu arg0) {
        this.cfr_renamed_3.cfr_renamed_15489(arg0.cfr_renamed_13030());
        while (this.cfr_renamed_3.cfr_renamed_15064()) {
            sprhhp sprhhp2 = arg0.cfr_renamed_16533().cfr_renamed_13257();
            sprqxo sprqxo2 = new sprqxo(this.cfr_renamed_3.cfr_renamed_17060(), sprhhp2);
            while (sprqxo2.cfr_renamed_15064()) {
                sprqxo sprqxo3;
                sprqxo sprqxo4 = sprqxo3;
                String string = sprqxo4.cfr_renamed_13030();
                sprfzo sprfzo2 = sprqxo4.cfr_renamed_17072() ? this.cfr_renamed_2.cfr_renamed_13400().cfr_renamed_16790().cfr_renamed_17095(sprqxo3.cfr_renamed_17064(), string.charAt(0)) : null;
                sprlso sprlso2 = this;
                sprwz sprwz2 = sprlso2.cfr_renamed_17096(arg0, string, sprfzo2);
                sprovja.cfr_renamed_11658(sprlso2.cfr_renamed_4, sprwz2);
                sprqxo2 = sprqxo3;
            }
        }
    }

    private /* synthetic */ sprwz cfr_renamed_17096(sprmu arg0, String arg1, sprfzo arg2) {
        sprhhp sprhhp2 = arg0.cfr_renamed_16533().cfr_renamed_13257();
        if (arg2 != null) {
            sprhhp2 = new sprhhp(sprhhp2.cfr_renamed_13265(), sprhhp2.cfr_renamed_13461(), arg2);
        }
        switch (this.cfr_renamed_3.cfr_renamed_16767()) {
            case 0: 
            case 1: 
            case 3: {
                sprtzo sprtzo2 = new sprtzo(arg0, sprhhp2, arg1, this.cfr_renamed_3.cfr_renamed_16767());
                return sprtzo2;
            }
            case 2: {
                spruro spruro2 = new spruro(arg0, sprhhp2, this.cfr_renamed_3.cfr_renamed_16767());
                return spruro2;
            }
        }
        throw new IllegalArgumentException();
    }
}

