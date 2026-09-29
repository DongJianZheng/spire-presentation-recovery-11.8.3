/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryjo;

@sprtea
public abstract class sprvko
extends spryjo {
    private int[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    public abstract sprqgp cfr_renamed_16290(sprgeja var1);

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_16289(sprhio sprhio2, int n) {
        int n2;
        void arg1;
        sprvko sprvko2 = this;
        sprvko2.cfr_renamed_4 = new int[arg1];
        sprvko2.cfr_renamed_3 = new int[arg1];
        int n3 = n2 = 0;
        while (n3 < arg1) {
            void arg0;
            sprvko sprvko3 = this;
            sprvko3.cfr_renamed_4[n2] = arg0.cfr_renamed_12261();
            sprvko3.cfr_renamed_3[n2++] = arg0.cfr_renamed_12261();
            n3 = n2;
        }
    }

    @Override
    public sprmrn cfr_renamed_16288(sprsuja[] arg0, sprwbp[] arg1) {
        int n;
        sprmrn sprmrn2 = new sprmrn();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            sprxln sprxln2;
            sprsuja sprsuja2 = arg0[this.cfr_renamed_4[n]];
            sprwbp sprwbp2 = arg1[this.cfr_renamed_4[n]];
            sprsuja sprsuja3 = arg0[this.cfr_renamed_3[n]];
            sprwbp sprwbp3 = arg1[this.cfr_renamed_3[n]];
            sprgeja sprgeja2 = sprgeja.cfr_renamed_14827(sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181(), sprsuja3.cfr_renamed_1980(), sprsuja3.spr\u3181());
            sprgdp sprgdp2 = new sprgdp(sprgeja2, sprwbp2, sprwbp3);
            sprxln sprxln3 = sprxln2 = sprxln.cfr_renamed_13253(sprgeja2);
            sprxln3.cfr_renamed_12550(sprgdp2);
            sprxln3.cfr_renamed_12511(this.cfr_renamed_16290(sprgeja2));
            sprmrn2.cfr_renamed_12507(sprxln3);
            n2 = ++n;
        }
        return sprmrn2;
    }
}

