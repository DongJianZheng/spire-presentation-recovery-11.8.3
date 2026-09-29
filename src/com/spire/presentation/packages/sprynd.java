/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafz;
import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.spreoq;
import com.spire.presentation.packages.sprged;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprqld;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprynd {
    private static final BigInteger cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private static final BigInteger cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private sprlc cfr_renamed_1;
    private int cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    private boolean cfr_renamed_4;

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

    private /* synthetic */ sprcld cfr_renamed_3524() {
        byte[] byArray = new byte[20];
        byte[] byArray2 = new byte[20];
        byte[] byArray3 = new byte[20];
        byte[] byArray4 = new byte[20];
        sprynd sprynd2 = this;
        int n = (sprynd2.cfr_renamed_119 - 1) / 160;
        byte[] byArray5 = new byte[sprynd2.cfr_renamed_119 / 8];
        if (!(sprynd2.cfr_renamed_1 instanceof sprlid)) {
            throw new IllegalStateException(sprafz.cfr_renamed_9("s\u0017~V\u007f\u0018|\u000f0\u0003c\u00130%X7=G0\u0010\u007f\u00040\u0011u\u0018u\u0004q\u0002y\u0018wVV?@%0G(@=D0\u0006q\u0004q\u001bu\u0002u\u0004c"));
        }
        block0: while (true) {
            int n2;
            BigInteger bigInteger;
            sprynd sprynd3 = this;
            while (true) {
                int n3;
                sprynd3.cfr_renamed_0.nextBytes(byArray);
                sprynd.cfr_renamed_3525(this.cfr_renamed_1, byArray, byArray2);
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                sprynd.cfr_renamed_3523(byArray3);
                sprynd.cfr_renamed_3525(this.cfr_renamed_1, byArray3, byArray3);
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
                if (bigInteger.isProbablePrime(this.cfr_renamed_152)) break;
                sprynd3 = this;
            }
            byte[] byArray6 = sprzra.cfr_renamed_158(byArray);
            sprynd.cfr_renamed_3523(byArray6);
            int n6 = n2 = 0;
            while (true) {
                int n7;
                if (n6 >= 4096) continue block0;
                int n8 = n7 = 0;
                while (n8 < n) {
                    sprynd.cfr_renamed_3523(byArray6);
                    sprynd.cfr_renamed_3525(this.cfr_renamed_1, byArray6, byArray2);
                    int n9 = byArray5.length - (n7 + 1) * byArray2.length;
                    System.arraycopy(byArray2, 0, byArray5, n9, byArray2.length);
                    n8 = ++n7;
                }
                sprynd.cfr_renamed_3523(byArray6);
                byte[] byArray7 = byArray2;
                sprynd.cfr_renamed_3525(this.cfr_renamed_1, byArray6, byArray7);
                System.arraycopy(byArray2, byArray7.length - (byArray5.length - n * byArray2.length), byArray5, 0, byArray5.length - n * byArray2.length);
                byArray5[0] = (byte)(byArray5[0] | 0xFFFFFF80);
                BigInteger bigInteger2 = new BigInteger(1, byArray5);
                BigInteger bigInteger3 = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(cfr_renamed_86));
                if (bigInteger3.bitLength() == this.cfr_renamed_119 && bigInteger3.isProbablePrime(this.cfr_renamed_152)) {
                    BigInteger bigInteger4 = sprynd.cfr_renamed_3526(bigInteger3, bigInteger, this.cfr_renamed_0);
                    return new sprcld(bigInteger3, bigInteger, bigInteger4, new sprqld(byArray, n2));
                }
                n6 = ++n2;
            }
            break;
        }
    }

    private /* synthetic */ sprcld cfr_renamed_3527() {
        sprynd sprynd2 = this;
        sprlc sprlc2 = sprynd2.cfr_renamed_1;
        int n = sprlc2.cfr_renamed_1218() * 8;
        byte[] byArray = new byte[sprynd2.cfr_renamed_2 / 8];
        int n2 = (sprynd2.cfr_renamed_119 - 1) / n;
        int n3 = (sprynd2.cfr_renamed_119 - 1) % n;
        byte[] byArray2 = new byte[sprlc2.cfr_renamed_1218()];
        block0: while (true) {
            int n4;
            BigInteger bigInteger;
            sprynd sprynd3 = this;
            while (true) {
                sprynd3.cfr_renamed_0.nextBytes(byArray);
                sprynd.cfr_renamed_3525(sprlc2, byArray, byArray2);
                BigInteger bigInteger2 = new BigInteger(1, byArray2).mod(cfr_renamed_86.shiftLeft(this.cfr_renamed_2 - 1));
                bigInteger = cfr_renamed_86.shiftLeft(this.cfr_renamed_2 - 1).add(bigInteger2).add(cfr_renamed_86).subtract(bigInteger2.mod(cfr_renamed_3));
                if (bigInteger.isProbablePrime(this.cfr_renamed_152)) break;
                sprynd3 = this;
            }
            byte[] byArray3 = sprzra.cfr_renamed_158(byArray);
            int n5 = 4 * this.cfr_renamed_119;
            int n6 = n4 = 0;
            while (true) {
                BigInteger bigInteger3;
                BigInteger bigInteger4;
                if (n6 >= n5) continue block0;
                BigInteger bigInteger5 = cfr_renamed_91;
                int n7 = 0;
                int n8 = 0;
                int n9 = n7;
                while (n9 <= n2) {
                    sprynd.cfr_renamed_3523(byArray3);
                    sprynd.cfr_renamed_3525(sprlc2, byArray3, byArray2);
                    bigInteger4 = new BigInteger(1, byArray2);
                    if (n7 == n2) {
                        bigInteger4 = bigInteger4.mod(cfr_renamed_86.shiftLeft(n3));
                    }
                    bigInteger5 = bigInteger5.add(bigInteger4.shiftLeft(n8));
                    n8 += n;
                    n9 = ++n7;
                }
                BigInteger bigInteger6 = bigInteger5.add(cfr_renamed_86.shiftLeft(this.cfr_renamed_119 - 1));
                bigInteger4 = bigInteger6.subtract((bigInteger3 = bigInteger6.mod(bigInteger.shiftLeft(1))).subtract(cfr_renamed_86));
                if (bigInteger4.bitLength() == this.cfr_renamed_119 && bigInteger4.isProbablePrime(this.cfr_renamed_152)) {
                    BigInteger bigInteger7;
                    if (this.cfr_renamed_112 >= 0 && (bigInteger7 = sprynd.cfr_renamed_3528(sprlc2, bigInteger4, bigInteger, byArray, this.cfr_renamed_112)) != null) {
                        return new sprcld(bigInteger4, bigInteger, bigInteger7, new sprqld(byArray, n4, this.cfr_renamed_112));
                    }
                    bigInteger7 = sprynd.cfr_renamed_3526(bigInteger4, bigInteger, this.cfr_renamed_0);
                    return new sprcld(bigInteger4, bigInteger, bigInteger7, new sprqld(byArray, n4));
                }
                n6 = ++n4;
            }
            break;
        }
    }

    private static /* synthetic */ BigInteger cfr_renamed_3526(BigInteger arg0, BigInteger arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = arg0;
        BigInteger bigInteger3 = bigInteger2.subtract(cfr_renamed_86).divide(arg1);
        BigInteger bigInteger4 = bigInteger2.subtract(cfr_renamed_3);
        while ((bigInteger = sprvpa.cfr_renamed_513(cfr_renamed_3, bigInteger4, arg2).modPow(bigInteger3, arg0)).bitLength() <= 1) {
        }
        return bigInteger;
    }

    private static /* synthetic */ BigInteger cfr_renamed_3528(sprlc arg0, BigInteger arg1, BigInteger arg2, byte[] arg3, int arg4) {
        int n;
        BigInteger bigInteger = arg1.subtract(cfr_renamed_86).divide(arg2);
        byte[] byArray = sprmma.cfr_renamed_488(spreoq.cfr_renamed_9("',','.'^"));
        byte[] byArray2 = new byte[arg3.length + byArray.length + 1 + 2];
        System.arraycopy(arg3, 0, byArray2, 0, arg3.length);
        System.arraycopy(byArray, 0, byArray2, arg3.length, byArray.length);
        byArray2[byArray2.length - 3] = (byte)arg4;
        byte[] byArray3 = new byte[arg0.cfr_renamed_1218()];
        int n2 = n = 1;
        while (n2 < 65536) {
            sprynd.cfr_renamed_3523(byArray2);
            sprynd.cfr_renamed_3525(arg0, byArray2, byArray3);
            BigInteger bigInteger2 = new BigInteger(1, byArray3).modPow(bigInteger, arg1);
            if (bigInteger2.compareTo(cfr_renamed_3) >= 0) {
                return bigInteger2;
            }
            n2 = ++n;
        }
        return null;
    }

    public sprynd(sprlc sprlc2) {
        this.cfr_renamed_1 = sprlc2;
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
    public void cfr_renamed_2517(sprged sprged2) {
        void arg0;
        void v0 = arg0;
        sprynd sprynd2 = this;
        this.cfr_renamed_4 = true;
        sprynd2.cfr_renamed_119 = arg0.cfr_renamed_2331();
        sprynd2.cfr_renamed_2 = arg0.cfr_renamed_1146();
        this.cfr_renamed_152 = v0.cfr_renamed_3341();
        this.cfr_renamed_0 = v0.cfr_renamed_1295();
        this.cfr_renamed_112 = sprged2.cfr_renamed_3375();
        if (this.cfr_renamed_119 < 1024 || this.cfr_renamed_119 > 3072 || this.cfr_renamed_119 % 1024 != 0) {
            throw new IllegalArgumentException(sprafz.cfr_renamed_9("\\Vf\u0017|\u0003u\u00050\u001be\u0005dVr\u00130\u0014u\u0002g\u0013u\u00180G D$Vq\u0018tV#F'D0\u0017~\u00120\u00170\u001be\u001ad\u001f`\u001auV\u007f\u00100G D$"));
        }
        if (this.cfr_renamed_119 == 1024 && this.cfr_renamed_2 != 160) {
            throw new IllegalArgumentException(spreoq.cfr_renamed_9("_;|nbo1yt; -!;wtc;];,; +#/"));
        }
        if (this.cfr_renamed_119 == 2048 && this.cfr_renamed_2 != 224 && this.cfr_renamed_2 != 256) {
            throw new IllegalArgumentException(sprafz.cfr_renamed_9("^V}\u0003c\u00020\u0014uV\"D$V\u007f\u00040D%@0\u0010\u007f\u00040:0K0D B("));
        }
        if (this.cfr_renamed_119 == 3072 && this.cfr_renamed_2 != 256) {
            throw new IllegalArgumentException(spreoq.cfr_renamed_9("_;|nbo1yt;#.';wtc;];,;\"+&)"));
        }
        if (this.cfr_renamed_1.cfr_renamed_1218() * 8 < this.cfr_renamed_2) {
            throw new IllegalStateException(sprafz.cfr_renamed_9("T\u001fw\u0013c\u00020\u0019e\u0002`\u0003dVc\u001fj\u00130\u0002\u007f\u00190\u0005}\u0017|\u001a0\u0010\u007f\u00040\u0000q\u001ae\u00130\u0019vV^"));
        }
    }

    public sprynd() {
        this(new sprlid());
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprynd sprynd2 = this;
        sprynd sprynd3 = this;
        this.cfr_renamed_4 = false;
        sprynd3.cfr_renamed_119 = arg0;
        sprynd3.cfr_renamed_2 = sprynd.cfr_renamed_3529((int)arg0);
        sprynd2.cfr_renamed_152 = arg1;
        sprynd2.cfr_renamed_0 = secureRandom;
    }

    static {
        cfr_renamed_91 = BigInteger.valueOf(0L);
        cfr_renamed_86 = BigInteger.valueOf(1L);
        cfr_renamed_3 = BigInteger.valueOf(2L);
    }

    private static /* synthetic */ void cfr_renamed_3525(sprlc arg0, byte[] arg1, byte[] arg2) {
        arg0.cfr_renamed_1197(arg1, 0, arg1.length);
        arg0.cfr_renamed_1219(arg2, 0);
    }

    public sprcld cfr_renamed_2493() {
        if (this.cfr_renamed_4) {
            return this.cfr_renamed_3527();
        }
        return this.cfr_renamed_3524();
    }
}

