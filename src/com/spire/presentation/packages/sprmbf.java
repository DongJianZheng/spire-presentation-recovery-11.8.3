/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjmo;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprtyba;
import com.spire.presentation.packages.spryeg;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprmbf
implements AlgorithmParameterSpec {
    public static final sprmbf cfr_renamed_112;
    private final String cfr_renamed_119;
    public static final sprmbf cfr_renamed_91;
    public static final sprmbf cfr_renamed_0;
    public static final sprmbf cfr_renamed_1;
    public static final sprmbf cfr_renamed_2;
    private static Map cfr_renamed_3;
    public static final sprmbf cfr_renamed_4;

    static {
        cfr_renamed_2 = new sprmbf(spryeg.cfr_renamed_86);
        cfr_renamed_1 = new sprmbf(spryeg.cfr_renamed_152);
        cfr_renamed_4 = new sprmbf(spryeg.cfr_renamed_4);
        cfr_renamed_0 = new sprmbf(spryeg.cfr_renamed_107);
        cfr_renamed_112 = new sprmbf(spryeg.cfr_renamed_0);
        cfr_renamed_91 = new sprmbf(spryeg.cfr_renamed_1);
        cfr_renamed_3 = new HashMap();
        cfr_renamed_3.put(sprtyba.cfr_renamed_9("6\u00071\u001b0\u0019s\\v"), cfr_renamed_2);
        cfr_renamed_3.put(sprjmo.cfr_renamed_9("]dZx[z\u0019<\u001f"), cfr_renamed_1);
        cfr_renamed_3.put(sprtyba.cfr_renamed_9("6\u00071\u001b0\u0019}\\r"), cfr_renamed_4);
        cfr_renamed_3.put(sprjmo.cfr_renamed_9("]dZx[z\u0017?\u001d"), cfr_renamed_0);
        cfr_renamed_3.put(sprtyba.cfr_renamed_9("\u001a+\u001d7\u001c5XuXv"), cfr_renamed_112);
        cfr_renamed_3.put(sprjmo.cfr_renamed_9("y@~\\\u007f^;\u001c=\u0019"), cfr_renamed_91);
    }

    public static sprmbf cfr_renamed_5644(String arg0) {
        return (sprmbf)cfr_renamed_3.get(sprkoe.cfr_renamed_425(arg0));
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ sprmbf(spryeg spryeg2) {
        this.cfr_renamed_119 = spryeg2.cfr_renamed_313();
    }
}

