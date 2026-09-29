/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgad;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.spruxc;
import com.spire.presentation.packages.sprvfk;
import java.io.OutputStream;

public class sprhwc {
    private final sprpa cfr_renamed_4;

    public sprhwc(sprpa sprpa2) {
        this.cfr_renamed_4 = sprpa2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgad cfr_renamed_2588(byte[] arg0) throws spruxc {
        try {
            OutputStream outputStream = this.cfr_renamed_4.cfr_renamed_470();
            outputStream.write(arg0);
            outputStream.close();
            return new sprgad(new sprnje(this.cfr_renamed_4.cfr_renamed_615(), this.cfr_renamed_4.cfr_renamed_580()));
        }
        catch (Exception exception) {
            throw new spruxc(new StringBuilder().insert(0, sprvfk.cfr_renamed_9("SpG|J{\u0006jI>DkOrB>k{UmGyCWKnTwHj\u001c>")).append(exception.getMessage()).toString(), exception);
        }
    }
}

