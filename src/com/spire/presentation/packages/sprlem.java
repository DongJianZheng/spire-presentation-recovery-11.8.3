/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjbn;
import com.spire.presentation.packages.sprjzm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpzm;
import com.spire.presentation.packages.sprpzz;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprtgka;
import com.spire.presentation.packages.sprvfn;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class sprlem
extends sprxgf {
    private byte[] cfr_renamed_0;
    public static final sprqbn cfr_renamed_1 = new sprvfn(sprlem.class, 6);
    private static final long cfr_renamed_2 = 0xFFFFFFFFFFFF80L;
    private final String cfr_renamed_3;
    private static final ConcurrentMap<sprjbn, sprlem> cfr_renamed_4 = new ConcurrentHashMap<sprjbn, sprlem>();

    private static /* synthetic */ boolean cfr_renamed_4929(String arg0) {
        if (arg0.length() < 3 || arg0.charAt(1) != '.') {
            return false;
        }
        char c = arg0.charAt(0);
        if (c < '0' || c > '2') {
            return false;
        }
        return sprjzm.cfr_renamed_11490(arg0, 2);
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprlem)) {
            return false;
        }
        return this.cfr_renamed_3.equals(((sprlem)arg0).cfr_renamed_3);
    }

    public boolean cfr_renamed_5966(sprlem arg0) {
        String string = this.cfr_renamed_19();
        String string2 = arg0.cfr_renamed_19();
        return string.length() > string2.length() && string.charAt(string2.length()) == '.' && string.startsWith(string2);
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 6, this.cfr_renamed_4577());
    }

    public String toString() {
        return this.cfr_renamed_19();
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    private synchronized /* synthetic */ byte[] cfr_renamed_4577() {
        if (this.cfr_renamed_0 == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.cfr_renamed_4926(byteArrayOutputStream);
            this.cfr_renamed_0 = byteArrayOutputStream.toByteArray();
        }
        return this.cfr_renamed_0;
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_3;
    }

    public static sprlem cfr_renamed_11491(byte[] arg0, boolean arg1) {
        sprjbn sprjbn2 = new sprjbn(arg0);
        sprlem sprlem2 = (sprlem)cfr_renamed_4.get(sprjbn2);
        if (sprlem2 == null) {
            return new sprlem(arg0, arg1);
        }
        return sprlem2;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4577().length);
    }

    public static sprlem cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        sprxgf sprxgf2;
        if (!(arg1 || arg0.cfr_renamed_11481() || 128 != arg0.cfr_renamed_8120() || (sprxgf2 = arg0.cfr_renamed_8122().cfr_renamed_119()) instanceof sprlem)) {
            return sprlem.cfr_renamed_11492(sproug.cfr_renamed_23(sprxgf2).cfr_renamed_186());
        }
        return (sprlem)cfr_renamed_1.cfr_renamed_11433(arg0, arg1);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_4926(ByteArrayOutputStream arg0) {
        block2: {
            var2_2 = new sprpzm(this.cfr_renamed_3);
            var3_3 = Integer.parseInt(var2_2.cfr_renamed_4445()) * 40;
            var4_4 = var2_2.cfr_renamed_4445();
            if (var4_4.length() > 18) break block2;
            v0 = var2_2;
            sprjzm.cfr_renamed_4927(arg0, (long)var3_3 + Long.parseLong(var4_4));
            ** GOTO lbl12
        }
        sprjzm.cfr_renamed_4925(arg0, new BigInteger(var4_4).add(BigInteger.valueOf(var3_3)));
        while (true) {
            v0 = var2_2;
lbl12:
            // 2 sources

            if (!v0.cfr_renamed_4444()) break;
            var5_5 = var2_2.cfr_renamed_4445();
            if (var5_5.length() <= 18) {
                sprjzm.cfr_renamed_4927(arg0, Long.parseLong(var5_5));
                continue;
            }
            sprjzm.cfr_renamed_4925(arg0, new BigInteger(var5_5));
        }
    }

    public sprlem(byte[] arg0, boolean arg1) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        long l = 0L;
        BigInteger bigInteger = null;
        boolean bl = true;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = arg0[n] & 0xFF;
            if (l <= 0xFFFFFFFFFFFF80L) {
                l += (long)(n3 & 0x7F);
                if ((n3 & 0x80) == 0) {
                    if (bl) {
                        if (l < 40L) {
                            stringBuffer.append('0');
                        } else if (l < 80L) {
                            stringBuffer.append('1');
                            l -= 40L;
                        } else {
                            stringBuffer.append('2');
                            l -= 80L;
                        }
                        bl = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(l);
                    l = 0L;
                } else {
                    l <<= 7;
                }
            } else {
                if (bigInteger == null) {
                    bigInteger = BigInteger.valueOf(l);
                }
                bigInteger = bigInteger.or(BigInteger.valueOf(n3 & 0x7F));
                if ((n3 & 0x80) == 0) {
                    if (bl) {
                        stringBuffer.append('2');
                        bigInteger = bigInteger.subtract(BigInteger.valueOf(80L));
                        bl = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigInteger);
                    bigInteger = null;
                    l = 0L;
                } else {
                    bigInteger = bigInteger.shiftLeft(7);
                }
            }
            n2 = ++n;
        }
        this.cfr_renamed_3 = stringBuffer.toString();
        this.cfr_renamed_0 = arg1 ? sproze.cfr_renamed_158(arg0) : arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprlem(String string) {
        void arg0;
        if (string == null) {
            throw new NullPointerException(sprpzz.cfr_renamed_9("\u00134P8Z)];]8Fz\u0014>U3Z2@}V8\u00143A1X"));
        }
        if (!sprlem.cfr_renamed_4929((String)arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtgka.cfr_renamed_9("opnmrc<")).append((String)arg0).append(sprpzz.cfr_renamed_9("\u00143[)\u0014<Z}{\u0014p")).toString());
        }
        this.cfr_renamed_3 = arg0;
    }

    public static sprlem cfr_renamed_11492(byte[] arg0) {
        return sprlem.cfr_renamed_11491(arg0, true);
    }

    /*
     * WARNING - void declaration
     */
    public sprlem(sprlem sprlem2, String string) {
        void arg0;
        void arg1;
        if (!sprjzm.cfr_renamed_11490(string, 0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtgka.cfr_renamed_9("opnmrc<")).append((String)arg1).append(sprpzz.cfr_renamed_9("\u00143[)\u0014<\u0014+U1]9\u0014\u0012}\u0019\u0014?F<Z>\\")).toString());
        }
        this.cfr_renamed_3 = new StringBuilder().insert(0, arg0.cfr_renamed_19()).append(".").append((String)arg1).toString();
    }

    public static sprlem cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprlem) {
            return (sprlem)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprlem) {
                return (sprlem)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return (sprlem)cfr_renamed_1.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprtgka.cfr_renamed_9("zeuhy`<ps$\u007fkrwhvigh$sfva\u007fp<mxarpubuan$zvsi<fepy_A><")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpzz.cfr_renamed_9("]1X8S<X}[?^8W)\u00144Z}S8@\u0014Z.@<Z>Qg\u0014")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprlem cfr_renamed_9910() {
        sprjbn sprjbn2 = new sprjbn(this.cfr_renamed_4577());
        sprlem sprlem2 = (sprlem)cfr_renamed_4.get(sprjbn2);
        if (sprlem2 != null) {
            return sprlem2;
        }
        ConcurrentMap<sprjbn, sprlem> concurrentMap = cfr_renamed_4;
        synchronized (concurrentMap) {
            if (!cfr_renamed_4.containsKey(sprjbn2)) {
                cfr_renamed_4.put(sprjbn2, this);
                return this;
            }
            return (sprlem)cfr_renamed_4.get(sprjbn2);
        }
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }

    public sprlem cfr_renamed_1436(String arg0) {
        return new sprlem(this, arg0);
    }
}

