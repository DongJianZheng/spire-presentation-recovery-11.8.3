/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprlok;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprplk;
import com.spire.presentation.packages.sprqgk;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwhg;
import com.spire.presentation.packages.spryye;
import java.io.IOException;

public class sprzpg
extends sprwhg {
    private sprve cfr_renamed_4;

    @Override
    public sprvm cfr_renamed_7483(sprddm arg0) throws sprhjg {
        sprzpg sprzpg2 = this;
        sprddm sprddm2 = sprzpg2.cfr_renamed_4.cfr_renamed_7475(arg0);
        sprpl sprpl2 = sprzpg2.cfr_renamed_4.cfr_renamed_5279(sprddm2);
        return new sprlok(new sprplk(), sprpl2);
    }

    public sprzpg(sprve sprve2) {
        this.cfr_renamed_4 = sprve2;
    }

    @Override
    public spryye cfr_renamed_7482(sprvhm arg0) throws IOException {
        return sprqgk.cfr_renamed_5660(arg0);
    }
}

