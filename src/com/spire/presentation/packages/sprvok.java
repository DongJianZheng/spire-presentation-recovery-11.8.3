/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprseaa;
import com.spire.presentation.packages.sprzbp;

public final class sprvok
extends Enum<sprvok> {
    private final int cfr_renamed_91;
    public static final /* enum */ sprvok cfr_renamed_0;
    public static final /* enum */ sprvok cfr_renamed_1;
    public static final /* enum */ sprvok cfr_renamed_2;
    public static final /* enum */ sprvok cfr_renamed_3;
    private static final /* synthetic */ sprvok[] cfr_renamed_4;

    public int cfr_renamed_9697() {
        return this.cfr_renamed_91;
    }

    public static sprvok[] values() {
        return (sprvok[])cfr_renamed_4.clone();
    }

    public static sprvok cfr_renamed_9698(int arg0) {
        int n;
        sprvok[] sprvokArray = sprvok.values();
        int n2 = sprvokArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprvok sprvok2 = sprvokArray[n];
            if (sprvok2.cfr_renamed_91 == arg0) {
                return sprvok2;
            }
            n3 = ++n;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzbp.cfr_renamed_9("xjFjBsC$OhBf\rpTtH$")).append(Integer.toHexString(arg0)).toString());
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ sprvok(int n) {
        void var3_1;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = var3_1;
    }

    static {
        cfr_renamed_2 = new sprvok(sprseaa.cfr_renamed_9("~\u001ck\u0005b\u000ey\u001dt\u0013"), 0, 0);
        cfr_renamed_0 = new sprvok(sprzbp.cfr_renamed_9("kM\u007fWy[oHbF"), 1, 1);
        cfr_renamed_1 = new sprvok(sprseaa.cfr_renamed_9("\u001ek\u0014u\u000ek\u0016k\u000ey\u001dt\u0013"), 2, 2);
        cfr_renamed_3 = new sprvok(sprzbp.cfr_renamed_9("\\\u00184\u0014[oHbF"), 3, 3);
        sprvok[] sprvokArray = new sprvok[4];
        sprvokArray[0] = cfr_renamed_2;
        sprvokArray[1] = cfr_renamed_0;
        sprvokArray[2] = cfr_renamed_1;
        sprvokArray[3] = cfr_renamed_3;
        cfr_renamed_4 = sprvokArray;
    }

    public static sprvok valueOf(String arg0) {
        return Enum.valueOf(sprvok.class, arg0);
    }
}

