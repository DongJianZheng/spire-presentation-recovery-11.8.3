/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfd;
import com.spire.presentation.packages.sprdoha;
import com.spire.presentation.packages.sprjfd;
import com.spire.presentation.packages.spruofa;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprqjd {
    private static final BigInteger cfr_renamed_0 = BigInteger.valueOf(1L);
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(2L);
    private int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3514(int arg0, int arg1, BigInteger[] arg2) {
        int n = arg0;
        while (n < 0 || arg0 > 65536) {
            n = this.cfr_renamed_3.nextInt() / 32768;
        }
        int n2 = arg1;
        while (n2 < 0 || arg1 > 65536 || arg1 / 2 == 0) {
            n2 = this.cfr_renamed_3.nextInt() / 32768 + 1;
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        BigInteger bigInteger = null;
        BigInteger bigInteger2 = null;
        BigInteger bigInteger3 = null;
        BigInteger bigInteger4 = new BigInteger(Integer.toString(arg1));
        BigInteger bigInteger5 = new BigInteger(sprdoha.cfr_renamed_9("Q\u001bS\u001aQ"));
        sprqjd sprqjd2 = this;
        arg0 = sprqjd2.cfr_renamed_3515(arg0, arg1, bigIntegerArray, 256);
        bigInteger = bigIntegerArray[0];
        arg0 = sprqjd2.cfr_renamed_3515(arg0, arg1, bigIntegerArray, 512);
        bigInteger2 = bigIntegerArray[0];
        BigInteger[] bigIntegerArray2 = new BigInteger[65];
        bigIntegerArray2[0] = new BigInteger(Integer.toString(arg0));
        int n3 = 1024;
        block2: while (true) {
            int n4;
            int n5;
            int n6 = n5 = 0;
            while (n6 < 64) {
                bigIntegerArray2[++n5 + 1] = bigIntegerArray2[n5].multiply(bigInteger5).add(bigInteger4).mod(cfr_renamed_1.pow(16));
                n6 = n5;
            }
            BigInteger bigInteger6 = new BigInteger("0");
            int n7 = n4 = 0;
            while (n7 < 64) {
                BigInteger bigInteger7 = bigIntegerArray2[n4];
                BigInteger bigInteger8 = cfr_renamed_1.pow(16 * n4);
                bigInteger6 = bigInteger6.add(bigInteger7.multiply(bigInteger8));
                n7 = ++n4;
            }
            bigIntegerArray2[0] = bigIntegerArray2[64];
            BigInteger bigInteger9 = cfr_renamed_1.pow(n3 - 1).divide(bigInteger.multiply(bigInteger2)).add(cfr_renamed_1.pow(n3 - 1).multiply(bigInteger6).divide(bigInteger.multiply(bigInteger2).multiply(cfr_renamed_1.pow(1024))));
            if (bigInteger9.mod(cfr_renamed_1).compareTo(cfr_renamed_0) == 0) {
                bigInteger9 = bigInteger9.add(cfr_renamed_0);
            }
            int n8 = 0;
            BigInteger bigInteger10 = bigInteger;
            while (true) {
                if ((bigInteger3 = bigInteger10.multiply(bigInteger2).multiply(bigInteger9.add(BigInteger.valueOf(n8))).add(cfr_renamed_0)).compareTo(cfr_renamed_1.pow(n3)) == 1) continue block2;
                if (cfr_renamed_1.modPow(bigInteger.multiply(bigInteger2).multiply(bigInteger9.add(BigInteger.valueOf(n8))), bigInteger3).compareTo(cfr_renamed_0) == 0 && cfr_renamed_1.modPow(bigInteger.multiply(bigInteger9.add(BigInteger.valueOf(n8))), bigInteger3).compareTo(cfr_renamed_0) != 0) {
                    arg2[0] = bigInteger3;
                    arg2[1] = bigInteger;
                    return;
                }
                n8 += 2;
                bigInteger10 = bigInteger;
            }
            break;
        }
    }

    private /* synthetic */ void cfr_renamed_3516(long arg0, long arg1, BigInteger[] arg2) {
        long l = arg0;
        while (l < 0L || arg0 > 0x100000000L) {
            l = this.cfr_renamed_3.nextInt() * 2;
        }
        long l2 = arg1;
        while (l2 < 0L || arg1 > 0x100000000L || arg1 / 2L == 0L) {
            l2 = this.cfr_renamed_3.nextInt() * 2 + 1;
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        BigInteger bigInteger = null;
        BigInteger bigInteger2 = null;
        BigInteger bigInteger3 = null;
        BigInteger bigInteger4 = new BigInteger(Long.toString(arg1));
        BigInteger bigInteger5 = new BigInteger(spruofa.cfr_renamed_9("R&\\)Z \\\""));
        sprqjd sprqjd2 = this;
        arg0 = sprqjd2.cfr_renamed_3517(arg0, arg1, bigIntegerArray, 256);
        bigInteger = bigIntegerArray[0];
        arg0 = sprqjd2.cfr_renamed_3517(arg0, arg1, bigIntegerArray, 512);
        bigInteger2 = bigIntegerArray[0];
        BigInteger[] bigIntegerArray2 = new BigInteger[33];
        bigIntegerArray2[0] = new BigInteger(Long.toString(arg0));
        int n = 1024;
        block2: while (true) {
            int n2;
            int n3;
            int n4 = n3 = 0;
            while (n4 < 32) {
                bigIntegerArray2[++n3 + 1] = bigIntegerArray2[n3].multiply(bigInteger5).add(bigInteger4).mod(cfr_renamed_1.pow(32));
                n4 = n3;
            }
            BigInteger bigInteger6 = new BigInteger("0");
            int n5 = n2 = 0;
            while (n5 < 32) {
                BigInteger bigInteger7 = bigIntegerArray2[n2];
                BigInteger bigInteger8 = cfr_renamed_1.pow(32 * n2);
                bigInteger6 = bigInteger6.add(bigInteger7.multiply(bigInteger8));
                n5 = ++n2;
            }
            bigIntegerArray2[0] = bigIntegerArray2[32];
            BigInteger bigInteger9 = cfr_renamed_1.pow(n - 1).divide(bigInteger.multiply(bigInteger2)).add(cfr_renamed_1.pow(n - 1).multiply(bigInteger6).divide(bigInteger.multiply(bigInteger2).multiply(cfr_renamed_1.pow(1024))));
            if (bigInteger9.mod(cfr_renamed_1).compareTo(cfr_renamed_0) == 0) {
                bigInteger9 = bigInteger9.add(cfr_renamed_0);
            }
            int n6 = 0;
            BigInteger bigInteger10 = bigInteger;
            while (true) {
                if ((bigInteger3 = bigInteger10.multiply(bigInteger2).multiply(bigInteger9.add(BigInteger.valueOf(n6))).add(cfr_renamed_0)).compareTo(cfr_renamed_1.pow(n)) == 1) continue block2;
                if (cfr_renamed_1.modPow(bigInteger.multiply(bigInteger2).multiply(bigInteger9.add(BigInteger.valueOf(n6))), bigInteger3).compareTo(cfr_renamed_0) == 0 && cfr_renamed_1.modPow(bigInteger.multiply(bigInteger9.add(BigInteger.valueOf(n6))), bigInteger3).compareTo(cfr_renamed_0) != 0) {
                    arg2[0] = bigInteger3;
                    arg2[1] = bigInteger;
                    return;
                }
                n6 += 2;
                bigInteger10 = bigInteger;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ long cfr_renamed_3517(long arg0, long arg1, BigInteger[] arg2, int arg3) {
        int n;
        int[] nArray;
        long l = arg0;
        while (l < 0L || arg0 > 0x100000000L) {
            l = this.cfr_renamed_3.nextInt() * 2;
        }
        long l2 = arg1;
        while (l2 < 0L || arg1 > 0x100000000L || arg1 / 2L == 0L) {
            l2 = this.cfr_renamed_3.nextInt() * 2 + 1;
        }
        BigInteger bigInteger = new BigInteger(Long.toString(arg1));
        BigInteger bigInteger2 = new BigInteger(sprdoha.cfr_renamed_9("\u001bW\u0015X\u0013Q\u0015S"));
        BigInteger[] bigIntegerArray = new BigInteger[1];
        bigIntegerArray[0] = new BigInteger(Long.toString(arg0));
        int[] nArray2 = nArray = new int[1];
        nArray[0] = arg3;
        int n2 = 0;
        int n3 = 0;
        while (nArray2[n3] >= 33) {
            int[] nArray3 = new int[nArray.length + 1];
            System.arraycopy(nArray, 0, nArray3, 0, nArray.length);
            nArray = new int[nArray3.length];
            System.arraycopy(nArray3, 0, nArray, 0, nArray3.length);
            nArray2 = nArray;
            nArray[n3 + 1] = nArray[n3] / 2;
            n2 = ++n3 + 1;
        }
        BigInteger[] bigIntegerArray2 = new BigInteger[n2 + 1];
        BigInteger[] bigIntegerArray3 = bigIntegerArray2;
        int n4 = n2;
        bigIntegerArray2[n4] = new BigInteger(spruofa.cfr_renamed_9("S![![![S"), 16);
        int n5 = n4 - 1;
        int n6 = n = 0;
        while (n6 < n2) {
            BigInteger[] bigIntegerArray4 = bigIntegerArray;
            int n7 = nArray[n5] / 32;
            block4: while (true) {
                int n8;
                int n9;
                BigInteger[] bigIntegerArray5 = new BigInteger[bigIntegerArray4.length];
                System.arraycopy(bigIntegerArray, 0, bigIntegerArray5, 0, bigIntegerArray.length);
                bigIntegerArray = new BigInteger[n7 + 1];
                System.arraycopy(bigIntegerArray5, 0, bigIntegerArray, 0, bigIntegerArray5.length);
                int n10 = n9 = 0;
                while (n10 < n7) {
                    bigIntegerArray[++n9 + 1] = bigIntegerArray[n9].multiply(bigInteger2).add(bigInteger).mod(cfr_renamed_1.pow(32));
                    n10 = n9;
                }
                BigInteger bigInteger3 = new BigInteger("0");
                int n11 = n8 = 0;
                while (n11 < n7) {
                    BigInteger bigInteger4 = bigIntegerArray[n8];
                    BigInteger bigInteger5 = cfr_renamed_1.pow(32 * n8);
                    bigInteger3 = bigInteger3.add(bigInteger4.multiply(bigInteger5));
                    n11 = ++n8;
                }
                bigIntegerArray[0] = bigIntegerArray[n7];
                BigInteger bigInteger6 = cfr_renamed_1.pow(nArray[n5] - 1).divide(bigIntegerArray3[n5 + 1]).add(cfr_renamed_1.pow(nArray[n5] - 1).multiply(bigInteger3).divide(bigIntegerArray3[n5 + 1].multiply(cfr_renamed_1.pow(32 * n7))));
                if (bigInteger6.mod(cfr_renamed_1).compareTo(cfr_renamed_0) == 0) {
                    bigInteger6 = bigInteger6.add(cfr_renamed_0);
                }
                int n12 = 0;
                BigInteger[] bigIntegerArray6 = bigIntegerArray3;
                while (true) {
                    bigIntegerArray6[n5] = bigIntegerArray3[n5 + 1].multiply(bigInteger6.add(BigInteger.valueOf(n12))).add(cfr_renamed_0);
                    if (bigIntegerArray3[n5].compareTo(cfr_renamed_1.pow(nArray[n5])) == 1) {
                        bigIntegerArray4 = bigIntegerArray;
                        continue block4;
                    }
                    if (cfr_renamed_1.modPow(bigIntegerArray3[n5 + 1].multiply(bigInteger6.add(BigInteger.valueOf(n12))), bigIntegerArray3[n5]).compareTo(cfr_renamed_0) == 0 && cfr_renamed_1.modPow(bigInteger6.add(BigInteger.valueOf(n12)), bigIntegerArray3[n5]).compareTo(cfr_renamed_0) != 0) {
                        if (--n5 >= 0) break block4;
                        arg2[0] = bigIntegerArray3[0];
                        arg2[1] = bigIntegerArray3[1];
                        return bigIntegerArray[0].longValue();
                    }
                    n12 += 2;
                    bigIntegerArray6 = bigIntegerArray3;
                }
                break;
            }
            n6 = ++n;
        }
        return bigIntegerArray[0].longValue();
    }

    private /* synthetic */ BigInteger cfr_renamed_3518(BigInteger arg0, BigInteger arg1) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = arg0;
        BigInteger bigInteger4 = bigInteger3.subtract(cfr_renamed_0);
        BigInteger bigInteger5 = bigInteger4.divide(arg1);
        int n = bigInteger3.bitLength();
        while ((bigInteger2 = new BigInteger(n, this.cfr_renamed_3)).compareTo(cfr_renamed_0) <= 0 || bigInteger2.compareTo(bigInteger4) >= 0 || (bigInteger = bigInteger2.modPow(bigInteger5, arg0)).compareTo(cfr_renamed_0) == 0) {
        }
        return bigInteger;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprcfd cfr_renamed_2493() {
        BigInteger[] bigIntegerArray;
        BigInteger[] bigIntegerArray2 = new BigInteger[2];
        BigInteger bigInteger = null;
        BigInteger bigInteger2 = null;
        BigInteger bigInteger3 = null;
        if (this.cfr_renamed_2 == 1) {
            BigInteger[] bigIntegerArray3;
            sprqjd sprqjd2 = this;
            int n = sprqjd2.cfr_renamed_3.nextInt();
            int n2 = sprqjd2.cfr_renamed_3.nextInt();
            switch (sprqjd2.cfr_renamed_4) {
                case 512: {
                    this.cfr_renamed_3515(n, n2, bigIntegerArray2, 512);
                    bigIntegerArray3 = bigIntegerArray2;
                    break;
                }
                case 1024: {
                    this.cfr_renamed_3514(n, n2, bigIntegerArray2);
                    bigIntegerArray3 = bigIntegerArray2;
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprdoha.cfr_renamed_9("m\u000fM\u0010QA\u0002\u000bG\u0019\u0002\u0013K\u001aG@\u0017Q\u0010@M\u0012\u0002Q\u0012R\u0016@@\tVN"));
                }
            }
            bigInteger2 = bigIntegerArray3[0];
            bigInteger = bigIntegerArray2[1];
            bigInteger3 = this.cfr_renamed_3518(bigInteger2, bigInteger);
            return new sprcfd(bigInteger2, bigInteger, bigInteger3, new sprjfd(n, n2));
        }
        sprqjd sprqjd3 = this;
        long l = sprqjd3.cfr_renamed_3.nextLong();
        long l2 = sprqjd3.cfr_renamed_3.nextLong();
        switch (sprqjd3.cfr_renamed_4) {
            case 512: {
                this.cfr_renamed_3517(l, l2, bigIntegerArray2, 512);
                bigIntegerArray = bigIntegerArray2;
                break;
            }
            case 1024: {
                this.cfr_renamed_3516(l, l2, bigIntegerArray2);
                bigIntegerArray = bigIntegerArray2;
                break;
            }
            default: {
                throw new IllegalStateException(spruofa.cfr_renamed_9("$~\u0004a\u00180Kz\u000ehKb\u0002k\u000e1^ Y1\u0004cK [#_1\tx\u001f?"));
            }
        }
        bigInteger2 = bigIntegerArray[0];
        bigInteger = bigIntegerArray2[1];
        bigInteger3 = this.cfr_renamed_3518(bigInteger2, bigInteger);
        return new sprcfd(bigInteger2, bigInteger, bigInteger3, new sprjfd(l, l2));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprqjd sprqjd2 = this;
        this.cfr_renamed_4 = arg0;
        sprqjd2.cfr_renamed_2 = arg1;
        sprqjd2.cfr_renamed_3 = secureRandom;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_3515(int arg0, int arg1, BigInteger[] arg2, int arg3) {
        int n;
        int[] nArray;
        int n2 = arg0;
        while (n2 < 0 || arg0 > 65536) {
            n2 = this.cfr_renamed_3.nextInt() / 32768;
        }
        int n3 = arg1;
        while (n3 < 0 || arg1 > 65536 || arg1 / 2 == 0) {
            n3 = this.cfr_renamed_3.nextInt() / 32768 + 1;
        }
        BigInteger bigInteger = new BigInteger(Integer.toString(arg1));
        BigInteger bigInteger2 = new BigInteger(sprdoha.cfr_renamed_9("Q\u001bS\u001aQ"));
        BigInteger[] bigIntegerArray = new BigInteger[1];
        bigIntegerArray[0] = new BigInteger(Integer.toString(arg0));
        int[] nArray2 = nArray = new int[1];
        nArray[0] = arg3;
        int n4 = 0;
        int n5 = 0;
        while (nArray2[n5] >= 17) {
            int[] nArray3 = new int[nArray.length + 1];
            System.arraycopy(nArray, 0, nArray3, 0, nArray.length);
            nArray = new int[nArray3.length];
            System.arraycopy(nArray3, 0, nArray, 0, nArray3.length);
            nArray2 = nArray;
            nArray[n5 + 1] = nArray[n5] / 2;
            n4 = ++n5 + 1;
        }
        BigInteger[] bigIntegerArray2 = new BigInteger[n4 + 1];
        BigInteger[] bigIntegerArray3 = bigIntegerArray2;
        int n6 = n4;
        bigIntegerArray2[n6] = new BigInteger(spruofa.cfr_renamed_9("S![\""), 16);
        int n7 = n6 - 1;
        int n8 = n = 0;
        while (n8 < n4) {
            BigInteger[] bigIntegerArray4 = bigIntegerArray;
            int n9 = nArray[n7] / 16;
            block4: while (true) {
                int n10;
                int n11;
                BigInteger[] bigIntegerArray5 = new BigInteger[bigIntegerArray4.length];
                System.arraycopy(bigIntegerArray, 0, bigIntegerArray5, 0, bigIntegerArray.length);
                bigIntegerArray = new BigInteger[n9 + 1];
                System.arraycopy(bigIntegerArray5, 0, bigIntegerArray, 0, bigIntegerArray5.length);
                int n12 = n11 = 0;
                while (n12 < n9) {
                    bigIntegerArray[++n11 + 1] = bigIntegerArray[n11].multiply(bigInteger2).add(bigInteger).mod(cfr_renamed_1.pow(16));
                    n12 = n11;
                }
                BigInteger bigInteger3 = new BigInteger("0");
                int n13 = n10 = 0;
                while (n13 < n9) {
                    BigInteger bigInteger4 = bigIntegerArray[n10];
                    BigInteger bigInteger5 = cfr_renamed_1.pow(16 * n10);
                    bigInteger3 = bigInteger3.add(bigInteger4.multiply(bigInteger5));
                    n13 = ++n10;
                }
                bigIntegerArray[0] = bigIntegerArray[n9];
                BigInteger bigInteger6 = cfr_renamed_1.pow(nArray[n7] - 1).divide(bigIntegerArray3[n7 + 1]).add(cfr_renamed_1.pow(nArray[n7] - 1).multiply(bigInteger3).divide(bigIntegerArray3[n7 + 1].multiply(cfr_renamed_1.pow(16 * n9))));
                if (bigInteger6.mod(cfr_renamed_1).compareTo(cfr_renamed_0) == 0) {
                    bigInteger6 = bigInteger6.add(cfr_renamed_0);
                }
                int n14 = 0;
                BigInteger[] bigIntegerArray6 = bigIntegerArray3;
                while (true) {
                    bigIntegerArray6[n7] = bigIntegerArray3[n7 + 1].multiply(bigInteger6.add(BigInteger.valueOf(n14))).add(cfr_renamed_0);
                    if (bigIntegerArray3[n7].compareTo(cfr_renamed_1.pow(nArray[n7])) == 1) {
                        bigIntegerArray4 = bigIntegerArray;
                        continue block4;
                    }
                    if (cfr_renamed_1.modPow(bigIntegerArray3[n7 + 1].multiply(bigInteger6.add(BigInteger.valueOf(n14))), bigIntegerArray3[n7]).compareTo(cfr_renamed_0) == 0 && cfr_renamed_1.modPow(bigInteger6.add(BigInteger.valueOf(n14)), bigIntegerArray3[n7]).compareTo(cfr_renamed_0) != 0) {
                        if (--n7 >= 0) break block4;
                        arg2[0] = bigIntegerArray3[0];
                        arg2[1] = bigIntegerArray3[1];
                        return bigIntegerArray[0].intValue();
                    }
                    n14 += 2;
                    bigIntegerArray6 = bigIntegerArray3;
                }
                break;
            }
            n8 = ++n;
        }
        return bigIntegerArray[0].intValue();
    }
}

