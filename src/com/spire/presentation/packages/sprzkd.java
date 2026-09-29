/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprpld;
import java.math.BigInteger;

public class sprzkd
extends sprpld {
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzkd(BigInteger bigInteger, sprpgd sprpgd2) {
        super(false, (sprpgd)arg1);
        void arg1;
        this.cfr_renamed_4 = bigInteger;
    }

    public BigInteger spr\u3181() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprzkd)) {
            return false;
        }
        return ((sprzkd)arg0).spr\u3181().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }
}

