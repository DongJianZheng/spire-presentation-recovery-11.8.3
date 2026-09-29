/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgyz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrdz;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprfun {
    private static final sprusca cfr_renamed_86;
    @sprtea
    public static sprfun cfr_renamed_152;
    @sprtea
    public static sprfun cfr_renamed_112;
    private static sprdz cfr_renamed_119;
    private String cfr_renamed_91;
    @sprtea
    public int cfr_renamed_0;
    private static int cfr_renamed_1;
    @sprtea
    public static sprfun cfr_renamed_2;
    @sprtea
    public static sprfun cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfun(String string, int n) {
        void arg0;
        sprfun sprfun2 = this;
        sprfun2.cfr_renamed_91 = arg0;
        sprfun2.cfr_renamed_4 = cfr_renamed_1++;
        sprfun2.cfr_renamed_0 = n;
    }

    public String toString() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprfun cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_86.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_112;
            }
            case 2: {
                return cfr_renamed_2;
            }
            case 3: {
                return cfr_renamed_3;
            }
            case 4: {
                return cfr_renamed_152;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrdz.cfr_renamed_9("\u673a\u778a\u7694\u7f94\u8f7c\u7eb7\u5226\u6527\u678c\uff75")).append(arg0).toString());
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_119;
    }

    static {
        cfr_renamed_112 = new sprfun("Normal", 0);
        cfr_renamed_2 = new sprfun(sprgyz.cfr_renamed_9("\\\u001fs\u0005r\u001e"), 1);
        cfr_renamed_3 = new sprfun(sprrdz.cfr_renamed_9("=\u007f\u0018"), 2);
        cfr_renamed_152 = new sprfun(sprgyz.cfr_renamed_9("M\u001fh1q\u0014\\\u001fs\u0005r\u001e"), 3);
        cfr_renamed_119 = new sprvrx();
        cfr_renamed_1 = 0;
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_3);
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_152);
        String[] stringArray = new String[5];
        stringArray[0] = "";
        stringArray[1] = "Normal";
        stringArray[2] = sprrdz.cfr_renamed_9("S\u0000|\u001a}\u0001");
        stringArray[3] = sprgyz.cfr_renamed_9("\"p\u0007");
        stringArray[4] = sprrdz.cfr_renamed_9("B\u0000g.~\u000bS\u0000|\u001a}\u0001");
        cfr_renamed_86 = new sprusca(stringArray);
    }

    @sprtea
    public static sprfun cfr_renamed_15474(String arg0) {
        for (sprfun sprfun2 : cfr_renamed_119) {
            if (!sprraia.cfr_renamed_11730(sprfun2.cfr_renamed_91, arg0)) continue;
            return sprfun2;
        }
        throw new IllegalArgumentException(arg0);
    }
}

