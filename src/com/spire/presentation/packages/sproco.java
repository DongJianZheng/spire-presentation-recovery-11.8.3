/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprssa;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprzqh;

@sprtea
public final class sproco {
    @sprtea
    public static sproco cfr_renamed_152;
    private int cfr_renamed_112;
    @sprtea
    public int cfr_renamed_119;
    @sprtea
    public static sproco cfr_renamed_91;
    private String cfr_renamed_0;
    @sprtea
    public static sproco cfr_renamed_1;
    private static final sprusca cfr_renamed_2;
    private static sprdz cfr_renamed_3;
    private static int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sproco cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_2.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_1;
            }
            case 2: {
                return cfr_renamed_152;
            }
            case 3: {
                return cfr_renamed_91;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprssa.cfr_renamed_9("\u676a\u77bf\u76c4\u7ee5\u7aaf\u70e3\u6877\u5f55\uff5a")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sproco(String string, int n) {
        void arg0;
        sproco sproco2 = this;
        sproco2.cfr_renamed_0 = arg0;
        sproco2.cfr_renamed_112 = cfr_renamed_4++;
        sproco2.cfr_renamed_119 = n;
    }

    @sprtea
    public static sproco cfr_renamed_15474(String arg0) {
        for (sproco sproco2 : cfr_renamed_3) {
            if (!sprraia.cfr_renamed_11730(sproco2.cfr_renamed_0, arg0)) continue;
            return sproco2;
        }
        throw new IllegalArgumentException(arg0);
    }

    static {
        cfr_renamed_1 = new sproco(sprzqh.cfr_renamed_9("nqXp"), 0);
        cfr_renamed_152 = new sproco(sprssa.cfr_renamed_9("\u0012554$"), 1);
        cfr_renamed_91 = new sproco(sprzqh.cfr_renamed_9("\u007fuYe^a"), 2);
        cfr_renamed_3 = new sprvrx();
        cfr_renamed_4 = 0;
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_1);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_152);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_91);
        String[] stringArray = new String[4];
        stringArray[0] = "";
        stringArray[1] = sprssa.cfr_renamed_9("\u00185.4");
        stringArray[2] = sprzqh.cfr_renamed_9("VCqB`");
        stringArray[3] = sprssa.cfr_renamed_9("\t1/!(%");
        cfr_renamed_2 = new sprusca(stringArray);
    }

    public String toString() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_3;
    }
}

