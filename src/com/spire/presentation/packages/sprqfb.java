/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprae;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvye;

public class sprqfb {
    public static sprije cfr_renamed_1578(sprnld arg0) {
        sprtzd sprtzd2;
        int n = arg0.cfr_renamed_1521().length * 8;
        if (n == 128) {
            sprtzd2 = sprae.cfr_renamed_4;
        } else if (n == 192) {
            sprtzd2 = sprae.cfr_renamed_0;
        } else if (n == 256) {
            sprtzd2 = sprae.cfr_renamed_91;
        } else {
            throw new IllegalArgumentException(sprvye.cfr_renamed_9("\u0014\u0001\u0011\b\u001a\f\u0011M\u0016\b\u0004\u001e\u0014\u0017\u0018M\u0014\u0003].\u001c\u0000\u0018\u0001\u0011\u0004\u001c"));
        }
        return new sprije(sprtzd2);
    }
}

