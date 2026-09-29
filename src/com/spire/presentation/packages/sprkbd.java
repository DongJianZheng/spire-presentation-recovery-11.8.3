/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprxmaa;
import com.spire.presentation.packages.sprzra;

public class sprkbd
implements sprta {
    private final sprlc cfr_renamed_2;
    private boolean cfr_renamed_3;
    private final sprh cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_1329() throws sprvmd, sprjkd {
        if (!this.cfr_renamed_3) {
            throw new IllegalStateException(sprokp.cfr_renamed_9("\u001aq3q/}>G4s3q/43{)44z4`4u1}.q94;{/4.}:z<`(f84:q3q/u)}2zs"));
        }
        sprkbd sprkbd2 = this;
        byte[] byArray = new byte[sprkbd2.cfr_renamed_2.cfr_renamed_1218()];
        sprkbd2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return sprkbd2.cfr_renamed_4.cfr_renamed_1337(byArray, 0, byArray.length);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprkbd(sprh sprh2, sprlc sprlc2) {
        void arg0;
        sprkbd sprkbd2 = this;
        sprkbd2.cfr_renamed_4 = arg0;
        sprkbd2.cfr_renamed_2 = sprlc2;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_2.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_3) {
            throw new IllegalStateException(sprxmaa.cfr_renamed_9("7S\u001eS\u0002_\u0013e\u0019Q\u001eS\u0002\u0016\u001eY\u0004\u0016\u0019X\u0019B\u0019W\u001c_\u0003S\u0014\u0016\u0016Y\u0002\u0016\u0006S\u0002_\u0016_\u0013W\u0004_\u001fX"));
        }
        sprkbd sprkbd2 = this;
        byte[] byArray = new byte[sprkbd2.cfr_renamed_2.cfr_renamed_1218()];
        sprkbd2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2 = this.cfr_renamed_4.cfr_renamed_1337(arg0, 0, arg0.length);
            return sprzra.cfr_renamed_559(byArray2, byArray);
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprokp.cfr_renamed_9("g4s3}3s}f8e(}/q.4-f4b<`846q$"));
        }
        if (arg0 == false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprxmaa.cfr_renamed_9("\u0006S\u0002_\u0016_\u0013W\u0004_\u001fXPD\u0015G\u0005_\u0002S\u0003\u0016\u0000C\u0012Z\u0019UP]\u0015O"));
        }
        sprkbd sprkbd2 = this;
        sprkbd2.cfr_renamed_41();
        sprkbd2.cfr_renamed_4.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }
}

