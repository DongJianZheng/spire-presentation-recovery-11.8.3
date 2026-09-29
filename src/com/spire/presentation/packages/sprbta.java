/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprwna;
import java.math.BigDecimal;

public class sprbta {
    private static final BigDecimal cfr_renamed_2 = new BigDecimal("0");
    public BigDecimal[] cfr_renamed_3;
    private static final BigDecimal cfr_renamed_4 = new BigDecimal("0.5");

    /*
     * WARNING - void declaration
     */
    public sprbta(sprwna sprwna2) {
        int n;
        int n2 = sprwna2.cfr_renamed_3.length;
        this.cfr_renamed_3 = new BigDecimal[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            void arg0;
            int n4 = n;
            BigDecimal bigDecimal = new BigDecimal(arg0.cfr_renamed_3[n]);
            this.cfr_renamed_3[n4] = bigDecimal;
            n3 = ++n;
        }
    }

    private /* synthetic */ BigDecimal[] cfr_renamed_796(BigDecimal[] arg0, int arg1, int arg2) {
        int n = arg2 - arg1;
        BigDecimal[] bigDecimalArray = new BigDecimal[arg2 - arg1];
        System.arraycopy(arg0, arg1, bigDecimalArray, 0, arg0.length - arg1 < n ? arg0.length - arg1 : n);
        return bigDecimalArray;
    }

    public Object clone() {
        return new sprbta((BigDecimal[])this.cfr_renamed_3.clone());
    }

    /*
     * WARNING - void declaration
     */
    public sprbta cfr_renamed_725(sprwna sprwna2) {
        void arg0;
        return this.cfr_renamed_797(new sprbta((sprwna)arg0));
    }

