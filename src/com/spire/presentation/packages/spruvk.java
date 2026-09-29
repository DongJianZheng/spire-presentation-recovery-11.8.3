/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfq;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprizk;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrsk;
import com.spire.presentation.packages.sprwil;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spruvk {
    private sprgf cfr_renamed_93;
    private int cfr_renamed_86;
    private static final BigInteger cfr_renamed_152 = BigInteger.valueOf(0L);
    private static final BigInteger cfr_renamed_112 = BigInteger.valueOf(1L);
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(2L);
    private int cfr_renamed_4;

    public void cfr_renamed_9448(sprrsk arg0) {
        sprrsk sprrsk2 = arg0;
        int n = sprrsk2.cfr_renamed_2331();
        int n2 = sprrsk2.cfr_renamed_1146();
        if (n < 1024 || n > 3072 || n % 1024 != 0) {
            throw new IllegalArgumentException(sprdfq.cfr_renamed_9("]Ng\u000f}\u001bt\u001d1\u0003d\u001deNs\u000b1\ft\u001af\u000bt\u00001_!\\%Np\u0000uN\"^&\\1\u000f\u007f\n1\u000f1\u0003d\u0002e\u0007a\u0002tN~\b1_!\\%"));
        }
        if (n == 1024 && n2 != 160) {
            throw new IllegalArgumentException(sprlsa.cfr_renamed_9("\rb.706c &brtsb%-1b\u000fb~brrqv"));
        }
        if (n == 2048 && n2 != 224 && n2 != 256) {
            throw new IllegalArgumentException(sprdfq.cfr_renamed_9("_N|\u001bb\u001a1\ftN#\\%N~\u001c1\\$X1\b~\u001c1\"1S1\\!Z)"));
        }
        if (n == 3072 && n2 != 256) {
            throw new IllegalArgumentException(sprlsa.cfr_renamed_9("\rb.706c &bqwub%-1b\u000fb~bprtp"));
        }
        if (this.cfr_renamed_93.cfr_renamed_1218() * 8 < n2) {
            throw new IllegalStateException(sprdfq.cfr_renamed_9("U\u0007v\u000bb\u001a1\u0001d\u001aa\u001beNb\u0007k\u000b1\u001a~\u00011\u001d|\u000f}\u00021\b~\u001c1\u0018p\u0002d\u000b1\u0001wN_"));
        }
        spruvk spruvk2 = this;
        sprrsk sprrsk3 = arg0;
        spruvk spruvk3 = this;
        this.cfr_renamed_4 = n;
        spruvk3.cfr_renamed_119 = n2;
        spruvk3.cfr_renamed_91 = sprrsk3.cfr_renamed_3341();
        this.cfr_renamed_86 = Math.max(spruvk.cfr_renamed_10183(n), (this.cfr_renamed_91 + 1) / 2);
        spruvk2.cfr_renamed_0 = sprrsk3.cfr_renamed_1295();
        spruvk2.cfr_renamed_2 = true;
        this.cfr_renamed_1 = arg0.cfr_renamed_3375();
    }

    private static /* synthetic */ BigInteger cfr_renamed_10184(sprgf arg0, BigInteger arg1, BigInteger arg2, byte[] arg3, int arg4) {
        int n;
        BigInteger bigInteger = arg1.subtract(cfr_renamed_112).divide(arg2);
        byte[] byArray = sprfqe.cfr_renamed_5217(sprlsa.cfr_renamed_9("uuuuuwu\u0007"));
        byte[] byArray2 = new byte[arg3.length + byArray.length + 1 + 2];
        System.arraycopy(arg3, 0, byArray2, 0, arg3.length);
        System.arraycopy(byArray, 0, byArray2, arg3.length, byArray.length);
        byArray2[byArray2.length - 3] = (byte)arg4;
        byte[] byArray3 = new byte[arg0.cfr_renamed_1218()];
        int n2 = n = 1;
        while (n2 < 65536) {
            spruvk.cfr_renamed_3523(byArray2);
            spruvk.cfr_renamed_8613(arg0, byArray2, byArray3, 0);
            BigInteger bigInteger2 = new BigInteger(1, byArray3).modPow(bigInteger, arg1);
            if (bigInteger2.compareTo(cfr_renamed_3) >= 0) {
                return bigInteger2;
            }
            n2 = ++n;
        }
        return null;
    }

    private /* synthetic */ boolean cfr_renamed_10168(BigInteger arg0) {
        return arg0.isProbablePrime(this.cfr_renamed_91);
    }

    private static /* synthetic */ int cfr_renamed_10183(int arg0) {
        if (arg0 <= 1024) {
            return 40;
        }
        return 48 + 8 * ((arg0 - 1) / 1024);
    }

    private static /* synthetic */ void cfr_renamed_8613(sprgf arg0, byte[] arg1, byte[] arg2, int arg3) {
        arg0.cfr_renamed_1197(arg1, 0, arg1.length);
        arg0.cfr_renamed_1219(arg2, arg3);
    }

    public sprmqk cfr_renamed_2493() {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_3527();
        }
        return this.cfr_renamed_3524();
    }

    private static /* synthetic */ int cfr_renamed_3529(int arg0) {
        if (arg0 > 1024) {
            return 256;
        }
        return 160;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        spruvk spruvk2 = this;
        spruvk spruvk3 = this;
        this.cfr_renamed_4 = arg0;
        spruvk3.cfr_renamed_119 = spruvk.cfr_renamed_3529(this.cfr_renamed_4);
        spruvk3.cfr_renamed_91 = arg1;
        this.cfr_renamed_86 = Math.max(spruvk.cfr_renamed_10183(this.cfr_renamed_4), (int)((arg1 + true) / 2));
        this.cfr_renamed_0 = arg2;
        spruvk2.cfr_renamed_2 = false;
        spruvk2.cfr_renamed_1 = -1;
    }

    private /* synthetic */ sprmqk cfr_renamed_3527() {
        spruvk spruvk2 = this;
        sprgf sprgf2 = spruvk2.cfr_renamed_93;
        int n = sprgf2.cfr_renamed_1218() * 8;
        byte[] byArray = new byte[spruvk2.cfr_renamed_119 / 8];
        int n2 = (spruvk2.cfr_renamed_4 - 1) / n;
        int n3 = (spruvk2.cfr_renamed_4 - 1) % n;
        byte[] byArray2 = new byte[spruvk2.cfr_renamed_4 / 8];
        byte[] byArray3 = new byte[sprgf2.cfr_renamed_1218()];
        block0: while (true) {
            int n4;
            BigInteger bigInteger;
            spruvk spruvk3 = this;
            while (true) {
                spruvk3.cfr_renamed_0.nextBytes(byArray);
                spruvk.cfr_renamed_8613(sprgf2, byArray, byArray3, 0);
                bigInteger = new BigInteger(1, byArray3).mod(cfr_renamed_112.shiftLeft(this.cfr_renamed_119 - 1)).setBit(0).setBit(this.cfr_renamed_119 - 1);
                if (this.cfr_renamed_10168(bigInteger)) break;
                spruvk3 = this;
            }
            byte[] byArray4 = sproze.cfr_renamed_158(byArray);
            int n5 = 4 * this.cfr_renamed_4;
            int n6 = n4 = 0;
            while (true) {
                int n7;
                if (n6 >= n5) continue block0;
                int n8 = n7 = 1;
                while (n8 <= n2) {
                    spruvk.cfr_renamed_3523(byArray4);
                    spruvk.cfr_renamed_8613(sprgf2, byArray4, byArray2, byArray2.length - n7++ * byArray3.length);
                    n8 = n7;
                }
                n7 = byArray2.length - n2 * byArray3.length;
                spruvk.cfr_renamed_3523(byArray4);
                byte[] byArray5 = byArray3;
                spruvk.cfr_renamed_8613(sprgf2, byArray4, byArray5, 0);
                System.arraycopy(byArray3, byArray5.length - n7, byArray2, 0, n7);
                byArray2[0] = (byte)(byArray2[0] | 0xFFFFFF80);
                BigInteger bigInteger2 = new BigInteger(1, byArray2);
                BigInteger bigInteger3 = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(cfr_renamed_112));
                if (bigInteger3.bitLength() == this.cfr_renamed_4 && this.cfr_renamed_10168(bigInteger3)) {
                    BigInteger bigInteger4;
                    if (this.cfr_renamed_1 >= 0 && (bigInteger4 = spruvk.cfr_renamed_10184(sprgf2, bigInteger3, bigInteger, byArray, this.cfr_renamed_1)) != null) {
                        return new sprmqk(bigInteger3, bigInteger, bigInteger4, new sprizk(byArray, n4, this.cfr_renamed_1));
                    }
                    bigInteger4 = spruvk.cfr_renamed_3526(bigInteger3, bigInteger, this.cfr_renamed_0);
                    return new sprmqk(bigInteger3, bigInteger, bigInteger4, new sprizk(byArray, n4));
                }
                n6 = ++n4;
            }
            break;
        }
    }

    private static /* synthetic */ void cfr_renamed_3523(byte[] arg0) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            byte by;
            arg0[n] = by = (byte)(arg0[n] + 1 & 0xFF);
            if (by != 0) {
                return;
            }
            n2 = --n;
        }
    }

    private static /* synthetic */ BigInteger cfr_renamed_3526(BigInteger arg0, BigInteger arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = arg0;
        BigInteger bigInteger3 = bigInteger2.subtract(cfr_renamed_112).divide(arg1);
        BigInteger bigInteger4 = bigInteger2.subtract(cfr_renamed_3);
        while ((bigInteger = sprhdf.cfr_renamed_513(cfr_renamed_3, bigInteger4, arg2).modPow(bigInteger3, arg0)).bitLength() <= 1) {
        }
        return bigInteger;
    }

    public spruvk(sprgf sprgf2) {
        this.cfr_renamed_93 = sprgf2;
    }

    private /* synthetic */ sprmqk cfr_renamed_3524() {
        byte[] byArray = new byte[20];
        byte[] byArray2 = new byte[20];
        byte[] byArray3 = new byte[20];
        byte[] byArray4 = new byte[20];
        spruvk spruvk2 = this;
        int n = (spruvk2.cfr_renamed_4 - 1) / 160;
        byte[] byArray5 = new byte[spruvk2.cfr_renamed_4 / 8];
        if (!(spruvk2.cfr_renamed_93 instanceof sprwil)) {
            throw new IllegalStateException(sprdfq.cfr_renamed_9("r\u000f\u007fN~\u0000}\u00171\u001bb\u000b1=Y/<_1\b~\u001c1\tt\u0000t\u001cp\u001ax\u0000vNW'A=1_)X<\\1\u001ep\u001cp\u0003t\u001at\u001cb"));
        }
        block0: while (true) {
            int n2;
            BigInteger bigInteger;
            spruvk spruvk3 = this;
            while (true) {
                int n3;
                spruvk3.cfr_renamed_0.nextBytes(byArray);
                spruvk.cfr_renamed_8613(this.cfr_renamed_93, byArray, byArray2, 0);
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                spruvk.cfr_renamed_3523(byArray3);
                spruvk.cfr_renamed_8613(this.cfr_renamed_93, byArray3, byArray3, 0);
                int n4 = n3 = 0;
                while (n4 != byArray4.length) {
                    int n5 = n3;
                    byte by = (byte)(byArray2[n3] ^ byArray3[n5]);
                    byArray4[n5] = by;
                    n4 = ++n3;
                }
                byArray4[0] = (byte)(byArray4[0] | 0xFFFFFF80);
                byArray4[19] = (byte)(byArray4[19] | 1);
                bigInteger = new BigInteger(1, byArray4);
                if (this.cfr_renamed_10168(bigInteger)) break;
                spruvk3 = this;
            }
            byte[] byArray6 = sproze.cfr_renamed_158(byArray);
            spruvk.cfr_renamed_3523(byArray6);
            int n6 = n2 = 0;
            while (true) {
                int n7;
                if (n6 >= 4096) continue block0;
                int n8 = n7 = 1;
                while (n8 <= n) {
                    spruvk.cfr_renamed_3523(byArray6);
                    spruvk.cfr_renamed_8613(this.cfr_renamed_93, byArray6, byArray5, byArray5.length - n7++ * byArray2.length);
                    n8 = n7;
                }
                n7 = byArray5.length - n * byArray2.length;
                spruvk.cfr_renamed_3523(byArray6);
                byte[] byArray7 = byArray2;
                spruvk.cfr_renamed_8613(this.cfr_renamed_93, byArray6, byArray7, 0);
                System.arraycopy(byArray2, byArray7.length - n7, byArray5, 0, n7);
                byArray5[0] = (byte)(byArray5[0] | 0xFFFFFF80);
                BigInteger bigInteger2 = new BigInteger(1, byArray5);
                BigInteger bigInteger3 = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(cfr_renamed_112));
                if (bigInteger3.bitLength() == this.cfr_renamed_4 && this.cfr_renamed_10168(bigInteger3)) {
                    BigInteger bigInteger4 = spruvk.cfr_renamed_3526(bigInteger3, bigInteger, this.cfr_renamed_0);
                    return new sprmqk(bigInteger3, bigInteger, bigInteger4, new sprizk(byArray, n2));
                }
                n6 = ++n2;
            }
            break;
        }
    }

    public spruvk() {
        this(sprkkk.cfr_renamed_5701());
    }
}

