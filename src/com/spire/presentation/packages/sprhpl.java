/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprien;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprrxl;
import com.spire.presentation.packages.sprzt;
import java.io.IOException;
import java.io.OutputStream;

public class sprhpl {
    public static final String cfr_renamed_3 = sprgz.cfr_renamed_112.cfr_renamed_19();
    private int cfr_renamed_4;

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public OutputStream cfr_renamed_10813(OutputStream arg0, sprzt arg1) throws IOException {
        return this.cfr_renamed_10814(sprgz.cfr_renamed_3, arg0, arg1);
    }

    public OutputStream cfr_renamed_10814(sprlem arg0, OutputStream arg1, sprzt arg2) throws IOException {
        sprien sprien2;
        sprien sprien3 = new sprien(arg1);
        sprien3.cfr_renamed_10775(sprgz.cfr_renamed_91);
        sprien sprien4 = sprien2 = new sprien(sprien3.cfr_renamed_4134(), 0, true);
        sprien sprien5 = sprien2;
        sprien4.cfr_renamed_10775(new sprktm(0L));
        sprien4.cfr_renamed_10815(arg2.cfr_renamed_615());
        sprien sprien6 = new sprien(sprien2.cfr_renamed_4134());
        sprien6.cfr_renamed_10775(arg0);
        OutputStream outputStream = spreul.cfr_renamed_4108(sprien6.cfr_renamed_4134(), 0, true, this.cfr_renamed_4);
        return new sprrxl(arg2.cfr_renamed_1442(outputStream), sprien3, sprien2, sprien6);
    }
}

