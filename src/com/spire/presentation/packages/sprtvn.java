/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprsno;
import com.spire.presentation.packages.sprspo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprtvn {
    @sprtea
    public static sprtvn cfr_renamed_119 = new sprtvn(sprspo.cfr_renamed_9("JIx@"), 0);
    @sprtea
    public int cfr_renamed_91;
    private int cfr_renamed_0;
    @sprtea
    public static sprtvn cfr_renamed_1 = new sprtvn(sprsno.cfr_renamed_9("y[M\\"), 1);
    private static int cfr_renamed_2;
    private static sprdz cfr_renamed_3;
    private String cfr_renamed_4;

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_3;
    }

    @sprtea
    public static sprtvn cfr_renamed_141(String arg0) {
        String string = arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        if ("".equals(arg0) || sprsno.cfr_renamed_9("yWK^").equals(arg0)) {
            return cfr_renamed_119;
        }
        if (sprspo.cfr_renamed_9("JE~B").equals(arg0)) {
            return cfr_renamed_1;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprsno.cfr_renamed_9("\u6718\u77cf\u76b6\u7b54\u543f\u82a8\u708b\u76ae\u7c49\u57a1\uff28")).append(arg0).toString());
    }

    static {
        cfr_renamed_3 = new sprvrx();
        cfr_renamed_2 = 0;
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtvn(String string, int n) {
        void arg0;
        sprtvn sprtvn2 = this;
        sprtvn2.cfr_renamed_4 = arg0;
        sprtvn2.cfr_renamed_0 = cfr_renamed_2++;
        sprtvn2.cfr_renamed_91 = n;
    }

    @sprtea
    public static sprtvn cfr_renamed_15474(String arg0) {
        for (sprtvn sprtvn2 : cfr_renamed_3) {
            if (!sprraia.cfr_renamed_11730(sprtvn2.cfr_renamed_4, arg0)) continue;
            return sprtvn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    public String toString() {
        return this.cfr_renamed_4;
    }
}

