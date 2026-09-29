/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spretb;
import com.spire.presentation.packages.sprhsb;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sproho;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprprb;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprxjaa;
import java.math.BigInteger;

public class sprdjb
extends sprhsb {
    private static final int cfr_renamed_2 = 2;
    public static final BigInteger cfr_renamed_3 = new BigInteger(1, sprmma.cfr_renamed_488(sprxjaa.cfr_renamed_9("-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-\n-\t-\t.z]\u000b")));
    public sprprb cfr_renamed_4;

    @Override
    public sprrlb cfr_renamed_1770() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprrlb cfr_renamed_1965(sprwtb arg0, sprwtb arg1, sprwtb[] arg2, boolean arg3) {
        return new sprprb(this, arg0, arg1, arg2, arg3);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_3.bitLength();
    }

    @Override
    public sprpib cfr_renamed_2001() {
        return new sprdjb();
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
    public sprrlb cfr_renamed_1960(sprwtb arg0, sprwtb arg1, boolean arg2) {
        return new sprprb((sprpib)this, arg0, arg1, arg2);
    }

    public sprdjb() {
        sprdjb sprdjb2 = this;
        sprdjb sprdjb3 = this;
        super(cfr_renamed_3);
        this.cfr_renamed_4 = new sprprb(this, null, null);
        this.cfr_renamed_112 = this.cfr_renamed_1652(sprpb.cfr_renamed_1);
        sprdjb3.cfr_renamed_0 = this.cfr_renamed_1652(BigInteger.valueOf(5L));
        sprdjb3.cfr_renamed_1 = new BigInteger(1, sprmma.cfr_renamed_488(sproho.cfr_renamed_9("WhWiWiWiWiWiWiWiWiWiWiWiWiWiWh#\u001a\"a#k\"\u001aQh_m$\u0018!i&`PhPo^\u001f%h!n")));
        sprdjb2.cfr_renamed_2 = (int)BigInteger.valueOf(1L);
        sprdjb2.cfr_renamed_137 = 2;
    }

    @Override
    public sprwtb cfr_renamed_1652(BigInteger arg0) {
        return new spretb(arg0);
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_3;
    }
}

