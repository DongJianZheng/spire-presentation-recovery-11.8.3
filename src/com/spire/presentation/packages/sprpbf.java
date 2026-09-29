/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracda;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnxf;
import com.spire.presentation.packages.sprpgo;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprpbf
implements AlgorithmParameterSpec {
    public static final sprpbf cfr_renamed_107;
    public static final sprpbf cfr_renamed_132;
    public static final sprpbf cfr_renamed_102;
    public static final sprpbf cfr_renamed_93;
    public static final sprpbf cfr_renamed_86;
    public static final sprpbf cfr_renamed_152;
    public static final sprpbf cfr_renamed_112;
    public static final sprpbf cfr_renamed_119;
    private final String cfr_renamed_91;
    public static final sprpbf cfr_renamed_0;
    private static Map cfr_renamed_1;
    public static final sprpbf cfr_renamed_2;
    public static final sprpbf cfr_renamed_3;
    public static final sprpbf cfr_renamed_4;

    static {
        cfr_renamed_132 = new sprpbf(sprnxf.cfr_renamed_91);
        cfr_renamed_2 = new sprpbf(sprnxf.cfr_renamed_93);
        cfr_renamed_3 = new sprpbf(sprnxf.cfr_renamed_112);
        cfr_renamed_119 = new sprpbf(sprnxf.cfr_renamed_132);
        cfr_renamed_152 = new sprpbf(sprnxf.cfr_renamed_86);
        cfr_renamed_86 = new sprpbf(sprnxf.cfr_renamed_4);
        cfr_renamed_112 = new sprpbf(sprnxf.cfr_renamed_0);
        cfr_renamed_107 = new sprpbf(sprnxf.cfr_renamed_1);
        cfr_renamed_4 = new sprpbf(sprnxf.cfr_renamed_107);
        cfr_renamed_102 = new sprpbf(sprnxf.cfr_renamed_102);
        cfr_renamed_93 = new sprpbf(sprnxf.cfr_renamed_2);
        cfr_renamed_0 = new sprpbf(sprnxf.cfr_renamed_3);
        cfr_renamed_1 = new HashMap();
        cfr_renamed_1.put(spracda.cfr_renamed_9("\u0019'\n \u0000-\u0005\u007f\u000f="), cfr_renamed_132);
        cfr_renamed_1.put(sprpgo.cfr_renamed_9("bTqS{^~\fgO"), cfr_renamed_2);
        cfr_renamed_1.put(spracda.cfr_renamed_9("\u0019'\n \u0000-\u0005}\u000f="), cfr_renamed_3);
        cfr_renamed_1.put(sprpgo.cfr_renamed_9("bTqS{^~\u000egO"), cfr_renamed_119);
        cfr_renamed_1.put(spracda.cfr_renamed_9("\u0019'\n \u0000-\u0005{\u000f="), cfr_renamed_152);
        cfr_renamed_1.put(sprpgo.cfr_renamed_9("bTqS{^~\bgO"), cfr_renamed_86);
        cfr_renamed_1.put(spracda.cfr_renamed_9(">\u0000-\u0007'\n}\u0005\u007f"), cfr_renamed_112);
        cfr_renamed_1.put(sprpgo.cfr_renamed_9("M{^|Tq\u000e~\u000e"), cfr_renamed_107);
        cfr_renamed_1.put(spracda.cfr_renamed_9(">\u0000-\u0007'\n}\u0005{"), cfr_renamed_4);
        cfr_renamed_1.put(sprpgo.cfr_renamed_9("bTqS{^~\ftH~Q"), cfr_renamed_102);
        cfr_renamed_1.put(spracda.cfr_renamed_9("\u0019'\n \u0000-\u0005}\u000f;\u0005\""), cfr_renamed_93);
        cfr_renamed_1.put(sprpgo.cfr_renamed_9("bTqS{^~\btH~Q"), cfr_renamed_0);
    }

    private /* synthetic */ sprpbf(sprnxf sprnxf2) {
        this.cfr_renamed_91 = sprnxf2.cfr_renamed_313();
    }

    public static sprpbf cfr_renamed_5644(String arg0) {
        return (sprpbf)cfr_renamed_1.get(sprkoe.cfr_renamed_425(arg0));
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_91;
    }
}

