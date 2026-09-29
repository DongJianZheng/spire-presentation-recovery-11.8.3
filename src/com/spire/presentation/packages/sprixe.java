/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraze;
import com.spire.presentation.packages.sprgf;

public class sprixe {
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[][] cfr_renamed_1;
    private spraze cfr_renamed_2;
    private int cfr_renamed_3;
    private sprgf cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_5635(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 < 1) {
            System.arraycopy(this.cfr_renamed_1[arg0], 0, arg2, arg3, this.cfr_renamed_112);
            return;
        }
        sprixe sprixe2 = this;
        sprixe2.cfr_renamed_4.cfr_renamed_1197(sprixe2.cfr_renamed_1[arg0], 0, this.cfr_renamed_112);
        sprixe2.cfr_renamed_4.cfr_renamed_1219(arg2, arg3);
        while (--arg1 > 0) {
            sprixe sprixe3 = this;
            sprixe3.cfr_renamed_4.cfr_renamed_1197(arg2, arg3, this.cfr_renamed_112);
            sprixe3.cfr_renamed_4.cfr_renamed_1219(arg2, arg3);
        }
    }

    public byte[] cfr_renamed_1157() {
        int n;
        sprixe sprixe2 = this;
        byte[] byArray = new byte[sprixe2.cfr_renamed_119 * sprixe2.cfr_renamed_112];
        int n2 = 0;
        int n3 = (1 << this.cfr_renamed_3) - 1;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_119) {
            this.cfr_renamed_5635(n, n3, byArray, n2);
            n2 += this.cfr_renamed_112;
            n4 = ++n;
        }
        this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
        sprixe sprixe3 = this;
        byte[] byArray2 = new byte[sprixe3.cfr_renamed_112];
        sprixe3.cfr_renamed_4.cfr_renamed_1219(byArray2, 0);
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public byte[] cfr_renamed_1371(byte[] byArray) {
        byte[] byArray2;
        block18: {
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
            block19: {
                long l3;
                int n8;
                int n9;
                block17: {
                    int n10;
                    void arg0;
                    sprixe sprixe2 = this;
                    sprixe sprixe3 = this;
                    byArray2 = new byte[sprixe2.cfr_renamed_119 * sprixe3.cfr_renamed_112];
                    byArray3 = new byte[sprixe2.cfr_renamed_112];
                    n7 = 0;
                    n6 = 0;
                    n9 = 0;
                    void v2 = arg0;
                    sprixe3.cfr_renamed_4.cfr_renamed_1197((byte[])v2, 0, ((void)v2).length);
                    this.cfr_renamed_4.cfr_renamed_1219(byArray3, 0);
                    if (8 % this.cfr_renamed_3 != 0) break block17;
                    int n11 = 8 / this.cfr_renamed_3;
                    int n12 = (1 << this.cfr_renamed_3) - 1;
                    int n13 = n10 = 0;
                    while (n13 < byArray3.length) {
                        int n14;
                        int n15 = n14 = 0;
                        while (n15 < n11) {
                            n9 = byArray3[n10] & n12;
                            n6 += n9;
                            int n16 = n7++;
                            this.cfr_renamed_5635(n16, n9, byArray2, n16 * this.cfr_renamed_112);
                            byArray3[n10] = (byte)(byArray3[n10] >>> this.cfr_renamed_3);
                            n15 = ++n14;
                        }
                        n13 = ++n10;
                    }
                    sprixe sprixe4 = this;
                    n6 = (sprixe4.cfr_renamed_91 << sprixe4.cfr_renamed_3) - n6;
                    int n17 = n10 = 0;
                    while (n17 < this.cfr_renamed_0) {
                        n9 = n6 & n12;
                        int n18 = n7++;
                        this.cfr_renamed_5635(n18, n9, byArray2, n18 * this.cfr_renamed_112);
                        n6 >>>= this.cfr_renamed_3;
                        n17 = n10 + this.cfr_renamed_3;
                    }
                    break block18;
                }
                if (this.cfr_renamed_3 >= 8) break block19;
                sprixe sprixe5 = this;
                int n19 = sprixe5.cfr_renamed_112 / sprixe5.cfr_renamed_3;
                int n20 = (1 << this.cfr_renamed_3) - 1;
                int n21 = 0;
                int n22 = n8 = 0;
                while (n22 < n19) {
                    int n23;
                    l3 = 0L;
                    int n24 = n23 = 0;
                    while (n24 < this.cfr_renamed_3) {
                        int n25 = (byArray3[n21] & 0xFF) << (n23 << 3);
                        ++n21;
                        l3 ^= (long)n25;
                        n24 = ++n23;
                    }
                    int n26 = n23 = 0;
                    while (n26 < 8) {
                        n9 = (int)l3 & n20;
                        n6 += n9;
                        int n27 = n7++;
                        this.cfr_renamed_5635(n27, n9, byArray2, n27 * this.cfr_renamed_112);
                        l3 >>>= this.cfr_renamed_3;
                        n26 = ++n23;
                    }
                    n22 = ++n8;
                }
                sprixe sprixe6 = this;
                n19 = sprixe6.cfr_renamed_112 % sprixe6.cfr_renamed_3;
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
                    n9 = (int)l3 & n20;
                    n6 += n9;
                    int n31 = n7++;
                    this.cfr_renamed_5635(n31, n9, byArray2, n31 * this.cfr_renamed_112);
                    l3 >>>= this.cfr_renamed_3;
                    n30 = n8 + this.cfr_renamed_3;
                }
                sprixe sprixe7 = this;
                n6 = (sprixe7.cfr_renamed_91 << sprixe7.cfr_renamed_3) - n6;
                int n32 = n8 = 0;
                while (n32 < this.cfr_renamed_0) {
                    n9 = n6 & n20;
                    int n33 = n7++;
                    this.cfr_renamed_5635(n33, n9, byArray2, n33 * this.cfr_renamed_112);
                    n6 >>>= this.cfr_renamed_3;
                    n32 = n8 + this.cfr_renamed_3;
                }
                break block18;
            }
            if (this.cfr_renamed_3 >= 57) break block18;
            int n34 = (this.cfr_renamed_112 << 3) - this.cfr_renamed_3;
            sprixe sprixe8 = this;
            int n35 = (1 << sprixe8.cfr_renamed_3) - 1;
            byte[] byArray4 = new byte[sprixe8.cfr_renamed_112];
            int n36 = n5 = 0;
            while (n36 <= n34) {
                n4 = n5 >>> 3;
                n3 = n5 % 8;
                int n37 = (n5 += this.cfr_renamed_3) + 7 >>> 3;
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
                System.arraycopy(this.cfr_renamed_1[n7], 0, byArray4, 0, this.cfr_renamed_112);
                while (l4 > 0L) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray4, 0, byArray4.length);
                    this.cfr_renamed_4.cfr_renamed_1219(byArray4, 0);
                    l4 = --l;
                }
                int n40 = n7 * this.cfr_renamed_112;
                ++n7;
                System.arraycopy(byArray4, 0, byArray2, n40, this.cfr_renamed_112);
                n36 = n5;
            }
            n4 = n5 >>> 3;
            if (n4 < this.cfr_renamed_112) {
                n3 = n5 % 8;
                l2 = 0L;
                n2 = 0;
                int n41 = n = n4;
                while (n41 < this.cfr_renamed_112) {
                    int n42 = (byArray3[n] & 0xFF) << (n2 << 3);
                    ++n2;
                    l2 ^= (long)n42;
                    n41 = ++n;
                }
                l = (l2 >>>= n3) & (long)n35;
                n6 = (int)((long)n6 + l);
                long l5 = l;
                System.arraycopy(this.cfr_renamed_1[n7], 0, byArray4, 0, this.cfr_renamed_112);
                while (l5 > 0L) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray4, 0, byArray4.length);
                    this.cfr_renamed_4.cfr_renamed_1219(byArray4, 0);
                    l5 = --l;
                }
                int n43 = n7 * this.cfr_renamed_112;
                ++n7;
                System.arraycopy(byArray4, 0, byArray2, n43, this.cfr_renamed_112);
            }
            sprixe sprixe9 = this;
            n6 = (sprixe9.cfr_renamed_91 << sprixe9.cfr_renamed_3) - n6;
            int n44 = n = 0;
            while (n44 < this.cfr_renamed_0) {
                long l6 = n6 & n35;
                System.arraycopy(this.cfr_renamed_1[n7], 0, byArray4, 0, this.cfr_renamed_112);
                while (l6 > 0L) {
                    this.cfr_renamed_4.cfr_renamed_1197(byArray4, 0, byArray4.length);
                    this.cfr_renamed_4.cfr_renamed_1219(byArray4, 0);
                    l6 = --l;
                }
                System.arraycopy(byArray4, 0, byArray2, n7 * this.cfr_renamed_112, this.cfr_renamed_112);
                ++n7;
                n6 >>>= this.cfr_renamed_3;
                n44 = n + this.cfr_renamed_3;
            }
        }
        return byArray2;
    }

    public sprixe(byte[] arg0, sprgf arg1, int arg2) {
        int n;
        sprixe sprixe2 = this;
        sprixe sprixe3 = this;
        sprixe3.cfr_renamed_3 = arg2;
        sprixe3.cfr_renamed_4 = arg1;
        sprixe2.cfr_renamed_2 = new spraze(this.cfr_renamed_4);
        sprixe2.cfr_renamed_112 = this.cfr_renamed_4.cfr_renamed_1218();
        sprixe2.cfr_renamed_91 = ((sprixe2.cfr_renamed_112 << 3) + arg2 - 1) / arg2;
        sprixe2.cfr_renamed_0 = sprixe2.cfr_renamed_1366((sprixe2.cfr_renamed_91 << arg2) + 1);
        sprixe2.cfr_renamed_119 = sprixe2.cfr_renamed_91 + (this.cfr_renamed_0 + arg2 - 1) / arg2;
        sprixe2.cfr_renamed_1 = new byte[sprixe2.cfr_renamed_119][];
        byte[] byArray = new byte[this.cfr_renamed_112];
        System.arraycopy(arg0, 0, byArray, 0, byArray.length);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119) {
            this.cfr_renamed_1[n++] = this.cfr_renamed_2.cfr_renamed_1370(byArray);
            n2 = n;
        }
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

    public byte[][] cfr_renamed_1369() {
        return this.cfr_renamed_1;
    }
}

