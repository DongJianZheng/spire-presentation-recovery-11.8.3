/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spremo;
import com.spire.presentation.packages.sprlc;
import java.io.ByteArrayOutputStream;

public class sprmnd
implements sprlc {
    private ByteArrayOutputStream cfr_renamed_4;

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        byte[] byArray = this.cfr_renamed_4.toByteArray();
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        this.cfr_renamed_41();
        return byArray.length;
    }

    public sprmnd() {
        sprmnd sprmnd2 = this;
        sprmnd2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.reset();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.write(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_4.size();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.write(arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return spremo.cfr_renamed_9("\bb\n{");
    }
}

