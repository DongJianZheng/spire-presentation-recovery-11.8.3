/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.OutputStream;

public class sprhfn
extends sproen {
    @Override
    public sprhfn cfr_renamed_4785() {
        return this;
    }

    @Override
    public void cfr_renamed_11292(sprxgf[] arg0) throws IOException {
        int n;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprxgf sprxgf2 = arg0[n].cfr_renamed_4612();
            sprxgf2.cfr_renamed_11218(this, true);
            n3 = ++n;
        }
    }

    @Override
    public void cfr_renamed_11286(sprxgf arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_4612().cfr_renamed_11218(this, arg1);
    }

    @Override
    public void cfr_renamed_11293(sprco[] arg0) throws IOException {
        int n = 0;
        int n2 = arg0.length;
        int n3 = n;
        while (n3 < n2) {
            sprxgf sprxgf2 = arg0[n].cfr_renamed_119().cfr_renamed_4612();
            sprxgf2.cfr_renamed_11218(this, true);
            n3 = ++n;
        }
    }

    public sprhfn(OutputStream arg0) {
        super(arg0);
    }
}

