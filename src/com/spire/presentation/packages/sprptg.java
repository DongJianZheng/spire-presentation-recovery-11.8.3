/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchm;
import com.spire.presentation.packages.sprhmaa;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprybh;
import java.math.BigInteger;

public class sprptg
extends sprybh {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(7L);

    @Override
    public void cfr_renamed_8334() {
        if (this.cfr_renamed_4.signum() < 0) {
            throw new IllegalArgumentException(sprhmaa.cfr_renamed_9("iYsMz\u0018rMlL?VpL?Zz\u0018q]xYkQi]"));
        }
        if (this.cfr_renamed_4.compareTo(cfr_renamed_3) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprchm.cfr_renamed_9("b\u0010x\u0004qQy\u0004g\u00054\u001f{\u00054\u0014l\u0012q\u0014pQ")).append(cfr_renamed_3.toString(16)).toString());
        }
    }

    public sprptg(int arg0) {
        super(arg0);
    }

    public sprptg(sprktm arg0) {
        super(arg0);
    }

    public static sprptg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprptg) {
            return (sprptg)arg0;
        }
        if (arg0 != null) {
            return new sprptg(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprptg(BigInteger arg0) {
        super(arg0);
    }

    public sprptg(long arg0) {
        super(arg0);
    }
}

