/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlve;
import com.spire.presentation.packages.sprpue;
import java.io.IOException;
import java.io.OutputStream;

public class sprcoe
extends sprpue {
    /*
     * WARNING - void declaration
     */
    public sprcoe(OutputStream outputStream) throws IOException {
        void arg0;
        sprcoe sprcoe2 = this;
        super((OutputStream)arg0);
        sprcoe2.cfr_renamed_4905(36);
    }

    public OutputStream cfr_renamed_4110() {
        return this.cfr_renamed_4109(new byte[1000]);
    }

    public OutputStream cfr_renamed_4109(byte[] arg0) {
        return new sprlve(this, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprcoe(OutputStream outputStream, int n, boolean bl) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        sprcoe sprcoe2 = this;
        super((OutputStream)arg0, (int)arg1, (boolean)arg2);
        sprcoe2.cfr_renamed_4905(36);
    }
}

