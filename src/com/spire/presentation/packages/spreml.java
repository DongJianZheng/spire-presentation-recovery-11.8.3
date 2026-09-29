/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhll;
import com.spire.presentation.packages.sprknp;

public class spreml
implements sprgf {
    private sprhll cfr_renamed_4;

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_4.size();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        spreml spreml2 = this;
        int n = spreml2.cfr_renamed_4.size();
        spreml2.cfr_renamed_4.cfr_renamed_10500(arg0, arg1);
        spreml2.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.reset();
    }

    @Override
    public String cfr_renamed_1315() {
        return sprknp.cfr_renamed_9("jAhX");
    }

    public spreml() {
        spreml spreml2 = this;
        spreml2.cfr_renamed_4 = new sprhll(null);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.write(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.write(arg0);
    }
}

