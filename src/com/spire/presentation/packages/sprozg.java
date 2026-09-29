/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprjnn;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprybh;
import java.math.BigInteger;

public class sprozg
extends sprybh {
    private static final BigInteger cfr_renamed_3 = new BigInteger(sprklg.cfr_renamed_9("zTzTzTzT"), 16);

    public sprozg(int arg0) {
        super(arg0);
    }

    public sprozg(sprktm arg0) {
        super(arg0);
    }

    public sprozg(BigInteger arg0) {
        super(arg0);
    }

    @Override
    public void cfr_renamed_8334() {
        if (this.cfr_renamed_4.signum() < 0) {
            throw new IllegalArgumentException(sprklg.cfr_renamed_9("JsPgY2QgOf\u001c|Sf\u001cpY2Rw[sH{Jw"));
        }
        if (this.cfr_renamed_4.compareTo(cfr_renamed_3) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjnn.cfr_renamed_9(")\u001b3\u000f:Z2\u000f,\u000e\u007f\u00140\u000e\u007f\u001f'\u0019:\u001f;Z")).append(cfr_renamed_3.toString(16)).toString());
        }
    }

    public sprozg(long arg0) {
        super(arg0);
    }

    public static sprozg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbvg) {
            return (sprozg)arg0;
        }
        if (arg0 != null) {
            return new sprozg(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

