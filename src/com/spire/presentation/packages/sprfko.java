/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprfko {
    @sprtea
    public static sprfko cfr_renamed_102;
    private static final sprusca cfr_renamed_93;
    private static sprdz cfr_renamed_86;
    private int cfr_renamed_152;
    private static int cfr_renamed_112;
    @sprtea
    public static sprfko cfr_renamed_119;
    @sprtea
    public static sprfko cfr_renamed_91;
    @sprtea
    public static sprfko cfr_renamed_0;
    private String cfr_renamed_1;
    @sprtea
    public static sprfko cfr_renamed_2;
    @sprtea
    public int cfr_renamed_3;
    @sprtea
    public static sprfko cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfko(String string, int n) {
        void arg0;
        sprfko sprfko2 = this;
        sprfko2.cfr_renamed_1 = arg0;
        sprfko2.cfr_renamed_152 = cfr_renamed_112++;
        sprfko2.cfr_renamed_3 = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprfko cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_93.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_4;
            }
            case 2: {
                return cfr_renamed_0;
            }
            case 3: {
                return cfr_renamed_91;
            }
            case 4: {
                return cfr_renamed_2;
            }
            case 5: {
                return cfr_renamed_119;
            }
            case 6: {
                return cfr_renamed_102;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprhnn.cfr_renamed_9("\u6749\u77f9\u9816\u977e\u5e60\u5c5c\u7c18\u5797\uff79<")).append(arg0).toString());
    }

    @sprtea
    public static sprfko cfr_renamed_15474(String arg0) {
        for (sprfko sprfko2 : cfr_renamed_86) {
            if (!sprraia.cfr_renamed_11730(sprfko2.cfr_renamed_1, arg0)) continue;
            return sprfko2;
        }
        throw new IllegalArgumentException(arg0);
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_86;
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_152;
    }

    static {
        cfr_renamed_4 = new sprfko(sprald.cfr_renamed_9("\bA\"\u007f&H\""), 0);
        cfr_renamed_0 = new sprfko(sprhnn.cfr_renamed_9("S\ry s\u000fi\u000er"), 1);
        cfr_renamed_91 = new sprfko(sprald.cfr_renamed_9("{0@\u0017N J\u000b"), 2);
        cfr_renamed_2 = new sprfko(sprhnn.cfr_renamed_9("7k\f_\fp\u0016q\rP"), 3);
        cfr_renamed_119 = new sprfko(sprald.cfr_renamed_9("{0@\u0017N J\u0015"), 4);
        cfr_renamed_102 = new sprfko(sprhnn.cfr_renamed_9("7k\f_\fp\u0016q\rN"), 5);
        cfr_renamed_86 = new sprvrx();
        cfr_renamed_112 = 0;
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_4);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_0);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_119);
        cfr_renamed_86.cfr_renamed_12808(cfr_renamed_102);
        String[] stringArray = new String[7];
        stringArray[0] = "";
        stringArray[1] = sprald.cfr_renamed_9("\bA\"\u007f&H\"");
        stringArray[2] = sprhnn.cfr_renamed_9("S\ry s\u000fi\u000er");
        stringArray[3] = sprald.cfr_renamed_9("{0@\u0017N J\u000b");
        stringArray[4] = sprhnn.cfr_renamed_9("7k\f_\fp\u0016q\rP");
        stringArray[5] = sprald.cfr_renamed_9("{0@\u0017N J\u0015");
        stringArray[6] = sprhnn.cfr_renamed_9("7k\f_\fp\u0016q\rN");
        cfr_renamed_93 = new sprusca(stringArray);
    }
}

