/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprivf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmfka;
import com.spire.presentation.packages.sprtua;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprncf
implements AlgorithmParameterSpec {
    private static Map cfr_renamed_112;
    public static final sprncf cfr_renamed_119;
    public static final sprncf cfr_renamed_91;
    public static final sprncf cfr_renamed_0;
    public static final sprncf cfr_renamed_1;
    public static final sprncf cfr_renamed_2;
    public static final sprncf cfr_renamed_3;
    private final String cfr_renamed_4;

    static {
        cfr_renamed_0 = new sprncf(sprivf.cfr_renamed_119);
        cfr_renamed_1 = new sprncf(sprivf.cfr_renamed_93);
        cfr_renamed_3 = new sprncf(sprivf.cfr_renamed_86);
        cfr_renamed_91 = new sprncf(sprivf.cfr_renamed_96);
        cfr_renamed_2 = new sprncf(sprivf.cfr_renamed_91);
        cfr_renamed_119 = new sprncf(sprivf.cfr_renamed_0);
        cfr_renamed_112 = new HashMap();
        cfr_renamed_112.put(sprtua.cfr_renamed_9("\u0017T\f[\u0007Z\u0012\u0018\f\\\f\u0018\u0006Y\u0004F\u0016\\\u0006"), cfr_renamed_0);
        cfr_renamed_112.put(sprmfka.cfr_renamed_9("HTS[XZM\u0018S\\S\u0018Y\\HVOX@PT\\N][Y"), cfr_renamed_1);
        cfr_renamed_112.put(sprtua.cfr_renamed_9("G\u0004\\\u000bW\nBH\\\f\\HV\nX\u0015G\u0000F\u0016P\u0001"), cfr_renamed_3);
        cfr_renamed_112.put(sprmfka.cfr_renamed_9("G[\\TWUB\u0017C\u0017VVTIFSV"), cfr_renamed_91);
        cfr_renamed_112.put(sprtua.cfr_renamed_9("G\u0004\\\u000bW\nBHCHV\fG\u0006@\bO\u0000[\fA\rT\t"), cfr_renamed_2);
        cfr_renamed_112.put(sprmfka.cfr_renamed_9("HTS[XZM\u0018L\u0018YZWEHPIF_Q"), cfr_renamed_119);
    }

    private /* synthetic */ sprncf(sprivf sprivf2) {
        this.cfr_renamed_4 = sprkoe.cfr_renamed_116(sprivf2.cfr_renamed_313());
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    public static sprncf cfr_renamed_5644(String arg0) {
        return (sprncf)cfr_renamed_112.get(sprkoe.cfr_renamed_425(arg0));
    }
}

