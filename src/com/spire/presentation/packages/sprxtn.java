/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprjun;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvkp;

@sprtea
public class sprxtn
extends sprjun {
    private sprvkp cfr_renamed_3;
    private byte[] cfr_renamed_4 = new byte[1];

    public sprxtn(spreen arg0, byte[] arg1) {
        this(arg0, arg1, 0, arg1.length);
    }

    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[sprrgga.cfr_renamed_12461(arg2, 4192)];
        int n = arg2;
        while (n > 0) {
            int n2 = sprrgga.cfr_renamed_12461(arg2, byArray.length);
            sprxtn sprxtn2 = this;
            sprxtn2.cfr_renamed_3.cfr_renamed_10295(arg0, arg1, n2, byArray, 0);
            super.cfr_renamed_470().cfr_renamed_4924(byArray, 0, n2);
            arg1 += n2;
            n = arg2 -= n2;
        }
    }

    @Override
    public void cfr_renamed_11594(byte arg0) {
        sprxtn sprxtn2 = this;
        sprxtn2.cfr_renamed_4[0] = arg0;
        sprxtn2.cfr_renamed_4924(sprxtn2.cfr_renamed_4, 0, 1);
    }

    /*
     * WARNING - void declaration
     */
    public sprxtn(spreen spreen2, byte[] byArray, int n, int n2) {
        super(spreen2);
        void arg3;
        void arg2;
        void arg1;
        this.cfr_renamed_3 = new sprvkp();
        this.cfr_renamed_3.cfr_renamed_14924((byte[])arg1, (int)arg2, (int)arg3);
    }
}

