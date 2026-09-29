/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasg;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.spridc;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprego {
    private String cfr_renamed_152;
    @sprtea
    public static sprego cfr_renamed_112;
    private static sprdz cfr_renamed_119;
    @sprtea
    public static sprego cfr_renamed_91;
    @sprtea
    public static sprego cfr_renamed_0;
    private static final sprusca cfr_renamed_1;
    private static int cfr_renamed_2;
    private int cfr_renamed_3;
    @sprtea
    public int cfr_renamed_4;

    @sprtea
    public static sprego cfr_renamed_15474(String arg0) {
        for (sprego sprego2 : cfr_renamed_119) {
            if (!sprraia.cfr_renamed_11730(sprego2.cfr_renamed_152, arg0)) continue;
            return sprego2;
        }
        throw new IllegalArgumentException(arg0);
    }

    public String toString() {
        return this.cfr_renamed_152;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprego cfr_renamed_141(String arg0) {
        arg0 = sprriia.cfr_renamed_15321(arg0, null) ? "" : sprraia.cfr_renamed_12806(arg0);
        switch (cfr_renamed_1.cfr_renamed_12854(arg0)) {
            case 0: {
                return cfr_renamed_0;
            }
            case 1: {
                return cfr_renamed_112;
            }
            case 2: {
                return cfr_renamed_91;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spridc.cfr_renamed_9("\u6763\u77cf\u7c32\u57a1\u4ec2\u4edc\uff53\n")).append(arg0).toString());
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_119;
    }

    static {
        cfr_renamed_0 = new sprego(sprasg.cfr_renamed_9("~o"), 0);
        cfr_renamed_112 = new sprego(spridc.cfr_renamed_9("\u0019e"), 1);
        cfr_renamed_91 = new sprego(sprasg.cfr_renamed_9("cviyk"), 2);
        cfr_renamed_119 = new sprvrx();
        cfr_renamed_2 = 0;
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_0);
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_112);
        cfr_renamed_119.cfr_renamed_12808(cfr_renamed_91);
        String[] stringArray = new String[3];
        stringArray[0] = spridc.cfr_renamed_9("\re");
        stringArray[1] = sprasg.cfr_renamed_9("jo");
        stringArray[2] = spridc.cfr_renamed_9("i\u0005c\na");
        cfr_renamed_1 = new sprusca(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprego(String string, int n) {
        void arg0;
        sprego sprego2 = this;
        sprego2.cfr_renamed_152 = arg0;
        sprego2.cfr_renamed_3 = cfr_renamed_2++;
        sprego2.cfr_renamed_4 = n;
    }
}

