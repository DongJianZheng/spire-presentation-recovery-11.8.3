/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprrkaa;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.spruzo;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprznk;

public class sprmgk
implements sprvm {
    private sprnuk cfr_renamed_1;
    private boolean cfr_renamed_2;
    private final sprznk cfr_renamed_3;
    private sprbyk cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3.reset();
    }

    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_2 || null == this.cfr_renamed_1) {
            throw new IllegalStateException(sprrkaa.cfr_renamed_9("}O\n\u001e\r\u001a\u0001xQLVNJ\u000bVDL\u000bQEQ_QJTBKN\\\u000b^DJ\u000bNNJB^B[JLBWE"));
        }
        sprmgk sprmgk2 = this;
        return sprmgk2.cfr_renamed_3.cfr_renamed_9940(sprmgk2.cfr_renamed_1, arg0);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.write(arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.write(arg0, arg1, arg2);
    }

    public sprmgk() {
        sprmgk sprmgk2 = this;
        sprmgk2.cfr_renamed_3 = new sprznk(null);
    }

    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_2 || null == this.cfr_renamed_4) {
            throw new IllegalStateException(spruzo.cfr_renamed_9("PV'\u0007 \u0003,a|U{Wg\u0012{]a\u0012|\\|F|Sy[fWq\u0012s]g\u0012f[r\\tF`@p\u0012rW{WgSa[z\\;"));
        }
        sprmgk sprmgk2 = this;
        return sprmgk2.cfr_renamed_3.cfr_renamed_9941(sprmgk2.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2) {
            this.cfr_renamed_4 = (sprbyk)arg1;
            this.cfr_renamed_1 = null;
        } else {
            this.cfr_renamed_4 = null;
            this.cfr_renamed_1 = (sprnuk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9914("Ed25519", 128, arg1, arg0));
        this.cfr_renamed_41();
    }
}

