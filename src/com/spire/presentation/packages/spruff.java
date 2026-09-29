/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprhvf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprqyy;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class spruff
implements AlgorithmParameterSpec {
    private static Map cfr_renamed_112;
    public static final spruff cfr_renamed_119;
    public static final spruff cfr_renamed_91;
    public static final spruff cfr_renamed_0;
    public static final spruff cfr_renamed_1;
    private final String cfr_renamed_2;
    public static final spruff cfr_renamed_3;
    public static final spruff cfr_renamed_4;

    public String cfr_renamed_313() {
        return this.cfr_renamed_2;
    }

    static {
        cfr_renamed_0 = new spruff(sprhvf.cfr_renamed_114);
        cfr_renamed_4 = new spruff(sprhvf.cfr_renamed_2);
        cfr_renamed_119 = new spruff(sprhvf.cfr_renamed_112);
        cfr_renamed_3 = new spruff(sprhvf.cfr_renamed_152);
        cfr_renamed_91 = new spruff(sprhvf.cfr_renamed_86);
        cfr_renamed_1 = new spruff(sprhvf.cfr_renamed_96);
        cfr_renamed_112 = new HashMap();
        cfr_renamed_112.put(sprqyy.cfr_renamed_9("RqNpPuN3\t6"), cfr_renamed_0);
        cfr_renamed_112.put(sprajp.cfr_renamed_9("(v4w*r45p3"), cfr_renamed_4);
        cfr_renamed_112.put(sprqyy.cfr_renamed_9("RqNpPuN=\t2"), cfr_renamed_119);
        cfr_renamed_112.put(sprajp.cfr_renamed_9("(v4w*r4;s1"), cfr_renamed_3);
        cfr_renamed_112.put(sprqyy.cfr_renamed_9("kHwIiLw\r5\r6"), cfr_renamed_91);
        cfr_renamed_112.put(sprajp.cfr_renamed_9("l2p3n6pw0q5"), cfr_renamed_1);
    }

    public static spruff cfr_renamed_5644(String arg0) {
        return (spruff)cfr_renamed_112.get(sprkoe.cfr_renamed_425(arg0));
    }

    private /* synthetic */ spruff(sprhvf sprhvf2) {
        this.cfr_renamed_2 = sprhvf2.cfr_renamed_313();
    }
}

