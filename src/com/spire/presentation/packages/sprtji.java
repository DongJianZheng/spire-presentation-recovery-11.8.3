/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbeea;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprvhb;
import com.spire.presentation.packages.sprwr;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprtji {
    private static Set cfr_renamed_79;
    private static Set cfr_renamed_107;
    private static Set cfr_renamed_132;
    private static Set cfr_renamed_102;
    private static Set cfr_renamed_93;
    private static Set cfr_renamed_86;
    private static Set cfr_renamed_152;
    private static Set cfr_renamed_112;
    private static Set cfr_renamed_119;
    private static Set cfr_renamed_91;
    private static Set cfr_renamed_0;
    private static Set cfr_renamed_1;
    private static Set cfr_renamed_2;
    private static Map cfr_renamed_3;
    private static Set cfr_renamed_4;

    public static sprgf cfr_renamed_2390(String arg0) {
        if (cfr_renamed_119.contains(arg0 = sprkoe.cfr_renamed_116(arg0))) {
            return sprkkk.cfr_renamed_5701();
        }
        if (cfr_renamed_1.contains(arg0)) {
            return sprkkk.cfr_renamed_9216();
        }
        if (cfr_renamed_79.contains(arg0)) {
            return sprkkk.cfr_renamed_5702();
        }
        if (cfr_renamed_102.contains(arg0)) {
            return sprkkk.cfr_renamed_5703();
        }
        if (cfr_renamed_152.contains(arg0)) {
            return sprkkk.cfr_renamed_5704();
        }
        if (cfr_renamed_0.contains(arg0)) {
            return sprkkk.cfr_renamed_5705();
        }
        if (cfr_renamed_132.contains(arg0)) {
            return sprkkk.cfr_renamed_9217();
        }
        if (cfr_renamed_2.contains(arg0)) {
            return sprkkk.cfr_renamed_9218();
        }
        if (cfr_renamed_91.contains(arg0)) {
            return sprkkk.cfr_renamed_9219();
        }
        if (cfr_renamed_4.contains(arg0)) {
            return sprkkk.cfr_renamed_9220();
        }
        if (cfr_renamed_107.contains(arg0)) {
            return sprkkk.cfr_renamed_9221();
        }
        if (cfr_renamed_112.contains(arg0)) {
            return sprkkk.cfr_renamed_9222();
        }
        if (cfr_renamed_93.contains(arg0)) {
            return sprkkk.cfr_renamed_9223();
        }
        if (cfr_renamed_86.contains(arg0)) {
            return sprkkk.cfr_renamed_9224();
        }
        return null;
    }

    public static sprlem cfr_renamed_2103(String arg0) {
        return (sprlem)cfr_renamed_3.get(arg0);
    }

    static {
        cfr_renamed_1 = new HashSet();
        cfr_renamed_119 = new HashSet();
        cfr_renamed_79 = new HashSet();
        cfr_renamed_102 = new HashSet();
        cfr_renamed_152 = new HashSet();
        cfr_renamed_0 = new HashSet();
        cfr_renamed_132 = new HashSet();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_91 = new HashSet();
        cfr_renamed_4 = new HashSet();
        cfr_renamed_107 = new HashSet();
        cfr_renamed_112 = new HashSet();
        cfr_renamed_93 = new HashSet();
        cfr_renamed_86 = new HashSet();
        cfr_renamed_3 = new HashMap();
        cfr_renamed_1.add("MD5");
        cfr_renamed_1.add(sprdl.cfr_renamed_1540.cfr_renamed_19());
        cfr_renamed_119.add("SHA1");
        cfr_renamed_119.add("SHA-1");
        cfr_renamed_119.add(sprgt.cfr_renamed_0.cfr_renamed_19());
        cfr_renamed_79.add(sprvhb.cfr_renamed_9("v*dP\u0017V"));
        cfr_renamed_79.add("SHA-224");
        cfr_renamed_79.add(sprwr.cfr_renamed_957.cfr_renamed_19());
        cfr_renamed_102.add("SHA256");
        cfr_renamed_102.add("SHA-256");
        cfr_renamed_102.add(sprwr.cfr_renamed_1226.cfr_renamed_19());
        cfr_renamed_152.add("SHA384");
        cfr_renamed_152.add("SHA-384");
        cfr_renamed_152.add(sprwr.cfr_renamed_112.cfr_renamed_19());
        cfr_renamed_0.add("SHA512");
        cfr_renamed_0.add("SHA-512");
        cfr_renamed_0.add(sprwr.cfr_renamed_272.cfr_renamed_19());
        cfr_renamed_132.add(sprbeea.cfr_renamed_9("q1cL\u0013K\nK\u0010M\u000b"));
        cfr_renamed_132.add(sprvhb.cfr_renamed_9("v*dO\u0010S\u0017J\u0017P\u0011K"));
        cfr_renamed_132.add(sprwr.cfr_renamed_96.cfr_renamed_19());
        cfr_renamed_2.add(sprbeea.cfr_renamed_9("q1cL\u0013K\nK\u0017O\u000b"));
        cfr_renamed_2.add(sprvhb.cfr_renamed_9("v*dO\u0010S\u0017J\u0017W\u0013K"));
        cfr_renamed_2.add(sprwr.cfr_renamed_499.cfr_renamed_19());
        cfr_renamed_91.add(sprbeea.cfr_renamed_9("*j8\u0011T\u0010K\u0016"));
        cfr_renamed_91.add(sprwr.cfr_renamed_93.cfr_renamed_19());
        cfr_renamed_4.add("SHA3-256");
        cfr_renamed_4.add(sprwr.cfr_renamed_129.cfr_renamed_19());
        cfr_renamed_107.add(sprvhb.cfr_renamed_9("v*dQ\bQ\u001dV"));
        cfr_renamed_107.add(sprwr.cfr_renamed_131.cfr_renamed_19());
        cfr_renamed_112.add(sprbeea.cfr_renamed_9("*j8\u0011T\u0017H\u0010"));
        cfr_renamed_112.add(sprwr.cfr_renamed_128.cfr_renamed_19());
        cfr_renamed_93.add("SHAKE128");
        cfr_renamed_93.add(sprwr.cfr_renamed_1.cfr_renamed_19());
        cfr_renamed_86.add("SHAKE256");
        cfr_renamed_86.add(sprwr.spr\ufe34.cfr_renamed_19());
        cfr_renamed_3.put("MD5", sprdl.cfr_renamed_1540);
        cfr_renamed_3.put(sprdl.cfr_renamed_1540.cfr_renamed_19(), sprdl.cfr_renamed_1540);
        cfr_renamed_3.put("SHA1", sprgt.cfr_renamed_0);
        cfr_renamed_3.put("SHA-1", sprgt.cfr_renamed_0);
        cfr_renamed_3.put(sprgt.cfr_renamed_0.cfr_renamed_19(), sprgt.cfr_renamed_0);
        cfr_renamed_3.put(sprvhb.cfr_renamed_9("v*dP\u0017V"), sprwr.cfr_renamed_957);
        cfr_renamed_3.put("SHA-224", sprwr.cfr_renamed_957);
        cfr_renamed_3.put(sprwr.cfr_renamed_957.cfr_renamed_19(), sprwr.cfr_renamed_957);
        cfr_renamed_3.put("SHA256", sprwr.cfr_renamed_1226);
        cfr_renamed_3.put("SHA-256", sprwr.cfr_renamed_1226);
        cfr_renamed_3.put(sprwr.cfr_renamed_1226.cfr_renamed_19(), sprwr.cfr_renamed_1226);
        cfr_renamed_3.put("SHA384", sprwr.cfr_renamed_112);
        cfr_renamed_3.put("SHA-384", sprwr.cfr_renamed_112);
        cfr_renamed_3.put(sprwr.cfr_renamed_112.cfr_renamed_19(), sprwr.cfr_renamed_112);
        cfr_renamed_3.put("SHA512", sprwr.cfr_renamed_272);
        cfr_renamed_3.put("SHA-512", sprwr.cfr_renamed_272);
        cfr_renamed_3.put(sprwr.cfr_renamed_272.cfr_renamed_19(), sprwr.cfr_renamed_272);
        cfr_renamed_3.put(sprbeea.cfr_renamed_9("q1cL\u0013K\nK\u0010M\u000b"), sprwr.cfr_renamed_96);
        cfr_renamed_3.put(sprvhb.cfr_renamed_9("v*dO\u0010S\u0017J\u0017P\u0011K"), sprwr.cfr_renamed_96);
        cfr_renamed_3.put(sprwr.cfr_renamed_96.cfr_renamed_19(), sprwr.cfr_renamed_96);
        cfr_renamed_3.put(sprbeea.cfr_renamed_9("q1cL\u0013K\nK\u0017O\u000b"), sprwr.cfr_renamed_499);
        cfr_renamed_3.put(sprvhb.cfr_renamed_9("v*dO\u0010S\u0017J\u0017W\u0013K"), sprwr.cfr_renamed_499);
        cfr_renamed_3.put(sprwr.cfr_renamed_499.cfr_renamed_19(), sprwr.cfr_renamed_499);
        cfr_renamed_3.put(sprbeea.cfr_renamed_9("*j8\u0011T\u0010K\u0016"), sprwr.cfr_renamed_93);
        cfr_renamed_3.put(sprwr.cfr_renamed_93.cfr_renamed_19(), sprwr.cfr_renamed_93);
        cfr_renamed_3.put("SHA3-256", sprwr.cfr_renamed_129);
        cfr_renamed_3.put(sprwr.cfr_renamed_129.cfr_renamed_19(), sprwr.cfr_renamed_129);
        cfr_renamed_3.put(sprvhb.cfr_renamed_9("v*dQ\bQ\u001dV"), sprwr.cfr_renamed_131);
        cfr_renamed_3.put(sprwr.cfr_renamed_131.cfr_renamed_19(), sprwr.cfr_renamed_131);
        cfr_renamed_3.put(sprbeea.cfr_renamed_9("*j8\u0011T\u0017H\u0010"), sprwr.cfr_renamed_128);
        cfr_renamed_3.put(sprwr.cfr_renamed_128.cfr_renamed_19(), sprwr.cfr_renamed_128);
        cfr_renamed_3.put("SHAKE128", sprwr.cfr_renamed_1);
        cfr_renamed_3.put(sprwr.cfr_renamed_1.cfr_renamed_19(), sprwr.cfr_renamed_1);
        cfr_renamed_3.put("SHAKE256", sprwr.spr\ufe34);
        cfr_renamed_3.put(sprwr.spr\ufe34.cfr_renamed_19(), sprwr.spr\ufe34);
    }

    public static boolean cfr_renamed_2389(String arg0, String arg1) {
        return cfr_renamed_119.contains(arg0) && cfr_renamed_119.contains(arg1) || cfr_renamed_79.contains(arg0) && cfr_renamed_79.contains(arg1) || cfr_renamed_102.contains(arg0) && cfr_renamed_102.contains(arg1) || cfr_renamed_152.contains(arg0) && cfr_renamed_152.contains(arg1) || cfr_renamed_0.contains(arg0) && cfr_renamed_0.contains(arg1) || cfr_renamed_132.contains(arg0) && cfr_renamed_132.contains(arg1) || cfr_renamed_2.contains(arg0) && cfr_renamed_2.contains(arg1) || cfr_renamed_91.contains(arg0) && cfr_renamed_91.contains(arg1) || cfr_renamed_4.contains(arg0) && cfr_renamed_4.contains(arg1) || cfr_renamed_107.contains(arg0) && cfr_renamed_107.contains(arg1) || cfr_renamed_112.contains(arg0) && cfr_renamed_112.contains(arg1) || cfr_renamed_1.contains(arg0) && cfr_renamed_1.contains(arg1);
    }
}

