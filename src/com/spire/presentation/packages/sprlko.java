/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprpno;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsap;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprteo;

@sprtea
public class sprlko
extends sprpno {
    private sprqgp cfr_renamed_0;
    private sprggo cfr_renamed_1;
    private sprqgp cfr_renamed_2;
    private sprqgp cfr_renamed_3;
    private float cfr_renamed_4;

    public float cfr_renamed_16710() {
        return this.cfr_renamed_4;
    }

    public sprlko(sprggo sprggo2) {
        sprlko sprlko2 = this;
        sprlko sprlko3 = this;
        this.cfr_renamed_3 = new sprqgp();
        sprlko3.cfr_renamed_2 = new sprqgp();
        sprlko2.cfr_renamed_4 = 1.0f;
        sprlko2.cfr_renamed_1 = sprggo2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16717(sprteo sprteo2) {
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_3 = v0.cfr_renamed_16716();
        this.cfr_renamed_2 = v0.cfr_renamed_16715();
        this.cfr_renamed_0 = null;
        this.cfr_renamed_16293();
    }

    public void cfr_renamed_16633(int arg0, double arg1) {
        float f;
        sprlko sprlko2 = this;
        sprlko2.cfr_renamed_3 = new sprqgp();
        float f2 = f = (float)this.cfr_renamed_1.cfr_renamed_16559().cfr_renamed_16520(arg1, arg0);
        sprlko2.cfr_renamed_3.cfr_renamed_13534(f2, f2);
        sprlko2.cfr_renamed_4 = f;
        sprlko2.cfr_renamed_0 = null;
        sprlko2.cfr_renamed_16293();
    }

    public void cfr_renamed_16315(sprqgp arg0, int arg1) {
        switch (arg1) {
            case 1: {
                while (false) {
                }
                sprlko sprlko2 = this;
                this.cfr_renamed_2 = new sprqgp();
                break;
            }
            case 2: {
                sprlko sprlko3 = this;
                sprlko sprlko2 = sprlko3;
                sprlko3.cfr_renamed_2.cfr_renamed_12634(arg0, 0);
                break;
            }
            case 3: {
                sprlko sprlko4 = this;
                sprlko sprlko2 = sprlko4;
                sprlko4.cfr_renamed_2.cfr_renamed_12634(arg0, 1);
                break;
            }
            case 4: {
                sprlko sprlko2 = this;
                this.cfr_renamed_2 = arg0;
                break;
            }
            default: {
                throw new IllegalArgumentException(sprsap.cfr_renamed_9("y][]DY]Y[\u001cG]DY\u0013\u001cDSMY"));
            }
        }
        sprlko2.cfr_renamed_0 = null;
        this.cfr_renamed_16293();
    }

    public sprteo cfr_renamed_16317() {
        return new sprteo(this.cfr_renamed_3.cfr_renamed_12099(), this.cfr_renamed_2.cfr_renamed_12099());
    }

    @Override
    public sprqgp cfr_renamed_16312() {
        if (this.cfr_renamed_0 == null) {
            sprlko sprlko2 = this;
            sprlko2.cfr_renamed_0 = sprlko2.cfr_renamed_2.cfr_renamed_12099();
            sprlko2.cfr_renamed_0.cfr_renamed_12634(this.cfr_renamed_3, 1);
        }
        return this.cfr_renamed_0;
    }
}

