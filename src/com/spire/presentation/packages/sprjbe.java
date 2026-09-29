/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmhe;
import com.spire.presentation.packages.sprnke;
import com.spire.presentation.packages.sprok;
import com.spire.presentation.packages.spruhe;

public class sprjbe
extends sprmhe {
    public static final sprok cfr_renamed_84 = new sprjbe();

    @Override
    public boolean cfr_renamed_3220(spruhe arg0, spruhe arg1) {
        int n;
        sprnke[] sprnkeArray;
        sprnke[] sprnkeArray2 = arg0.cfr_renamed_4544();
        if (sprnkeArray2.length != (sprnkeArray = arg1.cfr_renamed_4544()).length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 != sprnkeArray2.length) {
            if (!this.cfr_renamed_4559(sprnkeArray2[n], sprnkeArray[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }
}

