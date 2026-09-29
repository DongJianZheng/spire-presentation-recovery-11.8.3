/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcll;
import com.spire.presentation.packages.sprfkba;
import com.spire.presentation.packages.sprhzk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzmh;

public class sprhjk
implements sprvm {
    private sprhzk cfr_renamed_0;
    private sprpxk cfr_renamed_1;
    private final sprud cfr_renamed_2 = sprzmh.cfr_renamed_8769();
    private final byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhjk(byte[] byArray) {
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprcll.cfr_renamed_9("\u001c\u000bT\u0006O\rC\u001c\u001cHX\tU\u0006T\u001c\u001b\n^HU\u001dW\u0004"));
        }
        this.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg0);
    }

    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_4 || null == this.cfr_renamed_0) {
            throw new IllegalStateException(sprfkba.cfr_renamed_9("\u0007\u0006vVz\u0012*1+\u0005,\u00070B,\r6B+\f+\u0016+\u0003.\u000b1\u0007&B$\r0B1\u000b%\f#\u00167\u0010'B%\u0007,\u00070\u00036\u000b-\fl"));
        }
        byte[] byArray = new byte[64];
        if (64 != this.cfr_renamed_2.cfr_renamed_1199(byArray, 0, 64)) {
            throw new IllegalStateException(sprcll.cfr_renamed_9("8I\rS\tH\u0000\u001b\fR\u000f^\u001bOH]\tR\u0004^\f"));
        }
        byte[] byArray2 = new byte[114];
        this.cfr_renamed_0.cfr_renamed_9938(1, this.cfr_renamed_3, byArray, 0, 64, byArray2, 0);
        return byArray2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_4 || null == this.cfr_renamed_1) {
            throw new IllegalStateException(sprfkba.cfr_renamed_9("'&VvZ2\n\u0011\u000b%\f'\u0010b\f-\u0016b\u000b,\u000b6\u000b#\u000e+\u0011'\u0006b\u0004-\u0010b\u0014'\u0010+\u0004+\u0001#\u0016+\r,"));
        }
        if (114 != arg0.length) {
            this.cfr_renamed_2.cfr_renamed_41();
            return false;
        }
        byte[] byArray = new byte[64];
        if (64 != this.cfr_renamed_2.cfr_renamed_1199(byArray, 0, 64)) {
            throw new IllegalStateException(sprcll.cfr_renamed_9("8I\rS\tH\u0000\u001b\fR\u000f^\u001bOH]\tR\u0004^\f"));
        }
        return this.cfr_renamed_1.cfr_renamed_9939(1, this.cfr_renamed_3, byArray, 0, 64, arg0, 0);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_4 = arg0;
        if (this.cfr_renamed_4) {
            this.cfr_renamed_0 = (sprhzk)arg1;
            this.cfr_renamed_1 = null;
        } else {
            this.cfr_renamed_0 = null;
            this.cfr_renamed_1 = (sprpxk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9914("Ed448", 224, arg1, arg0));
        this.cfr_renamed_41();
    }
}

