/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprnbb;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprzya
extends sprhgb {
    private sprnbb cfr_renamed_3;
    public sprama cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzya(InputStream inputStream, sprnbb sprnbb2) throws IOException {
        void arg1;
        void arg0;
        sprzya sprzya2 = this;
        super(false);
        sprzya2.cfr_renamed_4 = sprama.cfr_renamed_777((InputStream)arg0, arg1.cfr_renamed_112, arg1.cfr_renamed_107);
        sprzya2.cfr_renamed_3 = sprnbb2;
    }

    /*
     * WARNING - void declaration
     */
    public sprzya(sprama sprama2, sprnbb sprnbb2) {
        void arg0;
        sprzya sprzya2 = this;
        super(false);
        sprzya2.cfr_renamed_4 = arg0;
        sprzya2.cfr_renamed_3 = sprnbb2;
    }

    public byte[] cfr_renamed_91() {
        sprzya sprzya2 = this;
        return sprzya2.cfr_renamed_4.cfr_renamed_783(sprzya2.cfr_renamed_3.cfr_renamed_107);
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
        sprzya sprzya2 = (sprzya)arg0;
        if (this.cfr_renamed_4 == null ? sprzya2.cfr_renamed_4 != null : !this.cfr_renamed_4.equals(sprzya2.cfr_renamed_4)) {
            return false;
        }
        return !(this.cfr_renamed_3 == null ? sprzya2.cfr_renamed_3 != null : !this.cfr_renamed_3.equals(sprzya2.cfr_renamed_3));
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }

    /*
     * WARNING - void declaration
     */
    public sprzya(byte[] byArray, sprnbb sprnbb2) {
        void arg1;
        void arg0;
        sprzya sprzya2 = this;
        super(false);
        sprzya2.cfr_renamed_4 = sprama.cfr_renamed_768((byte[])arg0, arg1.cfr_renamed_112, arg1.cfr_renamed_107);
        sprzya2.cfr_renamed_3 = sprnbb2;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : this.cfr_renamed_4.hashCode());
        n = 31 * n + (this.cfr_renamed_3 == null ? 0 : this.cfr_renamed_3.hashCode());
        return n;
    }
}

