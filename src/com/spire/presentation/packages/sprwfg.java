/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spridr;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprsx;
import com.spire.presentation.packages.sprtpk;

public class sprwfg {
    public static sprddm cfr_renamed_7481(sprtpk arg0) {
        sprlem sprlem2;
        int n = arg0.cfr_renamed_1521().length * 8;
        if (n == 128) {
            sprlem2 = sprsx.cfr_renamed_91;
        } else if (n == 192) {
            sprlem2 = sprsx.cfr_renamed_0;
        } else if (n == 256) {
            sprlem2 = sprsx.cfr_renamed_3;
        } else {
            throw new IllegalArgumentException(spridr.cfr_renamed_9("-\u0006(\u000f#\u000b(J/\u000f=\u0019-\u0010!J-\u0004d)%\u0007!\u0006(\u0003%"));
        }
        return new sprddm(sprlem2);
    }
}

