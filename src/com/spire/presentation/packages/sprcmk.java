/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToPdfOption;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprehaa;
import com.spire.presentation.packages.spremk;
import com.spire.presentation.packages.sprhzk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprybl;

public class sprcmk
implements sprvm {
    private final byte[] cfr_renamed_0;
    private sprpxk cfr_renamed_1;
    private sprhzk cfr_renamed_2;
    private final spremk cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcmk(byte[] byArray) {
        void arg0;
        sprcmk sprcmk2 = this;
        sprcmk2.cfr_renamed_3 = new spremk(null);
        if (null == arg0) {
            throw new NullPointerException(sprehaa.cfr_renamed_9("sE;H C,Rs\u00067G:H;RtD1\u0006:S8J"));
        }
        this.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg0);
    }

    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_4 || null == this.cfr_renamed_1) {
            throw new IllegalStateException(SaveToPdfOption.cfr_renamed_9("\u0000\nqZ}=,\t+\u000b7N+\u00011N,\u0000,\u001a,\u000f)\u00076\u000b!N#\u00017N3\u000b7\u0007#\u0007&\u000f1\u0007*\u0000"));
        }
        sprcmk sprcmk2 = this;
        return sprcmk2.cfr_renamed_3.cfr_renamed_9936(sprcmk2.cfr_renamed_1, this.cfr_renamed_0, arg0);
    }

    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_4 || null == this.cfr_renamed_2) {
            throw new IllegalStateException(sprehaa.cfr_renamed_9("c0\u0012`\u001e\u0007O3H1TtH;RtO:O O5J=U1Bt@;TtU=A:G S&CtA1H1T5R=I:\b"));
        }
        sprcmk sprcmk2 = this;
        return sprcmk2.cfr_renamed_3.cfr_renamed_9937(sprcmk2.cfr_renamed_2, this.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_4 = arg0;
        if (this.cfr_renamed_4) {
            this.cfr_renamed_2 = (sprhzk)arg1;
            this.cfr_renamed_1 = null;
        } else {
            this.cfr_renamed_2 = null;
            this.cfr_renamed_1 = (sprpxk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9914("Ed448", 224, arg1, arg0));
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.write(arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.write(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3.reset();
    }
}

