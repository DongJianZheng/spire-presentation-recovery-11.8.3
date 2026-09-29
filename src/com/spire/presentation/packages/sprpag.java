/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprshl;
import com.spire.presentation.packages.sprztf;

public class sprpag {
    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6460(int n, sprgf sprgf2) {
        int arg0;
        void arg1;
        void v0 = arg1;
        int n2 = arg0;
        arg1.cfr_renamed_1221((byte)(arg0 >>> 24));
        arg1.cfr_renamed_1221((byte)(n2 >>> 16));
        v0.cfr_renamed_1221((byte)(n2 >>> 8));
        v0.cfr_renamed_1221((byte)n);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6461(short s, sprgf sprgf2) {
        short arg0;
        void arg1;
        void v0 = arg1;
        v0.cfr_renamed_1221((byte)(arg0 >>> 8));
        v0.cfr_renamed_1221((byte)s);
    }

    public static int cfr_renamed_6466(sprztf arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprshl.cfr_renamed_9("\"\u001b=&/\u0004/\u001b+\u0002+\u0004=V-\u0017 \u0018!\u0002n\u0014+V \u0003\"\u001a"));
        }
        sprgzf sprgzf2 = arg0.cfr_renamed_6467();
        return (1 << sprgzf2.cfr_renamed_1153()) * sprgzf2.cfr_renamed_1186();
    }

    public static void cfr_renamed_6465(byte[] arg0, int arg1, int arg2, sprgf arg3) {
        arg3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public static void cfr_renamed_6455(byte[] arg0, sprgf arg1) {
        arg1.cfr_renamed_1197(arg0, 0, arg0.length);
    }
}

