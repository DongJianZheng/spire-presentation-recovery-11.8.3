/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprlfg;

public class sprunm
extends sprdye {
    public static final int cfr_renamed_112 = 2;
    public static final int cfr_renamed_119 = 1;
    public static final int cfr_renamed_91 = 64;
    public static final int cfr_renamed_0 = 8;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 16;
    public static final int cfr_renamed_3 = 128;
    public static final int cfr_renamed_4 = 32;

    public sprunm(int arg0) {
        super(sprunm.cfr_renamed_4491(arg0), sprunm.cfr_renamed_4492(arg0));
    }

    public boolean cfr_renamed_4249(int arg0) {
        return (this.cfr_renamed_1868() & arg0) == arg0;
    }

    @Override
    public String toString() {
        return new StringBuilder().insert(0, sprlfg.cfr_renamed_9("<g\u0006q\u0011c\u0002g1g\u0000v&{\u0002gH\"Bz")).append(Integer.toHexString(this.cfr_renamed_1868())).toString();
    }

    public sprunm(sprgbf arg0) {
        super(arg0.cfr_renamed_81(), arg0.cfr_renamed_106());
    }
}

