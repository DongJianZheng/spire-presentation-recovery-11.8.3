/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreap;
import com.spire.presentation.packages.sprjt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprppo
implements sprjt {
    private sprtvp cfr_renamed_3;
    private sprvrx<spreap> cfr_renamed_4;

    @sprtea
    public sprtvp cfr_renamed_17323() {
        if (this.cfr_renamed_3 == null) {
            sprppo sprppo2 = this;
            sprppo2.cfr_renamed_3 = new sprtvp();
        }
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_2637() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_6328().iterator();
        while (iterator2.hasNext()) {
            ((spreap)iterator.next()).cfr_renamed_2637();
            iterator2 = iterator;
        }
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.clear();
            this.cfr_renamed_4 = null;
        }
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_722();
            this.cfr_renamed_3 = null;
        }
    }

    @sprtea
    public spreap cfr_renamed_17324() {
        spreap spreap2;
        spreap spreap3 = spreap2 = new spreap();
        this.cfr_renamed_6328().add(spreap3);
        return spreap3;
    }

    @sprtea
    public void cfr_renamed_17325(sprtvp arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public void cfr_renamed_17326(sprvrx<spreap> arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public sprvrx<spreap> cfr_renamed_6328() {
        if (this.cfr_renamed_4 == null) {
            sprppo sprppo2 = this;
            sprppo2.cfr_renamed_4 = new sprvrx();
        }
        return this.cfr_renamed_4;
    }
}

