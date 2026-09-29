/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class spredn
extends sprnvm {
    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        spredn spredn2 = this;
        sprxgf sprxgf2 = spredn2.cfr_renamed_4.cfr_renamed_119().cfr_renamed_4612();
        boolean bl = spredn2.cfr_renamed_4567();
        int n = sprxgf2.cfr_renamed_11213(bl);
        if (bl) {
            int n2 = n;
            n = n2 + sproen.cfr_renamed_11275(n2);
        }
        return n += arg0 ? sproen.cfr_renamed_11276(this.cfr_renamed_0) : 0;
    }

    @Override
    public boolean cfr_renamed_11277() {
        return this.cfr_renamed_4567() || this.cfr_renamed_4.cfr_renamed_119().cfr_renamed_4612().cfr_renamed_11277();
    }

    @Override
    public sprszm cfr_renamed_11278(sprxgf arg0) {
        return new sprfdn(arg0);
    }

    public spredn(boolean arg0, int arg1, int arg2, sprco arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    @Override
    public sprnvm cfr_renamed_11279(int arg0, int arg1) {
        return new spredn(this.cfr_renamed_112, arg0, arg1, this.cfr_renamed_4);
    }

    public spredn(int arg0, int arg1, int arg2, sprco arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public spredn(int arg0, sprco arg1) {
        super(true, arg0, arg1);
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        spredn spredn2 = this;
        sprxgf sprxgf2 = spredn2.cfr_renamed_4.cfr_renamed_119().cfr_renamed_4612();
        boolean bl = spredn2.cfr_renamed_4567();
        if (arg1) {
            int n = this.cfr_renamed_119;
            if (bl || sprxgf2.cfr_renamed_11277()) {
                n |= 0x20;
            }
            arg0.cfr_renamed_11280(true, n, this.cfr_renamed_0);
        }
        if (bl) {
            arg0.cfr_renamed_11281(sprxgf2.cfr_renamed_11213(true));
        }
        sprxgf2.cfr_renamed_11218(arg0.cfr_renamed_4785(), bl);
    }

    public spredn(int arg0, int arg1, sprco arg2) {
        super(true, arg0, arg1, arg2);
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    public spredn(boolean arg0, int arg1, sprco arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public String cfr_renamed_11282() {
        return "DL";
    }
}

