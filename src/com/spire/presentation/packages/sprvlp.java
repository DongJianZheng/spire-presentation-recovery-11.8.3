/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprvlp {
    private static final short cfr_renamed_1 = 253;
    private static final short cfr_renamed_2 = 253;
    private static final short cfr_renamed_3 = 255;
    private static final short cfr_renamed_4 = 254;

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static int cfr_renamed_15088(sprmzo arg0) {
        short s = (short)(arg0.cfr_renamed_12137() & 0xFF);
        switch (s) {
            case 253: {
                return arg0.cfr_renamed_13218();
            }
            case 255: {
                return (arg0.cfr_renamed_12137() & 0xFF) + 253;
            }
            case 254: {
                return (arg0.cfr_renamed_12137() & 0xFF) + 506;
            }
        }
        return s;
    }

    private /* synthetic */ sprvlp() {
    }

    @sprtea
    public static void cfr_renamed_19165(int arg0, sprruo arg1) {
        if (arg0 < 253) {
            arg1.cfr_renamed_11594((byte)arg0);
            return;
        }
        if (arg0 <= 508) {
            sprruo sprruo2 = arg1;
            sprruo2.cfr_renamed_11594((byte)-1);
            sprruo2.cfr_renamed_11594((byte)(arg0 - 253));
            return;
        }
        if (arg0 <= 761) {
            sprruo sprruo3 = arg1;
            sprruo3.cfr_renamed_11594((byte)-2);
            sprruo3.cfr_renamed_11594((byte)(arg0 - 506));
            return;
        }
        arg1.cfr_renamed_11594((byte)-3);
        arg1.cfr_renamed_15085(arg0);
    }
}

