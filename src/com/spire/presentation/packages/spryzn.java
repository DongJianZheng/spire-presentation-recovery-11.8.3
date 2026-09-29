/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgon;
import com.spire.presentation.packages.sprppx;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class spryzn {
    @sprtea
    public int cfr_renamed_152;
    @sprtea
    public static spryzn cfr_renamed_112 = new spryzn(sprppx.cfr_renamed_9(">O\u0007C\u0001"), 0);
    @sprtea
    public static spryzn cfr_renamed_119;
    private static int cfr_renamed_91;
    private int cfr_renamed_0;
    private static final sprusca cfr_renamed_1;
    @sprtea
    public static spryzn cfr_renamed_2;
    private String cfr_renamed_3;
    private static sprdz cfr_renamed_4;

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_0;
    }

    static {
        cfr_renamed_2 = new spryzn(sprgon.cfr_renamed_9("/<\b=\u0019"), 1);
        cfr_renamed_119 = new spryzn(sprppx.cfr_renamed_9("1C\u0005C\u001f"), 2);
        cfr_renamed_4 = new sprvrx();
        cfr_renamed_91 = 0;
        cfr_renamed_4.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_4.cfr_renamed_12808(cfr_renamed_2);
        cfr_renamed_4.cfr_renamed_12808(cfr_renamed_119);
        String[] stringArray = new String[4];
        stringArray[0] = "";
        stringArray[1] = sprgon.cfr_renamed_9("0:\t6\u000f");
        stringArray[2] = sprppx.cfr_renamed_9("!I\u0006H\u0017");
        stringArray[3] = sprgon.cfr_renamed_9("?6\u000b6\u0011");
        cfr_renamed_1 = new sprusca(stringArray);
    }

    public String toString() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public static spryzn cfr_renamed_15474(String arg0) {
        for (spryzn spryzn2 : cfr_renamed_4) {
            if (!sprraia.cfr_renamed_11730(spryzn2.cfr_renamed_3, arg0)) continue;
            return spryzn2;
        }
        throw new IllegalArgumentException(arg0);
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryzn(String string, int n) {
        void arg0;
        spryzn spryzn2 = this;
        spryzn2.cfr_renamed_3 = arg0;
        spryzn2.cfr_renamed_0 = cfr_renamed_91++;
        spryzn2.cfr_renamed_152 = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static spryzn cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_1.cfr_renamed_12854(arg0)) {
            case 0: 
            case 1: {
                return cfr_renamed_112;
            }
            case 2: {
                return cfr_renamed_2;
            }
            case 3: {
                return cfr_renamed_119;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprppx.cfr_renamed_9("\u6759\u77c3\u7ecc\u6747\u8fad\u6383\u6844\u5f29\uff69")).append(arg0).toString());
    }
}

