/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhwf;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqvf;
import com.spire.presentation.packages.sprsdg;
import com.spire.presentation.packages.sprtff;
import com.spire.presentation.packages.sprveg;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.sprxye;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzfl;
import java.security.SecureRandom;

public class sprmxf
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    public sprmxf(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprtff sprtff2 = ((sprsdg)arg0).cfr_renamed_284().cfr_renamed_3;
        sprveg sprveg2 = new sprveg(sprtff2);
        sprhwf sprhwf2 = new sprhwf(sprtff2);
        sprtff sprtff3 = sprtff2;
        byte[] byArray = new byte[sprtff3.cfr_renamed_5428()];
        byte[] byArray2 = new byte[sprtff3.cfr_renamed_5435()];
        this.cfr_renamed_4.nextBytes(byArray2);
        sprqvf sprqvf2 = sprveg2.cfr_renamed_6392(byArray2);
        sprxye sprxye2 = sprqvf2.cfr_renamed_6388();
        sprxye sprxye3 = sprqvf2.cfr_renamed_6386();
        byte[] byArray3 = sprxye2.cfr_renamed_5418(sprtff2.cfr_renamed_5428());
        System.arraycopy(byArray3, 0, byArray, 0, byArray3.length);
        byte[] byArray4 = sprxye3.cfr_renamed_5418(byArray.length - sprtff2.cfr_renamed_5429());
        System.arraycopy(byArray4, 0, byArray, sprtff2.cfr_renamed_5429(), byArray4.length);
        sprzfl sprzfl2 = new sprzfl(256);
        sprzfl2.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzfl sprzfl3 = sprzfl2;
        byte[] byArray5 = new byte[sprzfl3.cfr_renamed_1218()];
        sprzfl3.cfr_renamed_1219(byArray5, 0);
        sprxye2.cfr_renamed_5411();
        byte[] byArray6 = sprhwf2.cfr_renamed_6398(sprxye2, sprxye3, ((sprsdg)arg0).cfr_renamed_4);
        byte[] byArray7 = sproze.cfr_renamed_533(byArray5, 0, sprtff2.cfr_renamed_5437());
        sproze.cfr_renamed_3408(byArray5);
        return new sprkjf(byArray7, byArray6);
    }
}

