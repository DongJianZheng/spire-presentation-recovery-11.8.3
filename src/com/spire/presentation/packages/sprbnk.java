/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprudl;
import com.spire.presentation.packages.sprux;
import com.spire.presentation.packages.sprwil;

public class sprbnk
implements sprux {
    private final sprudl cfr_renamed_3;
    private final sprwil cfr_renamed_4;

    public sprbnk() {
        sprbnk sprbnk2 = this;
        this.cfr_renamed_4 = new sprwil();
        sprbnk2.cfr_renamed_3 = new sprudl();
    }

    @Override
    public boolean cfr_renamed_9689(byte[] arg0, byte[] arg1) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
        sprbnk sprbnk2 = this;
        byte[] byArray = new byte[sprbnk2.cfr_renamed_4.cfr_renamed_1218()];
        sprbnk2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        if (!sproze.cfr_renamed_559(byArray, arg1)) {
            if (arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                this.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
                sproze.cfr_renamed_492(byArray, (byte)0);
                this.cfr_renamed_3.cfr_renamed_1219(byArray, 4);
                return sproze.cfr_renamed_559(byArray, arg1);
            }
            return false;
        }
        return true;
    }
}

