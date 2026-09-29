/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprheb;
import com.spire.presentation.packages.sprpxa;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprobb
extends sprpxa {
    public sprama cfr_renamed_4;

    public byte[] cfr_renamed_91() {
        sprobb sprobb2 = this;
        return sprobb2.cfr_renamed_4.cfr_renamed_783(((sprheb)((Object)sprobb2.cfr_renamed_4)).cfr_renamed_272);
    }

    /*
     * WARNING - void declaration
     */
    public sprobb(byte[] byArray, sprheb sprheb2) {
        super(false, (sprheb)arg1);
        void arg1;
        this.cfr_renamed_4 = sprama.cfr_renamed_768(byArray, arg1.cfr_renamed_119, arg1.cfr_renamed_272);
    }

    /*
     * WARNING - void declaration
     */
    public sprobb(InputStream inputStream, sprheb sprheb2) throws IOException {
        super(false, (sprheb)arg1);
        void arg1;
        this.cfr_renamed_4 = sprama.cfr_renamed_777(inputStream, arg1.cfr_renamed_119, arg1.cfr_renamed_272);
    }

    /*
     * WARNING - void declaration
     */
    public sprobb(sprama sprama2, sprheb sprheb2) {
        super(false, (sprheb)arg1);
        void arg1;
        this.cfr_renamed_4 = sprama2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sprobb)) {
            return false;
        }
        sprobb sprobb2 = (sprobb)arg0;
        if (this.cfr_renamed_4 == null ? sprobb2.cfr_renamed_4 != null : !this.cfr_renamed_4.equals(sprobb2.cfr_renamed_4)) {
            return false;
        }
        return !(this.cfr_renamed_4 == null ? sprobb2.cfr_renamed_4 != null : !((sprheb)((Object)this.cfr_renamed_4)).equals(sprobb2.cfr_renamed_4));
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : this.cfr_renamed_4.hashCode());
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : ((sprheb)((Object)this.cfr_renamed_4)).hashCode());
        return n;
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }
}

