/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhqba;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprwdj;
import com.spire.presentation.packages.sprwuf;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprqbf
implements AlgorithmParameterSpec {
    private static Map cfr_renamed_112;
    public static final sprqbf cfr_renamed_119;
    public static final sprqbf cfr_renamed_91;
    public static final sprqbf cfr_renamed_0;
    private final String cfr_renamed_1;
    public static final sprqbf cfr_renamed_2;
    public static final sprqbf cfr_renamed_3;
    public static final sprqbf cfr_renamed_4;

    public String cfr_renamed_313() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ sprqbf(sprwuf sprwuf2) {
        this.cfr_renamed_1 = sprkoe.cfr_renamed_116(sprwuf2.cfr_renamed_313());
    }

    static {
        cfr_renamed_119 = new sprqbf(sprwuf.cfr_renamed_2);
        cfr_renamed_0 = new sprqbf(sprwuf.cfr_renamed_86);
        cfr_renamed_2 = new sprqbf(sprwuf.cfr_renamed_119);
        cfr_renamed_4 = new sprqbf(sprwuf.cfr_renamed_3);
        cfr_renamed_3 = new sprqbf(sprwuf.cfr_renamed_152);
        cfr_renamed_91 = new sprqbf(sprwuf.cfr_renamed_112);
        cfr_renamed_112 = new HashMap();
        cfr_renamed_112.put(sprwdj.cfr_renamed_9("5*<6,foa"), cfr_renamed_119);
        cfr_renamed_112.put(sprhqba.cfr_renamed_9("PFYZI\b\r\u0007"), cfr_renamed_0);
        cfr_renamed_112.put(sprwdj.cfr_renamed_9("8'1;!oclg"), cfr_renamed_2);
        cfr_renamed_112.put(sprhqba.cfr_renamed_9("PFYZI\n\n\r\u0016^^L"), cfr_renamed_4);
        cfr_renamed_112.put(sprwdj.cfr_renamed_9("5*<6,dhks2; "), cfr_renamed_3);
        cfr_renamed_112.put(sprhqba.cfr_renamed_9("TB]^M\n\u000f\t\u000b\u0016^^L"), cfr_renamed_91);
    }

    public static sprqbf cfr_renamed_5644(String arg0) {
        return (sprqbf)cfr_renamed_112.get(sprkoe.cfr_renamed_425(arg0));
    }
}

