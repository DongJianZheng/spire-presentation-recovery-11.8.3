/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpym;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryrh;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.math.BigInteger;

public class sprktm
extends sprxgf {
    private final int cfr_renamed_0;
    public static final sprqbn cfr_renamed_1 = new sprpym(sprktm.class, 2);
    public static final int cfr_renamed_2 = -1;
    public static final int cfr_renamed_3 = 255;
    private final byte[] cfr_renamed_4;

    public int cfr_renamed_5087() {
        block3: {
            block2: {
                int n = this.cfr_renamed_4.length - this.cfr_renamed_0;
                if (n > 4) break block2;
                if (n != 4) break block3;
                sprktm sprktm2 = this;
                if (0 == (sprktm2.cfr_renamed_4[sprktm2.cfr_renamed_0] & 0x80)) break block3;
            }
            throw new ArithmeticException(spryrh.cfr_renamed_9("7#8^GP?\u001e\u0002\u0015\u0011\u0015\u0004P\u0019\u0005\u0002P\u0019\u0016V\u0000\u0019\u0003\u001f\u0004\u001f\u0006\u0013P\u001f\u001e\u0002P\u0004\u0011\u0018\u0017\u0013"));
        }
        sprktm sprktm3 = this;
        return sprktm.cfr_renamed_11498(sprktm3.cfr_renamed_4, sprktm3.cfr_renamed_0, 255);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprktm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprktm) {
            return (sprktm)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spryrh.cfr_renamed_9("\u001f\u001c\u001a\u0015\u0011\u0011\u001aP\u0019\u0012\u001c\u0015\u0015\u0004V\u0019\u0018P\u0011\u0015\u00029\u0018\u0003\u0002\u0011\u0018\u0013\u0013JV")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprktm)cfr_renamed_1.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzra.cfr_renamed_9("\u0007(\u0001)\u0006/\f!B#\u00104\r4B/\ff\u0005#\u0016\u000f\f5\u0016'\f%\u0007|B")).append(exception.toString()).toString());
        }
    }

    public boolean cfr_renamed_5103(BigInteger arg0) {
        if (null != arg0) {
            sprktm sprktm2 = this;
            if (sprktm.cfr_renamed_11498(sprktm2.cfr_renamed_4, sprktm2.cfr_renamed_0, -1) == arg0.intValue() && this.cfr_renamed_97().equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    public static int cfr_renamed_11498(byte[] arg0, int arg1, int arg2) {
        int n = arg0.length;
        int n2 = Math.max(arg1, n - 4);
        int n3 = arg0[n2] & arg2;
        while (++n2 < n) {
            n3 = n3 << 8 | arg0[n2] & 0xFF;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public sprktm(byte[] byArray, boolean bl) {
        void arg0;
        void arg1;
        if (sprktm.cfr_renamed_11499(byArray)) {
            throw new IllegalArgumentException(sprzra.cfr_renamed_9("\u000f'\u000e \r4\u000f#\u0006f\u000b(\u0016#\u0005#\u0010"));
        }
        this.cfr_renamed_4 = (byte[])(arg1 != false ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
        this.cfr_renamed_0 = sprktm.cfr_renamed_11500((byte[])arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_11499(byte[] arg0) {
        switch (arg0.length) {
            case 0: {
                return true;
            }
            case 1: {
                return false;
            }
        }
        return arg0[0] == arg0[1] >> 7 && !sprjcf.cfr_renamed_5159(spryrh.cfr_renamed_9("\u0013\u0019\u001dX\u0003\u0006\u0019\u0004\u0015X\u0000\u0005\u001d\u0019\u0014\u0013\u001cX\u0003\u0013\u0013\u0003\u0002\u001f\u0004\u000f^\u0017\u0003\u0018AX\u0011\u001a\u001c\u0019\u0007)\u0005\u0018\u0003\u0017\u0016\u0013/\u001f\u001e\u0002\u0015\u0011\u0015\u0004"));
    }

    @Override
    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public long cfr_renamed_7242() {
        if (this.cfr_renamed_4.length - this.cfr_renamed_0 > 8) {
            throw new ArithmeticException(sprzra.cfr_renamed_9("#\u0015,hSf+(\u0016#\u0005#\u0010f\r3\u0016f\r B*\r(\u0005f\u0010'\f!\u0007"));
        }
        sprktm sprktm2 = this;
        return sprktm.cfr_renamed_11501(sprktm2.cfr_renamed_4, sprktm2.cfr_renamed_0, -1);
    }

    public sprktm(byte[] arg0) {
        this(arg0, true);
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprktm)) {
            return false;
        }
        sprktm sprktm2 = (sprktm)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprktm2.cfr_renamed_4);
    }

    public static long cfr_renamed_11501(byte[] arg0, int arg1, int arg2) {
        int n = arg0.length;
        int n2 = Math.max(arg1, n - 8);
        long l = arg0[n2] & arg2;
        while (++n2 < n) {
            l = l << 8 | (long)(arg0[n2] & 0xFF);
        }
        return l;
    }

    public BigInteger cfr_renamed_97() {
        return new BigInteger(this.cfr_renamed_4);
    }

    public static sprktm cfr_renamed_11295(byte[] arg0) {
        return new sprktm(arg0, false);
    }

    public static int cfr_renamed_11500(byte[] arg0) {
        int n = 0;
        int n2 = arg0.length - 1;
        int n3 = n;
        while (n3 < n2 && arg0[n] == arg0[n + 1] >> 7) {
            n3 = ++n;
        }
        return n;
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }

    public int cfr_renamed_5023() {
        if (this.cfr_renamed_4.length - this.cfr_renamed_0 > 4) {
            throw new ArithmeticException(spryrh.cfr_renamed_9("1%>XAV9\u0018\u0004\u0013\u0017\u0013\u0002V\u001f\u0003\u0004V\u001f\u0010P\u001f\u001e\u0002P\u0004\u0011\u0018\u0017\u0013"));
        }
        sprktm sprktm2 = this;
        return sprktm.cfr_renamed_11498(sprktm2.cfr_renamed_4, sprktm2.cfr_renamed_0, -1);
    }

    public boolean cfr_renamed_7241(int arg0) {
        if (this.cfr_renamed_4.length - this.cfr_renamed_0 <= 4) {
            sprktm sprktm2 = this;
            if (sprktm.cfr_renamed_11498(sprktm2.cfr_renamed_4, sprktm2.cfr_renamed_0, -1) == arg0) {
                return true;
            }
        }
        return false;
    }

    public static sprktm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprktm)cfr_renamed_1.cfr_renamed_11433(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprktm(BigInteger bigInteger) {
        void arg0;
        sprktm sprktm2 = this;
        sprktm2.cfr_renamed_4 = arg0.toByteArray();
        sprktm2.cfr_renamed_0 = 0;
    }

    public String toString() {
        return this.cfr_renamed_97().toString();
    }

    public boolean cfr_renamed_11502(long arg0) {
        if (this.cfr_renamed_4.length - this.cfr_renamed_0 <= 8) {
            sprktm sprktm2 = this;
            if (sprktm.cfr_renamed_11501(sprktm2.cfr_renamed_4, sprktm2.cfr_renamed_0, -1) == arg0) {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprktm(long l) {
        void arg0;
        sprktm sprktm2 = this;
        sprktm2.cfr_renamed_4 = BigInteger.valueOf((long)arg0).toByteArray();
        sprktm2.cfr_renamed_0 = 0;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length);
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 2, this.cfr_renamed_4);
    }

    public BigInteger cfr_renamed_162() {
        return new BigInteger(1, this.cfr_renamed_4);
    }
}

