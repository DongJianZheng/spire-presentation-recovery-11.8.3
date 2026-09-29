/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgxf;
import com.spire.presentation.packages.sprsag;
import com.spire.presentation.packages.spruin;
import com.spire.presentation.packages.sprvei;

public class sprmwf
extends sprsag
implements sprgf {
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[64];
        this.cfr_renamed_6018(byArray);
        sprmwf.cfr_renamed_6041(byArray, 8, this.cfr_renamed_1, 8, arg0, arg1, 8);
        sprmwf.cfr_renamed_6041(byArray2, 24, this.cfr_renamed_1, 24, arg0, arg1 + 8, 16);
        sprmwf.cfr_renamed_6041(byArray, 48, this.cfr_renamed_1, 48, arg0, arg1 + 24, 8);
        this.cfr_renamed_41();
        return byArray2.length;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_2 > 63) {
            throw new IllegalArgumentException(spruin.cfr_renamed_9("l\nl\u0004tEq\u000bh\u0010lE{\u0004v\u000bw\u00118\u0007}Eu\nj\u00008\u0011p\u0004vE.Q8\u0007a\u0011}\u0016"));
        }
        this.cfr_renamed_1[this.cfr_renamed_2++] = arg0;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprvei.cfr_renamed_9("N2t2m2U~3b4");
    }

    @Override
    public void cfr_renamed_41() {
        super.cfr_renamed_41();
    }

    public sprmwf(sprgxf sprgxf2) {
        this.cfr_renamed_3 = sprgxf2.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_2 > 64 - arg2) {
            throw new IllegalArgumentException(spruin.cfr_renamed_9("l\nl\u0004tEq\u000bh\u0010lE{\u0004v\u000bw\u00118\u0007}Eu\nj\u00008\u0011p\u0004vE.Q8\u0007a\u0011}\u0016"));
        }
        sprmwf sprmwf2 = this;
        System.arraycopy(arg0, arg1, sprmwf2.cfr_renamed_1, sprmwf2.cfr_renamed_2, arg2);
        this.cfr_renamed_2 += arg2;
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }
}

