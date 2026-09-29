/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprdqz;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprkza;
import com.spire.presentation.packages.sprndo;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprttn;
import com.spire.presentation.packages.spryjn;

@sprtea
public abstract class sprzjn
extends sprcrn {
    private sprqgp cfr_renamed_2;
    private sprttn cfr_renamed_3;
    private sprndo cfr_renamed_4;

    public void cfr_renamed_14722(sprttn arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprndo cfr_renamed_14723() {
        return this.cfr_renamed_4;
    }

    public sprqgp cfr_renamed_14724() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_14404(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        arg0.cfr_renamed_14057(sprkza.cfr_renamed_9("W\u0011\u00015\u001d"), sprdqz.cfr_renamed_9("r\\<x)i/b"));
        v3.cfr_renamed_14094(sprkza.cfr_renamed_9("j($\f1\u001d7\u0016\u0011\u00015\u001d"), 1);
        v3.cfr_renamed_14094(sprdqz.cfr_renamed_9("r\\<e3x\tu-i"), 1);
        v2.cfr_renamed_14094(sprkza.cfr_renamed_9("W\u0011\u0011)\u0011+\u001f\u0011\u00015\u001d"), 3);
        v2.cfr_renamed_14089(sprdqz.cfr_renamed_9("#\u001fN2t"), new sprgeja(0.0f, 0.0f, this.cfr_renamed_14725(), this.cfr_renamed_14726()));
        v1.cfr_renamed_14094(sprkza.cfr_renamed_9("j \u0016\f \b"), this.cfr_renamed_14725());
        v1.cfr_renamed_14094(sprdqz.cfr_renamed_9("rU\u000ex8|"), this.cfr_renamed_14726());
        v0.cfr_renamed_11835(sprkza.cfr_renamed_9("j* \u000b*\r7\u001b \u000b"));
        this.cfr_renamed_14727().cfr_renamed_14485((spryjn)arg0);
        v0.cfr_renamed_14072(sprdqz.cfr_renamed_9("#\u0010m)~4t"), this.cfr_renamed_2);
    }

    public abstract int cfr_renamed_14726();

    public abstract int cfr_renamed_14725();

    public void cfr_renamed_14728(sprndo arg0) {
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzjn(sprgdo sprgdo2, sprqgp sprqgp2) {
        super(sprgdo2);
        void arg0;
        this.cfr_renamed_2 = sprqgp2;
        sprzjn sprzjn2 = this;
        this.cfr_renamed_3 = new sprttn((sprgdo)arg0);
        sprzjn2.cfr_renamed_4 = new sprndo(this.cfr_renamed_2820(), this.cfr_renamed_14727(), this);
    }

    public sprttn cfr_renamed_14727() {
        return this.cfr_renamed_3;
    }
}

