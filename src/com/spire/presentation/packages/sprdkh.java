/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjqc;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlyy;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprdkh
extends sprqqe {
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(255L);
    private final BigInteger cfr_renamed_2;
    public static final sprdkh cfr_renamed_3;
    public static final sprdkh cfr_renamed_4;

    public static sprdkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdkh) {
            return (sprdkh)arg0;
        }
        if (arg0 != null) {
            return new sprdkh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprdkh(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    static {
        cfr_renamed_4 = new sprdkh(1L);
        cfr_renamed_3 = new sprdkh(2L);
    }

    public sprdkh(BigInteger bigInteger) {
        this.cfr_renamed_2 = sprdkh.cfr_renamed_8283(bigInteger);
    }

    private static /* synthetic */ BigInteger cfr_renamed_8283(BigInteger arg0) {
        if (arg0.signum() < 0) {
            throw new IllegalArgumentException(sprjqc.cfr_renamed_9("Q\fK\u0018BMK\bT\u001e\u0007\u0019O\fIM\u0017"));
        }
        if (arg0.compareTo(cfr_renamed_1) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprlyy.cfr_renamed_9("?h%|,),q*l,m:)")).append(cfr_renamed_1).toString());
        }
        return arg0;
    }

    public BigInteger cfr_renamed_8284() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdkh(byte[] byArray) {
        this(new BigInteger((byte[])arg0));
        void arg0;
    }

    private /* synthetic */ sprdkh(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }
}

