/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprduo;
import com.spire.presentation.packages.sprjjea;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprybh;
import java.math.BigInteger;

public class sprobh
extends sprybh {
    private static final BigInteger cfr_renamed_3 = new BigInteger("18446744073709551615");

    public sprobh(long arg0) {
        super(arg0);
    }

    public sprobh(sprktm arg0) {
        super(arg0);
    }

    public sprobh(BigInteger arg0) {
        super(arg0);
    }

    public sprobh(int arg0) {
        super(arg0);
    }

    public static sprobh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprobh) {
            return (sprobh)arg0;
        }
        if (arg0 != null) {
            return new sprobh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public void cfr_renamed_8334() {
        if (this.cfr_renamed_4.signum() < 0) {
            throw new IllegalArgumentException(sprjjea.cfr_renamed_9("'/=;4n<;\":q >:q,4n?+6/%''+"));
        }
        if (this.cfr_renamed_4.compareTo(cfr_renamed_3) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprduo.cfr_renamed_9(" V:B3\u0017;B%CvY9CvR.T3R2\u0017")).append(cfr_renamed_3.toString(16)).toString());
        }
    }
}

