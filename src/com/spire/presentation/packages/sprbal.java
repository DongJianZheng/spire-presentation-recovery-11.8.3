/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprolj;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprruk;
import com.spire.presentation.packages.sprtcea;

public class sprbal
extends sprruk {
    @Override
    public String cfr_renamed_1315() {
        return sprolj.cfr_renamed_9("\u0014g-X?U~\u0004");
    }

    @Override
    public int cfr_renamed_3540() {
        return 24;
    }

    @Override
    public void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprtcea.cfr_renamed_9("43{2g93#4$a'd8f#4%qz}9}#4 }#|wz\"x;4<q.")).toString());
        }
        if (arg0.length != 32) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprolj.cfr_renamed_9("\u0014>Q=A%F)GlUl\u0006y\u0002lV%@l_)M")).toString());
        }
        super.cfr_renamed_3471(arg0, arg1);
        sprpxe.cfr_renamed_438(arg1, 8, this.cfr_renamed_2, 8, 2);
        int[] nArray = new int[this.cfr_renamed_2.length];
        sprbal.cfr_renamed_3498(20, this.cfr_renamed_2, nArray);
        sprbal sprbal2 = this;
        sprbal2.cfr_renamed_2[1] = nArray[0] - this.cfr_renamed_2[0];
        sprbal2.cfr_renamed_2[2] = nArray[5] - this.cfr_renamed_2[5];
        sprbal2.cfr_renamed_2[3] = nArray[10] - this.cfr_renamed_2[10];
        sprbal2.cfr_renamed_2[4] = nArray[15] - this.cfr_renamed_2[15];
        sprbal2.cfr_renamed_2[11] = nArray[6] - this.cfr_renamed_2[6];
        sprbal2.cfr_renamed_2[12] = nArray[7] - this.cfr_renamed_2[7];
        sprbal2.cfr_renamed_2[13] = nArray[8] - this.cfr_renamed_2[8];
        sprbal2.cfr_renamed_2[14] = nArray[9] - this.cfr_renamed_2[9];
        sprpxe.cfr_renamed_438(arg1, 16, this.cfr_renamed_2, 6, 2);
    }
}

