/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnoq;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprqun {
    private int cfr_renamed_152;
    @sprtea
    public int cfr_renamed_112;
    @sprtea
    public static sprqun cfr_renamed_119;
    private static int cfr_renamed_91;
    private String cfr_renamed_0;
    private static sprdz cfr_renamed_1;
    @sprtea
    public static sprqun cfr_renamed_2;
    @sprtea
    public static sprqun cfr_renamed_3;
    private int cfr_renamed_4;

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_1;
    }

    public String toString() {
        return sprpkja.cfr_renamed_15512(this.cfr_renamed_152);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprqun(String string, int n, int n2) {
        void arg0;
        void arg2;
        sprqun sprqun2 = this;
        this.cfr_renamed_152 = arg2;
        sprqun2.cfr_renamed_0 = arg0;
        sprqun2.cfr_renamed_4 = cfr_renamed_91++;
        sprqun2.cfr_renamed_112 = n;
    }

    @sprtea
    public static sprqun cfr_renamed_15474(String arg0) {
        for (sprqun sprqun2 : cfr_renamed_1) {
            if (!sprraia.cfr_renamed_11730(sprqun2.cfr_renamed_0, arg0)) continue;
            return sprqun2;
        }
        throw new IllegalArgumentException(arg0);
    }

    static {
        cfr_renamed_3 = new sprqun(sprnoq.cfr_renamed_9("zp"), 0, 0);
        cfr_renamed_2 = new sprqun(spruab.cfr_renamed_9(",8"), 1, 1);
        cfr_renamed_119 = new sprqun(sprnoq.cfr_renamed_9("zr"), 2, 2);
        cfr_renamed_1 = new sprvrx();
        cfr_renamed_91 = 0;
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_3);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_119);
    }

    @sprtea
    public static sprqun cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            arg0 = "";
        }
        if ("0".equals(arg0) || "".equals(arg0)) {
            return cfr_renamed_3;
        }
        if ("1".equals(arg0)) {
            return cfr_renamed_2;
        }
        if (spruab.cfr_renamed_9(";").equals(arg0)) {
            return cfr_renamed_119;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprnoq.cfr_renamed_9("\u676a\u77c0\u76c4\u4e2c\u8992\u5370\u5103\u5222\u6322\u76a1\u65f9\u5434\u6847\u5ff2\uff5a")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_4;
    }
}

