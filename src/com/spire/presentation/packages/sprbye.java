/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprihf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqwe;
import java.security.SecureRandom;

public class sprbye {
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private short[][][] cfr_renamed_0;
    private short[][] cfr_renamed_1;
    private int cfr_renamed_2;
    private short[] cfr_renamed_3;
    private short[][][] cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprbye)) {
            return false;
        }
        sprbye sprbye2 = (sprbye)arg0;
        return this.cfr_renamed_119 == sprbye2.cfr_renamed_1139() && this.cfr_renamed_2 == sprbye2.cfr_renamed_1290() && this.cfr_renamed_91 == sprbye2.cfr_renamed_1292() && sprihf.cfr_renamed_1263(this.cfr_renamed_4, sprbye2.cfr_renamed_1305()) && sprihf.cfr_renamed_1263(this.cfr_renamed_0, sprbye2.cfr_renamed_1306()) && sprihf.cfr_renamed_1230(this.cfr_renamed_1, sprbye2.cfr_renamed_1307()) && sprihf.cfr_renamed_1231(this.cfr_renamed_3, sprbye2.cfr_renamed_1308());
    }

    /*
     * WARNING - void declaration
     */
    public sprbye(int n, int n2, SecureRandom secureRandom) {
        void arg2;
        int n3;
        int n4;
        int n5;
        this.cfr_renamed_119 = n;
        this.cfr_renamed_2 = n2;
        this.cfr_renamed_91 = n2 - n;
        this.cfr_renamed_4 = new short[this.cfr_renamed_91][this.cfr_renamed_91][this.cfr_renamed_119];
        sprbye sprbye2 = this;
        this.cfr_renamed_0 = new short[sprbye2.cfr_renamed_91][sprbye2.cfr_renamed_119][this.cfr_renamed_119];
        this.cfr_renamed_1 = new short[this.cfr_renamed_91][this.cfr_renamed_2];
        sprbye sprbye3 = this;
        sprbye3.cfr_renamed_3 = new short[sprbye3.cfr_renamed_91];
        int n6 = sprbye3.cfr_renamed_91;
        int n7 = n5 = 0;
        while (n7 < n6) {
            int n8 = n4 = 0;
            while (n8 < this.cfr_renamed_91) {
                int n9 = n3 = 0;
                while (n9 < this.cfr_renamed_119) {
                    this.cfr_renamed_4[n5][n4][n3++] = (short)(arg2.nextInt() & 0xFF);
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
                    this.cfr_renamed_0[n5][n4][n3++] = (short)(arg2.nextInt() & 0xFF);
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
                this.cfr_renamed_1[n5][n4++] = (short)(arg2.nextInt() & 0xFF);
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

    public short[][] cfr_renamed_1293(short[] arg0) {
        int n;
        int n2;
        int n3;
        short s = 0;
        sprbye sprbye2 = this;
        short[][] sArray = new short[sprbye2.cfr_renamed_91][sprbye2.cfr_renamed_91 + 1];
        short[] sArray2 = new short[this.cfr_renamed_91];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_91) {
            int n5 = n2 = 0;
            while (n5 < this.cfr_renamed_119) {
                int n6 = n = 0;
                while (n6 < this.cfr_renamed_119) {
                    s = sprqwe.cfr_renamed_1275(this.cfr_renamed_0[n3][n2][n], arg0[n2]);
                    s = sprqwe.cfr_renamed_1275(s, arg0[n]);
                    sArray2[n3] = sprqwe.cfr_renamed_1274(sArray2[n3], s);
                    n6 = ++n;
                }
                n5 = ++n2;
            }
            n4 = ++n3;
        }
        int n7 = n3 = 0;
        while (n7 < this.cfr_renamed_91) {
            int n8 = n2 = 0;
            while (n8 < this.cfr_renamed_91) {
                int n9 = n = 0;
                while (n9 < this.cfr_renamed_119) {
                    s = sprqwe.cfr_renamed_1275(this.cfr_renamed_4[n3][n2][n], arg0[n]);
                    int n10 = n2;
                    sArray[n3][n10] = sprqwe.cfr_renamed_1274(sArray[n3][n10], s);
                    n9 = ++n;
                }
                n8 = ++n2;
            }
            n7 = ++n3;
        }
        int n11 = n3 = 0;
        while (n11 < this.cfr_renamed_91) {
            int n12 = n2 = 0;
            while (n12 < this.cfr_renamed_119) {
                s = sprqwe.cfr_renamed_1275(this.cfr_renamed_1[n3][n2], arg0[n2]);
                sArray2[n3] = sprqwe.cfr_renamed_1274(sArray2[n3], s);
                n12 = ++n2;
            }
            n11 = ++n3;
        }
        int n13 = n3 = 0;
        while (n13 < this.cfr_renamed_91) {
            int n14 = this.cfr_renamed_119;
            while (n14 < this.cfr_renamed_2) {
                int n15 = n2 - this.cfr_renamed_119;
                short s2 = sprqwe.cfr_renamed_1274(this.cfr_renamed_1[n3][n2], sArray[n3][n2 - this.cfr_renamed_119]);
                sArray[n3][n15] = s2;
                n14 = ++n2;
            }
            n13 = ++n3;
        }
        int n16 = n3 = 0;
        while (n16 < this.cfr_renamed_91) {
            sArray2[++n3] = sprqwe.cfr_renamed_1274(sArray2[n3], this.cfr_renamed_3[n3]);
            n16 = n3;
        }
        int n17 = n3 = 0;
        while (n17 < this.cfr_renamed_91) {
            short[] sArray3 = sArray[n3];
            short s3 = sArray2[n3];
            sArray3[this.cfr_renamed_91] = s3;
            n17 = ++n3;
        }
        return sArray;
    }

    public int cfr_renamed_1139() {
        return this.cfr_renamed_119;
    }

    public int cfr_renamed_1290() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbye(byte by, byte by2, short[][][] sArray, short[][][] sArray2, short[][] sArray3, short[] sArray4) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbye sprbye2 = this;
        sprbye sprbye3 = this;
        this.cfr_renamed_119 = arg0 & 0xFF;
        this.cfr_renamed_2 = arg1 & 0xFF;
        this.cfr_renamed_91 = this.cfr_renamed_2 - this.cfr_renamed_119;
        sprbye3.cfr_renamed_4 = arg2;
        sprbye3.cfr_renamed_0 = arg3;
        sprbye2.cfr_renamed_1 = arg4;
        sprbye2.cfr_renamed_3 = sArray4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3;
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 1 << 3 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public short[][][] cfr_renamed_1305() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        int n = this.cfr_renamed_119;
        n = n * 37 + this.cfr_renamed_2;
        n = n * 37 + this.cfr_renamed_91;
        n = n * 37 + sproze.cfr_renamed_545(this.cfr_renamed_4);
        n = n * 37 + sproze.cfr_renamed_545(this.cfr_renamed_0);
        n = n * 37 + sproze.cfr_renamed_517(this.cfr_renamed_1);
        n = n * 37 + sproze.cfr_renamed_518(this.cfr_renamed_3);
        return n;
    }

    public short[][] cfr_renamed_1307() {
        return this.cfr_renamed_1;
    }

    public short[][][] cfr_renamed_1306() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_1292() {
        return this.cfr_renamed_91;
    }

    public short[] cfr_renamed_1308() {
        return this.cfr_renamed_3;
    }
}

