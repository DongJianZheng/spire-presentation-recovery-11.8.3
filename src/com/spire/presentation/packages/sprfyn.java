/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwtf;

@sprtea
public final class sprfyn {
    @sprtea
    public static sprfyn cfr_renamed_152;
    @sprtea
    public static sprfyn cfr_renamed_112;
    private int cfr_renamed_119;
    private String cfr_renamed_91;
    private static sprdz cfr_renamed_0;
    private static final sprusca cfr_renamed_1;
    @sprtea
    public int cfr_renamed_2;
    private static int cfr_renamed_3;
    @sprtea
    public static sprfyn cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_91;
    }

    static {
        cfr_renamed_112 = new sprfyn(sprwtf.cfr_renamed_9("\u001eo\u0018d"), 0);
        cfr_renamed_4 = new sprfyn(spravo.cfr_renamed_9("\u0013\u000e\u0003"), 1);
        cfr_renamed_152 = new sprfyn(sprwtf.cfr_renamed_9("\u001ap\u0000v"), 2);
        cfr_renamed_0 = new sprvrx();
        cfr_renamed_3 = 0;
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_0.cfr_renamed_12808(cfr_renamed_152);
        String[] stringArray = new String[3];
        stringArray[0] = spravo.cfr_renamed_9("\u000e\u0013\b\u0018");
        stringArray[1] = sprwtf.cfr_renamed_9("o\u001e\u007f");
        stringArray[2] = spravo.cfr_renamed_9("\n\f\u0010\n");
        cfr_renamed_1 = new sprusca(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfyn(String string, int n) {
        void arg0;
        sprfyn sprfyn2 = this;
        sprfyn2.cfr_renamed_91 = arg0;
        sprfyn2.cfr_renamed_119 = cfr_renamed_3++;
        sprfyn2.cfr_renamed_2 = n;
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_119;
    }

    @sprtea
    public static sprfyn cfr_renamed_15474(String arg0) {
        for (sprfyn sprfyn2 : cfr_renamed_0) {
            if (!sprraia.cfr_renamed_11730(sprfyn2.cfr_renamed_91, arg0)) continue;
            return sprfyn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprfyn cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_1.cfr_renamed_12854(arg0)) {
            case 0: {
                return cfr_renamed_112;
            }
            case 1: {
                return cfr_renamed_4;
            }
            case 2: {
                return cfr_renamed_152;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwtf.cfr_renamed_9("\u6773\u77d8\u76dd\u98a1\u822b\u7a47\u95ad\u7c46\u57d2\uff27")).append(arg0).toString());
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_0;
    }
}

