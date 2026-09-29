/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprhyo;
import com.spire.presentation.packages.sprqdd;
import com.spire.presentation.packages.sprtsa;

public class sprsnd
extends sprqdd {
    @Override
    public void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprhyo.cfr_renamed_9("5MzLfG2]5Z`YeFg]5[p\u0004|G|]5^|]}\t{\\yE5BpP")).toString());
        }
        if (arg0.length != 32) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprfvca.cfr_renamed_9("\r H#X;_7^rLr\u001fg\u001brO;YrF7T")).toString());
        }
        sprsnd sprsnd2 = this;
        super.cfr_renamed_3471(arg0, arg1);
        sprsnd2.cfr_renamed_132[8] = sprtsa.cfr_renamed_439(arg1, 8);
        sprsnd2.cfr_renamed_132[9] = sprtsa.cfr_renamed_439(arg1, 12);
        int[] nArray = new int[sprsnd2.cfr_renamed_132.length];
        sprsnd.cfr_renamed_3498(20, this.cfr_renamed_132, nArray);
        sprsnd sprsnd3 = this;
        sprsnd3.cfr_renamed_132[1] = nArray[0] - this.cfr_renamed_132[0];
        sprsnd3.cfr_renamed_132[2] = nArray[5] - this.cfr_renamed_132[5];
        sprsnd3.cfr_renamed_132[3] = nArray[10] - this.cfr_renamed_132[10];
        sprsnd3.cfr_renamed_132[4] = nArray[15] - this.cfr_renamed_132[15];
        sprsnd3.cfr_renamed_132[11] = nArray[6] - this.cfr_renamed_132[6];
        sprsnd3.cfr_renamed_132[12] = nArray[7] - this.cfr_renamed_132[7];
        sprsnd3.cfr_renamed_132[13] = nArray[8] - this.cfr_renamed_132[8];
        sprsnd3.cfr_renamed_132[14] = nArray[9] - this.cfr_renamed_132[9];
        sprsnd3.cfr_renamed_132[6] = sprtsa.cfr_renamed_439(arg1, 16);
        sprsnd3.cfr_renamed_132[7] = sprtsa.cfr_renamed_439(arg1, 20);
    }

    @Override
    public int cfr_renamed_3540() {
        return 24;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprhyo.cfr_renamed_9("MztEfH'\u0019");
    }
}

