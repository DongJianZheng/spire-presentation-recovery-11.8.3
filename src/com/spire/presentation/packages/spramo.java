/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabi;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class spramo {
    private static int cfr_renamed_107;
    private int cfr_renamed_132;
    @sprtea
    public static spramo cfr_renamed_102;
    private String cfr_renamed_93;
    @sprtea
    public static spramo cfr_renamed_86;
    @sprtea
    public static spramo cfr_renamed_152;
    private static sprdz cfr_renamed_112;
    @sprtea
    public static spramo cfr_renamed_119;
    @sprtea
    public static spramo cfr_renamed_91;
    @sprtea
    public static spramo cfr_renamed_0;
    @sprtea
    public int cfr_renamed_1;
    private static final sprusca cfr_renamed_2;
    @sprtea
    public static spramo cfr_renamed_3;
    @sprtea
    public static spramo cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_93;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spramo(String string, int n) {
        void arg0;
        spramo spramo2 = this;
        spramo2.cfr_renamed_93 = arg0;
        spramo2.cfr_renamed_132 = cfr_renamed_107++;
        spramo2.cfr_renamed_1 = n;
    }

    static {
        cfr_renamed_3 = new spramo(sprabi.cfr_renamed_9("l\u0012L\u0018"), 0);
        cfr_renamed_119 = new spramo(sprmzo.cfr_renamed_9(">A\u0014X+W\nQ\u001dZ"), 1);
        cfr_renamed_4 = new spramo(sprabi.cfr_renamed_9("(Q\u0018m\bV\u0011K\u0013G\u000e"), 2);
        cfr_renamed_91 = new spramo(sprmzo.cfr_renamed_9("a\u000bQ,\\\rY\u001aG"), 3);
        cfr_renamed_152 = new spramo(sprabi.cfr_renamed_9("(Q\u0018a\bQ\tM\u0010v\u001cE\u000e"), 4);
        cfr_renamed_86 = new spramo(sprmzo.cfr_renamed_9("a\u000bQ4U\u0001Q\nG"), 5);
        cfr_renamed_0 = new spramo(sprabi.cfr_renamed_9("(Q\u0018c\tV\u001cV\u001eJ\u000e"), 6);
        cfr_renamed_102 = new spramo(sprmzo.cfr_renamed_9("-G\u001dv\u0017[\u0013Y\u0019F\u0013G"), 7);
        cfr_renamed_112 = new sprvrx();
        cfr_renamed_107 = 0;
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_3);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_152);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_86);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_0);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_102);
        String[] stringArray = new String[9];
        stringArray[0] = "";
        stringArray[1] = sprabi.cfr_renamed_9("l\u0012L\u0018");
        stringArray[2] = sprmzo.cfr_renamed_9(">A\u0014X+W\nQ\u001dZ");
        stringArray[3] = sprabi.cfr_renamed_9("(Q\u0018m\bV\u0011K\u0013G\u000e");
        stringArray[4] = sprmzo.cfr_renamed_9("a\u000bQ,\\\rY\u001aG");
        stringArray[5] = sprabi.cfr_renamed_9("(Q\u0018a\bQ\tM\u0010v\u001cE\u000e");
        stringArray[6] = sprmzo.cfr_renamed_9("a\u000bQ4U\u0001Q\nG");
        stringArray[7] = sprabi.cfr_renamed_9("(Q\u0018c\tV\u001cV\u001eJ\u000e");
        stringArray[8] = sprmzo.cfr_renamed_9("-G\u001dv\u0017[\u0013Y\u0019F\u0013G");
        cfr_renamed_2 = new sprusca(stringArray);
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_112;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static spramo cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_2.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_3;
            }
            case 2: {
                return cfr_renamed_119;
            }
            case 3: {
                return cfr_renamed_4;
            }
            case 4: {
                return cfr_renamed_91;
            }
            case 5: {
                return cfr_renamed_152;
            }
            case 6: {
                return cfr_renamed_86;
            }
            case 7: {
                return cfr_renamed_0;
            }
            case 8: {
                return cfr_renamed_102;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprabi.cfr_renamed_9("\u6708\u7798\u76a6\u7aea\u53c1\u6a5c\u5f2d\uff67")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_132;
    }

    @sprtea
    public static spramo cfr_renamed_15474(String arg0) {
        for (spramo spramo2 : cfr_renamed_112) {
            if (!sprraia.cfr_renamed_11730(spramo2.cfr_renamed_93, arg0)) continue;
            return spramo2;
        }
        throw new IllegalArgumentException(arg0);
    }
}

