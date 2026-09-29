/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;

public class sprzgb {
    private int cfr_renamed_3;
    private sprlc cfr_renamed_4;

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

    /*
     * WARNING - void declaration
     */
    public sprzgb(sprlc sprlc2, int n) {
        void arg1;
        sprzgb sprzgb2 = this;
        sprzgb2.cfr_renamed_3 = arg1;
        sprzgb2.cfr_renamed_4 = sprlc2;
    }

    public byte[] cfr_renamed_1367(byte[] arg0, byte[] arg1) {
        int n;
        sprzgb sprzgb2 = this;
        int n2 = sprzgb2.cfr_renamed_4.cfr_renamed_1218();
        byte[] byArray = new byte[n2];
        sprzgb2.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
        sprzgb sprzgb3 = this;
        byArray = new byte[sprzgb3.cfr_renamed_4.cfr_renamed_1218()];
        sprzgb3.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        int n3 = ((n2 << 3) + (this.cfr_renamed_3 - 1)) / this.cfr_renamed_3;
        sprzgb sprzgb4 = this;
        int n4 = sprzgb4.cfr_renamed_1366((n3 << sprzgb4.cfr_renamed_3) + 1);
        int n5 = n3 + (n4 + this.cfr_renamed_3 - 1) / this.cfr_renamed_3;
        int n6 = n2 * n5;
        if (n6 != arg1.length) {
            return null;
        }
        byte[] byArray2 = new byte[n6];
        int n7 = 0;
        int n8 = 0;
        if (8 % this.cfr_renamed_3 == 0) {
            int n9;
            int n10;
            n = 8 / this.cfr_renamed_3;
            int n11 = (1 << this.cfr_renamed_3) - 1;
            byte[] byArray3 = new byte[n2];
            int n12 = n10 = 0;
            while (n12 < byArray.length) {
                int n13;
                int n14 = n13 = 0;
                while (n14 < n) {
                    n9 = byArray[n10] & n11;
                    n7 += n9;
                    System.arraycopy(arg1, n8 * n2, byArray3, 0, n2);
                    int n15 = n9;
                    while (n15 < n11) {
                        this.cfr_renamed_4.cfr_renamed_1197(byArray3, 0, byArray3.length);
                        sprzgb sprzgb5 = this;
                        byArray3 = new byte[sprzgb5.cfr_renamed_4.cfr_renamed_1218()];
                        sprzgb5.cfr_renamed_4.cfr_renamed_1219(byArray3, 0);
                        n15 = ++n9;
                    }
                    System.arraycopy(byArray3, 0, byArray2, n8 * n2, n2);
                    ++n8;
                    byArray[n10] = (byte)(byArray[n10] >>> this.cfr_renamed_3);
                    n14 = ++n13;
                }
                n12 = ++n10;
            }
            n7 = (n3 << this.cfr_renamed_3) - n7;
            int n16 = n10 = 0;
            while (n16 < n4) {
                int n17 = n7 & n11;
                System.arraycopy(arg1, n8 * n2, byArray3, 0, n2);
                while (n17 < n11) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray3, 0, byArray3.length);
                    sprzgb sprzgb6 = this;
                    byArray3 = new byte[sprzgb6.cfr_renamed_4.cfr_renamed_1218()];
                    sprzgb6.cfr_renamed_4.cfr_renamed_1219(byArray3, 0);
                    n17 = ++n9;
                }
                System.arraycopy(byArray3, 0, byArray2, n8 * n2, n2);
                ++n8;
                n7 >>>= this.cfr_renamed_3;
                n16 = n10 + this.cfr_renamed_3;
            }
        } else if (this.cfr_renamed_3 < 8) {
            int n18;
            long l;
            int n19;
            n = n2 / this.cfr_renamed_3;
            int n20 = (1 << this.cfr_renamed_3) - 1;
            byte[] byArray4 = new byte[n2];
            int n21 = 0;
            int n22 = n19 = 0;
            while (n22 < n) {
                int n23;
                l = 0L;
                int n24 = n23 = 0;
                while (n24 < this.cfr_renamed_3) {
                    int n25 = (byArray[n21] & 0xFF) << (n23 << 3);
                    ++n21;
                    l ^= (long)n25;
                    n24 = ++n23;
                }
                int n26 = n23 = 0;
                while (n26 < 8) {
                    n18 = (int)(l & (long)n20);
                    n7 += n18;
                    int n27 = n18;
                    System.arraycopy(arg1, n8 * n2, byArray4, 0, n2);
                    while (n27 < n20) {
                        this.cfr_renamed_4.cfr_renamed_1197(byArray4, 0, byArray4.length);
                        sprzgb sprzgb7 = this;
                        byArray4 = new byte[sprzgb7.cfr_renamed_4.cfr_renamed_1218()];
                        sprzgb7.cfr_renamed_4.cfr_renamed_1219(byArray4, 0);
                        n27 = ++n18;
                    }
                    System.arraycopy(byArray4, 0, byArray2, n8 * n2, n2);
                    ++n8;
                    l >>>= this.cfr_renamed_3;
                    n26 = ++n23;
                }
                n22 = ++n19;
            }
            n = n2 % this.cfr_renamed_3;
            l = 0L;
            int n28 = n19 = 0;
            while (n28 < n) {
                int n29 = (byArray[n21] & 0xFF) << (n19 << 3);
                ++n21;
                l ^= (long)n29;
                n28 = ++n19;
            }
            n <<= 3;
            int n30 = n19 = 0;
            while (n30 < n) {
                n18 = (int)(l & (long)n20);
                n7 += n18;
                int n31 = n18;
                System.arraycopy(arg1, n8 * n2, byArray4, 0, n2);
                while (n31 < n20) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray4, 0, byArray4.length);
                    sprzgb sprzgb8 = this;
                    byArray4 = new byte[sprzgb8.cfr_renamed_4.cfr_renamed_1218()];
                    sprzgb8.cfr_renamed_4.cfr_renamed_1219(byArray4, 0);
                    n31 = ++n18;
                }
                System.arraycopy(byArray4, 0, byArray2, n8 * n2, n2);
                ++n8;
                l >>>= this.cfr_renamed_3;
                n30 = n19 + this.cfr_renamed_3;
            }
            n7 = (n3 << this.cfr_renamed_3) - n7;
            int n32 = n19 = 0;
            while (n32 < n4) {
                int n33 = n7 & n20;
                System.arraycopy(arg1, n8 * n2, byArray4, 0, n2);
                while (n33 < n20) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray4, 0, byArray4.length);
                    sprzgb sprzgb9 = this;
                    byArray4 = new byte[sprzgb9.cfr_renamed_4.cfr_renamed_1218()];
                    sprzgb9.cfr_renamed_4.cfr_renamed_1219(byArray4, 0);
                    n33 = ++n18;
                }
                System.arraycopy(byArray4, 0, byArray2, n8 * n2, n2);
                ++n8;
                n7 >>>= this.cfr_renamed_3;
                n32 = n19 + this.cfr_renamed_3;
            }
        } else if (this.cfr_renamed_3 < 57) {
            long l;
            int n34;
            int n35;
            long l2;
            int n36;
            int n37;
            int n38;
            n = (n2 << 3) - this.cfr_renamed_3;
            int n39 = (1 << this.cfr_renamed_3) - 1;
            byte[] byArray5 = new byte[n2];
            int n40 = n38 = 0;
            while (n40 <= n) {
                n37 = n38 >>> 3;
                n36 = n38 % 8;
                int n41 = (n38 += this.cfr_renamed_3) + 7 >>> 3;
                l2 = 0L;
                n35 = 0;
                int n42 = n37;
                while (n42 < n41) {
                    int n43 = (byArray[n34] & 0xFF) << (n35 << 3);
                    ++n35;
                    l2 ^= (long)n43;
                    n42 = ++n34;
                }
                l = (l2 >>>= n36) & (long)n39;
                n7 = (int)((long)n7 + l);
                long l3 = l;
                System.arraycopy(arg1, n8 * n2, byArray5, 0, n2);
                while (l3 < (long)n39) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray5, 0, byArray5.length);
                    sprzgb sprzgb10 = this;
                    byArray5 = new byte[sprzgb10.cfr_renamed_4.cfr_renamed_1218()];
                    sprzgb10.cfr_renamed_4.cfr_renamed_1219(byArray5, 0);
                    l3 = ++l;
                }
                System.arraycopy(byArray5, 0, byArray2, n8++ * n2, n2);
                n40 = n38;
            }
            n37 = n38 >>> 3;
            if (n37 < n2) {
                n36 = n38 % 8;
                l2 = 0L;
                n35 = 0;
                int n44 = n34 = n37;
                while (n44 < n2) {
                    int n45 = (byArray[n34] & 0xFF) << (n35 << 3);
                    ++n35;
                    l2 ^= (long)n45;
                    n44 = ++n34;
                }
                l = (l2 >>>= n36) & (long)n39;
                n7 = (int)((long)n7 + l);
                long l4 = l;
                System.arraycopy(arg1, n8 * n2, byArray5, 0, n2);
                while (l4 < (long)n39) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray5, 0, byArray5.length);
                    sprzgb sprzgb11 = this;
                    byArray5 = new byte[sprzgb11.cfr_renamed_4.cfr_renamed_1218()];
                    sprzgb11.cfr_renamed_4.cfr_renamed_1219(byArray5, 0);
                    l4 = ++l;
                }
                System.arraycopy(byArray5, 0, byArray2, n8++ * n2, n2);
            }
            n7 = (n3 << this.cfr_renamed_3) - n7;
            int n46 = n34 = 0;
            while (n46 < n4) {
                long l5 = n7 & n39;
                System.arraycopy(arg1, n8 * n2, byArray5, 0, n2);
                while (l5 < (long)n39) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray5, 0, byArray5.length);
                    sprzgb sprzgb12 = this;
                    byArray5 = new byte[sprzgb12.cfr_renamed_4.cfr_renamed_1218()];
                    sprzgb12.cfr_renamed_4.cfr_renamed_1219(byArray5, 0);
                    l5 = ++l;
                }
                System.arraycopy(byArray5, 0, byArray2, n8 * n2, n2);
                ++n8;
                n7 >>>= this.cfr_renamed_3;
                n46 = n34 + this.cfr_renamed_3;
            }
        }
        byte[] byArray6 = new byte[n2];
        this.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprzgb sprzgb13 = this;
        byArray6 = new byte[sprzgb13.cfr_renamed_4.cfr_renamed_1218()];
        sprzgb13.cfr_renamed_4.cfr_renamed_1219(byArray6, 0);
        return byArray6;
    }

    public int cfr_renamed_1368() {
        int n = this.cfr_renamed_4.cfr_renamed_1218();
        int n2 = ((n << 3) + (this.cfr_renamed_3 - 1)) / this.cfr_renamed_3;
        sprzgb sprzgb2 = this;
        int n3 = sprzgb2.cfr_renamed_1366((n2 << sprzgb2.cfr_renamed_3) + 1);
        return n * (n2 += (n3 + this.cfr_renamed_3 - 1) / this.cfr_renamed_3);
    }
}

