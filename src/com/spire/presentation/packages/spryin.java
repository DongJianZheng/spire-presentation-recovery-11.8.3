/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprenn;
import com.spire.presentation.packages.sprgjn;
import com.spire.presentation.packages.sprgmn;
import com.spire.presentation.packages.sprmsn;
import com.spire.presentation.packages.sprnkn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkn;
import com.spire.presentation.packages.sprwvn;

@sprtea
public class spryin {
    private String cfr_renamed_0;
    private sprwvn cfr_renamed_1;
    private sprnkn cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryin(String string, int n, sprnkn sprnkn2) {
        void arg1;
        void arg0;
        spryin spryin2 = this;
        spryin spryin3 = this;
        spryin3.cfr_renamed_4 = 0;
        spryin spryin4 = this;
        spryin3.cfr_renamed_1 = new sprwvn();
        spryin3.cfr_renamed_0 = arg0;
        spryin2.cfr_renamed_3 = arg1;
        spryin2.cfr_renamed_2 = sprnkn2;
    }

    public sprwvn cfr_renamed_14708() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_14480(sprmsn arg0) {
        spryin spryin2 = this;
        int n = spryin2.cfr_renamed_14713();
        sprgmn sprgmn2 = new sprgmn(n, this.cfr_renamed_0, arg0.cfr_renamed_19());
        sprovja.cfr_renamed_11658(spryin2.cfr_renamed_1, sprgmn2);
        this.cfr_renamed_2.cfr_renamed_14714(sprgmn2);
        return n;
    }

    public int cfr_renamed_14486() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ int cfr_renamed_14713() {
        return this.cfr_renamed_4++;
    }

    public void cfr_renamed_14479(sprtkn arg0, sprenn arg1) {
        if (arg1.cfr_renamed_14051() == 0) {
            return;
        }
        sprgjn sprgjn2 = new sprgjn(this.cfr_renamed_0, arg0, arg1.cfr_renamed_14051());
        this.cfr_renamed_2.cfr_renamed_14715(sprgjn2);
    }
}

