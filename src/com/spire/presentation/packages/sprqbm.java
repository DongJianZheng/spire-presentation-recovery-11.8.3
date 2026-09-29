/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.io.IOException;
import java.io.OutputStream;

public class sprqbm {
    public byte[] cfr_renamed_2;
    public int cfr_renamed_3;
    private boolean cfr_renamed_4;

    public byte[] cfr_renamed_2609() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        sprqbm sprqbm2 = this;
        return sprqbm2.cfr_renamed_3 ^ sproze.cfr_renamed_95(sprqbm2.cfr_renamed_2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprqbm)) {
            return false;
        }
        sprqbm sprqbm2 = (sprqbm)arg0;
        return this.cfr_renamed_3 == sprqbm2.cfr_renamed_3 && sproze.cfr_renamed_92(this.cfr_renamed_2, sprqbm2.cfr_renamed_2);
    }

    public sprqbm(int arg0, byte[] arg1) {
        this(arg0, false, arg1);
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        OutputStream outputStream;
        int n = this.cfr_renamed_2.length + 1;
        if (n < 192 && !this.cfr_renamed_4) {
            OutputStream outputStream2 = arg0;
            outputStream = outputStream2;
            outputStream2.write((byte)n);
        } else if (n <= 8383 && !this.cfr_renamed_4) {
            OutputStream outputStream3 = arg0;
            outputStream = outputStream3;
            outputStream3.write((byte)(((n -= 192) >> 8 & 0xFF) + 192));
            outputStream3.write((byte)n);
        } else {
            outputStream = arg0;
            OutputStream outputStream4 = arg0;
            int n2 = n;
            OutputStream outputStream5 = arg0;
            outputStream5.write(255);
            outputStream5.write((byte)(n >> 24));
            arg0.write((byte)(n2 >> 16));
            outputStream4.write((byte)(n2 >> 8));
            outputStream4.write((byte)n);
        }
        outputStream.write(this.cfr_renamed_3);
        arg0.write(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqbm(int n, boolean bl, byte[] byArray) {
        void arg1;
        void arg0;
        sprqbm sprqbm2 = this;
        this.cfr_renamed_3 = arg0;
        sprqbm2.cfr_renamed_4 = arg1;
        sprqbm2.cfr_renamed_2 = byArray;
    }
}

