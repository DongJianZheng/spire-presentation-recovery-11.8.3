/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboy;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprquq;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprmkh
extends sprqqe {
    private final BigInteger cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(255L);

    private /* synthetic */ sprmkh(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    public BigInteger cfr_renamed_8304() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmkh(BigInteger bigInteger) {
        void arg0;
        if (bigInteger.signum() < 0 && arg0.compareTo(cfr_renamed_4) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprquq.cfr_renamed_9("xsuhiuyiosi<rx;")).append(arg0).append(sprboy.cfr_renamed_9("n8=q!$:q!7n#/?)4na`\u007f|d{")).toString());
        }
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_3);
    }

    public sprmkh(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    public static sprmkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmkh) {
            return (sprmkh)arg0;
        }
        if (arg0 != null) {
            return new sprmkh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

