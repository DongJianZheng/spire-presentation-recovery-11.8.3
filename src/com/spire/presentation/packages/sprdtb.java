/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjb;
import com.spire.presentation.packages.sprhsb;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprskb;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprwvd;
import java.math.BigInteger;

public class sprdtb
extends sprhsb {
    public static final BigInteger cfr_renamed_0 = new BigInteger(1, sprmma.cfr_renamed_488(spruua.cfr_renamed_9("\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fU\u000fV\u000fU\u000fU\fVz$")));
    public sprcjb cfr_renamed_2;
    private static final int cfr_renamed_3 = 2;

    @Override
    public sprrlb cfr_renamed_1960(sprwtb arg0, sprwtb arg1, boolean arg2) {
        return new sprcjb((sprpib)this, arg0, arg1, arg2);
    }

    @Override
    public sprpib cfr_renamed_2001() {
        return new sprdtb();
    }

    @Override
    public sprrlb cfr_renamed_1965(sprwtb arg0, sprwtb arg1, sprwtb[] arg2, boolean arg3) {
        return new sprcjb(this, arg0, arg1, arg2, arg3);
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
    public sprwtb cfr_renamed_1652(BigInteger arg0) {
        return new sprskb(arg0);
    }

    public sprdtb() {
        sprdtb sprdtb2 = this;
        sprdtb sprdtb3 = this;
        super(cfr_renamed_0);
        this.cfr_renamed_2 = new sprcjb(this, null, null);
        this.cfr_renamed_112 = this.cfr_renamed_1652(sprpb.cfr_renamed_1);
        sprdtb3.cfr_renamed_0 = this.cfr_renamed_1652(BigInteger.valueOf(3L));
        sprdtb3.cfr_renamed_1 = new BigInteger(1, sprmma.cfr_renamed_488(sprwvd.cfr_renamed_9("h'h'h'h'h'h'h'h'h'h'h'h$\u001cWhSh\"\u001fV\u001e'\u0018X\u001aW\u0018 \u0019Uj$h%\u0016%")));
        sprdtb2.cfr_renamed_2 = BigInteger.valueOf(1L);
        sprdtb2.cfr_renamed_137 = 2;
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_0;
    }

    @Override
    public sprrlb cfr_renamed_1770() {
        return this.cfr_renamed_2;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_0.bitLength();
    }
}

