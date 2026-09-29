/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjaa;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprwfq;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprhfh
extends sprqqe {
    private final BigInteger cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(255L);

    public static sprhfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhfh) {
            return (sprhfh)arg0;
        }
        if (arg0 != null) {
            return new sprhfh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprhfh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger.signum() < 0 || arg0.compareTo(cfr_renamed_4) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcjaa.cfr_renamed_9("\u0014B\u000eV\u0007\u0003")).append(arg0).append(sprwfq.cfr_renamed_9("\u000f8Z#\\>K2\u000f8Iw]6A0Jw\u001fy\u0001y\u001db\u001a")).toString());
        }
        this.cfr_renamed_3 = arg0;
    }

    private /* synthetic */ sprhfh(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    public BigInteger cfr_renamed_8425() {
        return this.cfr_renamed_3;
    }

    public sprhfh(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprhfh(byte[] byArray) {
        this(new BigInteger((byte[])arg0));
        void arg0;
    }
}

