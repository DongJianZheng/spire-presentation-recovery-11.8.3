/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.spruse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprlpe
extends spruse {
    private final ByteArrayOutputStream cfr_renamed_4;

    public sprlpe(OutputStream outputStream) throws IOException {
        super(outputStream);
        sprlpe sprlpe2 = this;
        sprlpe2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    @Override
    public OutputStream cfr_renamed_4134() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_4133(spra arg0) throws IOException {
        arg0.cfr_renamed_119().cfr_renamed_4613(new sprpve(this.cfr_renamed_4));
    }

    public sprlpe(OutputStream outputStream, int n, boolean bl) throws IOException {
        super(outputStream, n, bl);
        sprlpe sprlpe2 = this;
        sprlpe2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    public void cfr_renamed_2637() throws IOException {
        sprlpe sprlpe2 = this;
        sprlpe2.cfr_renamed_4791(48, sprlpe2.cfr_renamed_4.toByteArray());
    }
}

