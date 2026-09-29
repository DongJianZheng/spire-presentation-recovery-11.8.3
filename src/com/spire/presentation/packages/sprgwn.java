/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprkiaa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtiz;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprgwn {
    @sprtea
    public int cfr_renamed_86;
    private int cfr_renamed_152;
    @sprtea
    public static sprgwn cfr_renamed_112;
    @sprtea
    public static sprgwn cfr_renamed_119;
    private static sprdz cfr_renamed_91;
    @sprtea
    public static sprgwn cfr_renamed_0;
    private String cfr_renamed_1;
    @sprtea
    public static sprgwn cfr_renamed_2;
    private static int cfr_renamed_3;
    private Integer cfr_renamed_4;

    @sprtea
    public static sprgwn cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            arg0 = "0";
        }
        if ("0".equals(arg0) || "".equals(arg0)) {
            return cfr_renamed_119;
        }
        if (sprtiz.cfr_renamed_9("JG").equals(arg0)) {
            return cfr_renamed_0;
        }
        if (sprkiaa.cfr_renamed_9("~ \u007f").equals(arg0)) {
            return cfr_renamed_112;
        }
        if (sprtiz.cfr_renamed_9("EDG").equals(arg0)) {
            return cfr_renamed_2;
        }
        throw new NumberFormatException(new StringBuilder().insert(0, sprkiaa.cfr_renamed_9("\u6765\u77fd\u6584\u8f74\u899d\u5ebe\uff55")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_91;
    }

    @sprtea
    public static sprgwn cfr_renamed_15514(Integer arg0) {
        return sprgwn.cfr_renamed_141(arg0.toString());
    }

    @sprtea
    public static sprgwn cfr_renamed_15474(String arg0) {
        for (sprgwn sprgwn2 : cfr_renamed_91) {
            if (!sprraia.cfr_renamed_11730(sprgwn2.cfr_renamed_1, arg0)) continue;
            return sprgwn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprgwn(String string, int n, int n2) {
        void arg0;
        void arg2;
        sprgwn sprgwn2 = this;
        this.cfr_renamed_4 = (int)arg2;
        sprgwn2.cfr_renamed_1 = arg0;
        sprgwn2.cfr_renamed_152 = cfr_renamed_3++;
        sprgwn2.cfr_renamed_86 = n;
    }

    static {
        cfr_renamed_119 = new sprgwn(sprtiz.cfr_renamed_9("6\u001d\u0010\u001f\u0012,G"), 0, 0);
        cfr_renamed_0 = new sprgwn(sprkiaa.cfr_renamed_9("Y!\u007f#}\u0010!\u007f"), 1, 90);
        cfr_renamed_112 = new sprgwn(sprtiz.cfr_renamed_9("6\u001d\u0010\u001f\u0012,FKG"), 2, 180);
        cfr_renamed_2 = new sprgwn(sprkiaa.cfr_renamed_9("\u000ev(t*G}/\u007f"), 3, 270);
        cfr_renamed_91 = new sprvrx();
        cfr_renamed_3 = 0;
        cfr_renamed_91.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_91.cfr_renamed_12808(cfr_renamed_0);
        cfr_renamed_91.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_91.cfr_renamed_12808(cfr_renamed_2);
    }

    public String toString() {
        return this.cfr_renamed_4.toString();
    }
}

