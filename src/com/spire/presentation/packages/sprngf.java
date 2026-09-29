/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprywe;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprngf
extends spryye {
    private sprywe cfr_renamed_3;
    public sprhgf cfr_renamed_4;

    public byte[] cfr_renamed_91() {
        sprngf sprngf2 = this;
        return sprngf2.cfr_renamed_4.cfr_renamed_783(sprngf2.cfr_renamed_3.cfr_renamed_119);
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }

    /*
     * WARNING - void declaration
     */
    public sprngf(sprhgf sprhgf2, sprywe sprywe2) {
        void arg0;
        sprngf sprngf2 = this;
        super(false);
        sprngf2.cfr_renamed_4 = arg0;
        sprngf2.cfr_renamed_3 = sprywe2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (this.getClass() != arg0.getClass()) {
            return false;
        }
        sprngf sprngf2 = (sprngf)arg0;
        if (this.cfr_renamed_4 == null ? sprngf2.cfr_renamed_4 != null : !this.cfr_renamed_4.equals(sprngf2.cfr_renamed_4)) {
            return false;
        }
        return !(this.cfr_renamed_3 == null ? sprngf2.cfr_renamed_3 != null : !this.cfr_renamed_3.equals(sprngf2.cfr_renamed_3));
    }

    /*
     * WARNING - void declaration
     */
    public sprngf(byte[] byArray, sprywe sprywe2) {
        void arg1;
        void arg0;
        sprngf sprngf2 = this;
        super(false);
        sprngf2.cfr_renamed_4 = sprhgf.cfr_renamed_768((byte[])arg0, arg1.cfr_renamed_93, arg1.cfr_renamed_119);
        sprngf2.cfr_renamed_3 = sprywe2;
    }

    /*
     * WARNING - void declaration
     */
    public sprngf(InputStream inputStream, sprywe sprywe2) throws IOException {
        void arg1;
        void arg0;
        sprngf sprngf2 = this;
        super(false);
        sprngf2.cfr_renamed_4 = sprhgf.cfr_renamed_777((InputStream)arg0, arg1.cfr_renamed_93, arg1.cfr_renamed_119);
        sprngf2.cfr_renamed_3 = sprywe2;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : this.cfr_renamed_4.hashCode());
        n = 31 * n + (this.cfr_renamed_3 == null ? 0 : this.cfr_renamed_3.hashCode());
        return n;
    }
}

