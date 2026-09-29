/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhxk;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.spriyk;
import com.spire.presentation.packages.sprmtk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzrk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprask
implements sprii {
    private sprhxk cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprhxk)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprcno.cfr_renamed_9("\u0012q\u0006jf\nd\u000e\u001e[,y0P"), sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155()), this.cfr_renamed_4.cfr_renamed_284(), spriil.cfr_renamed_91));
    }

    @Override
    public sprsil cfr_renamed_1223() {
        BigInteger bigInteger;
        sprask sprask2 = this;
        spriyk spriyk2 = sprask2.cfr_renamed_4.cfr_renamed_284();
        SecureRandom secureRandom = sprask2.cfr_renamed_4.cfr_renamed_1295();
        spriyk spriyk3 = spriyk2;
        BigInteger bigInteger2 = spriyk3.cfr_renamed_1604();
        BigInteger bigInteger3 = spriyk3.cfr_renamed_1155();
        BigInteger bigInteger4 = spriyk3.cfr_renamed_1778();
        int n = 64;
        while ((bigInteger = sprhdf.cfr_renamed_5230(256, secureRandom)).signum() < 1 || bigInteger.compareTo(bigInteger2) >= 0 || sprdvh.cfr_renamed_1794(bigInteger) < n) {
        }
        BigInteger bigInteger5 = bigInteger4.modPow(bigInteger, bigInteger3);
        return new sprsil(new sprmtk(bigInteger5, spriyk2), new sprzrk(bigInteger, spriyk2));
    }
}

