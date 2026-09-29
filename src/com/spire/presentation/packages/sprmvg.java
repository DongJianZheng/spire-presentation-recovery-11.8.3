/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.drawing.GradientStop;
import com.spire.presentation.packages.sprjbh;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprwfp;

public class sprmvg
extends sprjbh {
    public static sprmvg cfr_renamed_4 = new sprmvg();

    private /* synthetic */ sprmvg() {
        super(900000001L);
    }

    public static sprmvg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmvg) {
            return (sprmvg)arg0;
        }
        if (arg0 != null) {
            sprktm sprktm2 = sprktm.cfr_renamed_23(arg0);
            if (sprktm2.cfr_renamed_97().intValue() != 900000001) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, GradientStop.cfr_renamed_9("K6Q\"Xw")).append(sprktm2.cfr_renamed_97()).append(sprwfp.cfr_renamed_9("\t\tZ@G\u000f]@\\\u000eB\u000eF\u0017G@_\u0001E\u0015L@F\u0006\tY\u0019P\u0019P\u0019P\u0019Q")).toString());
            }
            return cfr_renamed_4;
        }
        return null;
    }
}

