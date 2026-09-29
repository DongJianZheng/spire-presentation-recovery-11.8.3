/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtbz;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprywh;

@sprtea
public final class sprxfo {
    @sprtea
    public static sprxfo cfr_renamed_86;
    @sprtea
    public int cfr_renamed_152;
    @sprtea
    public static sprxfo cfr_renamed_112;
    private String cfr_renamed_119;
    @sprtea
    public static sprxfo cfr_renamed_91;
    @sprtea
    public static sprxfo cfr_renamed_0;
    private static int cfr_renamed_1;
    private int cfr_renamed_2;
    private static sprdz cfr_renamed_3;
    @sprtea
    public static sprxfo cfr_renamed_4;

    @sprtea
    public static sprxfo cfr_renamed_141(String arg0) {
        String string = arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        if (sprtbz.cfr_renamed_9("\u0015p\u0017").equals(arg0)) {
            return cfr_renamed_112;
        }
        if (sprywh.cfr_renamed_9("\\.n").equals(arg0)) {
            return cfr_renamed_91;
        }
        if (sprtbz.cfr_renamed_9("o$]\u0005").equals(arg0)) {
            return cfr_renamed_4;
        }
        if (sprywh.cfr_renamed_9("\u0001s3L").equals(arg0)) {
            return cfr_renamed_0;
        }
        if (sprtbz.cfr_renamed_9("o$]\u001f").equals(arg0)) {
            return cfr_renamed_86;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("\u6730\u77a2\u76f4\u6840\u5320\u5798\u7c61\u57cc\uff00")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_3;
    }

    @sprtea
    public static sprxfo cfr_renamed_15474(String arg0) {
        for (sprxfo sprxfo2 : cfr_renamed_3) {
            if (!sprraia.cfr_renamed_11730(sprxfo2.cfr_renamed_119, arg0)) continue;
            return sprxfo2;
        }
        throw new IllegalArgumentException(arg0);
    }

    static {
        cfr_renamed_112 = new sprxfo(sprtbz.cfr_renamed_9("\u0015p\u0017"), 0);
        cfr_renamed_91 = new sprxfo(sprywh.cfr_renamed_9("\\.n"), 1);
        cfr_renamed_4 = new sprxfo(sprtbz.cfr_renamed_9("o$]\u0005"), 2);
        cfr_renamed_0 = new sprxfo(sprywh.cfr_renamed_9("\u0001s3L"), 3);
        cfr_renamed_86 = new sprxfo(sprtbz.cfr_renamed_9("o$]\u001f"), 4);
        cfr_renamed_3 = new sprvrx();
        cfr_renamed_1 = 0;
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_0);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_86);
    }

    public String toString() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxfo(String string, int n) {
        void arg0;
        sprxfo sprxfo2 = this;
        sprxfo2.cfr_renamed_119 = arg0;
        sprxfo2.cfr_renamed_2 = cfr_renamed_1++;
        sprxfo2.cfr_renamed_152 = n;
    }
}

