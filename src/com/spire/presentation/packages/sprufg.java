/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqvca;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwr;

public class sprufg {
    public static sprddm cfr_renamed_7481(sprtpk arg0) {
        sprlem sprlem2;
        int n = arg0.cfr_renamed_1521().length * 8;
        if (n == 128) {
            sprlem2 = sprwr.cfr_renamed_136;
        } else if (n == 192) {
            sprlem2 = sprwr.cfr_renamed_287;
        } else if (n == 256) {
            sprlem2 = sprwr.cfr_renamed_3;
        } else {
            throw new IllegalArgumentException(sprqvca.cfr_renamed_9("\f#\t*\u0002.\to\u000e*\u001c<\f5\u0000o\f!E\u000e \u001c"));
        }
        return new sprddm(sprlem2);
    }
}

