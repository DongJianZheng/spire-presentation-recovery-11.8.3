/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprgqe;
import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.sprlhk;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprzre
extends sprgqe {
    private int cfr_renamed_2;
    private static final byte[] cfr_renamed_3 = new byte[0];
    private final int cfr_renamed_4;

    @Override
    public int cfr_renamed_4583() {
        return this.cfr_renamed_2;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_2 == 0) {
            return -1;
        }
        int n = Math.min(arg2, this.cfr_renamed_2);
        int n2 = this.cfr_renamed_4.read(arg0, arg1, n);
        if (n2 < 0) {
            throw new EOFException(new StringBuilder().insert(0, sprlhk.cfr_renamed_9("IeK\u0000aEcGyH-")).append(this.cfr_renamed_4).append(sprhna.cfr_renamed_9("X|\u001ay\u001dp\f3\fa\r}\u001br\fv\u001c3\u001ajX")).append(this.cfr_renamed_2).toString());
        }
        if ((this.cfr_renamed_2 -= n2) == 0) {
            this.cfr_renamed_4609(true);
        }
        return n2;
    }

    public byte[] cfr_renamed_954() throws IOException {
        if (this.cfr_renamed_2 == 0) {
            return cfr_renamed_3;
        }
        sprzre sprzre2 = this;
        byte[] byArray = new byte[sprzre2.cfr_renamed_2];
        if ((sprzre2.cfr_renamed_2 -= sprbsa.cfr_renamed_476((InputStream)this.cfr_renamed_4, byArray)) != 0) {
            throw new EOFException(new StringBuilder().insert(0, sprlhk.cfr_renamed_9("IeK\u0000aEcGyH-")).append(this.cfr_renamed_4).append(sprhna.cfr_renamed_9("X|\u001ay\u001dp\f3\fa\r}\u001br\fv\u001c3\u001ajX")).append(this.cfr_renamed_2).toString());
        }
        this.cfr_renamed_4609(true);
        return byArray;
    }

    public sprzre(InputStream arg0, int arg1) {
        int n = arg1;
        super(arg0, n);
        if (n < 0) {
            throw new IllegalArgumentException(sprlhk.cfr_renamed_9("NhGlTdVh\u0000aEcGyH~\u0000cOy\u0000lLaOzEi"));
        }
        sprzre sprzre2 = this;
        sprzre2.cfr_renamed_2 = sprzre2.cfr_renamed_4 = arg1;
        if (arg1 == 0) {
            this.cfr_renamed_4609(true);
        }
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_2 == 0) {
            return -1;
        }
        int n = this.cfr_renamed_4.read();
        if (n < 0) {
            throw new EOFException(new StringBuilder().insert(0, sprhna.cfr_renamed_9("<V>3\u0014v\u0016t\f{X")).append(this.cfr_renamed_4).append(sprlhk.cfr_renamed_9("-OoJhCy\u0000yRxNnAyEi\u0000oY-")).append(this.cfr_renamed_2).toString());
        }
        if (--this.cfr_renamed_2 == 0) {
            this.cfr_renamed_4609(true);
        }
        return n;
    }
}

