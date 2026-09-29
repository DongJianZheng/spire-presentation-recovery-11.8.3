/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracda;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprhyda;
import com.spire.presentation.packages.sprpqk;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprrrk;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprwml {
    private sprwsk cfr_renamed_0;
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(1L);
    private BigInteger cfr_renamed_2;
    private sprquk cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public void cfr_renamed_5692(sprbj arg0) {
        spryye spryye2;
        spryye spryye3;
        if (arg0 instanceof sprbgk) {
            sprbgk sprbgk2;
            sprbgk sprbgk3 = sprbgk2 = (sprbgk)arg0;
            this.cfr_renamed_4 = sprbgk3.cfr_renamed_1295();
            spryye2 = spryye3 = (spryye)sprbgk3.cfr_renamed_284();
        } else {
            this.cfr_renamed_4 = sprybl.cfr_renamed_2794();
            spryye2 = spryye3 = (spryye)arg0;
        }
        if (!(spryye2 instanceof sprquk)) {
            throw new IllegalArgumentException(spracda.cfr_renamed_9("\n!\u000b\u0007)\u0000 \fn\f6\u0019+\n:\u001an-\u00069<\u00008\b:\f\u0005\f79/\u001b/\u0004+\u001d+\u001b="));
        }
        this.cfr_renamed_3 = (sprquk)spryye3;
        this.cfr_renamed_0 = this.cfr_renamed_3.cfr_renamed_284();
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10590(sprhyda.cfr_renamed_9("\u0014!"), this.cfr_renamed_3));
    }

    public BigInteger cfr_renamed_10636(sprryk arg0, BigInteger arg1) {
        if (!arg0.cfr_renamed_284().equals(this.cfr_renamed_0)) {
            throw new IllegalArgumentException(spracda.cfr_renamed_9("\n\u0000(\u000f'\fc!+\u0005\"\u0004/\u0007n\u0019;\u000b\"\u0000-I%\f7I&\b=I9\u001b!\u0007)I>\b<\b#\f:\f<\u001a`"));
        }
        BigInteger bigInteger = this.cfr_renamed_0.cfr_renamed_1155();
        BigInteger bigInteger2 = arg0.spr\u3181();
        if (bigInteger2 == null || bigInteger2.compareTo(cfr_renamed_1) <= 0 || bigInteger2.compareTo(bigInteger.subtract(cfr_renamed_1)) >= 0) {
            throw new IllegalArgumentException(sprhyda.cfr_renamed_9("-9\u000f6\u00005D\u0018\f<\u0005=\b>I \u001c2\u00059\np\u00025\u0010p\u0000#I'\f1\u0002"));
        }
        BigInteger bigInteger3 = bigInteger2.modPow(this.cfr_renamed_2, bigInteger);
        if (bigInteger3.equals(cfr_renamed_1)) {
            throw new IllegalStateException(spracda.cfr_renamed_9("\u001d\u0001/\u001b+\rn\u0002+\u0010n\n/\u0007i\u001dn\u000b+I\u007f"));
        }
        return arg1.modPow(this.cfr_renamed_3.cfr_renamed_1980(), bigInteger).multiply(bigInteger3).mod(bigInteger);
    }

    public BigInteger cfr_renamed_3949() {
        sprrrk sprrrk2;
        sprrrk sprrrk3 = sprrrk2 = new sprrrk();
        sprwml sprwml2 = this;
        sprrrk3.cfr_renamed_5536(new sprpqk(sprwml2.cfr_renamed_4, sprwml2.cfr_renamed_0));
        sprsil sprsil2 = sprrrk3.cfr_renamed_1223();
        this.cfr_renamed_2 = ((sprquk)sprsil2.cfr_renamed_1225()).cfr_renamed_1980();
        return ((sprryk)sprsil2.cfr_renamed_1224()).spr\u3181();
    }
}

