/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprago;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprkoo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxho;
import com.spire.presentation.packages.sprzeo;

@sprtea
public class sprdjo
extends sprzeo {
    @Override
    public sprmrn cfr_renamed_16787(sprcno arg0) {
        sprkoo sprkoo2;
        if (arg0.cfr_renamed_16818()) {
            sprcno sprcno2;
            boolean bl;
            sprkoo2 = new sprago(this.cfr_renamed_3365(), this.cfr_renamed_4);
            if (arg0.cfr_renamed_16820() || arg0.cfr_renamed_16788()) {
                bl = true;
                sprcno2 = arg0;
            } else {
                bl = false;
                sprcno2 = arg0;
            }
            sprmrn sprmrn2 = sprkoo2.cfr_renamed_16241(bl, sprcno2.cfr_renamed_16227());
            if (!this.cfr_renamed_4.cfr_renamed_16193() || !arg0.cfr_renamed_16820()) {
                return sprmrn2;
            }
            this.cfr_renamed_16827();
        }
        this.cfr_renamed_4.cfr_renamed_16212(false);
        sprkoo2 = new sprxho(this.cfr_renamed_3365(), this.cfr_renamed_4);
        return sprkoo2.cfr_renamed_16241(arg0.cfr_renamed_16788(), arg0.cfr_renamed_16227());
    }

    public sprdjo(sprdfo arg0, sprlmo arg1) {
        super(arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_16827() {
        this.cfr_renamed_4.cfr_renamed_12479().cfr_renamed_12477(2, 3, sprnxe.cfr_renamed_9("84;R]\t\u001c\u000b\tY\u0012\u001f]<0?VY\u0019\f\u001c\u0015]\u0014\u0018\r\u001c\u001f\u0014\u0015\u0018Y\u001e\u0018\u0013\u0017\u0012\r]\u001b\u0018Y\u001e\u0016\u000f\u000b\u0018\u001a\t\u0015\u0004Y\u000f\u001c\u0013\u001d\u0018\u000b\u0018\u001dSY;\u0018\u0011\u0015\u001f\u0018\u001e\u0012]\r\u0012Y84;Y\r\u0018\u000f\r]\u000b\u0018\u0017\u0019\u001c\u000f\u0010\u0013\u001e]\u000e\u0014\u0015\u0011Y\u001f\u001c]\t\u0018\u000b\u001b\u0016\u000f\u0014\u0018\u001dS"));
    }
}

