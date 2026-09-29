/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprqxz;
import java.math.BigInteger;

public class sprpek {
    private final BigInteger[] cfr_renamed_91;
    private final int cfr_renamed_0;
    private static final int cfr_renamed_1 = 10;
    private final int cfr_renamed_2;
    private final BigInteger cfr_renamed_3;
    private static final double cfr_renamed_4 = Math.log(9.223372036854776E18);

    private /* synthetic */ long cfr_renamed_9866(int arg0, int arg1, short[] arg2) {
        int n;
        long l = 0L;
        int n2 = n = arg0;
        while (n2 < arg1) {
            int n3 = arg2[n] & 0xFFFF;
            l = l * (long)this.cfr_renamed_2 + (long)n3;
            n2 = ++n;
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    public sprpek(int n, int n2) {
        void arg0;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_0 = (int)Math.floor(cfr_renamed_4 / Math.log((double)arg0));
        this.cfr_renamed_3 = BigInteger.valueOf(this.cfr_renamed_2).pow(this.cfr_renamed_0);
        this.cfr_renamed_91 = this.cfr_renamed_9867(n2, this.cfr_renamed_3);
    }

    public BigInteger cfr_renamed_9868(short[] arg0) {
        int n;
        BigInteger bigInteger = sprhdf.cfr_renamed_2;
        BigInteger bigInteger2 = null;
        int n2 = 0;
        int n3 = arg0.length;
        int n4 = n = n3 - this.cfr_renamed_0;
        while (n4 > -this.cfr_renamed_0) {
            int n5 = this.cfr_renamed_0;
            if (n < 0) {
                n5 = this.cfr_renamed_0 + n;
                n = 0;
            }
            int n6 = Math.min(n + n5, n3);
            BigInteger bigInteger3 = BigInteger.valueOf(this.cfr_renamed_9866(n, n6, arg0));
            if (n2 == 0) {
                bigInteger2 = bigInteger3;
            } else {
                bigInteger = n2 <= this.cfr_renamed_91.length ? this.cfr_renamed_91[n2 - 1] : bigInteger.multiply(this.cfr_renamed_3);
                bigInteger2 = bigInteger2.add(bigInteger3.multiply(bigInteger));
            }
            ++n2;
            n4 = n - this.cfr_renamed_0;
        }
        return bigInteger2;
    }

    public int cfr_renamed_9869() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_9210() {
        return this.cfr_renamed_2;
    }

    public sprpek(int arg0) {
        this(arg0, 10);
    }

    public void cfr_renamed_9870(BigInteger arg0, int arg1, short[] arg2) {
        int n;
        if (arg0.signum() < 0) {
            throw new IllegalArgumentException();
        }
        int n2 = arg1 - 1;
        do {
            if (arg0.equals(BigInteger.ZERO)) {
                arg2[n2--] = 0;
                n = n2;
                continue;
            }
            BigInteger[] bigIntegerArray = arg0.divideAndRemainder(this.cfr_renamed_3);
            arg0 = bigIntegerArray[0];
            n = this.cfr_renamed_9871(bigIntegerArray[1].longValue(), n2, arg2);
        } while (n >= 0);
        if (arg0.signum() != 0) {
            throw new IllegalArgumentException();
        }
    }

    private /* synthetic */ int cfr_renamed_9871(long arg0, int arg1, short[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0 && arg1 >= 0) {
            if (arg0 == 0L) {
                arg2[arg1--] = 0;
            } else {
                arg2[arg1--] = (short)(arg0 % (long)this.cfr_renamed_2);
                arg0 /= (long)this.cfr_renamed_2;
            }
            n2 = ++n;
        }
        if (arg0 != 0L) {
            throw new IllegalStateException(sprqxz.cfr_renamed_9("\f.##/+j;%o) $9/=>o.*)&'.&o$:'-/="));
        }
        return arg1;
    }

    private /* synthetic */ BigInteger[] cfr_renamed_9867(int arg0, BigInteger arg1) {
        int n;
        BigInteger[] bigIntegerArray = new BigInteger[arg0];
        BigInteger bigInteger = arg1;
        int n2 = n = 0;
        while (n2 < arg0) {
            bigIntegerArray[n++] = bigInteger;
            bigInteger = bigInteger.multiply(arg1);
            n2 = n;
        }
        return bigIntegerArray;
    }
}

