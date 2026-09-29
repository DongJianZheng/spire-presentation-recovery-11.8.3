/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvmaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxxda;
import java.math.BigInteger;
import java.util.Enumeration;

public class sproem
extends sprqqe {
    private BigInteger cfr_renamed_86;
    private BigInteger cfr_renamed_152;
    private BigInteger cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private int cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_112;
    }

    public BigInteger cfr_renamed_2301() {
        return this.cfr_renamed_119;
    }

    public static sproem cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sproem.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public static sproem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproem) {
            return (sproem)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sproem((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprvmaa.cfr_renamed_9("T:J:N#OtN6K1B \u0001=OtG5B N&Xn\u0001")).append(arg0.getClass().getName()).toString());
    }

    public BigInteger cfr_renamed_2300() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sproem(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sproem sproem2 = this;
        sproem sproem3 = this;
        sproem sproem4 = this;
        sproem sproem5 = this;
        sproem sproem6 = this;
        sproem6.cfr_renamed_4 = null;
        sproem6.cfr_renamed_3 = 0;
        sproem5.cfr_renamed_112 = arg0;
        sproem5.cfr_renamed_91 = arg1;
        sproem4.cfr_renamed_0 = arg2;
        sproem4.cfr_renamed_1 = arg3;
        sproem3.cfr_renamed_119 = arg4;
        sproem3.cfr_renamed_2 = arg5;
        sproem2.cfr_renamed_86 = arg6;
        sproem2.cfr_renamed_152 = bigInteger8;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(10);
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_2295()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2296()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2299()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2300()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2301()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2302()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2303()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2304()));
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sproem(sprszm sprszm2) {
        this.cfr_renamed_4 = null;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        int n = ((sprktm)enumeration.nextElement()).cfr_renamed_5023();
        if (n < 0 || n > 1) {
            throw new IllegalArgumentException(sprxxda.cfr_renamed_9("#\u0013;\u000f3A\"\u0004&\u0012=\u000e:A2\u000e&A\u00062\u0015A$\u0013=\u00175\u00151A?\u0004-"));
        }
        this.cfr_renamed_3 = n;
        this.cfr_renamed_112 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_91 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_0 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_1 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_119 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_2 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_86 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_152 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_4 = (sprszm)enumeration.nextElement();
        }
    }

    public BigInteger cfr_renamed_2304() {
        return this.cfr_renamed_152;
    }

    public BigInteger cfr_renamed_2302() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_2303() {
        return this.cfr_renamed_86;
    }

    public BigInteger cfr_renamed_2299() {
        return this.cfr_renamed_0;
    }
}

