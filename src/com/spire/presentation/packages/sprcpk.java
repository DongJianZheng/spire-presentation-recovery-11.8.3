/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprmkk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprtyba;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprybl;

public class sprcpk
implements sprvm {
    private final byte[] cfr_renamed_0;
    private sprnuk cfr_renamed_1;
    private boolean cfr_renamed_2;
    private final sprmkk cfr_renamed_3;
    private sprbyk cfr_renamed_4;

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

    /*
     * WARNING - void declaration
     */
    public sprcpk(byte[] byArray) {
        void arg0;
        sprcpk sprcpk2 = this;
        sprcpk2.cfr_renamed_3 = new sprmkk(null);
        if (null == arg0) {
            throw new NullPointerException(sprtyba.cfr_renamed_9("N&\u0006+\u001d \u00111Ne\n$\u0007+\u00061I'\fe\u00070\u0005)"));
        }
        this.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg0);
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
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_2 || null == this.cfr_renamed_4) {
            throw new IllegalStateException(sprwzj.cfr_renamed_9("+\u0010\\A[EW\u0017\u001a\f=\u001d\t\u001a\u000b\u0006N\u001a\u0001\u0000N\u001d\u0000\u001d\u001a\u001d\u000f\u0018\u0007\u0007\u000b\u0010N\u0012\u0001\u0006N\u0007\u0007\u0013\u0000\u0015\u001a\u0001\u001c\u0011N\u0013\u000b\u001a\u000b\u0006\u000f\u0000\u0007\u001b\u0000Z"));
        }
        sprcpk sprcpk2 = this;
        return sprcpk2.cfr_renamed_3.cfr_renamed_9942(sprcpk2.cfr_renamed_4, this.cfr_renamed_0);
    }

    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_2 || null == this.cfr_renamed_1) {
            throw new IllegalStateException(sprtyba.cfr_renamed_9("\u0000\rw\\pX|\n1\u0011\u0016\u0000\"\u0007 \u001be\u0007*\u001de\u0000+\u00001\u0000$\u0005,\u001a \re\u000f*\u001be\u001f \u001b,\u000f,\n$\u001d,\u0006+"));
        }
        sprcpk sprcpk2 = this;
        return sprcpk2.cfr_renamed_3.cfr_renamed_9943(sprcpk2.cfr_renamed_1, this.cfr_renamed_0, arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3.reset();
    }
}

