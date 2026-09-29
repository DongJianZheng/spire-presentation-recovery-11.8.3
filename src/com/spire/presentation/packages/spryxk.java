/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfx;
import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.sprpsd;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.spryuk;
import java.math.BigInteger;

public class spryxk
implements sprfx {
    private final spraq cfr_renamed_93;
    private final int cfr_renamed_86;
    private static final BigInteger cfr_renamed_152;
    private int cfr_renamed_112;
    private boolean cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private static final BigInteger cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3511() {
        spryxk spryxk2;
        if (this.cfr_renamed_112 == 0) {
            spryxk spryxk3 = this;
            spryxk3.cfr_renamed_93.cfr_renamed_1197(spryxk3.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            spryxk spryxk4 = this;
            spryxk2 = spryxk4;
            this.cfr_renamed_93.cfr_renamed_1219(spryxk4.cfr_renamed_3, 0);
        } else {
            spryxk spryxk5 = this;
            spryxk5.cfr_renamed_93.cfr_renamed_1197(spryxk5.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            spryxk spryxk6 = this;
            spryxk2 = spryxk6;
            this.cfr_renamed_93.cfr_renamed_1219(spryxk6.cfr_renamed_3, 0);
        }
        spryxk2.cfr_renamed_93.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        if (this.cfr_renamed_119) {
            spryxk spryxk7 = this;
            int n = this.cfr_renamed_112 / spryxk7.cfr_renamed_86 + 1;
            switch (spryxk7.cfr_renamed_4.length) {
                case 4: {
                    this.cfr_renamed_4[0] = (byte)(n >>> 24);
                }
                case 3: {
                    spryxk spryxk8 = this;
                    spryxk8.cfr_renamed_4[spryxk8.cfr_renamed_4.length - 3] = (byte)(n >>> 16);
                }
                case 2: {
                    spryxk spryxk9 = this;
                    spryxk9.cfr_renamed_4[spryxk9.cfr_renamed_4.length - 2] = (byte)(n >>> 8);
                }
                case 1: {
                    spryxk spryxk10 = this;
                    while (false) {
                    }
                    spryxk10.cfr_renamed_4[spryxk10.cfr_renamed_4.length - 1] = (byte)n;
                    break;
                }
                default: {
                    throw new IllegalStateException(sprhna.cfr_renamed_9("-}\u000bf\bc\u0017a\fv\u001c3\u000bz\u0002vX|\u001e3\u001b|\r}\fv\n3\u0011"));
                }
            }
            this.cfr_renamed_93.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        }
        spryxk spryxk11 = this;
        spryxk11.cfr_renamed_93.cfr_renamed_1197(spryxk11.cfr_renamed_91, 0, this.cfr_renamed_91.length);
        spryxk spryxk12 = this;
        spryxk12.cfr_renamed_93.cfr_renamed_1219(spryxk12.cfr_renamed_1, 0);
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        int n = this.cfr_renamed_112 + arg2;
        if (n < 0 || n >= this.cfr_renamed_0) {
            throw new sprddl(new StringBuilder().insert(0, sprpsd.cfr_renamed_9("\u001bG*@=\\,\u0012\u0013v\u001eq\f`x_9Kx]6^!\u0012:WxG+W<\u0012>]*\u0012")).append(this.cfr_renamed_0).append(sprhna.cfr_renamed_9("3\u001aj\fv\u000b")).toString());
        }
        spryxk spryxk2 = this;
        if (spryxk2.cfr_renamed_112 % spryxk2.cfr_renamed_86 == 0) {
            this.cfr_renamed_3511();
        }
        int n2 = arg2;
        spryxk spryxk3 = this;
        spryxk spryxk4 = this;
        int n3 = spryxk3.cfr_renamed_112 % spryxk4.cfr_renamed_86;
        spryxk spryxk5 = this;
        int n4 = Math.min(spryxk3.cfr_renamed_86 - spryxk5.cfr_renamed_112 % spryxk5.cfr_renamed_86, n2);
        System.arraycopy(spryxk4.cfr_renamed_1, n3, arg0, arg1, n4);
        spryxk3.cfr_renamed_112 += n4;
        arg1 += n4;
        int n5 = n2 -= n4;
        while (n5 > 0) {
            spryxk spryxk6 = this;
            spryxk6.cfr_renamed_3511();
            n4 = Math.min(spryxk6.cfr_renamed_86, n2);
            System.arraycopy(spryxk6.cfr_renamed_1, 0, arg0, arg1, n4);
            spryxk6.cfr_renamed_112 += n4;
            arg1 += n4;
            n5 = n2 -= n4;
        }
        return arg2;
    }

    @Override
    public spraq cfr_renamed_1472() {
        return this.cfr_renamed_93;
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        spryxk spryxk2;
        spryuk spryuk2;
        if (!(arg0 instanceof spryuk)) {
            throw new IllegalArgumentException(sprpsd.cfr_renamed_9("e*]6UxF!B=\u00127TxS*U-_=\\,AxU1D=\\"));
        }
        spryuk spryuk3 = spryuk2 = (spryuk)arg0;
        this.cfr_renamed_93.cfr_renamed_5692(new sprtpk(spryuk2.cfr_renamed_3356()));
        this.cfr_renamed_91 = spryuk2.cfr_renamed_3357();
        int n = spryuk3.cfr_renamed_3353();
        this.cfr_renamed_4 = new byte[n / 8];
        if (spryuk3.cfr_renamed_3355()) {
            BigInteger bigInteger = cfr_renamed_152.pow(n).multiply(BigInteger.valueOf(this.cfr_renamed_86));
            this.cfr_renamed_0 = bigInteger.compareTo(cfr_renamed_2) == 1 ? Integer.MAX_VALUE : bigInteger.intValue();
            spryxk2 = this;
        } else {
            spryxk2 = this;
            this.cfr_renamed_0 = Integer.MAX_VALUE;
        }
        spryxk2.cfr_renamed_119 = spryuk2.cfr_renamed_3355();
        this.cfr_renamed_112 = 0;
    }

    public spryxk(spraq arg0) {
        this.cfr_renamed_93 = arg0;
        this.cfr_renamed_86 = arg0.cfr_renamed_2404();
        this.cfr_renamed_3 = new byte[this.cfr_renamed_86];
        this.cfr_renamed_1 = new byte[this.cfr_renamed_86];
    }

    static {
        cfr_renamed_2 = BigInteger.valueOf(Integer.MAX_VALUE);
        cfr_renamed_152 = BigInteger.valueOf(2L);
    }
}

