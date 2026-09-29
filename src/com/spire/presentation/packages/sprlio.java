/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkfa;

@sprtea
public abstract class sprlio {
    private sprdfo cfr_renamed_1;
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprlmo cfr_renamed_4;

    public sprqt cfr_renamed_12479() {
        return this.cfr_renamed_16192().cfr_renamed_12479();
    }

    @sprtea
    public sprmrn cfr_renamed_13697(boolean arg0) {
        return this.cfr_renamed_16241(arg0, true);
    }

    public boolean cfr_renamed_16227() {
        return this.cfr_renamed_2;
    }

    public abstract sprmrn cfr_renamed_16202();

    /*
     * WARNING - void declaration
     */
    public sprlio(sprdfo sprdfo2, sprlmo sprlmo2) {
        void arg1;
        sprlio sprlio2 = this;
        sprlio2.cfr_renamed_4 = arg1;
        sprlio2.cfr_renamed_1 = sprdfo2;
    }

    public boolean cfr_renamed_16194() {
        return this.cfr_renamed_3;
    }

    public sprlmo cfr_renamed_16192() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprdfo cfr_renamed_16190() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public sprmrn cfr_renamed_16241(boolean arg0, boolean arg1) {
        try {
            sprlio sprlio2 = this;
            sprlio2.cfr_renamed_3 = arg0;
            sprlio2.cfr_renamed_2 = arg1;
            return this.cfr_renamed_16202();
        }
        catch (Exception exception) {
            sprlio sprlio3 = this;
            sprlio3.cfr_renamed_12479().cfr_renamed_12475(2, 3, sprtkfa.cfr_renamed_9("I\u0017p\u0013b\u001bh\u0017$\u0011e\u001cj\u001dpRf\u0017$\u0002v\u001dg\u0017w\u0001a\u0016>R\u007fBy"), exception.getMessage());
            sprlio3.cfr_renamed_16192().cfr_renamed_16212(true);
            return null;
        }
    }
}

