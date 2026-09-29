/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcez;
import com.spire.presentation.packages.sprduh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhe;
import com.spire.presentation.packages.sprjcz;
import com.spire.presentation.packages.sprssh;
import com.spire.presentation.packages.sprwth;
import com.spire.presentation.packages.sprxyh;
import com.spire.presentation.packages.sprzi;
import java.math.BigInteger;

public abstract class sprdvh {
    private static final int cfr_renamed_91 = 16;
    private static final int[] cfr_renamed_0;
    public static final String cfr_renamed_1 = "bc_wnaf";
    private static final int[] cfr_renamed_2;
    private static final spreuh[] cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    private static /* synthetic */ spreuh[] cfr_renamed_8634(spreuh[] arg0, int arg1) {
        spreuh[] spreuhArray = new spreuh[arg1];
        System.arraycopy(arg0, 0, spreuhArray, 0, arg0.length);
        return spreuhArray;
    }

    public static byte[] cfr_renamed_1809(int arg0, BigInteger arg1) {
        int n;
        if (arg0 == 2) {
            return sprdvh.cfr_renamed_1810(arg1);
        }
        if (arg0 < 2 || arg0 > 8) {
            throw new IllegalArgumentException(sprjcz.cfr_renamed_9("(\u0001f\u0012{\u001e(Vb\u0003|\u0002/\u0014jVf\u0018/\u0002g\u0013/\u0004n\u0018h\u0013/-=Z/NR"));
        }
        if (arg1.signum() == 0) {
            return cfr_renamed_4;
        }
        byte[] byArray = new byte[arg1.bitLength() + 1];
        int n2 = 1 << arg0;
        int n3 = n2 - 1;
        int n4 = n2 >>> 1;
        boolean bl = false;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 <= arg1.bitLength()) {
            if (arg1.testBit(n) == bl) {
                n6 = ++n;
                continue;
            }
            arg1 = arg1.shiftRight(n);
            int n7 = arg1.intValue() & n3;
            if (bl) {
                ++n7;
            }
            boolean bl2 = bl = (n7 & n4) != 0;
            if (bl) {
                n7 -= n2;
            }
            int n8 = n5;
            n5 = n8 + (n8 > 0 ? n - 1 : n);
            byArray[n5++] = (byte)n7;
            n6 = arg0;
        }
        if (byArray.length > n5) {
            byArray = sprdvh.cfr_renamed_1793(byArray, n5);
        }
        return byArray;
    }

    public static sprssh cfr_renamed_8635(spreuh arg0) {
        return sprdvh.cfr_renamed_8636(arg0.cfr_renamed_1769().cfr_renamed_8637(arg0, cfr_renamed_1));
    }

    public static int cfr_renamed_1807(int arg0) {
        return sprdvh.cfr_renamed_8638(arg0, cfr_renamed_0, 16);
    }

    public static int cfr_renamed_8639(int arg0, int arg1) {
        return sprdvh.cfr_renamed_8638(arg0, cfr_renamed_0, arg1);
    }

    public static /* synthetic */ spreuh[] cfr_renamed_8640(spreuh[] arg0, int arg1) {
        return sprdvh.cfr_renamed_8634(arg0, arg1);
    }

    public static void cfr_renamed_8641(spreuh arg0) {
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        if (null == sprgxh2) {
            return;
        }
        BigInteger bigInteger = sprgxh2.cfr_renamed_1932();
        int n = null == bigInteger ? sprgxh2.cfr_renamed_1938() + 1 : bigInteger.bitLength();
        int n2 = Math.min(16, sprdvh.cfr_renamed_1807(n) + 3);
        sprgxh2.cfr_renamed_8628(arg0, cfr_renamed_1, new sprwth(n2));
    }

    public static sprssh cfr_renamed_8642(spreuh arg0, int arg1, boolean arg2) {
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        return (sprssh)sprgxh2.cfr_renamed_8628(arg0, cfr_renamed_1, new sprxyh(arg1, arg2, arg0, sprgxh2));
    }

    public static int[] cfr_renamed_1811(int arg0, BigInteger arg1) {
        int n;
        if (arg0 == 2) {
            return sprdvh.cfr_renamed_1812(arg1);
        }
        if (arg0 < 2 || arg0 > 16) {
            throw new IllegalArgumentException(sprcez.cfr_renamed_9("-\u0002c\u0011~\u001d-Ug\u0000y\u0001*\u0017oUc\u001b*\u0001b\u0010*\u0007k\u001bm\u0010*.8Y*D<("));
        }
        if (arg1.bitLength() >>> 16 != 0) {
            throw new IllegalArgumentException(sprjcz.cfr_renamed_9("QdQ/\u001bz\u0005{Vg\u0017y\u0013/\u0014f\u0002c\u0013a\u0011{\u001e/J/DQG9"));
        }
        if (arg1.signum() == 0) {
            return cfr_renamed_2;
        }
        int[] nArray = new int[arg1.bitLength() / arg0 + 1];
        int n2 = 1 << arg0;
        int n3 = n2 - 1;
        int n4 = n2 >>> 1;
        boolean bl = false;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 <= arg1.bitLength()) {
            if (arg1.testBit(n) == bl) {
                n6 = ++n;
                continue;
            }
            arg1 = arg1.shiftRight(n);
            int n7 = arg1.intValue() & n3;
            if (bl) {
                ++n7;
            }
            boolean bl2 = bl = (n7 & n4) != 0;
            if (bl) {
                n7 -= n2;
            }
            int n8 = n5 > 0 ? n - 1 : n;
            nArray[n5++] = n7 << 16 | n8;
            n6 = arg0;
        }
        if (nArray.length > n5) {
            nArray = sprdvh.cfr_renamed_1813(nArray, n5);
        }
        return nArray;
    }

    public static int[] cfr_renamed_1812(BigInteger arg0) {
        int n;
        if (arg0.bitLength() >>> 16 != 0) {
            throw new IllegalArgumentException(sprcez.cfr_renamed_9("-\u001e-Ug\u0000y\u0001*\u001dk\u0003oUh\u001c~\u0019o\u001bm\u0001bU6U8+;C"));
        }
        if (arg0.signum() == 0) {
            return cfr_renamed_2;
        }
        BigInteger bigInteger = arg0.shiftLeft(1).add(arg0);
        int n2 = bigInteger.bitLength();
        int[] nArray = new int[n2 >> 1];
        BigInteger bigInteger2 = bigInteger.xor(arg0);
        int n3 = n2 - 1;
        int n4 = 0;
        int n5 = 0;
        int n6 = n = 1;
        while (n6 < n3) {
            if (!bigInteger2.testBit(n)) {
                ++n5;
            } else {
                int n7 = arg0.testBit(n) ? -1 : 1;
                int n8 = n4++;
                ++n;
                nArray[n8] = n7 << 16 | n5;
                n5 = 1;
            }
            n6 = ++n;
        }
        nArray[n4++] = 0x10000 | n5;
        if (nArray.length > n4) {
            nArray = sprdvh.cfr_renamed_1813(nArray, n4);
        }
        return nArray;
    }

    private static /* synthetic */ byte[] cfr_renamed_1793(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, 0, byArray, 0, byArray.length);
        return byArray;
    }

    public static byte[] cfr_renamed_1815(BigInteger arg0, BigInteger arg1) {
        BigInteger bigInteger = arg0;
        byte[] byArray = new byte[Math.max(bigInteger.bitLength(), arg1.bitLength()) + 1];
        BigInteger bigInteger2 = bigInteger;
        BigInteger bigInteger3 = arg1;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = n2;
        while (n5 | n3 || bigInteger2.bitLength() > n4 || bigInteger3.bitLength() > n4) {
            int n6;
            int n7 = (bigInteger2.intValue() >>> n4) + n2 & 7;
            int n8 = (bigInteger3.intValue() >>> n4) + n3 & 7;
            int n9 = n7 & 1;
            if (n9 != 0 && n7 + (n9 -= n7 & 2) == 4 && (n8 & 3) == 2) {
                n9 = -n9;
            }
            if ((n6 = n8 & 1) != 0 && n8 + (n6 -= n8 & 2) == 4 && (n7 & 3) == 2) {
                n6 = -n6;
            }
            if (n2 << 1 == 1 + n9) {
                n2 ^= 1;
            }
            if (n3 << 1 == 1 + n6) {
                n3 ^= 1;
            }
            if (++n4 == 30) {
                n4 = 0;
                bigInteger2 = bigInteger2.shiftRight(30);
                bigInteger3 = bigInteger3.shiftRight(30);
            }
            byArray[n++] = (byte)(n9 << 4 | n6 & 0xF);
            n5 = n2;
        }
        if (byArray.length > n) {
            byArray = sprdvh.cfr_renamed_1793(byArray, n);
        }
        return byArray;
    }

    public static byte[] cfr_renamed_1810(BigInteger arg0) {
        int n;
        if (arg0.signum() == 0) {
            return cfr_renamed_4;
        }
        BigInteger bigInteger = arg0.shiftLeft(1).add(arg0);
        int n2 = bigInteger.bitLength() - 1;
        byte[] byArray = new byte[n2];
        BigInteger bigInteger2 = bigInteger.xor(arg0);
        int n3 = n = 1;
        while (n3 < n2) {
            if (bigInteger2.testBit(n)) {
                int n4 = n - 1;
                int n5 = arg0.testBit(n) ? -1 : 1;
                ++n;
                byArray[n4] = (byte)n5;
            }
            n3 = ++n;
        }
        byArray[n2 - 1] = 1;
        return byArray;
    }

    public static int cfr_renamed_1794(BigInteger arg0) {
        if (arg0.signum() == 0) {
            return 0;
        }
        return arg0.shiftLeft(1).add(arg0).xor(arg0).bitCount();
    }

    public static /* synthetic */ spreuh[] cfr_renamed_2413() {
        return cfr_renamed_3;
    }

    public static sprssh cfr_renamed_8636(sprzi arg0) {
        if (arg0 instanceof sprssh) {
            return (sprssh)arg0;
        }
        return null;
    }

    public static int cfr_renamed_1808(int arg0, int[] arg1) {
        return sprdvh.cfr_renamed_8638(arg0, arg1, 16);
    }

    public static int cfr_renamed_8638(int arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length && arg0 >= arg1[n]) {
            n2 = ++n;
        }
        return Math.max(2, Math.min(arg2, n + 2));
    }

    static {
        int[] nArray = new int[6];
        nArray[0] = 13;
        nArray[1] = 41;
        nArray[2] = 121;
        nArray[3] = 337;
        nArray[4] = 897;
        nArray[5] = 2305;
        cfr_renamed_0 = nArray;
        cfr_renamed_4 = new byte[0];
        cfr_renamed_2 = new int[0];
        cfr_renamed_3 = new spreuh[0];
    }

    private static /* synthetic */ int[] cfr_renamed_1813(int[] arg0, int arg1) {
        int[] nArray = new int[arg1];
        System.arraycopy(arg0, 0, nArray, 0, nArray.length);
        return nArray;
    }

    public static sprssh cfr_renamed_8643(spreuh arg0, sprhe arg1, sprssh arg2, boolean arg3) {
        return (sprssh)arg0.cfr_renamed_1769().cfr_renamed_8628(arg0, cfr_renamed_1, new sprduh(arg2, arg3, arg1));
    }
}

