/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprmbka;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprycb;
import java.io.IOException;
import java.io.OutputStream;

public abstract class sprxgf
extends sprqqe {
    public abstract void cfr_renamed_11218(sproen var1, boolean var2) throws IOException;

    @Override
    public final boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        return arg0 instanceof sprco && this.cfr_renamed_11432(((sprco)arg0).cfr_renamed_119());
    }

    public abstract int cfr_renamed_11213(boolean var1) throws IOException;

    @Override
    public void cfr_renamed_3257(OutputStream arg0) throws IOException {
        sproen sproen2 = sproen.cfr_renamed_5101(arg0);
        sproen2.cfr_renamed_11286(this, true);
        sproen2.cfr_renamed_11493();
    }

    @Override
    public void cfr_renamed_8489(OutputStream arg0, String arg1) throws IOException {
        sproen sproen2 = sproen.cfr_renamed_11494(arg0, arg1);
        sproen2.cfr_renamed_11286(this, true);
        sproen2.cfr_renamed_11493();
    }

    @Override
    public final sprxgf cfr_renamed_119() {
        return this;
    }

    public sprxgf cfr_renamed_4615() {
        return this;
    }

    public final boolean cfr_renamed_5078(sprxgf arg0) {
        return this == arg0 || this.cfr_renamed_11432(arg0);
    }

    public abstract boolean cfr_renamed_11277();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprxgf cfr_renamed_184(byte[] arg0) throws IOException {
        sprrzm sprrzm2 = new sprrzm(arg0);
        try {
            sprrzm sprrzm3 = sprrzm2;
            sprxgf sprxgf2 = sprrzm3.cfr_renamed_24();
            if (sprrzm3.available() != 0) {
                throw new IOException(sprmbka.cfr_renamed_9("&d\u0017n\u0002<\u0007}\u0017}Cx\u0006h\u0006\u007f\u0017y\u0007<\nrCo\u0017n\u0006}\u000e"));
            }
            return sprxgf2;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprycb.cfr_renamed_9("X\u0004U\u000bT\u0011\u001b\u0017^\u0006T\u0002U\fH\u0000\u001b\nY\u000f^\u0006OER\u000b\u001b\u0016O\u0017^\u0004V"));
        }
    }

    public final boolean cfr_renamed_7476(sprco arg0) {
        return this == arg0 || null != arg0 && this.cfr_renamed_11432(arg0.cfr_renamed_119());
    }

    public abstract boolean cfr_renamed_11432(sprxgf var1);

    public sprxgf cfr_renamed_4612() {
        return this;
    }

    @Override
    public abstract int hashCode();
}

