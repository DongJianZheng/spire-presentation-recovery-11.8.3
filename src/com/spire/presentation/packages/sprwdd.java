/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprmdd;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwnd;

public class sprwdd
extends sprmdd {
    @Override
    public sprwnd cfr_renamed_1223() {
        sprwnd sprwnd2 = super.cfr_renamed_1223();
        sprwmd sprwmd2 = (sprwmd)sprwnd2.cfr_renamed_1224();
        spreed spreed2 = (spreed)sprwnd2.cfr_renamed_1225();
        sprwmd2 = new sprwmd(sprwmd2.cfr_renamed_1604().cfr_renamed_1773(), sprwmd2.cfr_renamed_284());
        return new sprwnd(sprwmd2, spreed2);
    }
}

