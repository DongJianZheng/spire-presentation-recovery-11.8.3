/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprnnp;

public final class sprrvf
extends Enum<sprrvf> {
    private static final /* synthetic */ sprrvf[] cfr_renamed_1;
    public static final /* enum */ sprrvf cfr_renamed_2;
    public static final /* enum */ sprrvf cfr_renamed_3;
    public static final /* enum */ sprrvf cfr_renamed_4;

    public static sprrvf[] values() {
        return (sprrvf[])cfr_renamed_1.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ sprrvf() {
        void arg1;
        void arg0;
    }

    public static sprrvf valueOf(String arg0) {
        return Enum.valueOf(sprrvf.class, arg0);
    }

    static {
        cfr_renamed_4 = new sprrvf(sprfke.cfr_renamed_9("\bv\ni\u0018s\b"), 0);
        cfr_renamed_2 = new sprrvf(sprnnp.cfr_renamed_9("\u001d\u0001\f\u000b\u000b\u0005\u0004\r\u0010\u0001\n\u0000\u001f\u0004"), 1);
        cfr_renamed_3 = new sprrvf(sprfke.cfr_renamed_9("y\u0004w\u001bh\u000ei\u0018\u007f\u000f"), 2);
        sprrvf[] sprrvfArray = new sprrvf[3];
        sprrvfArray[0] = cfr_renamed_4;
        sprrvfArray[1] = cfr_renamed_2;
        sprrvfArray[2] = cfr_renamed_3;
        cfr_renamed_1 = sprrvfArray;
    }
}

