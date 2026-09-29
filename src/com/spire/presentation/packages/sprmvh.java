/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhe;
import com.spire.presentation.packages.spriifa;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sprpg;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprqvh;
import com.spire.presentation.packages.sprssh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxnh;
import com.spire.presentation.packages.sprzh;
import com.spire.presentation.packages.sprzph;
import java.math.BigInteger;

public class sprmvh {
    private static /* synthetic */ spreuh cfr_renamed_8946(spreuh[] arg0, spreuh[] arg1, byte[] arg2, spreuh[] arg3, spreuh[] arg4, byte[] arg5) {
        int n;
        spreuh spreuh2;
        int n2 = Math.max(arg2.length, arg5.length);
        spreuh spreuh3 = spreuh2 = arg0[0].cfr_renamed_1769().cfr_renamed_1770();
        int n3 = 0;
        int n4 = n = n2 - 1;
        while (n4 >= 0) {
            byte by;
            byte by2 = n < arg2.length ? arg2[n] : (byte)0;
            byte by3 = by = n < arg5.length ? arg5[n] : (byte)0;
            if ((by2 | by) == 0) {
                ++n3;
            } else {
                spreuh[] spreuhArray;
                int n5;
                spreuh spreuh4 = spreuh2;
                if (by2 != 0) {
                    n5 = Math.abs(by2);
                    spreuhArray = by2 < 0 ? arg1 : arg0;
                    spreuh4 = spreuh4.cfr_renamed_8630(spreuhArray[n5 >>> 1]);
                }
                if (by != 0) {
                    n5 = Math.abs(by);
                    spreuhArray = by < 0 ? arg4 : arg3;
                    spreuh4 = spreuh4.cfr_renamed_8630(spreuhArray[n5 >>> 1]);
                }
                if (n3 > 0) {
                    spreuh3 = spreuh3.cfr_renamed_1771(n3);
                    n3 = 0;
                }
                spreuh3 = spreuh3.cfr_renamed_8652(spreuh4);
            }
            n4 = --n;
        }
        if (n3 > 0) {
            spreuh3 = spreuh3.cfr_renamed_1771(n3);
        }
        return spreuh3;
    }

