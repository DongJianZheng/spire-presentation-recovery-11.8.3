/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbb;
import com.spire.presentation.packages.sprcb;
import com.spire.presentation.packages.sprdb;
import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprlb;
import com.spire.presentation.packages.sprlsy;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprxob;
import com.spire.presentation.packages.sprzaq;
import com.spire.presentation.packages.sprzb;
import java.math.BigInteger;

public class sprunb {
    public static sprrlb cfr_renamed_2004(sprrlb arg0, BigInteger arg1, sprrlb arg2, BigInteger arg3) {
        sprrlb sprrlb2 = arg0;
        sprpib sprpib2 = sprrlb2.cfr_renamed_1769();
        sprrlb sprrlb3 = sprpib2.cfr_renamed_1770();
        sprrlb sprrlb4 = sprrlb2.cfr_renamed_1772(arg2);
        sprrlb sprrlb5 = sprrlb2.cfr_renamed_1975(arg2);
        sprrlb[] sprrlbArray = new sprrlb[4];
        sprrlbArray[0] = arg2;
        sprrlbArray[1] = sprrlb5;
        sprrlbArray[2] = arg0;
        sprrlbArray[3] = sprrlb4;
        sprrlb[] sprrlbArray2 = sprrlbArray;
        sprpib2.cfr_renamed_1805(sprrlbArray2);
        sprrlb[] sprrlbArray3 = new sprrlb[9];
        sprrlbArray3[0] = sprrlbArray2[3].cfr_renamed_1773();
        sprrlbArray3[1] = sprrlbArray2[2].cfr_renamed_1773();
        sprrlbArray3[2] = sprrlbArray2[1].cfr_renamed_1773();
        sprrlbArray3[3] = sprrlbArray2[0].cfr_renamed_1773();
        sprrlbArray3[4] = sprrlb3;
        sprrlbArray3[5] = sprrlbArray2[0];
        sprrlbArray3[6] = sprrlbArray2[1];
        sprrlbArray3[7] = sprrlbArray2[2];
        sprrlbArray3[8] = sprrlbArray2[3];
        sprrlb[] sprrlbArray4 = sprrlbArray3;
        byte[] byArray = sprotb.cfr_renamed_1815(arg1, arg3);
        sprrlb sprrlb6 = sprrlb3;
        int n = byArray.length;
        while (--n >= 0) {
            byte by = byArray[n];
            int n2 = by << 24 >> 28;
            int n3 = by << 28 >> 28;
            int n4 = 4 + n2 * 3 + n3;
            sprrlb6 = sprrlb6.cfr_renamed_1697(sprrlbArray4[n4]);
        }
        return sprrlb6;
    }

    public static sprrlb cfr_renamed_2005(sprrlb arg0) {
        if (!arg0.cfr_renamed_1974()) {
            throw new IllegalArgumentException(sprzaq.cfr_renamed_9("s\u0003L\fV\u0004^MJ\u0002S\u0003N"));
        }
        return arg0;
    }

    public static sprrlb cfr_renamed_2006(sprrlb arg0, BigInteger arg1, sprrlb arg2, BigInteger arg3) {
        Object object;
        sprpib sprpib2 = arg0.cfr_renamed_1769();
        arg2 = sprunb.cfr_renamed_2007(sprpib2, arg2);
        if (sprpib2 instanceof sprktb && ((sprktb)(object = (sprktb)sprpib2)).cfr_renamed_1841()) {
            return sprunb.cfr_renamed_2005(arg0.cfr_renamed_1830(arg1).cfr_renamed_1772(arg2.cfr_renamed_1830(arg3)));
        }
        object = sprpib2.cfr_renamed_1993();
        if (object instanceof sprdb) {
            sprrlb[] sprrlbArray = new sprrlb[2];
            sprrlbArray[0] = arg0;
            sprrlbArray[1] = arg2;
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = arg1;
            bigIntegerArray[1] = arg3;
            return sprunb.cfr_renamed_2005(sprunb.cfr_renamed_2008(sprrlbArray, bigIntegerArray, (sprdb)object));
        }
        return sprunb.cfr_renamed_2005(sprunb.cfr_renamed_1936(arg0, arg1, arg2, arg3));
    }

