/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdlf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprpof;
import com.spire.presentation.packages.sprqsf;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprrsf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.sprusf;
import com.spire.presentation.packages.sprvif;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprzif;
import java.security.SecureRandom;

public final class sprmof
implements sprii {
    private sprvjf cfr_renamed_2;
    private sprlpf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        sprmof sprmof2 = this;
        sprmof sprmof3 = this;
        sprpof sprpof2 = sprmof3.cfr_renamed_5848(new sprdlf(sprmof3.cfr_renamed_2).cfr_renamed_1451().cfr_renamed_5771());
        sprmof sprmof4 = this;
        sprmof3.cfr_renamed_3.cfr_renamed_5783().cfr_renamed_5766(new byte[sprmof4.cfr_renamed_2.cfr_renamed_5732()], sprpof2.cfr_renamed_5769());
        int n = sprmof4.cfr_renamed_2.cfr_renamed_1134() - 1;
        sprrqf sprrqf2 = (sprrqf)((sprtsf)new sprtsf().cfr_renamed_5733(n)).cfr_renamed_1451();
        sprqsf sprqsf2 = new sprqsf(this.cfr_renamed_3, sprpof2.cfr_renamed_5769(), sprpof2.cfr_renamed_5768(), sprrqf2);
        sprknf sprknf2 = sprqsf2.cfr_renamed_1411();
        sprpof2.cfr_renamed_5771().cfr_renamed_5824(n, sprqsf2);
        sprpof2 = new sprdlf(this.cfr_renamed_2).cfr_renamed_5799(sprpof2.cfr_renamed_5768()).cfr_renamed_5800(sprpof2.cfr_renamed_5774()).cfr_renamed_5801(sprpof2.cfr_renamed_5769()).cfr_renamed_5802(sprknf2.cfr_renamed_97()).cfr_renamed_5836(sprpof2.cfr_renamed_5771()).cfr_renamed_1451();
        sprvif sprvif2 = new sprusf(this.cfr_renamed_2).cfr_renamed_5802(sprknf2.cfr_renamed_97()).cfr_renamed_5801(sprpof2.cfr_renamed_5769()).cfr_renamed_1451();
        return new sprsil(sprvif2, sprpof2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        sprzif sprzif2 = (sprzif)arg0;
        sprmof sprmof2 = this;
        this.cfr_renamed_4 = sprzif2.cfr_renamed_1295();
        sprmof2.cfr_renamed_2 = sprzif2.cfr_renamed_284();
        sprmof2.cfr_renamed_3 = this.cfr_renamed_2.cfr_renamed_5821();
    }

    private /* synthetic */ sprpof cfr_renamed_5848(sprrsf arg0) {
        sprmof sprmof2 = this;
        int n = sprmof2.cfr_renamed_2.cfr_renamed_5732();
        byte[] byArray = new byte[n];
        sprmof2.cfr_renamed_4.nextBytes(byArray);
        byte[] byArray2 = new byte[n];
        sprmof2.cfr_renamed_4.nextBytes(byArray2);
        byte[] byArray3 = new byte[n];
        sprmof2.cfr_renamed_4.nextBytes(byArray3);
        sprpof sprpof2 = null;
        sprpof2 = new sprdlf(this.cfr_renamed_2).cfr_renamed_5799(byArray).cfr_renamed_5800(byArray2).cfr_renamed_5801(byArray3).cfr_renamed_5836(arg0).cfr_renamed_1451();
        return sprpof2;
    }
}

