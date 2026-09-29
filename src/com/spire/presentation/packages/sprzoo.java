/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprflo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgeo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzeo;

@sprtea
public class sprzoo
extends sprzeo {
    private /* synthetic */ void cfr_renamed_16784(sprmrn arg0, sprdfo arg1) {
        if (arg0.cfr_renamed_13094() == null) {
            arg0.cfr_renamed_12511(new sprqgp());
        }
        sprqgp sprqgp2 = sprqgp.cfr_renamed_16234(sprgeja.cfr_renamed_16235(arg1.cfr_renamed_16236()), sprgeja.cfr_renamed_16235(this.cfr_renamed_3365().cfr_renamed_16236()));
        arg0.cfr_renamed_13094().cfr_renamed_12634(sprqgp2, 1);
    }

    @Override
    public sprmrn cfr_renamed_16785(sprcno arg0) {
        byte[] byArray;
        if (arg0.cfr_renamed_16786() && (byArray = sprgeo.cfr_renamed_16060(this.cfr_renamed_3365(), this.cfr_renamed_4)) != null) {
            sprmrn sprmrn2;
            sprzeo sprzeo2 = sprzoo.cfr_renamed_13890(byArray, this.cfr_renamed_4);
            sprmrn sprmrn3 = sprmrn2 = sprzeo2.cfr_renamed_16785(arg0);
            this.cfr_renamed_16784(sprmrn3, sprzeo2.cfr_renamed_3365());
            return sprmrn3;
        }
        return super.cfr_renamed_16785(arg0);
    }

    public sprzoo(sprdfo arg0, sprlmo arg1) {
        super(arg0, arg1);
    }

    @Override
    public sprmrn cfr_renamed_16787(sprcno arg0) {
        return new sprflo(this.cfr_renamed_3365(), this.cfr_renamed_4).cfr_renamed_16241(arg0.cfr_renamed_16788(), arg0.cfr_renamed_16227());
    }
}