    private /* synthetic */ sprbta cfr_renamed_798(sprbta arg0) {
        int n;
        sprbta sprbta2;
        BigDecimal[] bigDecimalArray = this.cfr_renamed_3;
        sprbta sprbta3 = arg0;
        BigDecimal[] bigDecimalArray2 = sprbta3.cfr_renamed_3;
        int n2 = sprbta3.cfr_renamed_3.length;
        if (n2 <= 1) {
            int n3;
            BigDecimal[] bigDecimalArray3 = (BigDecimal[])this.cfr_renamed_3.clone();
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_3.length) {
                bigDecimalArray3[++n3] = bigDecimalArray3[n3].multiply(arg0.cfr_renamed_3[0]);
                n4 = n3;
            }
            return new sprbta(bigDecimalArray3);
        }
        int n5 = n2 / 2;
        sprbta sprbta4 = new sprbta(this.cfr_renamed_799(bigDecimalArray, n5));
        sprbta sprbta5 = new sprbta(this.cfr_renamed_796(bigDecimalArray, n5, n2));
        sprbta sprbta6 = new sprbta(this.cfr_renamed_799(bigDecimalArray2, n5));
        sprbta sprbta7 = new sprbta(this.cfr_renamed_796(bigDecimalArray2, n5, n2));
        sprbta sprbta8 = (sprbta)sprbta4.clone();
        sprbta8.cfr_renamed_800(sprbta5);
        sprbta sprbta9 = (sprbta)sprbta6.clone();
        sprbta9.cfr_renamed_800(sprbta7);
        sprbta sprbta10 = sprbta4.cfr_renamed_798(sprbta6);
        sprbta sprbta11 = sprbta5.cfr_renamed_798(sprbta7);
        sprbta sprbta12 = sprbta2 = sprbta8.cfr_renamed_798(sprbta9);
        sprbta12.cfr_renamed_801(sprbta10);
        sprbta12.cfr_renamed_801(sprbta11);
        sprbta sprbta13 = new sprbta(2 * n2 - 1);
        int n6 = n = 0;
        while (n6 < sprbta10.cfr_renamed_3.length) {
            int n7 = n++;
            sprbta13.cfr_renamed_3[n7] = sprbta10.cfr_renamed_3[n7];
            n6 = n;
        }
        int n8 = n = 0;
        while (n8 < sprbta2.cfr_renamed_3.length) {
            int n9 = n5 + n;
            BigDecimal bigDecimal = sprbta13.cfr_renamed_3[n5 + n].add(sprbta2.cfr_renamed_3[n]);
            sprbta13.cfr_renamed_3[n9] = bigDecimal;
            n8 = ++n;
        }
        int n10 = n = 0;
        while (n10 < sprbta11.cfr_renamed_3.length) {
            int n11 = 2 * n5 + n;
            BigDecimal bigDecimal = sprbta13.cfr_renamed_3[2 * n5 + n].add(sprbta11.cfr_renamed_3[n]);
            sprbta13.cfr_renamed_3[n11] = bigDecimal;
            n10 = ++n;
        }
        return sprbta13;
    }

    public void cfr_renamed_800(sprbta arg0) {
        int n;
        if (arg0.cfr_renamed_3.length > this.cfr_renamed_3.length) {
            int n2;
            n = this.cfr_renamed_3.length;
            sprbta sprbta2 = this;
            sprbta2.cfr_renamed_3 = sprbta2.cfr_renamed_799(sprbta2.cfr_renamed_3, arg0.cfr_renamed_3.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n2++] = cfr_renamed_2;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_3.length) {
            sprbta sprbta3 = this;
            int n5 = n;
            BigDecimal bigDecimal = sprbta3.cfr_renamed_3[n].add(arg0.cfr_renamed_3[n5]);
            sprbta3.cfr_renamed_3[n5] = bigDecimal;
            n4 = ++n;
        }
    }

    public sprwna cfr_renamed_802() {
        int n;
        int n2 = this.cfr_renamed_3.length;
        sprwna sprwna2 = new sprwna(n2);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            sprwna2.cfr_renamed_3[n4] = this.cfr_renamed_3[n4].setScale(0, 6).toBigInteger();
            n3 = n;
        }
        return sprwna2;
    }

    public void cfr_renamed_801(sprbta arg0) {
        int n;
        if (arg0.cfr_renamed_3.length > this.cfr_renamed_3.length) {
            int n2;
            n = this.cfr_renamed_3.length;
            sprbta sprbta2 = this;
            sprbta2.cfr_renamed_3 = sprbta2.cfr_renamed_799(sprbta2.cfr_renamed_3, arg0.cfr_renamed_3.length);
            int n3 = n2 = n;
            while (n3 < this.cfr_renamed_3.length) {
                this.cfr_renamed_3[n2++] = cfr_renamed_2;
                n3 = n2;
            }
        }
        int n4 = n = 0;
        while (n4 < arg0.cfr_renamed_3.length) {
            sprbta sprbta3 = this;
            int n5 = n;
            BigDecimal bigDecimal = sprbta3.cfr_renamed_3[n].subtract(arg0.cfr_renamed_3[n5]);
            sprbta3.cfr_renamed_3[n5] = bigDecimal;
            n4 = ++n;
        }
    }

    public BigDecimal[] cfr_renamed_790() {
        BigDecimal[] bigDecimalArray = new BigDecimal[this.cfr_renamed_3.length];
        System.arraycopy(this.cfr_renamed_3, 0, bigDecimalArray, 0, this.cfr_renamed_3.length);
        return bigDecimalArray;
    }

    public sprbta cfr_renamed_797(sprbta arg0) {
        int n = this.cfr_renamed_3.length;
        if (arg0.cfr_renamed_3.length != n) {
            throw new IllegalArgumentException(sprhah.cfr_renamed_9("\u001e\u0012=\u00055\u0015p\b6G3\b5\u00016\u000e3\u000e5\t$\u0014p\n%\u0014$G2\u0002p\u00138\u0002p\u00141\n5"));
        }
        sprbta sprbta2 = this.cfr_renamed_798(arg0);
        if (sprbta2.cfr_renamed_3.length > n) {
            int n2;
            int n3 = n2 = n;
            while (n3 < sprbta2.cfr_renamed_3.length) {
                int n4 = n2 - n;
                BigDecimal bigDecimal = sprbta2.cfr_renamed_3[n2 - n].add(sprbta2.cfr_renamed_3[n2]);
                sprbta2.cfr_renamed_3[n4] = bigDecimal;
                n3 = ++n2;
            }
            sprbta2.cfr_renamed_3 = this.cfr_renamed_799(sprbta2.cfr_renamed_3, n);
        }
        return sprbta2;
    }

    private /* synthetic */ BigDecimal[] cfr_renamed_799(BigDecimal[] arg0, int arg1) {
        BigDecimal[] bigDecimalArray = new BigDecimal[arg1];
        System.arraycopy(arg0, 0, bigDecimalArray, 0, arg0.length < arg1 ? arg0.length : arg1);
        return bigDecimalArray;
    }

    public sprbta(BigDecimal[] bigDecimalArray) {
        this.cfr_renamed_3 = bigDecimalArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprbta(int n) {
        void arg0;
        int n2;
        this.cfr_renamed_3 = new BigDecimal[n];
        int n3 = n2 = 0;
        while (n3 < arg0) {
            this.cfr_renamed_3[n2++] = cfr_renamed_2;
            n3 = n2;
        }
    }

    public void cfr_renamed_803() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprbta sprbta2 = this;
            int n3 = n++;
            sprbta2.cfr_renamed_3[n3] = sprbta2.cfr_renamed_3[n3].multiply(cfr_renamed_4);
            n2 = n;
        }
    }
}

