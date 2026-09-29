/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprefg;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprrbfa;
import com.spire.presentation.packages.sprt;
import java.math.BigInteger;

public class sprfkd
implements sprh {
    private sprh cfr_renamed_152;
    private static final BigInteger cfr_renamed_112 = BigInteger.valueOf(16L);
    private int cfr_renamed_119;
    private static byte[] cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private static byte[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    public sprfkd(sprh sprh2) {
        sprfkd sprfkd2 = this;
        sprfkd2.cfr_renamed_119 = 0;
        sprfkd2.cfr_renamed_152 = sprh2;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprpjd {
        if (this.cfr_renamed_3) {
            return this.cfr_renamed_3740(arg0, arg1, arg2);
        }
        return this.cfr_renamed_3739(arg0, arg1, arg2);
    }

    private /* synthetic */ byte[] cfr_renamed_3739(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        int n2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        sprfkd sprfkd2 = this;
        byte[] byArray = sprfkd2.cfr_renamed_152.cfr_renamed_1337(arg0, arg1, arg2);
        int n3 = 1;
        int n4 = (sprfkd2.cfr_renamed_4 + 13) / 16;
        BigInteger bigInteger3 = new BigInteger(1, byArray);
        if (bigInteger3.mod(cfr_renamed_112).equals(cfr_renamed_1)) {
            bigInteger = bigInteger2 = bigInteger3;
        } else if (this.cfr_renamed_0.subtract(bigInteger3).mod(cfr_renamed_112).equals(cfr_renamed_1)) {
            bigInteger = bigInteger2 = this.cfr_renamed_0.subtract(bigInteger3);
        } else {
            throw new sprpjd(sprrbfa.cfr_renamed_9("\u0000P\u0001@\u001eA\u001b[\u0015\u0015\u001b[\u0006P\u0015P\u0000\u0015\u001bfRZ\u0000\u0015ZX\u001dQ\u0007Y\u0007FR\u0018R\\!\u001cR\\\u0001\u0015\u001cZ\u0006\u0015\u0011Z\u001cR\u0000@\u0017[\u0006\u0015\u0006ZR\u0003RX\u001dQR\u0004D"));
        }
        byArray = sprfkd.cfr_renamed_3741(bigInteger);
        if ((byArray[byArray.length - 1] & 0xF) != 6) {
            throw new sprpjd(sprefg.cfr_renamed_9("jCuLoDg\reBqNjCd\raTwH#Dm\raAlNh"));
        }
        byArray[byArray.length - 1] = (byte)((byArray[byArray.length - 1] & 0xFF) >>> 4 | cfr_renamed_91[(byArray[byArray.length - 2] & 0xFF) >> 4] << 4);
        byArray[0] = (byte)(cfr_renamed_2[(byArray[1] & 0xFF) >>> 4] << 4 | cfr_renamed_2[byArray[1] & 0xF]);
        boolean bl = false;
        int n5 = 0;
        int n6 = n2 = byArray.length - 1;
        while (n6 >= byArray.length - 2 * n4) {
            n = cfr_renamed_2[(byArray[n2] & 0xFF) >>> 4] << 4 | cfr_renamed_2[byArray[n2] & 0xF];
            if (((byArray[n2 - 1] ^ n) & 0xFF) != 0) {
                if (!bl) {
                    bl = true;
                    n3 = (byArray[n2 - 1] ^ n) & 0xFF;
                    n5 = n2 - 1;
                } else {
                    throw new sprpjd(sprrbfa.cfr_renamed_9("\\\u001cC\u0013Y\u001bQRA\u0001@\u001fFR\\\u001c\u0015\u0010Y\u001dV\u0019"));
                }
            }
            n6 = n2 -= 2;
        }
        byArray[n5] = 0;
        byte[] byArray2 = new byte[(byArray.length - n5) / 2];
        int n7 = n = 0;
        while (n7 < byArray2.length) {
            int n8 = n++;
            byArray2[n8] = byArray[2 * n8 + n5 + 1];
            n7 = n;
        }
        this.cfr_renamed_119 = n3 - 1;
        return byArray2;
    }

    static {
        cfr_renamed_1 = BigInteger.valueOf(6L);
        byte[] byArray = new byte[16];
        byArray[0] = 14;
        byArray[1] = 3;
        byArray[2] = 5;
        byArray[3] = 8;
        byArray[4] = 9;
        byArray[5] = 4;
        byArray[6] = 2;
        byArray[7] = 15;
        byArray[8] = 0;
        byArray[9] = 13;
        byArray[10] = 11;
        byArray[11] = 6;
        byArray[12] = 7;
        byArray[13] = 10;
        byArray[14] = 12;
        byArray[15] = 1;
        cfr_renamed_2 = byArray;
        byte[] byArray2 = new byte[16];
        byArray2[0] = 8;
        byArray2[1] = 15;
        byArray2[2] = 6;
        byArray2[3] = 1;
        byArray2[4] = 5;
        byArray2[5] = 2;
        byArray2[6] = 11;
        byArray2[7] = 12;
        byArray2[8] = 3;
        byArray2[9] = 4;
        byArray2[10] = 13;
        byArray2[11] = 10;
        byArray2[12] = 14;
        byArray2[13] = 9;
        byArray2[14] = 0;
        byArray2[15] = 7;
        cfr_renamed_91 = byArray2;
    }

    public sprh cfr_renamed_2349() {
        return this.cfr_renamed_152;
    }

    public void cfr_renamed_3742(int arg0) {
        if (arg0 > 7) {
            throw new IllegalArgumentException(sprefg.cfr_renamed_9("sLgojYp\r=\r4"));
        }
        this.cfr_renamed_119 = arg0;
    }

    private static /* synthetic */ byte[] cfr_renamed_3741(BigInteger arg0) {
        byte[] byArray = arg0.toByteArray();
        if (byArray[0] == 0) {
            byte[] byArray2 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
            return byArray2;
        }
        return byArray;
    }

    @Override
    public int cfr_renamed_1339() {
        sprfkd sprfkd2 = this;
        int n = sprfkd2.cfr_renamed_152.cfr_renamed_1339();
        if (sprfkd2.cfr_renamed_3) {
            return n;
        }
        return (n + 1) / 2;
    }

    public int cfr_renamed_106() {
        return this.cfr_renamed_119;
    }

    @Override
    public int cfr_renamed_1344() {
        sprfkd sprfkd2 = this;
        int n = sprfkd2.cfr_renamed_152.cfr_renamed_1344();
        if (sprfkd2.cfr_renamed_3) {
            return (n + 1) / 2;
        }
        return n;
    }

    private /* synthetic */ byte[] cfr_renamed_3740(byte[] arg0, int arg1, int arg2) throws sprpjd {
        sprfkd sprfkd2;
        byte by;
        int n;
        sprfkd sprfkd3 = this;
        byte[] byArray = new byte[(sprfkd3.cfr_renamed_4 + 7) / 8];
        int n2 = sprfkd3.cfr_renamed_119 + 1;
        int n3 = arg2;
        int n4 = (sprfkd3.cfr_renamed_4 + 13) / 16;
        int n5 = n = 0;
        while (n5 < n4) {
            int n6;
            if (n > n4 - n3) {
                System.arraycopy(arg0, arg1 + arg2 - (n4 - n), byArray, byArray.length - n4, n4 - n);
                n6 = n;
            } else {
                System.arraycopy(arg0, arg1, byArray, byArray.length - (n + n3), n3);
                n6 = n;
            }
            n5 = n6 + n3;
        }
        int n7 = n = byArray.length - 2 * n4;
        while (n7 != byArray.length) {
            by = byArray[byArray.length - n4 + n / 2];
            byArray[n] = (byte)(cfr_renamed_2[(by & 0xFF) >>> 4] << 4 | cfr_renamed_2[by & 0xF]);
            int n8 = n + 1;
            byArray[n8] = by;
            n7 = n += 2;
        }
        byte[] byArray2 = byArray;
        int n9 = byArray.length - 2 * n3;
        byArray2[n9] = (byte)(byArray2[n9] ^ n2);
        byArray[byArray.length - 1] = (byte)(byArray[byArray.length - 1] << 4 | 6);
        n = 8 - (this.cfr_renamed_4 - 1) % 8;
        by = 0;
        if (n != 8) {
            sprfkd2 = this;
            byte[] byArray3 = byArray;
            byte[] byArray4 = byArray;
            byArray3[0] = (byte)(byArray3[0] & 255 >>> n);
            byArray4[0] = (byte)(byArray4[0] | 128 >>> n);
        } else {
            byArray[0] = 0;
            byArray[1] = (byte)(byArray[1] | 0x80);
            by = 1;
            sprfkd2 = this;
        }
        return sprfkd2.cfr_renamed_152.cfr_renamed_1337(byArray, by, byArray.length - by);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprfkd sprfkd2;
        sprmtc sprmtc2 = null;
        if (arg1 instanceof spraed) {
            sprmtc2 = (sprmtc)((spraed)arg1).cfr_renamed_284();
            sprfkd2 = this;
        } else {
            sprmtc2 = (sprmtc)arg1;
            sprfkd2 = this;
        }
        sprfkd2.cfr_renamed_152.cfr_renamed_1217(arg0, arg1);
        this.cfr_renamed_0 = sprmtc2.cfr_renamed_2295();
        this.cfr_renamed_4 = this.cfr_renamed_0.bitLength();
        this.cfr_renamed_3 = arg0;
    }
}

