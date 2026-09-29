/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprxpm;
import java.io.IOException;
import java.io.OutputStream;

public class spraxl
implements sprsv {
    private final sprxpm cfr_renamed_4;

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlyl {
        arg0.write(this.cfr_renamed_4.cfr_renamed_91());
    }

    /*
     * WARNING - void declaration
     */
    public spraxl(sprtpl sprtpl2) {
        this(new sprxpm(arg0.cfr_renamed_568()));
        void arg0;
    }

    public spraxl(sprxpm sprxpm2) {
        this.cfr_renamed_4 = sprxpm2;
    }

    @Override
    public sprlem cfr_renamed_696() {
        return sprdl.cfr_renamed_287;
    }

    @Override
    public Object cfr_renamed_480() {
        return this.cfr_renamed_4;
    }
}

