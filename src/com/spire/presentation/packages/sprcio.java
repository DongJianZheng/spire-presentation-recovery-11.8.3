/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchk;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprqyy;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprcio {
    @sprtea
    public static sprcio cfr_renamed_112 = new sprcio(sprqyy.cfr_renamed_9("zlP`rdQ`"), 0);
    private static sprdz cfr_renamed_119;
    @sprtea
    public static sprcio cfr_renamed_91;
    private static final sprusca cfr_renamed_0;
    private String cfr_renamed_1;
    @sprtea
    public int cfr_renamed_2;
    private int cfr_renamed_3;
    private static int cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public static sprcio cfr_renamed_15474(String arg0) {
        for (sprcio sprcio2 : cfr_renamed_119) {
            if (!sprraia.cfr_renamed_11730(sprcio2.cfr_renamed_1, arg0)) continue;
            return sprcio2;
        }
        throw new IllegalArgumentException(arg0);
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_119;
    }

    static {
        cfr_renamed_91 = new sprcio(sprchk.cfr_renamed_9("\"s\u0005H\u000fh\ny"), 1);
        cfr_renamed_119 = new sprvrx();
        cfr_renamed_4 = 0;
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_91);
        String[] stringArray = new String[2];
        stringArray[0] = sprqyy.cfr_renamed_9("zlP`rdQ`");
        stringArray[1] = sprchk.cfr_renamed_9("\"s\u0005H\u000fh\ny");
        cfr_renamed_0 = new sprusca(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcio(String string, int n) {
        void arg0;
        sprcio sprcio2 = this;
        sprcio2.cfr_renamed_1 = arg0;
        sprcio2.cfr_renamed_3 = cfr_renamed_4++;
        sprcio2.cfr_renamed_2 = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprcio cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return cfr_renamed_112;
        }
        switch (cfr_renamed_0.cfr_renamed_12854(arg0)) {
            case 0: {
                return cfr_renamed_112;
            }
            case 1: {
                return cfr_renamed_91;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqyy.cfr_renamed_9("\u6716\u77e0\u76b8\u6802\u98a4\u680a\u6602\u793f\u6a1d\u5f0a\uff26%")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_3;
    }
}

