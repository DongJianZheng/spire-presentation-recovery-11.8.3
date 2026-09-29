/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprru;
import com.spire.presentation.packages.sprrw;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvnn;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.spryvm;
import com.spire.presentation.packages.spryx;
import com.spire.presentation.packages.sprzx;

@sprtea
public class spriwm
implements sprzx {
    private spryx cfr_renamed_3;
    private sprpln cfr_renamed_4;

    public void cfr_renamed_11665() {
    }

    public void cfr_renamed_12497(Object arg0) {
        this.cfr_renamed_4 = (sprpln)arg0;
    }

    /*
     * WARNING - void declaration
     */
    public spriwm(int n, sprwbp sprwbp2, sprwbp sprwbp3) {
        void arg2;
        void arg1;
        void arg0;
        spriwm spriwm2 = this;
        spriwm2.cfr_renamed_4 = new sprhlp((int)arg0, (sprwbp)arg1, (sprwbp)arg2);
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spriwm(byte[] byArray, sprqgp sprqgp2) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = new sprpip((byte[])arg0);
        spresca.cfr_renamed_11777(this.cfr_renamed_4, sprpip.class).cfr_renamed_12643((sprqgp)arg1);
    }

    public spriwm(spryx arg0, double arg1) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3 instanceof sprvnn) {
            spriwm spriwm2 = this;
            spriwm2.cfr_renamed_4 = new sprghp(spryvm.cfr_renamed_12601(arg0, arg1));
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void cfr_renamed_12605(sprru arg0, float arg1, float arg2) {
        throw new UnsupportedOperationException();
    }

    public spriwm(spryx arg0, double arg1, sprrw arg2) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3 instanceof sprwbp) {
            spriwm spriwm2 = this;
            spriwm2.cfr_renamed_4 = new sprghp(spryvm.cfr_renamed_12601(arg0, arg1));
        }
        if (arg0 instanceof sprvnn) {
            this.cfr_renamed_4 = new sprghp(spryvm.cfr_renamed_12601(arg0, arg1));
            return;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - void declaration
     */
    public spriwm(sprgeja sprgeja2, sprwbp sprwbp2, sprwbp sprwbp3) {
        void arg2;
        void arg1;
        void arg0;
        spriwm spriwm2 = this;
        spriwm2.cfr_renamed_4 = new sprgdp((sprgeja)arg0, (sprwbp)arg1, (sprwbp)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public spriwm(sprgdp sprgdp2) {
        void arg0;
        spriwm spriwm2 = this;
        spriwm2.cfr_renamed_4 = new sprgdp(arg0.cfr_renamed_12644(), arg0.cfr_renamed_12645(), arg0.cfr_renamed_12646());
    }

    @Override
    public spryx cfr_renamed_12606() {
        return this.cfr_renamed_3;
    }
}

