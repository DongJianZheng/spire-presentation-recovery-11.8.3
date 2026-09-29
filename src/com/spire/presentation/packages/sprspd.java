/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdi;
import com.spire.presentation.packages.sprdvd;
import com.spire.presentation.packages.sprdxd;
import com.spire.presentation.packages.sprfzd;
import com.spire.presentation.packages.sprlzd;
import com.spire.presentation.packages.sproge;
import com.spire.presentation.packages.sprpje;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwae;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprspd {
    private sprpje cfr_renamed_3;
    private sprszd cfr_renamed_4;

    public sprtie cfr_renamed_100(sprtzd arg0) {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_100(arg0);
        }
        return null;
    }

    public Date cfr_renamed_2133() {
        if (this.cfr_renamed_3.cfr_renamed_2133() == null) {
            return null;
        }
        return sprlzd.cfr_renamed_4269(this.cfr_renamed_3.cfr_renamed_2133());
    }

    public sprdi cfr_renamed_2161() {
        sproge sproge2 = this.cfr_renamed_3.cfr_renamed_2161();
        if (sproge2.cfr_renamed_312() == 0) {
            return null;
        }
        if (sproge2.cfr_renamed_312() == 1) {
            return new sprdxd(sprwae.cfr_renamed_23(sproge2.cfr_renamed_648()));
        }
        return new sprdvd();
    }

    public Set cfr_renamed_662() {
        return sprlzd.cfr_renamed_4236(this.cfr_renamed_4);
    }

    public sprfzd cfr_renamed_4270() {
        return new sprfzd(this.cfr_renamed_3.cfr_renamed_4270());
    }

    /*
     * WARNING - void declaration
     */
    public sprspd(sprpje sprpje2) {
        void arg0;
        sprspd sprspd2 = this;
        sprspd2.cfr_renamed_3 = arg0;
        sprspd2.cfr_renamed_4 = sprpje2.cfr_renamed_4271();
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_4 != null;
    }

    public Date cfr_renamed_2132() {
        return sprlzd.cfr_renamed_4269(this.cfr_renamed_3.cfr_renamed_2132());
    }

    public List cfr_renamed_583() {
        return sprlzd.cfr_renamed_582(this.cfr_renamed_4);
    }

    public Set cfr_renamed_665() {
        return sprlzd.cfr_renamed_4234(this.cfr_renamed_4);
    }
}

