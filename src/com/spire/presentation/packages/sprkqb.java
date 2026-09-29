/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmn;
import com.spire.presentation.packages.sprhsb;
import com.spire.presentation.packages.sprimb;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprssy;
import com.spire.presentation.packages.sprtlb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryrb;
import com.spire.presentation.packages.sprztb;
import java.math.BigInteger;

public class sprkqb
extends sprhsb {
    public static final BigInteger cfr_renamed_0 = spryrb.cfr_renamed_1651(sprztb.cfr_renamed_4);
    public sprtlb cfr_renamed_2;
    private static final int cfr_renamed_3 = 4;

    @Override
    public sprrlb cfr_renamed_1960(sprwtb arg0, sprwtb arg1, boolean arg2) {
        return new sprtlb((sprpib)this, arg0, arg1, arg2);
    }

    @Override
    public sprpib cfr_renamed_2001() {
        return new sprkqb();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 4: {
                return true;
            }
        }
        return false;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_0.bitLength();
    }

    public sprkqb() {
        sprkqb sprkqb2 = this;
        sprkqb sprkqb3 = this;
        super(cfr_renamed_0);
        sprkqb3.cfr_renamed_2 = new sprtlb(this, null, null);
        sprkqb3.cfr_renamed_112 = this.cfr_renamed_1652(new BigInteger(1, sprmma.cfr_renamed_488(sprssy.cfr_renamed_9("\u0004\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"w\"\u000f[\u0002Z\u0007WwR\u0002W"))));
        sprkqb3.cfr_renamed_0 = sprkqb3.cfr_renamed_1652(new BigInteger(1, sprmma.cfr_renamed_488(sprcmn.cfr_renamed_9("mQn!oV\u001e#c$\u0018'h&\u001fWj*mQn!oV\u001e#c$\u0018'h&\u001fWj*mQn!oV\u001e#c$\u0018'h%jQoVcPm$k#\u0019+l'"))));
        sprkqb3.cfr_renamed_1 = new BigInteger(1, sprmma.cfr_renamed_488(sprssy.cfr_renamed_9("\u0007S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0006S\u0007Wr&pZr&wQpT\u000f rU\u0003[\u0007Q\u0000P\u0007\"\u0003 pVrPs'")));
        sprkqb2.cfr_renamed_2 = BigInteger.valueOf(8L);
        sprkqb2.cfr_renamed_137 = 4;
    }

    @Override
    public sprrlb cfr_renamed_1770() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprrlb cfr_renamed_1965(sprwtb arg0, sprwtb arg1, sprwtb[] arg2, boolean arg3) {
        return new sprtlb(this, arg0, arg1, arg2, arg3);
    }

    @Override
    public sprwtb cfr_renamed_1652(BigInteger arg0) {
        return new sprimb(arg0);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_0;
    }
}

