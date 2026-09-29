/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprktk;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprszn {
    private static sprdz cfr_renamed_152;
    private int cfr_renamed_112;
    private static final sprusca cfr_renamed_119;
    @sprtea
    public static sprszn cfr_renamed_91;
    @sprtea
    public static sprszn cfr_renamed_0;
    @sprtea
    public int cfr_renamed_1;
    @sprtea
    public static sprszn cfr_renamed_2;
    private static int cfr_renamed_3;
    private String cfr_renamed_4;

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_152;
    }

    static {
        cfr_renamed_2 = new sprszn(sprktk.cfr_renamed_9("g9Q5@$"), 0);
        cfr_renamed_0 = new sprszn(sproyh.cfr_renamed_9("D\u001ff\u001fw\u000e"), 1);
        cfr_renamed_91 = new sprszn(sprktk.cfr_renamed_9("\u0002F6O5@$"), 2);
        cfr_renamed_152 = new sprvrx();
        cfr_renamed_3 = 0;
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_0);
        cfr_renamed_152.cfr_renamed_12808(cfr_renamed_91);
        String[] stringArray = new String[4];
        stringArray[0] = "";
        stringArray[1] = sproyh.cfr_renamed_9("R\u0013d\u001fu\u000e");
        stringArray[2] = sprktk.cfr_renamed_9("q5S5B$");
        stringArray[3] = sproyh.cfr_renamed_9("(s\u001cz\u001fu\u000e");
        cfr_renamed_119 = new sprusca(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprszn(String string, int n) {
        void arg0;
        sprszn sprszn2 = this;
        sprszn2.cfr_renamed_4 = arg0;
        sprszn2.cfr_renamed_112 = cfr_renamed_3++;
        sprszn2.cfr_renamed_1 = n;
    }

    @sprtea
    public static sprszn cfr_renamed_15474(String arg0) {
        for (sprszn sprszn2 : cfr_renamed_152) {
            if (!sprraia.cfr_renamed_11730(sprszn2.cfr_renamed_4, arg0)) continue;
            return sprszn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprszn cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_119.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_2;
            }
            case 2: {
                return cfr_renamed_0;
            }
            case 3: {
                return cfr_renamed_91;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprktk.cfr_renamed_9("\u4f6e\u7f3e\u6e33\u5388\u7efb\u5266\u76a7\u65e9\u5f2c\uff4a")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_112;
    }

    public String toString() {
        return this.cfr_renamed_4;
    }
}

