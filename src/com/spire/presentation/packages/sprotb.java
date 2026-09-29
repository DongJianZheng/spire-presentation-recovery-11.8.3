/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewl;
import com.spire.presentation.packages.sprlb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtb;
import com.spire.presentation.packages.sprxob;
import com.spire.presentation.packages.sprywc;
import java.math.BigInteger;

public abstract class sprotb {
    private static final int[] cfr_renamed_1;
    private static final int[] cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    public static final String cfr_renamed_4 = "bc_wnaf";

    private static /* synthetic */ byte[] cfr_renamed_1793(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, 0, byArray, 0, byArray.length);
        return byArray;
    }

    public static int cfr_renamed_1794(BigInteger arg0) {
        if (arg0.signum() == 0) {
            return 0;
        }
        return arg0.shiftLeft(1).add(arg0).xor(arg0).bitCount();
    }

    public static sprrlb cfr_renamed_1795(sprrlb arg0, int arg1, boolean arg2, sprlb arg3) {
        int n;
        sprrlb[] sprrlbArray;
        sprrlb sprrlb2 = arg0;
        sprpib sprpib2 = sprrlb2.cfr_renamed_1769();
        sprxob sprxob2 = sprotb.cfr_renamed_1796(sprrlb2, arg1, arg2);
        sprrlb sprrlb3 = arg3.cfr_renamed_1797(arg0);
        sprxob sprxob3 = sprotb.cfr_renamed_1798(sprpib2.cfr_renamed_1784(sprrlb3, cfr_renamed_4));
        sprrlb sprrlb4 = sprxob2.cfr_renamed_1799();
        if (sprrlb4 != null) {
            sprrlbArray = arg3.cfr_renamed_1797(sprrlb4);
            sprxob3.cfr_renamed_1800((sprrlb)sprrlbArray);
        }
        sprrlbArray = sprxob2.cfr_renamed_1777();
        sprrlb[] sprrlbArray2 = new sprrlb[sprrlbArray.length];
        int n2 = n = 0;
        while (n2 < sprrlbArray.length) {
            int n3 = n++;
            sprrlbArray2[n3] = arg3.cfr_renamed_1797(sprrlbArray[n3]);
            n2 = n;
        }
        sprxob3.cfr_renamed_1801(sprrlbArray2);
        if (arg2) {
            int n4;
            sprrlb[] sprrlbArray3 = new sprrlb[sprrlbArray2.length];
            int n5 = n4 = 0;
            while (n5 < sprrlbArray3.length) {
                int n6 = n4++;
                sprrlbArray3[n6] = sprrlbArray2[n6].cfr_renamed_1773();
                n5 = n4;
            }
            sprxob3.cfr_renamed_1802(sprrlbArray3);
        }
        sprpib2.cfr_renamed_1789(sprrlb3, cfr_renamed_4, sprxob3);
        return sprrlb3;
    }

    static {
        int[] nArray = new int[6];
        nArray[0] = 13;
        nArray[1] = 41;
        nArray[2] = 121;
        nArray[3] = 337;
        nArray[4] = 897;
        nArray[5] = 2305;
        cfr_renamed_2 = nArray;
        cfr_renamed_3 = new byte[0];
        cfr_renamed_1 = new int[0];
    }

    public static sprxob cfr_renamed_1796(sprrlb arg0, int arg1, boolean arg2) {
        int n;
        Object object;
        int n2;
        int n3;
        sprpib sprpib2 = arg0.cfr_renamed_1769();
        sprxob sprxob2 = sprotb.cfr_renamed_1798(sprpib2.cfr_renamed_1784(arg0, cfr_renamed_4));
        sprrlb[] sprrlbArray = sprxob2.cfr_renamed_1777();
        if (sprrlbArray == null) {
            sprrlb[] sprrlbArray2 = new sprrlb[1];
            sprrlbArray2[0] = arg0;
            sprrlbArray = sprrlbArray2;
        }
        if ((n3 = sprrlbArray.length) < (n2 = 1 << Math.max(0, arg1 - 2))) {
            sprpib sprpib3;
            sprrlbArray = sprotb.cfr_renamed_1803(sprrlbArray, n2);
            if (n2 == 2) {
                sprpib3 = sprpib2;
                sprrlbArray[1] = sprrlbArray[0].cfr_renamed_1804();
            } else {
                object = sprxob2.cfr_renamed_1799();
                if (object == null) {
                    object = sprrlbArray[0].cfr_renamed_1774();
                    sprxob2.cfr_renamed_1800((sprrlb)object);
                }
                int n4 = n = n3;
                while (n4 < n2) {
                    sprrlbArray[++n] = object.cfr_renamed_1772(sprrlbArray[n - 1]);
                    n4 = n;
                }
                sprpib3 = sprpib2;
            }
            sprpib3.cfr_renamed_1805(sprrlbArray);
        }
        sprxob2.cfr_renamed_1801(sprrlbArray);
        if (arg2) {
            int n5;
            object = sprxob2.cfr_renamed_1806();
            if (object == null) {
                n = 0;
                object = new sprrlb[n2];
                n5 = n;
            } else {
                n = ((sprrlb[])object).length;
                if (n < n2) {
                    object = sprotb.cfr_renamed_1803(object, n2);
                }
                n5 = n;
            }
            while (n5 < n2) {
                int n6 = n++;
                object[n6] = sprrlbArray[n6].cfr_renamed_1773();
                n5 = n;
            }
            sprxob2.cfr_renamed_1802((sprrlb[])object);
        }
        sprpib2.cfr_renamed_1789(arg0, cfr_renamed_4, sprxob2);
        return sprxob2;
    }

    public static int cfr_renamed_1807(int arg0) {
        return sprotb.cfr_renamed_1808(arg0, cfr_renamed_2);
    }

    public static byte[] cfr_renamed_1809(int arg0, BigInteger arg1) {
        int n;
        if (arg0 == 2) {
            return sprotb.cfr_renamed_1810(arg1);
        }
        if (arg0 < 2 || arg0 > 8) {
            throw new IllegalArgumentException(sprywc.cfr_renamed_9("Qc\u001fp\u0002|Q4\u001ba\u0005`Vv\u00134\u001fzV`\u001eqVf\u0017z\u0011qVOD8V,+"));
        }
        if (arg1.signum() == 0) {
            return cfr_renamed_3;
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
            byArray = sprotb.cfr_renamed_1793(byArray, n5);
        }
        return byArray;
    }

    private static /* synthetic */ sprrlb[] cfr_renamed_1803(sprrlb[] arg0, int arg1) {
        sprrlb[] sprrlbArray = new sprrlb[arg1];
        System.arraycopy(arg0, 0, sprrlbArray, 0, arg0.length);
        return sprrlbArray;
    }

    public static int[] cfr_renamed_1811(int arg0, BigInteger arg1) {
        int n;
        if (arg0 == 2) {
            return sprotb.cfr_renamed_1812(arg1);
        }
        if (arg0 < 2 || arg0 > 16) {
            throw new IllegalArgumentException(sprewl.cfr_renamed_9("2\u001a|\ta\u00052Mx\u0018f\u00195\u000fpM|\u00035\u0019}\b5\u001ft\u0003r\b56'A5\\#0"));
        }
        if (arg1.bitLength() >>> 16 != 0) {
            throw new IllegalArgumentException(sprywc.cfr_renamed_9("3\u001d3Vy\u0003g\u00024\u001eu\u0000qVv\u001f`\u001aq\u0018s\u0002|V(V&(%@"));
        }
        if (arg1.signum() == 0) {
            return cfr_renamed_1;
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
            nArray = sprotb.cfr_renamed_1813(nArray, n5);
        }
        return nArray;
    }

    public static byte[] cfr_renamed_1810(BigInteger arg0) {
        int n;
        if (arg0.signum() == 0) {
            return cfr_renamed_3;
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

    public static sprxob cfr_renamed_1814(sprrlb arg0) {
        return sprotb.cfr_renamed_1798(arg0.cfr_renamed_1769().cfr_renamed_1784(arg0, cfr_renamed_4));
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
            byArray = sprotb.cfr_renamed_1793(byArray, n);
        }
        return byArray;
    }

    public static int cfr_renamed_1808(int arg0, int[] arg1) {
        int n;
        block2: {
            int n2;
            int n3 = n2 = 0;
            while (n3 < arg1.length) {
                if (arg0 < arg1[n2]) {
                    n = n2;
                    break block2;
                }
                n3 = ++n2;
            }
            n = n2;
        }
        return n + 2;
    }

    private static /* synthetic */ int[] cfr_renamed_1813(int[] arg0, int arg1) {
        int[] nArray = new int[arg1];
        System.arraycopy(arg0, 0, nArray, 0, nArray.length);
        return nArray;
    }

    public static int[] cfr_renamed_1812(BigInteger arg0) {
        int n;
        if (arg0.bitLength() >>> 16 != 0) {
            throw new IllegalArgumentException(sprewl.cfr_renamed_9("2\u00062Mx\u0018f\u00195\u0005t\u001bpMw\u0004a\u0001p\u0003r\u0019}M)M'3$["));
        }
        if (arg0.signum() == 0) {
            return cfr_renamed_1;
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
            nArray = sprotb.cfr_renamed_1813(nArray, n4);
        }
        return nArray;
    }

    public static sprxob cfr_renamed_1798(sprtb arg0) {
        if (arg0 != null && arg0 instanceof sprxob) {
            return (sprxob)arg0;
        }
        return new sprxob();
    }
}

