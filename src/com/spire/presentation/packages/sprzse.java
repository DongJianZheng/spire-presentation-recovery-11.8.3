/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprwf;
import java.io.IOException;
import java.io.InputStream;

public class sprzse
extends InputStream {
    private InputStream cfr_renamed_2;
    private final sprkwe cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_2 == null) {
            if (!this.cfr_renamed_4) {
                return -1;
            }
            sprwf sprwf2 = (sprwf)this.cfr_renamed_3.cfr_renamed_24();
            if (sprwf2 == null) {
                return -1;
            }
            this.cfr_renamed_4 = false;
            this.cfr_renamed_2 = sprwf2.cfr_renamed_698();
        }
        int n = 0;
        while (true) {
            int n2;
            if ((n2 = this.cfr_renamed_2.read(arg0, arg1 + n, arg2 - n)) >= 0) {
                if ((n += n2) != arg2) continue;
                return n;
            }
            sprwf sprwf3 = (sprwf)this.cfr_renamed_3.cfr_renamed_24();
            if (sprwf3 == null) {
                this.cfr_renamed_2 = null;
                if (n < 1) {
                    return -1;
                }
                return n;
            }
            this.cfr_renamed_2 = sprwf3.cfr_renamed_698();
        }
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_2 == null) {
            if (!this.cfr_renamed_4) {
                return -1;
            }
            sprwf sprwf2 = (sprwf)this.cfr_renamed_3.cfr_renamed_24();
            if (sprwf2 == null) {
                return -1;
            }
            this.cfr_renamed_4 = false;
            this.cfr_renamed_2 = sprwf2.cfr_renamed_698();
        }
        sprzse sprzse2 = this;
        int n;
        while ((n = sprzse2.cfr_renamed_2.read()) < 0) {
            sprwf sprwf3 = (sprwf)this.cfr_renamed_3.cfr_renamed_24();
            if (sprwf3 == null) {
                this.cfr_renamed_2 = null;
                return -1;
            }
            sprzse2 = this;
            this.cfr_renamed_2 = sprwf3.cfr_renamed_698();
        }
        return n;
    }

    public sprzse(sprkwe sprkwe2) {
        sprzse sprzse2 = this;
        sprzse2.cfr_renamed_4 = true;
        sprzse2.cfr_renamed_3 = sprkwe2;
    }
}

