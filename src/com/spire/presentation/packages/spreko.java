/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprmkaa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwmr;

@sprtea
public final class spreko {
    private String cfr_renamed_152;
    private int cfr_renamed_112;
    @sprtea
    public static spreko cfr_renamed_119;
    @sprtea
    public static spreko cfr_renamed_91;
    @sprtea
    public static spreko cfr_renamed_0;
    private static sprdz cfr_renamed_1;
    @sprtea
    public static spreko cfr_renamed_2;
    @sprtea
    public int cfr_renamed_3;
    private static int cfr_renamed_4;

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spreko(String string, int n) {
        void arg0;
        spreko spreko2 = this;
        spreko2.cfr_renamed_152 = arg0;
        spreko2.cfr_renamed_112 = cfr_renamed_4++;
        spreko2.cfr_renamed_3 = n;
    }

    public String toString() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public static spreko cfr_renamed_141(String arg0) {
        String string = arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        if (sprmkaa.cfr_renamed_9("J<{)").equals(arg0)) {
            return cfr_renamed_91;
        }
        if (sprwmr.cfr_renamed_9("5s\tw").equals(arg0)) {
            return cfr_renamed_119;
        }
        if (sprmkaa.cfr_renamed_9("\u0000{%i5").equals(arg0)) {
            return cfr_renamed_2;
        }
        if (sprwmr.cfr_renamed_9("4b\u0015r\u000bb").equals(arg0)) {
            return cfr_renamed_0;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmkaa.cfr_renamed_9("\u677a\u77ff\u76d4\u6524\u6670\u53d8\u6520\uff00p")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_112;
    }

    static {
        cfr_renamed_91 = new spreko(sprwmr.cfr_renamed_9("6k\u0007~"), 0);
        cfr_renamed_119 = new spreko(sprmkaa.cfr_renamed_9("I$u "), 1);
        cfr_renamed_2 = new spreko(sprwmr.cfr_renamed_9("W\u0007r\u0015b"), 2);
        cfr_renamed_0 = new spreko(sprmkaa.cfr_renamed_9("H5i%w5"), 3);
        cfr_renamed_1 = new sprvrx();
        cfr_renamed_4 = 0;
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_0);
    }

    @sprtea
    public static spreko cfr_renamed_15474(String arg0) {
        for (spreko spreko2 : cfr_renamed_1) {
            if (!sprraia.cfr_renamed_11730(spreko2.cfr_renamed_152, arg0)) continue;
            return spreko2;
        }
        throw new IllegalArgumentException(arg0);
    }
}

