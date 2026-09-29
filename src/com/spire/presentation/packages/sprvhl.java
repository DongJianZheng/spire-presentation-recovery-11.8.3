/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprjjo;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryoy;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class sprvhl
implements spruy {
    public sprzuk cfr_renamed_4;

    @Override
    public BigInteger cfr_renamed_5695(sprbj arg0) {
        sprnzk sprnzk2 = (sprnzk)arg0;
        sprqxk sprqxk2 = this.cfr_renamed_4.cfr_renamed_284();
        if (!sprqxk2.equals(sprnzk2.cfr_renamed_284())) {
            throw new IllegalStateException(sprjjo.cfr_renamed_9("c\"b)eAV\u0014D\rO\u0002\u0006\nC\u0018\u0006\tG\u0012\u0006\u0016T\u000eH\u0006\u0006\u0005I\fG\bHAV\u0000T\u0000K\u0004R\u0004T\u0012"));
        }
        sprqxk sprqxk3 = sprqxk2;
        BigInteger bigInteger = sprqxk3.cfr_renamed_1153().multiply(this.cfr_renamed_4.cfr_renamed_2112()).mod(sprqxk2.cfr_renamed_1146());
        spreuh spreuh2 = sprmvh.cfr_renamed_8962(sprqxk3.cfr_renamed_1769(), sprnzk2.cfr_renamed_1604());
        if (spreuh2.cfr_renamed_1952()) {
            throw new IllegalStateException(spryoy.cfr_renamed_9("@4o3g3}#)3zzg5}zhz\u007f;e3mzy/k6`9)1l#)<f()\u001fJ\u001eA\u0019"));
        }
        spreuh spreuh3 = spreuh2.cfr_renamed_1830(bigInteger).cfr_renamed_1775();
        if (spreuh3.cfr_renamed_1952()) {
            throw new IllegalStateException(sprjjo.cfr_renamed_9("(H\u0007O\u000fO\u0015_AO\u0012\u0006\u000fI\u0015\u0006\u0000\u0006\u0017G\rO\u0005\u0006\u0000A\u0013C\u0004K\u0004H\u0015\u0006\u0017G\rS\u0004\u0006\u0007I\u0013\u0006$e%n\""));
        }
        return spreuh3.cfr_renamed_1969().cfr_renamed_1779();
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (sprzuk)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10591(spryoy.cfr_renamed_9("\u001fJ\u0019M\u0012"), this.cfr_renamed_4));
    }

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }
}

