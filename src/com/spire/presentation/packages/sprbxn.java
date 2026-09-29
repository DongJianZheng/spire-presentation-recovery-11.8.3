/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmvn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;
import com.spire.presentation.packages.sprzsp;

@sprtea
public class sprbxn
extends sprmvn {
    @sprtea
    public static sprzsp cfr_renamed_3;
    private static final byte cfr_renamed_4 = 63;

    @Override
    public void cfr_renamed_14843(spryjn arg0) {
    }

    @Override
    public void cfr_renamed_14352(spryjn arg0) {
        arg0.cfr_renamed_11835("<");
    }

    @Override
    public void cfr_renamed_14365(spryjn arg0) {
        arg0.cfr_renamed_11835(">");
    }

    static {
        int n;
        cfr_renamed_3 = new sprzsp();
        int n2 = n = 32;
        while (n2 <= 126) {
            int n3 = n;
            cfr_renamed_3.cfr_renamed_825(n3, n3);
            cfr_renamed_3.cfr_renamed_825(n + 61440, n++);
            n2 = n;
        }
        int n4 = n = 161;
        while (n4 <= 254) {
            if (n != 240) {
                int n5 = n;
                cfr_renamed_3.cfr_renamed_825(n5, n5);
                cfr_renamed_3.cfr_renamed_825(n + 61440, n);
            }
            n4 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14838(int n, int n2, spryjn spryjn2) {
        void arg1;
        void arg2;
        arg2.cfr_renamed_11835(new String(sprznp.cfr_renamed_14859(sprbxn.cfr_renamed_14860((int)arg1))));
    }

    private static /* synthetic */ byte cfr_renamed_14860(int arg0) {
        int n = cfr_renamed_3.cfr_renamed_576(arg0);
        if (sprzsp.cfr_renamed_14861(n)) {
            return 63;
        }
        return (byte)n;
    }
}

