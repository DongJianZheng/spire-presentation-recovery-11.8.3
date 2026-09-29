/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.spritn;
import com.spire.presentation.packages.sprknp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzuo;

@sprtea
public class sprtun
extends sprbln {
    private spritn cfr_renamed_4;

    @sprtea
    public void cfr_renamed_14442(String arg0) {
        sprovja.cfr_renamed_11658(this.cfr_renamed_4, arg0);
    }

    @sprtea
    public String cfr_renamed_14443() {
        if (this.cfr_renamed_4.size() == 0) {
            return "";
        }
        return (String)this.cfr_renamed_4.get(0);
    }

    @sprtea
    public sprtun(sprgdo sprgdo2) {
        super(sprgdo2);
        sprtun sprtun2 = this;
        sprtun2.cfr_renamed_4 = new spritn();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        void arg0;
        spryjn spryjn3 = spryjn2;
        spryjn spryjn4 = spryjn2;
        spryjn4.cfr_renamed_14086();
        spryjn4.cfr_renamed_14057(sprknp.cfr_renamed_9(";pmTq"), sprzuo.cfr_renamed_9("\u007f>1\t5\u001d"));
        spryjn3.cfr_renamed_14094(sprknp.cfr_renamed_9("\u000bWKaJ`"), this.cfr_renamed_4.size());
        spryjn3.cfr_renamed_11835(sprzuo.cfr_renamed_9("A\u001b\u00074\u001d"));
        void v2 = arg0;
        this.cfr_renamed_4.cfr_renamed_14441((spryjn)v2);
        v2.cfr_renamed_14061();
    }

    public String cfr_renamed_14444(int arg0) {
        if (arg0 < 0 || arg0 >= this.cfr_renamed_4.size()) {
            return "";
        }
        return String.valueOf(this.cfr_renamed_4.get(arg0));
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.size();
    }
}

