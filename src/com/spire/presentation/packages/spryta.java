/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprycga;
import com.spire.presentation.packages.sprzra;

public class spryta {
    private int cfr_renamed_3;
    private long[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_740(spryta arg0) {
        int n;
        if (arg0.cfr_renamed_4.length > this.cfr_renamed_4.length) {
            this.cfr_renamed_4 = sprzra.cfr_renamed_524(this.cfr_renamed_4, arg0.cfr_renamed_4.length);
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_4.length) {
            int n3 = n;
            long l = 0x800000800000L + this.cfr_renamed_4[n] - arg0.cfr_renamed_4[n] & 0x7FF0007FFL;
            this.cfr_renamed_4[n3] = l;
            n2 = ++n;
        }
    }

    public Object clone() {
        new spryta((long[])this.cfr_renamed_4.clone()).cfr_renamed_3 = this.cfr_renamed_3;
        return new spryta((long[])this.cfr_renamed_4.clone());
    }

    public void cfr_renamed_741(int arg0) {
        int n;
        long l = ((long)arg0 << 24) + (long)arg0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            spryta spryta2 = this;
            int n3 = n++;
            spryta2.cfr_renamed_4[n3] = spryta2.cfr_renamed_4[n3] << 1 & l;
            n2 = n;
        }
    }

