/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjuaa;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprwvj;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Date;

public class sprkxm
extends sprjfn {
    public sprkxm(Date arg0) {
        super(arg0);
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 24, this.cfr_renamed_11304());
    }

    public sprkxm(byte[] arg0) {
        super(arg0);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_11304().length);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return this;
    }

    public sprkxm(String arg0) {
        super(arg0);
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    private /* synthetic */ byte[] cfr_renamed_11304() {
        sprkxm sprkxm2 = this;
        if (sprkxm2.cfr_renamed_3[sprkxm2.cfr_renamed_3.length - 1] == 90) {
            if (!this.cfr_renamed_11305()) {
                byte[] byArray = new byte[this.cfr_renamed_3.length + 4];
                System.arraycopy(this.cfr_renamed_3, 0, byArray, 0, this.cfr_renamed_3.length - 1);
                System.arraycopy(sprkoe.cfr_renamed_433(sprwvj.cfr_renamed_9("_|_|5")), 0, byArray, this.cfr_renamed_3.length - 1, 5);
                return byArray;
            }
            if (!this.cfr_renamed_11306()) {
                byte[] byArray = new byte[this.cfr_renamed_3.length + 2];
                System.arraycopy(this.cfr_renamed_3, 0, byArray, 0, this.cfr_renamed_3.length - 1);
                System.arraycopy(sprkoe.cfr_renamed_433(sprjuaa.cfr_renamed_9("rC\u0018")), 0, byArray, this.cfr_renamed_3.length - 1, 3);
                return byArray;
            }
            if (this.cfr_renamed_4940()) {
                byte[] byArray;
                int n;
                int n2 = n = this.cfr_renamed_3.length - 2;
                while (n2 > 0 && this.cfr_renamed_3[n] == 48) {
                    n2 = --n;
                }
                if (this.cfr_renamed_3[n] == 46) {
                    byte[] byArray2;
                    byte[] byArray3 = byArray2 = new byte[n + 1];
                    System.arraycopy(this.cfr_renamed_3, 0, byArray3, 0, n);
                    byArray3[n] = 90;
                    return byArray2;
                }
                byte[] byArray4 = byArray = new byte[n + 2];
                System.arraycopy(this.cfr_renamed_3, 0, byArray4, 0, n + 1);
                byArray4[n + 1] = 90;
                return byArray;
            }
            return this.cfr_renamed_3;
        }
        return this.cfr_renamed_3;
    }
}

