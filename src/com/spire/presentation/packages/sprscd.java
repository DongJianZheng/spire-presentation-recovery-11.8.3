/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreds;
import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprim;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprrdd;
import com.spire.presentation.packages.spruc;
import java.math.BigInteger;

public class sprscd
implements sprim {
    private int cfr_renamed_93;
    private static final BigInteger cfr_renamed_86 = BigInteger.valueOf(Integer.MAX_VALUE);
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private final int cfr_renamed_91;
    private final spruc cfr_renamed_0;
    private boolean cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(2L);
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3511() {
        sprscd sprscd2;
        if (this.cfr_renamed_93 == 0) {
            sprscd sprscd3 = this;
            sprscd3.cfr_renamed_0.cfr_renamed_1197(sprscd3.cfr_renamed_152, 0, this.cfr_renamed_152.length);
            sprscd2 = this;
        } else {
            sprscd sprscd4 = this;
            sprscd4.cfr_renamed_0.cfr_renamed_1197(sprscd4.cfr_renamed_112, 0, this.cfr_renamed_112.length);
            sprscd2 = this;
        }
        if (sprscd2.cfr_renamed_1) {
            sprscd sprscd5 = this;
            int n = this.cfr_renamed_93 / sprscd5.cfr_renamed_91 + 1;
            switch (sprscd5.cfr_renamed_119.length) {
                case 4: {
                    this.cfr_renamed_119[0] = (byte)(n >>> 24);
                }
                case 3: {
                    sprscd sprscd6 = this;
                    sprscd6.cfr_renamed_119[sprscd6.cfr_renamed_119.length - 3] = (byte)(n >>> 16);
                }
                case 2: {
                    sprscd sprscd7 = this;
                    sprscd7.cfr_renamed_119[sprscd7.cfr_renamed_119.length - 2] = (byte)(n >>> 8);
                }
                case 1: {
                    sprscd sprscd8 = this;
                    while (false) {
                    }
                    sprscd8.cfr_renamed_119[sprscd8.cfr_renamed_119.length - 1] = (byte)n;
                    break;
                }
                default: {
                    throw new IllegalStateException(spreds.cfr_renamed_9("\u007f\u001eY\u0005Z\u0000E\u0002^\u0015NPY\u0019P\u0015\n\u001fLPI\u001f_\u001e^\u0015XPC"));
                }
            }
            this.cfr_renamed_0.cfr_renamed_1197(this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
        }
        sprscd sprscd9 = this;
        sprscd9.cfr_renamed_0.cfr_renamed_1197(sprscd9.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprscd sprscd10 = this;
        sprscd10.cfr_renamed_0.cfr_renamed_1219(sprscd10.cfr_renamed_112, 0);
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        sprscd sprscd2;
        sprrdd sprrdd2;
        if (!(arg0 instanceof sprrdd)) {
            throw new IllegalArgumentException(sprjgba.cfr_renamed_9("Do|st=gdcx3ru=roth~x}i`=ttex}"));
        }
        sprrdd sprrdd3 = sprrdd2 = (sprrdd)arg0;
        this.cfr_renamed_0.cfr_renamed_1524(new sprnld(sprrdd2.cfr_renamed_3356()));
        this.cfr_renamed_4 = sprrdd2.cfr_renamed_3357();
        int n = sprrdd3.cfr_renamed_3353();
        this.cfr_renamed_119 = new byte[n / 8];
        if (sprrdd3.cfr_renamed_3355()) {
            BigInteger bigInteger = cfr_renamed_2.pow(n).multiply(BigInteger.valueOf(this.cfr_renamed_91));
            this.cfr_renamed_3 = bigInteger.compareTo(cfr_renamed_86) == 1 ? Integer.MAX_VALUE : bigInteger.intValue();
            sprscd2 = this;
        } else {
            sprscd2 = this;
            this.cfr_renamed_3 = Integer.MAX_VALUE;
        }
        sprscd2.cfr_renamed_152 = sprrdd2.cfr_renamed_1205();
        sprscd sprscd3 = this;
        sprscd3.cfr_renamed_1 = sprrdd2.cfr_renamed_3355();
        sprscd3.cfr_renamed_93 = 0;
    }

    public sprscd(spruc arg0) {
        sprscd sprscd2 = this;
        this.cfr_renamed_0 = arg0;
        sprscd2.cfr_renamed_91 = arg0.cfr_renamed_2404();
        sprscd2.cfr_renamed_112 = new byte[this.cfr_renamed_91];
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        int n = this.cfr_renamed_93 + arg2;
        if (n < 0 || n >= this.cfr_renamed_3) {
            throw new sprjkd(new StringBuilder().insert(0, spreds.cfr_renamed_9("3_\u0002X\u0015D\u0004\n;n6i$xPG\u0011SPE\u001eF\t\n\u0012OP_\u0003O\u0014\n\u0016E\u0002\n")).append(this.cfr_renamed_3).append(sprjgba.cfr_renamed_9("=qdgx`")).toString());
        }
        sprscd sprscd2 = this;
        if (sprscd2.cfr_renamed_93 % sprscd2.cfr_renamed_91 == 0) {
            this.cfr_renamed_3511();
        }
        int n2 = arg2;
        sprscd sprscd3 = this;
        sprscd sprscd4 = this;
        int n3 = sprscd3.cfr_renamed_93 % sprscd4.cfr_renamed_91;
        sprscd sprscd5 = this;
        int n4 = Math.min(sprscd3.cfr_renamed_91 - sprscd5.cfr_renamed_93 % sprscd5.cfr_renamed_91, n2);
        System.arraycopy(sprscd4.cfr_renamed_112, n3, arg0, arg1, n4);
        sprscd3.cfr_renamed_93 += n4;
        arg1 += n4;
        int n5 = n2 -= n4;
        while (n5 > 0) {
            sprscd sprscd6 = this;
            sprscd6.cfr_renamed_3511();
            n4 = Math.min(sprscd6.cfr_renamed_91, n2);
            System.arraycopy(sprscd6.cfr_renamed_112, 0, arg0, arg1, n4);
            sprscd6.cfr_renamed_93 += n4;
            arg1 += n4;
            n5 = n2 -= n4;
        }
        return arg2;
    }

    @Override
    public spruc cfr_renamed_1472() {
        return this.cfr_renamed_0;
    }
}

