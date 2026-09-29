/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfx;
import com.spire.presentation.packages.sprhno;
import com.spire.presentation.packages.spritk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprzyo;
import java.math.BigInteger;

public class sprkbl
implements sprfx {
    private byte[] cfr_renamed_93;
    private int cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private boolean cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private final int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(2L);
    private int cfr_renamed_3;
    private final spraq cfr_renamed_4;

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        int n = this.cfr_renamed_86 + arg2;
        if (n < 0 || n >= this.cfr_renamed_3) {
            throw new sprddl(new StringBuilder().insert(0, sprhno.cfr_renamed_9("\u0006\u00017\u0006 \u001a1T\u000e0\u00037\u0011&e\u0019$\re\u001b+\u0018<T'\u0011e\u00016\u0011!T#\u001b7T")).append(this.cfr_renamed_3).append(sprzyo.cfr_renamed_9("\u000e-W;K<")).toString());
        }
        sprkbl sprkbl2 = this;
        if (sprkbl2.cfr_renamed_86 % sprkbl2.cfr_renamed_91 == 0) {
            this.cfr_renamed_3511();
        }
        int n2 = arg2;
        sprkbl sprkbl3 = this;
        sprkbl sprkbl4 = this;
        int n3 = sprkbl3.cfr_renamed_86 % sprkbl4.cfr_renamed_91;
        sprkbl sprkbl5 = this;
        int n4 = Math.min(sprkbl3.cfr_renamed_91 - sprkbl5.cfr_renamed_86 % sprkbl5.cfr_renamed_91, n2);
        System.arraycopy(sprkbl4.cfr_renamed_0, n3, arg0, arg1, n4);
        sprkbl3.cfr_renamed_86 += n4;
        arg1 += n4;
        int n5 = n2 -= n4;
        while (n5 > 0) {
            sprkbl sprkbl6 = this;
            sprkbl6.cfr_renamed_3511();
            n4 = Math.min(sprkbl6.cfr_renamed_91, n2);
            System.arraycopy(sprkbl6.cfr_renamed_0, 0, arg0, arg1, n4);
            sprkbl6.cfr_renamed_86 += n4;
            arg1 += n4;
            n5 = n2 -= n4;
        }
        return arg2;
    }

    @Override
    public spraq cfr_renamed_1472() {
        return this.cfr_renamed_4;
    }

    public sprkbl(spraq arg0) {
        sprkbl sprkbl2 = this;
        this.cfr_renamed_4 = arg0;
        sprkbl2.cfr_renamed_91 = arg0.cfr_renamed_2404();
        sprkbl2.cfr_renamed_0 = new byte[this.cfr_renamed_91];
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        sprkbl sprkbl2;
        spritk spritk2;
        if (!(arg0 instanceof spritk)) {
            throw new IllegalArgumentException(sprhno.cfr_renamed_9("#7\u001b+\u0013e\u0000<\u0004 T*\u0012e\u00157\u00130\u0019 \u001a1\u0007e\u0013,\u0002 \u001a"));
        }
        spritk spritk3 = spritk2 = (spritk)arg0;
        this.cfr_renamed_4.cfr_renamed_5692(new sprtpk(spritk2.cfr_renamed_3356()));
        this.cfr_renamed_152 = spritk2.cfr_renamed_3357();
        int n = spritk3.cfr_renamed_3353();
        this.cfr_renamed_93 = new byte[n / 8];
        if (spritk3.cfr_renamed_3355()) {
            BigInteger bigInteger = cfr_renamed_2.pow(n).multiply(BigInteger.valueOf(this.cfr_renamed_91));
            this.cfr_renamed_3 = bigInteger.compareTo(cfr_renamed_1) == 1 ? Integer.MAX_VALUE : bigInteger.intValue();
            sprkbl2 = this;
        } else {
            sprkbl2 = this;
            this.cfr_renamed_3 = Integer.MAX_VALUE;
        }
        sprkbl2.cfr_renamed_119 = spritk2.cfr_renamed_1205();
        sprkbl sprkbl3 = this;
        sprkbl3.cfr_renamed_112 = spritk2.cfr_renamed_3355();
        sprkbl3.cfr_renamed_86 = 0;
    }

    private /* synthetic */ void cfr_renamed_3511() {
        sprkbl sprkbl2;
        if (this.cfr_renamed_86 == 0) {
            sprkbl sprkbl3 = this;
            sprkbl3.cfr_renamed_4.cfr_renamed_1197(sprkbl3.cfr_renamed_119, 0, this.cfr_renamed_119.length);
            sprkbl2 = this;
        } else {
            sprkbl sprkbl4 = this;
            sprkbl4.cfr_renamed_4.cfr_renamed_1197(sprkbl4.cfr_renamed_0, 0, this.cfr_renamed_0.length);
            sprkbl2 = this;
        }
        if (sprkbl2.cfr_renamed_112) {
            sprkbl sprkbl5 = this;
            int n = this.cfr_renamed_86 / sprkbl5.cfr_renamed_91 + 1;
            switch (sprkbl5.cfr_renamed_93.length) {
                case 4: {
                    this.cfr_renamed_93[0] = (byte)(n >>> 24);
                }
                case 3: {
                    sprkbl sprkbl6 = this;
                    sprkbl6.cfr_renamed_93[sprkbl6.cfr_renamed_93.length - 3] = (byte)(n >>> 16);
                }
                case 2: {
                    sprkbl sprkbl7 = this;
                    sprkbl7.cfr_renamed_93[sprkbl7.cfr_renamed_93.length - 2] = (byte)(n >>> 8);
                }
                case 1: {
                    sprkbl sprkbl8 = this;
                    while (false) {
                    }
                    sprkbl8.cfr_renamed_93[sprkbl8.cfr_renamed_93.length - 1] = (byte)n;
                    break;
                }
                default: {
                    throw new IllegalStateException(sprzyo.cfr_renamed_9("\u001a@<[?^ \\;K+\u000e<G5KoA)\u000e,A:@;K=\u000e&"));
                }
            }
            this.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_93, 0, this.cfr_renamed_93.length);
        }
        sprkbl sprkbl9 = this;
        sprkbl9.cfr_renamed_4.cfr_renamed_1197(sprkbl9.cfr_renamed_152, 0, this.cfr_renamed_152.length);
        sprkbl sprkbl10 = this;
        sprkbl10.cfr_renamed_4.cfr_renamed_1219(sprkbl10.cfr_renamed_0, 0);
    }
}

