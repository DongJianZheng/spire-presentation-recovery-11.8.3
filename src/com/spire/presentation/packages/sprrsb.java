/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclb;
import com.spire.presentation.packages.sprhsb;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprpjz;
import com.spire.presentation.packages.sprptb;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprupn;
import com.spire.presentation.packages.sprwtb;
import java.math.BigInteger;

public class sprrsb
extends sprhsb {
    private static final int cfr_renamed_2 = 2;
    public static final BigInteger cfr_renamed_3 = new BigInteger(1, sprmma.cfr_renamed_488(sprupn.cfr_renamed_9("2o2o2o2o2o2o2o2o2o2o2o2o2o2o2o2oD\u0019D\u0019D\u0019D\u0019D\u0019D\u0019D\u0019D\u0019D\u0019D\u0019D\u0019D\u0018")));
    public sprptb cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_3.bitLength();
    }

    @Override
    public sprpib cfr_renamed_2001() {
        return new sprrsb();
    }

    public sprrsb() {
        sprrsb sprrsb2 = this;
        sprrsb sprrsb3 = this;
        super(cfr_renamed_3);
        sprrsb3.cfr_renamed_4 = new sprptb(this, null, null);
        sprrsb3.cfr_renamed_112 = this.cfr_renamed_1652(new BigInteger(1, sprmma.cfr_renamed_488(sprpjz.cfr_renamed_9(">p>p>p>p>p>p>p>p>p>p>p>p>p>p>p>s>p>p>p>p>p>p>p>p>p>p>p>s"))));
        sprrsb3.cfr_renamed_0 = sprrsb3.cfr_renamed_1652(new BigInteger(1, sprmma.cfr_renamed_488(sprupn.cfr_renamed_9("6\u001dD\u001cDhL\u001cDjD\u001d6\u001a5k2\u001c@\u0018G\u001bA\u001fA\u0019@\u001d6\u00196\u001e0\u001e6o0\u00116hF\u001eDkG\u0010@\u001aF\u001aA\u001c2o6\u001d"))));
        sprrsb3.cfr_renamed_1 = new BigInteger(1, sprmma.cfr_renamed_488(sprpjz.cfr_renamed_9(">p>p>p>p>p>p>p>p>p>p>p>p>p>pI\u00009\u0004=\u0006:\u000e>\u0006KsI\u0005<rJ\u000fL\u0003MuMuJwKr")));
        sprrsb2.cfr_renamed_2 = (int)BigInteger.valueOf(1L);
        sprrsb2.cfr_renamed_137 = 2;
    }

    @Override
    public sprwtb cfr_renamed_1652(BigInteger arg0) {
        return new sprclb(arg0);
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
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_1604() {
        return cfr_renamed_3;
    }

    @Override
    public sprrlb cfr_renamed_1965(sprwtb arg0, sprwtb arg1, sprwtb[] arg2, boolean arg3) {
        return new sprptb(this, arg0, arg1, arg2, arg3);
    }

    @Override
    public sprrlb cfr_renamed_1960(sprwtb arg0, sprwtb arg1, boolean arg2) {
        return new sprptb((sprpib)this, arg0, arg1, arg2);
    }
}