    public void cfr_renamed_742(spryta arg0, int arg1) {
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

    private /* synthetic */ spryta(long[] lArray) {
        this.cfr_renamed_4 = lArray;
    }

    /*
     * WARNING - void declaration
     */
    public spryta(sprama sprama2) {
        int n;
        this.cfr_renamed_3 = sprama2.cfr_renamed_1.length;
        this.cfr_renamed_4 = new long[(this.cfr_renamed_3 + 1) / 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int n4;
            long l;
            long l2;
            void arg0;
            int n5 = arg0.cfr_renamed_1[n];
            ++n;
            while (n5 < 0) {
                n5 = n4 += 2048;
            }
            if (n < this.cfr_renamed_3) {
                l2 = arg0.cfr_renamed_1[n];
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

    private /* synthetic */ spryta(int n) {
        this.cfr_renamed_4 = new long[n];
    }

    private /* synthetic */ void cfr_renamed_743(spryta arg0) {
        int n;
        if (arg0.cfr_renamed_4.length > this.cfr_renamed_4.length) {
            this.cfr_renamed_4 = sprzra.cfr_renamed_524(this.cfr_renamed_4, arg0.cfr_renamed_4.length);
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_4.length) {
            spryta spryta2 = this;
            int n3 = n;
            long l = spryta2.cfr_renamed_4[n3] + arg0.cfr_renamed_4[n] & 0x7FF0007FFL;
            spryta2.cfr_renamed_4[n3] = l;
            n2 = ++n;
        }
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof spryta) {
            return sprzra.cfr_renamed_565(this.cfr_renamed_4, ((spryta)arg0).cfr_renamed_4);
        }
        return false;
    }

    public spryta cfr_renamed_744(spryta arg0) {
        int n = this.cfr_renamed_4.length;
        if (arg0.cfr_renamed_4.length != n || this.cfr_renamed_3 != arg0.cfr_renamed_3) {
            throw new IllegalArgumentException(sprycga.cfr_renamed_9(";I\u0018^\u0010NUS\u0013\u001c\u0016S\u0010Z\u0013U\u0016U\u0010R\u0001OUQ\u0000O\u0001\u001c\u0017YUH\u001dYUO\u0014Q\u0010"));
        }
        spryta spryta2 = this.cfr_renamed_745(arg0);
        if (spryta2.cfr_renamed_4.length > n) {
            if (this.cfr_renamed_3 % 2 == 0) {
                int n2;
                int n3 = n2 = n;
                while (n3 < spryta2.cfr_renamed_4.length) {
                    int n4 = n2 - n;
                    long l = spryta2.cfr_renamed_4[n2 - n] + spryta2.cfr_renamed_4[n2] & 0x7FF0007FFL;
                    spryta2.cfr_renamed_4[n4] = l;
                    n3 = ++n2;
                }
                spryta2.cfr_renamed_4 = sprzra.cfr_renamed_524(spryta2.cfr_renamed_4, n);
            } else {
                int n5;
                int n6 = n5 = n;
                while (n6 < spryta2.cfr_renamed_4.length) {
                    spryta spryta3 = spryta2;
                    spryta3.cfr_renamed_4[n5 - n] = spryta2.cfr_renamed_4[n5 - n] + (spryta2.cfr_renamed_4[n5 - 1] >> 24);
                    spryta spryta4 = spryta2;
                    spryta3.cfr_renamed_4[n5 - n] = spryta4.cfr_renamed_4[n5 - n] + ((spryta2.cfr_renamed_4[n5] & 0x7FFL) << 24);
                    int n7 = n5 - n;
                    spryta4.cfr_renamed_4[n7] = spryta4.cfr_renamed_4[n7] & 0x7FF0007FFL;
                    n6 = ++n5;
                }
                spryta spryta5 = spryta2;
                spryta5.cfr_renamed_4 = sprzra.cfr_renamed_524(spryta5.cfr_renamed_4, n);
                int n8 = spryta2.cfr_renamed_4.length - 1;
                spryta5.cfr_renamed_4[n8] = spryta5.cfr_renamed_4[n8] & 0x7FFL;
            }
        }
        spryta2 = new spryta(spryta2.cfr_renamed_4);
        spryta2.cfr_renamed_3 = this.cfr_renamed_3;
        return spryta2;
    }

    public sprama cfr_renamed_131() {
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
        return new sprama(nArray);
    }

    private /* synthetic */ spryta cfr_renamed_745(spryta arg0) {
        int n;
        spryta spryta2;
        long[] lArray = this.cfr_renamed_4;
        spryta spryta3 = arg0;
        long[] lArray2 = spryta3.cfr_renamed_4;
        int n2 = spryta3.cfr_renamed_4.length;
        if (n2 <= 32) {
            int n3;
            int n4 = 2 * n2;
            spryta spryta4 = new spryta(new long[n4]);
            int n5 = n3 = 0;
            while (n5 < n4) {
                int n6 = Math.max(0, n3 - n2 + 1);
                while (n6 <= Math.min(n3, n2 - 1)) {
                    int n7;
                    long l;
                    long l2 = l = lArray[n3 - n7] * lArray2[n7];
                    long l3 = l2 & 0x7FF000000L + (l2 & 0x7FFL);
                    long l4 = l >>> 48 & 0x7FFL;
                    spryta spryta5 = spryta4;
                    spryta4.cfr_renamed_4[n3] = spryta5.cfr_renamed_4[n3] + l3 & 0x7FF0007FFL;
                    spryta5.cfr_renamed_4[n3 + 1] = spryta4.cfr_renamed_4[n3 + 1] + l4 & 0x7FF0007FFL;
                    n6 = ++n7;
                }
                n5 = ++n3;
            }
            return spryta4;
        }
        int n8 = n2 / 2;
        spryta spryta6 = new spryta(sprzra.cfr_renamed_524(lArray, n8));
        spryta spryta7 = new spryta(sprzra.cfr_renamed_562(lArray, n8, n2));
        spryta spryta8 = new spryta(sprzra.cfr_renamed_524(lArray2, n8));
        spryta spryta9 = new spryta(sprzra.cfr_renamed_562(lArray2, n8, n2));
        spryta spryta10 = (spryta)spryta6.clone();
        spryta10.cfr_renamed_743(spryta7);
        spryta spryta11 = (spryta)spryta8.clone();
        spryta11.cfr_renamed_743(spryta9);
        spryta spryta12 = spryta6.cfr_renamed_745(spryta8);
        spryta spryta13 = spryta7.cfr_renamed_745(spryta9);
        spryta spryta14 = spryta2 = spryta10.cfr_renamed_745(spryta11);
        spryta14.cfr_renamed_740(spryta12);
        spryta14.cfr_renamed_740(spryta13);
        spryta spryta15 = new spryta(2 * n2);
        int n9 = n = 0;
        while (n9 < spryta12.cfr_renamed_4.length) {
            int n10 = n++;
            spryta15.cfr_renamed_4[n10] = spryta12.cfr_renamed_4[n10] & 0x7FF0007FFL;
            n9 = n;
        }
        int n11 = n = 0;
        while (n11 < spryta2.cfr_renamed_4.length) {
            int n12 = n8 + n;
            long l = spryta15.cfr_renamed_4[n8 + n] + spryta2.cfr_renamed_4[n] & 0x7FF0007FFL;
            spryta15.cfr_renamed_4[n12] = l;
            n11 = ++n;
        }
        int n13 = n = 0;
        while (n13 < spryta13.cfr_renamed_4.length) {
            int n14 = 2 * n8 + n;
            long l = spryta15.cfr_renamed_4[2 * n8 + n] + spryta13.cfr_renamed_4[n] & 0x7FF0007FFL;
            spryta15.cfr_renamed_4[n14] = l;
            n13 = ++n;
        }
        return spryta15;
    }
}

