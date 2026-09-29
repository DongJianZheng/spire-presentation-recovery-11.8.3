/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprlio;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxko;

@sprtea
public abstract class sprkoo
extends sprlio {
    public sprhio cfr_renamed_3;
    public sprxko cfr_renamed_4;

    public abstract void cfr_renamed_16237();

    public sprkoo(sprdfo arg0, sprlmo arg1) {
        super(arg0, arg1);
    }

    public abstract sprmrn cfr_renamed_5112();

    public abstract void cfr_renamed_16240();

    public void cfr_renamed_16239() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public sprmrn cfr_renamed_16202() {
        sprkoo sprkoo2 = this;
        spreen spreen2 = sprkoo2.cfr_renamed_16190().cfr_renamed_13232();
        spreen2.cfr_renamed_11548(this.cfr_renamed_16190().cfr_renamed_16191());
        sprkoo sprkoo3 = this;
        sprkoo2.cfr_renamed_3 = new sprhio(spreen2);
        this.cfr_renamed_4 = new sprxko(this.cfr_renamed_3);
        sprkoo2.cfr_renamed_16240();
        try {
            sprkoo sprkoo4;
            block8: {
                spreen spreen3 = spreen2;
                while (spreen3.cfr_renamed_3274() < spreen2.cfr_renamed_806()) {
                    if (this.cfr_renamed_16192().cfr_renamed_16193() && this.cfr_renamed_16194()) {
                        sprkoo4 = this;
                        break block8;
                    }
                    int n = 8;
                    if (spreen2.cfr_renamed_3274() + (long)n > spreen2.cfr_renamed_806()) {
                        sprkoo4 = this;
                        break block8;
                    }
                    sprkoo sprkoo5 = this;
                    sprkoo5.cfr_renamed_4.cfr_renamed_2933();
                    if (sprkoo5.cfr_renamed_4.cfr_renamed_2773() < (long)n) {
                        sprkoo4 = this;
                        break block8;
                    }
                    if (this.cfr_renamed_4.cfr_renamed_324() == 0) break;
                    if (this.cfr_renamed_4.cfr_renamed_324() == 14) {
                        sprkoo4 = this;
                        break block8;
                    }
                    sprkoo sprkoo6 = this;
                    sprkoo6.cfr_renamed_16237();
                    sprkoo6.cfr_renamed_4.cfr_renamed_16059();
                    spreen3 = spreen2;
                }
                sprkoo4 = this;
            }
            sprmrn sprmrn2 = sprkoo4.cfr_renamed_5112();
            return sprmrn2;
        }
        finally {
            this.cfr_renamed_16239();
        }
    }
}

