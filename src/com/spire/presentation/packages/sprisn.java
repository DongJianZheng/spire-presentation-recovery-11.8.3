/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasy;
import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprmbka;
import com.spire.presentation.packages.sprrln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprisn
extends sprbln {
    private int cfr_renamed_3;
    private sprdsp cfr_renamed_4;

    public void cfr_renamed_14705(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprisn(sprgdo sprgdo2) {
        super(sprgdo2);
        sprisn sprisn2 = this;
        sprisn2.cfr_renamed_4 = new sprdsp();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        int n;
        void arg0;
        arg0.cfr_renamed_11835(sprmbka.cfr_renamed_9("_ LR\u0016q\u0010<8"));
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_11861()) {
            ((sprrln)this.cfr_renamed_4.cfr_renamed_13485(n)).cfr_renamed_14712((spryjn)arg0);
            if (n != this.cfr_renamed_4.cfr_renamed_11861()) {
                arg0.cfr_renamed_14055();
            }
            n2 = ++n;
        }
        arg0.cfr_renamed_11835(sprasy.cfr_renamed_9("uk\u0016"));
    }

    public int cfr_renamed_14677() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_14710(sprrln arg0) {
        this.cfr_renamed_4.cfr_renamed_12962(arg0.cfr_renamed_14486(), arg0);
    }
}

