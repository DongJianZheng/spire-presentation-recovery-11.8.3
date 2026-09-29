/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdqo;
import com.spire.presentation.packages.sprkr;
import com.spire.presentation.packages.sprmx;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprrz;
import com.spire.presentation.packages.sprssp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;

@sprtea
public class spryoo
implements sprmx {
    public double cfr_renamed_91;
    public double cfr_renamed_0;
    public int cfr_renamed_1;
    public sprwvn cfr_renamed_2;
    public sprwvn cfr_renamed_3;
    public int cfr_renamed_4;

    public boolean cfr_renamed_16773(double arg0) {
        return this.cfr_renamed_91 + arg0 > this.cfr_renamed_0;
    }

    @Override
    public sprwvn cfr_renamed_17083(sprwvn arg0, sprrz arg1) {
        spryoo spryoo2 = this;
        spryoo spryoo3 = spryoo2;
        spryoo2.cfr_renamed_17104(arg0);
        while (spryoo3.cfr_renamed_4 < this.cfr_renamed_3.size()) {
            this.cfr_renamed_0 = arg1.cfr_renamed_17076();
            if (!this.cfr_renamed_16768() && !this.cfr_renamed_17105()) {
                this.cfr_renamed_16772();
            }
            spryoo spryoo4 = this;
            spryoo3 = spryoo4;
            spryoo4.cfr_renamed_17106();
        }
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_16768() {
        spryoo spryoo2 = this;
        while (spryoo2.cfr_renamed_4 < this.cfr_renamed_3.size()) {
            spryoo spryoo3 = this;
            sprkr sprkr2 = (sprkr)spryoo3.cfr_renamed_3.get(spryoo3.cfr_renamed_4);
            this.cfr_renamed_91 += sprkr2.cfr_renamed_16769();
            if (sprkr2.cfr_renamed_324() == 2) {
                ++this.cfr_renamed_4;
                return 1 != 0;
            }
            if (sprkr2.cfr_renamed_324() != 1) {
                ++this.cfr_renamed_4;
                return false;
            }
            spryoo spryoo4 = this;
            spryoo2 = spryoo4;
            ++spryoo4.cfr_renamed_4;
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_17106() {
        sprssp sprssp2;
        sprssp sprssp3 = sprssp2 = new sprssp(this.cfr_renamed_3);
        sprssp3.cfr_renamed_17107(this.cfr_renamed_1);
        sprssp3.cfr_renamed_17108(this.cfr_renamed_4);
        sprdqo sprdqo2 = new sprdqo(sprssp2);
        sprovja.cfr_renamed_11658(this.cfr_renamed_2, sprdqo2);
        spryoo spryoo2 = this;
        spryoo2.cfr_renamed_1 = this.cfr_renamed_4;
        spryoo2.cfr_renamed_91 = 0.0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_17104(sprwvn sprwvn2) {
        void arg0;
        spryoo spryoo2 = this;
        spryoo spryoo3 = this;
        spryoo spryoo4 = this;
        spryoo4.cfr_renamed_2 = new sprwvn();
        spryoo3.cfr_renamed_3 = arg0;
        spryoo3.cfr_renamed_1 = 0;
        spryoo2.cfr_renamed_4 = 0;
        spryoo2.cfr_renamed_91 = 0.0;
    }

    public boolean cfr_renamed_17105() {
        spryoo spryoo2 = this;
        while (spryoo2.cfr_renamed_4 < this.cfr_renamed_3.size()) {
            spryoo spryoo3 = this;
            sprkr sprkr2 = (sprkr)spryoo3.cfr_renamed_3.get(spryoo3.cfr_renamed_4);
            if (sprkr2.cfr_renamed_324() == 2) {
                ++this.cfr_renamed_4;
                return 1 != 0;
            }
            if (this.cfr_renamed_16773(sprkr2.cfr_renamed_16769())) {
                return false;
            }
            spryoo spryoo4 = this;
            spryoo2 = spryoo4;
            spryoo4.cfr_renamed_91 += sprkr2.cfr_renamed_16769();
            ++spryoo4.cfr_renamed_4;
        }
        return false;
    }

    public void cfr_renamed_16772() {
        spryoo spryoo2 = this;
        while (spryoo2.cfr_renamed_4 < this.cfr_renamed_3.size()) {
            spryoo spryoo3 = this;
            sprkr sprkr2 = (sprkr)spryoo3.cfr_renamed_3.get(spryoo3.cfr_renamed_4);
            if (sprkr2.cfr_renamed_324() != 1) {
                return;
            }
            spryoo spryoo4 = this;
            spryoo2 = spryoo4;
            spryoo4.cfr_renamed_91 += sprkr2.cfr_renamed_16769();
            ++spryoo4.cfr_renamed_4;
        }
    }
}

