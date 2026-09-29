/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.spruab;

public class sprmbb {
    private int cfr_renamed_112;
    private spruab cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[][] cfr_renamed_1;
    private int cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private int cfr_renamed_4;

    public byte[][] cfr_renamed_1369() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_1157() {
        int n;
        sprmbb sprmbb2 = this;
        byte[] byArray = new byte[this.cfr_renamed_4 * sprmbb2.cfr_renamed_0];
        byte[] byArray2 = new byte[sprmbb2.cfr_renamed_0];
        int n2 = 1 << this.cfr_renamed_2;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4) {
            sprmbb sprmbb3 = this;
            sprmbb3.cfr_renamed_3.cfr_renamed_1197(sprmbb3.cfr_renamed_1[n], 0, this.cfr_renamed_1[n].length);
            sprmbb sprmbb4 = this;
            byArray2 = new byte[sprmbb4.cfr_renamed_3.cfr_renamed_1218()];
            sprmbb4.cfr_renamed_3.cfr_renamed_1219(byArray2, 0);
            int n4 = 2;
            int n5 = n4;
            while (n5 < n2) {
                this.cfr_renamed_3.cfr_renamed_1197(byArray2, 0, byArray2.length);
                sprmbb sprmbb5 = this;
                byArray2 = new byte[sprmbb5.cfr_renamed_3.cfr_renamed_1218()];
                sprmbb5.cfr_renamed_3.cfr_renamed_1219(byArray2, 0);
                n5 = ++n4;
            }
            int n6 = this.cfr_renamed_0 * n;
            System.arraycopy(byArray2, 0, byArray, n6, this.cfr_renamed_0);
            n3 = ++n;
        }
        this.cfr_renamed_3.cfr_renamed_1197(byArray, 0, byArray.length);
        sprmbb sprmbb6 = this;
        byte[] byArray3 = new byte[sprmbb6.cfr_renamed_3.cfr_renamed_1218()];
        sprmbb6.cfr_renamed_3.cfr_renamed_1219(byArray3, 0);
        return byArray3;
    }

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

    public sprmbb(byte[] arg0, sprlc arg1, int arg2) {
        int n;
        sprmbb sprmbb2 = this;
        sprmbb sprmbb3 = this;
        sprmbb3.cfr_renamed_2 = arg2;
        sprmbb3.cfr_renamed_3 = arg1;
        sprmbb2.cfr_renamed_119 = new spruab(this.cfr_renamed_3);
        sprmbb2.cfr_renamed_0 = this.cfr_renamed_3.cfr_renamed_1218();
        sprmbb2.cfr_renamed_112 = (int)Math.ceil((double)(sprmbb2.cfr_renamed_0 << 3) / (double)arg2);
        sprmbb2.cfr_renamed_91 = sprmbb2.cfr_renamed_1366((sprmbb2.cfr_renamed_112 << arg2) + 1);
        sprmbb2.cfr_renamed_4 = sprmbb2.cfr_renamed_112 + (int)Math.ceil((double)this.cfr_renamed_91 / (double)arg2);
        sprmbb2.cfr_renamed_1 = new byte[sprmbb2.cfr_renamed_4][this.cfr_renamed_0];
        byte[] byArray = new byte[this.cfr_renamed_0];
        System.arraycopy(arg0, 0, byArray, 0, byArray.length);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_1[n++] = this.cfr_renamed_119.cfr_renamed_1370(byArray);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public byte[] cfr_renamed_1371(byte[] byArray) {
        byte[] byArray2;
        block23: {
            long l;
            int n;
            int n2;
            long l2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            byte[] byArray3;
            block24: {
                long l3;
                int n8;
                int n9;
                block22: {
                    int n10;
                    void arg0;
                    sprmbb sprmbb2 = this;
                    sprmbb sprmbb3 = this;
                    byArray2 = new byte[sprmbb2.cfr_renamed_4 * sprmbb3.cfr_renamed_0];
                    byArray3 = new byte[sprmbb2.cfr_renamed_0];
                    n7 = 0;
                    n6 = 0;
                    n9 = 0;
                    void v2 = arg0;
                    sprmbb3.cfr_renamed_3.cfr_renamed_1197((byte[])v2, 0, ((void)v2).length);
                    sprmbb sprmbb4 = this;
                    byArray3 = new byte[sprmbb4.cfr_renamed_3.cfr_renamed_1218()];
                    sprmbb4.cfr_renamed_3.cfr_renamed_1219(byArray3, 0);
                    if (8 % this.cfr_renamed_2 != 0) break block22;
                    int n11 = 8 / this.cfr_renamed_2;
                    int n12 = (1 << this.cfr_renamed_2) - 1;
                    byte[] byArray4 = new byte[this.cfr_renamed_0];
                    int n13 = n10 = 0;
                    while (n13 < byArray3.length) {
                        int n14;
                        int n15 = n14 = 0;
                        while (n15 < n11) {
                            n9 = byArray3[n10] & n12;
                            n6 += n9;
                            System.arraycopy(this.cfr_renamed_1[n7], 0, byArray4, 0, this.cfr_renamed_0);
                            int n16 = n9;
                            while (n16 > 0) {
                                this.cfr_renamed_3.cfr_renamed_1197(byArray4, 0, byArray4.length);
                                sprmbb sprmbb5 = this;
                                byArray4 = new byte[sprmbb5.cfr_renamed_3.cfr_renamed_1218()];
                                sprmbb5.cfr_renamed_3.cfr_renamed_1219(byArray4, 0);
                                n16 = --n9;
                            }
                            System.arraycopy(byArray4, 0, byArray2, n7 * this.cfr_renamed_0, this.cfr_renamed_0);
                            ++n7;
                            byArray3[n10] = (byte)(byArray3[n10] >>> this.cfr_renamed_2);
                            n15 = ++n14;
                        }
                        n13 = ++n10;
                    }
                    sprmbb sprmbb6 = this;
                    n6 = (sprmbb6.cfr_renamed_112 << sprmbb6.cfr_renamed_2) - n6;
                    int n17 = n10 = 0;
                    while (n17 < this.cfr_renamed_91) {
                        int n18 = n6 & n12;
                        System.arraycopy(this.cfr_renamed_1[n7], 0, byArray4, 0, this.cfr_renamed_0);
                        while (n18 > 0) {
                            this.cfr_renamed_3.cfr_renamed_1197(byArray4, 0, byArray4.length);
                            sprmbb sprmbb7 = this;
                            byArray4 = new byte[sprmbb7.cfr_renamed_3.cfr_renamed_1218()];
                            sprmbb7.cfr_renamed_3.cfr_renamed_1219(byArray4, 0);
                            n18 = --n9;
                        }
                        System.arraycopy(byArray4, 0, byArray2, n7 * this.cfr_renamed_0, this.cfr_renamed_0);
                        ++n7;
                        n6 >>>= this.cfr_renamed_2;
                        n17 = n10 + this.cfr_renamed_2;
                    }
                    break block23;
                }
                if (this.cfr_renamed_2 >= 8) break block24;
                sprmbb sprmbb8 = this;
                int n19 = sprmbb8.cfr_renamed_0 / sprmbb8.cfr_renamed_2;
                sprmbb sprmbb9 = this;
                int n20 = (1 << sprmbb9.cfr_renamed_2) - 1;
                byte[] byArray5 = new byte[sprmbb9.cfr_renamed_0];
                int n21 = 0;
                int n22 = n8 = 0;
                while (n22 < n19) {
                    int n23;
                    l3 = 0L;
                    int n24 = n23 = 0;
                    while (n24 < this.cfr_renamed_2) {
                        int n25 = (byArray3[n21] & 0xFF) << (n23 << 3);
                        ++n21;
                        l3 ^= (long)n25;
                        n24 = ++n23;
                    }
                    int n26 = n23 = 0;
                    while (n26 < 8) {
                        n9 = (int)(l3 & (long)n20);
                        n6 += n9;
                        int n27 = n9;
                        System.arraycopy(this.cfr_renamed_1[n7], 0, byArray5, 0, this.cfr_renamed_0);
                        while (n27 > 0) {
                            this.cfr_renamed_3.cfr_renamed_1197(byArray5, 0, byArray5.length);
                            sprmbb sprmbb10 = this;
                            byArray5 = new byte[sprmbb10.cfr_renamed_3.cfr_renamed_1218()];
                            sprmbb10.cfr_renamed_3.cfr_renamed_1219(byArray5, 0);
                            n27 = --n9;
                        }
                        System.arraycopy(byArray5, 0, byArray2, n7 * this.cfr_renamed_0, this.cfr_renamed_0);
                        ++n7;
                        l3 >>>= this.cfr_renamed_2;
                        n26 = ++n23;
                    }
                    n22 = ++n8;
                }
                sprmbb sprmbb11 = this;
                n19 = sprmbb11.cfr_renamed_0 % sprmbb11.cfr_renamed_2;
                l3 = 0L;
                int n28 = n8 = 0;
                while (n28 < n19) {
                    int n29 = (byArray3[n21] & 0xFF) << (n8 << 3);
                    ++n21;
                    l3 ^= (long)n29;
                    n28 = ++n8;
                }
                n19 <<= 3;
                int n30 = n8 = 0;
                while (n30 < n19) {
                    n9 = (int)(l3 & (long)n20);
                    n6 += n9;
                    int n31 = n9;
                    System.arraycopy(this.cfr_renamed_1[n7], 0, byArray5, 0, this.cfr_renamed_0);
                    while (n31 > 0) {
                        this.cfr_renamed_3.cfr_renamed_1197(byArray5, 0, byArray5.length);
                        sprmbb sprmbb12 = this;
                        byArray5 = new byte[sprmbb12.cfr_renamed_3.cfr_renamed_1218()];
                        sprmbb12.cfr_renamed_3.cfr_renamed_1219(byArray5, 0);
                        n31 = --n9;
                    }
                    System.arraycopy(byArray5, 0, byArray2, n7 * this.cfr_renamed_0, this.cfr_renamed_0);
                    ++n7;
                    l3 >>>= this.cfr_renamed_2;
                    n30 = n8 + this.cfr_renamed_2;
                }
                sprmbb sprmbb13 = this;
                n6 = (sprmbb13.cfr_renamed_112 << sprmbb13.cfr_renamed_2) - n6;
                int n32 = n8 = 0;
                while (n32 < this.cfr_renamed_91) {
                    int n33 = n6 & n20;
                    System.arraycopy(this.cfr_renamed_1[n7], 0, byArray5, 0, this.cfr_renamed_0);
                    while (n33 > 0) {
                        this.cfr_renamed_3.cfr_renamed_1197(byArray5, 0, byArray5.length);
                        sprmbb sprmbb14 = this;
                        byArray5 = new byte[sprmbb14.cfr_renamed_3.cfr_renamed_1218()];
                        sprmbb14.cfr_renamed_3.cfr_renamed_1219(byArray5, 0);
                        n33 = --n9;
                    }
                    System.arraycopy(byArray5, 0, byArray2, n7 * this.cfr_renamed_0, this.cfr_renamed_0);
                    ++n7;
                    n6 >>>= this.cfr_renamed_2;
                    n32 = n8 + this.cfr_renamed_2;
                }
                break block23;
            }
            if (this.cfr_renamed_2 >= 57) break block23;
            int n34 = (this.cfr_renamed_0 << 3) - this.cfr_renamed_2;
            sprmbb sprmbb15 = this;
            int n35 = (1 << sprmbb15.cfr_renamed_2) - 1;
            byte[] byArray6 = new byte[sprmbb15.cfr_renamed_0];
            int n36 = n5 = 0;
            while (n36 <= n34) {
                n4 = n5 >>> 3;
                n3 = n5 % 8;
                int n37 = (n5 += this.cfr_renamed_2) + 7 >>> 3;
                l2 = 0L;
                n2 = 0;
                int n38 = n4;
                while (n38 < n37) {
                    int n39 = (byArray3[n] & 0xFF) << (n2 << 3);
                    ++n2;
                    l2 ^= (long)n39;
                    n38 = ++n;
                }
                l = (l2 >>>= n3) & (long)n35;
                n6 = (int)((long)n6 + l);
                long l4 = l;
                System.arraycopy(this.cfr_renamed_1[n7], 0, byArray6, 0, this.cfr_renamed_0);
                while (l4 > 0L) {
                    this.cfr_renamed_3.cfr_renamed_1197(byArray6, 0, byArray6.length);
                    sprmbb sprmbb16 = this;
                    byArray6 = new byte[sprmbb16.cfr_renamed_3.cfr_renamed_1218()];
                    sprmbb16.cfr_renamed_3.cfr_renamed_1219(byArray6, 0);
                    l4 = --l;
                }
                int n40 = n7 * this.cfr_renamed_0;
                ++n7;
                System.arraycopy(byArray6, 0, byArray2, n40, this.cfr_renamed_0);
                n36 = n5;
            }
            n4 = n5 >>> 3;
            if (n4 < this.cfr_renamed_0) {
                n3 = n5 % 8;
                l2 = 0L;
                n2 = 0;
                int n41 = n = n4;
                while (n41 < this.cfr_renamed_0) {
                    int n42 = (byArray3[n] & 0xFF) << (n2 << 3);
                    ++n2;
                    l2 ^= (long)n42;
                    n41 = ++n;
                }
                l = (l2 >>>= n3) & (long)n35;
                n6 = (int)((long)n6 + l);
                long l5 = l;
                System.arraycopy(this.cfr_renamed_1[n7], 0, byArray6, 0, this.cfr_renamed_0);
                while (l5 > 0L) {
                    this.cfr_renamed_3.cfr_renamed_1197(byArray6, 0, byArray6.length);
                    sprmbb sprmbb17 = this;
                    byArray6 = new byte[sprmbb17.cfr_renamed_3.cfr_renamed_1218()];
                    sprmbb17.cfr_renamed_3.cfr_renamed_1219(byArray6, 0);
                    l5 = --l;
                }
                int n43 = n7 * this.cfr_renamed_0;
                ++n7;
                System.arraycopy(byArray6, 0, byArray2, n43, this.cfr_renamed_0);
            }
            sprmbb sprmbb18 = this;
            n6 = (sprmbb18.cfr_renamed_112 << sprmbb18.cfr_renamed_2) - n6;
            int n44 = n = 0;
            while (n44 < this.cfr_renamed_91) {
                long l6 = n6 & n35;
                System.arraycopy(this.cfr_renamed_1[n7], 0, byArray6, 0, this.cfr_renamed_0);
                while (l6 > 0L) {
                    this.cfr_renamed_3.cfr_renamed_1197(byArray6, 0, byArray6.length);
                    sprmbb sprmbb19 = this;
                    byArray6 = new byte[sprmbb19.cfr_renamed_3.cfr_renamed_1218()];
                    sprmbb19.cfr_renamed_3.cfr_renamed_1219(byArray6, 0);
                    l6 = --l;
                }
                System.arraycopy(byArray6, 0, byArray2, n7 * this.cfr_renamed_0, this.cfr_renamed_0);
                ++n7;
                n6 >>>= this.cfr_renamed_2;
                n44 = n + this.cfr_renamed_2;
            }
        }
        return byArray2;
    }
}

