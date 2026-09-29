/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprolo;
import com.spire.presentation.packages.sprrfz;
import com.spire.presentation.packages.sprybh;
import java.math.BigInteger;

public class sprrfh
extends sprybh {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(65535L);

    @Override
    public void cfr_renamed_8334() {
        if (this.cfr_renamed_4.signum() < 0) {
            throw new IllegalArgumentException(sprolo.cfr_renamed_9("O\u0007U\u0013\\FT\u0013J\u0012\u0019\bV\u0012\u0019\u0004\\FW\u0003^\u0007M\u000fO\u0003"));
        }
        if (this.cfr_renamed_4.compareTo(cfr_renamed_3) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrfz.cfr_renamed_9("N\u0003T\u0017]BU\u0017K\u0016\u0018\fW\u0016\u0018\u0007@\u0001]\u0007\\B")).append(cfr_renamed_3.toString(16)).toString());
        }
    }

    public sprrfh(BigInteger arg0) {
        super(arg0);
    }

    public static sprrfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrfh) {
            return (sprrfh)arg0;
        }
        if (arg0 != null) {
            return new sprrfh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrfh(long arg0) {
        super(arg0);
    }

    public sprrfh(int arg0) {
        super(arg0);
    }

    public static sprrfh cfr_renamed_279(int arg0) {
        return new sprrfh(arg0);
    }

    public sprrfh(sprktm arg0) {
        super(arg0);
    }
}

