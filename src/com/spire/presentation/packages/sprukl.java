/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfio;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.sprxw;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class sprukl
implements sprxw {
    public sprzuk cfr_renamed_4;

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (sprzuk)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10591(sprtdm.cfr_renamed_9("+u-r&"), this.cfr_renamed_4));
    }

    @Override
    public spryye cfr_renamed_9911(sprbj arg0) {
        spreuh spreuh2 = this.cfr_renamed_10634((sprnzk)arg0);
        return new sprnzk(spreuh2, this.cfr_renamed_4.cfr_renamed_284());
    }

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }

    @Override
    public BigInteger cfr_renamed_5695(sprbj arg0) {
        return this.cfr_renamed_10634((sprnzk)arg0).cfr_renamed_1969().cfr_renamed_1779();
    }

    private /* synthetic */ spreuh cfr_renamed_10634(sprnzk arg0) {
        sprnzk sprnzk2 = arg0;
        sprqxk sprqxk2 = this.cfr_renamed_4.cfr_renamed_284();
        if (!sprqxk2.equals(sprnzk2.cfr_renamed_284())) {
            throw new IllegalStateException(sprfio.cfr_renamed_9("IcHhO\u0000|UnLeC,KiY,HmS,W~ObG,DcMmIb\u0000|A~AaExE~S"));
        }
        sprqxk sprqxk3 = sprqxk2;
        BigInteger bigInteger = sprqxk3.cfr_renamed_1153().multiply(this.cfr_renamed_4.cfr_renamed_2112()).mod(sprqxk2.cfr_renamed_1146());
        spreuh spreuh2 = sprmvh.cfr_renamed_8962(sprqxk3.cfr_renamed_1769(), sprnzk2.cfr_renamed_1604());
        if (spreuh2.cfr_renamed_1952()) {
            throw new IllegalStateException(sprtdm.cfr_renamed_9("\u007f\u0000P\u0007X\u0007B\u0017\u0016\u0007ENX\u0001BNWN@\u000fZ\u0007RNF\u001bT\u0002_\r\u0016\u0005S\u0017\u0016\bY\u001c\u0016+u*~-"));
        }
        spreuh spreuh3 = spreuh2.cfr_renamed_1830(bigInteger).cfr_renamed_1775();
        if (spreuh3.cfr_renamed_1952()) {
            throw new IllegalStateException(sprfio.cfr_renamed_9("ibFeNeTu\u0000eS,NcT,A,VmLeD,AkRiEaEbT,VmLyE,FcR,eOdDc"));
        }
        return spreuh3;
    }
}

