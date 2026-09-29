/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprfiz;
import com.spire.presentation.packages.sprihd;
import com.spire.presentation.packages.sprim;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprnuc;
import com.spire.presentation.packages.spruc;
import java.math.BigInteger;

public class sprsjd
implements sprim {
    private byte[] cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private boolean cfr_renamed_152;
    private static final BigInteger cfr_renamed_112 = BigInteger.valueOf(Integer.MAX_VALUE);
    private final int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private final spruc cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(2L);

    @Override
    public spruc cfr_renamed_1472() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        sprsjd sprsjd2;
        sprihd sprihd2;
        if (!(arg0 instanceof sprihd)) {
            throw new IllegalArgumentException(sprfiz.cfr_renamed_9("9\u0017\u0001\u000b\tE\u001a\u001c\u001e\u0000N\n\bE\u000f\u0017\t\u0010\u0003\u0000\u0000\u0011\u001dE\t\f\u0018\u0000\u0000"));
        }
        sprihd sprihd3 = sprihd2 = (sprihd)arg0;
        this.cfr_renamed_3.cfr_renamed_1524(new sprnld(sprihd2.cfr_renamed_3356()));
        this.cfr_renamed_1 = sprihd2.cfr_renamed_3357();
        int n = sprihd3.cfr_renamed_3353();
        this.cfr_renamed_93 = new byte[n / 8];
        if (sprihd3.cfr_renamed_3355()) {
            BigInteger bigInteger = cfr_renamed_4.pow(n).multiply(BigInteger.valueOf(this.cfr_renamed_119));
            this.cfr_renamed_0 = bigInteger.compareTo(cfr_renamed_112) == 1 ? Integer.MAX_VALUE : bigInteger.intValue();
            sprsjd2 = this;
        } else {
            sprsjd2 = this;
            this.cfr_renamed_0 = Integer.MAX_VALUE;
        }
        sprsjd2.cfr_renamed_152 = sprihd2.cfr_renamed_3355();
        this.cfr_renamed_2 = 0;
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        int n = this.cfr_renamed_2 + arg2;
        if (n < 0 || n >= this.cfr_renamed_0) {
            throw new sprjkd(new StringBuilder().insert(0, sprnuc.cfr_renamed_9("UAdFsZb\u0014]pPwBf6YwM6[xXo\u0014tQ6AeQr\u0014p[d\u0014")).append(this.cfr_renamed_0).append(sprfiz.cfr_renamed_9("E\f\u001c\u001a\u0000\u001d")).toString());
        }
        sprsjd sprsjd2 = this;
        if (sprsjd2.cfr_renamed_2 % sprsjd2.cfr_renamed_119 == 0) {
            this.cfr_renamed_3511();
        }
        int n2 = arg2;
        sprsjd sprsjd3 = this;
        sprsjd sprsjd4 = this;
        int n3 = sprsjd3.cfr_renamed_2 % sprsjd4.cfr_renamed_119;
        sprsjd sprsjd5 = this;
        int n4 = Math.min(sprsjd3.cfr_renamed_119 - sprsjd5.cfr_renamed_2 % sprsjd5.cfr_renamed_119, n2);
        System.arraycopy(sprsjd4.cfr_renamed_86, n3, arg0, arg1, n4);
        sprsjd3.cfr_renamed_2 += n4;
        arg1 += n4;
        int n5 = n2 -= n4;
        while (n5 > 0) {
            sprsjd sprsjd6 = this;
            sprsjd6.cfr_renamed_3511();
            n4 = Math.min(sprsjd6.cfr_renamed_119, n2);
            System.arraycopy(sprsjd6.cfr_renamed_86, 0, arg0, arg1, n4);
            sprsjd6.cfr_renamed_2 += n4;
            arg1 += n4;
            n5 = n2 -= n4;
        }
        return arg2;
    }

    public sprsjd(spruc arg0) {
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_119 = arg0.cfr_renamed_2404();
        this.cfr_renamed_91 = new byte[this.cfr_renamed_119];
        this.cfr_renamed_86 = new byte[this.cfr_renamed_119];
    }

    private /* synthetic */ void cfr_renamed_3511() {
        sprsjd sprsjd2;
        if (this.cfr_renamed_2 == 0) {
            sprsjd sprsjd3 = this;
            sprsjd3.cfr_renamed_3.cfr_renamed_1197(sprsjd3.cfr_renamed_1, 0, this.cfr_renamed_1.length);
            sprsjd sprsjd4 = this;
            sprsjd2 = sprsjd4;
            this.cfr_renamed_3.cfr_renamed_1219(sprsjd4.cfr_renamed_91, 0);
        } else {
            sprsjd sprsjd5 = this;
            sprsjd5.cfr_renamed_3.cfr_renamed_1197(sprsjd5.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            sprsjd sprsjd6 = this;
            sprsjd2 = sprsjd6;
            this.cfr_renamed_3.cfr_renamed_1219(sprsjd6.cfr_renamed_91, 0);
        }
        sprsjd2.cfr_renamed_3.cfr_renamed_1197(this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
        if (this.cfr_renamed_152) {
            sprsjd sprsjd7 = this;
            int n = this.cfr_renamed_2 / sprsjd7.cfr_renamed_119 + 1;
            switch (sprsjd7.cfr_renamed_93.length) {
                case 4: {
                    this.cfr_renamed_93[0] = (byte)(n >>> 24);
                }
                case 3: {
                    sprsjd sprsjd8 = this;
                    sprsjd8.cfr_renamed_93[sprsjd8.cfr_renamed_93.length - 3] = (byte)(n >>> 16);
                }
                case 2: {
                    sprsjd sprsjd9 = this;
                    sprsjd9.cfr_renamed_93[sprsjd9.cfr_renamed_93.length - 2] = (byte)(n >>> 8);
                }
                case 1: {
                    sprsjd sprsjd10 = this;
                    while (false) {
                    }
                    sprsjd10.cfr_renamed_93[sprsjd10.cfr_renamed_93.length - 1] = (byte)n;
                    break;
                }
                default: {
                    throw new IllegalStateException(sprnuc.cfr_renamed_9("axGcDf[d@sP6G\u007fNs\u0014yR6WyAx@sF6]"));
                }
            }
            this.cfr_renamed_3.cfr_renamed_1197(this.cfr_renamed_93, 0, this.cfr_renamed_93.length);
        }
        sprsjd sprsjd11 = this;
        sprsjd11.cfr_renamed_3.cfr_renamed_1197(sprsjd11.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        sprsjd sprsjd12 = this;
        sprsjd12.cfr_renamed_3.cfr_renamed_1219(sprsjd12.cfr_renamed_86, 0);
    }
}

