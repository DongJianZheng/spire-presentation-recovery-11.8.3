/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtip;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxgi;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprjfe
extends sprkra {
    private BigInteger cfr_renamed_86;
    private BigInteger cfr_renamed_152;
    private BigInteger cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    private int cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private sprbne cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_2301() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_91));
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_2295()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2296()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2299()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2300()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2301()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2302()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2303()));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_2304()));
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        return new sprpse(sprlre2);
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_119;
    }

    public BigInteger cfr_renamed_2299() {
        return this.cfr_renamed_152;
    }

    public sprjfe(sprbne sprbne2) {
        this.cfr_renamed_2 = null;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        BigInteger bigInteger = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        if (bigInteger.intValue() != 0 && bigInteger.intValue() != 1) {
            throw new IllegalArgumentException(sprxgi.cfr_renamed_9("^JFVN\u0018_][K@WG\u0018OW[\u0018{kh\u0018YJ@NHLL\u0018B]P"));
        }
        this.cfr_renamed_91 = bigInteger.intValue();
        this.cfr_renamed_119 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_4 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_152 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_112 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_1 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_86 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_0 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        this.cfr_renamed_3 = ((sprooe)enumeration.nextElement()).cfr_renamed_97();
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_2 = (sprbne)enumeration.nextElement();
        }
    }

    public static sprjfe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjfe) {
            return (sprjfe)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprjfe((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtip.cfr_renamed_9("fwxw|n}9|{y|pm3p}9uxpm|kj#3")).append(arg0.getClass().getName()).toString());
    }

    public BigInteger cfr_renamed_2304() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_2300() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprjfe(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjfe sprjfe2 = this;
        sprjfe sprjfe3 = this;
        sprjfe sprjfe4 = this;
        sprjfe sprjfe5 = this;
        sprjfe sprjfe6 = this;
        sprjfe6.cfr_renamed_2 = null;
        sprjfe6.cfr_renamed_91 = 0;
        sprjfe5.cfr_renamed_119 = arg0;
        sprjfe5.cfr_renamed_4 = arg1;
        sprjfe4.cfr_renamed_152 = arg2;
        sprjfe4.cfr_renamed_112 = arg3;
        sprjfe3.cfr_renamed_1 = arg4;
        sprjfe3.cfr_renamed_86 = arg5;
        sprjfe2.cfr_renamed_0 = arg6;
        sprjfe2.cfr_renamed_3 = bigInteger8;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    public BigInteger cfr_renamed_2302() {
        return this.cfr_renamed_86;
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_4;
    }

    public static sprjfe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprjfe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public BigInteger cfr_renamed_2303() {
        return this.cfr_renamed_0;
    }
}

