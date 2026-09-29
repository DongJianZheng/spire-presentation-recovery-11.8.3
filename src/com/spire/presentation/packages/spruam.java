/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.spruu;
import com.spire.presentation.packages.sprxjm;

public class spruam
extends sprebm {
    public static final spruu cfr_renamed_956 = new spruam();

    @Override
    public boolean cfr_renamed_11158(sprnbm arg0, sprnbm arg1) {
        int n;
        sprxjm[] sprxjmArray;
        sprxjm[] sprxjmArray2 = arg0.cfr_renamed_4544();
        if (sprxjmArray2.length != (sprxjmArray = arg1.cfr_renamed_4544()).length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != sprxjmArray2.length) {
            if (!this.cfr_renamed_11178(sprxjmArray2[n], sprxjmArray[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }
}

