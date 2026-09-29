/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprpwm;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprofn
extends sprpwm {
    private final ByteArrayOutputStream cfr_renamed_4;

    public void cfr_renamed_10815(sprco arg0) throws IOException {
        arg0.cfr_renamed_119().cfr_renamed_8489(this.cfr_renamed_4, "DER");
    }

    @Override
    public OutputStream cfr_renamed_4134() {
        return this.cfr_renamed_4;
    }

    public sprofn(OutputStream outputStream, int n, boolean bl) throws IOException {
        super(outputStream, n, bl);
        sprofn sprofn2 = this;
        sprofn2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    public sprofn(OutputStream outputStream) throws IOException {
        super(outputStream);
        sprofn sprofn2 = this;
        sprofn2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    public void cfr_renamed_2637() throws IOException {
        sprofn sprofn2 = this;
        sprofn2.cfr_renamed_4791(48, sprofn2.cfr_renamed_4.toByteArray());
    }

    public void cfr_renamed_10775(sprxgf arg0) throws IOException {
        arg0.cfr_renamed_8489(this.cfr_renamed_4, "DER");
    }
}

