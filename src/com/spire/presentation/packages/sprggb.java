/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprebb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmuea;
import com.spire.presentation.packages.sprqhe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprza;
import java.util.HashMap;
import java.util.Map;

public class sprggb
implements sprza {
    private static Map cfr_renamed_3;
    private static Map cfr_renamed_4;

    @Override
    public sprije cfr_renamed_1494(String arg0) {
        return new sprije((sprtzd)cfr_renamed_3.get(arg0), sprume.cfr_renamed_3);
    }

    @Override
    public sprije cfr_renamed_1572(sprije arg0) {
        if (arg0.cfr_renamed_593().equals(sprm.cfr_renamed_131)) {
            sprije sprije2 = sprqhe.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_579();
            return sprije2;
        }
        sprije sprije3 = new sprije((sprtzd)cfr_renamed_4.get(arg0.cfr_renamed_593()), sprume.cfr_renamed_3);
        return sprije3;
    }

    static {
        cfr_renamed_4 = new HashMap();
        cfr_renamed_3 = new HashMap();
        cfr_renamed_4.put(sprdh.cfr_renamed_3, sprm.cfr_renamed_1479);
        cfr_renamed_4.put(sprdh.cfr_renamed_4, sprm.cfr_renamed_1479);
        cfr_renamed_4.put(sprdh.cfr_renamed_112, sprdh.cfr_renamed_86);
        cfr_renamed_4.put(sprm.cfr_renamed_128, sprdg.spr\ufe34);
        cfr_renamed_4.put(sprm.cfr_renamed_129, sprdg.cfr_renamed_119);
        cfr_renamed_4.put(sprm.cfr_renamed_130, sprdg.cfr_renamed_112);
        cfr_renamed_4.put(sprm.cfr_renamed_107, sprdg.cfr_renamed_107);
        cfr_renamed_4.put(sprm.cfr_renamed_125, sprm.cfr_renamed_1575);
        cfr_renamed_4.put(sprm.cfr_renamed_88, sprm.cfr_renamed_1479);
        cfr_renamed_4.put(sprm.cfr_renamed_126, sprm.cfr_renamed_102);
        cfr_renamed_4.put(sprm.cfr_renamed_127, sprdh.cfr_renamed_86);
        cfr_renamed_4.put(sprtk.cfr_renamed_4, sprdh.cfr_renamed_86);
        cfr_renamed_4.put(sprtk.cfr_renamed_134, sprdg.spr\ufe34);
        cfr_renamed_4.put(sprtk.cfr_renamed_91, sprdg.cfr_renamed_119);
        cfr_renamed_4.put(sprtk.cfr_renamed_135, sprdg.cfr_renamed_112);
        cfr_renamed_4.put(sprtk.cfr_renamed_136, sprdg.cfr_renamed_107);
        cfr_renamed_4.put(sprtk.cfr_renamed_132, sprdh.cfr_renamed_86);
        cfr_renamed_4.put(sprdg.cfr_renamed_4, sprdg.spr\ufe34);
        cfr_renamed_4.put(sprdg.cfr_renamed_1, sprdg.cfr_renamed_119);
        cfr_renamed_4.put(sprdg.cfr_renamed_133, sprdg.cfr_renamed_112);
        cfr_renamed_4.put(sprdg.cfr_renamed_31, sprdg.cfr_renamed_107);
        cfr_renamed_4.put(spryk.cfr_renamed_82, spryk.cfr_renamed_126);
        cfr_renamed_4.put(spryk.cfr_renamed_2, spryk.cfr_renamed_91);
        cfr_renamed_4.put(spryk.spr\ufe34, spryk.cfr_renamed_3);
        cfr_renamed_4.put(sprji.cfr_renamed_88, sprji.cfr_renamed_31);
        cfr_renamed_4.put(sprji.cfr_renamed_137, sprji.cfr_renamed_31);
        cfr_renamed_3.put("SHA-1", sprdh.cfr_renamed_86);
        cfr_renamed_3.put("SHA-224", sprdg.spr\ufe34);
        cfr_renamed_3.put("SHA-256", sprdg.cfr_renamed_119);
        cfr_renamed_3.put("SHA-384", sprdg.cfr_renamed_112);
        cfr_renamed_3.put("SHA-512", sprdg.cfr_renamed_107);
        cfr_renamed_3.put(sprebb.cfr_renamed_9("\u001b;\u000f o@mE"), sprji.cfr_renamed_31);
        cfr_renamed_3.put(sprmuea.cfr_renamed_9(".RQ"), sprm.cfr_renamed_1575);
        cfr_renamed_3.put(sprebb.cfr_renamed_9("9\u0018@"), sprm.cfr_renamed_1479);
        cfr_renamed_3.put("MD5", sprm.cfr_renamed_102);
        cfr_renamed_3.put(sprmuea.cfr_renamed_9("1_3S.RR$["), spryk.cfr_renamed_126);
        cfr_renamed_3.put("RIPEMD160", spryk.cfr_renamed_91);
        cfr_renamed_3.put(sprebb.cfr_renamed_9("&\u0015$\u00199\u0018FiB"), spryk.cfr_renamed_3);
    }
}

