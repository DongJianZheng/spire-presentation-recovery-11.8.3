/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprjoca;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprvdo {
    private String cfr_renamed_79;
    @sprtea
    public Integer cfr_renamed_107;
    private static int cfr_renamed_132;
    @sprtea
    public static sprvdo cfr_renamed_102;
    @sprtea
    public static sprvdo cfr_renamed_93;
    private static sprdz cfr_renamed_86;
    @sprtea
    public static sprvdo cfr_renamed_152;
    @sprtea
    public static sprvdo cfr_renamed_112;
    @sprtea
    public static sprvdo cfr_renamed_119;
    @sprtea
    public int cfr_renamed_91;
    @sprtea
    public static sprvdo cfr_renamed_0;
    @sprtea
    public static sprvdo cfr_renamed_1;
    private int cfr_renamed_2;
    @sprtea
    public static sprvdo cfr_renamed_3;
    @sprtea
    public static sprvdo cfr_renamed_4;

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public static sprvdo cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            arg0 = sprjoca.cfr_renamed_9(".b*");
        }
        if (spregm.cfr_renamed_9("fbg").equals(arg0)) {
            return cfr_renamed_112;
        }
        if (sprjoca.cfr_renamed_9("(b*").equals(arg0)) {
            return cfr_renamed_102;
        }
        if (spregm.cfr_renamed_9("dbg").equals(arg0)) {
            return cfr_renamed_93;
        }
        if (sprjoca.cfr_renamed_9(".b*").equals(arg0)) {
            return cfr_renamed_0;
        }
        if (spregm.cfr_renamed_9("bbg").equals(arg0)) {
            return cfr_renamed_1;
        }
        if (sprjoca.cfr_renamed_9(",b*").equals(arg0)) {
            return cfr_renamed_119;
        }
        if (spregm.cfr_renamed_9("`bg").equals(arg0)) {
            return cfr_renamed_4;
        }
        if (sprjoca.cfr_renamed_9("\"b*").equals(arg0)) {
            return cfr_renamed_152;
        }
        if (spregm.cfr_renamed_9("nbg").equals(arg0)) {
            return cfr_renamed_3;
        }
        throw new NumberFormatException(new StringBuilder().insert(0, sprjoca.cfr_renamed_9("\u954b\u8bf5\u76d6\u659d\u5b05\u5be3\u8c33\u769e\u7cc5\u7edc\u506e\uff00")).append(arg0).toString());
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_86;
    }

    public String toString() {
        return sprpkja.cfr_renamed_15512(this.cfr_renamed_107);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprvdo(String string, int n, Integer n2) {
        void arg0;
        void arg2;
        sprvdo sprvdo2 = this;
        this.cfr_renamed_107 = arg2;
        sprvdo2.cfr_renamed_79 = arg0;
        sprvdo2.cfr_renamed_2 = cfr_renamed_132++;
        sprvdo2.cfr_renamed_91 = n;
    }

    @sprtea
    public static sprvdo cfr_renamed_15474(String arg0) {
        for (sprvdo sprvdo2 : cfr_renamed_86) {
            if (!sprraia.cfr_renamed_11730(sprvdo2.cfr_renamed_79, arg0)) continue;
            return sprvdo2;
        }
        throw new IllegalArgumentException(arg0);
    }

    @sprtea
    public Integer cfr_renamed_15513() {
        return this.cfr_renamed_107;
    }

    static {
        cfr_renamed_112 = new sprvdo(spregm.cfr_renamed_9("\u0000\rfbg"), 0, 100);
        cfr_renamed_102 = new sprvdo(sprjoca.cfr_renamed_9("M\r(b*"), 1, 200);
        cfr_renamed_93 = new sprvdo(spregm.cfr_renamed_9("\u0000\rdbg"), 2, 300);
        cfr_renamed_0 = new sprvdo(sprjoca.cfr_renamed_9("M\r.b*"), 3, 400);
        cfr_renamed_1 = new sprvdo(spregm.cfr_renamed_9("\u0000\rbbg"), 4, 500);
        cfr_renamed_119 = new sprvdo(sprjoca.cfr_renamed_9("M\r,b*"), 5, 600);
        cfr_renamed_4 = new sprvdo(spregm.cfr_renamed_9("\u0000\r`bg"), 6, 700);
        cfr_renamed_152 = new sprvdo(sprjoca.cfr_renamed_9("M\r\"b*"), 7, 800);
        cfr_renamed_3 = new sprvdo(spregm.cfr_renamed_9("\u0000\rnbg"), 8, 900);
        cfr_renamed_86 = new sprvrx();
        cfr_renamed_132 = 0;
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_102);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_93);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_0);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_1);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_152);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_3);
    }

    @sprtea
    public static sprvdo cfr_renamed_4944(int arg0) {
        return sprvdo.cfr_renamed_141(Integer.toString(arg0));
    }
}