    public static sprrlb cfr_renamed_2009(sprrlb arg0, BigInteger arg1, sprrlb arg2, BigInteger arg3) {
        sprrlb sprrlb2 = arg0;
        arg2 = sprunb.cfr_renamed_2007(sprrlb2.cfr_renamed_1769(), arg2);
        return sprunb.cfr_renamed_2005(sprunb.cfr_renamed_2004(sprrlb2, arg1, arg2, arg3));
    }

    private static /* synthetic */ sprrlb cfr_renamed_2010(boolean[] arg0, sprxob[] arg1, byte[][] arg2) {
        int n;
        sprrlb sprrlb2;
        int n2;
        int n3 = 0;
        int n4 = arg2.length;
        int n5 = n2 = 0;
        while (n5 < n4) {
            byte[] byArray = arg2[n2];
            n3 = Math.max(n3, byArray.length);
            n5 = ++n2;
        }
        sprpib sprpib2 = arg1[0].cfr_renamed_1777()[0].cfr_renamed_1769();
        sprrlb sprrlb3 = sprrlb2 = sprpib2.cfr_renamed_1770();
        int n6 = 0;
        int n7 = n = n3 - 1;
        while (n7 >= 0) {
            int n8;
            sprrlb sprrlb4 = sprrlb2;
            int n9 = n8 = 0;
            while (n9 < n4) {
                byte by;
                byte[] byArray = arg2[n8];
                byte by2 = by = n < byArray.length ? byArray[n] : (byte)0;
                if (by != 0) {
                    boolean[] blArray;
                    boolean bl;
                    int n10 = Math.abs(by);
                    sprxob sprxob2 = arg1[n8];
                    if (by < 0) {
                        bl = true;
                        blArray = arg0;
                    } else {
                        bl = false;
                        blArray = arg0;
                    }
                    sprrlb[] sprrlbArray = bl == blArray[n8] ? sprxob2.cfr_renamed_1777() : sprxob2.cfr_renamed_1806();
                    sprrlb4 = sprrlb4.cfr_renamed_1772(sprrlbArray[n10 >>> 1]);
                }
                n9 = ++n8;
            }
            if (sprrlb4 == sprrlb2) {
                ++n6;
            } else {
                if (n6 > 0) {
                    sprrlb3 = sprrlb3.cfr_renamed_1771(n6);
                    n6 = 0;
                }
                sprrlb3 = sprrlb3.cfr_renamed_1697(sprrlb4);
            }
            n7 = --n;
        }
        if (n6 > 0) {
            sprrlb3 = sprrlb3.cfr_renamed_1771(n6);
        }
        return sprrlb3;
    }

    private static /* synthetic */ sprrlb cfr_renamed_2011(sprrlb[] arg0, sprrlb[] arg1, byte[] arg2, sprrlb[] arg3, sprrlb[] arg4, byte[] arg5) {
        int n;
        sprrlb sprrlb2;
        int n2 = Math.max(arg2.length, arg5.length);
        sprrlb sprrlb3 = sprrlb2 = arg0[0].cfr_renamed_1769().cfr_renamed_1770();
        int n3 = 0;
        int n4 = n = n2 - 1;
        while (n4 >= 0) {
            byte by;
            byte by2 = n < arg2.length ? arg2[n] : (byte)0;
            byte by3 = by = n < arg5.length ? arg5[n] : (byte)0;
            if ((by2 | by) == 0) {
                ++n3;
            } else {
                sprrlb[] sprrlbArray;
                int n5;
                sprrlb sprrlb4 = sprrlb2;
                if (by2 != 0) {
                    n5 = Math.abs(by2);
                    sprrlbArray = by2 < 0 ? arg1 : arg0;
                    sprrlb4 = sprrlb4.cfr_renamed_1772(sprrlbArray[n5 >>> 1]);
                }
                if (by != 0) {
                    n5 = Math.abs(by);
                    sprrlbArray = by < 0 ? arg4 : arg3;
                    sprrlb4 = sprrlb4.cfr_renamed_1772(sprrlbArray[n5 >>> 1]);
                }
                if (n3 > 0) {
                    sprrlb3 = sprrlb3.cfr_renamed_1771(n3);
                    n3 = 0;
                }
                sprrlb3 = sprrlb3.cfr_renamed_1697(sprrlb4);
            }
            n4 = --n;
        }
        if (n3 > 0) {
            sprrlb3 = sprrlb3.cfr_renamed_1771(n3);
        }
        return sprrlb3;
    }

