/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprich;
import com.spire.presentation.packages.sprin;
import com.spire.presentation.packages.sprlch;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprtih;
import com.spire.presentation.packages.sprze;
import java.io.IOException;
import java.io.InputStream;

public class sprzlh
implements sprin {
    private final String cfr_renamed_3;
    private final sprlj cfr_renamed_4;

    @Override
    public sprze cfr_renamed_8499(InputStream arg0) throws IOException {
        sprzlh sprzlh2 = this;
        return new sprlch(new sprtih(sprzlh2.cfr_renamed_3, sprzlh2.cfr_renamed_4), sprich.cfr_renamed_8491(arg0));
    }

    @Override
    public sprze cfr_renamed_8500(sprfhh arg0, InputStream arg1) throws IOException {
        sprzlh sprzlh2 = this;
        return new sprlch(new sprtih(sprzlh2.cfr_renamed_3, sprzlh2.cfr_renamed_4), arg0, sprich.cfr_renamed_8491(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprzlh(String string, sprlj sprlj2) {
        void arg0;
        sprzlh sprzlh2 = this;
        sprzlh2.cfr_renamed_3 = arg0;
        sprzlh2.cfr_renamed_4 = sprlj2;
    }
}

