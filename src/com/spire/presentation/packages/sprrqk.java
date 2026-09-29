/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprtpk;

public class sprrqk
extends sprkuh {
    private final sprgf cfr_renamed_4;

    public sprrqk(sprgf sprgf2) {
        this.cfr_renamed_4 = sprgf2;
    }

    @Override
    public sprbj cfr_renamed_1523(int arg0) {
        return this.cfr_renamed_249(arg0);
    }

    public sprrqk() {
        this(sprkkk.cfr_renamed_9216());
    }

    public void cfr_renamed_1608(byte[] arg0, byte[] arg1) {
        super.cfr_renamed_1515(arg0, arg1, 1);
    }

    @Override
    public sprbj cfr_renamed_249(int arg0) {
        byte[] byArray = this.cfr_renamed_3504(arg0 /= 8);
        return new sprtpk(byArray, 0, arg0);
    }

    @Override
    public sprbj cfr_renamed_1518(int arg0, int arg1) {
        byte[] byArray = this.cfr_renamed_3504((arg0 /= 8) + (arg1 /= 8));
        return new sprkpk(new sprtpk(byArray, 0, arg0), byArray, arg0, arg1);
    }

    private /* synthetic */ byte[] cfr_renamed_3504(int arg0) {
        sprrqk sprrqk2 = this;
        sprrqk sprrqk3 = sprrqk2;
        byte[] byArray = new byte[sprrqk2.cfr_renamed_4.cfr_renamed_1218()];
        byte[] byArray2 = new byte[arg0];
        int n = 0;
        while (true) {
            sprrqk3.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            sprrqk sprrqk4 = this;
            sprrqk4.cfr_renamed_4.cfr_renamed_1197(sprrqk4.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            int n2 = arg0 > byArray.length ? byArray.length : arg0;
            System.arraycopy(byArray, 0, byArray2, n, n2);
            n += n2;
            if ((arg0 -= n2) == 0) {
                return byArray2;
            }
            sprrqk sprrqk5 = this;
            sprrqk5.cfr_renamed_4.cfr_renamed_41();
            sprrqk5.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
            sprrqk3 = this;
        }
    }
}

