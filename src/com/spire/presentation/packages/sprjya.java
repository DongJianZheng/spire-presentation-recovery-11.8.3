/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddb;
import com.spire.presentation.packages.spriya;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprjya {
    private int cfr_renamed_119;
    private short[][][] cfr_renamed_91;
    private int cfr_renamed_0;
    private short[][][] cfr_renamed_1;
    private int cfr_renamed_2;
    private short[] cfr_renamed_3;
    private short[][] cfr_renamed_4;

    public int cfr_renamed_1290() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_1292() {
        return this.cfr_renamed_0;
    }

    public short[] cfr_renamed_1308() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprjya(byte by, byte by2, short[][][] sArray, short[][][] sArray2, short[][] sArray3, short[] sArray4) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjya sprjya2 = this;
        sprjya sprjya3 = this;
        this.cfr_renamed_119 = arg0 & 0xFF;
        this.cfr_renamed_2 = arg1 & 0xFF;
        this.cfr_renamed_0 = this.cfr_renamed_2 - this.cfr_renamed_119;
        sprjya3.cfr_renamed_91 = arg2;
        sprjya3.cfr_renamed_1 = arg3;
        sprjya2.cfr_renamed_4 = arg4;
        sprjya2.cfr_renamed_3 = sArray4;
    }

    /*
     * WARNING - void declaration
     */
    public sprjya(int n, int n2, SecureRandom secureRandom) {
        void arg2;
        int n3;
        int n4;
        int n5;
        this.cfr_renamed_119 = n;
        this.cfr_renamed_2 = n2;
        this.cfr_renamed_0 = n2 - n;
        this.cfr_renamed_91 = new short[this.cfr_renamed_0][this.cfr_renamed_0][this.cfr_renamed_119];
        sprjya sprjya2 = this;
        this.cfr_renamed_1 = new short[sprjya2.cfr_renamed_0][sprjya2.cfr_renamed_119][this.cfr_renamed_119];
        this.cfr_renamed_4 = new short[this.cfr_renamed_0][this.cfr_renamed_2];
        sprjya sprjya3 = this;
        sprjya3.cfr_renamed_3 = new short[sprjya3.cfr_renamed_0];
        int n6 = sprjya3.cfr_renamed_0;
        int n7 = n5 = 0;
        while (n7 < n6) {
            int n8 = n4 = 0;
            while (n8 < this.cfr_renamed_0) {
                int n9 = n3 = 0;
                while (n9 < this.cfr_renamed_119) {
                    this.cfr_renamed_91[n5][n4][n3++] = (short)(arg2.nextInt() & 0xFF);
                    n9 = n3;
                }
                n8 = ++n4;
            }
            n7 = ++n5;
        }
        int n10 = n5 = 0;
        while (n10 < n6) {
            int n11 = n4 = 0;
            while (n11 < this.cfr_renamed_119) {
                int n12 = n3 = 0;
                while (n12 < this.cfr_renamed_119) {
                    this.cfr_renamed_1[n5][n4][n3++] = (short)(arg2.nextInt() & 0xFF);
                    n12 = n3;
                }
                n11 = ++n4;
            }
            n10 = ++n5;
        }
        int n13 = n5 = 0;
        while (n13 < n6) {
            int n14 = n4 = 0;
            while (n14 < this.cfr_renamed_2) {
                this.cfr_renamed_4[n5][n4++] = (short)(arg2.nextInt() & 0xFF);
                n14 = n4;
            }
            n13 = ++n5;
        }
        int n15 = n5 = 0;
        while (n15 < n6) {
            this.cfr_renamed_3[n5++] = (short)(arg2.nextInt() & 0xFF);
            n15 = n5;
        }
    }

    public short[][][] cfr_renamed_1305() {
        return this.cfr_renamed_91;
    }

    public short[][][] cfr_renamed_1306() {
        return this.cfr_renamed_1;
    }

    public int hashCode() {
        int n = this.cfr_renamed_119;
        n = n * 37 + this.cfr_renamed_2;
        n = n * 37 + this.cfr_renamed_0;
        n = n * 37 + sprzra.cfr_renamed_545(this.cfr_renamed_91);
        n = n * 37 + sprzra.cfr_renamed_545(this.cfr_renamed_1);
        n = n * 37 + sprzra.cfr_renamed_517(this.cfr_renamed_4);
        n = n * 37 + sprzra.cfr_renamed_518(this.cfr_renamed_3);
        return n;
    }

    public short[][] cfr_renamed_1307() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprjya)) {
            return false;
        }
        sprjya sprjya2 = (sprjya)arg0;
        return this.cfr_renamed_119 == sprjya2.cfr_renamed_1139() && this.cfr_renamed_2 == sprjya2.cfr_renamed_1290() && this.cfr_renamed_0 == sprjya2.cfr_renamed_1292() && spriya.cfr_renamed_1263(this.cfr_renamed_91, sprjya2.cfr_renamed_1305()) && spriya.cfr_renamed_1263(this.cfr_renamed_1, sprjya2.cfr_renamed_1306()) && spriya.cfr_renamed_1230(this.cfr_renamed_4, sprjya2.cfr_renamed_1307()) && spriya.cfr_renamed_1231(this.cfr_renamed_3, sprjya2.cfr_renamed_1308());
    }

    public int cfr_renamed_1139() {
        return this.cfr_renamed_119;
    }

    public short[][] cfr_renamed_1293(short[] arg0) {
        int n;
        int n2;
        int n3;
        short s = 0;
        sprjya sprjya2 = this;
        short[][] sArray = new short[sprjya2.cfr_renamed_0][sprjya2.cfr_renamed_0 + 1];
        short[] sArray2 = new short[this.cfr_renamed_0];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_0) {
            int n5 = n2 = 0;
            while (n5 < this.cfr_renamed_119) {
                int n6 = n = 0;
                while (n6 < this.cfr_renamed_119) {
                    s = sprddb.cfr_renamed_1275(this.cfr_renamed_1[n3][n2][n], arg0[n2]);
                    s = sprddb.cfr_renamed_1275(s, arg0[n]);
                    sArray2[n3] = sprddb.cfr_renamed_1274(sArray2[n3], s);
                    n6 = ++n;
                }
                n5 = ++n2;
            }
            n4 = ++n3;
        }
        int n7 = n3 = 0;
        while (n7 < this.cfr_renamed_0) {
            int n8 = n2 = 0;
            while (n8 < this.cfr_renamed_0) {
                int n9 = n = 0;
                while (n9 < this.cfr_renamed_119) {
                    s = sprddb.cfr_renamed_1275(this.cfr_renamed_91[n3][n2][n], arg0[n]);
                    int n10 = n2;
                    sArray[n3][n10] = sprddb.cfr_renamed_1274(sArray[n3][n10], s);
                    n9 = ++n;
                }
                n8 = ++n2;
            }
            n7 = ++n3;
        }
        int n11 = n3 = 0;
        while (n11 < this.cfr_renamed_0) {
            int n12 = n2 = 0;
            while (n12 < this.cfr_renamed_119) {
                s = sprddb.cfr_renamed_1275(this.cfr_renamed_4[n3][n2], arg0[n2]);
                sArray2[n3] = sprddb.cfr_renamed_1274(sArray2[n3], s);
                n12 = ++n2;
            }
            n11 = ++n3;
        }
        int n13 = n3 = 0;
        while (n13 < this.cfr_renamed_0) {
            int n14 = this.cfr_renamed_119;
            while (n14 < this.cfr_renamed_2) {
                int n15 = n2 - this.cfr_renamed_119;
                short s2 = sprddb.cfr_renamed_1274(this.cfr_renamed_4[n3][n2], sArray[n3][n2 - this.cfr_renamed_119]);
                sArray[n3][n15] = s2;
                n14 = ++n2;
            }
            n13 = ++n3;
        }
        int n16 = n3 = 0;
        while (n16 < this.cfr_renamed_0) {
            sArray2[++n3] = sprddb.cfr_renamed_1274(sArray2[n3], this.cfr_renamed_3[n3]);
            n16 = n3;
        }
        int n17 = n3 = 0;
        while (n17 < this.cfr_renamed_0) {
            short[] sArray3 = sArray[n3];
            short s3 = sArray2[n3];
            sArray3[this.cfr_renamed_0] = s3;
            n17 = ++n3;
        }
        return sArray;
    }
}

