/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.spruhm;
import java.io.IOException;
import java.io.InputStream;

public class spraxm
extends InputStream {
    private InputStream cfr_renamed_2;
    private final sprden cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_2 == null) {
            if (!this.cfr_renamed_4) {
                return -1;
            }
            sprme sprme2 = this.cfr_renamed_11323();
            if (sprme2 == null) {
                return -1;
            }
            this.cfr_renamed_4 = false;
            this.cfr_renamed_2 = sprme2.cfr_renamed_698();
        }
        int n = 0;
        while (true) {
            int n2;
            if ((n2 = this.cfr_renamed_2.read(arg0, arg1 + n, arg2 - n)) >= 0) {
                if ((n += n2) != arg2) continue;
                return n;
            }
            sprme sprme3 = this.cfr_renamed_11323();
            if (sprme3 == null) {
                this.cfr_renamed_2 = null;
                if (n < 1) {
                    return -1;
                }
                return n;
            }
            this.cfr_renamed_2 = sprme3.cfr_renamed_698();
        }
    }

    public spraxm(sprden sprden2) {
        spraxm spraxm2 = this;
        spraxm2.cfr_renamed_4 = true;
        spraxm2.cfr_renamed_3 = sprden2;
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_2 == null) {
            if (!this.cfr_renamed_4) {
                return -1;
            }
            sprme sprme2 = this.cfr_renamed_11323();
            if (sprme2 == null) {
                return -1;
            }
            this.cfr_renamed_4 = false;
            this.cfr_renamed_2 = sprme2.cfr_renamed_698();
        }
        spraxm spraxm2 = this;
        int n;
        while ((n = spraxm2.cfr_renamed_2.read()) < 0) {
            sprme sprme3 = this.cfr_renamed_11323();
            if (sprme3 == null) {
                this.cfr_renamed_2 = null;
                return -1;
            }
            spraxm2 = this;
            this.cfr_renamed_2 = sprme3.cfr_renamed_698();
        }
        return n;
    }

    private /* synthetic */ sprme cfr_renamed_11323() throws IOException {
        sprco sprco2 = this.cfr_renamed_3.cfr_renamed_24();
        if (sprco2 == null) {
            return null;
        }
        if (sprco2 instanceof sprme) {
            return (sprme)sprco2;
        }
        throw new IOException(new StringBuilder().insert(0, spruhm.cfr_renamed_9("4N*N.W/\u0000.B+E\"TaE/C.U/T$R$D{\u0000")).append(sprco2.getClass()).toString());
    }
}

