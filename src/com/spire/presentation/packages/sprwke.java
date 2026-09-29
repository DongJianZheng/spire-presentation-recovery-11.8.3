/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxpe;
import com.spire.presentation.packages.spryhs;
import java.math.BigInteger;
import java.util.Hashtable;

public class sprwke
extends sprkra {
    public static final int cfr_renamed_88 = 9;
    public static final int cfr_renamed_31 = 1;
    public static final int cfr_renamed_272 = 0;
    public static final int cfr_renamed_145 = 4;
    public static final int cfr_renamed_114 = 9;
    public static final int cfr_renamed_96 = 2;
    public static final int cfr_renamed_105 = 5;
    public static final int cfr_renamed_137 = 8;
    public static final int cfr_renamed_79 = 5;
    private static final String[] cfr_renamed_107;
    private static final Hashtable cfr_renamed_132;
    public static final int cfr_renamed_102 = 0;
    public static final int cfr_renamed_93 = 10;
    public static final int cfr_renamed_86 = 3;
    public static final int cfr_renamed_152 = 6;
    public static final int cfr_renamed_112 = 1;
    public static final int cfr_renamed_119 = 3;
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 8;
    public static final int cfr_renamed_1 = 6;
    public static final int cfr_renamed_2 = 10;
    public static final int cfr_renamed_3 = 2;
    private sprune cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwke(int n) {
        void arg0;
        sprwke sprwke2 = this;
        sprwke2.cfr_renamed_4 = new sprune((int)arg0);
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public static sprwke cfr_renamed_4272(int arg0) {
        Integer n = spriwa.cfr_renamed_279(arg0);
        if (!cfr_renamed_132.containsKey(n)) {
            cfr_renamed_132.put(n, new sprwke(arg0));
        }
        return (sprwke)cfr_renamed_132.get(n);
    }

    public String toString() {
        int n = this.cfr_renamed_97().intValue();
        String string = n < 0 || n > 10 ? "invalid" : cfr_renamed_107[n];
        return new StringBuilder().insert(0, spryhs.cfr_renamed_9("l]c]Jn\\`A5\u000f")).append(string).toString();
    }

    static {
        String[] stringArray = new String[11];
        stringArray[0] = sprxpe.cfr_renamed_9("~pxnn}bxb{o");
        stringArray[1] = spryhs.cfr_renamed_9("DjVL@b_}@bF|J");
        stringArray[2] = sprxpe.cfr_renamed_9("}J]ds{ldsbmn");
        stringArray[3] = spryhs.cfr_renamed_9("nIiFcFn[f@algNaHjK");
        stringArray[4] = sprxpe.cfr_renamed_9("m~nnlx{o{o");
        stringArray[5] = spryhs.cfr_renamed_9("lJ|\\n[f@a`i`\u007fJ}N{F`A");
        stringArray[6] = sprxpe.cfr_renamed_9("h{yjbxb}jjnVdro");
        stringArray[7] = "unknown";
        stringArray[8] = spryhs.cfr_renamed_9("]jB`Yji}@bl]c");
        stringArray[9] = sprxpe.cfr_renamed_9("nyw}wg{l{\\w\u007fvoljie");
        stringArray[10] = spryhs.cfr_renamed_9("nnL@b_}@bF|J");
        cfr_renamed_107 = stringArray;
        cfr_renamed_132 = new Hashtable();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprwke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwke) {
            return (sprwke)arg0;
        }
        if (arg0 != null) {
            return sprwke.cfr_renamed_4272(sprune.cfr_renamed_23(arg0).cfr_renamed_97().intValue());
        }
        return null;
    }
}