    public static boolean cfr_renamed_2012(sprpib arg0) {
        sprbb sprbb2 = arg0.cfr_renamed_845();
        return sprbb2.cfr_renamed_1763() > 1 && sprbb2.cfr_renamed_1762().equals(sprpb.cfr_renamed_4) && sprbb2 instanceof sprzb;
    }

    public static void cfr_renamed_1999(sprwtb[] arg0, int arg1, int arg2) {
        sprwtb[] sprwtbArray = new sprwtb[arg2];
        sprwtb[] sprwtbArray2 = sprwtbArray;
        sprwtbArray[0] = arg0[arg1];
        int n = 0;
        while (++n < arg2) {
            sprwtbArray2[n] = sprwtbArray2[n - 1].cfr_renamed_1833(arg0[arg1 + n]);
        }
        sprwtb sprwtb2 = sprwtbArray2[--n].cfr_renamed_952();
        int n2 = n;
        while (n2 > 0) {
            int n3 = arg1 + n;
            sprwtb sprwtb3 = arg0[n3];
            arg0[n3] = sprwtbArray2[--n].cfr_renamed_1833(sprwtb2);
            sprwtb2 = sprwtb2.cfr_renamed_1833(sprwtb3);
            n2 = n;
        }
        arg0[arg1] = sprwtb2;
    }

    public static sprrlb cfr_renamed_1935(sprrlb arg0, BigInteger arg1, sprlb arg2, BigInteger arg3) {
        boolean bl = arg1.signum() < 0;
        boolean bl2 = arg3.signum() < 0;
        arg1 = arg1.abs();
        arg3 = arg3.abs();
        int n = Math.max(2, Math.min(16, sprotb.cfr_renamed_1807(Math.max(arg1.bitLength(), arg3.bitLength()))));
        sprrlb sprrlb2 = arg0;
        sprrlb sprrlb3 = sprotb.cfr_renamed_1795(sprrlb2, n, true, arg2);
        sprxob sprxob2 = sprotb.cfr_renamed_1814(sprrlb2);
        sprxob sprxob3 = sprotb.cfr_renamed_1814(sprrlb3);
        sprxob sprxob4 = sprxob2;
        sprrlb[] sprrlbArray = bl ? sprxob4.cfr_renamed_1806() : sprxob4.cfr_renamed_1777();
        sprxob sprxob5 = sprxob3;
        sprrlb[] sprrlbArray2 = bl2 ? sprxob5.cfr_renamed_1806() : sprxob5.cfr_renamed_1777();
        sprxob sprxob6 = sprxob2;
        sprrlb[] sprrlbArray3 = bl ? sprxob6.cfr_renamed_1777() : sprxob6.cfr_renamed_1806();
        sprxob sprxob7 = sprxob3;
        sprrlb[] sprrlbArray4 = bl2 ? sprxob7.cfr_renamed_1777() : sprxob7.cfr_renamed_1806();
        byte[] byArray = sprotb.cfr_renamed_1809(n, arg1);
        byte[] byArray2 = sprotb.cfr_renamed_1809(n, arg3);
        return sprunb.cfr_renamed_2011(sprrlbArray, sprrlbArray3, byArray, sprrlbArray2, sprrlbArray4, byArray2);
    }

