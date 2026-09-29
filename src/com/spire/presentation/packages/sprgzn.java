/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceea;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprgzn {
    private static final sprusca cfr_renamed_93;
    @sprtea
    public static sprgzn cfr_renamed_86;
    private String cfr_renamed_152;
    private int cfr_renamed_112;
    private static int cfr_renamed_119;
    @sprtea
    public static sprgzn cfr_renamed_91;
    @sprtea
    public int cfr_renamed_0;
    private int cfr_renamed_1;
    private static sprdz cfr_renamed_2;
    @sprtea
    public static sprgzn cfr_renamed_3;
    @sprtea
    public static sprgzn cfr_renamed_4;

    @sprtea
    public static sprgzn cfr_renamed_15474(String arg0) {
        for (sprgzn sprgzn2 : cfr_renamed_2) {
            if (!sprraia.cfr_renamed_11730(sprgzn2.cfr_renamed_152, arg0)) continue;
            return sprgzn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprgzn(String string, int n, int n2) {
        void arg0;
        void arg2;
        sprgzn sprgzn2 = this;
        this.cfr_renamed_112 = arg2;
        sprgzn2.cfr_renamed_152 = arg0;
        sprgzn2.cfr_renamed_1 = cfr_renamed_119++;
        sprgzn2.cfr_renamed_0 = n;
    }

    static {
        cfr_renamed_91 = new sprgzn(sprceea.cfr_renamed_9("Hz"), 0, 0);
        cfr_renamed_86 = new sprgzn(sprhsh.cfr_renamed_9("\u001eb"), 1, 1);
        cfr_renamed_4 = new sprgzn(sprceea.cfr_renamed_9("Hx"), 2, 2);
        cfr_renamed_3 = new sprgzn(sprhsh.cfr_renamed_9("\u001e`"), 3, 3);
        cfr_renamed_2 = new sprvrx();
        cfr_renamed_119 = 0;
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_86);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_2.cfr_renamed_12808(cfr_renamed_3);
        String[] stringArray = new String[5];
        stringArray[0] = "";
        stringArray[1] = "0";
        stringArray[2] = "1";
        stringArray[3] = sprceea.cfr_renamed_9("x");
        stringArray[4] = sprhsh.cfr_renamed_9("`");
        cfr_renamed_93 = new sprusca(stringArray);
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_2;
    }

    public String toString() {
        return Integer.toString(this.cfr_renamed_112);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprgzn cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_93.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_91;
            }
            case 2: {
                return cfr_renamed_86;
            }
            case 3: {
                return cfr_renamed_4;
            }
            case 4: {
                return cfr_renamed_3;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprceea.cfr_renamed_9("\u6760\u77f2\u76ce\u8f63\u7ef5\u5ee1\u9535\u7ea8\u65f3\u5406\u6665\u5431\u7ead\u7efa\u7e92\u5221\u7c31\u579c\uff50")).append(arg0).toString());
    }
}

