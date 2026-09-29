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
import com.spire.presentation.packages.sprubd;
import com.spire.presentation.packages.sprvtc;
import com.spire.presentation.packages.sprza;
import java.io.IOException;

public class spraza
extends sprebb {
    private sprza cfr_renamed_4;

    @Override
    public sprhgb cfr_renamed_1580(sprdce arg0) throws IOException {
        return sprhcd.cfr_renamed_1531(arg0);
    }

    @Override
    public sprta cfr_renamed_1581(sprije arg0) throws sprfya {
        spraza spraza2 = this;
        sprije sprije2 = spraza2.cfr_renamed_4.cfr_renamed_1572(arg0);
        sprko sprko2 = spraza2.cfr_renamed_4.cfr_renamed_578(sprije2);
        return new sprubd(new sprvtc(), sprko2);
    }

    public spraza(sprza sprza2) {
        this.cfr_renamed_4 = sprza2;
    }
}

