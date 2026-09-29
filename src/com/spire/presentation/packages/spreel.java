/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprmok;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprsdp;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprwnk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class spreel
implements spruy {
    public sprwnk cfr_renamed_4;

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (sprwnk)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10591(sprrnm.cfr_renamed_9("]ZUHN"), this.cfr_renamed_4.cfr_renamed_2095()));
    }

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_2095().cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }

    @Override
    public BigInteger cfr_renamed_5695(sprbj arg0) {
        if (sprjcf.cfr_renamed_5159(sprsdp.cfr_renamed_9("K\u0016EW[\tA\u000bMWX\nE\u0016L\u001cDW[\u001cK\fZ\u0010\\\u0000\u0006\u001cKWL\u0010[\u0018J\u0015M&E\b^"))) {
            throw new IllegalStateException(sprrnm.cfr_renamed_9("]ZUHN9}ahuqzqmt`8}qjy{t||"));
        }
        sprmok sprmok2 = (sprmok)arg0;
        sprzuk sprzuk2 = this.cfr_renamed_4.cfr_renamed_2095();
        sprqxk sprqxk2 = sprzuk2.cfr_renamed_284();
        if (!sprqxk2.equals(sprmok2.cfr_renamed_3351().cfr_renamed_284())) {
            throw new IllegalStateException(sprsdp.cfr_renamed_9("<k4y/\b\t]\u001bD\u0010KYC\u001cQYK\u0016E\tG\u0017M\u0017\\\n\b\u0011I\u000fMY_\u000bG\u0017OYL\u0016E\u0018A\u0017\b\tI\u000bI\u0014M\rM\u000b["));
        }
        spreuh spreuh2 = this.cfr_renamed_10633(sprqxk2, sprzuk2, this.cfr_renamed_4.cfr_renamed_2094(), this.cfr_renamed_4.cfr_renamed_2096(), sprmok2.cfr_renamed_3351(), sprmok2.cfr_renamed_2096()).cfr_renamed_1775();
        if (spreuh2.cfr_renamed_1952()) {
            throw new IllegalStateException(sprrnm.cfr_renamed_9("Qw~pvpl`8pk9vvl9y9nxtp|9y~j|}t}wl9nxtl}9~vj9UHN"));
        }
        return spreuh2.cfr_renamed_1969().cfr_renamed_1779();
    }

    private /* synthetic */ spreuh cfr_renamed_10633(sprqxk arg0, sprzuk arg1, sprzuk arg2, sprnzk arg3, sprnzk arg4, sprnzk arg5) {
        sprqxk sprqxk2 = arg0;
        BigInteger bigInteger = sprqxk2.cfr_renamed_1146();
        int n = (bigInteger.bitLength() + 1) / 2;
        BigInteger bigInteger2 = sprck.cfr_renamed_4.shiftLeft(n);
        sprgxh sprgxh2 = sprqxk2.cfr_renamed_1769();
        spreuh spreuh2 = sprmvh.cfr_renamed_8962(sprgxh2, arg3.cfr_renamed_1604());
        spreuh spreuh3 = sprmvh.cfr_renamed_8962(sprgxh2, arg4.cfr_renamed_1604());
        spreuh spreuh4 = sprmvh.cfr_renamed_8962(sprgxh2, arg5.cfr_renamed_1604());
        BigInteger bigInteger3 = spreuh2.cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger2).setBit(n);
        BigInteger bigInteger4 = arg1.cfr_renamed_2112().multiply(bigInteger3).add(arg2.cfr_renamed_2112()).mod(bigInteger);
        BigInteger bigInteger5 = spreuh4.cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger2).setBit(n);
        BigInteger bigInteger6 = sprqxk2.cfr_renamed_1153().multiply(bigInteger4).mod(bigInteger);
        return sprmvh.cfr_renamed_8958(spreuh3, bigInteger5.multiply(bigInteger6).mod(bigInteger), spreuh4, bigInteger6);
    }
}

