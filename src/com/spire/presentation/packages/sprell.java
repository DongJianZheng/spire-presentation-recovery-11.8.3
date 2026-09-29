/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzda;
import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwjl;
import java.io.ByteArrayOutputStream;

public class sprell
implements sprgf {
    private int cfr_renamed_114;
    private int cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private int cfr_renamed_137;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private int cfr_renamed_132;
    private byte[][] cfr_renamed_102;
    private byte[] cfr_renamed_93;
    private int cfr_renamed_86;
    private byte[][] cfr_renamed_152;
    private int cfr_renamed_112;
    private byte[][] cfr_renamed_119;
    private final int cfr_renamed_91 = 16;
    private ByteArrayOutputStream cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_10350(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n;
            byte by = (byte)(this.cfr_renamed_105[n3] ^ arg0[n + arg1]);
            this.cfr_renamed_105[n3] = by;
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_0.write(arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprgzda.cfr_renamed_9("\b\r\u0011\u0016\u0015C\u0003\u0016\u0007\u0005\u0004\u0011A\u0017\u000e\fA\u0010\t\f\u0013\u0017"));
        }
        this.cfr_renamed_0.write(arg0, arg1, arg2);
    }

    public sprell() {
        sprell sprell2 = this;
        sprell sprell3 = this;
        sprell sprell4 = this;
        sprell sprell5 = this;
        sprell sprell6 = this;
        sprell sprell7 = this;
        sprell sprell8 = this;
        sprell sprell9 = this;
        sprell9.cfr_renamed_0 = new ByteArrayOutputStream();
        sprell8.cfr_renamed_91 = 16;
        sprell8.cfr_renamed_1 = 4;
        sprell7.cfr_renamed_132 = 16;
        sprell7.cfr_renamed_114 = 32;
        sprell6.cfr_renamed_4 = 32;
        sprell6.cfr_renamed_96 = 5;
        sprell5.cfr_renamed_79 = 12;
        sprell5.cfr_renamed_137 = 8;
        sprell4.cfr_renamed_112 = 3;
        sprell4.cfr_renamed_107 = 7;
        sprell3.cfr_renamed_3 = 64;
        sprell3.cfr_renamed_2 = 4;
        sprell2.cfr_renamed_86 = 3;
        byte[][] byArrayArray = new byte[8][];
        byte[] byArray = new byte[12];
        byArray[0] = 1;
        byArray[1] = 3;
        byArray[2] = 7;
        byArray[3] = 14;
        byArray[4] = 13;
        byArray[5] = 11;
        byArray[6] = 6;
        byArray[7] = 12;
        byArray[8] = 9;
        byArray[9] = 2;
        byArray[10] = 5;
        byArray[11] = 10;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[12];
        byArray2[0] = 0;
        byArray2[1] = 2;
        byArray2[2] = 6;
        byArray2[3] = 15;
        byArray2[4] = 12;
        byArray2[5] = 10;
        byArray2[6] = 7;
        byArray2[7] = 13;
        byArray2[8] = 8;
        byArray2[9] = 3;
        byArray2[10] = 4;
        byArray2[11] = 11;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[12];
        byArray3[0] = 2;
        byArray3[1] = 0;
        byArray3[2] = 4;
        byArray3[3] = 13;
        byArray3[4] = 14;
        byArray3[5] = 8;
        byArray3[6] = 5;
        byArray3[7] = 15;
        byArray3[8] = 10;
        byArray3[9] = 1;
        byArray3[10] = 6;
        byArray3[11] = 9;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[12];
        byArray4[0] = 6;
        byArray4[1] = 4;
        byArray4[2] = 0;
        byArray4[3] = 9;
        byArray4[4] = 10;
        byArray4[5] = 12;
        byArray4[6] = 1;
        byArray4[7] = 11;
        byArray4[8] = 14;
        byArray4[9] = 5;
        byArray4[10] = 2;
        byArray4[11] = 13;
        byArrayArray[3] = byArray4;
        byte[] byArray5 = new byte[12];
        byArray5[0] = 14;
        byArray5[1] = 12;
        byArray5[2] = 8;
        byArray5[3] = 1;
        byArray5[4] = 2;
        byArray5[5] = 4;
        byArray5[6] = 9;
        byArray5[7] = 3;
        byArray5[8] = 6;
        byArray5[9] = 13;
        byArray5[10] = 10;
        byArray5[11] = 5;
        byArrayArray[4] = byArray5;
        byte[] byArray6 = new byte[12];
        byArray6[0] = 15;
        byArray6[1] = 13;
        byArray6[2] = 9;
        byArray6[3] = 0;
        byArray6[4] = 3;
        byArray6[5] = 5;
        byArray6[6] = 8;
        byArray6[7] = 2;
        byArray6[8] = 7;
        byArray6[9] = 12;
        byArray6[10] = 11;
        byArray6[11] = 4;
        byArrayArray[5] = byArray6;
        byte[] byArray7 = new byte[12];
        byArray7[0] = 13;
        byArray7[1] = 15;
        byArray7[2] = 11;
        byArray7[3] = 2;
        byArray7[4] = 1;
        byArray7[5] = 7;
        byArray7[6] = 10;
        byArray7[7] = 0;
        byArray7[8] = 5;
        byArray7[9] = 14;
        byArray7[10] = 9;
        byArray7[11] = 6;
        byArrayArray[6] = byArray7;
        byte[] byArray8 = new byte[12];
        byArray8[0] = 9;
        byArray8[1] = 11;
        byArray8[2] = 15;
        byArray8[3] = 6;
        byArray8[4] = 5;
        byArray8[5] = 3;
        byArray8[6] = 14;
        byArray8[7] = 4;
        byArray8[8] = 1;
        byArray8[9] = 10;
        byArray8[10] = 13;
        byArray8[11] = 2;
        byArrayArray[7] = byArray8;
        sprell2.cfr_renamed_102 = byArrayArray;
        byte[][] byArrayArray2 = new byte[8][];
        byte[] byArray9 = new byte[8];
        byArray9[0] = 2;
        byArray9[1] = 4;
        byArray9[2] = 2;
        byArray9[3] = 11;
        byArray9[4] = 2;
        byArray9[5] = 8;
        byArray9[6] = 5;
        byArray9[7] = 6;
        byArrayArray2[0] = byArray9;
        byte[] byArray10 = new byte[8];
        byArray10[0] = 12;
        byArray10[1] = 9;
        byArray10[2] = 8;
        byArray10[3] = 13;
        byArray10[4] = 7;
        byArray10[5] = 7;
        byArray10[6] = 5;
        byArray10[7] = 2;
        byArrayArray2[1] = byArray10;
        byte[] byArray11 = new byte[8];
        byArray11[0] = 4;
        byArray11[1] = 4;
        byArray11[2] = 13;
        byArray11[3] = 13;
        byArray11[4] = 9;
        byArray11[5] = 4;
        byArray11[6] = 13;
        byArray11[7] = 9;
        byArrayArray2[2] = byArray11;
        byte[] byArray12 = new byte[8];
        byArray12[0] = 1;
        byArray12[1] = 6;
        byArray12[2] = 5;
        byArray12[3] = 1;
        byArray12[4] = 12;
        byArray12[5] = 13;
        byArray12[6] = 15;
        byArray12[7] = 14;
        byArrayArray2[3] = byArray12;
        byte[] byArray13 = new byte[8];
        byArray13[0] = 15;
        byArray13[1] = 12;
        byArray13[2] = 9;
        byArray13[3] = 13;
        byArray13[4] = 14;
        byArray13[5] = 5;
        byArray13[6] = 14;
        byArray13[7] = 13;
        byArrayArray2[4] = byArray13;
        byte[] byArray14 = new byte[8];
        byArray14[0] = 9;
        byArray14[1] = 14;
        byArray14[2] = 5;
        byArray14[3] = 15;
        byArray14[4] = 4;
        byArray14[5] = 12;
        byArray14[6] = 9;
        byArray14[7] = 6;
        byArrayArray2[5] = byArray14;
        byte[] byArray15 = new byte[8];
        byArray15[0] = 12;
        byArray15[1] = 2;
        byArray15[2] = 2;
        byArray15[3] = 10;
        byArray15[4] = 3;
        byArray15[5] = 1;
        byArray15[6] = 1;
        byArray15[7] = 14;
        byArrayArray2[6] = byArray15;
        byte[] byArray16 = new byte[8];
        byArray16[0] = 15;
        byArray16[1] = 1;
        byArray16[2] = 13;
        byArray16[3] = 10;
        byArray16[4] = 5;
        byArray16[5] = 10;
        byArray16[6] = 2;
        byArray16[7] = 3;
        byArrayArray2[7] = byArray16;
        this.cfr_renamed_119 = byArrayArray2;
        sprell sprell10 = this;
        byte[] byArray17 = new byte[16];
        byArray17[0] = 12;
        byArray17[1] = 5;
        byArray17[2] = 6;
        byArray17[3] = 11;
        byArray17[4] = 9;
        byArray17[5] = 0;
        byArray17[6] = 10;
        byArray17[7] = 13;
        byArray17[8] = 3;
        byArray17[9] = 14;
        byArray17[10] = 15;
        byArray17[11] = 8;
        byArray17[12] = 4;
        byArray17[13] = 7;
        byArray17[14] = 1;
        byArray17[15] = 2;
        sprell10.cfr_renamed_93 = byArray17;
        sprell10.cfr_renamed_105 = new byte[sprell10.cfr_renamed_114];
        sprell10.cfr_renamed_152 = new byte[sprell10.cfr_renamed_137][this.cfr_renamed_137];
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprell sprell2;
        if (32 + arg1 > arg0.length) {
            throw new sprwjl(sprhtc.cfr_renamed_9("/`4e5a`w5s&p25)f`a/z`f(z2a"));
        }
        byte[] byArray = this.cfr_renamed_0.toByteArray();
        int n = byArray.length;
        if (n == 0) {
            sprell sprell3 = this;
            byte[] byArray2 = this.cfr_renamed_105;
            sprell2 = sprell3;
            int n2 = sprell3.cfr_renamed_114 - 1;
            byArray2[n2] = (byte)(byArray2[n2] ^ 1 << this.cfr_renamed_96);
        } else if (n <= 16) {
            sprell sprell4;
            int n3;
            System.arraycopy(byArray, 0, this.cfr_renamed_105, 0, n);
            if (n < 16) {
                int n4 = n;
                this.cfr_renamed_105[n4] = (byte)(this.cfr_renamed_105[n4] ^ 1);
            }
            sprell sprell5 = this;
            byte[] byArray3 = sprell5.cfr_renamed_105;
            int n5 = sprell5.cfr_renamed_114 - 1;
            byte by = byArray3[n5];
            if (n < 16) {
                n3 = 1;
                sprell4 = this;
            } else {
                n3 = 2;
                sprell4 = this;
            }
            byArray3[n5] = (byte)(by ^ n3 << sprell4.cfr_renamed_96);
            sprell2 = this;
        } else {
            sprell sprell6;
            int n6;
            int n7;
            System.arraycopy(byArray, 0, this.cfr_renamed_105, 0, 16);
            int n8 = ((n -= 16) + this.cfr_renamed_1 - 1) / this.cfr_renamed_1;
            int n9 = n7 = 0;
            while (n9 < n8 - 1) {
                sprell sprell7 = this;
                sprell7.cfr_renamed_10349();
                int n10 = 16 + n7 * this.cfr_renamed_1;
                sprell7.cfr_renamed_10350(byArray, n10, this.cfr_renamed_1);
                n9 = ++n7;
            }
            this.cfr_renamed_10349();
            int n11 = n - n7 * this.cfr_renamed_1;
            this.cfr_renamed_10350(byArray, 16 + n7 * this.cfr_renamed_1, n11);
            if (n11 < this.cfr_renamed_1) {
                int n12 = n11;
                this.cfr_renamed_105[n12] = (byte)(this.cfr_renamed_105[n12] ^ 1);
            }
            sprell sprell8 = this;
            byte[] byArray4 = sprell8.cfr_renamed_105;
            int n13 = sprell8.cfr_renamed_114 - 1;
            byte by = byArray4[n13];
            if (n % this.cfr_renamed_1 == 0) {
                n6 = 1;
                sprell6 = this;
            } else {
                n6 = 2;
                sprell6 = this;
            }
            byArray4[n13] = (byte)(by ^ n6 << sprell6.cfr_renamed_96);
            sprell2 = this;
        }
        sprell2.cfr_renamed_10349();
        sprell sprell9 = this;
        System.arraycopy(sprell9.cfr_renamed_105, 0, arg0, arg1, this.cfr_renamed_132);
        sprell9.cfr_renamed_10349();
        sprell sprell10 = this;
        System.arraycopy(sprell9.cfr_renamed_105, 0, arg0, arg1 + this.cfr_renamed_132, sprell10.cfr_renamed_4 - sprell10.cfr_renamed_132);
        return sprell9.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_41() {
        sprell sprell2 = this;
        sprell2.cfr_renamed_0.reset();
        sproze.cfr_renamed_492(sprell2.cfr_renamed_105, (byte)0);
    }

    public void cfr_renamed_10349() {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_3) {
            byte[] byArray = this.cfr_renamed_152[n2 >>> this.cfr_renamed_112];
            int n4 = n2 & this.cfr_renamed_107;
            byte by = (byte)((this.cfr_renamed_105[n2 >> 1] & 0xFF) >>> 4 * (n2 & 1) & 0xF);
            byArray[n4] = by;
            n3 = ++n2;
        }
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_79) {
            int n6;
            int n7 = n2 = 0;
            while (n7 < this.cfr_renamed_137) {
                byte[] byArray = this.cfr_renamed_152[n2];
                byte by = (byte)(byArray[0] ^ this.cfr_renamed_102[n2][n]);
                byArray[0] = by;
                n7 = ++n2;
            }
            int n8 = n2 = 0;
            while (n8 < this.cfr_renamed_137) {
                int n9 = n6 = 0;
                while (n9 < this.cfr_renamed_137) {
                    sprell sprell2 = this;
                    int n10 = n6++;
                    this.cfr_renamed_152[n2][n10] = sprell2.cfr_renamed_93[sprell2.cfr_renamed_152[n2][n10]];
                    n9 = n6;
                }
                n8 = ++n2;
            }
            int n11 = n2 = 1;
            while (n11 < this.cfr_renamed_137) {
                sprell sprell3 = this;
                System.arraycopy(sprell3.cfr_renamed_152[n2], 0, this.cfr_renamed_105, 0, this.cfr_renamed_137);
                sprell sprell4 = this;
                System.arraycopy(sprell3.cfr_renamed_105, n2, sprell4.cfr_renamed_152[n2], 0, this.cfr_renamed_137 - n2);
                System.arraycopy(sprell4.cfr_renamed_105, 0, this.cfr_renamed_152[n2], this.cfr_renamed_137 - n2, n2++);
                n11 = n2;
            }
            int n12 = n6 = 0;
            while (n12 < this.cfr_renamed_137) {
                int n13 = n2 = 0;
                while (n13 < this.cfr_renamed_137) {
                    int n14;
                    byte by = 0;
                    int n15 = n14 = 0;
                    while (n15 < this.cfr_renamed_137) {
                        int n16;
                        sprell sprell5 = this;
                        int n17 = sprell5.cfr_renamed_119[n2][n14];
                        int n18 = 0;
                        byte by2 = sprell5.cfr_renamed_152[n14][n6];
                        int n19 = n16 = 0;
                        while (n19 < this.cfr_renamed_2) {
                            if ((by2 >>> n16 & 1) != 0) {
                                n18 ^= n17;
                            }
                            int n20 = n17;
                            if ((n17 >>> this.cfr_renamed_86 & 1) != 0) {
                                n17 = n20 << 1;
                                n17 ^= 3;
                            } else {
                                n17 = n20 << 1;
                            }
                            n19 = ++n16;
                        }
                        by = (byte)(by ^ n18 & 0xF);
                        n15 = ++n14;
                    }
                    this.cfr_renamed_105[n2++] = by;
                    n13 = n2;
                }
                int n21 = n2 = 0;
                while (n21 < this.cfr_renamed_137) {
                    byte[] byArray = this.cfr_renamed_152[n2];
                    byte by = this.cfr_renamed_105[n2];
                    byArray[n6] = by;
                    n21 = ++n2;
                }
                n12 = ++n6;
            }
            n5 = ++n;
        }
        int n22 = n2 = 0;
        while (n22 < this.cfr_renamed_3) {
            int n23 = n2 >>> 1;
            byte by = (byte)(this.cfr_renamed_152[n2 >>> this.cfr_renamed_112][n2 & this.cfr_renamed_107] & 0xF | (this.cfr_renamed_152[n2 >>> this.cfr_renamed_112][n2 + 1 & this.cfr_renamed_107] & 0xF) << 4);
            this.cfr_renamed_105[n23] = by;
            n22 = n2 += 2;
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_4;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprgzda.cfr_renamed_9("1\u000b\u000e\u0017\u000e\rL!\u0004\u0006\u0015\u000f\u0004C)\u0002\u0012\u000b");
    }
}

