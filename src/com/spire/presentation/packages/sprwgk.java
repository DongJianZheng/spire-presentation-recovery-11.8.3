/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprskea;
import com.spire.presentation.packages.spryye;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class sprwgk
extends spryye {
    public static final int cfr_renamed_3 = 32;
    private final byte[] cfr_renamed_4 = new byte[32];

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprqve.cfr_renamed_9("\u00055W1\u0005wO\"Q#\u0002?C!GwN2L0V?\u0002d\u0010"));
        }
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprwgk(InputStream inputStream) throws IOException {
        super(false);
        void arg0;
        if (32 != sprkqe.cfr_renamed_476((InputStream)arg0, this.cfr_renamed_4)) {
            throw new EOFException(sprskea.cfr_renamed_9("aTb;AuGtQuP~V~@;Mu\u0004vM\u007f@wA;K}\u0004C\u0016.\u0011*\u001d;TnFwMx\u0004pAb"));
        }
    }

    public sprwgk(byte[] byArray, int n) {
        super(false);
        System.arraycopy(byArray, n, this.cfr_renamed_4, 0, 32);
    }

    public sprwgk(byte[] arg0) {
        this(sprwgk.cfr_renamed_9971(arg0), 0);
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        System.arraycopy(this.cfr_renamed_4, 0, arg0, arg1, 32);
    }
}