    public static spreuh cfr_renamed_8947(sprpg arg0, spreuh[] arg1, BigInteger[] arg2) {
        int n;
        int n2 = arg1.length;
        int n3 = n2 << 1;
        boolean[] blArray = new boolean[n3];
        sprssh[] sprsshArray = new sprssh[n3];
        byte[][] byArrayArray = new byte[n3][];
        sprhe sprhe2 = arg0.cfr_renamed_1934();
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n << 1;
            int n6 = n5 + 1;
            BigInteger bigInteger = arg2[n5];
            blArray[n5] = bigInteger.signum() < 0;
            bigInteger = bigInteger.abs();
            BigInteger bigInteger2 = arg2[n6];
            blArray[n6] = bigInteger2.signum() < 0;
            bigInteger2 = bigInteger2.abs();
            int n7 = sprdvh.cfr_renamed_8639(Math.max(bigInteger.bitLength(), bigInteger2.bitLength()), 8);
            spreuh spreuh2 = arg1[n];
            sprssh sprssh2 = sprdvh.cfr_renamed_8642(spreuh2, n7, true);
            sprssh sprssh3 = sprdvh.cfr_renamed_8643(sprqvh.cfr_renamed_8898(arg0, spreuh2), sprhe2, sprssh2, true);
            int n8 = Math.min(8, sprssh2.cfr_renamed_1942());
            int n9 = Math.min(8, sprssh3.cfr_renamed_1942());
            sprsshArray[n5] = sprssh2;
            sprsshArray[n6] = sprssh3;
            byArrayArray[n5] = sprdvh.cfr_renamed_1809(n8, bigInteger);
            byArrayArray[n6] = sprdvh.cfr_renamed_1809(n9, bigInteger2);
            n4 = ++n;
        }
        return sprmvh.cfr_renamed_8948(blArray, sprsshArray, byArrayArray);
    }

    public static boolean cfr_renamed_8673(sprgxh arg0) {
        return sprmvh.cfr_renamed_8949(arg0.cfr_renamed_845());
    }

    public static void cfr_renamed_8950(sprlsh[] arg0, int arg1, int arg2) {
        sprmvh.cfr_renamed_8939(arg0, arg1, arg2, null);
    }

    public static spreuh cfr_renamed_8951(spreuh arg0, BigInteger arg1, spreuh arg2, BigInteger arg3) {
        spreuh spreuh2 = arg0;
        arg2 = sprmvh.cfr_renamed_8952(spreuh2.cfr_renamed_1769(), arg2);
        return sprmvh.cfr_renamed_8953(sprmvh.cfr_renamed_8954(spreuh2, arg1, arg2, arg3));
    }

    public static spreuh cfr_renamed_8955(spreuh[] arg0, BigInteger[] arg1, sprzh arg2) {
        BigInteger bigInteger = arg0[0].cfr_renamed_1769().cfr_renamed_1932();
        int n = arg0.length;
        BigInteger[] bigIntegerArray = new BigInteger[n << 1];
        int n2 = 0;
        int n3 = 0;
        int n4 = n2;
        while (n4 < n) {
            BigInteger[] bigIntegerArray2 = arg2.cfr_renamed_1933(arg1[n2].mod(bigInteger));
            bigIntegerArray[n3++] = bigIntegerArray2[0];
            bigIntegerArray[n3++] = bigIntegerArray2[1];
            n4 = ++n2;
        }
        if (arg2.spr\u3180()) {
            return sprmvh.cfr_renamed_8947(arg2, arg0, bigIntegerArray);
        }
        spreuh[] spreuhArray = new spreuh[n << 1];
        n3 = 0;
        int n5 = 0;
        int n6 = n3;
        while (n6 < n) {
            spreuh spreuh2 = arg0[n3];
            spreuh spreuh3 = sprqvh.cfr_renamed_8898(arg2, spreuh2);
            spreuhArray[n5++] = spreuh2;
            spreuhArray[n5++] = spreuh3;
            n6 = ++n3;
        }
        return sprmvh.cfr_renamed_8956(spreuhArray, bigIntegerArray);
    }

    public static boolean cfr_renamed_8949(sprjd arg0) {
        return arg0.cfr_renamed_1763() == 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static spreuh cfr_renamed_8957(spreuh[] arg0, BigInteger[] arg1) {
        int n;
        if (arg0 == null || arg1 == null || arg0.length != arg1.length || arg0.length < 1) {
            throw new IllegalArgumentException(sprjaaa.cfr_renamed_9("?\u000e&\u000f;A.\u000f+A<\u0002.\r.\u0013o\u0000=\u0013.\u0018<A<\t \u0014#\u0005o\u0003*A!\u000e!L!\u0014#\rcA.\u000f+A \u0007o\u0004>\u0014.\rcA!\u000e!L5\u0004=\u000ecA#\u0004!\u0006;\t"));
        }
        int n2 = arg0.length;
        switch (n2) {
            case 1: {
                return arg0[0].cfr_renamed_1830(arg1[0]);
            }
            case 2: {
                return sprmvh.cfr_renamed_8958(arg0[0], arg1[0], arg0[1], arg1[1]);
            }
        }
        spreuh spreuh2 = arg0[0];
        sprgxh sprgxh2 = spreuh2.cfr_renamed_1769();
        spreuh[] spreuhArray = new spreuh[n2];
        spreuhArray[0] = spreuh2;
        int n3 = n = 1;
        while (n3 < n2) {
            int n4 = n++;
            spreuhArray[n4] = sprmvh.cfr_renamed_8952(sprgxh2, arg0[n4]);
            n3 = n;
        }
        sprpg sprpg2 = sprgxh2.cfr_renamed_1993();
        if (sprpg2 instanceof sprzh) {
            return sprmvh.cfr_renamed_8953(sprmvh.cfr_renamed_8955(spreuhArray, arg1, (sprzh)sprpg2));
        }
        return sprmvh.cfr_renamed_8953(sprmvh.cfr_renamed_8956(spreuhArray, arg1));
    }

    public static spreuh cfr_renamed_8958(spreuh arg0, BigInteger arg1, spreuh arg2, BigInteger arg3) {
        Object object;
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        arg2 = sprmvh.cfr_renamed_8952(sprgxh2, arg2);
        if (sprgxh2 instanceof sprqsh && ((sprqsh)(object = (sprqsh)sprgxh2)).cfr_renamed_1841()) {
            return sprmvh.cfr_renamed_8953(arg0.cfr_renamed_1830(arg1).cfr_renamed_8630(arg2.cfr_renamed_1830(arg3)));
        }
        object = sprgxh2.cfr_renamed_1993();
        if (object instanceof sprzh) {
            spreuh[] spreuhArray = new spreuh[2];
            spreuhArray[0] = arg0;
            spreuhArray[1] = arg2;
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = arg1;
            bigIntegerArray[1] = arg3;
            return sprmvh.cfr_renamed_8953(sprmvh.cfr_renamed_8955(spreuhArray, bigIntegerArray, (sprzh)object));
        }
        return sprmvh.cfr_renamed_8953(sprmvh.cfr_renamed_8899(arg0, arg1, arg2, arg3));
    }

    public static boolean cfr_renamed_8665(sprgxh arg0) {
        return sprmvh.cfr_renamed_8959(arg0.cfr_renamed_845());
    }

    private static /* synthetic */ spreuh cfr_renamed_8948(boolean[] arg0, sprssh[] arg1, byte[][] arg2) {
        int n;
        spreuh spreuh2;
        int n2;
        int n3 = 0;
        int n4 = arg2.length;
        int n5 = n2 = 0;
        while (n5 < n4) {
            byte[] byArray = arg2[n2];
            n3 = Math.max(n3, byArray.length);
            n5 = ++n2;
        }
        sprgxh sprgxh2 = arg1[0].cfr_renamed_1777()[0].cfr_renamed_1769();
        spreuh spreuh3 = spreuh2 = sprgxh2.cfr_renamed_1770();
        int n6 = 0;
        int n7 = n = n3 - 1;
        while (n7 >= 0) {
            int n8;
            spreuh spreuh4 = spreuh2;
            int n9 = n8 = 0;
            while (n9 < n4) {
                byte by;
                byte[] byArray = arg2[n8];
                byte by2 = by = n < byArray.length ? byArray[n] : (byte)0;
                if (by != 0) {
                    boolean[] blArray;
                    boolean bl;
                    int n10 = Math.abs(by);
                    sprssh sprssh2 = arg1[n8];
                    if (by < 0) {
                        bl = true;
                        blArray = arg0;
                    } else {
                        bl = false;
                        blArray = arg0;
                    }
                    spreuh[] spreuhArray = bl == blArray[n8] ? sprssh2.cfr_renamed_1777() : sprssh2.cfr_renamed_1806();
                    spreuh4 = spreuh4.cfr_renamed_8630(spreuhArray[n10 >>> 1]);
                }
                n9 = ++n8;
            }
            if (spreuh4 == spreuh2) {
                ++n6;
            } else {
                if (n6 > 0) {
                    spreuh3 = spreuh3.cfr_renamed_1771(n6);
                    n6 = 0;
                }
                spreuh3 = spreuh3.cfr_renamed_8652(spreuh4);
            }
            n7 = --n;
        }
        if (n6 > 0) {
            spreuh3 = spreuh3.cfr_renamed_1771(n6);
        }
        return spreuh3;
    }

    public static spreuh cfr_renamed_8953(spreuh arg0) {
        if (!arg0.cfr_renamed_8919()) {
            throw new IllegalStateException(spriifa.cfr_renamed_9("4\u001c\u000b\u0013\u0011\u001b\u0019R\u000f\u0017\u000e\u0007\u0011\u0006"));
        }
        return arg0;
    }

    public static spreuh cfr_renamed_8956(spreuh[] arg0, BigInteger[] arg1) {
        int n;
        int n2 = arg0.length;
        boolean[] blArray = new boolean[n2];
        sprssh[] sprsshArray = new sprssh[n2];
        byte[][] byArrayArray = new byte[n2][];
        int n3 = n = 0;
        while (n3 < n2) {
            BigInteger bigInteger = arg1[n];
            blArray[n] = bigInteger.signum() < 0;
            bigInteger = bigInteger.abs();
            int n4 = sprdvh.cfr_renamed_8639(bigInteger.bitLength(), 8);
            sprssh sprssh2 = sprdvh.cfr_renamed_8642(arg0[n], n4, true);
            int n5 = Math.min(8, sprssh2.cfr_renamed_1942());
            int n6 = n++;
            sprsshArray[n6] = sprssh2;
            byArrayArray[n6] = sprdvh.cfr_renamed_1809(n5, bigInteger);
            n3 = n;
        }
        return sprmvh.cfr_renamed_8948(blArray, sprsshArray, byArrayArray);
    }

    public static boolean cfr_renamed_8959(sprjd arg0) {
        return arg0.cfr_renamed_1763() > 1 && arg0.cfr_renamed_1762().equals(sprck.cfr_renamed_1) && arg0 instanceof sprik;
    }

    public static spreuh cfr_renamed_8954(spreuh arg0, BigInteger arg1, spreuh arg2, BigInteger arg3) {
        spreuh spreuh2 = arg0;
        sprgxh sprgxh2 = spreuh2.cfr_renamed_1769();
        spreuh spreuh3 = sprgxh2.cfr_renamed_1770();
        spreuh spreuh4 = spreuh2.cfr_renamed_8630(arg2);
        spreuh spreuh5 = spreuh2.cfr_renamed_8929(arg2);
        spreuh[] spreuhArray = new spreuh[4];
        spreuhArray[0] = arg2;
        spreuhArray[1] = spreuh5;
        spreuhArray[2] = arg0;
        spreuhArray[3] = spreuh4;
        spreuh[] spreuhArray2 = spreuhArray;
        sprgxh2.cfr_renamed_8691(spreuhArray2);
        spreuh[] spreuhArray3 = new spreuh[9];
        spreuhArray3[0] = spreuhArray2[3].cfr_renamed_1773();
        spreuhArray3[1] = spreuhArray2[2].cfr_renamed_1773();
        spreuhArray3[2] = spreuhArray2[1].cfr_renamed_1773();
        spreuhArray3[3] = spreuhArray2[0].cfr_renamed_1773();
        spreuhArray3[4] = spreuh3;
        spreuhArray3[5] = spreuhArray2[0];
        spreuhArray3[6] = spreuhArray2[1];
        spreuhArray3[7] = spreuhArray2[2];
        spreuhArray3[8] = spreuhArray2[3];
        spreuh[] spreuhArray4 = spreuhArray3;
        byte[] byArray = sprdvh.cfr_renamed_1815(arg1, arg3);
        spreuh spreuh6 = spreuh3;
        int n = byArray.length;
        while (--n >= 0) {
            byte by = byArray[n];
            int n2 = by << 24 >> 28;
            int n3 = by << 28 >> 28;
            int n4 = 4 + n2 * 3 + n3;
            spreuh6 = spreuh6.cfr_renamed_8652(spreuhArray4[n4]);
        }
        return spreuh6;
    }

    public static spreuh cfr_renamed_8899(spreuh arg0, BigInteger arg1, spreuh arg2, BigInteger arg3) {
        boolean bl = arg1.signum() < 0;
        boolean bl2 = arg3.signum() < 0;
        BigInteger bigInteger = arg1.abs();
        BigInteger bigInteger2 = arg3.abs();
        int n = sprdvh.cfr_renamed_8639(bigInteger.bitLength(), 8);
        int n2 = sprdvh.cfr_renamed_8639(bigInteger2.bitLength(), 8);
        sprssh sprssh2 = sprdvh.cfr_renamed_8642(arg0, n, true);
        sprssh sprssh3 = sprdvh.cfr_renamed_8642(arg2, n2, true);
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        int n3 = sproyh.cfr_renamed_8900(sprgxh2);
        if (!bl && !bl2 && arg1.bitLength() <= n3 && arg3.bitLength() <= n3 && sprssh2.cfr_renamed_8644() && sprssh3.cfr_renamed_8644()) {
            return sprmvh.cfr_renamed_8960(arg0, arg1, arg2, arg3);
        }
        int n4 = Math.min(8, sprssh2.cfr_renamed_1942());
        n3 = Math.min(8, sprssh3.cfr_renamed_1942());
        sprssh sprssh4 = sprssh2;
        spreuh[] spreuhArray = bl ? sprssh4.cfr_renamed_1806() : sprssh4.cfr_renamed_1777();
        sprssh sprssh5 = sprssh3;
        spreuh[] spreuhArray2 = bl2 ? sprssh5.cfr_renamed_1806() : sprssh5.cfr_renamed_1777();
        sprssh sprssh6 = sprssh2;
        spreuh[] spreuhArray3 = bl ? sprssh6.cfr_renamed_1777() : sprssh6.cfr_renamed_1806();
        sprssh sprssh7 = sprssh3;
        spreuh[] spreuhArray4 = bl2 ? sprssh7.cfr_renamed_1777() : sprssh7.cfr_renamed_1806();
        byte[] byArray = sprdvh.cfr_renamed_1809(n4, bigInteger);
        byte[] byArray2 = sprdvh.cfr_renamed_1809(n3, bigInteger2);
        return sprmvh.cfr_renamed_8946(spreuhArray, spreuhArray3, byArray, spreuhArray2, spreuhArray4, byArray2);
    }

    public static void cfr_renamed_8939(sprlsh[] arg0, int arg1, int arg2, sprlsh arg3) {
        sprlsh[] sprlshArray = new sprlsh[arg2];
        sprlsh[] sprlshArray2 = sprlshArray;
        sprlshArray[0] = arg0[arg1];
        int n = 0;
        while (++n < arg2) {
            sprlshArray2[n] = sprlshArray2[n - 1].cfr_renamed_8682(arg0[arg1 + n]);
        }
        --n;
        if (arg3 != null) {
            sprlshArray2[n] = sprlshArray2[n].cfr_renamed_8682(arg3);
        }
        sprlsh sprlsh2 = sprlshArray2[n].cfr_renamed_952();
        int n2 = n;
        while (n2 > 0) {
            int n3 = arg1 + n;
            sprlsh sprlsh3 = arg0[n3];
            arg0[n3] = sprlshArray2[--n].cfr_renamed_8682(sprlsh2);
            sprlsh2 = sprlsh2.cfr_renamed_8682(sprlsh3);
            n2 = n;
        }
        arg0[arg1] = sprlsh2;
    }

    public static spreuh cfr_renamed_8961(spreuh arg0) {
        if (!arg0.cfr_renamed_1974()) {
            throw new IllegalStateException(sprjaaa.cfr_renamed_9("(!\u0017.\r&\u0005o\u0011 \b!\u0015"));
        }
        return arg0;
    }

    private static /* synthetic */ spreuh cfr_renamed_8960(spreuh arg0, BigInteger arg1, spreuh arg2, BigInteger arg3) {
        int n;
        int n2;
        sprgxh sprgxh2 = arg0.cfr_renamed_1769();
        int n3 = sproyh.cfr_renamed_8900(sprgxh2);
        if (arg1.bitLength() > n3 || arg3.bitLength() > n3) {
            throw new IllegalStateException(spriifa.cfr_renamed_9("\u001b\u001b\u0005\u0017\u0019_\r\u001d\u0014\u001c\tR\u001e\u001d\u0010\u0010]\u0016\u0012\u0017\u000e\u001cZ\u0006]\u0001\b\u0002\r\u001d\u000f\u0006]\u0001\u001e\u0013\u0011\u0013\u000f\u0001]\u001e\u001c\u0000\u001a\u0017\u000fR\t\u001a\u001c\u001c]\u0006\u0015\u0017]\u0011\b\u0000\u000b\u0017]\u001d\u000f\u0016\u0018\u0000"));
        }
        sprxnh sprxnh2 = sproyh.cfr_renamed_8902(arg0);
        sprxnh sprxnh3 = sproyh.cfr_renamed_8902(arg2);
        sprxnh sprxnh4 = sprxnh2;
        sprfk sprfk2 = sprxnh4.cfr_renamed_8905();
        sprfk sprfk3 = sprxnh3.cfr_renamed_8905();
        int n4 = sprxnh4.cfr_renamed_1942();
        if (n4 != (n2 = sprxnh3.cfr_renamed_1942())) {
            sprzph sprzph2 = new sprzph();
            spreuh spreuh2 = sprzph2.cfr_renamed_8926(arg0, arg1);
            spreuh spreuh3 = sprzph2.cfr_renamed_8926(arg2, arg3);
            return spreuh2.cfr_renamed_8630(spreuh3);
        }
        int n5 = n4;
        int n6 = (n3 + n5 - 1) / n5;
        spreuh spreuh4 = sprgxh2.cfr_renamed_1770();
        int n7 = n6 * n5;
        int[] nArray = sprvih.cfr_renamed_1720(n7, arg1);
        int[] nArray2 = sprvih.cfr_renamed_1720(n7, arg3);
        int n8 = n7 - 1;
        int n9 = n = 0;
        while (n9 < n6) {
            int n10 = 0;
            int n11 = 0;
            int n12 = n8 - n;
            while (n12 >= 0) {
                int n13;
                int n14 = nArray[n13 >>> 5] >>> (n13 & 0x1F);
                n10 ^= n14 >>> 1;
                n10 <<= 1;
                n10 ^= n14;
                int n15 = nArray2[n13 >>> 5] >>> (n13 & 0x1F);
                n11 ^= n15 >>> 1;
                n11 <<= 1;
                n11 ^= n15;
                n12 = n13 - n6;
            }
            spreuh spreuh5 = sprfk2.cfr_renamed_8701(n10);
            spreuh spreuh6 = sprfk3.cfr_renamed_8701(n11);
            spreuh spreuh7 = spreuh5.cfr_renamed_8630(spreuh6);
            spreuh4 = spreuh4.cfr_renamed_8652(spreuh7);
            n9 = ++n;
        }
        return spreuh4.cfr_renamed_8630(sprxnh2.cfr_renamed_8906()).cfr_renamed_8630(sprxnh3.cfr_renamed_8906());
    }

    public static spreuh cfr_renamed_8952(sprgxh arg0, spreuh arg1) {
        sprgxh sprgxh2 = arg1.cfr_renamed_1769();
        if (!arg0.cfr_renamed_8896(sprgxh2)) {
            throw new IllegalArgumentException(sprjaaa.cfr_renamed_9("1 \b!\u0015o\f:\u0012;A-\u0004o\u000e!A;\t*A<\u0000\"\u0004o\u0002:\u00139\u0004"));
        }
        return arg0.cfr_renamed_8928(arg1);
    }

    public static spreuh cfr_renamed_8897(sprpg arg0, spreuh arg1, BigInteger arg2, BigInteger arg3) {
        boolean bl = arg2.signum() < 0;
        boolean bl2 = arg3.signum() < 0;
        arg2 = arg2.abs();
        arg3 = arg3.abs();
        sprssh sprssh2 = sprdvh.cfr_renamed_8642(arg1, sprdvh.cfr_renamed_8639(Math.max(arg2.bitLength(), arg3.bitLength()), 8), true);
        sprssh sprssh3 = sprdvh.cfr_renamed_8643(sprqvh.cfr_renamed_8898(arg0, arg1), arg0.cfr_renamed_1934(), sprssh2, true);
        int n = Math.min(8, sprssh2.cfr_renamed_1942());
        int n2 = Math.min(8, sprssh3.cfr_renamed_1942());
        sprssh sprssh4 = sprssh2;
        spreuh[] spreuhArray = bl ? sprssh4.cfr_renamed_1806() : sprssh4.cfr_renamed_1777();
        sprssh sprssh5 = sprssh3;
        spreuh[] spreuhArray2 = bl2 ? sprssh5.cfr_renamed_1806() : sprssh5.cfr_renamed_1777();
        sprssh sprssh6 = sprssh2;
        spreuh[] spreuhArray3 = bl ? sprssh6.cfr_renamed_1777() : sprssh6.cfr_renamed_1806();
        sprssh sprssh7 = sprssh3;
        spreuh[] spreuhArray4 = bl2 ? sprssh7.cfr_renamed_1777() : sprssh7.cfr_renamed_1806();
        byte[] byArray = sprdvh.cfr_renamed_1809(n, arg2);
        byte[] byArray2 = sprdvh.cfr_renamed_1809(n2, arg3);
        return sprmvh.cfr_renamed_8946(spreuhArray, spreuhArray3, byArray, spreuhArray2, spreuhArray4, byArray2);
    }

    public static spreuh cfr_renamed_8962(sprgxh arg0, spreuh arg1) {
        sprgxh sprgxh2 = arg1.cfr_renamed_1769();
        if (!arg0.cfr_renamed_8896(sprgxh2)) {
            throw new IllegalArgumentException(spriifa.cfr_renamed_9("\"\u0012\u001b\u0013\u0006]\u001f\b\u0001\tR\u001f\u0017]\u001d\u0013R\t\u001a\u0018R\u000e\u0013\u0010\u0017]\u0011\b\u0000\u000b\u0017"));
        }
        return arg0.cfr_renamed_2002(arg1.cfr_renamed_1972(false));
    }

    public static spreuh cfr_renamed_8921(spreuh arg0, BigInteger arg1) {
        BigInteger bigInteger = arg1.abs();
        spreuh spreuh2 = arg0.cfr_renamed_1769().cfr_renamed_1770();
        int n = bigInteger.bitLength();
        if (n > 0) {
            int n2;
            if (bigInteger.testBit(0)) {
                spreuh2 = arg0;
            }
            int n3 = n2 = 1;
            while (n3 < n) {
                arg0 = arg0.cfr_renamed_1774();
                if (bigInteger.testBit(n2)) {
                    spreuh2 = spreuh2.cfr_renamed_8630(arg0);
                }
                n3 = ++n2;
            }
        }
        if (arg1.signum() < 0) {
            return spreuh2.cfr_renamed_1773();
        }
        return spreuh2;
    }
}

