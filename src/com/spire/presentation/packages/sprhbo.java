/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrol;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprhbo {
    private int cfr_renamed_152;
    private String cfr_renamed_112;
    @sprtea
    public static sprhbo cfr_renamed_119 = new sprhbo(sprjgba.cfr_renamed_9("]r}Gvo|"), 0, sprrol.cfr_renamed_9("G`gUl}f"));
    @sprtea
    public int cfr_renamed_91;
    private static final sprusca cfr_renamed_0;
    @sprtea
    public static sprhbo cfr_renamed_1;
    private static sprdz cfr_renamed_2;
    private String cfr_renamed_3;
    private static int cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_2;
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public static sprhbo cfr_renamed_15474(String arg0) {
        for (sprhbo sprhbo2 : cfr_renamed_2) {
            if (!sprraia.cfr_renamed_11730(sprhbo2.cfr_renamed_112, arg0)) continue;
            return sprhbo2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprhbo(String string, int n, String string2) {
        void arg2;
        void arg0;
        sprhbo sprhbo2 = this;
        this.cfr_renamed_3 = arg0;
        sprhbo2.cfr_renamed_112 = arg2;
        sprhbo2.cfr_renamed_152 = cfr_renamed_4++;
        sprhbo2.cfr_renamed_91 = n;
    }

    static {
        cfr_renamed_1 = new sprhbo(sprjgba.cfr_renamed_9("Xex}0\\yw"), 1, sprrol.cfr_renamed_9("J\u007fjg\"Fkm"));
        cfr_renamed_2 = new sprvrx();
        cfr_renamed_4 = 0;
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_1);
        String[] stringArray = new String[3];
        stringArray[0] = "";
        stringArray[1] = sprjgba.cfr_renamed_9("]r}Gvo|");
        stringArray[2] = sprrol.cfr_renamed_9("J\u007fjg\"Fkm");
        cfr_renamed_0 = new sprusca(stringArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprhbo cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_0.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_119;
            }
            case 2: {
                return cfr_renamed_1;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjgba.cfr_renamed_9("\u6739\u77f8\u7697\u56e3\u5f71\u7699\u5878\u5158\u89d7\u5204\u7c68\u5796\uff09")).append(arg0).toString());
    }
}

