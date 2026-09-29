/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwn;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrcba;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprxco {
    @sprtea
    public int cfr_renamed_93;
    @sprtea
    public static sprxco cfr_renamed_86;
    @sprtea
    public static sprxco cfr_renamed_152;
    private int cfr_renamed_112;
    @sprtea
    public static sprxco cfr_renamed_119;
    @sprtea
    public static sprxco cfr_renamed_91;
    private int cfr_renamed_0;
    private String cfr_renamed_1;
    private static sprdz cfr_renamed_2;
    private static int cfr_renamed_3;
    @sprtea
    public static sprxco cfr_renamed_4;

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprxco cfr_renamed_4944(int arg0) {
        switch (arg0) {
            case 1: {
                return cfr_renamed_119;
            }
            case 2: {
                return cfr_renamed_91;
            }
            case 4: {
                return cfr_renamed_4;
            }
            case 8: {
                return cfr_renamed_152;
            }
            case 16: {
                return cfr_renamed_86;
            }
        }
        throw new IllegalArgumentException(sprbwn.cfr_renamed_9("\u6bd2\u4e27\u9881\u827f\u9007\u905e\u4f62\u7525\u7699\u4f40\u656d\uff01\u6714\u6545\u53cb\u5031\u4e27\uff17,\uff01/\uff01)\uff01%\uff01,;"));
    }

    @sprtea
    public static sprxco cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return cfr_renamed_119;
        }
        return sprxco.cfr_renamed_4944(Integer.parseInt(arg0));
    }

    public String toString() {
        return sprpkja.cfr_renamed_15512(this.cfr_renamed_112);
    }

    static {
        cfr_renamed_119 = new sprxco(sprrcba.cfr_renamed_9("MO[Y>"), 0, 1);
        cfr_renamed_91 = new sprxco(sprbwn.cfr_renamed_9("OTYB?"), 1, 2);
        cfr_renamed_4 = new sprxco(sprrcba.cfr_renamed_9("MO[Y;"), 2, 4);
        cfr_renamed_152 = new sprxco(sprbwn.cfr_renamed_9("OTYB5"), 3, 8);
        cfr_renamed_86 = new sprxco(sprrcba.cfr_renamed_9("DFRP79"), 4, 16);
        cfr_renamed_2 = new sprvrx();
        cfr_renamed_3 = 0;
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_152);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_86);
    }

    @sprtea
    public static sprxco cfr_renamed_15474(String arg0) {
        for (sprxco sprxco2 : cfr_renamed_2) {
            if (!sprraia.cfr_renamed_11730(sprxco2.cfr_renamed_1, arg0)) continue;
            return sprxco2;
        }
        throw new IllegalArgumentException(arg0);
    }

    @sprtea
    public int cfr_renamed_97() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprxco(String string, int n, int n2) {
        void arg0;
        void arg2;
        sprxco sprxco2 = this;
        this.cfr_renamed_112 = arg2;
        sprxco2.cfr_renamed_1 = arg0;
        sprxco2.cfr_renamed_0 = cfr_renamed_3++;
        sprxco2.cfr_renamed_93 = n;
    }
}

