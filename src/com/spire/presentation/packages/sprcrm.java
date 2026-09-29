/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprybn;

public class sprcrm {
    public static sprybn[] cfr_renamed_11358(sprybn[] arg0) {
        sprybn[] sprybnArray = new sprybn[arg0.length];
        System.arraycopy(arg0, 0, sprybnArray, 0, arg0.length);
        return sprybnArray;
    }

    public static sprrdm[] cfr_renamed_11359(sprrdm[] arg0) {
        sprrdm[] sprrdmArray = new sprrdm[arg0.length];
        System.arraycopy(arg0, 0, sprrdmArray, 0, arg0.length);
        return sprrdmArray;
    }

    public static sprybn[] cfr_renamed_11360(sprszm arg0) {
        int n;
        sprybn[] sprybnArray = new sprybn[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            sprybnArray[n3] = sprybn.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprybnArray;
    }
}

