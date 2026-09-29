/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralo;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprugb;
import com.spire.presentation.packages.sprvuf;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprccf
implements AlgorithmParameterSpec {
    private final String cfr_renamed_91;
    public static final sprccf cfr_renamed_0;
    public static final sprccf cfr_renamed_1;
    public static final sprccf cfr_renamed_2;
    private static Map cfr_renamed_3;
    public static final sprccf cfr_renamed_4;

    public static sprccf cfr_renamed_5644(String arg0) {
        return (sprccf)cfr_renamed_3.get(sprkoe.cfr_renamed_425(arg0));
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ sprccf(sprvuf sprvuf2) {
        this.cfr_renamed_91 = sprvuf2.cfr_renamed_313();
    }

    static {
        cfr_renamed_2 = new sprccf(sprvuf.cfr_renamed_1);
        cfr_renamed_4 = new sprccf(sprvuf.cfr_renamed_0);
        cfr_renamed_0 = new sprccf(sprvuf.cfr_renamed_91);
        cfr_renamed_1 = new sprccf(sprvuf.cfr_renamed_4);
        cfr_renamed_3 = new HashMap();
        cfr_renamed_3.put(sprugb.cfr_renamed_9(">z\"{8~#<`:h;`7"), cfr_renamed_2);
        cfr_renamed_3.put(spralo.cfr_renamed_9("]\u001dA\u001c[\u0019@[\u0003]\u000b_\u0004^"), cfr_renamed_4);
        cfr_renamed_3.put(sprugb.cfr_renamed_9(">z\"{8~#:`7f6b?"), cfr_renamed_0);
        cfr_renamed_3.put(spralo.cfr_renamed_9("\u0007G\u001bF\u0001A\u001a@^\u0003X"), cfr_renamed_1);
    }
}

