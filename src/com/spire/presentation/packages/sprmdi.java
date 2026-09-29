/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprip;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqhca;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrq;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxro;
import com.spire.presentation.packages.sprxu;
import java.util.HashMap;
import java.util.Map;

public class sprmdi {
    private static Map<sprlem, String> cfr_renamed_3 = new HashMap<sprlem, String>();
    private static Map<String, sprddm> cfr_renamed_4 = new HashMap<String, sprddm>();

    public static sprddm cfr_renamed_5708(String arg0) {
        if (cfr_renamed_4.containsKey(arg0)) {
            return cfr_renamed_4.get(arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxro.cfr_renamed_9("\u0000w\u001ew\u001an\u001b9\u0011p\u0012|\u0006mO9")).append(arg0).toString());
    }

    static {
        cfr_renamed_3.put(sprdl.cfr_renamed_956, sprqhca.cfr_renamed_9("\b@w"));
        cfr_renamed_3.put(sprdl.cfr_renamed_2094, sprxro.cfr_renamed_9("T1-"));
        cfr_renamed_3.put(sprdl.cfr_renamed_1540, "MD5");
        cfr_renamed_3.put(sprgt.cfr_renamed_0, "SHA-1");
        cfr_renamed_3.put(sprwr.cfr_renamed_957, "SHA-224");
        cfr_renamed_3.put(sprwr.cfr_renamed_1226, "SHA-256");
        cfr_renamed_3.put(sprwr.cfr_renamed_112, "SHA-384");
        cfr_renamed_3.put(sprwr.cfr_renamed_272, "SHA-512");
        cfr_renamed_3.put(sprwr.cfr_renamed_96, sprqhca.cfr_renamed_9("W\rEh1t6m6w0l"));
        cfr_renamed_3.put(sprwr.cfr_renamed_499, sprxro.cfr_renamed_9("&Q44@(G1G,C0"));
        cfr_renamed_3.put(spris.cfr_renamed_91, sprqhca.cfr_renamed_9("V\fT\u0000I\u0001)t6}"));
        cfr_renamed_3.put(spris.cfr_renamed_272, "RIPEMD-160");
        cfr_renamed_3.put(spris.cfr_renamed_102, sprxro.cfr_renamed_9("'P%\\8]X(G!"));
        cfr_renamed_3.put(sprip.cfr_renamed_3, sprqhca.cfr_renamed_9("V\fT\u0000I\u0001)t6}"));
        cfr_renamed_3.put(sprip.cfr_renamed_4, "RIPEMD-160");
        cfr_renamed_3.put(sprqo.cfr_renamed_112, sprxro.cfr_renamed_9("2V&MF-D("));
        cfr_renamed_3.put(sprxu.cfr_renamed_152, sprqhca.cfr_renamed_9("\u0011m\"a7"));
        cfr_renamed_3.put(sprip.cfr_renamed_2, sprxro.cfr_renamed_9("N\u001dp\u0007u\u0005v\u001au"));
        cfr_renamed_3.put(sprwr.cfr_renamed_93, sprqhca.cfr_renamed_9("W\rEv)w6q"));
        cfr_renamed_3.put(sprwr.cfr_renamed_129, "SHA3-256");
        cfr_renamed_3.put(sprwr.cfr_renamed_131, sprxro.cfr_renamed_9("&Q4*X*M-"));
        cfr_renamed_3.put(sprwr.cfr_renamed_128, sprqhca.cfr_renamed_9("W\rEv)p5w"));
        cfr_renamed_3.put(sprwr.cfr_renamed_1, "SHAKE128");
        cfr_renamed_3.put(sprwr.spr\ufe34, "SHAKE256");
        cfr_renamed_3.put(sprrq.cfr_renamed_1344, sprxro.cfr_renamed_9("J8*"));
        cfr_renamed_3.put(sprow.cfr_renamed_102, sprqhca.cfr_renamed_9("F\tE\u000eAv)w1s"));
        cfr_renamed_4.put("SHA-1", new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4));
        cfr_renamed_4.put("SHA-224", new sprddm(sprwr.cfr_renamed_957));
        cfr_renamed_4.put(sprxro.cfr_renamed_9("&Q4+G-"), new sprddm(sprwr.cfr_renamed_957));
        cfr_renamed_4.put("SHA-256", new sprddm(sprwr.cfr_renamed_1226));
        cfr_renamed_4.put("SHA256", new sprddm(sprwr.cfr_renamed_1226));
        cfr_renamed_4.put("SHA-384", new sprddm(sprwr.cfr_renamed_112));
        cfr_renamed_4.put("SHA384", new sprddm(sprwr.cfr_renamed_112));
        cfr_renamed_4.put("SHA-512", new sprddm(sprwr.cfr_renamed_272));
        cfr_renamed_4.put("SHA512", new sprddm(sprwr.cfr_renamed_272));
        cfr_renamed_4.put(sprqhca.cfr_renamed_9("W\rEv)w6q"), new sprddm(sprwr.cfr_renamed_93));
        cfr_renamed_4.put("SHA3-256", new sprddm(sprwr.cfr_renamed_129));
        cfr_renamed_4.put(sprxro.cfr_renamed_9("&Q4*X*M-"), new sprddm(sprwr.cfr_renamed_131));
        cfr_renamed_4.put(sprqhca.cfr_renamed_9("W\rEv)p5w"), new sprddm(sprwr.cfr_renamed_128));
        cfr_renamed_4.put(sprxro.cfr_renamed_9("7U4R0*X+@/"), new sprddm(sprow.cfr_renamed_102));
    }

    public static String cfr_renamed_5816(sprlem arg0) {
        String string = cfr_renamed_3.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }
}

