/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralb;
import com.spire.presentation.packages.spratc;
import com.spire.presentation.packages.sprbb;
import com.spire.presentation.packages.sprcb;
import com.spire.presentation.packages.sprdb;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.sprgpb;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprsib;
import com.spire.presentation.packages.sprtb;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprwtb;
import java.math.BigInteger;
import java.util.Hashtable;

public abstract class sprpib {
    public int cfr_renamed_137;
    public static final int cfr_renamed_79 = 4;
    public static final int cfr_renamed_107 = 3;
    public sprcb cfr_renamed_132;
    public static final int cfr_renamed_102 = 1;
    public static final int cfr_renamed_93 = 5;
    public static final int cfr_renamed_86 = 6;
    public static final int cfr_renamed_152 = 0;
    public sprwtb cfr_renamed_112;
    public spreb cfr_renamed_119;
    public static final int cfr_renamed_91 = 2;
    public sprwtb cfr_renamed_0;
    public BigInteger cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public sprbb cfr_renamed_3;
    public static final int cfr_renamed_4 = 7;

    public sprpib(sprbb sprbb2) {
        sprpib sprpib2 = this;
        sprpib sprpib3 = this;
        sprpib3.cfr_renamed_137 = 0;
        sprpib3.cfr_renamed_132 = null;
        sprpib2.cfr_renamed_119 = null;
        sprpib2.cfr_renamed_3 = sprbb2;
    }

    public abstract sprrlb cfr_renamed_1990(int var1, BigInteger var2);

    /*
     * WARNING - void declaration
     */
    public sprrlb cfr_renamed_1991(BigInteger bigInteger, BigInteger bigInteger2, boolean bl) {
        void arg2;
        void arg1;
        sprpib sprpib2 = this;
        return sprpib2.cfr_renamed_1960(this.cfr_renamed_1652(bigInteger), sprpib2.cfr_renamed_1652((BigInteger)arg1), (boolean)arg2);
    }

    public void cfr_renamed_1992(sprrlb arg0) {
        if (null == arg0 || this != arg0.cfr_renamed_1769()) {
            throw new IllegalArgumentException(sprhky.cfr_renamed_9("{\r3\u00142\t{]1\b/\t|\u001f9]2\u00122P2\b0\u0011|\u001c2\u0019|\u00122](\u00155\u000e|\u001e)\u000f*\u0018"));
        }
    }

    public abstract sprrlb cfr_renamed_1770();

    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtb cfr_renamed_1784(sprrlb arg0, String arg1) {
        sprrlb sprrlb2 = arg0;
        this.cfr_renamed_1992(sprrlb2);
        sprrlb sprrlb3 = sprrlb2;
        synchronized (sprrlb2) {
            sprrlb sprrlb4;
            sprtb sprtb2;
            Hashtable hashtable = arg0.cfr_renamed_119;
            if (hashtable == null) {
                sprtb2 = null;
                sprrlb4 = sprrlb3;
            } else {
                sprtb2 = (sprtb)hashtable.get(arg1);
                sprrlb4 = sprrlb3;
            }
            // ** MonitorExit[v2] (shouldn't be in output)
            return sprtb2;
        }
    }

    public sprwtb cfr_renamed_1778() {
        return this.cfr_renamed_112;
    }

    public abstract sprwtb cfr_renamed_1652(BigInteger var1);

    public sprbb cfr_renamed_845() {
        return this.cfr_renamed_3;
    }

    public sprcb cfr_renamed_1993() {
        return this.cfr_renamed_132;
    }

    public synchronized spreb cfr_renamed_1967() {
        if (this.cfr_renamed_119 == null) {
            this.cfr_renamed_119 = this.cfr_renamed_1994();
        }
        return this.cfr_renamed_119;
    }

    public sprrlb cfr_renamed_1995(BigInteger arg0, BigInteger arg1) {
        sprrlb sprrlb2 = this.cfr_renamed_1996(arg0, arg1);
        if (!sprrlb2.cfr_renamed_1974()) {
            throw new IllegalArgumentException(spratc.cfr_renamed_9("\u0015\u000f*\u00000\b8A,\u000e5\u000f(A?\u000e3\u00138\b2\u0000(\u0004/"));
        }
        return sprrlb2;
    }

    public boolean equals(Object arg0) {
        return this == arg0 || arg0 instanceof sprpib && this.cfr_renamed_1931((sprpib)arg0);
    }

    public int hashCode() {
        return this.cfr_renamed_845().hashCode() ^ spriwa.cfr_renamed_494(this.cfr_renamed_1778().cfr_renamed_1779().hashCode(), 8) ^ spriwa.cfr_renamed_494(this.cfr_renamed_1997().cfr_renamed_1779().hashCode(), 16);
    }

