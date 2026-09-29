/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprtny;
import java.io.IOException;

public abstract class sprvva
extends sprkra {
    public abstract void cfr_renamed_4613(sprope var1) throws IOException;

    public sprvva cfr_renamed_4615() {
        return this;
    }

    public abstract boolean cfr_renamed_4575();

    public abstract int cfr_renamed_4616() throws IOException;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprvva cfr_renamed_184(byte[] arg0) throws IOException {
        sprgle sprgle2 = new sprgle(arg0);
        try {
            return sprgle2.cfr_renamed_24();
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprtny.cfr_renamed_9("udxkyq6wsfybxle`6jtosfb%\u007fk6vbwsd{"));
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this;
    }

    public sprvva cfr_renamed_4612() {
        return this;
    }

    public abstract boolean cfr_renamed_4788(sprvva var1);

    @Override
    public final boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        return arg0 instanceof spra && this.cfr_renamed_4788(((spra)arg0).cfr_renamed_119());
    }

    @Override
    public abstract int hashCode();
}

