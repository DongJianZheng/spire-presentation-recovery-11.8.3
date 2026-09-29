/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkep;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprqal
implements sprii,
sprck {
    public sprqxk cfr_renamed_2;
    public SecureRandom cfr_renamed_3;
    private final String cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        BigInteger bigInteger;
        BigInteger bigInteger2 = this.cfr_renamed_2.cfr_renamed_1146();
        int n = bigInteger2.bitLength();
        int n2 = n >>> 2;
        int n3 = n;
        while (true) {
            if (this.cfr_renamed_10164(bigInteger = sprhdf.cfr_renamed_5230(n3, this.cfr_renamed_3), bigInteger2)) {
                n3 = n;
                continue;
            }
            if (sprdvh.cfr_renamed_1794(bigInteger) >= n2) break;
            n3 = n;
        }
        spreuh spreuh2 = this.cfr_renamed_3284().cfr_renamed_8926(this.cfr_renamed_2.cfr_renamed_1145(), bigInteger);
        return new sprsil(new sprnzk(spreuh2, this.cfr_renamed_2), new sprzuk(bigInteger, this.cfr_renamed_2));
    }

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        sprftk sprftk2 = (sprftk)arg0;
        sprqal sprqal2 = this;
        sprqal2.cfr_renamed_3 = sprftk2.cfr_renamed_1295();
        sprqal2.cfr_renamed_2 = sprftk2.cfr_renamed_3373();
        sprqal sprqal3 = this;
        sprybl.cfr_renamed_9170(new sprfdl(sprqal3.cfr_renamed_4, sprrkl.cfr_renamed_9917(sprqal3.cfr_renamed_2.cfr_renamed_1769()), sprftk2.cfr_renamed_3373(), spriil.cfr_renamed_91));
    }

    public boolean cfr_renamed_10164(BigInteger arg0, BigInteger arg1) {
        return arg0.compareTo((BigInteger)((Object)cfr_renamed_4)) < 0 || arg0.compareTo(arg1) >= 0;
    }

    public sprqal(String string) {
        this.cfr_renamed_4 = string;
    }

    public sprqal() {
        this(sprkep.cfr_renamed_9("\u0016N\u0018h*J6c"));
    }
}

