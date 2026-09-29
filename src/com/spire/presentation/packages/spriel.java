/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartLegend;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgbo;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprknk;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class spriel {
    private sprzuk cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private final sprgf cfr_renamed_4;

    public spriel(sprgf sprgf2) {
        this.cfr_renamed_4 = sprgf2;
    }

    public void cfr_renamed_5692(sprbj arg0) {
        sprknk sprknk2 = (sprknk)arg0;
        this.cfr_renamed_2 = (sprzuk)sprknk2.cfr_renamed_284();
        spriel spriel2 = this;
        spriel2.cfr_renamed_3 = new BigInteger(1, sproze.cfr_renamed_537(sprknk2.cfr_renamed_9207()));
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10591(sprgbo.cfr_renamed_9("AzRrK"), this.cfr_renamed_2));
    }

    public int cfr_renamed_1938() {
        return (this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }

    public int cfr_renamed_8005() {
        return this.cfr_renamed_4.cfr_renamed_1218();
    }

    public byte[] cfr_renamed_5695(sprbj arg0) {
        sprnzk sprnzk2 = (sprnzk)arg0;
        sprqxk sprqxk2 = this.cfr_renamed_2.cfr_renamed_284();
        if (!sprqxk2.equals(sprnzk2.cfr_renamed_284())) {
            throw new IllegalStateException(ChartLegend.cfr_renamed_9("?r,z5\u0011\nD\u0018]\u0013RZZ\u001fHZY\u001bBZF\b^\u0014VZU\u0015\\\u001bX\u0014\u0011\nP\bP\u0017T\u000eT\bB"));
        }
        sprqxk sprqxk3 = sprqxk2;
        BigInteger bigInteger = sprqxk3.cfr_renamed_1153().multiply(this.cfr_renamed_3).multiply(this.cfr_renamed_2.cfr_renamed_2112()).mod(sprqxk2.cfr_renamed_1146());
        spreuh spreuh2 = sprmvh.cfr_renamed_8962(sprqxk3.cfr_renamed_1769(), sprnzk2.cfr_renamed_1604());
        if (spreuh2.cfr_renamed_1952()) {
            throw new IllegalStateException(sprgbo.cfr_renamed_9("pj_mWmM}\u0019mJ$WkM$X$OeUm]$Iq[hPg\u0019o\\}\u0019bVv\u0019AzRrK"));
        }
        spreuh spreuh3 = spreuh2.cfr_renamed_1830(bigInteger).cfr_renamed_1775();
        if (spreuh3.cfr_renamed_1952()) {
            throw new IllegalStateException(ChartLegend.cfr_renamed_9("x\u0014W\u0013_\u0013E\u0003\u0011\u0013BZ_\u0015EZPZG\u001b]\u0013UZP\u001dC\u001fT\u0017T\u0014EZG\u001b]\u000fTZW\u0015CZt9g1~"));
        }
        byte[] byArray = spreuh3.cfr_renamed_1972(false);
        int n = byArray.length;
        int n2 = n / 2;
        sproze.cfr_renamed_5239(byArray, n - n2 * 2, n2);
        sproze.cfr_renamed_5239(byArray, n - n2, n2);
        spriel spriel2 = this;
        byte[] byArray2 = new byte[spriel2.cfr_renamed_4.cfr_renamed_1218()];
        this.cfr_renamed_4.cfr_renamed_1197(byArray, n - n2 * 2, n2 * 2);
        spriel2.cfr_renamed_4.cfr_renamed_1219(byArray2, 0);
        return byArray2;
    }
}

