/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfmd;
import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproed;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprued;
import com.spire.presentation.packages.sprvhd;
import com.spire.presentation.packages.sprvmz;
import com.spire.presentation.packages.sprywa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprflb {
    private static Set cfr_renamed_119 = new HashSet();
    private static Set cfr_renamed_91;
    private static Set cfr_renamed_0;
    private static Set cfr_renamed_1;
    private static Set cfr_renamed_2;
    private static Map cfr_renamed_3;
    private static Set cfr_renamed_4;

    static {
        cfr_renamed_2 = new HashSet();
        cfr_renamed_0 = new HashSet();
        cfr_renamed_4 = new HashSet();
        cfr_renamed_91 = new HashSet();
        cfr_renamed_1 = new HashSet();
        cfr_renamed_3 = new HashMap();
        cfr_renamed_119.add("MD5");
        cfr_renamed_119.add(sprm.cfr_renamed_102.cfr_renamed_19());
        cfr_renamed_2.add("SHA1");
        cfr_renamed_2.add("SHA-1");
        cfr_renamed_2.add(sprdh.cfr_renamed_86.cfr_renamed_19());
        cfr_renamed_0.add(sprhnn.cfr_renamed_9("0T\".Q("));
        cfr_renamed_0.add("SHA-224");
        cfr_renamed_0.add(sprdg.spr\ufe34.cfr_renamed_19());
        cfr_renamed_4.add("SHA256");
        cfr_renamed_4.add("SHA-256");
        cfr_renamed_4.add(sprdg.cfr_renamed_119.cfr_renamed_19());
        cfr_renamed_91.add("SHA384");
        cfr_renamed_91.add("SHA-384");
        cfr_renamed_91.add(sprdg.cfr_renamed_112.cfr_renamed_19());
        cfr_renamed_1.add("SHA512");
        cfr_renamed_1.add("SHA-512");
        cfr_renamed_1.add(sprdg.cfr_renamed_107.cfr_renamed_19());
        cfr_renamed_3.put("MD5", sprm.cfr_renamed_102);
        cfr_renamed_3.put(sprm.cfr_renamed_102.cfr_renamed_19(), sprm.cfr_renamed_102);
        cfr_renamed_3.put("SHA1", sprdh.cfr_renamed_86);
        cfr_renamed_3.put("SHA-1", sprdh.cfr_renamed_86);
        cfr_renamed_3.put(sprdh.cfr_renamed_86.cfr_renamed_19(), sprdh.cfr_renamed_86);
        cfr_renamed_3.put(sprvmz.cfr_renamed_9("O\u0019]c.e"), sprdg.spr\ufe34);
        cfr_renamed_3.put("SHA-224", sprdg.spr\ufe34);
        cfr_renamed_3.put(sprdg.spr\ufe34.cfr_renamed_19(), sprdg.spr\ufe34);
        cfr_renamed_3.put("SHA256", sprdg.cfr_renamed_119);
        cfr_renamed_3.put("SHA-256", sprdg.cfr_renamed_119);
        cfr_renamed_3.put(sprdg.cfr_renamed_119.cfr_renamed_19(), sprdg.cfr_renamed_119);
        cfr_renamed_3.put("SHA384", sprdg.cfr_renamed_112);
        cfr_renamed_3.put("SHA-384", sprdg.cfr_renamed_112);
        cfr_renamed_3.put(sprdg.cfr_renamed_112.cfr_renamed_19(), sprdg.cfr_renamed_112);
        cfr_renamed_3.put("SHA512", sprdg.cfr_renamed_107);
        cfr_renamed_3.put("SHA-512", sprdg.cfr_renamed_107);
        cfr_renamed_3.put(sprdg.cfr_renamed_107.cfr_renamed_19(), sprdg.cfr_renamed_107);
    }

    public static boolean cfr_renamed_2389(String arg0, String arg1) {
        return cfr_renamed_2.contains(arg0) && cfr_renamed_2.contains(arg1) || cfr_renamed_0.contains(arg0) && cfr_renamed_0.contains(arg1) || cfr_renamed_4.contains(arg0) && cfr_renamed_4.contains(arg1) || cfr_renamed_91.contains(arg0) && cfr_renamed_91.contains(arg1) || cfr_renamed_1.contains(arg0) && cfr_renamed_1.contains(arg1) || cfr_renamed_119.contains(arg0) && cfr_renamed_119.contains(arg1);
    }

    public static sprlc cfr_renamed_2390(String arg0) {
        if (cfr_renamed_2.contains(arg0 = sprywa.cfr_renamed_116(arg0))) {
            return new sprlid();
        }
        if (cfr_renamed_119.contains(arg0)) {
            return new sprfmd();
        }
        if (cfr_renamed_0.contains(arg0)) {
            return new sprued();
        }
        if (cfr_renamed_4.contains(arg0)) {
            return new sprtfd();
        }
        if (cfr_renamed_91.contains(arg0)) {
            return new sproed();
        }
        if (cfr_renamed_1.contains(arg0)) {
            return new sprvhd();
        }
        return null;
    }

    public static sprtzd cfr_renamed_2103(String arg0) {
        return (sprtzd)cfr_renamed_3.get(arg0);
    }
}

