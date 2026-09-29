/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;

public class sprhaf {
    private int cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_1366(int arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 2;
        while (n3 < arg0) {
            ++n2;
            n3 = n <<= 1;
        }
        return n2;
    }

    private /* synthetic */ void cfr_renamed_5634(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg2 < 1) {
            System.arraycopy(arg0, arg1, arg3, arg4, this.cfr_renamed_2);
            return;
        }
        sprhaf sprhaf2 = this;
        sprhaf2.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, this.cfr_renamed_2);
        sprhaf2.cfr_renamed_3.cfr_renamed_1219(arg3, arg4);
        while (--arg2 > 0) {
            sprhaf sprhaf3 = this;
            sprhaf3.cfr_renamed_3.cfr_renamed_1197(arg3, arg4, this.cfr_renamed_2);
            sprhaf3.cfr_renamed_3.cfr_renamed_1219(arg3, arg4);
        }
    }

    public int cfr_renamed_1368() {
        int n = this.cfr_renamed_3.cfr_renamed_1218();
        int n2 = ((n << 3) + (this.cfr_renamed_4 - 1)) / this.cfr_renamed_4;
        sprhaf sprhaf2 = this;
        int n3 = sprhaf2.cfr_renamed_1366((n2 << sprhaf2.cfr_renamed_4) + 1);
        return n * (n2 += (n3 + this.cfr_renamed_4 - 1) / this.cfr_renamed_4);
    }

    public sprhaf(sprgf arg0, int arg1) {
        sprhaf sprhaf2 = this;
        this.cfr_renamed_4 = arg1;
        sprhaf2.cfr_renamed_3 = arg0;
        sprhaf2.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_1218();
    }

    public byte[] cfr_renamed_1367(byte[] arg0, byte[] arg1) {
        int n;
        sprhaf sprhaf2 = this;
        byte[] byArray = new byte[sprhaf2.cfr_renamed_2];
        sprhaf2.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        sprhaf sprhaf3 = this;
        sprhaf sprhaf4 = this;
        int n2 = ((sprhaf3.cfr_renamed_2 << 3) + (sprhaf4.cfr_renamed_4 - 1)) / this.cfr_renamed_4;
        int n3 = sprhaf3.cfr_renamed_1366((n2 << this.cfr_renamed_4) + 1);
        int n4 = n2 + (n3 + this.cfr_renamed_4 - 1) / this.cfr_renamed_4;
        int n5 = sprhaf4.cfr_renamed_2 * n4;
        if (n5 != arg1.length) {
            return null;
        }
        byte[] byArray2 = new byte[n5];
        int n6 = 0;
        int n7 = 0;
        if (8 % this.cfr_renamed_4 == 0) {
            int n8;
            int n9;
            n = 8 / this.cfr_renamed_4;
            int n10 = (1 << this.cfr_renamed_4) - 1;
            int n11 = n9 = 0;
            while (n11 < byArray.length) {
                int n12;
                int n13 = n12 = 0;
                while (n13 < n) {
                    n8 = byArray[n9] & n10;
                    n6 += n8;
                    sprhaf sprhaf5 = this;
                    sprhaf5.cfr_renamed_5634(arg1, n7 * sprhaf5.cfr_renamed_2, n10 - n8, byArray2, n7 * this.cfr_renamed_2);
                    ++n7;
                    byArray[n9] = (byte)(byArray[n9] >>> this.cfr_renamed_4);
                    n13 = ++n12;
                }
                n11 = ++n9;
            }
            n6 = (n2 << this.cfr_renamed_4) - n6;
            int n14 = n9 = 0;
            while (n14 < n3) {
                n8 = n6 & n10;
                sprhaf sprhaf6 = this;
                sprhaf6.cfr_renamed_5634(arg1, n7 * sprhaf6.cfr_renamed_2, n10 - n8, byArray2, n7 * this.cfr_renamed_2);
                ++n7;
                n6 >>>= this.cfr_renamed_4;
                n14 = n9 + this.cfr_renamed_4;
            }
        } else if (this.cfr_renamed_4 < 8) {
            int n15;
            long l;
            int n16;
            sprhaf sprhaf7 = this;
            n = sprhaf7.cfr_renamed_2 / sprhaf7.cfr_renamed_4;
            int n17 = (1 << this.cfr_renamed_4) - 1;
            int n18 = 0;
            int n19 = n16 = 0;
            while (n19 < n) {
                int n20;
                l = 0L;
                int n21 = n20 = 0;
                while (n21 < this.cfr_renamed_4) {
                    int n22 = (byArray[n18] & 0xFF) << (n20 << 3);
                    ++n18;
                    l ^= (long)n22;
                    n21 = ++n20;
                }
                int n23 = n20 = 0;
                while (n23 < 8) {
                    n15 = (int)(l & (long)n17);
                    n6 += n15;
                    sprhaf sprhaf8 = this;
                    sprhaf8.cfr_renamed_5634(arg1, n7 * sprhaf8.cfr_renamed_2, n17 - n15, byArray2, n7 * this.cfr_renamed_2);
                    ++n7;
                    l >>>= this.cfr_renamed_4;
                    n23 = ++n20;
                }
                n19 = ++n16;
            }
            sprhaf sprhaf9 = this;
            n = sprhaf9.cfr_renamed_2 % sprhaf9.cfr_renamed_4;
            l = 0L;
            int n24 = n16 = 0;
            while (n24 < n) {
                int n25 = (byArray[n18] & 0xFF) << (n16 << 3);
                ++n18;
                l ^= (long)n25;
                n24 = ++n16;
            }
            n <<= 3;
            int n26 = n16 = 0;
            while (n26 < n) {
                n15 = (int)(l & (long)n17);
                n6 += n15;
                sprhaf sprhaf10 = this;
                sprhaf10.cfr_renamed_5634(arg1, n7 * sprhaf10.cfr_renamed_2, n17 - n15, byArray2, n7 * this.cfr_renamed_2);
                ++n7;
                l >>>= this.cfr_renamed_4;
                n26 = n16 + this.cfr_renamed_4;
            }
            n6 = (n2 << this.cfr_renamed_4) - n6;
            int n27 = n16 = 0;
            while (n27 < n3) {
                n15 = n6 & n17;
                sprhaf sprhaf11 = this;
                sprhaf11.cfr_renamed_5634(arg1, n7 * sprhaf11.cfr_renamed_2, n17 - n15, byArray2, n7 * this.cfr_renamed_2);
                ++n7;
                n6 >>>= this.cfr_renamed_4;
                n27 = n16 + this.cfr_renamed_4;
            }
        } else if (this.cfr_renamed_4 < 57) {
            long l;
            int n28;
            int n29;
            long l2;
            int n30;
            int n31;
            int n32;
            n = (this.cfr_renamed_2 << 3) - this.cfr_renamed_4;
            sprhaf sprhaf12 = this;
            int n33 = (1 << sprhaf12.cfr_renamed_4) - 1;
            byte[] byArray3 = new byte[sprhaf12.cfr_renamed_2];
            int n34 = n32 = 0;
            while (n34 <= n) {
                n31 = n32 >>> 3;
                n30 = n32 % 8;
                int n35 = (n32 += this.cfr_renamed_4) + 7 >>> 3;
                l2 = 0L;
                n29 = 0;
                int n36 = n31;
                while (n36 < n35) {
                    int n37 = (byArray[n28] & 0xFF) << (n29 << 3);
                    ++n29;
                    l2 ^= (long)n37;
                    n36 = ++n28;
                }
                l = (l2 >>>= n30) & (long)n33;
                n6 = (int)((long)n6 + l);
                long l3 = l;
                System.arraycopy(arg1, n7 * this.cfr_renamed_2, byArray3, 0, this.cfr_renamed_2);
                while (l3 < (long)n33) {
                    this.cfr_renamed_3.cfr_renamed_1197(byArray3, 0, byArray3.length);
                    this.cfr_renamed_3.cfr_renamed_1219(byArray3, 0);
                    l3 = ++l;
                }
                int n38 = n7 * this.cfr_renamed_2;
                ++n7;
                System.arraycopy(byArray3, 0, byArray2, n38, this.cfr_renamed_2);
                n34 = n32;
            }
            n31 = n32 >>> 3;
            if (n31 < this.cfr_renamed_2) {
                n30 = n32 % 8;
                l2 = 0L;
                n29 = 0;
                int n39 = n28 = n31;
                while (n39 < this.cfr_renamed_2) {
                    int n40 = (byArray[n28] & 0xFF) << (n29 << 3);
                    ++n29;
                    l2 ^= (long)n40;
                    n39 = ++n28;
                }
                l = (l2 >>>= n30) & (long)n33;
                n6 = (int)((long)n6 + l);
                long l4 = l;
                System.arraycopy(arg1, n7 * this.cfr_renamed_2, byArray3, 0, this.cfr_renamed_2);
                while (l4 < (long)n33) {
                    this.cfr_renamed_3.cfr_renamed_1197(byArray3, 0, byArray3.length);
                    this.cfr_renamed_3.cfr_renamed_1219(byArray3, 0);
                    l4 = ++l;
                }
                int n41 = n7 * this.cfr_renamed_2;
                ++n7;
                System.arraycopy(byArray3, 0, byArray2, n41, this.cfr_renamed_2);
            }
            n6 = (n2 << this.cfr_renamed_4) - n6;
            int n42 = n28 = 0;
            while (n42 < n3) {
                long l5 = n6 & n33;
                System.arraycopy(arg1, n7 * this.cfr_renamed_2, byArray3, 0, this.cfr_renamed_2);
                while (l5 < (long)n33) {
                    this.cfr_renamed_3.cfr_renamed_1197(byArray3, 0, byArray3.length);
                    this.cfr_renamed_3.cfr_renamed_1219(byArray3, 0);
                    l5 = ++l;
                }
                System.arraycopy(byArray3, 0, byArray2, n7 * this.cfr_renamed_2, this.cfr_renamed_2);
                ++n7;
                n6 >>>= this.cfr_renamed_4;
                n42 = n28 + this.cfr_renamed_4;
            }
        }
        this.cfr_renamed_3.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprhaf sprhaf13 = this;
        byte[] byArray4 = new byte[sprhaf13.cfr_renamed_2];
        sprhaf13.cfr_renamed_3.cfr_renamed_1219(byArray4, 0);
        return byArray4;
    }
}

