/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradf;
import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhff;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprjo;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprtef;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvcf;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprxxe;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzgp;
import java.security.SecureRandom;

public class spreff
implements sprjo {
    private boolean cfr_renamed_152;
    public static final String cfr_renamed_112 = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private SecureRandom cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    public int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprvcf cfr_renamed_3;
    public int cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_152 = arg0;
        if (this.cfr_renamed_152) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                spreff spreff2 = this;
                spreff2.cfr_renamed_119 = sprbgk2.cfr_renamed_1295();
                spreff2.cfr_renamed_3 = (sprxxe)sprbgk2.cfr_renamed_284();
                spreff spreff3 = this;
                spreff3.cfr_renamed_5630((sprxxe)spreff3.cfr_renamed_3);
                return;
            }
            this.cfr_renamed_119 = sprybl.cfr_renamed_2794();
            this.cfr_renamed_3 = (sprxxe)arg1;
            spreff spreff4 = this;
            spreff4.cfr_renamed_5630((sprxxe)spreff4.cfr_renamed_3);
            return;
        }
        this.cfr_renamed_3 = (sprhff)arg1;
        spreff spreff5 = this;
        spreff5.cfr_renamed_5631((sprhff)spreff5.cfr_renamed_3);
    }

    private /* synthetic */ spradf cfr_renamed_1358(byte[] arg0) {
        spreff spreff2 = this;
        byte[] byArray = new byte[spreff2.cfr_renamed_1 + ((spreff2.cfr_renamed_91 & 7) != 0 ? 1 : 0)];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        byArray[arg0.length] = 1;
        return spradf.cfr_renamed_963(this.cfr_renamed_91, byArray);
    }

    @Override
    public byte[] cfr_renamed_1214(byte[] arg0) throws sprull {
        if (this.cfr_renamed_152) {
            throw new IllegalStateException(sprzgp.cfr_renamed_9("[BHC]Y\u0018BVBLBYGQX]O\u0018MWY\u0018O]HJRH_QDV"));
        }
        spreff spreff2 = this;
        spradf spradf2 = spradf.cfr_renamed_963(spreff2.cfr_renamed_0, arg0);
        sprhff sprhff2 = (sprhff)spreff2.cfr_renamed_3;
        sprnhf sprnhf2 = sprhff2.cfr_renamed_845();
        spricf spricf2 = sprhff2.cfr_renamed_1147();
        spraye spraye2 = sprhff2.cfr_renamed_1149();
        sprwff sprwff2 = sprhff2.cfr_renamed_1152();
        sprwff sprwff3 = sprhff2.cfr_renamed_1151();
        spraye spraye3 = sprhff2.cfr_renamed_1153();
        spricf[] spricfArray = sprhff2.cfr_renamed_1148();
        sprwff sprwff4 = sprwff2.cfr_renamed_5483(sprwff3);
        sprwff sprwff5 = sprwff4.cfr_renamed_875();
        spradf spradf3 = (spradf)spradf2.cfr_renamed_5467(sprwff5);
        spradf spradf4 = sprtef.cfr_renamed_5489((spradf)spraye3.cfr_renamed_5484(spradf3), sprnhf2, spricf2, spricfArray);
        spradf spradf5 = (spradf)spradf3.cfr_renamed_5468(spradf4);
        spradf5 = (spradf)spradf5.cfr_renamed_5467(sprwff2);
        spradf4 = (spradf)spradf4.cfr_renamed_5467(sprwff4);
        spradf spradf6 = spradf5.cfr_renamed_962(this.cfr_renamed_91);
        spradf spradf7 = (spradf)spraye2.cfr_renamed_5485(spradf6);
        return this.cfr_renamed_5632(spradf7);
    }

    @Override
    public byte[] cfr_renamed_136(byte[] arg0) {
        if (!this.cfr_renamed_152) {
            throw new IllegalStateException(spraxo.cfr_renamed_9("6v%w0muv;v!v4s<l0{uy:mu{0|'f%k<p;"));
        }
        spreff spreff2 = this;
        spradf spradf2 = spreff2.cfr_renamed_1358(arg0);
        spreff spreff3 = this;
        spradf spradf3 = new spradf(spreff3.cfr_renamed_0, spreff3.cfr_renamed_2, this.cfr_renamed_119);
        return ((spradf)((sprxxe)spreff2.cfr_renamed_3).cfr_renamed_1145().cfr_renamed_5485(spradf2).cfr_renamed_5468(spradf3)).cfr_renamed_91();
    }

    private /* synthetic */ byte[] cfr_renamed_5632(spradf arg0) throws sprull {
        int n;
        byte[] byArray = arg0.cfr_renamed_91();
        int n2 = n = byArray.length - 1;
        while (n2 >= 0 && byArray[n] == 0) {
            n2 = --n;
        }
        if (n < 0 || byArray[n] != 1) {
            throw new sprull(sprzgp.cfr_renamed_9("zJ\\\u000bhJ\\OQE_\u0011\u0018BV]YGQO\u0018HQ[PNJ_]SL"));
        }
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 0, byArray2, 0, n);
        return byArray2;
    }

    private /* synthetic */ void cfr_renamed_5630(sprxxe arg0) {
        sprxxe sprxxe2 = arg0;
        this.cfr_renamed_0 = sprxxe2.cfr_renamed_1146();
        this.cfr_renamed_91 = sprxxe2.cfr_renamed_1150();
        this.cfr_renamed_2 = arg0.cfr_renamed_1144();
        this.cfr_renamed_4 = this.cfr_renamed_0 >> 3;
        this.cfr_renamed_1 = this.cfr_renamed_91 >> 3;
    }

    private /* synthetic */ void cfr_renamed_5631(sprhff arg0) {
        this.cfr_renamed_0 = arg0.cfr_renamed_1146();
        this.cfr_renamed_91 = arg0.cfr_renamed_1150();
        this.cfr_renamed_1 = this.cfr_renamed_91 >> 3;
        this.cfr_renamed_4 = this.cfr_renamed_0 >> 3;
    }

    public int cfr_renamed_5633(sprvcf arg0) {
        if (arg0 instanceof sprxxe) {
            return ((sprxxe)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof sprhff) {
            return ((sprhff)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(spraxo.cfr_renamed_9("j;l o%p'k0{uk,o0"));
    }
}

