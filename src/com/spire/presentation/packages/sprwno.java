/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprouaa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxuy;

@sprtea
public final class sprwno {
    private int cfr_renamed_86;
    @sprtea
    public int cfr_renamed_152;
    @sprtea
    public static sprwno cfr_renamed_112 = new sprwno(sprouaa.cfr_renamed_9("j,^&K1C6B'"), 0, 5);
    @sprtea
    public static sprwno cfr_renamed_119;
    @sprtea
    public static sprwno cfr_renamed_91;
    private static final sprusca cfr_renamed_0;
    private String cfr_renamed_1;
    private int cfr_renamed_2;
    private static sprdz cfr_renamed_3;
    private static int cfr_renamed_4;

    static {
        cfr_renamed_91 = new sprwno(sprxuy.cfr_renamed_9("|sZe"), 1, 3);
        cfr_renamed_119 = new sprwno(sprouaa.cfr_renamed_9("n\"O(K1C6B'"), 2, 1);
        cfr_renamed_3 = new sprvrx();
        cfr_renamed_4 = 0;
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_3.cfr_renamed_12808(cfr_renamed_119);
        String[] stringArray = new String[4];
        stringArray[0] = "";
        stringArray[1] = sprxuy.cfr_renamed_9("|sZe");
        stringArray[2] = sprouaa.cfr_renamed_9("j,^&K1C6B'");
        stringArray[3] = sprxuy.cfr_renamed_9("|}]wYnQiPx");
        cfr_renamed_0 = new sprusca(stringArray);
    }

    @sprtea
    public int cfr_renamed_15817() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprwno cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_0.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_91;
            }
            case 2: {
                return cfr_renamed_112;
            }
            case 3: {
                return cfr_renamed_119;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprouaa.cfr_renamed_9("\u6706\u77a6\u76a8\u56bd\u5c6e\u7c38\u57a7\uff59")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprwno(String string, int n, int n2) {
        void arg0;
        void arg2;
        sprwno sprwno2 = this;
        this.cfr_renamed_2 = arg2;
        sprwno2.cfr_renamed_1 = arg0;
        sprwno2.cfr_renamed_86 = cfr_renamed_4++;
        sprwno2.cfr_renamed_152 = n;
    }

    public String toString() {
        return this.cfr_renamed_1;
    }

    public static sprwno cfr_renamed_15474(String arg0) {
        for (sprwno sprwno2 : cfr_renamed_3) {
            if (!sprraia.cfr_renamed_11730(sprwno2.cfr_renamed_1, arg0)) continue;
            return sprwno2;
        }
        throw new IllegalArgumentException(arg0);
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_3;
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_86;
    }
}

