/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprciaa;
import com.spire.presentation.packages.sprdnb;
import com.spire.presentation.packages.sprhsb;
import com.spire.presentation.packages.sprirb;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpeka;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprwtb;
import java.math.BigInteger;

public class sprmmb
extends sprhsb {
    public sprdnb cfr_renamed_91;
    public static final BigInteger cfr_renamed_0 = new BigInteger(1, sprmma.cfr_renamed_488(sprpeka.cfr_renamed_9("GkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGkGhGkGkGn3k")));
    private static final int cfr_renamed_3 = 2;

    @Override
    public sprwtb cfr_renamed_1652(BigInteger arg0) {
        return new sprirb(arg0);
    }

    @Override
    public sprpib cfr_renamed_2001() {
        return new sprmmb();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 2: {
                return true;
            }
        }
        return false;
    }

    @Override
    public sprrlb cfr_renamed_1770() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprrlb cfr_renamed_1965(sprwtb arg0, sprwtb arg1, sprwtb[] arg2, boolean arg3) {
        return new sprdnb(this, arg0, arg1, arg2, arg3);
    }

    @Override
    public sprrlb cfr_renamed_1960(sprwtb arg0, sprwtb arg1, boolean arg2) {
        return new sprdnb((sprpib)this, arg0, arg1, arg2);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_0;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_0.bitLength();
    }

    public sprmmb() {
        sprmmb sprmmb2 = this;
        sprmmb sprmmb3 = this;
        super(cfr_renamed_0);
        this.cfr_renamed_91 = new sprdnb(this, null, null);
        this.cfr_renamed_112 = this.cfr_renamed_1652(sprpb.cfr_renamed_1);
        sprmmb3.cfr_renamed_0 = this.cfr_renamed_1652(BigInteger.valueOf(7L));
        sprmmb3.cfr_renamed_1 = new BigInteger(1, sprmma.cfr_renamed_488(sprciaa.cfr_renamed_9("&g&g&g&g&g&g&g&g&g&g&g&g&g&g&g&d\"`!d$b%\u0017!gT\u0019!\u0011Sc\"g$\u0013UdXb$\u0011S\u0017T\u0010T\u0010")));
        sprmmb2.cfr_renamed_2 = BigInteger.valueOf(1L);
        sprmmb2.cfr_renamed_137 = 2;
    }
}

