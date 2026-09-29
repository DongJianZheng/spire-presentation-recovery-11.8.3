/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgjn;
import com.spire.presentation.packages.sprgmn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.spryin;

@sprtea
public class sprnkn {
    private sprrpp cfr_renamed_1;
    private sprwvn cfr_renamed_2;
    private sprrpp cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_14714(sprgmn arg0) {
        this.cfr_renamed_1.cfr_renamed_13414(arg0.cfr_renamed_14716(), arg0);
    }

    private /* synthetic */ int cfr_renamed_14718() {
        return this.cfr_renamed_4++;
    }

    public sprgmn cfr_renamed_14703(int arg0) {
        return (sprgmn)this.cfr_renamed_1.cfr_renamed_576(arg0);
    }

    public int cfr_renamed_14706() {
        return this.cfr_renamed_4;
    }

    public sprgjn cfr_renamed_14695(int arg0) {
        return (sprgjn)this.cfr_renamed_14711().cfr_renamed_576(arg0);
    }

    public sprnkn() {
        sprnkn sprnkn2 = this;
        this.cfr_renamed_4 = 0;
        sprnkn sprnkn3 = this;
        sprnkn2.cfr_renamed_1 = new sprrpp();
        sprnkn3.cfr_renamed_2 = new sprwvn();
        sprnkn2.cfr_renamed_3 = new sprrpp();
    }

    public spryin cfr_renamed_14455(String arg0) {
        spryin spryin2;
        spryin spryin3 = spryin2 = new spryin(arg0, this.cfr_renamed_14718(), this);
        sprovja.cfr_renamed_11658(this.cfr_renamed_2, spryin3);
        return spryin3;
    }

    public sprrpp cfr_renamed_14711() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_14715(sprgjn arg0) {
        sprgjn sprgjn2 = arg0;
        this.cfr_renamed_14711().cfr_renamed_13414(arg0.cfr_renamed_14717(), sprgjn2);
        sprgjn2.cfr_renamed_13245().cfr_renamed_14719(this.cfr_renamed_14718());
    }

    public sprwvn cfr_renamed_14707() {
        return this.cfr_renamed_2;
    }
}

