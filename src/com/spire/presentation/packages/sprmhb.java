/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprebb;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprza;
import com.spire.presentation.packages.sprzvc;
import java.io.IOException;

public class sprmhb
extends sprebb {
    private sprza cfr_renamed_4;

    public sprmhb(sprza sprza2) {
        this.cfr_renamed_4 = sprza2;
    }

    @Override
    public sprhgb cfr_renamed_1580(sprdce arg0) throws IOException {
        return sprhcd.cfr_renamed_1531(arg0);
    }

    @Override
    public sprta cfr_renamed_1581(sprije arg0) throws sprfya {
        sprmhb sprmhb2 = this;
        sprije sprije2 = sprmhb2.cfr_renamed_4.cfr_renamed_1572(arg0);
        sprko sprko2 = sprmhb2.cfr_renamed_4.cfr_renamed_578(sprije2);
        return new sprzvc(sprko2);
    }
}

