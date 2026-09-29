/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpsn;
import com.spire.presentation.packages.sprshn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryffa;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprmun
extends sprcrn
implements sprfy {
    private sprpdja cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private spryjn cfr_renamed_4;

    @Override
    public void cfr_renamed_14550() {
        this.cfr_renamed_4.cfr_renamed_14076();
    }

    public sprmun(sprgdo sprgdo2) {
        super(sprgdo2);
        sprmun sprmun2 = this;
        this.cfr_renamed_1 = new sprpdja();
        sprmun2.cfr_renamed_4 = new spryjn(this.cfr_renamed_1);
    }

    public int cfr_renamed_14551() {
        return this.cfr_renamed_3;
    }

    @Override
    public spryjn cfr_renamed_14552() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprgdo cfr_renamed_2820() {
        return super.cfr_renamed_2820();
    }

    @Override
    public void cfr_renamed_14407() {
        sprmun sprmun2 = this;
        sprmun2.cfr_renamed_13380().cfr_renamed_14076();
        sprmun2.cfr_renamed_2 = (int)sprmun2.cfr_renamed_14060().cfr_renamed_3274();
        sprmun2.cfr_renamed_13380().cfr_renamed_4924(this.cfr_renamed_1.cfr_renamed_3461(), 0, (int)this.cfr_renamed_1.cfr_renamed_806());
    }

    @Override
    public void cfr_renamed_14553(sprbln arg0) {
        sprmun sprmun2 = this;
        sprmun sprmun3 = this;
        sprmun2.cfr_renamed_2820().cfr_renamed_14554().cfr_renamed_14555(arg0.cfr_renamed_19(), sprmun3.cfr_renamed_19(), this.cfr_renamed_3);
        sprmun3.cfr_renamed_13380().cfr_renamed_9011(arg0.cfr_renamed_19());
        sprmun2.cfr_renamed_13380().cfr_renamed_14055();
        sprmun2.cfr_renamed_13380().cfr_renamed_9011((int)this.cfr_renamed_1.cfr_renamed_3274());
        sprmun2.cfr_renamed_13380().cfr_renamed_14055();
        ++sprmun2.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_14404(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        arg0.cfr_renamed_14057(spryffa.cfr_renamed_9("RB\u0004f\u0018"), sprshn.cfr_renamed_9("e2(\u0017\u0019\t'"));
        v0.cfr_renamed_14094("/N", this.cfr_renamed_3);
        v0.cfr_renamed_14094(spryffa.cfr_renamed_9("9;\u007f\u000fe\t"), this.cfr_renamed_2);
    }

    @Override
    public void cfr_renamed_14556(sprpsn arg0) {
    }
}

