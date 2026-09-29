/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhsb;
import com.spire.presentation.packages.sprluda;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprnsb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryjb;
import java.math.BigInteger;

public class sprvjb
extends sprhsb {
    private static final int cfr_renamed_2 = 2;
    public sprnsb cfr_renamed_3;
    public static final BigInteger cfr_renamed_4 = new BigInteger(1, sprmma.cfr_renamed_488(sprmah.cfr_renamed_9("\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017uauauau`uauauauauauauauauauauaua\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017")));

    @Override
    public sprwtb cfr_renamed_1652(BigInteger arg0) {
        return new spryjb(arg0);
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
    public int cfr_renamed_1938() {
        return cfr_renamed_4.bitLength();
    }

    @Override
    public sprrlb cfr_renamed_1960(sprwtb arg0, sprwtb arg1, boolean arg2) {
        return new sprnsb((sprpib)this, arg0, arg1, arg2);
    }

    public sprvjb() {
        sprvjb sprvjb2 = this;
        sprvjb sprvjb3 = this;
        super(cfr_renamed_4);
        sprvjb3.cfr_renamed_3 = new sprnsb(this, null, null);
        sprvjb3.cfr_renamed_112 = this.cfr_renamed_1652(new BigInteger(1, sprmma.cfr_renamed_488(sprluda.cfr_renamed_9("M\u0017M\u0017M\u0017M\u0017;a;a;a;`;a;a;a;a;a;a;a;a;a;a;a;aM\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0012"))));
        sprvjb3.cfr_renamed_0 = sprvjb3.cfr_renamed_1652(new BigInteger(1, sprmma.cfr_renamed_488(sprmah.cfr_renamed_9("p\u0010\u0006gvd\u0001i\u0004\u0010v\u0010|b\u0000f\u0007b\u0000\u0013\u0007\u0015pdrg|i}g\u0007\u0012sdt\u0015ug\u0007a\u0006\u0012pb\u0007a\u0003gv\u0013\u0006\u0014v\u0012v\u0014wf\u0001csaq\u0013"))));
        sprvjb3.cfr_renamed_1 = new BigInteger(1, sprmma.cfr_renamed_488(sprluda.cfr_renamed_9("M\u0017M\u0017M\u0017M\u0017;a;a;a;aM\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0017M\u0017I\u0012NgM\u0010J\u0015Jf:f2\u00143eMbIhH\u0010HcM\u0012=b9d>`")));
        sprvjb2.cfr_renamed_2 = (int)BigInteger.valueOf(1L);
        sprvjb2.cfr_renamed_137 = 2;
    }

    @Override
    public sprpib cfr_renamed_2001() {
        return new sprvjb();
    }

    @Override
    public sprrlb cfr_renamed_1965(sprwtb arg0, sprwtb arg1, sprwtb[] arg2, boolean arg3) {
        return new sprnsb(this, arg0, arg1, arg2, arg3);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_4;
    }

    @Override
    public sprrlb cfr_renamed_1770() {
        return this.cfr_renamed_3;
    }
}

