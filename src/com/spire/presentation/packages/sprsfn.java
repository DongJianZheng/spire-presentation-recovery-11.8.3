/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradn;
import com.spire.presentation.packages.sprgdn;
import java.io.IOException;
import java.io.OutputStream;

public class sprsfn
extends sprgdn {
    /*
     * WARNING - void declaration
     */
    public sprsfn(OutputStream outputStream, int n, boolean bl) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        sprsfn sprsfn2 = this;
        super((OutputStream)arg0, (int)arg1, (boolean)arg2);
        sprsfn2.cfr_renamed_4905(36);
    }

    /*
     * WARNING - void declaration
     */
    public sprsfn(OutputStream outputStream) throws IOException {
        void arg0;
        sprsfn sprsfn2 = this;
        super((OutputStream)arg0);
        sprsfn2.cfr_renamed_4905(36);
    }

    public OutputStream cfr_renamed_4109(byte[] arg0) {
        return new spradn(this, arg0);
    }

    public OutputStream cfr_renamed_4110() {
        return this.cfr_renamed_4109(new byte[1000]);
    }
}

