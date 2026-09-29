/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgo;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spraio
extends sprcgo {
    @Override
    public int cfr_renamed_16232(int arg0) {
        return 1;
    }

    @Override
    public String cfr_renamed_14565(byte[] arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder(arg0.length);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = arg0[n] & 0xFF;
            stringBuilder.append((char)(n3 + 61440));
            n2 = ++n;
        }
        return stringBuilder.toString();
    }

    @Override
    public String cfr_renamed_16261(byte[] arg0) {
        return sprszca.cfr_renamed_12817(1252).cfr_renamed_14565(arg0);
    }
}

