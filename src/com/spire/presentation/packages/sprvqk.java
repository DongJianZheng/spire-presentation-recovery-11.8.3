/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreyc;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvsz;

public class sprvqk
extends sprkuh {
    private sprgf cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_3506() {
        sprvqk sprvqk2 = this;
        byte[] byArray = new byte[sprvqk2.cfr_renamed_4.cfr_renamed_1218()];
        sprvqk2.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        sprvqk sprvqk3 = this;
        sprvqk3.cfr_renamed_4.cfr_renamed_1197(sprvqk3.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        int n = 1;
        int n2 = n;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            n2 = ++n;
        }
        return byArray;
    }

    @Override
    public sprbj cfr_renamed_1518(int arg0, int arg1) {
        if ((arg0 /= 8) + (arg1 /= 8) > this.cfr_renamed_4.cfr_renamed_1218()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvsz.cfr_renamed_9("LKa\r{\nhOaO}K{O/K/NjXf\\jN/AjS/")).append(arg0 + arg1).append(spreyc.cfr_renamed_9("\u001daDwXp\u001doRmZ-")).toString());
        }
        byte[] byArray = this.cfr_renamed_3506();
        return new sprkpk(new sprtpk(byArray, 0, arg0), byArray, arg0, arg1);
    }

    @Override
    public sprbj cfr_renamed_249(int arg0) {
        if ((arg0 /= 8) > this.cfr_renamed_4.cfr_renamed_1218()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvsz.cfr_renamed_9("LKa\r{\nhOaO}K{O/K/NjXf\\jN/AjS/")).append(arg0).append(spreyc.cfr_renamed_9("\u001daDwXp\u001doRmZ-")).toString());
        }
        byte[] byArray = this.cfr_renamed_3506();
        return new sprtpk(byArray, 0, arg0);
    }

    public sprvqk(sprgf sprgf2) {
        this.cfr_renamed_4 = sprgf2;
    }

    @Override
    public sprbj cfr_renamed_1523(int arg0) {
        return this.cfr_renamed_249(arg0);
    }
}

