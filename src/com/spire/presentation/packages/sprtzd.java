/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprdkea;
import com.spire.presentation.packages.sprjwn;
import com.spire.presentation.packages.sprkue;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

public class sprtzd
extends sprvva {
    private static final long cfr_renamed_1 = 0xFFFFFFFFFFFF80L;
    private byte[] cfr_renamed_2;
    private static sprtzd[][] cfr_renamed_3 = new sprtzd[256][];
    public String cfr_renamed_4;

    public sprtzd(byte[] arg0) {
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
        this.cfr_renamed_4 = stringBuffer.toString();
        this.cfr_renamed_2 = sprzra.cfr_renamed_158(arg0);
    }

    private /* synthetic */ void cfr_renamed_4925(ByteArrayOutputStream arg0, BigInteger arg1) {
        int n;
        int n2 = (arg1.bitLength() + 6) / 7;
        if (n2 == 0) {
            arg0.write(0);
            return;
        }
        BigInteger bigInteger = arg1;
        byte[] byArray = new byte[n2];
        int n3 = n = n2 - 1;
        while (n3 >= 0) {
            byArray[n--] = (byte)(bigInteger.intValue() & 0x7F | 0x80);
            bigInteger = bigInteger.shiftRight(7);
            n3 = n;
        }
        int n4 = n2 - 1;
        byArray[n4] = (byte)(byArray[n4] & 0x7F);
        arg0.write(byArray, 0, byArray.length);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprtzd)) {
            return false;
        }
        return this.cfr_renamed_4.equals(((sprtzd)arg0).cfr_renamed_4);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_4926(ByteArrayOutputStream arg0) {
        block2: {
            var2_2 = new sprkue(this.cfr_renamed_4);
            var3_3 = Integer.parseInt(var2_2.cfr_renamed_4445()) * 40;
            var4_4 = var2_2.cfr_renamed_4445();
            if (var4_4.length() > 18) break block2;
            v0 = var2_2;
            this.cfr_renamed_4927(arg0, (long)var3_3 + Long.parseLong(var4_4));
            ** GOTO lbl12
        }
        this.cfr_renamed_4925(arg0, new BigInteger(var4_4).add(BigInteger.valueOf(var3_3)));
        while (true) {
            v0 = var2_2;
lbl12:
            // 2 sources

            if (!v0.cfr_renamed_4444()) break;
            var5_5 = var2_2.cfr_renamed_4445();
            if (var5_5.length() <= 18) {
                this.cfr_renamed_4927(arg0, Long.parseLong(var5_5));
                continue;
            }
            this.cfr_renamed_4925(arg0, new BigInteger(var5_5));
        }
    }

    public static sprtzd cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprtzd) {
            return sprtzd.cfr_renamed_23(sprvva2);
        }
        return sprtzd.cfr_renamed_4807(sprxue.cfr_renamed_23(arg0.cfr_renamed_2456()).cfr_renamed_186());
    }

    private static /* synthetic */ boolean cfr_renamed_4928(String arg0, int arg1) {
        boolean bl = false;
        int n = arg0.length();
        while (--n >= arg1) {
            char c = arg0.charAt(n);
            if ('0' <= c && c <= '9') {
                bl = true;
                continue;
            }
            if (c == '.') {
                if (!bl) {
                    return false;
                }
                bl = false;
                continue;
            }
            return false;
        }
        return bl;
    }

    public synchronized byte[] cfr_renamed_2573() {
        if (this.cfr_renamed_2 == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.cfr_renamed_4926(byteArrayOutputStream);
            this.cfr_renamed_2 = byteArrayOutputStream.toByteArray();
        }
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprtzd cfr_renamed_4807(byte[] arg0) {
        if (arg0.length < 3) {
            return new sprtzd(arg0);
        }
        int n = arg0[arg0.length - 2] & 0xFF;
        int n2 = arg0[arg0.length - 1] & 0x7F;
        sprtzd[][] sprtzdArray = cfr_renamed_3;
        synchronized (cfr_renamed_3) {
            sprtzd sprtzd2;
            sprtzd[] sprtzdArray2;
            block12: {
                sprtzdArray2 = cfr_renamed_3[n];
                if (sprtzdArray2 == null) {
                    sprtzd.cfr_renamed_3[n] = new sprtzd[128];
                    sprtzdArray2 = sprtzd.cfr_renamed_3[n];
                }
                if ((sprtzd2 = sprtzdArray2[n2]) != null) break block12;
                sprtzdArray2[n2] = new sprtzd(arg0);
                // ** MonitorExit[var4_3] (shouldn't be in output)
                return sprtzdArray2[n2];
            }
            if (sprzra.cfr_renamed_92(arg0, sprtzd2.cfr_renamed_2573())) {
                // ** MonitorExit[var4_3] (shouldn't be in output)
                return sprtzd2;
            }
            sprtzdArray2 = cfr_renamed_3[n = n + 1 & 0xFF];
            if (sprtzdArray2 == null) {
                sprtzd.cfr_renamed_3[n] = new sprtzd[128];
                sprtzdArray2 = sprtzd.cfr_renamed_3[n];
            }
            if ((sprtzd2 = sprtzdArray2[n2]) == null) {
                sprtzdArray2[n2] = new sprtzd(arg0);
                // ** MonitorExit[var4_3] (shouldn't be in output)
                return sprtzdArray2[n2];
            }
            if (sprzra.cfr_renamed_92(arg0, sprtzd2.cfr_renamed_2573())) {
                // ** MonitorExit[var4_3] (shouldn't be in output)
                return sprtzd2;
            }
            sprtzd2 = sprtzdArray2[n2 = n2 + 1 & 0x7F];
            if (sprtzd2 == null) {
                sprtzdArray2[n2] = new sprtzd(arg0);
                // ** MonitorExit[var4_3] (shouldn't be in output)
                return sprtzdArray2[n2];
            }
            // ** MonitorExit[var4_3] (shouldn't be in output)
            if (sprzra.cfr_renamed_92(arg0, sprtzd2.cfr_renamed_2573())) {
                return sprtzd2;
            }
            return new sprtzd(arg0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtzd(sprtzd sprtzd2, String string) {
        void arg0;
        void arg1;
        if (!sprtzd.cfr_renamed_4928(string, 0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjwn.cfr_renamed_9("w\u0004v\u0019j\u0017$")).append((String)arg1).append(sprdkea.cfr_renamed_9("(\u007fge(p(gi}au(^AU(szpfr`")).toString());
        }
        this.cfr_renamed_4 = new StringBuilder().insert(0, arg0.cfr_renamed_19()).append(".").append((String)arg1).toString();
    }

    public static sprtzd cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtzd) {
            return (sprtzd)arg0;
        }
        if (arg0 instanceof spra && ((spra)arg0).cfr_renamed_119() instanceof sprtzd) {
            return (sprtzd)((spra)arg0).cfr_renamed_119();
        }
        if (arg0 instanceof byte[]) {
            byte[] byArray = (byte[])arg0;
            try {
                return (sprtzd)sprtzd.cfr_renamed_184(byArray);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjwn.cfr_renamed_9("b\u0011m\u001ca\u0014$\u0004kPg\u001fj\u0003p\u0002q\u0013pPk\u0012n\u0015g\u0004$\u0019`\u0015j\u0004m\u0016m\u0015vPb\u0002k\u001d$\u0012}\u0004a+YJ$")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdkea.cfr_renamed_9("a}dtopd1gsbtke(xf1ot|Xfb|pfrm+(")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        int n = this.cfr_renamed_2573().length;
        return 1 + sprcme.cfr_renamed_4586(n) + n;
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_4927(ByteArrayOutputStream arg0, long arg1) {
        byte[] byArray = new byte[9];
        int n = 8;
        long l = arg1;
        long l2 = l;
        byArray[n] = (byte)((int)l & 0x7F);
        while (l2 >= 128L) {
            byArray[--n] = (byte)((int)(arg1 >>= 7) & 0x7F | 0x80);
            l2 = arg1;
        }
        int n2 = n;
        arg0.write(byArray, n2, 9 - n2);
    }

    public String toString() {
        return this.cfr_renamed_19();
    }

    public sprtzd cfr_renamed_1436(String arg0) {
        return new sprtzd(this, arg0);
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        byte[] byArray = this.cfr_renamed_2573();
        sprope sprope2 = arg0;
        sprope2.cfr_renamed_4787(6);
        sprope2.cfr_renamed_4782(byArray.length);
        arg0.cfr_renamed_4923(byArray);
    }

    private static /* synthetic */ boolean cfr_renamed_4929(String arg0) {
        if (arg0.length() < 3 || arg0.charAt(1) != '.') {
            return false;
        }
        char c = arg0.charAt(0);
        if (c < '0' || c > '2') {
            return false;
        }
        return sprtzd.cfr_renamed_4928(arg0, 2);
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprtzd(String string) {
        void arg0;
        if (string == null) {
            throw new IllegalArgumentException(sprjwn.cfr_renamed_9("#\u0019`\u0015j\u0004m\u0016m\u0015vW$\u0013e\u001ej\u001fpPf\u0015$\u001eq\u001ch"));
        }
        if (!sprtzd.cfr_renamed_4929((String)arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdkea.cfr_renamed_9("{ezxfv(")).append((String)arg0).append(sprjwn.cfr_renamed_9("$\u001ek\u0004$\u0011jPK9@")).toString());
        }
        this.cfr_renamed_4 = arg0;
    }

    public boolean cfr_renamed_1493(sprtzd arg0) {
        String string = this.cfr_renamed_19();
        String string2 = arg0.cfr_renamed_19();
        return string.length() > string2.length() && string.charAt(string2.length()) == '.' && string.startsWith(string2);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }
}

