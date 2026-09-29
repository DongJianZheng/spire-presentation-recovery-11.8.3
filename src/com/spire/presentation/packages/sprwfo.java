/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjo;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprigf;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprwfo {
    private static final sprusca cfr_renamed_93;
    @sprtea
    public static sprwfo cfr_renamed_86;
    private static sprdz cfr_renamed_152;
    @sprtea
    public int cfr_renamed_112;
    @sprtea
    public static sprwfo cfr_renamed_119;
    private static int cfr_renamed_91;
    @sprtea
    public static sprwfo cfr_renamed_0;
    private int cfr_renamed_1;
    @sprtea
    public static sprwfo cfr_renamed_2;
    @sprtea
    public static sprwfo cfr_renamed_3;
    private String cfr_renamed_4;

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwfo(String string, int n) {
        void arg0;
        sprwfo sprwfo2 = this;
        sprwfo2.cfr_renamed_4 = arg0;
        sprwfo2.cfr_renamed_1 = cfr_renamed_91++;
        sprwfo2.cfr_renamed_112 = n;
    }

    @sprtea
    public static sprwfo cfr_renamed_15474(String arg0) {
        for (sprwfo sprwfo2 : cfr_renamed_152) {
            if (!sprraia.cfr_renamed_11730(sprwfo2.cfr_renamed_4, arg0)) continue;
            return sprwfo2;
        }
        throw new IllegalArgumentException(arg0);
    }

    static {
        cfr_renamed_2 = new sprwfo(sprigf.cfr_renamed_9("STqV"), 0);
        cfr_renamed_86 = new sprwfo(sprbjo.cfr_renamed_9("osKz"), 1);
        cfr_renamed_119 = new sprwfo(sprigf.cfr_renamed_9("uvZwQvZwI"), 2);
        cfr_renamed_3 = new sprwfo(sprbjo.cfr_renamed_9("AKsRb"), 3);
        cfr_renamed_0 = new sprwfo(sprigf.cfr_renamed_9("j~IzOr\\mV"), 4);
        cfr_renamed_152 = new sprvrx();
        cfr_renamed_91 = 0;
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_86);
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_3);
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_0);
        String[] stringArray = new String[5];
        stringArray[0] = sprbjo.cfr_renamed_9("s{Qy");
        stringArray[1] = sprigf.cfr_renamed_9("O\\kU");
        stringArray[2] = sprbjo.cfr_renamed_9("ZVuW~VuWf");
        stringArray[3] = sprigf.cfr_renamed_9("nk\\rM");
        stringArray[4] = sprbjo.cfr_renamed_9("E^fZ`RsMy");
        cfr_renamed_93 = new sprusca(stringArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprwfo cfr_renamed_141(String arg0) {
        switch (cfr_renamed_93.cfr_renamed_12854(arg0)) {
            case 0: {
                return cfr_renamed_2;
            }
            case 1: {
                return cfr_renamed_86;
            }
            case 2: {
                return cfr_renamed_119;
            }
            case 3: {
                return cfr_renamed_3;
            }
            case 4: {
                return cfr_renamed_0;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprigf.cfr_renamed_9("\u6735\u77d8\u769b\u6cd5\u91d5\u7c46\u5794\u53eb\u5023\uff27")).append(arg0).toString());
    }

    public String toString() {
        return this.cfr_renamed_4;
    }
}

