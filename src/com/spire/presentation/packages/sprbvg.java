/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.sprhdca;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprybh;
import java.math.BigInteger;

public class sprbvg
extends sprybh {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(255L);

    public sprbvg(int arg0) {
        super(arg0);
    }

    @Override
    public void cfr_renamed_8334() {
        if (this.cfr_renamed_4.signum() < 0) {
            throw new IllegalArgumentException(sprebda.cfr_renamed_9("l\u0011v\u0005\u007fPw\u0005i\u0004:\u001eu\u0004:\u0012\u007fPt\u0015}\u0011n\u0019l\u0015"));
        }
        if (this.cfr_renamed_4.compareTo(cfr_renamed_3) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhdca.cfr_renamed_9("\u0002]\u0018I\u0011\u001cDD")).append(this.cfr_renamed_4.toString(16)).append(sprebda.cfr_renamed_9(":Pw\u0005i\u0004:\u001eu\u0004:\u0015b\u0013\u007f\u0015~P*\b")).append(cfr_renamed_3.toString(16)).toString());
        }
    }

    public sprbvg(BigInteger arg0) {
        super(arg0);
    }

    public sprbvg(long arg0) {
        super(arg0);
    }

    public sprbvg(sprktm arg0) {
        super(arg0);
    }

    public static sprbvg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbvg) {
            return (sprbvg)arg0;
        }
        if (arg0 != null) {
            return new sprbvg(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

