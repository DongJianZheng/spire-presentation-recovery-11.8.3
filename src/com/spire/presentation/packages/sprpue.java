/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprate;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprpue
extends sprate {
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4911(int arg0) throws IOException {
        sprpue sprpue2 = this;
        sprpue2.cfr_renamed_4.write(arg0);
        sprpue2.cfr_renamed_4.write(128);
    }

    public void cfr_renamed_4912(InputStream arg0) throws IOException {
        int n;
        InputStream inputStream = arg0;
        while ((n = inputStream.read()) >= 0) {
            inputStream = arg0;
            this.cfr_renamed_4.write(n);
        }
    }

    @Override
    public OutputStream cfr_renamed_4134() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprpue(OutputStream outputStream) {
        super((OutputStream)arg0);
        void arg0;
        this.cfr_renamed_4 = false;
    }

    public void cfr_renamed_4905(int arg0) throws IOException {
        if (this.cfr_renamed_4) {
            sprpue sprpue2 = this;
            int n = sprpue2.cfr_renamed_2 | 0x80;
            if (sprpue2.cfr_renamed_3) {
                sprpue sprpue3 = this;
                sprpue3.cfr_renamed_4911(n | 0x20);
                sprpue3.cfr_renamed_4911(arg0);
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

    public void cfr_renamed_4906() throws IOException {
        sprpue sprpue2 = this;
        sprpue2.cfr_renamed_4.write(0);
        sprpue2.cfr_renamed_4.write(0);
        if (sprpue2.cfr_renamed_4 && this.cfr_renamed_3) {
            sprpue sprpue3 = this;
            sprpue3.cfr_renamed_4.write(0);
            sprpue3.cfr_renamed_4.write(0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprpue(OutputStream outputStream, int n, boolean bl) {
        void arg2;
        void arg0;
        sprpue sprpue2 = this;
        sprpue sprpue3 = this;
        super((OutputStream)arg0);
        sprpue3.cfr_renamed_4 = false;
        sprpue3.cfr_renamed_4 = true;
        sprpue2.cfr_renamed_3 = arg2;
        sprpue2.cfr_renamed_2 = n;
    }
}

