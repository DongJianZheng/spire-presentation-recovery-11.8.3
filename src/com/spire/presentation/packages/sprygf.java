/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprjgf;
import com.spire.presentation.packages.sprugf;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprygf
extends sprjgf {
    public sprhgf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprygf(InputStream inputStream, sprugf sprugf2) throws IOException {
        super(false, (sprugf)arg1);
        void arg1;
        this.cfr_renamed_4 = sprhgf.cfr_renamed_777(inputStream, arg1.cfr_renamed_119, arg1.cfr_renamed_93);
    }

    /*
     * WARNING - void declaration
     */
    public sprygf(sprhgf sprhgf2, sprugf sprugf2) {
        super(false, (sprugf)arg1);
        void arg1;
        this.cfr_renamed_4 = sprhgf2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sprygf)) {
            return false;
        }
        sprygf sprygf2 = (sprygf)arg0;
        if (this.cfr_renamed_4 == null ? sprygf2.cfr_renamed_4 != null : !this.cfr_renamed_4.equals(sprygf2.cfr_renamed_4)) {
            return false;
        }
        return !(this.cfr_renamed_4 == null ? sprygf2.cfr_renamed_4 != null : !((sprugf)((Object)this.cfr_renamed_4)).equals(sprygf2.cfr_renamed_4));
    }

    public byte[] cfr_renamed_91() {
        sprygf sprygf2 = this;
        return sprygf2.cfr_renamed_4.cfr_renamed_783(((sprugf)((Object)sprygf2.cfr_renamed_4)).cfr_renamed_93);
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : this.cfr_renamed_4.hashCode());
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : ((sprugf)((Object)this.cfr_renamed_4)).hashCode());
        return n;
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }

    /*
     * WARNING - void declaration
     */
    public sprygf(byte[] byArray, sprugf sprugf2) {
        super(false, (sprugf)arg1);
        void arg1;
        this.cfr_renamed_4 = sprhgf.cfr_renamed_768(byArray, arg1.cfr_renamed_119, arg1.cfr_renamed_93);
    }
}

