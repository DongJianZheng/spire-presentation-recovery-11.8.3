/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcv;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfma;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprscl;
import com.spire.presentation.packages.sprzbr;
import com.spire.presentation.packages.sprzph;
import java.math.BigInteger;

public class sprfil
implements sprcv {
    private BigInteger cfr_renamed_3;
    private sprnzk cfr_renamed_4;

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        if (!(arg0 instanceof sprnzk)) {
            throw new IllegalArgumentException(sprfma.cfr_renamed_9("x\fm:_#T,v*D\u001f\\=\\\"X;X=No\\=XoO*L:T=X+\u001d)R=\u001d)T7X+\u001d;O.S<[ O\"\u0013"));
        }
        this.cfr_renamed_4 = (sprnzk)arg0;
    }

    @Override
    public sprscl cfr_renamed_10458(sprscl arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprzbr.cfr_renamed_9("8c;I\u0005E\u0019t\u000fA\u0013S\u001bO\u000fM]N\u0012T]I\u0013I\tI\u001cL\u0014S\u0018D"));
        }
        sprfil sprfil2 = this;
        sprqxk sprqxk2 = sprfil2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprqxk2.cfr_renamed_1146();
        sprfe sprfe2 = sprfil2.cfr_renamed_3284();
        BigInteger bigInteger2 = sprfil2.cfr_renamed_3.mod(bigInteger);
        spreuh[] spreuhArray = new spreuh[2];
        spreuhArray[0] = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger2).cfr_renamed_8630(sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0.cfr_renamed_1980()));
        spreuhArray[1] = this.cfr_renamed_4.cfr_renamed_1604().cfr_renamed_1830(bigInteger2).cfr_renamed_8630(sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0.spr\u3181()));
        spreuh[] spreuhArray2 = spreuhArray;
        sprqxk2.cfr_renamed_1769().cfr_renamed_8691(spreuhArray2);
        return new sprscl(spreuhArray2[0], spreuhArray2[1]);
    }

    @Override
    public BigInteger cfr_renamed_3227() {
        return this.cfr_renamed_3;
    }

    public sprfil(BigInteger bigInteger) {
        this.cfr_renamed_3 = bigInteger;
    }
}

