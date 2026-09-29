/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spripb;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwkb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;

public class sprfqd
extends sprkra {
    private static sprizd cfr_renamed_3 = new sprizd();
    public sprwtb cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        int n = cfr_renamed_3.cfr_renamed_4435(this.cfr_renamed_4);
        byte[] byArray = cfr_renamed_3.cfr_renamed_2500(this.cfr_renamed_4.cfr_renamed_1779(), n);
        return new sprlqe(byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprfqd(int n, int n2, int n3, int n4, sprxue sprxue2) {
        this(new spripb((int)arg0, (int)arg1, (int)arg2, (int)arg3, new BigInteger(1, arg4.cfr_renamed_186())));
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
    }

    public sprfqd(sprwtb sprwtb2) {
        this.cfr_renamed_4 = sprwtb2;
    }

    /*
     * WARNING - void declaration
     */
    public sprfqd(BigInteger bigInteger, sprxue sprxue2) {
        this(new sprwkb((BigInteger)arg0, new BigInteger(1, arg1.cfr_renamed_186())));
        void arg1;
        void arg0;
    }

    public sprwtb cfr_renamed_97() {
        return this.cfr_renamed_4;
    }
}

