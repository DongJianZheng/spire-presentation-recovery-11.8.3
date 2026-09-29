/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvoy;
import com.spire.presentation.packages.sprxpe;
import com.spire.presentation.packages.sprzf;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;

public class sprojd
implements sprzf {
    private sprzmd cfr_renamed_3;
    private sprrkd cfr_renamed_4;

    @Override
    public BigInteger cfr_renamed_2501(sprt arg0) {
        sprmgd sprmgd2 = (sprmgd)arg0;
        if (!sprmgd2.cfr_renamed_284().equals(this.cfr_renamed_3)) {
            throw new IllegalArgumentException(sprxpe.cfr_renamed_9("Owmxb{&Vnrgsjp+n~|gwh>`{r>c\u007fx>|ldpl>{\u007fy\u007ff{\u007f{ym%"));
        }
        return sprmgd2.spr\u3181().modPow(this.cfr_renamed_4.cfr_renamed_1980(), this.cfr_renamed_3.cfr_renamed_1155());
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        sprhgb sprhgb2;
        if (!((arg0 instanceof spraed ? (sprhgb2 = (sprhgb)((spraed)arg0).cfr_renamed_284()) : (sprhgb2 = (sprhgb)arg0)) instanceof sprrkd)) {
            throw new IllegalArgumentException(sprvoy.cfr_renamed_9("\u0019\u0012\u00184:33?}?%*89))}\u001e\u0015\n/3+;)?\u0016?$\n<(<78.8(."));
        }
        this.cfr_renamed_4 = (sprrkd)sprhgb2;
        this.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_284();
    }

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155().bitLength() + 7) / 8;
    }
}

