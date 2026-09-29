/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhv;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprldz;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpdi;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrq;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprws;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprcog
implements sprve {
    private static Map cfr_renamed_1 = new HashMap();
    private static Set cfr_renamed_2;
    private static Map cfr_renamed_3;
    private static Map cfr_renamed_4;

    private static /* synthetic */ void cfr_renamed_7478(sprlem arg0, boolean arg1) {
        sprddm sprddm2 = arg1 ? new sprddm(arg0, sprpen.cfr_renamed_4) : new sprddm(arg0);
        cfr_renamed_4.put(arg0, sprddm2);
    }

    @Override
    public sprddm cfr_renamed_5307(sprlem arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprldz.cfr_renamed_9("7&4* ;s\u0000\u001a\u000bs& o=:?#"));
        }
        sprddm sprddm2 = (sprddm)cfr_renamed_4.get(arg0);
        if (sprddm2 == null) {
            return new sprddm(arg0);
        }
        return sprddm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprddm cfr_renamed_1494(String arg0) {
        sprlem sprlem2 = (sprlem)cfr_renamed_3.get(arg0);
        if (sprlem2 != null) {
            return this.cfr_renamed_5307(sprlem2);
        }
        try {
            return this.cfr_renamed_5307(new sprlem(arg0));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    static {
        cfr_renamed_3 = new HashMap();
        cfr_renamed_4 = new HashMap();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_1.put(sprgt.cfr_renamed_93, sprgt.cfr_renamed_0);
        cfr_renamed_1.put(sprgt.cfr_renamed_3, sprdl.cfr_renamed_2094);
        cfr_renamed_1.put(sprgt.cfr_renamed_119, sprdl.cfr_renamed_2094);
        cfr_renamed_1.put(sprgt.cfr_renamed_4, sprgt.cfr_renamed_0);
        cfr_renamed_1.put(sprdl.cfr_renamed_1262, sprwr.cfr_renamed_957);
        cfr_renamed_1.put(sprdl.cfr_renamed_1601, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprdl.cfr_renamed_1572, sprwr.cfr_renamed_112);
        cfr_renamed_1.put(sprdl.cfr_renamed_84, sprwr.cfr_renamed_272);
        cfr_renamed_1.put(sprdl.cfr_renamed_615, sprwr.cfr_renamed_96);
        cfr_renamed_1.put(sprdl.spr\ufe34, sprwr.cfr_renamed_499);
        cfr_renamed_1.put(sprdl.cfr_renamed_1762, sprdl.cfr_renamed_956);
        cfr_renamed_1.put(sprdl.cfr_renamed_957, sprdl.cfr_renamed_2094);
        cfr_renamed_1.put(sprdl.cfr_renamed_614, sprdl.cfr_renamed_1540);
        cfr_renamed_1.put(sprdl.cfr_renamed_3051, sprgt.cfr_renamed_0);
        cfr_renamed_1.put(sprbr.cfr_renamed_955, sprgt.cfr_renamed_0);
        cfr_renamed_1.put(sprbr.cfr_renamed_129, sprwr.cfr_renamed_957);
        cfr_renamed_1.put(sprbr.cfr_renamed_79, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprbr.cfr_renamed_107, sprwr.cfr_renamed_112);
        cfr_renamed_1.put(sprbr.cfr_renamed_724, sprwr.cfr_renamed_272);
        cfr_renamed_1.put(sprbr.cfr_renamed_615, sprgt.cfr_renamed_0);
        cfr_renamed_1.put(sprhv.cfr_renamed_107, sprgt.cfr_renamed_0);
        cfr_renamed_1.put(sprhv.cfr_renamed_0, sprwr.cfr_renamed_957);
        cfr_renamed_1.put(sprhv.cfr_renamed_3, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprhv.cfr_renamed_145, sprwr.cfr_renamed_112);
        cfr_renamed_1.put(sprhv.cfr_renamed_1, sprwr.cfr_renamed_272);
        cfr_renamed_1.put(sprhv.cfr_renamed_4, sprwr.cfr_renamed_93);
        cfr_renamed_1.put(sprhv.cfr_renamed_185, sprwr.cfr_renamed_129);
        cfr_renamed_1.put(sprhv.cfr_renamed_112, sprwr.cfr_renamed_131);
        cfr_renamed_1.put(sprhv.cfr_renamed_31, sprwr.cfr_renamed_128);
        cfr_renamed_1.put(sprhv.cfr_renamed_2, spris.cfr_renamed_272);
        cfr_renamed_1.put(sprws.cfr_renamed_152, sprgt.cfr_renamed_0);
        cfr_renamed_1.put(sprws.cfr_renamed_4, sprwr.cfr_renamed_957);
        cfr_renamed_1.put(sprws.cfr_renamed_105, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprws.cfr_renamed_2, sprwr.cfr_renamed_112);
        cfr_renamed_1.put(sprws.cfr_renamed_0, sprwr.cfr_renamed_272);
        cfr_renamed_1.put(sprwr.cfr_renamed_79, sprwr.cfr_renamed_957);
        cfr_renamed_1.put(sprwr.cfr_renamed_82, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprwr.cfr_renamed_1260, sprwr.cfr_renamed_112);
        cfr_renamed_1.put(sprwr.cfr_renamed_1337, sprwr.cfr_renamed_272);
        cfr_renamed_1.put(sprwr.cfr_renamed_0, sprwr.cfr_renamed_93);
        cfr_renamed_1.put(sprwr.cfr_renamed_1442, sprwr.cfr_renamed_129);
        cfr_renamed_1.put(sprwr.cfr_renamed_4, sprwr.cfr_renamed_131);
        cfr_renamed_1.put(sprwr.cfr_renamed_41, sprwr.cfr_renamed_128);
        cfr_renamed_1.put(sprwr.cfr_renamed_31, sprwr.cfr_renamed_93);
        cfr_renamed_1.put(sprwr.cfr_renamed_137, sprwr.cfr_renamed_129);
        cfr_renamed_1.put(sprwr.cfr_renamed_1217, sprwr.cfr_renamed_131);
        cfr_renamed_1.put(sprwr.cfr_renamed_1344, sprwr.cfr_renamed_128);
        cfr_renamed_1.put(sprwr.cfr_renamed_952, sprwr.cfr_renamed_93);
        cfr_renamed_1.put(sprwr.cfr_renamed_114, sprwr.cfr_renamed_129);
        cfr_renamed_1.put(sprwr.cfr_renamed_1222, sprwr.cfr_renamed_131);
        cfr_renamed_1.put(sprwr.cfr_renamed_102, sprwr.cfr_renamed_128);
        cfr_renamed_1.put(spris.cfr_renamed_86, spris.cfr_renamed_91);
        cfr_renamed_1.put(spris.cfr_renamed_133, spris.cfr_renamed_272);
        cfr_renamed_1.put(spris.cfr_renamed_112, spris.cfr_renamed_102);
        cfr_renamed_1.put(sprqo.cfr_renamed_107, sprqo.cfr_renamed_112);
        cfr_renamed_1.put(sprqo.cfr_renamed_96, sprqo.cfr_renamed_112);
        cfr_renamed_1.put(sprdt.cfr_renamed_1, sprdt.cfr_renamed_4);
        cfr_renamed_1.put(sprdt.cfr_renamed_107, sprdt.cfr_renamed_3);
        cfr_renamed_1.put(sprjv.cfr_renamed_1513, sprwr.cfr_renamed_128);
        cfr_renamed_1.put(sprjv.cfr_renamed_1510, sprwr.cfr_renamed_272);
        cfr_renamed_1.put(sprjv.cfr_renamed_1600, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprjv.cfr_renamed_2920, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprjv.cfr_renamed_1596, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_2860, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_2, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprjv.cfr_renamed_1228, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprjv.cfr_renamed_3236, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_105, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_2424, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprjv.cfr_renamed_3239, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprjv.cfr_renamed_1579, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_1217, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_957, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_3034, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_723, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_615, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprjv.cfr_renamed_1540, sprwr.cfr_renamed_272);
        cfr_renamed_1.put(sprjv.cfr_renamed_2420, sprwr.cfr_renamed_128);
        cfr_renamed_1.put(sprjv.cfr_renamed_2635, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprrq.cfr_renamed_107, sprwr.cfr_renamed_1226);
        cfr_renamed_1.put(sprrq.cfr_renamed_1472, sprrq.cfr_renamed_1344);
        cfr_renamed_1.put(sprgz.cfr_renamed_102, sprwr.cfr_renamed_1);
        cfr_renamed_1.put(sprgz.cfr_renamed_79, sprwr.spr\ufe34);
        cfr_renamed_1.put(sprgz.cfr_renamed_4, sprwr.cfr_renamed_1);
        cfr_renamed_1.put(sprgz.cfr_renamed_119, sprwr.spr\ufe34);
        cfr_renamed_3.put("SHA-1", sprgt.cfr_renamed_0);
        cfr_renamed_3.put("SHA-224", sprwr.cfr_renamed_957);
        cfr_renamed_3.put("SHA-256", sprwr.cfr_renamed_1226);
        cfr_renamed_3.put("SHA-384", sprwr.cfr_renamed_112);
        cfr_renamed_3.put("SHA-512", sprwr.cfr_renamed_272);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9("X2JW>K9W9H?"), sprwr.cfr_renamed_96);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\u001c\u001b\u000e~zb}~}fy"), sprwr.cfr_renamed_499);
        cfr_renamed_3.put("SHA1", sprgt.cfr_renamed_0);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9(")C;9H?"), sprwr.cfr_renamed_957);
        cfr_renamed_3.put("SHA256", sprwr.cfr_renamed_1226);
        cfr_renamed_3.put("SHA384", sprwr.cfr_renamed_112);
        cfr_renamed_3.put("SHA512", sprwr.cfr_renamed_272);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\u0000\u0007\u0012zb}~}a{"), sprwr.cfr_renamed_96);
        cfr_renamed_3.put("SHA512-256", sprwr.cfr_renamed_499);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9(")C;8W9H?"), sprwr.cfr_renamed_93);
        cfr_renamed_3.put("SHA3-256", sprwr.cfr_renamed_129);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\u0000\u0007\u0012|~|k{"), sprwr.cfr_renamed_131);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9(")C;8W>K9"), sprwr.cfr_renamed_128);
        cfr_renamed_3.put("SHAKE128", sprwr.cfr_renamed_1);
        cfr_renamed_3.put("SHAKE256", sprwr.spr\ufe34);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\u001c\u001b\u000e\u0018\n~~aw"), sprwr.cfr_renamed_1);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9("X2J1NW9O="), sprwr.spr\ufe34);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\u0014\u0000\u0000\u001b`{b~"), sprqo.cfr_renamed_112);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9("L5X.8N:K&H;K9W9O="), sprdt.cfr_renamed_4);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\b\u001c\u001c\u0007|g~bba\u007fb}~zb}"), sprdt.cfr_renamed_3);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9("F>9"), sprdl.cfr_renamed_956);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\u0002\u0017{"), sprdl.cfr_renamed_2094);
        cfr_renamed_3.put("MD5", sprdl.cfr_renamed_1540);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9("Y3[?F>:H3"), spris.cfr_renamed_91);
        cfr_renamed_3.put("RIPEMD160", spris.cfr_renamed_272);
        cfr_renamed_3.put(sprldz.cfr_renamed_9("\u001d\u001a\u001f\u0016\u0002\u0017}fy"), spris.cfr_renamed_102);
        cfr_renamed_3.put(sprpdi.cfr_renamed_9("X78"), sprrq.cfr_renamed_1344);
        sprcog.cfr_renamed_7478(sprgt.cfr_renamed_0, true);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_957, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_1226, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_112, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_272, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_96, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_499, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_93, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_129, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_131, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_128, false);
        sprcog.cfr_renamed_7478(sprwr.cfr_renamed_1, false);
        sprcog.cfr_renamed_7478(sprwr.spr\ufe34, false);
        sprcog.cfr_renamed_7478(sprqo.cfr_renamed_112, true);
        sprcog.cfr_renamed_7478(sprdt.cfr_renamed_4, false);
        sprcog.cfr_renamed_7478(sprdt.cfr_renamed_3, false);
        sprcog.cfr_renamed_7478(sprdl.cfr_renamed_956, true);
        sprcog.cfr_renamed_7478(sprdl.cfr_renamed_2094, true);
        sprcog.cfr_renamed_7478(sprdl.cfr_renamed_1540, true);
        sprcog.cfr_renamed_7478(spris.cfr_renamed_91, true);
        sprcog.cfr_renamed_7478(spris.cfr_renamed_272, true);
        sprcog.cfr_renamed_7478(spris.cfr_renamed_102, true);
        cfr_renamed_2.add(sprtu.cfr_renamed_2);
        cfr_renamed_2.add(sprjv.cfr_renamed_3240);
        cfr_renamed_2.add(sprjv.cfr_renamed_3237);
        cfr_renamed_2.add(sprjv.cfr_renamed_499);
        cfr_renamed_2.add(sprjv.cfr_renamed_287);
        cfr_renamed_2.add(sprjv.cfr_renamed_88);
        cfr_renamed_2.add(sprjv.cfr_renamed_96);
        cfr_renamed_2.add(sprjv.cfr_renamed_3034);
        cfr_renamed_2.add(sprjv.cfr_renamed_723);
    }

    @Override
    public sprddm cfr_renamed_7475(sprddm arg0) {
        sprcog sprcog2;
        sprlem sprlem2;
        sprlem sprlem3 = arg0.cfr_renamed_593();
        if (cfr_renamed_2.contains(sprlem3)) {
            return new sprddm(sprwr.cfr_renamed_2, new sprktm(512L));
        }
        if (sprlem3.cfr_renamed_5078(sprdl.cfr_renamed_3250)) {
            sprlem2 = sprrsm.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_579().cfr_renamed_593();
            sprcog2 = this;
        } else if (sprlem3.cfr_renamed_5078(sprtu.cfr_renamed_0)) {
            sprlem2 = sprwr.cfr_renamed_272;
            sprcog2 = this;
        } else if (sprlem3.cfr_renamed_5078(sprdl.cfr_renamed_3)) {
            sprlem2 = sprwr.cfr_renamed_1226;
            sprcog2 = this;
        } else {
            sprlem2 = (sprlem)cfr_renamed_1.get(arg0.cfr_renamed_593());
            sprcog2 = this;
        }
        return sprcog2.cfr_renamed_5307(sprlem2);
    }
}

