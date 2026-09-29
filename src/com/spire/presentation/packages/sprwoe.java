/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprmqba;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;
import java.io.OutputStream;

public class sprwoe
extends sprpve {
    public sprwoe(OutputStream arg0) {
        super(arg0);
    }

    public void cfr_renamed_1591(Object arg0) throws IOException {
        if (arg0 == null) {
            this.cfr_renamed_4907();
            return;
        }
        if (arg0 instanceof sprvva) {
            ((sprvva)arg0).cfr_renamed_4613(this);
            return;
        }
        if (arg0 instanceof spra) {
            ((spra)arg0).cfr_renamed_119().cfr_renamed_4613(this);
            return;
        }
        throw new IOException(sprmqba.cfr_renamed_9("ZT_SVB\u0015XZB\u0015tpdpXVYQWWZP"));
    }
}

