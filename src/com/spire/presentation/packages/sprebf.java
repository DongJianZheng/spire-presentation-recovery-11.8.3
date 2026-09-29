/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprukz;

public class sprebf {
    private int cfr_renamed_3;
    private long[] cfr_renamed_4;

    public sprhgf cfr_renamed_131() {
        int n;
        int[] nArray = new int[this.cfr_renamed_3];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.length) {
            nArray[n2++] = (int)(this.cfr_renamed_4[n] & 0x7FFL);
            if (n2 < this.cfr_renamed_3) {
                nArray[n2++] = (int)(this.cfr_renamed_4[n] >> 24 & 0x7FFL);
            }
            n3 = ++n;
        }
        return new sprhgf(nArray);
    }

    public sprebf cfr_renamed_5448(sprebf arg0) {
        int n = this.cfr_renamed_4.length;
        if (arg0.cfr_renamed_4.length != n || this.cfr_renamed_3 != arg0.cfr_renamed_3) {
            throw new IllegalArgumentException(sprukz.cfr_renamed_9("c!@6H&\r;KtN;H2K=N=H:Y'\r9X'YtO1\r E1\r'L9H"));
        }
        sprebf sprebf2 = this.cfr_renamed_5449(arg0);
        if (sprebf2.cfr_renamed_4.length > n) {
            if (this.cfr_renamed_3 % 2 == 0) {
                int n2;
                int n3 = n2 = n;
                while (n3 < sprebf2.cfr_renamed_4.length) {
                    int n4 = n2 - n;
                    long l = sprebf2.cfr_renamed_4[n2 - n] + sprebf2.cfr_renamed_4[n2] & 0x7FF0007FFL;
                    sprebf2.cfr_renamed_4[n4] = l;
                    n3 = ++n2;
                }
                sprebf2.cfr_renamed_4 = sproze.cfr_renamed_524(sprebf2.cfr_renamed_4, n);
            } else {
                int n5;
                int n6 = n5 = n;
                while (n6 < sprebf2.cfr_renamed_4.length) {
                    sprebf sprebf3 = sprebf2;
                    sprebf3.cfr_renamed_4[n5 - n] = sprebf2.cfr_renamed_4[n5 - n] + (sprebf2.cfr_renamed_4[n5 - 1] >> 24);
                    sprebf sprebf4 = sprebf2;
                    sprebf3.cfr_renamed_4[n5 - n] = sprebf4.cfr_renamed_4[n5 - n] + ((sprebf2.cfr_renamed_4[n5] & 0x7FFL) << 24);
                    int n7 = n5 - n;
                    sprebf4.cfr_renamed_4[n7] = sprebf4.cfr_renamed_4[n7] & 0x7FF0007FFL;
                    n6 = ++n5;
                }
                sprebf sprebf5 = sprebf2;
                sprebf5.cfr_renamed_4 = sproze.cfr_renamed_524(sprebf5.cfr_renamed_4, n);
                int n8 = sprebf2.cfr_renamed_4.length - 1;
                sprebf5.cfr_renamed_4[n8] = sprebf5.cfr_renamed_4[n8] & 0x7FFL;
            }
        }
        sprebf2 = new sprebf(sprebf2.cfr_renamed_4);
        sprebf2.cfr_renamed_3 = this.cfr_renamed_3;
        return sprebf2;
    }

    public void cfr_renamed_5450(sprebf arg0, int arg1) {
        int n;
        long l = ((long)arg1 << 24) + (long)arg1;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_4.length) {
            int n3 = n;
            long l2 = 0x800000800000L + this.cfr_renamed_4[n] - arg0.cfr_renamed_4[n] & l;
            this.cfr_renamed_4[n3] = l2;
            n2 = ++n;
        }
    }

    public Object clone() {
        new sprebf((long[])this.cfr_renamed_4.clone()).cfr_renamed_3 = this.cfr_renamed_3;
        return new sprebf((long[])this.cfr_renamed_4.clone());
    }

    private /* synthetic */ sprebf(int n) {
        this.cfr_renamed_4 = new long[n];
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprebf) {
            return sproze.cfr_renamed_565(this.cfr_renamed_4, ((sprebf)arg0).cfr_renamed_4);
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_5451(sprebf arg0) {
        int n;
        if (arg0.cfr_renamed_4.length > this.cfr_renamed_4.length) {
            this.cfr_renamed_4 = sproze.cfr_renamed_524(this.cfr_renamed_4, arg0.cfr_renamed_4.length);
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_4.length) {
            int n3 = n;
            long l = 0x800000800000L + this.cfr_renamed_4[n] - arg0.cfr_renamed_4[n] & 0x7FF0007FFL;
            this.cfr_renamed_4[n3] = l;
            n2 = ++n;
        }
    }

    private /* synthetic */ sprebf cfr_renamed_5449(sprebf arg0) {
        int n;
        sprebf sprebf2;
        long[] lArray = this.cfr_renamed_4;
        sprebf sprebf3 = arg0;
        long[] lArray2 = sprebf3.cfr_renamed_4;
        int n2 = sprebf3.cfr_renamed_4.length;
        if (n2 <= 32) {
            int n3;
            int n4 = 2 * n2;
            sprebf sprebf4 = new sprebf(new long[n4]);
            int n5 = n3 = 0;
            while (n5 < n4) {
                int n6 = Math.max(0, n3 - n2 + 1);
                while (n6 <= Math.min(n3, n2 - 1)) {
                    int n7;
                    long l;
                    long l2 = l = lArray[n3 - n7] * lArray2[n7];
                    long l3 = l2 & 0x7FF000000L + (l2 & 0x7FFL);
                    long l4 = l >>> 48 & 0x7FFL;
                    sprebf sprebf5 = sprebf4;
                    sprebf4.cfr_renamed_4[n3] = sprebf5.cfr_renamed_4[n3] + l3 & 0x7FF0007FFL;
                    sprebf5.cfr_renamed_4[n3 + 1] = sprebf4.cfr_renamed_4[n3 + 1] + l4 & 0x7FF0007FFL;
                    n6 = ++n7;
                }
                n5 = ++n3;
            }
            return sprebf4;
        }
        int n8 = n2 / 2;
        sprebf sprebf6 = new sprebf(sproze.cfr_renamed_524(lArray, n8));
        sprebf sprebf7 = new sprebf(sproze.cfr_renamed_562(lArray, n8, n2));
        sprebf sprebf8 = new sprebf(sproze.cfr_renamed_524(lArray2, n8));
        sprebf sprebf9 = new sprebf(sproze.cfr_renamed_562(lArray2, n8, n2));
        sprebf sprebf10 = (sprebf)sprebf6.clone();
        sprebf10.cfr_renamed_5452(sprebf7);
        sprebf sprebf11 = (sprebf)sprebf8.clone();
        sprebf11.cfr_renamed_5452(sprebf9);
        sprebf sprebf12 = sprebf6.cfr_renamed_5449(sprebf8);
        sprebf sprebf13 = sprebf7.cfr_renamed_5449(sprebf9);
        sprebf sprebf14 = sprebf2 = sprebf10.cfr_renamed_5449(sprebf11);
        sprebf14.cfr_renamed_5451(sprebf12);
        sprebf14.cfr_renamed_5451(sprebf13);
        sprebf sprebf15 = new sprebf(2 * n2);
        int n9 = n = 0;
        while (n9 < sprebf12.cfr_renamed_4.length) {
            int n10 = n++;
            sprebf15.cfr_renamed_4[n10] = sprebf12.cfr_renamed_4[n10] & 0x7FF0007FFL;
            n9 = n;
        }
        int n11 = n = 0;
        while (n11 < sprebf2.cfr_renamed_4.length) {
            int n12 = n8 + n;
            long l = sprebf15.cfr_renamed_4[n8 + n] + sprebf2.cfr_renamed_4[n] & 0x7FF0007FFL;
            sprebf15.cfr_renamed_4[n12] = l;
            n11 = ++n;
        }
        int n13 = n = 0;
        while (n13 < sprebf13.cfr_renamed_4.length) {
            int n14 = 2 * n8 + n;
            long l = sprebf15.cfr_renamed_4[2 * n8 + n] + sprebf13.cfr_renamed_4[n] & 0x7FF0007FFL;
            sprebf15.cfr_renamed_4[n14] = l;
            n13 = ++n;
        }
        return sprebf15;
    }

    public void cfr_renamed_741(int arg0) {
        int n;
        long l = ((long)arg0 << 24) + (long)arg0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            sprebf sprebf2 = this;
            int n3 = n++;
            sprebf2.cfr_renamed_4[n3] = sprebf2.cfr_renamed_4[n3] << 1 & l;
            n2 = n;
        }
    }

    private /* synthetic */ sprebf(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprebf(sprhgf sprhgf2) {
        int n;
        this.cfr_renamed_3 = sprhgf2.cfr_renamed_3.length;
        this.cfr_renamed_4 = new long[(this.cfr_renamed_3 + 1) / 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int n4;
            long l;
            long l2;
            void arg0;
            int n5 = arg0.cfr_renamed_3[n];
            ++n;
            while (n5 < 0) {
                n5 = n4 += 2048;
            }
            if (n < this.cfr_renamed_3) {
                l2 = arg0.cfr_renamed_3[n];
                ++n;
            } else {
                l2 = 0L;
            }
            long l3 = l = l2;
            while (l3 < 0L) {
                l3 = l + 2048L;
            }
            this.cfr_renamed_4[n2++] = (long)n4 + (l << 24);
            n3 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_5452(sprebf arg0) {
        int n;
        if (arg0.cfr_renamed_4.length > this.cfr_renamed_4.length) {
            this.cfr_renamed_4 = sproze.cfr_renamed_524(this.cfr_renamed_4, arg0.cfr_renamed_4.length);
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_4.length) {
            sprebf sprebf2 = this;
            int n3 = n;
            long l = sprebf2.cfr_renamed_4[n3] + arg0.cfr_renamed_4[n] & 0x7FF0007FFL;
            sprebf2.cfr_renamed_4[n3] = l;
            n2 = ++n;
        }
    }
}

