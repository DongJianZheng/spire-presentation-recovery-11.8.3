/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spriye;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprctm
extends sprqqe {
    private BigInteger cfr_renamed_86;
    private BigInteger cfr_renamed_152;
    private sprszm cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_2304() {
        return this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public sprctm(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprctm sprctm2 = this;
        sprctm sprctm3 = this;
        sprctm sprctm4 = this;
        sprctm sprctm5 = this;
        sprctm sprctm6 = this;
        sprctm6.cfr_renamed_112 = null;
        sprctm6.cfr_renamed_119 = BigInteger.valueOf(0L);
        sprctm5.cfr_renamed_3 = arg0;
        sprctm5.cfr_renamed_0 = arg1;
        sprctm4.cfr_renamed_91 = arg2;
        sprctm4.cfr_renamed_4 = arg3;
        sprctm3.cfr_renamed_2 = arg4;
        sprctm3.cfr_renamed_1 = arg5;
        sprctm2.cfr_renamed_152 = arg6;
        sprctm2.cfr_renamed_86 = bigInteger8;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(10);
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_119));
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_2295()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2296()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2299()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2300()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2301()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2302()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2303()));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2304()));
        if (this.cfr_renamed_112 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_112);
        }
        return new sprcen(sprrvm2);
    }

    public BigInteger cfr_renamed_3() {
        return this.cfr_renamed_119;
    }

    public BigInteger cfr_renamed_2299() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ sprctm(sprszm sprszm2) {
        this.cfr_renamed_112 = null;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        sprktm sprktm2 = (sprktm)enumeration.nextElement();
        int n = sprktm2.cfr_renamed_5023();
        if (n < 0 || n > 1) {
            throw new IllegalArgumentException(spriye.cfr_renamed_9("]~EbM,\\iX\u007fCcD,LcX,x_k,Z~CzKxO,AiS"));
        }
        this.cfr_renamed_119 = sprktm2.cfr_renamed_97();
        this.cfr_renamed_3 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_0 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_91 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_4 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_2 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_1 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_152 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_86 = ((sprktm)enumeration.nextElement()).cfr_renamed_97();
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_112 = (sprszm)enumeration.nextElement();
        }
    }

    public BigInteger cfr_renamed_2300() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_0;
    }

    public static sprctm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprctm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_2302() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_2303() {
        return this.cfr_renamed_152;
    }

    public BigInteger cfr_renamed_2301() {
        return this.cfr_renamed_2;
    }

    public static sprctm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprctm) {
            return (sprctm)arg0;
        }
        if (arg0 != null) {
            return new sprctm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_3;
    }
}

