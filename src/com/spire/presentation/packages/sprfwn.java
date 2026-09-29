/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprreaa;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprugk;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprfwn {
    @sprtea
    public static sprfwn cfr_renamed_112 = new sprfwn(sprugk.cfr_renamed_9("\u0014\u000b#\u000f"), 0);
    private int cfr_renamed_119;
    @sprtea
    public int cfr_renamed_91;
    private static final sprusca cfr_renamed_0;
    private static sprdz cfr_renamed_1;
    @sprtea
    public static sprfwn cfr_renamed_2;
    private String cfr_renamed_3;
    private static int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprfwn cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_0.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_2;
            }
            case 2: {
                return cfr_renamed_112;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprreaa.cfr_renamed_9("\u6745\u7783\u76eb\u5ef3\u7ed6\u5333\u512c\u8d11\u59a4\u7ebe\u5259\u4f2b\u7f01\uff7c")).append(arg0).toString());
    }

    @sprtea
    public static sprfwn cfr_renamed_15474(String arg0) {
        for (sprfwn sprfwn2 : cfr_renamed_1) {
            if (!sprraia.cfr_renamed_11730(sprfwn2.cfr_renamed_3, arg0)) continue;
            return sprfwn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_119;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_1;
    }

    public String toString() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfwn(String string, int n) {
        void arg0;
        sprfwn sprfwn2 = this;
        sprfwn2.cfr_renamed_3 = arg0;
        sprfwn2.cfr_renamed_119 = cfr_renamed_4++;
        sprfwn2.cfr_renamed_91 = n;
    }

    static {
        cfr_renamed_2 = new sprfwn(sprreaa.cfr_renamed_9(" \u0004\u0005\u0003\f\u0012"), 1);
        cfr_renamed_1 = new sprvrx();
        cfr_renamed_4 = 0;
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_2);
        String[] stringArray = new String[3];
        stringArray[0] = "";
        stringArray[1] = sprugk.cfr_renamed_9("\u000b\b.\u000f'\u001e");
        stringArray[2] = sprreaa.cfr_renamed_9("?\u0007\b\u0003");
        cfr_renamed_0 = new sprusca(stringArray);
    }
}

