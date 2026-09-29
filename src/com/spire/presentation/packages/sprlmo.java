/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwp;
import com.spire.presentation.packages.sprxdn;

@sprtea
public class sprlmo
implements sprwp {
    private spriy cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprwp cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlmo(spriy spriy2, sprwp sprwp2) {
        void arg0;
        sprlmo sprlmo2 = this;
        sprlmo2.cfr_renamed_2 = arg0;
        sprlmo2.cfr_renamed_4 = sprwp2;
    }

    public boolean cfr_renamed_16193() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprqt cfr_renamed_12479() {
        if (this.cfr_renamed_4 == null) {
            return sprxdn.cfr_renamed_4;
        }
        return this.cfr_renamed_4.cfr_renamed_12479();
    }

    public void cfr_renamed_16212(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprlmo(spriy arg0) {
        this(arg0, null);
    }

    public spriy cfr_renamed_13400() {
        return this.cfr_renamed_2;
    }
}

