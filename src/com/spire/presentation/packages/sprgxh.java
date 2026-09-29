/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreoh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprexh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmip;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.spropo;
import com.spire.presentation.packages.sprpg;
import com.spire.presentation.packages.sprpk;
import com.spire.presentation.packages.sprqwh;
import com.spire.presentation.packages.sprtnh;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprzh;
import com.spire.presentation.packages.sprzi;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;

public abstract class sprgxh {
    public static final int cfr_renamed_137 = 7;
    public sprlsh cfr_renamed_79;
    public BigInteger cfr_renamed_107;
    public static final int cfr_renamed_132 = 6;
    public static final int cfr_renamed_102 = 5;
    public sprlsh cfr_renamed_93;
    public static final int cfr_renamed_86 = 4;
    public int cfr_renamed_152;
    public static final int cfr_renamed_112 = 3;
    public sprjd cfr_renamed_119;
    public sprpg cfr_renamed_91;
    public sprfe cfr_renamed_0;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public BigInteger cfr_renamed_4;

    public int cfr_renamed_1874() {
        return this.cfr_renamed_152;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_8937(spreuh[] arg0, int arg1, int arg2, sprlsh arg3) {
        int n;
        sprgxh sprgxh2 = this;
        sprgxh2.cfr_renamed_8938(arg0, arg1, arg2);
        switch (sprgxh2.cfr_renamed_1874()) {
            case 0: 
            case 5: {
                if (arg3 != null) {
                    throw new IllegalArgumentException(spropo.cfr_renamed_9("0-d+0dy+cda%{-sdq+edv\"q-y!7'x+e ~*v0r7"));
                }
                return;
            }
        }
        sprlsh[] sprlshArray = new sprlsh[arg2];
        int[] nArray = new int[arg2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            if (!(null == spreuh2 || arg3 == null && spreuh2.cfr_renamed_1957())) {
                sprlshArray[n2] = spreuh2.cfr_renamed_1964(0);
                nArray[n2++] = arg1 + n;
            }
            n3 = ++n;
        }
        if (n2 == 0) {
            return;
        }
        sprmvh.cfr_renamed_8939(sprlshArray, 0, n2, arg3);
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = nArray[n];
            spreuh spreuh3 = arg0[n5].cfr_renamed_8925(sprlshArray[n]);
            arg0[n5] = spreuh3;
            n4 = ++n;
        }
        return;
    }