    public static sprrlb cfr_renamed_2013(sprrlb[] arg0, sprlb arg1, BigInteger[] arg2) {
        int n;
        int n2 = arg0.length;
        int n3 = n2 << 1;
        boolean[] blArray = new boolean[n3];
        sprxob[] sprxobArray = new sprxob[n3];
        byte[][] byArrayArray = new byte[n3][];
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
            int n7 = Math.max(2, Math.min(16, sprotb.cfr_renamed_1807(Math.max(bigInteger.bitLength(), bigInteger2.bitLength()))));
            sprrlb sprrlb2 = arg0[n];
            sprrlb sprrlb3 = sprotb.cfr_renamed_1795(sprrlb2, n7, true, arg1);
            sprxobArray[n5] = sprotb.cfr_renamed_1814(sprrlb2);
            sprxobArray[n6] = sprotb.cfr_renamed_1814(sprrlb3);
            byArrayArray[n5] = sprotb.cfr_renamed_1809(n7, bigInteger);
            byArrayArray[n6] = sprotb.cfr_renamed_1809(n7, bigInteger2);
            n4 = ++n;
        }
        return sprunb.cfr_renamed_2010(blArray, sprxobArray, byArrayArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprrlb cfr_renamed_2014(sprrlb[] arg0, BigInteger[] arg1) {
        int n;
        if (arg0 == null || arg1 == null || arg0.length != arg1.length || arg0.length < 1) {
            throw new IllegalArgumentException(sprlsy.cfr_renamed_9("Y\u0017@\u0016]XH\u0016MXZ\u001bH\u0014H\n\t\u0019[\nH\u0001ZXZ\u0010F\rE\u001c\t\u001aLXG\u0017GUG\rE\u0014\u0005XH\u0016MXF\u001e\t\u001dX\rH\u0014\u0005XG\u0017GUS\u001d[\u0017\u0005XE\u001dG\u001f]\u0010"));
        }
        int n2 = arg0.length;
        switch (n2) {
            case 1: {
                return arg0[0].cfr_renamed_1830(arg1[0]);
            }
            case 2: {
                return sprunb.cfr_renamed_2006(arg0[0], arg1[0], arg0[1], arg1[1]);
            }
        }
        sprrlb sprrlb2 = arg0[0];
        sprpib sprpib2 = sprrlb2.cfr_renamed_1769();
        sprrlb[] sprrlbArray = new sprrlb[n2];
        sprrlbArray[0] = sprrlb2;
        int n3 = n = 1;
        while (n3 < n2) {
            int n4 = n++;
            sprrlbArray[n4] = sprunb.cfr_renamed_2007(sprpib2, arg0[n4]);
            n3 = n;
        }
        sprcb sprcb2 = sprpib2.cfr_renamed_1993();
        if (sprcb2 instanceof sprdb) {
            return sprunb.cfr_renamed_2005(sprunb.cfr_renamed_2008(sprrlbArray, arg1, (sprdb)sprcb2));
        }
        return sprunb.cfr_renamed_2005(sprunb.cfr_renamed_2015(sprrlbArray, arg1));
    }

    public static sprrlb cfr_renamed_2008(sprrlb[] arg0, BigInteger[] arg1, sprdb arg2) {
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
        sprdb sprdb2 = arg2;
        sprlb sprlb2 = sprdb2.cfr_renamed_1934();
        if (sprdb2.spr\u3180()) {
            return sprunb.cfr_renamed_2013(arg0, sprlb2, bigIntegerArray);
        }
        sprrlb[] sprrlbArray = new sprrlb[n << 1];
        int n5 = 0;
        int n6 = 0;
        int n7 = n5;
        while (n7 < n) {
            sprrlb sprrlb2 = arg0[n5];
            sprrlb sprrlb3 = sprlb2.cfr_renamed_1797(sprrlb2);
            sprrlbArray[n6++] = sprrlb2;
            sprrlbArray[n6++] = sprrlb3;
            n7 = ++n5;
        }
        return sprunb.cfr_renamed_2015(sprrlbArray, bigIntegerArray);
    }

    public static sprrlb cfr_renamed_1871(sprrlb arg0, BigInteger arg1) {
        BigInteger bigInteger = arg1.abs();
        sprrlb sprrlb2 = arg0.cfr_renamed_1769().cfr_renamed_1770();
        int n = bigInteger.bitLength();
        if (n > 0) {
            int n2;
            if (bigInteger.testBit(0)) {
                sprrlb2 = arg0;
            }
            int n3 = n2 = 1;
            while (n3 < n) {
                arg0 = arg0.cfr_renamed_1774();
                if (bigInteger.testBit(n2)) {
                    sprrlb2 = sprrlb2.cfr_renamed_1772(arg0);
                }
                n3 = ++n2;
            }
        }
        if (arg1.signum() < 0) {
            return sprrlb2.cfr_renamed_1773();
        }
        return sprrlb2;
    }

    public static sprrlb cfr_renamed_2007(sprpib arg0, sprrlb arg1) {
        sprpib sprpib2 = arg1.cfr_renamed_1769();
        if (!arg0.cfr_renamed_1931(sprpib2)) {
            throw new IllegalArgumentException(sprzaq.cfr_renamed_9("j\u0002S\u0003NMW\u0018I\u0019\u001a\u000f_MU\u0003\u001a\u0019R\b\u001a\u001e[\u0000_MY\u0018H\u001b_"));
        }
        return arg0.cfr_renamed_1873(arg1);
    }

    public static boolean cfr_renamed_1838(sprpib arg0) {
        return arg0.cfr_renamed_845().cfr_renamed_1763() == 1;
    }

    public static sprrlb cfr_renamed_1936(sprrlb arg0, BigInteger arg1, sprrlb arg2, BigInteger arg3) {
        boolean bl = arg1.signum() < 0;
        boolean bl2 = arg3.signum() < 0;
        arg1 = arg1.abs();
        arg3 = arg3.abs();
        int n = Math.max(2, Math.min(16, sprotb.cfr_renamed_1807(arg1.bitLength())));
        int n2 = Math.max(2, Math.min(16, sprotb.cfr_renamed_1807(arg3.bitLength())));
        sprxob sprxob2 = sprotb.cfr_renamed_1796(arg0, n, true);
        sprxob sprxob3 = sprotb.cfr_renamed_1796(arg2, n2, true);
        sprxob sprxob4 = sprxob2;
        sprrlb[] sprrlbArray = bl ? sprxob4.cfr_renamed_1806() : sprxob4.cfr_renamed_1777();
        sprxob sprxob5 = sprxob3;
        sprrlb[] sprrlbArray2 = bl2 ? sprxob5.cfr_renamed_1806() : sprxob5.cfr_renamed_1777();
        sprxob sprxob6 = sprxob2;
        sprrlb[] sprrlbArray3 = bl ? sprxob6.cfr_renamed_1777() : sprxob6.cfr_renamed_1806();
        sprxob sprxob7 = sprxob3;
        sprrlb[] sprrlbArray4 = bl2 ? sprxob7.cfr_renamed_1777() : sprxob7.cfr_renamed_1806();
        byte[] byArray = sprotb.cfr_renamed_1809(n, arg1);
        byte[] byArray2 = sprotb.cfr_renamed_1809(n2, arg3);
        return sprunb.cfr_renamed_2011(sprrlbArray, sprrlbArray3, byArray, sprrlbArray2, sprrlbArray4, byArray2);
    }

    public static sprrlb cfr_renamed_2015(sprrlb[] arg0, BigInteger[] arg1) {
        int n;
        int n2 = arg0.length;
        boolean[] blArray = new boolean[n2];
        sprxob[] sprxobArray = new sprxob[n2];
        byte[][] byArrayArray = new byte[n2][];
        int n3 = n = 0;
        while (n3 < n2) {
            BigInteger bigInteger = arg1[n];
            blArray[n] = bigInteger.signum() < 0;
            bigInteger = bigInteger.abs();
            int n4 = Math.max(2, Math.min(16, sprotb.cfr_renamed_1807(bigInteger.bitLength())));
            int n5 = n;
            sprxobArray[n5] = sprotb.cfr_renamed_1796(arg0[n], n4, true);
            byArrayArray[n5] = sprotb.cfr_renamed_1809(n4, bigInteger);
            n3 = ++n;
        }
        return sprunb.cfr_renamed_2010(blArray, sprxobArray, byArrayArray);
    }
}

