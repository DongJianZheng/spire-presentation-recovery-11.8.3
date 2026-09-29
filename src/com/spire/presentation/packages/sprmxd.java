/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprhoe;
import com.spire.presentation.packages.sprhpd;
import com.spire.presentation.packages.sprmk;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtzd;
import java.io.IOException;
import java.io.OutputStream;

public class sprmxd {
    public static final String cfr_renamed_3 = "1.2.840.113549.1.9.16.3.8";
    private int cfr_renamed_4;

    public OutputStream cfr_renamed_4184(sprtzd arg0, OutputStream arg1, sprmk arg2) throws IOException {
        sprhoe sprhoe2;
        sprhoe sprhoe3 = new sprhoe(arg1);
        sprhoe3.cfr_renamed_4133(sprgl.cfr_renamed_112);
        sprhoe sprhoe4 = sprhoe2 = new sprhoe(sprhoe3.cfr_renamed_4134(), 0, true);
        sprhoe sprhoe5 = sprhoe2;
        sprhoe4.cfr_renamed_4133(new sprooe(0L));
        sprhoe4.cfr_renamed_4133(arg2.cfr_renamed_615());
        sprhoe sprhoe6 = new sprhoe(sprhoe2.cfr_renamed_4134());
        sprhoe6.cfr_renamed_4133(arg0);
        OutputStream outputStream = sprerd.cfr_renamed_4108(sprhoe6.cfr_renamed_4134(), 0, true, this.cfr_renamed_4);
        return new sprhpd(this, arg2.cfr_renamed_1442(outputStream), sprhoe3, sprhoe2, sprhoe6);
    }

    public OutputStream cfr_renamed_4185(OutputStream arg0, sprmk arg1) throws IOException {
        return this.cfr_renamed_4184(sprgl.cfr_renamed_152, arg0, arg1);
    }

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_4 = arg0;
    }
}

