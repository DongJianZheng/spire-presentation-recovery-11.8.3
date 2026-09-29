/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprebn;
import com.spire.presentation.packages.sprjtba;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprose;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpzm;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

public class sprjzm
extends sprxgf {
    private byte[] cfr_renamed_1;
    private final String cfr_renamed_2;
    public static final sprqbn cfr_renamed_3 = new sprebn(sprjzm.class, 13);
    private static final long cfr_renamed_4 = 0xFFFFFFFFFFFF80L;

    @Override
    public int hashCode() {
        return this.cfr_renamed_2.hashCode();
    }

    public static sprjzm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprjzm) {
            return (sprjzm)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprjzm) {
                return (sprjzm)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            byte[] byArray = (byte[])arg0;
            try {
                return (sprjzm)cfr_renamed_3.cfr_renamed_184(byArray);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjtba.cfr_renamed_9("\u001em\u0011`\u001dhXx\u0017,\u001bc\u0016\u007f\f~\ro\f,\ni\u0014m\fe\u000eiXC1HXj\nc\u0015,\u001au\fi#QB,")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprose.cfr_renamed_9("$e!l*h!)\"k'l.}m`#)*l9@#z9h#j(3m")).append(arg0.getClass().getName()).toString());
    }

    private /* synthetic */ void cfr_renamed_4926(ByteArrayOutputStream arg0) {
        sprpzm sprpzm2 = new sprpzm(this.cfr_renamed_2);
        while (sprpzm2.cfr_renamed_4444()) {
            String string = sprpzm2.cfr_renamed_4445();
            if (string.length() <= 18) {
                sprjzm.cfr_renamed_4927(arg0, Long.parseLong(string));
                continue;
            }
            sprjzm.cfr_renamed_4925(arg0, new BigInteger(string));
        }
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }

    public static void cfr_renamed_4925(ByteArrayOutputStream arg0, BigInteger arg1) {
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
            byArray[n--] = (byte)(bigInteger.intValue() | 0x80);
            bigInteger = bigInteger.shiftRight(7);
            n3 = n;
        }
        int n4 = n2 - 1;
        byArray[n4] = (byte)(byArray[n4] & 0x7F);
        arg0.write(byArray, 0, byArray.length);
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 13, this.cfr_renamed_4577());
    }

    public String toString() {
        return this.cfr_renamed_19();
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_2;
    }

    public static void cfr_renamed_4927(ByteArrayOutputStream arg0, long arg1) {
        byte[] byArray = new byte[9];
        int n = 8;
        long l = arg1;
        long l2 = l;
        byArray[n] = (byte)((int)l & 0x7F);
        while (l2 >= 128L) {
            byArray[--n] = (byte)((int)(arg1 >>= 7) | 0x80);
            l2 = arg1;
        }
        int n2 = n;
        arg0.write(byArray, n2, 9 - n2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjzm(String string) {
        void arg0;
        if (string == null) {
            throw new NullPointerException(sprjtba.cfr_renamed_9("+\u0011h\u001db\fe\u001ee\u001d~_,\u001bm\u0016b\u0017xXn\u001d,\u0016y\u0014`"));
        }
        if (!sprjzm.cfr_renamed_11490((String)arg0, 0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprose.cfr_renamed_9(">}?`#nm")).append((String)arg0).append(sprjtba.cfr_renamed_9(",\u0016c\f,\u0019,\ni\u0014m\fe\u000eiXC1H")).toString());
        }
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprjzm)) {
            return false;
        }
        sprjzm sprjzm2 = (sprjzm)arg0;
        return this.cfr_renamed_2.equals(sprjzm2.cfr_renamed_2);
    }

    public static sprjzm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprjzm)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    private synchronized /* synthetic */ byte[] cfr_renamed_4577() {
        if (this.cfr_renamed_1 == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.cfr_renamed_4926(byteArrayOutputStream);
            this.cfr_renamed_1 = byteArrayOutputStream.toByteArray();
        }
        return this.cfr_renamed_1;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4577().length);
    }

    public static sprjzm cfr_renamed_11491(byte[] arg0, boolean arg1) {
        return new sprjzm(arg0, arg1);
    }

    public sprjzm cfr_renamed_1436(String arg0) {
        return new sprjzm(this, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprjzm(sprjzm sprjzm2, String string) {
        void arg0;
        void arg1;
        if (!sprjzm.cfr_renamed_11490(string, 0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprose.cfr_renamed_9(">}?`#nm")).append((String)arg1).append(sprjtba.cfr_renamed_9(",\u0016c\f,\u0019,\u000em\u0014e\u001c,7E<,\u001a~\u0019b\u001bd")).toString());
        }
        this.cfr_renamed_2 = new StringBuilder().insert(0, arg0.cfr_renamed_19()).append(".").append((String)arg1).toString();
    }

    public static sprjzm cfr_renamed_11492(byte[] arg0) {
        return sprjzm.cfr_renamed_11491(arg0, true);
    }

    public static boolean cfr_renamed_11490(String arg0, int arg1) {
        int n = 0;
        int n2 = arg0.length();
        while (--n2 >= arg1) {
            char c = arg0.charAt(n2);
            if (c == '.') {
                if (0 == n || n > 1 && arg0.charAt(n2 + 1) == '0') {
                    return false;
                }
                n = 0;
                continue;
            }
            if ('0' <= c && c <= '9') {
                ++n;
                continue;
            }
            return false;
        }
        return 0 != n && (n <= true || arg0.charAt(n2 + 1) != '0');
    }

    private /* synthetic */ sprjzm(byte[] arg0, boolean arg1) {
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
                    StringBuffer stringBuffer2;
                    if (bl) {
                        bl = false;
                        stringBuffer2 = stringBuffer;
                    } else {
                        StringBuffer stringBuffer3 = stringBuffer;
                        stringBuffer2 = stringBuffer3;
                        stringBuffer3.append('.');
                    }
                    stringBuffer2.append(l);
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
                    StringBuffer stringBuffer4;
                    if (bl) {
                        bl = false;
                        stringBuffer4 = stringBuffer;
                    } else {
                        StringBuffer stringBuffer5 = stringBuffer;
                        stringBuffer4 = stringBuffer5;
                        stringBuffer5.append('.');
                    }
                    stringBuffer4.append(bigInteger);
                    bigInteger = null;
                    l = 0L;
                } else {
                    bigInteger = bigInteger.shiftLeft(7);
                }
            }
            n2 = ++n;
        }
        this.cfr_renamed_2 = stringBuffer.toString();
        this.cfr_renamed_1 = arg1 ? sproze.cfr_renamed_158(arg0) : arg0;
    }
}

