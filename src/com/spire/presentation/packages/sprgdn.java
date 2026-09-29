/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbn;
import java.io.IOException;
import java.io.OutputStream;

public abstract class sprgdn
extends sprcbn {
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_4906() throws IOException {
        sprgdn sprgdn2 = this;
        sprgdn2.cfr_renamed_4.write(0);
        sprgdn2.cfr_renamed_4.write(0);
        if (sprgdn2.cfr_renamed_4 && this.cfr_renamed_3) {
            sprgdn sprgdn3 = this;
            sprgdn3.cfr_renamed_4.write(0);
            sprgdn3.cfr_renamed_4.write(0);
        }
    }

    private /* synthetic */ void cfr_renamed_4911(int arg0) throws IOException {
        sprgdn sprgdn2 = this;
        sprgdn2.cfr_renamed_4.write(arg0);
        sprgdn2.cfr_renamed_4.write(128);
    }

    public void cfr_renamed_4905(int arg0) throws IOException {
        if (this.cfr_renamed_4) {
            sprgdn sprgdn2 = this;
            int n = sprgdn2.cfr_renamed_2 | 0x80;
            if (sprgdn2.cfr_renamed_3) {
                sprgdn sprgdn3 = this;
                sprgdn3.cfr_renamed_4911(n | 0x20);
                sprgdn3.cfr_renamed_4911(arg0);
                return;
            }
            if ((arg0 & 0x20) != 0) {
                this.cfr_renamed_4911(n | 0x20);
                return;
            }
            this.cfr_renamed_4911(n);
            return;
        }
        this.cfr_renamed_4911(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprgdn(OutputStream outputStream, int n, boolean bl) {
        void arg2;
        void arg0;
        sprgdn sprgdn2 = this;
        sprgdn sprgdn3 = this;
        super((OutputStream)arg0);
        sprgdn3.cfr_renamed_4 = false;
        sprgdn3.cfr_renamed_4 = true;
        sprgdn2.cfr_renamed_3 = arg2;
        sprgdn2.cfr_renamed_2 = n;
    }

    @Override
    public OutputStream cfr_renamed_4134() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprgdn(OutputStream outputStream) {
        super((OutputStream)arg0);
        void arg0;
        this.cfr_renamed_4 = false;
    }
}

