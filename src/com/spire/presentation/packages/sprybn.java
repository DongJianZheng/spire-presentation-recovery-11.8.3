/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbeea;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprvro;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprybn
extends sprqqe {
    private final long cfr_renamed_3;
    public static final long cfr_renamed_4 = 0xFFFFFFFFL;

    private /* synthetic */ sprybn(sprktm arg0) {
        this(sprybn.cfr_renamed_11426(arg0.cfr_renamed_97()));
    }

    /*
     * WARNING - void declaration
     */
    public sprybn(long l) {
        void arg0;
        if (l < 0L || arg0 > 0xFFFFFFFFL) {
            throw new IllegalArgumentException(sprbeea.cfr_renamed_9("K\u001d\u0002\u0016W\r\u0002\u0016DYP\u0018L\u001eG"));
        }
        this.cfr_renamed_3 = arg0;
    }

    private static /* synthetic */ long cfr_renamed_11426(BigInteger arg0) {
        if (arg0.bitLength() > 32) {
            throw new IllegalArgumentException(sprvro.cfr_renamed_9("$&m-86m-+b?##%("));
        }
        return arg0.longValue();
    }

    public static sprybn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprybn) {
            return (sprybn)arg0;
        }
        if (arg0 != null) {
            return new sprybn(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public long cfr_renamed_6005() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_3);
    }
}

