/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhsaa;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.spruyda;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprywm;
import java.io.IOException;
import java.math.BigInteger;

public class sprqvg
extends sprxgf {
    private final int cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private static final sprqvg[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4;

    public boolean cfr_renamed_5103(BigInteger arg0) {
        if (null != arg0) {
            sprqvg sprqvg2 = this;
            if (sprktm.cfr_renamed_11498(sprqvg2.cfr_renamed_2, sprqvg2.cfr_renamed_1, -1) == arg0.intValue() && this.cfr_renamed_97().equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprqvg)) {
            return false;
        }
        sprqvg sprqvg2 = (sprqvg)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_2, sprqvg2.cfr_renamed_2);
    }

    public BigInteger cfr_renamed_97() {
        return new BigInteger(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqvg(int n) {
        void arg0;
        if (n < 0) {
            throw new IllegalArgumentException(sprhsaa.cfr_renamed_9("_\u007fO|_c[e_u\u001a|ObN1Xt\u001a\u007fU\u007f\u0017\u007f_v[eSg_"));
        }
        this.cfr_renamed_2 = BigInteger.valueOf((long)arg0).toByteArray();
        this.cfr_renamed_1 = 0;
    }

    @Override
    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_2);
    }

    public sprqvg(byte[] arg0) {
        this(arg0, true);
    }

    public boolean cfr_renamed_7241(int arg0) {
        if (this.cfr_renamed_2.length - this.cfr_renamed_1 <= 4) {
            sprqvg sprqvg2 = this;
            if (sprktm.cfr_renamed_11498(sprqvg2.cfr_renamed_2, sprqvg2.cfr_renamed_1, -1) == arg0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 10, this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqvg(BigInteger bigInteger) {
        void arg0;
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException(spruyda.cfr_renamed_9("mA}Bm]i[mK(B}\\|\u000fjJ(AgA%AmHi[aYm"));
        }
        this.cfr_renamed_2 = arg0.toByteArray();
        this.cfr_renamed_1 = 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprqvg(byte[] byArray, boolean bl) {
        void arg1;
        void arg0;
        if (sprktm.cfr_renamed_11499(byArray)) {
            throw new IllegalArgumentException(sprhsaa.cfr_renamed_9("|[}\\~H|_u\u001atTdWtHpNt^"));
        }
        if (0 != (arg0[0] & 0x80)) {
            throw new IllegalArgumentException(spruyda.cfr_renamed_9("mA}Bm]i[mK(B}\\|\u000fjJ(AgA%AmHi[aYm"));
        }
        this.cfr_renamed_2 = (byte[])(arg1 != false ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
        this.cfr_renamed_1 = sprktm.cfr_renamed_11500((byte[])arg0);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_2.length);
    }

    public int cfr_renamed_5023() {
        if (this.cfr_renamed_2.length - this.cfr_renamed_1 > 4) {
            throw new ArithmeticException(sprhsaa.cfr_renamed_9("{Bt?\u000b1\u007f\u007fO|_c[e_u\u001a~Oe\u001a~\\1S\u007fN1HpTv_"));
        }
        sprqvg sprqvg2 = this;
        return sprktm.cfr_renamed_11498(sprqvg2.cfr_renamed_2, sprqvg2.cfr_renamed_1, -1);
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }

    public static sprqvg cfr_renamed_11491(byte[] arg0, boolean arg1) {
        if (arg0.length > 1) {
            return new sprqvg(arg0, arg1);
        }
        if (arg0.length == 0) {
            throw new IllegalArgumentException(spruyda.cfr_renamed_9("jFzEjZn\\jL\u000f`N{\u000frJz@(CmAo[`"));
        }
        int n = arg0[0] & 0xFF;
        if (n >= cfr_renamed_3.length) {
            return new sprqvg(arg0, arg1);
        }
        sprqvg sprqvg2 = cfr_renamed_3[n];
        if (sprqvg2 == null) {
            sprqvg.cfr_renamed_3[n] = new sprqvg(arg0, arg1);
            sprqvg2 = sprqvg.cfr_renamed_3[n];
        }
        return sprqvg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprqvg cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprqvg) {
            return (sprqvg)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruyda.cfr_renamed_9("aCdJoNd\u000fgMbJk[(Ff\u000foJ|ff\\|NfLm\u0015(")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprqvg)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhsaa.cfr_renamed_9("_\u007fY~^xTv\u001atHcUc\u001axT1]tNXTbNpTr_+\u001a")).append(exception.toString()).toString());
        }
    }

    static {
        cfr_renamed_4 = new sprywm(sprqvg.class, 10);
        cfr_renamed_3 = new sprqvg[12];
    }

    public static sprqvg cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprqvg)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }
}

