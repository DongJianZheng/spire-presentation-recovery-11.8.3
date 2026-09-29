/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprboy;
import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprcqm;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjrh;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprybl;

public class sprflk
implements sprvm {
    private final sprgf cfr_renamed_0 = sprjrh.cfr_renamed_8769();
    private sprbyk cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprnuk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprflk(byte[] byArray) {
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprcqm.cfr_renamed_9(" thysr\u007fc 7dviyhc'ub7ibk{"));
        }
        this.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_0.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_0.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_3 || null == this.cfr_renamed_1) {
            throw new IllegalStateException(sprboy.cfr_renamed_9("\u000b5|d{`w!&\u0002'6 4<q >:q'?'%'0\"8=4*q(><q=8)?/%;#+q)4 4<0:8!?`"));
        }
        byte[] byArray = new byte[64];
        if (64 != this.cfr_renamed_0.cfr_renamed_1219(byArray, 0)) {
            throw new IllegalStateException(sprcqm.cfr_renamed_9("Gurovt\u007f'snpbds7avn{bs"));
        }
        byte[] byArray2 = new byte[64];
        this.cfr_renamed_1.cfr_renamed_9938(2, this.cfr_renamed_2, byArray, 0, 64, byArray2, 0);
        return byArray2;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3) {
            this.cfr_renamed_1 = (sprbyk)arg1;
            this.cfr_renamed_4 = null;
        } else {
            this.cfr_renamed_1 = null;
            this.cfr_renamed_4 = (sprnuk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9914("Ed25519", 128, arg1, arg0));
        this.cfr_renamed_41();
    }

    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_3 || null == this.cfr_renamed_4) {
            throw new IllegalStateException(sprboy.cfr_renamed_9("\u0014*c{d\u007fh>9\u001d8)?+#n?!%n8 8:8/='\"+5n7!#n'+#'7'2/%'> "));
        }
        if (64 != arg0.length) {
            this.cfr_renamed_0.cfr_renamed_41();
            return false;
        }
        byte[] byArray = new byte[64];
        if (64 != this.cfr_renamed_0.cfr_renamed_1219(byArray, 0)) {
            throw new IllegalStateException(sprcqm.cfr_renamed_9("Gurovt\u007f'snpbds7avn{bs"));
        }
        return this.cfr_renamed_4.cfr_renamed_9939(2, this.cfr_renamed_2, byArray, 0, 64, arg0, 0);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_0.cfr_renamed_1221(arg0);
    }
}

