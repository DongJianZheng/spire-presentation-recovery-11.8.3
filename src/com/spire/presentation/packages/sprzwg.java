/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqy;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqzz;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprzwg
extends sprqqe {
    private static final BigInteger cfr_renamed_1 = new BigInteger(sprqzz.cfr_renamed_9("BhX`V`V`V`V"));
    private static final BigInteger cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    private static /* synthetic */ BigInteger cfr_renamed_8283(BigInteger arg0) {
        return arg0;
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprzwg(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    /*
     * WARNING - void declaration
     */
    public sprzwg(BigInteger bigInteger) {
        void arg0;
        if (!bigInteger.equals(cfr_renamed_2)) {
            if (arg0.compareTo(cfr_renamed_1) < 0) {
                throw new IllegalStateException(sprqzz.cfr_renamed_9("\u00007\ny\n0\b1\u001b O=\n>\u001d<\ny\u00067\u001by\f8\u00017\u0000-O;\ny\u0003<\u001c*O-\u00078\u0001yBhX`V`V`V`V"));
            }
            if (arg0.compareTo(cfr_renamed_3) > 0) {
                throw new IllegalStateException(sprbqy.cfr_renamed_9(")=#s#:!;2*f7#446#s/=2s%2(=)'f1#s!!#2264s2;'=fb~cvcvcvcv"));
            }
        }
        this.cfr_renamed_4 = arg0;
    }

    public static sprzwg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzwg) {
            return (sprzwg)arg0;
        }
        if (arg0 != null) {
            return new sprzwg(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_4);
    }

    static {
        cfr_renamed_3 = new BigInteger(sprbqy.cfr_renamed_9("b~cvcvcvcv"));
        cfr_renamed_2 = new BigInteger(sprqzz.cfr_renamed_9("hWi_i_i_i^"));
    }

    public sprzwg(long arg0) {
        this(BigInteger.valueOf(arg0));
    }
}

