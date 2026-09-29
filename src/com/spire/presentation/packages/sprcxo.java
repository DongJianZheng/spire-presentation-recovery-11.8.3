/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhqo;
import com.spire.presentation.packages.sprjap;
import com.spire.presentation.packages.sprjt;
import com.spire.presentation.packages.sprkap;
import com.spire.presentation.packages.sprppo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprcxo {
    private sprvrx cfr_renamed_4;

    @sprtea
    public sprkap cfr_renamed_17365() {
        sprkap sprkap2;
        sprkap sprkap3 = sprkap2 = new sprkap();
        this.cfr_renamed_17346().add(sprkap3);
        return sprkap3;
    }

    @sprtea
    public sprjap cfr_renamed_17366() {
        sprjap sprjap2;
        sprjap sprjap3 = sprjap2 = new sprjap();
        this.cfr_renamed_17346().add(sprjap3);
        return sprjap3;
    }

    @sprtea
    public void cfr_renamed_11665() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_17346().iterator();
        while (iterator2.hasNext()) {
            ((sprjt)iterator.next()).cfr_renamed_2637();
            iterator2 = iterator;
        }
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.clear();
            this.cfr_renamed_4 = null;
        }
    }

    @sprtea
    public sprhqo cfr_renamed_17367() {
        sprhqo sprhqo2;
        sprhqo sprhqo3 = sprhqo2 = new sprhqo();
        this.cfr_renamed_17346().add(sprhqo3);
        return sprhqo3;
    }

    @sprtea
    public sprppo cfr_renamed_17368() {
        sprppo sprppo2;
        sprppo sprppo3 = sprppo2 = new sprppo();
        this.cfr_renamed_17346().add(sprppo3);
        return sprppo3;
    }

    @sprtea
    public void cfr_renamed_17369(sprvrx arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public sprvrx<sprjt> cfr_renamed_17346() {
        if (this.cfr_renamed_4 == null) {
            sprcxo sprcxo2 = this;
            sprcxo2.cfr_renamed_4 = new sprvrx();
        }
        return this.cfr_renamed_4;
    }
}

