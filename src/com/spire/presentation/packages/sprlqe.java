/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;

public class sprlqe
extends sprxue {
    public sprlqe(byte[] arg0) {
        super(arg0);
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public sprlqe(spra arg0) throws IOException {
        super(arg0.cfr_renamed_119().cfr_renamed_104("DER"));
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(4, this.cfr_renamed_4);
    }

    public static void cfr_renamed_4792(sprpve arg0, byte[] arg1) throws IOException {
        arg0.cfr_renamed_4614(4, arg1);
    }
}

