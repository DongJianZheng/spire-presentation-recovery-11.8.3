/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxk;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprqtk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwuk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzyk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprmzk
implements sprii {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprwuk cfr_renamed_4;

    private /* synthetic */ sprqtk cfr_renamed_10186(SecureRandom arg0, sprzyk arg1) {
        BigInteger bigInteger = arg1.cfr_renamed_1155();
        return new sprqtk(arg1, this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0));
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprmzk sprmzk2 = this;
        sprzyk sprzyk2 = sprmzk2.cfr_renamed_4.cfr_renamed_284();
        sprqtk sprqtk2 = sprmzk2.cfr_renamed_10186(sprmzk2.cfr_renamed_4.cfr_renamed_1295(), sprzyk2);
        sprbxk sprbxk2 = sprmzk2.cfr_renamed_10187(sprzyk2, sprqtk2);
        sprqtk2.cfr_renamed_9995(sprbxk2);
        return new sprsil(sprbxk2, sprqtk2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprwuk)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprkto.cfr_renamed_9("\u001476(27\u0004-80'\u000e2<\u0010 9"), sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155()), this.cfr_renamed_4.cfr_renamed_284(), spriil.cfr_renamed_91));
    }

    private /* synthetic */ BigInteger cfr_renamed_3533(BigInteger arg0, SecureRandom arg1) {
        return sprhdf.cfr_renamed_513(cfr_renamed_3, arg0.subtract(cfr_renamed_3), arg1);
    }

    private /* synthetic */ sprbxk cfr_renamed_10187(sprzyk arg0, sprqtk arg1) {
        sprzyk sprzyk2 = arg0;
        BigInteger bigInteger = sprzyk2.cfr_renamed_1944();
        BigInteger bigInteger2 = sprzyk2.cfr_renamed_1946();
        BigInteger bigInteger3 = sprzyk2.cfr_renamed_1155();
        BigInteger bigInteger4 = bigInteger;
        BigInteger bigInteger5 = bigInteger4.modPow(arg1.cfr_renamed_3380(), bigInteger3).multiply(bigInteger2.modPow(arg1.cfr_renamed_3384(), bigInteger3));
        BigInteger bigInteger6 = bigInteger4.modPow(arg1.cfr_renamed_3385(), bigInteger3).multiply(bigInteger2.modPow(arg1.cfr_renamed_3386(), bigInteger3));
        BigInteger bigInteger7 = bigInteger4.modPow(arg1.cfr_renamed_3383(), bigInteger3);
        return new sprbxk(arg0, bigInteger5, bigInteger6, bigInteger7);
    }
}