    public sprpg cfr_renamed_1993() {
        return this.cfr_renamed_91;
    }

    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_4;
    }

    private static /* synthetic */ int cfr_renamed_7259(int arg0, int arg1) {
        if (arg0 >= 1536) {
            if (arg1 <= 100) {
                return 3;
            }
            if (arg1 <= 128) {
                return 4;
            }
            return 4 + (arg1 - 128 + 1) / 2;
        }
        if (arg0 >= 1024) {
            if (arg1 <= 100) {
                return 4;
            }
            if (arg1 <= 112) {
                return 5;
            }
            return 5 + (arg1 - 112 + 1) / 2;
        }
        if (arg0 >= 512) {
            if (arg1 <= 80) {
                return 5;
            }
            if (arg1 <= 100) {
                return 7;
            }
            return 7 + (arg1 - 100 + 1) / 2;
        }
        if (arg1 <= 80) {
            return 40;
        }
        return 40 + (arg1 - 80 + 1) / 2;
    }

    public abstract spreuh cfr_renamed_8917(sprlsh var1, sprlsh var2, sprlsh[] var3);

    public spreuh cfr_renamed_1995(BigInteger arg0, BigInteger arg1) {
        spreuh spreuh2 = this.cfr_renamed_1996(arg0, arg1);
        if (!spreuh2.cfr_renamed_1974()) {
            throw new IllegalArgumentException(sprmip.cfr_renamed_9("(?\u00170\r8\u0005q\u0011>\b?\u0015q\u0002>\u000e#\u00058\u000f0\u00154\u0012"));
        }
        return spreuh2;
    }

    public sprgxh(sprjd sprjd2) {
        sprgxh sprgxh2 = this;
        sprgxh sprgxh3 = this;
        sprgxh3.cfr_renamed_152 = 0;
        sprgxh3.cfr_renamed_91 = null;
        sprgxh2.cfr_renamed_0 = null;
        sprgxh2.cfr_renamed_119 = sprjd2;
    }

    public void cfr_renamed_8938(spreuh[] arg0, int arg1, int arg2) {
        int n;
        if (arg0 == null) {
            throw new IllegalArgumentException(spropo.cfr_renamed_9("cg+~*c70dt%y*x07&rdy1{("));
        }
        if (arg1 < 0 || arg2 < 0 || arg1 > arg0.length - arg2) {
            throw new IllegalArgumentException(sprmip.cfr_renamed_9("8\u000f'\u0000=\b5A#\u0000?\u00064A\"\u00114\u00028\u00078\u00045A7\u000e#Av\u0011>\b?\u0015\"F"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            if (null != spreuh2 && this != spreuh2.cfr_renamed_1769()) {
                throw new IllegalArgumentException(spropo.cfr_renamed_9("04x-y0dc7!y0e-r77)b7cdu!7*b({dx67+ydc,~77'b6a!"));
            }
            n2 = ++n;
        }
    }

    public sprfe cfr_renamed_1994() {
        if (this.cfr_renamed_91 instanceof sprzh) {
            sprgxh sprgxh2 = this;
            return new spreoh(sprgxh2, (sprzh)sprgxh2.cfr_renamed_91);
        }
        return new sprexh();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public sprzi cfr_renamed_8637(spreuh arg0, String arg1) {
        spreuh spreuh2 = arg0;
        this.cfr_renamed_8940(spreuh2);
        Object object = spreuh2;
        // MONITORENTER : spreuh2
        Hashtable hashtable = arg0.cfr_renamed_2;
        // MONITOREXIT : object
        if (null == hashtable) {
            return null;
        }
        object = hashtable;
        // MONITORENTER : object
        // MONITOREXIT : object
        return (sprzi)hashtable.get(arg1);
    }

    public static /* synthetic */ int cfr_renamed_8941(int arg0, int arg1) {
        return sprgxh.cfr_renamed_7259(arg0, arg1);
    }

    public void cfr_renamed_8691(spreuh[] arg0) {
        this.cfr_renamed_8937(arg0, 0, arg0.length, null);
    }

    public boolean equals(Object arg0) {
        return this == arg0 || arg0 instanceof sprgxh && this.cfr_renamed_8896((sprgxh)arg0);
    }

    public sprlsh cfr_renamed_1778() {
        return this.cfr_renamed_79;
    }

    /*
     * Enabled aggressive block sorting
     */
    public spreuh cfr_renamed_2002(byte[] arg0) {
        byte by;
        spreuh spreuh2;
        block12: {
            spreuh2 = null;
            int n = (this.cfr_renamed_1938() + 7) / 8;
            byte by2 = arg0[0];
            switch (by2) {
                case 0: {
                    if (arg0.length != 1) {
                        throw new IllegalArgumentException(sprmip.cfr_renamed_9("\u0018\u000f2\u000e#\u00134\u0002%A=\u0004?\u0006%\tq\u0007>\u0013q\b?\u00078\u000f8\u0015(A4\u000f2\u000e5\b?\u0006"));
                    }
                    spreuh2 = this.cfr_renamed_1770();
                    by = by2;
                    break block12;
                }
                case 2: 
                case 3: {
                    if (arg0.length != n + 1) {
                        throw new IllegalArgumentException(spropo.cfr_renamed_9("^*t+e6r'cd{!y#c,7\"x67'x)g6r7d!sdr*t+s-y#"));
                    }
                    int n2 = by2 & 1;
                    BigInteger bigInteger = sprhdf.cfr_renamed_511(arg0, 1, n);
                    spreuh2 = this.cfr_renamed_1990(n2, bigInteger);
                    if (spreuh2.cfr_renamed_8918(true, true)) break;
                    throw new IllegalArgumentException(sprmip.cfr_renamed_9("(?\u00170\r8\u0005q\u0011>\b?\u0015"));
                }
                case 4: {
                    if (arg0.length != 2 * n + 1) {
                        throw new IllegalArgumentException(spropo.cfr_renamed_9("^*t+e6r'cd{!y#c,7\"x671y'x)g6r7d!sdr*t+s-y#"));
                    }
                    BigInteger bigInteger = sprhdf.cfr_renamed_511(arg0, 1, n);
                    BigInteger bigInteger2 = sprhdf.cfr_renamed_511(arg0, 1 + n, n);
                    spreuh2 = this.cfr_renamed_1995(bigInteger, bigInteger2);
                    by = by2;
                    break block12;
                }
                case 6: 
                case 7: {
                    if (arg0.length != 2 * n + 1) {
                        throw new IllegalArgumentException(sprmip.cfr_renamed_9("\u0018\u000f2\u000e#\u00134\u0002%A=\u0004?\u0006%\tq\u0007>\u0013q\t(\u0003#\b5A4\u000f2\u000e5\b?\u0006"));
                    }
                    BigInteger bigInteger = sprhdf.cfr_renamed_511(arg0, 1, n);
                    BigInteger bigInteger3 = sprhdf.cfr_renamed_511(arg0, 1 + n, n);
                    if (bigInteger3.testBit(0) != (by2 == 7)) {
                        throw new IllegalArgumentException(spropo.cfr_renamed_9("^*t+y7~7c!y07\u001d7'x+e ~*v0rd~*7,n&e-sdr*t+s-y#"));
                    }
                    spreuh2 = this.cfr_renamed_1995(bigInteger, bigInteger3);
                    by = by2;
                    break block12;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprmip.cfr_renamed_9("(?\u00170\r8\u0005q\u0011>\b?\u0015q\u0004?\u0002>\u00058\u000f6Aa\u0019")).append(Integer.toString(by2, 16)).toString());
                }
            }
            by = by2;
        }
        if (by != 0 && spreuh2.cfr_renamed_1952()) {
            throw new IllegalArgumentException(spropo.cfr_renamed_9("\ry2v(~ 7-y\"~*~0ndr*t+s-y#"));
        }
        return spreuh2;
    }

    public abstract sprlsh cfr_renamed_8942(SecureRandom var1);

    public sprjd cfr_renamed_845() {
        return this.cfr_renamed_119;
    }

    public boolean cfr_renamed_1875(int arg0) {
        return arg0 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public spreuh cfr_renamed_1996(BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        sprgxh sprgxh2 = this;
        return sprgxh2.cfr_renamed_8923(this.cfr_renamed_1652(bigInteger), sprgxh2.cfr_renamed_1652((BigInteger)arg1));
    }

    public int hashCode() {
        return this.cfr_renamed_845().hashCode() ^ spruaf.cfr_renamed_494(this.cfr_renamed_1778().cfr_renamed_1779().hashCode(), 8) ^ spruaf.cfr_renamed_494(this.cfr_renamed_1997().cfr_renamed_1779().hashCode(), 16);
    }

    public abstract sprgxh cfr_renamed_2001();

    public abstract boolean cfr_renamed_8943(BigInteger var1);

    public abstract int cfr_renamed_1938();

    public abstract sprlsh cfr_renamed_1652(BigInteger var1);

    public abstract sprlsh cfr_renamed_8924(SecureRandom var1);

    public synchronized sprqwh cfr_renamed_1876() {
        sprgxh sprgxh2 = this;
        sprgxh sprgxh3 = this;
        return new sprqwh(sprgxh3, sprgxh2.cfr_renamed_152, sprgxh2.cfr_renamed_91, sprgxh3.cfr_renamed_0);
    }

    public abstract spreuh cfr_renamed_1990(int var1, BigInteger var2);

    public BigInteger cfr_renamed_1843() {
        return this.cfr_renamed_107;
    }

    public boolean cfr_renamed_8896(sprgxh arg0) {
        return this == arg0 || null != arg0 && this.cfr_renamed_845().equals(arg0.cfr_renamed_845()) && this.cfr_renamed_1778().cfr_renamed_1779().equals(arg0.cfr_renamed_1778().cfr_renamed_1779()) && this.cfr_renamed_1997().cfr_renamed_1779().equals(arg0.cfr_renamed_1997().cfr_renamed_1779());
    }

    public void cfr_renamed_8944(spreuh[] arg0) {
        this.cfr_renamed_8938(arg0, 0, arg0.length);
    }

    public void cfr_renamed_8940(spreuh arg0) {
        if (null == arg0 || this != arg0.cfr_renamed_1769()) {
            throw new IllegalArgumentException(sprmip.cfr_renamed_9("v\u0011>\b?\u0015vA<\u0014\"\u0015q\u00034A?\u000e?L?\u0014=\rq\u0000?\u0005q\u000e?A%\t8\u0012q\u0002$\u0013'\u0004"));
        }
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

    public sprfe cfr_renamed_1967() {
        if (this.cfr_renamed_0 == null) {
            this.cfr_renamed_0 = this.cfr_renamed_1994();
        }
        return this.cfr_renamed_0;
    }

    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        int n2 = this.cfr_renamed_1938() + 7 >>> 3;
        byte[] byArray = new byte[arg2 * n2 * 2];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            byte[] byArray2 = spreuh2.cfr_renamed_1953().cfr_renamed_1779().toByteArray();
            byte[] byArray3 = spreuh2.cfr_renamed_1954().cfr_renamed_1779().toByteArray();
            int n5 = byArray2.length > n2 ? 1 : 0;
            int n6 = byArray2.length - n5;
            int n7 = byArray3.length > n2 ? 1 : 0;
            int n8 = byArray3.length - n7;
            System.arraycopy(byArray2, n5, byArray, n3 + n2 - n6, n6);
            System.arraycopy(byArray3, n7, byArray, (n3 += n2) + n2 - n8, n8);
            n3 += n2;
            n4 = ++n;
        }
        return new sprtnh(this, arg2, n2, byArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzi cfr_renamed_8628(spreuh arg0, String arg1, sprpk arg2) {
        spreuh spreuh2 = arg0;
        this.cfr_renamed_8940(spreuh2);
        Object object = spreuh2;
        synchronized (spreuh2) {
            Hashtable<String, sprzi> hashtable = arg0.cfr_renamed_2;
            if (null == hashtable) {
                spreuh spreuh3 = arg0;
                spreuh3.cfr_renamed_2 = hashtable = new Hashtable<String, sprzi>(4);
            }
            // ** MonitorExit[var5_4] (shouldn't be in output)
            object = hashtable;
            synchronized (object) {
                sprzi sprzi2 = (sprzi)hashtable.get(arg1);
                sprzi sprzi3 = arg2.cfr_renamed_8888(sprzi2);
                if (sprzi3 != sprzi2) {
                    hashtable.put(arg1, sprzi3);
                }
                return sprzi3;
            }
        }
    }

    public abstract spreuh cfr_renamed_1770();

    public spreuh cfr_renamed_8928(spreuh arg0) {
        if (this == arg0.cfr_renamed_1769()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this.cfr_renamed_1770();
        }
        arg0 = arg0.cfr_renamed_1775();
        return this.cfr_renamed_1996(arg0.cfr_renamed_1832().cfr_renamed_1779(), arg0.cfr_renamed_1831().cfr_renamed_1779());
    }

    public sprlsh cfr_renamed_1997() {
        return this.cfr_renamed_93;
    }

    public abstract spreuh cfr_renamed_8923(sprlsh var1, sprlsh var2);
}

