/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnas;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprjoo {
    private static int cfr_renamed_86;
    @sprtea
    public static sprjoo cfr_renamed_152;
    private static sprdz cfr_renamed_112;
    private int cfr_renamed_119;
    @sprtea
    public static sprjoo cfr_renamed_91;
    @sprtea
    public static sprjoo cfr_renamed_0;
    private String cfr_renamed_1;
    private static final sprusca cfr_renamed_2;
    @sprtea
    public static sprjoo cfr_renamed_3;
    @sprtea
    public int cfr_renamed_4;

    static {
        cfr_renamed_152 = new sprjoo("Normal", 0);
        cfr_renamed_3 = new sprjoo(sprnas.cfr_renamed_9("vg\\JX"), 1);
        cfr_renamed_91 = new sprjoo(sprnas.cfr_renamed_9("`}@DVcDC@A"), 2);
        cfr_renamed_0 = new sprjoo(sprnas.cfr_renamed_9("`~DT_ZKV"), 3);
        cfr_renamed_112 = new sprvrx();
        cfr_renamed_86 = 0;
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_152);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_3);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_91);
        cfr_renamed_112.cfr_renamed_12808(cfr_renamed_0);
        String[] stringArray = new String[4];
        stringArray[0] = "Normal";
        stringArray[1] = sprnas.cfr_renamed_9("vg\\JX");
        stringArray[2] = sprnas.cfr_renamed_9("`}@DVcDC@A");
        stringArray[3] = sprnas.cfr_renamed_9("`~DT_ZKV");
        cfr_renamed_2 = new sprusca(stringArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprjoo cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_2.cfr_renamed_12854(arg0)) {
            case 0: {
                return cfr_renamed_152;
            }
            case 1: {
                return cfr_renamed_3;
            }
            case 2: {
                return cfr_renamed_91;
            }
            case 3: {
                return cfr_renamed_0;
            }
        }
        return cfr_renamed_152;
    }

    public static sprjoo cfr_renamed_15474(String arg0) {
        for (sprjoo sprjoo2 : cfr_renamed_112) {
            if (!sprraia.cfr_renamed_11730(sprjoo2.cfr_renamed_1, arg0)) continue;
            return sprjoo2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjoo(String string, int n) {
        void arg0;
        sprjoo sprjoo2 = this;
        sprjoo2.cfr_renamed_1 = arg0;
        sprjoo2.cfr_renamed_119 = cfr_renamed_86++;
        sprjoo2.cfr_renamed_4 = n;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_112;
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_119;
    }

    public String toString() {
        return this.cfr_renamed_1;
    }
}

