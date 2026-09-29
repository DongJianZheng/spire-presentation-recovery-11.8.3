/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprhue;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwvd;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprzra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class sprvud {
    private static final Map cfr_renamed_953;
    public static final String cfr_renamed_133;
    public List cfr_renamed_185;
    public List spr\ufe34;
    public static final String cfr_renamed_82;
    public Map cfr_renamed_126;
    public static final String cfr_renamed_88;
    public static final String cfr_renamed_31;
    public static final String cfr_renamed_272;
    public static final String cfr_renamed_145;
    public static final String cfr_renamed_114;
    public static final String cfr_renamed_96;
    private static final String cfr_renamed_105;
    private static final String cfr_renamed_137;
    public List cfr_renamed_79;
    public static final String cfr_renamed_107;
    private static final String cfr_renamed_132;
    public static final String cfr_renamed_102;
    public static final String cfr_renamed_93;
    public static final String cfr_renamed_86;
    public static final String cfr_renamed_152;
    public static final String cfr_renamed_112;
    private static final Set cfr_renamed_119;
    public static final String cfr_renamed_91;
    public static final String cfr_renamed_0;
    private static final String cfr_renamed_1;
    private static final String cfr_renamed_2;
    public List cfr_renamed_3;
    public static final String cfr_renamed_4;

    public void cfr_renamed_601(spro arg0) throws sprlqd {
        this.spr\ufe34.addAll(sprerd.cfr_renamed_4015(arg0));
    }

    public void cfr_renamed_606(spro arg0) throws sprlqd {
        this.cfr_renamed_79.addAll(sprerd.cfr_renamed_4107(arg0));
    }

    public void cfr_renamed_4123(sprcyd arg0) throws sprlqd {
        this.cfr_renamed_79.add(arg0.cfr_renamed_568());
    }

    public Map cfr_renamed_3989(sprtzd arg0, sprije arg1, byte[] arg2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        sprtzd sprtzd2 = hashMap.put("contentType", arg0);
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap.put("digestAlgID", arg1);
        hashMap2.put("digest", sprzra.cfr_renamed_158(arg2));
        return hashMap2;
    }

    public void cfr_renamed_4124(spreud arg0) {
        this.spr\ufe34.add(arg0.cfr_renamed_568());
    }

    static {
        cfr_renamed_107 = sprgl.cfr_renamed_152.cfr_renamed_19();
        cfr_renamed_4 = sprdh.cfr_renamed_86.cfr_renamed_19();
        cfr_renamed_272 = sprdg.spr\ufe34.cfr_renamed_19();
        cfr_renamed_88 = sprdg.cfr_renamed_119.cfr_renamed_19();
        cfr_renamed_91 = sprdg.cfr_renamed_112.cfr_renamed_19();
        cfr_renamed_86 = sprdg.cfr_renamed_107.cfr_renamed_19();
        cfr_renamed_82 = sprm.cfr_renamed_102.cfr_renamed_19();
        cfr_renamed_93 = sprji.cfr_renamed_31.cfr_renamed_19();
        cfr_renamed_152 = spryk.cfr_renamed_126.cfr_renamed_19();
        cfr_renamed_96 = spryk.cfr_renamed_91.cfr_renamed_19();
        cfr_renamed_133 = spryk.cfr_renamed_3.cfr_renamed_19();
        cfr_renamed_102 = sprm.cfr_renamed_1510.cfr_renamed_19();
        cfr_renamed_0 = sprtk.cfr_renamed_132.cfr_renamed_19();
        cfr_renamed_112 = sprtk.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_145 = sprm.cfr_renamed_131.cfr_renamed_19();
        cfr_renamed_31 = sprji.cfr_renamed_102.cfr_renamed_19();
        cfr_renamed_114 = sprji.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_137 = sprtk.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_105 = sprtk.cfr_renamed_134.cfr_renamed_19();
        cfr_renamed_2 = sprtk.cfr_renamed_91.cfr_renamed_19();
        cfr_renamed_132 = sprtk.cfr_renamed_135.cfr_renamed_19();
        cfr_renamed_1 = sprtk.cfr_renamed_136.cfr_renamed_19();
        cfr_renamed_119 = new HashSet();
        cfr_renamed_953 = new HashMap();
        cfr_renamed_119.add(cfr_renamed_0);
        cfr_renamed_119.add(cfr_renamed_112);
        cfr_renamed_119.add(cfr_renamed_137);
        cfr_renamed_119.add(cfr_renamed_105);
        cfr_renamed_119.add(cfr_renamed_2);
        cfr_renamed_119.add(cfr_renamed_132);
        cfr_renamed_119.add(cfr_renamed_1);
        cfr_renamed_953.put(cfr_renamed_4, cfr_renamed_137);
        cfr_renamed_953.put(cfr_renamed_272, cfr_renamed_105);
        cfr_renamed_953.put(cfr_renamed_88, cfr_renamed_2);
        cfr_renamed_953.put(cfr_renamed_91, cfr_renamed_132);
        cfr_renamed_953.put(cfr_renamed_86, cfr_renamed_1);
    }

    public void cfr_renamed_4125(sproqd arg0) throws sprlqd {
        this.cfr_renamed_79.add(new sprhse(false, 2, arg0.cfr_renamed_568()));
    }

    public void cfr_renamed_4126(sprtzd arg0, spra arg1) {
        this.spr\ufe34.add(new sprhse(false, 1, new sprhue(arg0, arg1)));
    }

    public void cfr_renamed_4127(sprwvd arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = arg0.cfr_renamed_622().iterator();
        while (iterator2.hasNext()) {
            Iterator iterator3 = iterator;
            iterator2 = iterator3;
            this.cfr_renamed_185.add(iterator3.next());
        }
    }

    public sprvud() {
        sprvud sprvud2 = this;
        this.cfr_renamed_79 = new ArrayList();
        sprvud2.spr\ufe34 = new ArrayList();
        this.cfr_renamed_185 = new ArrayList();
        this.cfr_renamed_3 = new ArrayList();
        this.cfr_renamed_126 = new HashMap();
    }

    public void cfr_renamed_600(spro arg0) throws sprlqd {
        this.cfr_renamed_79.addAll(sprerd.cfr_renamed_4014(arg0));
    }

    public void cfr_renamed_599(sprtzd arg0, spro arg1) {
        this.spr\ufe34.addAll(sprerd.cfr_renamed_4100(arg0, arg1));
    }

    public Map cfr_renamed_4128() {
        return new HashMap(this.cfr_renamed_126);
    }

    public void cfr_renamed_610(sprbod arg0) {
        this.cfr_renamed_3.add(arg0);
    }
}

