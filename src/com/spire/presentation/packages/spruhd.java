/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprim;
import com.spire.presentation.packages.sprjhd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprltq;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.spryez;
import java.math.BigInteger;

public class spruhd
implements sprim {
    private int cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private static final BigInteger cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private final int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final spruc cfr_renamed_4;

    public spruhd(spruc arg0) {
        spruhd spruhd2 = this;
        this.cfr_renamed_4 = arg0;
        spruhd2.cfr_renamed_2 = arg0.cfr_renamed_2404();
        spruhd2.cfr_renamed_119 = new byte[this.cfr_renamed_2];
    }

    @Override
    public spruc cfr_renamed_1472() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        if (!(arg0 instanceof sprjhd)) {
            throw new IllegalArgumentException(spryez.cfr_renamed_9("CO{Ss\u001d`DdX4Rr\u001duOsHyXzIg\u001dsTbXz"));
        }
        sprjhd sprjhd2 = (sprjhd)arg0;
        spruhd spruhd2 = this;
        sprjhd sprjhd3 = sprjhd2;
        this.cfr_renamed_4.cfr_renamed_1524(new sprnld(sprjhd2.cfr_renamed_3356()));
        this.cfr_renamed_3 = sprjhd3.cfr_renamed_3360();
        spruhd2.cfr_renamed_0 = sprjhd3.cfr_renamed_3361();
        int n = sprjhd2.cfr_renamed_3353();
        spruhd2.cfr_renamed_152 = new byte[n / 8];
        BigInteger bigInteger = cfr_renamed_91.pow(n).multiply(BigInteger.valueOf(this.cfr_renamed_2));
        spruhd2.cfr_renamed_112 = bigInteger.compareTo(cfr_renamed_1) == 1 ? Integer.MAX_VALUE : bigInteger.intValue();
        this.cfr_renamed_86 = 0;
    }

    private /* synthetic */ void cfr_renamed_3511() {
        spruhd spruhd2 = this;
        int n = this.cfr_renamed_86 / spruhd2.cfr_renamed_2 + 1;
        switch (spruhd2.cfr_renamed_152.length) {
            case 4: {
                this.cfr_renamed_152[0] = (byte)(n >>> 24);
            }
            case 3: {
                spruhd spruhd3 = this;
                spruhd3.cfr_renamed_152[spruhd3.cfr_renamed_152.length - 3] = (byte)(n >>> 16);
            }
            case 2: {
                spruhd spruhd4 = this;
                spruhd4.cfr_renamed_152[spruhd4.cfr_renamed_152.length - 2] = (byte)(n >>> 8);
            }
            case 1: {
                spruhd spruhd5 = this;
                while (false) {
                }
                spruhd5.cfr_renamed_152[spruhd5.cfr_renamed_152.length - 1] = (byte)n;
                break;
            }
            default: {
                throw new IllegalStateException(sprltq.cfr_renamed_9("6\u000f\u0010\u0014\u0013\u0011\f\u0013\u0017\u0004\u0007A\u0010\b\u0019\u0004C\u000e\u0005A\u0000\u000e\u0016\u000f\u0017\u0004\u0011A\n"));
            }
        }
        this.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        spruhd spruhd6 = this;
        spruhd6.cfr_renamed_4.cfr_renamed_1197(spruhd6.cfr_renamed_152, 0, this.cfr_renamed_152.length);
        spruhd spruhd7 = this;
        spruhd7.cfr_renamed_4.cfr_renamed_1197(spruhd7.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        spruhd spruhd8 = this;
        spruhd8.cfr_renamed_4.cfr_renamed_1219(spruhd8.cfr_renamed_119, 0);
    }

    static {
        cfr_renamed_1 = BigInteger.valueOf(Integer.MAX_VALUE);
        cfr_renamed_91 = BigInteger.valueOf(2L);
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        int n = this.cfr_renamed_86 + arg2;
        if (n < 0 || n >= this.cfr_renamed_112) {
            throw new sprjkd(new StringBuilder().insert(0, spryez.cfr_renamed_9("~aOfXzI4vP{WiF\u001dy\\m\u001d{SxD4_q\u001daNqY4[{O4")).append(this.cfr_renamed_112).append(sprltq.cfr_renamed_9("A\u0001\u0018\u0017\u0004\u0010")).toString());
        }
        spruhd spruhd2 = this;
        if (spruhd2.cfr_renamed_86 % spruhd2.cfr_renamed_2 == 0) {
            this.cfr_renamed_3511();
        }
        int n2 = arg2;
        spruhd spruhd3 = this;
        spruhd spruhd4 = this;
        int n3 = spruhd3.cfr_renamed_86 % spruhd4.cfr_renamed_2;
        spruhd spruhd5 = this;
        int n4 = Math.min(spruhd3.cfr_renamed_2 - spruhd5.cfr_renamed_86 % spruhd5.cfr_renamed_2, n2);
        System.arraycopy(spruhd4.cfr_renamed_119, n3, arg0, arg1, n4);
        spruhd3.cfr_renamed_86 += n4;
        arg1 += n4;
        int n5 = n2 -= n4;
        while (n5 > 0) {
            spruhd spruhd6 = this;
            spruhd6.cfr_renamed_3511();
            n4 = Math.min(spruhd6.cfr_renamed_2, n2);
            System.arraycopy(spruhd6.cfr_renamed_119, 0, arg0, arg1, n4);
            spruhd6.cfr_renamed_86 += n4;
            arg1 += n4;
            n5 = n2 -= n4;
        }
        return arg2;
    }
}