    public boolean cfr_renamed_1875(int arg0) {
        return arg0 == 0;
    }

    public abstract int cfr_renamed_1938();

    public sprrlb cfr_renamed_1996(BigInteger arg0, BigInteger arg1) {
        return this.cfr_renamed_1991(arg0, arg1, false);
    }

    public spreb cfr_renamed_1994() {
        if (this.cfr_renamed_132 instanceof sprdb) {
            sprpib sprpib2 = this;
            return new sprgpb(sprpib2, (sprdb)sprpib2.cfr_renamed_132);
        }
        return new spralb();
    }

    public void cfr_renamed_1805(sprrlb[] arg0) {
        int n;
        sprpib sprpib2 = this;
        sprpib2.cfr_renamed_1998(arg0);
        if (sprpib2.cfr_renamed_1874() == 0) {
            return;
        }
        sprwtb[] sprwtbArray = new sprwtb[arg0.length];
        int[] nArray = new int[arg0.length];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            sprrlb sprrlb2 = arg0[n];
            if (null != sprrlb2 && !sprrlb2.cfr_renamed_1957()) {
                int n4 = n2++;
                sprwtbArray[n4] = sprrlb2.cfr_renamed_1964(0);
                nArray[n4] = n;
            }
            n3 = ++n;
        }
        if (n2 == 0) {
            return;
        }
        sprunb.cfr_renamed_1999(sprwtbArray, 0, n2);
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = nArray[n];
            sprrlb sprrlb3 = arg0[n6].cfr_renamed_1979(sprwtbArray[n]);
            arg0[n6] = sprrlb3;
            n5 = ++n;
        }
    }

    public boolean cfr_renamed_1931(sprpib arg0) {
        return this == arg0 || null != arg0 && this.cfr_renamed_845().equals(arg0.cfr_renamed_845()) && this.cfr_renamed_1778().cfr_renamed_1779().equals(arg0.cfr_renamed_1778().cfr_renamed_1779()) && this.cfr_renamed_1997().cfr_renamed_1779().equals(arg0.cfr_renamed_1997().cfr_renamed_1779());
    }

    public sprrlb cfr_renamed_1873(sprrlb arg0) {
        if (this == arg0.cfr_renamed_1769()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this.cfr_renamed_1770();
        }
        arg0 = arg0.cfr_renamed_1775();
        return this.cfr_renamed_2000(arg0.cfr_renamed_1832().cfr_renamed_1779(), arg0.cfr_renamed_1831().cfr_renamed_1779(), arg0.cfr_renamed_91);
    }

    public abstract sprrlb cfr_renamed_1965(sprwtb var1, sprwtb var2, sprwtb[] var3, boolean var4);

    public void cfr_renamed_1998(sprrlb[] arg0) {
        int n;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprhky.cfr_renamed_9("Z,\u00125\u0013(\u000e{]?\u001c2\u00133\t|\u001f9]2\b0\u0011"));
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprrlb sprrlb2 = arg0[n];
            if (null != sprrlb2 && this != sprrlb2.cfr_renamed_1769()) {
                throw new IllegalArgumentException(spratc.cfr_renamed_9("F,\u000e5\u000f(\u0012{A9\u000f(\u00135\u0004/A1\u0014/\u0015|\u00039A2\u00140\r|\u000e.A3\u000f|\u00154\b/A?\u0014.\u00179"));
            }
            n2 = ++n;
        }
    }

    public abstract sprpib cfr_renamed_2001();

    public sprrlb cfr_renamed_2000(BigInteger arg0, BigInteger arg1, boolean arg2) {
        sprrlb sprrlb2 = this.cfr_renamed_1991(arg0, arg1, arg2);
        if (!sprrlb2.cfr_renamed_1974()) {
            throw new IllegalArgumentException(sprhky.cfr_renamed_9("42\u000b=\u00115\u0019|\r3\u00142\t|\u001e3\u0012.\u00195\u0013=\t9\u000e"));
        }
        return sprrlb2;
    }

    public sprsib cfr_renamed_1876() {
        sprpib sprpib2 = this;
        sprpib sprpib3 = this;
        return new sprsib(sprpib3, sprpib2.cfr_renamed_137, sprpib2.cfr_renamed_132, sprpib3.cfr_renamed_119);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_1789(sprrlb arg0, String arg1, sprtb arg2) {
        sprrlb sprrlb2 = arg0;
        this.cfr_renamed_1992(sprrlb2);
        sprrlb sprrlb3 = sprrlb2;
        synchronized (sprrlb2) {
            Hashtable<String, sprtb> hashtable = arg0.cfr_renamed_119;
            if (null == hashtable) {
                sprrlb sprrlb4 = arg0;
                sprrlb4.cfr_renamed_119 = hashtable = new Hashtable<String, sprtb>(4);
            }
            hashtable.put(arg1, arg2);
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return;
        }
    }

    public BigInteger cfr_renamed_1843() {
        return this.cfr_renamed_2;
    }

    public sprwtb cfr_renamed_1997() {
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprrlb cfr_renamed_2002(byte[] arg0) {
        byte by;
        sprrlb sprrlb2;
        block12: {
            sprrlb2 = null;
            int n = (this.cfr_renamed_1938() + 7) / 8;
            byte by2 = arg0[0];
            switch (by2) {
                case 0: {
                    if (arg0.length != 1) {
                        throw new IllegalArgumentException(spratc.cfr_renamed_9("(2\u00023\u0013.\u0004?\u0015|\r9\u000f;\u00154A:\u000e.A5\u000f:\b2\b(\u0018|\u00042\u00023\u00055\u000f;"));
                    }
                    sprrlb2 = this.cfr_renamed_1770();
                    by = by2;
                    break block12;
                }
                case 2: 
                case 3: {
                    if (arg0.length != n + 1) {
                        throw new IllegalArgumentException(sprhky.cfr_renamed_9("\u0015\u0013?\u0012.\u000f9\u001e(]0\u00182\u001a(\u0015|\u001b3\u000f|\u001e3\u0010,\u000f9\u000e/\u00188]9\u0013?\u00128\u00142\u001a"));
                    }
                    int n2 = by2 & 1;
                    BigInteger bigInteger = sprvpa.cfr_renamed_511(arg0, 1, n);
                    sprrlb2 = this.cfr_renamed_1990(n2, bigInteger);
                    if (sprrlb2.cfr_renamed_1970()) break;
                    throw new IllegalArgumentException(spratc.cfr_renamed_9("\u0015\u000f*\u00000\b8A,\u000e5\u000f("));
                }
                case 4: {
                    if (arg0.length != 2 * n + 1) {
                        throw new IllegalArgumentException(sprhky.cfr_renamed_9("\u0015\u0013?\u0012.\u000f9\u001e(]0\u00182\u001a(\u0015|\u001b3\u000f|\b2\u001e3\u0010,\u000f9\u000e/\u00188]9\u0013?\u00128\u00142\u001a"));
                    }
                    BigInteger bigInteger = sprvpa.cfr_renamed_511(arg0, 1, n);
                    BigInteger bigInteger2 = sprvpa.cfr_renamed_511(arg0, 1 + n, n);
                    sprrlb2 = this.cfr_renamed_1995(bigInteger, bigInteger2);
                    by = by2;
                    break block12;
                }
                case 6: 
                case 7: {
                    if (arg0.length != 2 * n + 1) {
                        throw new IllegalArgumentException(spratc.cfr_renamed_9("(2\u00023\u0013.\u0004?\u0015|\r9\u000f;\u00154A:\u000e.A4\u0018>\u00135\u0005|\u00042\u00023\u00055\u000f;"));
                    }
                    BigInteger bigInteger = sprvpa.cfr_renamed_511(arg0, 1, n);
                    BigInteger bigInteger3 = sprvpa.cfr_renamed_511(arg0, 1 + n, n);
                    if (bigInteger3.testBit(0) != (by2 == 7)) {
                        throw new IllegalArgumentException(sprhky.cfr_renamed_9("\u0015\u0013?\u00122\u000e5\u000e(\u00182\t|$|\u001e3\u0012.\u00195\u0013=\t9]5\u0013|\u0015%\u001f.\u00148]9\u0013?\u00128\u00142\u001a"));
                    }
                    sprrlb2 = this.cfr_renamed_1995(bigInteger, bigInteger3);
                    by = by2;
                    break block12;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, spratc.cfr_renamed_9("\u0015\u000f*\u00000\b8A,\u000e5\u000f(A9\u000f?\u000e8\b2\u0006|Q$")).append(Integer.toString(by2, 16)).toString());
                }
            }
            by = by2;
        }
        if (by != 0 && sprrlb2.cfr_renamed_1952()) {
            throw new IllegalArgumentException(sprhky.cfr_renamed_9("42\u000b=\u00115\u0019|\u00142\u001b5\u00135\t%]9\u0013?\u00128\u00142\u001a"));
        }
        return sprrlb2;
    }

    public int cfr_renamed_1874() {
        return this.cfr_renamed_137;
    }

    public static int[] cfr_renamed_2003() {
        int[] nArray = new int[8];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        nArray[6] = 6;
        nArray[7] = 7;
        return nArray;
    }

    public abstract sprrlb cfr_renamed_1960(sprwtb var1, sprwtb var2, boolean var3);
}

