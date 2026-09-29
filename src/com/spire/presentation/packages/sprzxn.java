/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhty;
import com.spire.presentation.packages.sprmwd;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprzxn {
    @sprtea
    public static sprzxn cfr_renamed_102 = new sprzxn("symbol", 0);
    private static int cfr_renamed_93;
    @sprtea
    public static sprzxn cfr_renamed_86;
    @sprtea
    public int cfr_renamed_152;
    @sprtea
    public static sprzxn cfr_renamed_112;
    @sprtea
    public static sprzxn cfr_renamed_119;
    @sprtea
    public static sprzxn cfr_renamed_91;
    private static sprdz cfr_renamed_0;
    @sprtea
    public static sprzxn cfr_renamed_1;
    private int cfr_renamed_2;
    private String cfr_renamed_3;
    @sprtea
    public static sprzxn cfr_renamed_4;

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public static sprzxn cfr_renamed_15474(String arg0) {
        for (sprzxn sprzxn2 : cfr_renamed_0) {
            if (!sprraia.cfr_renamed_11730(sprzxn2.cfr_renamed_3, arg0)) continue;
            return sprzxn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzxn(String string, int n) {
        void arg0;
        sprzxn sprzxn2 = this;
        sprzxn2.cfr_renamed_3 = arg0;
        sprzxn2.cfr_renamed_2 = cfr_renamed_93++;
        sprzxn2.cfr_renamed_152 = n;
    }

    @sprtea
    public static sprzxn cfr_renamed_141(String arg0) {
        String string = arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        if ("symbol".equals(arg0)) {
            return cfr_renamed_102;
        }
        if (sprhty.cfr_renamed_9("T\u007fG").equals(arg0)) {
            return cfr_renamed_91;
        }
        if (sprmwd.cfr_renamed_9("a4dh").equals(arg0)) {
            return cfr_renamed_86;
        }
        if (sprhty.cfr_renamed_9("WeMkP NdW").equals(arg0)) {
            return cfr_renamed_119;
        }
        if (sprmwd.cfr_renamed_9("*b3p(m:").equals(arg0)) {
            return cfr_renamed_112;
        }
        if (sprhty.cfr_renamed_9("NbLlF").equals(arg0)) {
            return cfr_renamed_4;
        }
        if (sprmwd.cfr_renamed_9("(m4`2g8").equals(arg0) || "".equals(arg0)) {
            return cfr_renamed_1;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprhty.cfr_renamed_9("\u670e\u77e8\u76a0\u5b5a\u5f46\u900f\u750c\u7689\u5b73\u7b2b\u5222\u7c76\uff3e")).append(arg0).toString());
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_0;
    }

    public String toString() {
        if (this == cfr_renamed_119) {
            return sprmwd.cfr_renamed_9(".k4e).7j.");
        }
        return super.toString();
    }

    static {
        cfr_renamed_91 = new sprzxn(sprhty.cfr_renamed_9("T\u007fG"), 1);
        cfr_renamed_86 = new sprzxn(sprmwd.cfr_renamed_9("a4dh"), 2);
        cfr_renamed_119 = new sprzxn(sprhty.cfr_renamed_9("WeMkPRNdW"), 3);
        cfr_renamed_112 = new sprzxn(sprmwd.cfr_renamed_9("*b3p(m:"), 4);
        cfr_renamed_4 = new sprzxn(sprhty.cfr_renamed_9("NbLlF"), 5);
        cfr_renamed_1 = new sprzxn(sprmwd.cfr_renamed_9("(m4`2g8"), 6);
        cfr_renamed_0 = new sprvrx();
        cfr_renamed_93 = 0;
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_102);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_86);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_1);
    }
}

