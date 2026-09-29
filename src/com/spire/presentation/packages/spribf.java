/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprvmg;
import com.spire.presentation.packages.sprxub;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class spribf
implements AlgorithmParameterSpec {
    private final String cfr_renamed_112;
    public static final spribf cfr_renamed_119;
    public static final spribf cfr_renamed_91;
    public static final spribf cfr_renamed_0;
    public static final spribf cfr_renamed_1;
    private static Map cfr_renamed_2;
    public static final spribf cfr_renamed_3;
    public static final spribf cfr_renamed_4;

    private /* synthetic */ spribf(sprvmg sprvmg2) {
        this.cfr_renamed_112 = sprkoe.cfr_renamed_116(sprvmg2.cfr_renamed_313());
    }

    static {
        cfr_renamed_4 = new spribf(sprvmg.cfr_renamed_119);
        cfr_renamed_1 = new spribf(sprvmg.cfr_renamed_91);
        cfr_renamed_91 = new spribf(sprvmg.cfr_renamed_4);
        cfr_renamed_119 = new spribf(sprvmg.cfr_renamed_0);
        cfr_renamed_0 = new spribf(sprvmg.cfr_renamed_2);
        cfr_renamed_3 = new spribf(sprvmg.cfr_renamed_3);
        cfr_renamed_2 = new HashMap();
        cfr_renamed_2.put(sprdkg.cfr_renamed_9(";\u00073\u0007+\u00066\u001b2\\"), cfr_renamed_4);
        cfr_renamed_2.put(sprxub.cfr_renamed_9("wH\u007fHgIzT~\u0012"), cfr_renamed_1);
        cfr_renamed_2.put(sprdkg.cfr_renamed_9(";\u00073\u0007+\u00066\u001b2["), cfr_renamed_91);
        cfr_renamed_2.put(sprxub.cfr_renamed_9("wH\u007fHgIzT~\u0013>@vR"), cfr_renamed_119);
        cfr_renamed_2.put(sprdkg.cfr_renamed_9(";\u00073\u0007+\u00066\u001b2]r\u000f:\u001d"), cfr_renamed_0);
        cfr_renamed_2.put(sprxub.cfr_renamed_9("wH\u007fHgIzT~\u0014>@vR"), cfr_renamed_3);
    }

    public static spribf cfr_renamed_5644(String arg0) {
        return (spribf)cfr_renamed_2.get(sprkoe.cfr_renamed_425(arg0));
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_112;
    }
}

