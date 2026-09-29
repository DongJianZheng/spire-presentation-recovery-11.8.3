/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprlbe
extends sprkra {
    private BigInteger cfr_renamed_86;
    private BigInteger cfr_renamed_152;
    private BigInteger cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private sprbne cfr_renamed_4;

    public BigInteger cfr_renamed_2304() {
        return this.cfr_renamed_0;
    }

    public BigInteger cfr_renamed_2303() {
        return this.cfr_renamed_119;
    }

    public static sprlbe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprlbe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public BigInteger cfr_renamed_2302() {
        return this.cfr_renamed_91;
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprlbe(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprlbe sprlbe2 = this;
        sprlbe sprlbe3 = this;
        sprlbe sprlbe4 = this;
        sprlbe sprlbe5 = this;
        sprlbe sprlbe6 = this;
        sprlbe6.cfr_renamed_4 = null;
        sprlbe6.cfr_renamed_86 = BigInteger.valueOf(0L);
        sprlbe5.cfr_renamed_2 = arg0;
        sprlbe5.cfr_renamed_1 = arg1;
        sprlbe4.cfr_renamed_112 = arg2;
        sprlbe4.cfr_renamed_152 = arg3;
        sprlbe3.cfr_renamed_3 = arg4;
        sprlbe3.cfr_renamed_91 = arg5;
        sprlbe2.cfr_renamed_119 = arg6;
        sprlbe2.cfr_renamed_0 = bigInteger8;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_86));
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_2295()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2296()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2299()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2300()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2301()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2302()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2303()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2304()));
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public BigInteger cfr_renamed_2301() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_2299() {
        return this.cfr_renamed_112;
    }

    public BigInteger cfr_renamed_2300() {
        return this.cfr_renamed_152;
    }

    public static sprlbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlbe) {
            return (sprlbe)arg0;
        }
        if (arg0 != null) {
            return new sprlbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_3() {
        return this.cfr_renamed_86;
    }

    private /* synthetic */ sprlbe(sprbne sprbne2) {
        this.cfr_renamed_4 = null;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        BigInteger bigInteger = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        if (bigInteger.intValue() != 0 && bigInteger.intValue() != 1) {
            throw new IllegalArgumentException(sprnez.cfr_renamed_9("\u00149\f%\u0004k\u0015.\u00118\n$\rk\u0005$\u0011k1\u0018\"k\u00139\n=\u0002?\u0006k\b.\u001a"));
        }
        this.cfr_renamed_86 = bigInteger;
        this.cfr_renamed_2 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_1 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_112 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_152 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_3 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_91 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_119 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_0 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_4 = (sprbne)enumeration.nextElement();
        }
    }
}

