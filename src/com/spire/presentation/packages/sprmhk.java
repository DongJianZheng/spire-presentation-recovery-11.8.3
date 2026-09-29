/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprrs;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.InputStream;

public class sprmhk
implements sprrs {
    private final boolean cfr_renamed_4;

    @Override
    public spryye cfr_renamed_3338(InputStream arg0) throws IOException {
        int n = this.cfr_renamed_4 ? 32 : 56;
        byte[] byArray = new byte[n];
        sprkqe.cfr_renamed_473(arg0, byArray, 0, byArray.length);
        if (this.cfr_renamed_4) {
            return new sprwgk(byArray, 0);
        }
        return new sprlnk(byArray, 0);
    }

    public sprmhk(boolean bl) {
        this.cfr_renamed_4 = bl;
    }
}

